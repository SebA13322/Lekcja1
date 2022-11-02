public class zadanie17 {
    public static void main(String[] args) {
        double iloscakcji=600;
        double cenaakcji=21.77;

        double kwotaakcje=iloscakcji*cenaakcji;
        double prowizja=0.02*kwotaakcje;
        double calosc = kwotaakcje+prowizja;

        System.out.println("Kwota za same akcje: "+ kwotaakcje);
        System.out.println("Kwota prowizjii: "+prowizja);
        System.out.println("Kwota całości: " + calosc);


    }
}
