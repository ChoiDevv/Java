package Interface;

public class Java extends Programming implements DevelopmentImpl {

    public String getProgram() {
        return "java";
    }

    public void framework() {
        System.out.println("Spring Boot");
    }

    public Java() {

    }

    public Java(String name) {
        super(name);
    }
}
