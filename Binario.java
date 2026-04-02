import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = sc.nextInt();

        while (x > 0){

            int bn = x / 2 ;
            int nb = x % 2 ;

            System.out.println("Inteiro " + bn + " resto " + nb);

            x = sc.nextInt();
        }
        System.out.println("Não se esqueça que é de baixo para cima ;)");
    }
}
