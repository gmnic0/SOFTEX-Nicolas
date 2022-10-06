//baseado no cógido  de https://github.com/marcelohq
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("digita uma palavra maiuscula como era escrita antigamente (DEVE CONTER PH): ");
        String palavra = ler.nextLine();

        ler.close();
        
        String Maisculo = palavra.toLowerCase();
        int quantidadeLetras = palavra.replace(" ","").length();
        String mudaLetra = palavra.replace ("PH","F");
        boolean b = palavra.equalsIgnoreCase(mudaLetra);
        int quantidadeMudarLetras = mudaLetra.replace(" ","").length();
        int diferenca = quantidadeLetras - quantidadeMudarLetras;
        
        

        System.out.println("A palavra é: "+Maisculo);
        System.out.println("Quantidade de letras que tinha a palavra: "+quantidadeLetras);
        System.out.println("a palavra ficaria: "+mudaLetra);
        if (b == false) {
            System.out.println("as palavras são diferentes ao longo do tempo");
        }
        System.out.println("diferença de quantidade de letras entre as palavras é: "+diferenca);

    }
}
