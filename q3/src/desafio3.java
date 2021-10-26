import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int qtd = 0;
        int auxA = 0;
        int auxB = 0;
        int comecar = 0;
        String inicioFim;
        String aStr;
        String bStr;
        Scanner scanner = new Scanner((System.in));

        //inicio do programa
        qtd = scanner.nextInt();

        for (int i = 0; i < qtd; i++) {

            a = scanner.nextInt();
            b = scanner.nextInt();
            aStr = String.valueOf(a);
            bStr = String.valueOf(b);
            auxA = Integer.valueOf(aStr.length());
            auxB = Integer.valueOf(bStr.length());
            comecar = auxA - auxB;

            if (bStr.length() > aStr.length()) {
                comecar = 0;
            }
            inicioFim = aStr.substring(comecar, auxA);

            if (inicioFim.equals(bStr)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }

    }
}
