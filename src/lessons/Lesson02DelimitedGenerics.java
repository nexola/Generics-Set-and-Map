package lessons;

import lessons_entities.lesson01.CalculationService;
import lessons_entities.lesson02.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Lesson02DelimitedGenerics {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vitor\\Desktop\\Projetos Java\\GenericsSetAndMap\\src\\archives\\products.txt"))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
