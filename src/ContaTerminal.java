import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
                    
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número da agência
        System.out.println("################################################# ");
        System.out.println("#### Por favor, digite o número da conta !####### ");
        System.out.println("#### Exemplo: XXXX !############################# ");
        String entradaNumero = scanner.nextLine();
        int numeroConta = Integer.parseInt(entradaNumero);

        // Solicita ao usuário que digite o número agência 
        System.out.println("################################################# ");
        System.out.println("#### Por favor, digite o número da Agência !##### ");
        System.out.println("#### Exemplo: XXX-X   ########################### ");
        String numeroAgencia = scanner.nextLine();
        
        // Solicita ao usuário que digite o Nome do Cliente 
        System.out.println("################################################# ");
        System.out.println("#### Por favor, digite o Seu Nome!##### ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("################################################# ");
        System.out.println("#### Por favor, Insira seu Saldo ##### ");
        String entradaSaldoCliente = scanner.nextLine();
        float saldoCliente = Float.parseFloat(entradaSaldoCliente);

      
        System.out.println("##### Olá " + nomeCliente + ",\n obrigado por criar uma conta em nosso banco,\n "
                + "sua agência é " + numeroAgencia + ", conta " 
                + numeroConta + "\n e seu saldo " + saldoCliente + " já está disponível para saque #####");


        
       
        
        
        scanner.close();
    }
}
