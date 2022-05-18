import java.util.Scanner;
public class q1pg34 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a idade : ");
        
        int idade = sc.nextInt();

        if(idade<16){
            System.out.println("nao pode votar");
        } else if(16>=idade || idade<=17 || idade>=65 ) {
            System.out.println("votar he facultativo");
        } else {
            System.out.println("votar he obrigatorio");
        }
    }
}