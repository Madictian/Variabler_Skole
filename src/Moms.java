import java.util.Scanner;
public class Moms {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("pris ");
        double pris = input.nextDouble();

        plusdanskmoms(pris);

        plustyskmoms(pris);
    }

    public static void plusdanskmoms(double pris) {

        double moms = (pris * 0.25);
        double pris_moms = pris + moms;
        System.out.println("pris med moms er " + pris_moms);
    }

    public static void plustyskmoms(double pris) {

        double moms = 0.16;
        double pris_moms = pris + (pris * moms);
        System.out.println("pris med moms er " + pris_moms);
    }
}