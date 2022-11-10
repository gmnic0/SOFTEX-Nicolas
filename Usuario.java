import java.io.Serializable;

//Para fazer a serialização é necessário implementar a interface Serializable
public class Usuario implements Serializable {

    //Atributos da classe
    private String nome;
    private int ano; 

    //Método construtor
    public Usuario(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    //Métodos gets e sets
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}