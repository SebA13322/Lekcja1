public class zadanie18 {
    public static void main(String[] args) {
        double konsumencji = 12467;
        double jedentygodniowo = 0.14*konsumencji;
        double cytrusowy = 0.64*konsumencji;

        System.out.printf("Średnia osób które kupuja jeden energetyk tygodniowo:%14.0f\n", jedentygodniowo);
        System.out.printf("Przybliżona liczba osób które preferuja smak cytrudowy:%64.0f\n ", cytrusowy);
    }
}
