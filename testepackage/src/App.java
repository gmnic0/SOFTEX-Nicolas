import seguradora.*;
import seguradora.Carro;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente clienteA = new Cliente();
        Carro carroA = new Carro();
        clienteA.setNome("andré ");
        clienteA.setIdade(27);
        carroA.setModeloCarro(" Palio ");
        carroA.setCorCarro(" Prata");

        Cliente clienteB = new Cliente();
        Carro carroB = new Carro();
        clienteB.setNome("Mateus ");
        clienteB.setIdade(25);
        carroB.setModeloCarro(" Kwid ");
        carroB.setCorCarro(" Branco");



    System.out.println(clienteA.getNome() + clienteA.getIdade() + carroA.getModeloCarro() + carroA.getCorCarro());
    System.out.println(clienteB.getNome() + clienteB.getIdade() + carroB.getModeloCarro() + carroB.getCorCarro());
    }

}
