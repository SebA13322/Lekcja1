import java.util.Scanner;
public class zadanie22{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double rzedy;

        System.out.println("rzędy: ");
        rzedy = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double dlugoscrzedu;

        System.out.println("dlugosc rzedu w metrach: ");
        dlugoscrzedu = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double okratowanie;
        System.out.println("ilość miejsca zajmowanego przez okratowanie w metrach: ");
        okratowanie = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double odleglosc;
        System.out.println("odległość między sadzonkami w metrach: ");
        odleglosc = klawiatura.nextDouble();
        klawiatura.nextLine();

        double wynik;
        wynik =(dlugoscrzedu - (2*okratowanie))/odleglosc;

        double wynik1;
        wynik1 = wynik*rzedy;

        System.out.println("dlugosc rzedu w metrach: " + dlugoscrzedu);
        System.out.println("ilości miejsca zajmowanego przez okratowanie w metrach: " + okratowanie);
        System.out.println("odległości między sadzonkami w metrach: " + odleglosc);
        System.out.println("ile zmiesi się sadzonek w rzędzie: " + wynik);
        System.out.println("ile zmiesi się sadzonek ogólnie: " + wynik);

    };
};