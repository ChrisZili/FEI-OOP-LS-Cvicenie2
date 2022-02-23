package sk.stuba.fei.uim.oop;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
//        Scanner klavesnica = new Scanner(System.in);
//        System.out.println("Hello world");
//        String a = "a";
//        String b = "b";
//        System.out.println("zadaj pismeno");
//        String c = klavesnica.nextLine();
//
//        System.out.println("a == a: " + (a == a));
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a == b: " + (a.equals(c)));
//
//        System.out.println("Object.eaguals(a,a): " + Objects.equals(a,a));
//        System.out.println("Object.eaguals(a,b): " + Objects.equals(a,b));
//        System.out.println("Object.eaguals(a,c): " + Objects.equals(a,c));

        int x = 5;
        int[] y = new int[]{1,2,3};

        System.out.println(x);
        testPrimitive(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        testArray(y);
        System.out.println(Arrays.toString(y));


        testArraySpread(1,2,3,4,5);


    }

    /**
     * funkcia vypisuje cislo
     * @param cislo - integer cislo(vstup)
     */
    public static void testPrimitive(int cislo){
        cislo = 10;
        System.out.println(cislo);

    }
    public static void testArray(int[] array){
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
    public static void testArraySpread(int... array){
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }
}
