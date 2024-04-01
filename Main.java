import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.print("Informe o nome do funcionário: ");
        String nome = MyObj.nextLine();
        System.out.print("Informe salário base: ");
        double sl = MyObj.nextDouble();
        System.out.print("Informe a jornada mensal: ");
        double jm = MyObj.nextDouble();
        System.out.print("Informe o adicional de hora extra(sem %): ");
        double he = MyObj.nextDouble();
        System.out.print("Informe a quantidade de HE's no mês: ");
        double heM = MyObj.nextDouble();
        double  sPH = sl / jm;
        double calHE = he / 100;
        double vcHE = sPH * calHE;
        double vrHE = vcHE * heM;
        double sHE = (vrHE / 24) * 5;
        double vT = sl + vrHE + sHE;
        System.out.format("O funcionáro %s teve um salário total de %.2f", nome, vT);
    }
}