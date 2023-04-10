package lessons_entities.lesson01;

import java.util.List;

public class CalculationService {

    // Permite a utilização da função max apenas aos objetos ou super objetos que extendem a classe Comparable
    public static <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
