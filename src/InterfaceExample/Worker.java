package InterfaceExample;

public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void eat() {
        System.out.println("Eat of Worker...");
    }

    @Override
    public void pay() {
        System.out.println("Pay of Worker...");
    }

    @Override
    public void work() {
        System.out.println("Work of Worker...");
    }
}
