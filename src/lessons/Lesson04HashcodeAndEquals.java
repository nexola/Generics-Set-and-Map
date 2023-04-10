package lessons;

import lessons_entities.lesson04.Client;

public class Lesson04HashcodeAndEquals {

    public static void main(String[] args) {


        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2)); // Retorna verdadeiro pois compara o conteúdo dos dois objetos
        System.out.println(c1 == c2); // Retorna falso pois não compara o conteúdo, e sim as referências de memória

        System.out.println(s1 == s2); // Retorna verdadeiro pois o compilador trata a expressão literal digitada de forma especial
    }
}
