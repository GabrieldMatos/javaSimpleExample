
package trabalhopratico_parte2_grupoad;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
/**
 * Classe que representa a interface gráfica da aplicação
 */


public class TelaInicial implements ActionListener{
    private JFrame janela;
    private JLabel rotuloOpcoes;
    private JButton cadastrarPessoa;
    private JButton mostrarPessoas;
    private JButton cadastrarLocal;
    private JButton mostrarLocais;
    private JButton fazerReserva;
    private JButton cancelarReserva;
    private JButton mostrarReservas;
    
    /**
     * Construtor da classe TelaInicial que cria a janela e os botões
     */
    public TelaInicial(){
        janela = new JFrame("Tela Inicial");
        rotuloOpcoes = new JLabel("Opções: ");
        cadastrarPessoa = new JButton("Cadastrar Pessoa");
        cadastrarPessoa.addActionListener(this);
        mostrarPessoas = new JButton("Mostrar Pessoas");
        mostrarPessoas.addActionListener(this);
        cadastrarLocal = new JButton("Cadastrar Local");
        cadastrarLocal.addActionListener(this);
        mostrarLocais = new JButton("mostrar Locais");
        mostrarLocais.addActionListener(this);
        fazerReserva = new JButton("Fazer Reserva");
        fazerReserva.addActionListener(this);
        cancelarReserva = new JButton("Cancelar Reserva");
        cancelarReserva.addActionListener(this);
        mostrarReservas = new JButton("Mostrar Reservas");
        mostrarReservas.addActionListener(this);
        montarJanela();
    }
    
    /**
     * Método usado para mostrar os elementos da tela, e seu design
     */
    public void montarJanela(){
        janela.setSize(400, 300);
        janela.setLayout(new GridLayout(4,4));
        janela.add(rotuloOpcoes);
        janela.add(cadastrarPessoa);
        janela.add(mostrarPessoas);
        janela.add(cadastrarLocal);
        janela.add(mostrarLocais);
        janela.add(fazerReserva);
        janela.add(cancelarReserva);
        janela.add(mostrarReservas);
    }
    
    /**
     * Método para exibir a tela
     */
    public void exibir() {
        janela.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cadastrarPessoa){
           Pessoa pessoa;
           String nome = JOptionPane.showInputDialog("Nome da pessoa");
           String rg = JOptionPane.showInputDialog("rg da pessoa");
           String contato = JOptionPane.showInputDialog("contato da pessoa");
           String tipoPessoa = JOptionPane.showInputDialog("Digite o tipo (aluno, professor ou funcionario)");

           if(tipoPessoa.equals("aluno")){
               int numAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do aluno"));
               pessoa = new Aluno(nome, rg, contato, numAluno);
               Controle.cadastrarPessoa(pessoa);
           }else if(tipoPessoa.equals("professor")){
               int numProfessor = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Professor"));
               pessoa = new Professor(nome, rg, contato, numProfessor);
               Controle.cadastrarPessoa(pessoa);
           }else if(tipoPessoa.equals("funcionario")){
               int numFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do Funcionario"));
               pessoa = new Funcionario(nome, rg, contato, numFuncionario);
               Controle.cadastrarPessoa(pessoa);
           }else{
               JOptionPane.showMessageDialog(janela, "ERRO, o tipo de pessoa deve ser (aluno, professor ou funcionario)",
                       "Tipo incorreto", JOptionPane.ERROR_MESSAGE);
           }
           
        }else if(e.getSource() == cadastrarLocal){
           String nome = JOptionPane.showInputDialog("Nome da local");
           Local local = new Local(nome);
           Controle.cadastrarLocal(local);
           
        }else if(e.getSource() == fazerReserva){
           boolean validation = true;
           int numReserva = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da reserva"));
           String nomePessoa = JOptionPane.showInputDialog("Nome da Pessoa");
           Pessoa pessoa = Controle.buscaPessoa(nomePessoa);
           
           if(pessoa.getNome().equals("ERRO")){
               validation = false;
                JOptionPane.showMessageDialog(janela, "ERRO, Nome de Pessoa invalido",
                       "ERROR", JOptionPane.ERROR_MESSAGE);
           }else{
               validation = true;
           }
           if(validation){
                String nomeLocal = JOptionPane.showInputDialog("Nome da local");
                Local local = Controle.buscaLocal(nomeLocal);
                
                if(local.getNome().equals("ERRO")){
                    validation = false;
                     JOptionPane.showMessageDialog(janela, "ERRO, Local invalido",
                           "ERROR", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(local.getDisponibilidade()){
                    validation = true;
                    }else{ 
                        validation = false;
                         JOptionPane.showMessageDialog(janela, "ERRO, Local indisponivel",
                           "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if(validation){
                    Reserva reserva = new Reserva(numReserva, pessoa, local);
                    Controle.cadastrarReserva(reserva);
                }
           }
        }else if(e.getSource() == cancelarReserva){
             int numReserva = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da reserva"));
            if(!Controle.cancelarReserva(numReserva)){
                JOptionPane.showMessageDialog(janela, "ERRO, Reserva nao cadastrada",
                           "ERROR", JOptionPane.ERROR_MESSAGE);
            }
             
        }else if(e.getSource() == mostrarReservas){
            JOptionPane.showMessageDialog(janela, Controle.exibirReservas());
        }else if(e.getSource() == mostrarLocais){
            JOptionPane.showMessageDialog(janela, Controle.exibirLocais());           
        }else if(e.getSource() == mostrarPessoas){
            JOptionPane.showMessageDialog(janela, Controle.exibirPessoas());     
        }
    }
}
