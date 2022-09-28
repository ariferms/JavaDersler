package InterfaceExample;

public class Robot implements IWorkable{
    @Override
    public void work() {
        System.out.println("Work of Robot...");
    }
}
