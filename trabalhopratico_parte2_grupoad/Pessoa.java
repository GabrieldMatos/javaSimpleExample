package trabalhopratico_parte2_grupoad;

import java.util.ArrayList;


/**
 * Classe que representa uma Pessoa que irá reservar um espaço.
 * A pessoa é uma super classe de outras 3 classes (Professor, 
 * Aluno e Funcionario).
 * essa classe implementa a interface Show.
 */
public class Pessoa implements Show{
    private String nome;
    private String rg;
    private String contato;
    
    /**
     * Construtor da classe Pessoa
     * @param nome String nome da pessoa
     * @param rg String numero de rg da pessoa
     * @param contato String numero de telefone da pessoa
     */
    public Pessoa(String nome, String rg, String contato){
        this.nome = nome;
        this.rg = rg;
        this.contato = contato;
    }

    /**
     * Método que retorn o nome da pessoa
     * @return String o nome da pessoa
     */
    public String getNome(){
        return nome;
    }
    
    /**
     * Método que retorna o rg da pessoa
     * @return String o rg da pessoa
     */
    public String getRg(){
        return rg;
    }
    
    /**
     *Método que retorna o contato da pessoa
     * @return String o contato da pessoa
     */
    public String getContato(){
        return contato;
    }
    
    /**
    * Método para exibir todos os dados de uma pessoa.
    * @return String - uma string contendo todos os dados da pessoa.
    */
    @Override
    public String exibirDados(){
        return "Nome: "+nome+"\n"+"RG: "+rg+"\n"+"Contato: "+contato+"\n";
    }
}
