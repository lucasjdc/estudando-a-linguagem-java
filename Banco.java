import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome = "Lucas Costa";
        String tipoDeConta = "Corrente";
        double saldo = 10.25;
        System.out.println("**************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("**************************");
        boolean acesso = true;
        Scanner leitura = new Scanner(System.in);
        double valor = 0;
        String menu = """
                \nMenu principal\n
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair               
                """;
        while (acesso) {
            
            System.out.println(menu);
            System.out.print("Comando: ");
            int comando = leitura.nextInt();
            if (comando == 1){
                System.out.println("Saldo: R$ " + saldo);
            } else if (comando == 2) {
                System.out.print("Qual o valor: ");
                valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Deposito: R$ " + valor);
            } else if (comando == 3){
                System.out.print("Qual o valor: ");
                valor = leitura.nextDouble();
                
                if (valor <= saldo) {
                    System.out.println("Transferido: R$ %.2f" + valor);
                    saldo -= valor;
                } else {
                    System.out.println("\nNao autorizado\n");
                }
                
            } else if (comando == 4){
                acesso = false;
            }
        }
        leitura.close();
    }
}
