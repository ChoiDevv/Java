package AccessModifier;

import AccessModifier.A.Aclass;
import AccessModifier.B.Bclass;
import AccessModifier.C.Cclass;
import AccessModifier.D.Dclass;

public class Main extends Cclass {
    public static void main(String[] args) {
        /*
        * Aclass a = new Aclass();
        Bclass b = new Bclass();
        System.out.println(b.name); */
        Main main = new Main();
        System.out.println(main.name);
        Dclass d = new Dclass();
        System.out.println(d.name);
    }
}
