import java.util.Scanner;

public class LeituraDadosExercicio {


    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.printf("Insira o sexo F/M:");
        char sexo = sn.next().charAt(0);

        System.out.printf("Insira a idade:");
        int idade = sn.nextInt();

        sn.close();

        System.out.print(">"+Character.toUpperCase(sexo)+"<>"+idade+"<");
    }
}
