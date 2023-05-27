import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>(); // Criação de uma lista encadeada vazia

        Random aleatorio = new Random(); // Criação de uma instância da classe Random para gerar números aleatórios

        int numerosAleatoriosLista; // Variável para armazenar os números aleatórios

        for (int i = 0; i < 51000000; i++) { // Laço de repetição para gerar 51 milhões de números aleatórios
            numerosAleatoriosLista = aleatorio.nextInt(51000000) + 1; // Geração de um número aleatório entre 1 e 51 milhões
            lista.add(numerosAleatoriosLista); // Inserção do número na lista
        }

        List<Integer> sequenciaMegaSena = new LinkedList<>(List.of(1, 15, 16, 25, 32, 36)); // Criação de uma lista com a sequência da Mega-Sena

        int sequenciaEncontrada = 0; // Variável para contar o número de vezes que a sequência é encontrada na lista

        for (int i = 0; i <= lista.size() - sequenciaMegaSena.size(); i++) { // Laço de repetição para percorrer a lista e encontrar a sequência
            List<Integer> subLista = lista.subList(i, i + sequenciaMegaSena.size()); // Criação de uma sublista a partir do índice atual
            if (subLista.equals(sequenciaMegaSena)) { // Verificação se a sublista é igual à sequência da Mega-Sena
                sequenciaEncontrada++; // Incremento da contagem de sequências encontradas
                System.out.println("Sequência encontrada na posição: " + i); // Exibição da posição em que a sequência foi encontrada
            }
        }
        System.out.println("A sequência aparece " + sequenciaEncontrada + " vezes na lista (ordem direta).");

        // Verificar sequência na ordem inversa
        sequenciaEncontrada = 0; // Zerando a contagem de sequências encontradas
        List<Integer> sequenciaMegaSenaInversa = new LinkedList<>(sequenciaMegaSena); // Criação de uma nova lista com a sequência da Mega-Sena invertida
        java.util.Collections.reverse(sequenciaMegaSenaInversa); // Inversão da ordem dos elementos da lista
        for (int i = 0; i <= lista.size() - sequenciaMegaSena.size(); i++) { // Laço de repetição para percorrer a lista e encontrar a sequência invertida
            List<Integer> subLista = lista.subList(i, i + sequenciaMegaSena.size()); // Criação de uma sublista a partir do índice atual
            if (subLista.equals(sequenciaMegaSenaInversa)) { // Verificação se a sublista é igual à sequência da Mega-Sena invertida
                sequenciaEncontrada++; // Incremento da contagem de sequências encontradas
                System.out.println("Sequência encontrada na posição (ordem inversa): " + i); // Exibição da posição em que a sequência invertida foi encontrada
            }
        }
        System.out.println("A sequência aparece " + sequenciaEncontrada + " vezes na lista (ordem inversa).");
    }
}
