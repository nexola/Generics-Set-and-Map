package lessons;

import lessons_entities.lesson03.Circle;
import lessons_entities.lesson03.Rectangle;
import lessons_entities.lesson03.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson03WildcardTypes {

    // O tipo curinga <?> permite que a função seja executada com qualquer tipo de objeto
    public static void printList(List<?> list) {
        /* list.add(3); --> Erro de compilação, não se pode adicionar itens ao tipo curinga */
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // ? extends Object permite que o método aceite qualquer subtipo do objeto especificado
    public static double totalArea(List<? extends Shape> list) {
        /* list.add(new Rectangle(3.0, 4.0); --> Erro de compilação, não se pode instanciar objetos assim, pois pode ser que o objeto instanciado não seja compatível com os parâmetros passados */
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

    public static void copy(List<? extends Number> source, List<? super Number> target) {
        target.addAll(source);
    }

    public static void main(String[] args) {

        List<String> myStr = Arrays.asList("Maria", "Bob", "Marco");
        List<Integer> myInts = Arrays.asList(5, 2, 10);


        // Curingas delimitados
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total circle area: " + totalArea(myCircles));

        // Princípio get/put COVARIÂNCIA
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        /* list.add(20); --> Erro de compilação */

        // CONTRAVARIÂNCIA

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        /* Number x = myNums.get(0); --> Erro de compilação */

        List<Integer> ints = Arrays.asList(1, 2, 3, 4);
        List<Double> doubles = Arrays.asList(3.14, 6.28);
        List<Object> objs = new ArrayList<Object>();

        copy(ints, objs);
        copy(doubles, objs);

        printList(objs);
    }
}
