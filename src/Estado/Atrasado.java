package Estado;

public class Atrasado implements IEstado {
    @Override
    public void doSomething() {
        System.out.println("Essa mídia está atrasada!");
    }
}
