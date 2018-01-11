package trabalhopratico_parte2_grupoad;

/**
 * Classe que representa um Professor que irá reservar um espaço.
 *O professor é uma sub-classe de Pessoa.
 */
public class Professor extends Pessoa{
    private int numProfessor;
    
    /**
     * Construtor da classe Professor
     * @param nome String nome do professor
     * @param rg String rg do professor
     * @param contato String telefone do professor
     * @param numProfessor inteiro numero de identificação do professor
     */
    public Professor(String nome, String rg, String contato, int numProfessor) {
        super(nome, rg, contato);
        this.numProfessor = numProfessor;
    }
    
    /**
     * Método que retorna o numero de identificação do professor
     * @return inteniro o numero de identificação do professor
     */
    public int getNumProfessor(){
        return numProfessor;
    }
    
    @Override
    public String exibirDados(){
        String dados = super.exibirDados();
        dados += "ID do Professor: "+numProfessor+"\n";
        return dados;
    }
}
