public class Carro{

    String marca;
    String modelo;
    String cor;
    int ano;
    double consumo;
    double tanque;

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é de " + consumo * tanque);
    }

}