import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inch = Double.parseDouble(scan.nextLine()); // 1
        // 1 inch = 2.54; 2 inch = 2.54*2
        double centimeters = inch * 2.54;
        System.out.println(centimeters);

    }
}
