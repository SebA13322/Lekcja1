import java.util.Scanner;
public class zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double cenaplyty ;

        System.out.println("Podaj cene płyty: ");
        cenaplyty = klawiatura.nextInt();
        klawiatura.nextLine();



        double zysk;
        zysk = cenaplyty*0.4;

        System.out.println( " zysk wynosi " + zysk);


    }
}
