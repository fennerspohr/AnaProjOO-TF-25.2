package Estado;

public class Alugado implements IEstado {
    @Override
    public void doSomething() {
        System.out.println("Essa mídia está alugada!");
    }
}