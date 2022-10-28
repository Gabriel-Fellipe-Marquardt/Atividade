import java.util.Scanner;

public class att {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1, soma = 0;

        while (numero != 0) {
            System.out.println("Digite um número inteiro e positivo\nDigite 0 para finalizar o programa\n> ");
            numero = scan.nextInt();
            if (numero < 0) {
                System.out.println("Negativos não entrarão no calculo");
            } else if (numero > 0) {
                soma += numero;
            }
            ;
        }
        System.out.println("O resultado é " + soma);
    }

}
