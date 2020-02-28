import java.util.Scanner;

public class Mayor {
    public static void main (String args []){
        Scanner lector=new Scanner(System.in);
        int a=0,b=0;
        System.out.println("Introduzca 2 numeros");
        a=lector.nextInt();
        b=lector.nextInt();
        if(a>b){
            System.out.println("el mayor es "+a);
        }
        else{
            System.out.println("el mayor es "+b);
        }
    }
}
