package Java.Interface;

public class Python extends Programming implements DevelopmentImpl {

    public String getProgram() {
        return "python";
    }

    public Python() {

    }

    public void framework() {
        System.out.println("Django");
    }

    public Python(String name) {
        super(name);
    }
}
