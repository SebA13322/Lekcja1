import java.util.Scanner;
public class zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double test1;

        System.out.println("Podaj wynik testu: ");
        test1 = klawiatura.nextInt();
        klawiatura.nextLine();

         double test2;

        System.out.println("Podaj wynik testu: ");
        test2 = klawiatura.nextInt();
        klawiatura.nextLine();

        double test3;

        System.out.println("Podaj wynik testu: ");
        test3 = klawiatura.nextInt();
        klawiatura.nextLine();

        double srednia;
        srednia = (test1 + test2 + test3)/3;

        System.out.println( " 1 wynik z testu to: " + test1);
        System.out.println( " 2 wynik z testu to: " + test2);
        System.out.println( " 3 wynik z testu to: " + test3);
        System.out.println( " średnia to : " + srednia);

    }
}
