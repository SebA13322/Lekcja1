import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double kilometry;

        System.out.println("Podaj liczbę przejechanych kilometrów: ");
        kilometry = klawiatura.nextInt();
        klawiatura.nextLine();

        double paliwo;

        System.out.println("Podaj liczbę litrów paliwa: ");
        paliwo = klawiatura.nextInt();
        klawiatura.nextLine();

        double kilometrynalirze = kilometry/paliwo;

        System.out.println("Pojazd spala litr na " + kilometrynalirze + " kilometrów");

    }
}
