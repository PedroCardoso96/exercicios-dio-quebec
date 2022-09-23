public class Main {
    public static void main(String[] args) {

        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");

        Conta cc = new ContaCorrente(pedro);
        Conta pp = new ContaPoupanca(pedro);

        cc.depositar(100);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();

    }
}
