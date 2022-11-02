import java.util.Scanner;
public class zadanie19 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        //48 ciastek
        double cukier = 1.5;
        double maslo  = 1;
        double maka = 2.75;

        double jednociastkocukier = (cukier/48);
        double jednociastkomaslo = (maslo/48);
        double jednociastkomaka = (maka/48);
        double iloscciastek;

        System.out.println("Podaj ile chcesz zrobic ciastek: ");
        iloscciastek = klawiatura.nextInt();
        klawiatura.nextLine();

        double cukier1 = jednociastkocukier*iloscciastek;
        double maslo1 = jednociastkomaslo*iloscciastek;
        double maka1 = jednociastkomaka*iloscciastek;
        System.out.println("ilość szklanek cukru: " + cukier1 );
        System.out.println("ilość szklanek masła: " + maslo1 );
        System.out.println("ilość szklanek mąki: " + maka1 );
    }
}
