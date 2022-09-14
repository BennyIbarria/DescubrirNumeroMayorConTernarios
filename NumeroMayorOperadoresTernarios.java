import java.util.Scanner;

public class NumeroMayorOperadoresTernarios {
    public static void main(String[] args) {

        int bandera=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Capture el numero primero: ");
        int num1 = sc.nextInt();

        System.out.println("Capture el numero segundo: ");
        int num2 = sc.nextInt();

        System.out.println("capture el numero tercero: ");
        int num3= sc.nextInt();

        System.out.println("Capture el cuarto numero: ");
        int num4= sc.nextInt();

        bandera=(num1>num2)? num1:num2;
        bandera=(bandera>num3)? bandera:num3;
        bandera=(bandera>num4)? bandera:num4;

        System.out.println("El numero 1 = " + num1);
        System.out.println("El numero 2 = " + num2);
        System.out.println("El numero 3 = " + num3);
        System.out.println("El numero 4 = " + num4);

        System.out.println("El numero mayor = " + bandera);

    }
}
