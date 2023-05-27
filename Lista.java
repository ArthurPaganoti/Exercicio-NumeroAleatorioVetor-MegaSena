import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void inserirSorteado(java.util.LinkedList<Integer> lista, int num) {
        if (lista.isEmpty()) { // Verifica se a lista está vazia
            lista.add(num); // Insere o número no início da lista
        } else {
            int index = 0;
            while (index < lista.size() && num > lista.get(index)) {
                index++; // Encontra a posição correta para inserir o número na lista em ordem crescente
            }
            lista.add(index, num); // Insere o número na posição correta
        }
    }

    public static boolean verificaSequencia(LinkedList<Integer> listaSequencia, List<Integer> sequencia) {
        if (listaSequencia.size() < sequencia.size()) { // Verifica se a lista é menor do que a sequência
            return false; // Retorna falso se a lista for menor
        }

        for (int i = 0; i <= listaSequencia.size() - sequencia.size(); i++) {
            boolean sequenciaEncontrada = true;
            for (int j = 0; j < sequencia.size(); j++) {
                if (!listaSequencia.get(i + j).equals(sequencia.get(j))) { // Compara os elementos da lista com a sequência
                    sequenciaEncontrada = false; // Define como falso se houver uma diferença
                    break;
                }
            }
            if (sequenciaEncontrada) { // Retorna verdadeiro se a sequência for encontrada
                return true;
            }
        }
        return false; // Retorna falso se a sequência não for encontrada
    }
}
