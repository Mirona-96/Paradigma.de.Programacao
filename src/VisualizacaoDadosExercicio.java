public class VisualizacaoDadosExercicio {

    public static void main(String[] args) {
        String msg = "programacao";
        int num = 1;
        System.out.println(msg.toUpperCase() +" " + num);

        int num1 = 001;
        int num2 = 012;
        int num3 = 123;
        int num4 = 234;

        System.out.println(" ");
        System.out.printf("%03o%n", num1);
        System.out.printf("%03o%n", num2);
        System.out.println(num3);
        System.out.println(num4);

        System.out.println(" ");
        String um = "UM";
        System.out.printf("+--+--+%n");
        System.out.printf("|%02o|%s|%n",num1,um);
        System.out.printf("+--+--+%n");
    }
}
