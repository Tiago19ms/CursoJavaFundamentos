import java.util.Scanner;       

public class salario {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o número do funcionário: "); 
      // o número do funcionário é o número que identifica o funcionário.
        int num1 = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o valor que recebe por hora: ");
        double num3 = sc.nextDouble();
        double salario = num2 * num3;
        System.out.println("O número do funcionário é: " + num1);
        System.out.println("O salário do funcionário é: R$" + salario);
        sc.close();
    }
}
