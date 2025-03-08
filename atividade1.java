import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o primeiro número: "); 
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = sc.nextDouble();

    double a = Math.pow(num1,2);
     double b = Math.pow(num2, 2); 
     double c= Math.pow(num3, 2);
     System.out.println("O quadrado do primeiro número é: " + a);
     System.out.println("O quadrado do segundo número é: " + b);
        System.out.println("O quadrado do terceiro número é: " + c);
        double d = Math.sqrt(num1);
        double e = Math.sqrt(num2);
        double f = Math.sqrt(num3);

       
           System.out.println("A raiz quadrada do primeiro número é: " + d);
           System.out.println("A raiz quadrada do segundo número é: " + e);
              System.out.println("A raiz quadrada do terceiro número é: " + f);

              double g = Math.abs (num1);
              double h = Math.abs (num2);
                double i = Math.abs (num3);
                System.out.println("O módulo do primeiro número é: " + g);
                System.out.println("O módulo do segundo número é: " + h);
                System.out.println("O módulo do terceiro número é: " + i);
                sc.close();
                
// math.pow é uma função que calcula a potência de um número, ou seja, eleva um número a uma potência.
// math.sqrt é uma função que calcula a raiz quadrada de um número.         
// math.abs é uma função que retorna o valor absoluto de um número.
// valeu a pena pesquisar sobre essas funções, pois são muito úteis para cálculos matemáticos.
// 😁
// para a formula de delta se usa a formula delta= math.pow(b,2) - 4*a*c
// para a formula de bhaskara se usa a formula x= (-b + math.sqrt(delta)) / 2*a
// x1= (-b + math.sqrt(delta)) / 2*a
// x2= (-b - math.sqrt(delta)) / 2*a
    }
}
