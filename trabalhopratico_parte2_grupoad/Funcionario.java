package trabalhopratico_parte2_grupoad;

/**
 *Classe que representa um funcionario que irá reservar um espaço.
 *O funcionario é uma sub-classe de Pessoa.
 */
public class Funcionario extends Pessoa{
    
    private int numFuncionario;

    /**
     * Construtor da classe Funcionario
     * @param nome String nome do funcionario
     * @param rg String rg do funcionario
     * @param contato String telefone do funcionario
     * @param numFuncionario inteiro numero de identificação do funcionario
     */
    public Funcionario(String nome, String rg, String contato, int numFuncionario) {
        super(nome, rg, contato);
        this.numFuncionario = numFuncionario;
    }
    
    /**
     * Método que retorna o número de identificação do funcionario
     * @return inteiro representando o numero de identificação do funcionario
     */
    public int getNumFuncionario(){
        return numFuncionario;
    }
    
    @Override
    public String exibirDados(){
        String dados = super.exibirDados();
        dados += "ID do Funcionario: "+numFuncionario+"\n";
        return dados;
    }
    
}
