public class Main 
{
    public static void main(String[] args) 
    {
        Cliente Luisa = new Cliente();
        Luisa.setNome("Luisa");


        IConta cc = new ContaCorrente(Luisa);
        IConta cp = new ContaPoupanca(Luisa);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
