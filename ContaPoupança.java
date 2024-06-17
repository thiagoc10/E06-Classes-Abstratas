public class ContaPoupança extends Conta{

    ContaPoupança(int numero, Cliente dono, double saldo, double limite){
        super(numero, dono, saldo, limite);
    }
    public void setLimite(double limite) {
        if (limite < 100) {
            limite = 100;
        }
        if(limite > 1000) {
            limite = 1000;
        }
        setLimite(limite);
    }
}