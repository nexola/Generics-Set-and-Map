package lessons;

import lessons_entities.lesson06.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;

public class Lesson06SetExercise {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vitor\\Desktop\\Projetos Java\\GenericsSetAndMap\\src\\archives\\input.txt"))) {

            String line = br.readLine();

            Set<User> users = new TreeSet<>();

            while (line != null) {
                String[] vect = line.split(",");
                users.add(new User(vect[0], Instant.parse(vect[1])));
                line = br.readLine();
            }

            int sum = 0;
            for (User user : users) {
                sum += 1;
            }

            System.out.println(sum + " Usuários acessaram o site");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
