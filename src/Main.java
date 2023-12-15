import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, area;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez açısının ölçüsü : ");
        area = input.nextInt();

        alan = (pi * (r * r) * area) / 360;

        System.out.println("Alan : " + alan);
    }
}