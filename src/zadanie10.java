import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double cena;
        double podatekStanowy = 0.04;
        double podatekLokalny = 0.02;

        System.out.println("Jaka jest wartrość produktu: ");
        cena = klawiatura.nextInt();
        klawiatura.nextLine();
        double podatekstanowy1 =  cena * podatekStanowy;
        double podateklokalny1 =  cena * podatekLokalny;
        double calosc = cena + (cena * podatekLokalny) + (cena * podatekStanowy);
        System.out.println(" cena netto wynosi: " + cena);
        System.out.println(" podatek stanowy wynosi: " + podatekstanowy1);
        System.out.println(" podatek lokalny wynosi: " + podateklokalny1);
        System.out.println(" cena brutto wynosi: " + calosc);

    }
}
