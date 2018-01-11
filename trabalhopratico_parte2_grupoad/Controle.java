package trabalhopratico_parte2_grupoad;

import java.util.ArrayList;

/**
 * Classe que implementa as estruturas de dados usadas para cada classe.
 * Implementa também funções estáticas para exibição dos objetos dentro das estruturas de dados,
 * e também, métodos de busca nas estruturas.
 * não possui construtor.
 */
public class Controle {
    private static ArrayList<Pessoa> pessoas = new ArrayList();
    private static ArrayList<Reserva> reservas = new ArrayList();
    private static ArrayList<Local> locais = new ArrayList();
    private static Pessoa erro = new Pessoa("ERRO", "ERRO", "ERRO");
    private static Local wrong = new Local("ERRO");
    
    /**
     * Método para cadastro de pessoas numa lista
     * @param pessoa Pessoa a ser cadastrada na lista
     */
    public static void cadastrarPessoa(Pessoa pessoa){
         pessoas.add(pessoa);
     }
    
    /**
     * Método para cadastro de reserva numa lista
     * @param reserva Reserva a ser cadastrada na lista
     * sempre que é feita a reserva de um local, sua disponibilidade é alterada para false
     */
    public static void cadastrarReserva(Reserva reserva){
         reservas.add(reserva);
         Local local = reserva.getLocal();
         local.setDisponibilidade(false);
     }
    
    /**
     * Método para cadastro de local numa lista
     * @param local Local a ser cadastrado na lista
     */
    public static void cadastrarLocal(Local local){
         locais.add(local);
     }
    
    /**
     *  Método para exibir pessoas cadastradas numa lista
     * @return String contendo todos os dados de todas as Pessoas cadastradas
     */
    public static String exibirPessoas(){
         String dados = "";
         for(Pessoa pessoa: pessoas){
             dados+=pessoa.exibirDados();
         }
         return dados += "\n";
     }
     
    /**
     * Método para exibir Reservas cadastradas numa lista
     * @return String contendo todos os dados de todas as Reservas cadastradas
     */
    public static String exibirReservas(){
         String dados = "";
         for(Reserva reserva: reservas){
             dados+=reserva.exibirDados();
         }
         return dados += "\n";
     }
     
   /**
     * Método para exibir Locais cadastradas numa lista
     * @return String contendo todos os dados de todos os Locais cadastrados
     */
    public static String exibirLocais(){
         String dados = "";
         for(Local local: locais){
            dados+= local.exibirDados();
         }
         return dados += "\n";
     }
     
    /**
     * Método para buscar pessoas cadastradas numa lista
     * @param nome String do nome da pessoa a ser buscada
     * @return String contendo o nome da pessoa buscada, ou uma pessoa "erro" caso
     * não tenha esse nome cadastrado na lista
     */
    public static Pessoa buscaPessoa(String nome){
        for(Pessoa pessoa: pessoas){
            if(pessoa.getNome().equals(nome));
                return pessoa;
        }
        return erro;
    }
     
    /**
     * Método para buscar locais cadastrados numa lista
     * @param nome String do nome do local a ser buscado
     * @return String contendo o nome do local buscado, ou um local "erro" caso
     * não tenha esse nome cadastrado na lista
     */
    public static Local buscaLocal(String nome){
        for(Local local: locais){
            if(local.getNome().equals(nome));
                return local;
        }
        return wrong;
    }
     
    /**
     * Método para cancelamento de Reserva
     * @param numReserva Inteiro represetando o número da reserva a ser cancelada
     * quando uma reserva é cancelada ela é removida da lista
     * @return boolean representando se foi cancelada ou não, não é cacelada caso
     * o numero não esteja cadastrado
     */
    public static boolean cancelarReserva(int numReserva){
         for(Reserva reserva: reservas){
             if(reserva.getNumReserva()==numReserva){
                 reservas.remove(reserva);
                 Local local = reserva.getLocal();
                 local.setDisponibilidade(true);
                 return true;
             }  
         }
         return false;
     }
}
