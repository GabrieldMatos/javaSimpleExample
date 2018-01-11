package trabalhopratico_parte2_grupoad;
/**
 * Classe que representa uma reserva 
 */
public class Reserva {
    private int numReserva;
    private Pessoa pessoa;
    private Local local;
    
    /**
     * Construtor da classe reserva
     * @param numReserva inteiro numero de identificação da reserva
     * @param pessoa Pessoa que fez a reserva
     * @param local Local reservado
     */
    public Reserva(int numReserva, Pessoa pessoa, Local local){
        this.numReserva= numReserva;
        this.pessoa = pessoa;
        this.local = local;
    }
    
    /**
     * Método que retorna o numero de identificação da reserva
     * @return inteiro o numero de identificação da reserva
     */
    public int getNumReserva(){
        return numReserva;
    }
    
    /**
     * Método que retorna a pessoa que reservou o local
     * @return Pessoa pessoa cadastrada na reserva
     */
    public Pessoa getPessoa(){
        return pessoa;
    }
    
    /**
     * Método que retorna o local reservado
     * @return Local local cadastrado na reserva
     */
    public Local getLocal(){
        return local;
    }

    /**
     * Método que implementa a exibição de dados de uma reserva
     * @return String contendo os dados de uma reserva
     */
    public String exibirDados(){
        return "Numero da reserva: "+numReserva+"\n"+"Nome da Pessoa: "+pessoa.getNome()+"\n"+"Local: "+local.getNome()+"\n";
    }
}
