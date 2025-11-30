package Cliente;

import Observer.IObserver;

public class Cliente implements IObserver {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    @Override
    public void update(Object context) {
        System.out.println("Cliente " + nome + " foi notificado que: " + context);
    }
    
}
