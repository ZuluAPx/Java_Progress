import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String nome = "Rhuann Alves Roque";
        String conta = "Corrente";
        double saldo = 2500;

        System.out.println("""
        
       ___________________________________
        Dados iniciais do cliente:
        
        Nome: %s 
        Tipo de conta: %s
        Saldo inicial:   R$ %.2f
       ___________________________________
        """.formatted(nome, conta, saldo));

        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 4){
            System.out.println("-----Menu de opções-----  ");
            System.out.println("1 - Consultar saldo ");
            System.out.println("2 - Receber transferência ");
            System.out.println("3 - Transferir valor (TED) ");
            System.out.println("4 - Sair ");
            System.out.println("-----Selecione a opção desejada----- ");
            escolha = sc.nextInt();

            if (escolha == 1){
                System.out.println("Seu saldo atual é de: R$ "+ saldo);

            } else if (escolha == 2) {
                System.out.println("Informe o valor a receber: ");
                double valor = sc.nextDouble();
                double transferencia = saldo + valor;
                saldo += valor;
                System.out.println("O saldo atualizado: R$ %.2f ".formatted(transferencia));

            } else if (escolha == 3) {
                System.out.println("Informe o valor a ser transferido:");
                double valor = sc.nextDouble();
                double transferencia = saldo - valor;

                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                }
                    else {
                        saldo -= valor;
                        System.out.println("Saldo atualizado: R$ %.2f".formatted(transferencia));
                    }

            } else if (escolha != 4) {
                System.out.println("Opção inválida");

            } else if (escolha == 4) {
                break;


                }
            }


        }
    }
