import java.util.Scanner;
public class raio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");

        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        // ou podemos fazer de outra forma:
        double area2 = 3.14159 * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
        System.out.println("A área do círculo é: " + area2);
        sc.close();


        // Math.PI é uma constante que representa o valor de PI (3.141592653589793).

    }
}
