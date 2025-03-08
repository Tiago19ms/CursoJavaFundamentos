import java.util.Scanner;   
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble(); 
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        // primeiro calcular a + b e depois multiplicar por c e dividir por 2
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;
        // a area do retangulo é simplesmente a multiplicação de a por b base vezes altura
        System.out.println("A área do triângulo é: " + areaTriangulo);
        System.out.println("A área do círculo é: " + areaCirculo);
        System.out.println("A área do trapézio é: " + areaTrapezio);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("A área do retângulo é: " + areaRetangulo);
        sc.close();
    }
}
