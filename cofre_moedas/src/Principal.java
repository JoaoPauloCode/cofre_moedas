import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cofre Cofre = new Cofre();

        int opcao = -1;

        // Loop do menu
        while (opcao != 0) {

            // Linha em branco para organizar saída
            System.out.println();

            System.out.println("=== COFRE ===");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Total convertido para Real");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            System.out.println();

            if (opcao == 1) {
                // Escolha do tipo de moeda
                System.out.println("1 - Real");
                System.out.println("2 - Dólar");
                System.out.println("3 - Euro");
                int tipo = sc.nextInt();

                System.out.print("Valor: ");
                double v = sc.nextDouble();
                // Cria a moeda escolhida e adiciona
                if (tipo == 1) Cofre.adicionar(new Real(v));
                else if (tipo == 2) Cofre.adicionar(new Dolar(v));
                else if (tipo == 3) Cofre.adicionar(new Euro(v));
                else System.out.println("Tipo inválido.");

            } else if (opcao == 2) {
                // Remoção funciona igual à adição, mas remove
                System.out.println("1 - Real");
                System.out.println("2 - Dólar");
                System.out.println("3 - Euro");
                int tipo = sc.nextInt();

                System.out.print("Valor: ");
                double v = sc.nextDouble();

                Moeda m = null;

                if (tipo == 1) m = new Real(v);
                else if (tipo == 2) m = new Dolar(v);
                else if (tipo == 3) m = new Euro(v);

                Cofre.remover(m);

            } else if (opcao == 3) {
                Cofre.listar();

            } else if (opcao == 4) {
                // Mostra total convertido
                System.out.println("Total: R$ " + Cofre.totalEmReais());

            } else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
