import models.Persona;

public class AplMain {
    public static void main(String[] args) {
        Persona x = new Persona("Luis", 17);
        Persona y = new Persona();

        System.out.println(x);

        x.setName("paco");

        System.out.println("----");
        System.out.println(x);
        System.out.println("----");
        System.out.println(y);
        System.out.println("----");
        System.out.println("Is mayor " +x.esMayor(y));

    }
}