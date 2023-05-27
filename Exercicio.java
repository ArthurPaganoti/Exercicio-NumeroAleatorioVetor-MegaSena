import java.util.LinkedList;
import java.util.Random;

public class Exercicio {
    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();
        Lista lista1 = new Lista(); // Criando uma instância da classe Lista

        Random aleatorio = new Random(); // Criando uma instância da classe Random para gerar números aleatórios

        int[] vetor = new int[1000]; // Criando um vetor de inteiros com tamanho 1000

        // Preenchendo o vetor com números aleatórios entre -9999 e 9999
        for (int i = 0; i < 1000; i++) {
            vetor[i] = aleatorio.nextInt(19999) - 9999;
        }

        System.out.println("Números gerados em ordem: ");
        // Exibindo os números gerados em ordem
        for (int i = 0; i < 1000; i++) {
            System.out.println(vetor[i]);
            lista1.inserirSorteado(lista, vetor[i]); // Chamando o método inserirSorteado da instância lista1 para inserir o número na lista
        }

        System.out.println("Ordem crescente: ");
        // Exibindo os números da lista em ordem crescente
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("Ordem decrescente: ");
        // Exibindo os números da lista em ordem decrescente
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
}