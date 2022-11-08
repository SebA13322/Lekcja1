import java.util.Scanner;
public class zadanie20{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double kwota;

        System.out.println("Kwota która wpłacasz: ");
        kwota = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double oprocentowanie1;

        System.out.println("stopa oprocentowania: ");
        oprocentowanie1 = klawiatura.nextDouble();
        klawiatura.nextLine();

        double oprocentowanie;
        oprocentowanie = oprocentowanie1/100;

        Double liczbaodsetek;
        System.out.println("ile razy w ciągu roku odsetki sa doliczane: ");
        liczbaodsetek = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double lata;
        System.out.println("liczba lat: ");
        lata = klawiatura.nextDouble();
        klawiatura.nextLine();

        double nt = lata * liczbaodsetek;
        double potega = Math.pow(1 + oprocentowanie / lata, nt);
        double wynik;
        wynik = kwota * potega;

        System.out.println("kwota początkowo zdeponowana: " + kwota);
        System.out.println("kwota rocznej stopy oprocentowania: " + oprocentowanie);
        System.out.println("ile razy w ciągu roku odsetki są naliczane: " + liczbaodsetek);
        System.out.println("liczby lat, przez jakie środki będą znajdować się na koncie i generować odsetki: " + kwota);
        System.out.println("kwota po określonej liczbie lat: " + wynik);
        };
    };