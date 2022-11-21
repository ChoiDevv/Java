package Interface;

public class Java extends Programming implements LanguageImpl {

    public String getProgram() {
        return "java";
    }

    public Java() {

    }

    public Java(String name) {
        super(name);
    }
}
