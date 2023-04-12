package lessons;

import lessons_entities.lesson02.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lesson08Map {

    public static void main(String[] args) {

        Map<String, String> cookies = new LinkedHashMap<>();

        // Armazena uma chave e valor no Map
        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "998771122");

        // Remove a entrada cuja chave seja o parametro passado
        cookies.remove("email");

        // Como o Map não admite repetições da chave, o valor será sobreescrito pelo último inserido
        cookies.put("phone", "99771133");

        // Verifica se existe um valor de chave no Map
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        // Quando o elemento não existe, o Map.get retorna null
        System.out.println("Email: " + cookies.get("email"));

        // Tamanho do Map
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies: ");
        // keySet() retorna um Set com as chaves do Map
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key)); // cookies.get(key) retorna o valor da chave parametrizada
        }

        System.out.println("---------------------------");

        // Demo 2

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 900.0);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        Product ps = new Product("Tv", 900.0);
        // Verifica se existe uma chave baseada no objeto instanciado (necessita de equals e hashcode)
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
