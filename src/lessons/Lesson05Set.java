package lessons;

import lessons_entities.lesson02.Product;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson05Set {

    // Representa um conjunto de elementos
    // Elementos não possuem posição
    // Acesso, inserção e remoção de dados são rápidos
    // Oferece operações eficientes de conjunto: intersecção, união, diferença

    public static void main(String[] args) {

        // HashSet -> Rápido porém não mantem a ordem
        // TreeSet -> Lento porém garante a ordem
        // LinkedHashSet -> Intermediário em velocidade e mantém a ordem de inserção
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        // Remove o que está dentro do predicado
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // União
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        // Intersecção
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        // Diferença
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

        Set<Product> setProduct = new HashSet<>();
        setProduct.add(new Product("TV", 900.0));
        setProduct.add(new Product("Notebook", 1200.0));
        setProduct.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(setProduct.contains(prod)); // Retorna falso quando a classe Product não possuir o hashcode e equals, pois o Set compara os ponteiros do objeto e não o conteúdo
    }
}
