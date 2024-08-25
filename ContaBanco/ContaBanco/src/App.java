import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
       
        String agenciaConta;
        String nomeConta;
        Double saldoConta;
        Integer numConta;

        System.out.println("Digite o número da conta");
        numConta = ler.nextInt();

        System.out.println("Digite o número da agência");
        agenciaConta = ler.next();

        System.out.println("Digite o nome do cliente");
        nomeConta = ler.next();

        System.out.println("Digite o saldo da conta");
        saldoConta = ler.nextDouble();


        System.out.println("Olá " + nomeConta + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta "+ numConta +" e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
    