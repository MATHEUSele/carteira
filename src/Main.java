import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variaves
        int opcao;

        // instancia
        Carteiraa minhacateira  = new Carteiraa();

        do { opcao=menu(input);
            switch (opcao){
                case 1:
                    System.out.println("adicione um valor a seu saldo: 1");
                    double valorAdicional = input.nextDouble();
                    minhacateira.setSaldo(minhacateira.getSaldo().add(BigDecimal.valueOf(valorAdicional)));
                    minhacateira.setMovimentacaoDeAdicao(minhacateira.getMovimentacaoDeAdicao().add(BigDecimal.valueOf(valorAdicional)));
                    break;

                case 2:
                    System.out.println("retirar um saldo: 2");
                    double valorRetirada = input.nextInt();
                    minhacateira.setSaldo(minhacateira.getSaldo().add(BigDecimal.valueOf(-valorRetirada)));
                    minhacateira.setMovimentacaoDeSaidas(minhacateira.getMovimentacaoDeSaidas().add(BigDecimal.valueOf(-valorRetirada)));

                    break;

                case 3:
                    System.out.println("seu saldo e "+ minhacateira.getSaldo()+" RS");

                    break;

                case 4:
                    System.out.println("     <<movimentação>>        ");
                    System.out.println("<<====================================>>");
                    System.out.println("soma total de entradas");
                    System.out.println(minhacateira.getMovimentacaoDeAdicao());

                    System.out.println("soma total de saidas");
                    System.out.println(minhacateira.getMovimentacaoDeSaidas());
                    System.out.println("<<=====================================>>");






                    break;
            }


        }while (opcao<=5);
        input.close();
    }
    public static int menu(Scanner input){
        System.out.println("");
        System.out.println("                <<MENU>> ");
        System.out.println("");
        System.out.println("============================================");
        System.out.println("adicionar  valor a seu saldo:      digite 1");
        System.out.println("retirar um saldo:                  digite 2");
        System.out.println("ver seu saldo:                     digite 3");
        System.out.println("historico de movimentacoes:        digite 4");
        System.out.println("==============================================");
        int opcao = input.nextInt();
        return opcao;
    }

}