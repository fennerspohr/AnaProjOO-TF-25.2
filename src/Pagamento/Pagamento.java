package trabalho_final_Ana_Proj_OO;

public interface Pagamento {
    void setNext(Pagamento next);
    void handle(int request);
}