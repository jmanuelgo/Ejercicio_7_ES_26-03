//sacar el primer digito de un numero mayor a mil
import java.util.Scanner;
public class priDigito {
    public static void main(String [] args){
        int num;
        Scanner read= new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero mayor a 1000 ");
            num= read.nextInt();
        }while (num<1000);
        while (num>=10){
            num/=10;
        }
        System.out.println("el primer digito es: "+num);
    }
}
