package trabalhopratico_parte2_grupoad;

/**
 * Classe que representa um Local que será reservado,
 * essa classe implementa a interface show.
 */
public class Local implements Show{
    private String nome;
    private boolean disponibilidade;
    
    /**
     * Construtor da classe local
     * @param nome String nome do local
     * a disponibilidade de um novo local é sempre true
     */
    public Local(String nome){
        this.nome = nome;
        this.disponibilidade = true;
    }
    
    /**
     * Método que retorna o nome do local
     * @return String representando o nome do local
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * método que retorna a disponibilidade do local
     * @return boolean representando se um local está ou não disponivel
     */
    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    
    /**
     * Método mara alterar a disponibilidade de um local
     * @param disponibilidade boolean representando a novo valor para disponibilidade
     */
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    /**
     * Método para exibição de dados de um local
     * @return String contendo todos os dados de um local
     * caso disponibilidade seja 'false' é mostrado Reservado caso contrario 
     * disponivel
     */
    @Override
    public String exibirDados(){
        String dados = "Nome: "+nome+"\n";
        if(!disponibilidade){
            dados +="Disponibilidade: Reservado \n";
        }else{
            dados += "Disponibilidade: disponivel \n";
        }
        return dados;
    }
}