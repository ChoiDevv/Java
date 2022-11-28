package Java.Extends;

import java.time.LocalDateTime;

public class Spring extends Java {

    public Spring(String name) {
        super(name);
    }

    public void coding() {
        System.out.println("I'm coding now framework >> " + this.name);
    }

    public void coding(LocalDateTime now) {
        System.out.println("I'm coding now framework " + now);
    }
}
