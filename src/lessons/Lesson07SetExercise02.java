package lessons;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Lesson07SetExercise02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students for course A? ");
        int students = sc.nextInt();
        Set<Integer> cursoA = new TreeSet<>();
        for (int i = 0; i < students; i++) {
            cursoA.add(sc.nextInt());
        }
        System.out.print("How many students for course B? ");
        students = sc.nextInt();
        Set<Integer> cursoB = new TreeSet<>();
        for (int i = 0; i < students; i++) {
            cursoB.add(sc.nextInt());
        }
        System.out.print("How many students for course C? ");
        students = sc.nextInt();
        Set<Integer> cursoC = new TreeSet<>();
        for (int i = 0; i < students; i++) {
            cursoC.add(sc.nextInt());
        }

        Set<Integer> totalAlunos = new TreeSet<>(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);

        int sum = 0;
        for (Integer ignored : totalAlunos) {
            sum += 1;
        }

        System.out.println("Total de alunos matriculados: " + sum);

    }
}
