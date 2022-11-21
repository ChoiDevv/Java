package Interface;

public class Python extends Programming implements LanguageImpl {

    public String getProgram() {
        return "python";
    }

    public Python() {

    }

    public Python(String name) {
        super(name);
    }
}
