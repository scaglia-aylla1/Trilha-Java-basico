import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nameCliente = input.nextLine();
        System.out.print("Digite o nome da sua agencia: ");
        String numAgencia = input.nextLine();
        System.out.print("Digite o número da sua conta: ");
        int numConta = input.nextInt();
        System.out.print("Digite o valor que deseja depositar: ");
        float saldo = input.nextFloat();

        System.out.println(
            "Olá " + nameCliente + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + numAgencia + ", conta " + numConta +
            " e seu saldo " + saldo + " já está disponível para saque"
        );
    }
}

