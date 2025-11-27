package Estado;

public class Disponivel implements IEstado {
    @Override
    public void doSomething() {
        System.out.println("Essa mídia está disponível.");
    }
}