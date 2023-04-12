package lessons;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Lesson09MapExercise {
    public static void main(String[] args) {

        Map<String, Integer> votacao = new TreeMap<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vitor\\Desktop\\Projetos Java\\GenericsSetAndMap\\src\\archives\\in.txt"))) {
            
            String line = br.readLine();
            int somaAlex = 0;
            int somaBob = 0;
            int somaMaria = 0;

            while (line != null) {

                String[] vect = line.split(",");
                if (Objects.equals(vect[0], "Alex Blue")) {
                    somaAlex += Integer.parseInt(vect[1]);
                    votacao.put(vect[0], somaAlex);
                } else if (Objects.equals(vect[0], "Maria Green")) {
                    somaMaria += Integer.parseInt(vect[1]);
                    votacao.put(vect[0], somaMaria);
                } else {
                    somaBob += Integer.parseInt(vect[1]);
                    votacao.put(vect[0], somaBob);
                }

                line = br.readLine();

            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Resultados da eleição:");
        for (String key : votacao.keySet()) {
            System.out.println(key + ": " + votacao.get(key));
        }
    }
}
