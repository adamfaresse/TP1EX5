public class Main {
    public static void main(String[] args) {
        LombricSain lombric1 = new LombricSain();

        LombricSain lombric2 = new LombricSain();

        Lombric.grandissons(50);
        LombricSain lombric1Clone = lombric1.coupe();
        LombricSain lombricEnfant = lombric1Clone.accouplement(lombric1);

        Lombric.grandissons(10);
        System.out.println(lombric1.getLongueur());
        System.out.println(lombric2.getLongueur());
        System.out.println(lombric1Clone.getLongueur());
        System.out.println(lombricEnfant.getLongueur());

    }
}
