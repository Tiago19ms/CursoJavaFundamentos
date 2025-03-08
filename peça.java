import java.util.Scanner;       

public class peça {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Digite o código da peça 1: ");
        int cod1 = sc.nextInt();
        System.out.println("Digite o número de peças 1: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 1: ");
        double valor1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        int cod2 = sc.nextInt();
        System.out.println("Digite o número de peças 2: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        double valor2 = sc.nextDouble();
        double total = (num1 * valor1) + (num2 * valor2);
        System.out.println("O valor total a ser pago é: R$" + total);
        sc.close();
    }
}
