public abstract class Conta implements FuncConta {
    protected int agencia;
    protected int numeroConta;
    protected Cliente titular;
    protected double saldo;

    public Conta(int agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        if(valor > saldo ){
            System.out.println("Saldo insuficiente para sacar");
        }else {
            saldo -= valor;
        }

    }

    @Override
    public void depositar(double valor) {
            saldo += valor;

    }

    @Override
    public void transferir(double valor, FuncConta novaConta) {
        if(valor > saldo){
            System.out.println("Não foi possivel fazer a transferencia");
        }else {
            this.sacar(valor);
            novaConta.depositar(valor);
        }
    }

    public void mostrarInfo(){
        System.out.println("Titular : " + titular.getNome());
        System.out.println("Agencia : " + agencia);
        System.out.println("Numero : " + numeroConta);
        System.out.println("Saldo : " + saldo);

    }

}
