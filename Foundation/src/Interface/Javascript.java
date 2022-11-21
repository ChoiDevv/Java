package Interface;

public class Javascript extends Programming implements LanguageImpl {

    public String getProgram() {
        return "javascript";
    }

    public Javascript() {

    }

    public Javascript(String name) {
        super(name);
    }
}
