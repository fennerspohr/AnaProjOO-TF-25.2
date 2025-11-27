package Pagamento;

public interface Pagamento {
    void setNext(Pagamento next);
    void handle(int request);
}