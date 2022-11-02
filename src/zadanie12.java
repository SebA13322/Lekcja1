import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double ciastka;

        System.out.println("Podaj liczbę zjedzonych ciastek: ");
        ciastka = klawiatura.nextInt();
        klawiatura.nextLine();

        double kaloriejednociastko  = 300/4;

        double calosc = (ciastka*kaloriejednociastko);

        System.out.println( "właśnie zjadłeś " + calosc + " kalorii");

    }
}
