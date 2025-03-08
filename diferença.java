import java.util.Scanner;   
public class diferença {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
         System.out.println("Digite o valor de a: ");
            double a = sc.nextDouble();
            System.out.println("Digite o valor de b: ");
            double b = sc.nextDouble();
            System.out.println("Digite o valor de c: ");
            double c = sc.nextDouble();
            System.out.println("Digite o valor de d: ");
            double d = sc.nextDouble(); 

            double diferença = (a*b - c*d);
            System.out.println("A diferença entre os produtos de a e b pelo produto de c e d é: " + diferença);

// tem outra maneira de fazer essa bagaça 
double diferença2 = (a*b) - (c*d);
System.out.println("A diferença entre os produtos de a e b pelo produto de c e d é: " + diferença2);
sc.close();
    }
}
