import java.io.*;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Usuario nicolas = new Usuario("Nicolas", 1995);
        
        //Criando objeto que receberá o arquivo e o endereço físico  | Criando o endereço físico do arquivo que vai receber o fluxo de bytes
        ObjectOutputStream saidoObjeto = new ObjectOutputStream(new FileOutputStream("serialização/serializacao/src/usuario.txt"));

        saidoObjeto.writeObject(nicolas); // Serializando o objeto "Nicolas"

        saidoObjeto.close(); //Finalizando o processo

        //Criando objeto que receberá o fluxo de bytes   || Pegando o endereço do fluxo do fluxo de bytes
        ObjectInputStream entradaObjeto = new ObjectInputStream(new FileInputStream("serialização/serializacao/src/usuario.txt"));
        
        Usuario desserializado = (Usuario) entradaObjeto.readObject();// Lendo o fluxo de bytes e atribuindo as informações a um objeto criado, neste caso é o objeto "desserializado"
        entradaObjeto.close();//Finalizando o processo

        //Mostando os atributos do objeto que foi desserializado. Deve conter as mesmas informações que foram passadas pelo método construtor. Nome: Nicolas, Id: 12.
        System.out.println("Nome do objeto desserializado: "+desserializado.getNome());
        System.out.println("Ano do objeto desserializado: "+desserializado.getAno());
        

    }
}