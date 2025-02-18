//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Programa principal
        Lobo x = new Lobo();
        Cachorro c = new Cachorro();

        c.reagir("Fofo");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);

        c.reagir(2, 12.4f);
        c.reagir(17, 4.2f);
    }
}