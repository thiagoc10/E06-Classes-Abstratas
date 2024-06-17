public class ContaCorrente extends Conta{
    ContaCorrente(int numero, Cliente dono, double saldo, double limite){
        super(numero, dono, saldo, limite);
    } // Construtor da classe
    public void setLimite(double limite) {
        if (limite < -100)
            limite = -100;
        setLimite(limite);
    }
}