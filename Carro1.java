import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Carro van = new Carro();

        System.out.println("Qual a marca do carro: ");
        van.marca = sc.next();

        System.out.println("Qual o modelo do carro: ");
        van.modelo = sc.next();

        System.out.println("Qual o ano do carro: ");
        van.ano = sc.nextInt();

        System.out.println("Qual o consumo por litro: ");
        van.consumo = sc.nextDouble();

        System.out.println("Qual a capacidade do tanque de combustivel: ");
        van.tanque = sc.nextDouble();

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();
    }




}
