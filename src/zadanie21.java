public class zadanie21 {
    public static void main(String[] args) {
        double akcje = 1000;
        double cenaakcji = 32.87;
        double prowizja = 0.02;
        double sprzedazakcji = 33.92;

        double kupnoakcji;
        kupnoakcji = akcje * cenaakcji;

        double prowizjazakup;
        prowizjazakup = kupnoakcji*prowizja;

        double sprzedazakcji1;
        sprzedazakcji1 = akcje*sprzedazakcji;

        double prowizjasprzedaz;
        prowizjasprzedaz = sprzedazakcji * prowizja;

        double zarobek = sprzedazakcji1 - kupnoakcji - prowizjazakup - prowizjasprzedaz;
        System.out.println("kwotę zapłaconą przez Jacka za akcje: " + kupnoakcji);
        System.out.println("wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie: " +  prowizjazakup);
        System.out.println("kwotę otrzymaną przez Jacka ze sprzedaży akcji: " + sprzedazakcji1);
        System.out.println("wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży: " + prowizjasprzedaz);
        System.out.println("zarobek: " + zarobek);






    }
}
