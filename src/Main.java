import org.w3c.dom.ls.LSOutput;
import javax.crypto.spec.PSource;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        double a;
        double b;
        double c;
        System.out.println("Digite su peso");
        a=leer.nextDouble();
        System.out.println("Digite su altura");
        b=leer.nextDouble();
        c=a/(b*b);
        System.out.println("Su indice de masa corporal es: ");

        if (c<18.5){
            System.out.println(c);
            System.out.println("peso bajo");
        }
        else if (c>=18.5 && c<=24.9 ){
            System.out.println(c);
            System.out.println("peso normal");
        }
        else if (c >= 25 && c <= 26.9){
            System.out.println(c);
            System.out.println(" sobrepeso de grado 1");
        }

        else if (c >= 27 && c <= 29.9){
            System.out.println(c);
            System.out.println(" sobrepeso de grado 2");
        }

        else if (c >= 30 && c <= 34.9){
            System.out.println(c);
            System.out.println("obesidad de tipo 1");
        }

        else if (c >= 35 && c <= 39.9){
            System.out.println(c);
            System.out.println("obesidad de tipo 2");
        }
        else if (c >= 40 && c <= 49.9){
            System.out.println(c);
            System.out.println("obesidad morvida ");
        }
        else {
            System.out.println(c);
            System.out.println("obesidad extrema");
        }
        leer.close();


    }
}
