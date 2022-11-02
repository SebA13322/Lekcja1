import java.util.Scanner;
public class zadanie15{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        String ulubionemiasto;

        System.out.println("Podaj twoje ulubione miasto: ");
        ulubionemiasto = klawiatura.nextLine();
        klawiatura.nextLine();

        String name = ulubionemiasto;

        int dlugosc = name.length();
        char inicjal = name.charAt(1);


        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();


        System.out.println("liczba znaków w tym miescie: " + dlugosc);
        System.out.println("Miasto zapisane z dużych  liter: " + duze);
        System.out.println("Miasto napisane z małych liter:  " + male);
        System.out.println("liczba pierwszy znak: " + inicjal);

        System.out.println();


    }
}
