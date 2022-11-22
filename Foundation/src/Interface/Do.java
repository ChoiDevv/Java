package Interface;

public class Do {
    public static void main(String[] args) {
        Coding coding = new Coding();
        Java java = new Java("java");
        Python python = new Python("python");
        Javascript javascript = new Javascript("javascript");

        coding.coding(java);
        coding.coding(python);
        coding.coding(javascript);

        java.framework();
        python.framework();
        javascript.framework();
    }
}
