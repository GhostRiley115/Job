import java.util.Scanner;

public class getBattery{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int bateria = 50;

        System.out.println("Digite a quantidade de eventos: ");

        int n = leitor.nextInt();

        int[] eventos = new int[n];

        for(int i = 0; i < eventos.length; i++){

            System.out.println("Digite os eventos: ");

            eventos[i] = leitor.nextInt();
        }

        int resultado = getBattery(eventos, bateria);

        System.out.println("A carga final da beteria eh: " + resultado + "%");
    }

    public static int getBattery(int eventos[], int bateria){

        for(int i = 0; i < eventos.length; i++){

            if(eventos[i] > 100){

                bateria = 100;

            }else bateria = (eventos[i] + bateria);
        }
        return bateria;
    }
}