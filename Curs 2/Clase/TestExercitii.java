package Clase;

public class TestExercitii {

    private static Exercitii exercitii = new Exercitii();

    public static void main(String[] args) {
        testExercitiul1();
        printDelimiterLine();
        testExercitiul2();
        printDelimiterLine();
        testExercitiul3();
        printDelimiterLine();
        testExercitiul4();
        printDelimiterLine();
        testExercitiul5();
    }

    private static void testExercitiul1() {
        exercitii.exercitiu1(-2); // solutia: negativ
        exercitii.exercitiu1(3); // solutia: pozitiv
    }

    private static void testExercitiul2() {
        exercitii.exercitiu2(5, 2); // solutia: "primul numar e mai mare"
        exercitii.exercitiu2(1, 4); // solutia: "al doilea numar e mai mare"
        exercitii.exercitiu2(2, 2); // solutia: "numerele sunt egale"
    }

    private static void testExercitiul3() {
        exercitii.exercitiu3(25); // solutia: "pozitiv"
        exercitii.exercitiu3(-100); // solutia: "negativ"
        exercitii.exercitiu3(0); // solutia: "zero"
        exercitii.exercitiu3(5); // solutia: "pozitiv mic"
        exercitii.exercitiu3(2000000); // solutia: "pozitiv foarte mare"
    }

    private static void testExercitiul4() {
        exercitii.exercitiu4(1, 5, 6); // solutia: -2 si -3
        exercitii.exercitiu4(1, -3, -10); // solutia: 5 si -2
        exercitii.exercitiu4(1, -18, 45); // solutia: 15 si 3
    }

    //TODO: definiti voi toate cazurile posibile (sunt 8)
    private static void testExercitiul5() {

    }

    private static void printDelimiterLine() {
        System.out.println("--------------------------------------");
    }
}
