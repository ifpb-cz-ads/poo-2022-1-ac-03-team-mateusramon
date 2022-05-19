import java.util.Scanner;

public class CT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade : ");
        int Idade = sc.nextInt();
        if (Idade < 16) {
            System.out.println("Nao pode votar");
        } else if (Idade >= 16 && Idade < 18 || Idade > 65) {
            System.out.println("O voto eh facultativo");
        } else {
            System.out.println("Voto Obrigatorio");
        }

    }
}
