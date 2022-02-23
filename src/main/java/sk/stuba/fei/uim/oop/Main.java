package sk.stuba.fei.uim.oop;
import java.util.Scanner;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Scanner klavesnica = new Scanner(System.in);
        System.out.println("Hello world");
        String a = "a";
        String b = "b";
        System.out.println("zadaj pismeno");
        String c = klavesnica.nextLine();

        System.out.println("a == a: " + (a == a));
        System.out.println("a == b: " + (a == b));
        System.out.println("a == b: " + (a.equals(c)));

        System.out.println("Object.eaguals(a,a): " + Objects.equals(a,a));
        System.out.println("Object.eaguals(a,b): " + Objects.equals(a,b));
        System.out.println("Object.eaguals(a,c): " + Objects.equals(a,c));


    }
}
