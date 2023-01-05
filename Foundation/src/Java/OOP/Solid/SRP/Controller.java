package Java.OOP.Solid.SRP;

public class Controller {

    private Service service;

    public void addUser(UserRequest request) {
        Service.addUser(request);
    }
}
