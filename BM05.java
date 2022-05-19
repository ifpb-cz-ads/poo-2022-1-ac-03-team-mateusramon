import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class BM05 {

    public static void main(String[] args) throws ExecutionException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero de 1 a 7: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Valor Invalido");

        }

    }
}
