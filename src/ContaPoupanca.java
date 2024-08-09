public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroConta, Cliente titular) {
        super(agencia, numeroConta, titular);
    }



    @Override
    public void mostrarExtrato() {
        System.out.println("==========EXTRATO DA CONTA=============");
        mostrarInfo();
        System.out.println("=======================================");
    }
}
