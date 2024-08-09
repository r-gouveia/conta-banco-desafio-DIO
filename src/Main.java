public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente Gustavo = new Cliente();
        Gustavo.setNome("Gustavo Medeiros");


        Conta cr = new ContaCorrente(4,2456, Gustavo);
        ContaPoupanca cp = new ContaPoupanca(1,2456,Gustavo);
        cp.depositar(600);
        cp.sacar(700);
        System.out.println();
        cp.transferir(650,cr);
        System.out.println();
        cp.mostrarExtrato();
        cr.mostrarExtrato();











    }
}
