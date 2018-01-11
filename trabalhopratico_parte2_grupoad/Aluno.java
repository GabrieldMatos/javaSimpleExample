package trabalhopratico_parte2_grupoad;

/**
 *Classe que representa um Aluno que irá reservar um espaço.
 *O Aluno é uma sub-classe de Pessoa.
 */
public class Aluno extends Pessoa {
    
    private int numAluno;
    
    /**
     * Costrutor da classe Aluno
     * @param nome String nome do aluno
     * @param rg String numero do rg do aluno
     * @param contato String numero de telefone do aluno
     * @param numAluno inteiro numero de identificação do aluno
     */
    public Aluno(String nome, String rg, String contato, int numAluno) {
        super(nome, rg, contato);
        this.numAluno = numAluno;
    }
    
    /**
     * Método que retorna o número de identificação do Aluno
     * @return inteiro representando o número de identiicação do aluno
     */
    public int getNumAluno(){
        return numAluno;
    }
    
    @Override
    public String exibirDados(){
        String dados = super.exibirDados();
        dados += "ID do Aluno: "+numAluno+"\n";
        return dados;
    }
}
