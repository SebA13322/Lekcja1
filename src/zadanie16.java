import java.util.Scanner;
public class zadanie16{
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        Double cena;

        System.out.println("Cena posiłku: ");
        cena = klawiatura.nextDouble();
        klawiatura.nextLine();

        Double podatek;
        podatek = 0.0675*cena;
        Double napiwek;
        napiwek = 0.20*(cena+podatek);
        Double ogolne;
        ogolne = cena+podatek+napiwek;

        System.out.println("cena posiłku wynosi: " +  cena);
        System.out.println("Wartość podatku: " +  podatek);
        System.out.println("Napiwek wynosi " +  napiwek);
        System.out.println("Ogólna cena wynosi " +  ogolne);
    }
}
