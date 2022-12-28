package Java.Interface.practice;

public class Javascript extends Programming implements DevelopmentImpl {

    public String getProgram() {
        return "javascript";
    }

    public void framework() {
        System.out.println("Node Js");
    }

    public Javascript() {

    }

    public Javascript(String name) {
        super(name);
    }
}
