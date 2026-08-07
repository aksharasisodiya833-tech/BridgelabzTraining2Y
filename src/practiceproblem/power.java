package practiceproblem;

import java.util.Scanner;

public class power {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        int base=sc.nextInt();
        System.out.println("enter the expo");
        int ex=sc.nextInt();
        double power=Math.pow (base,ex);
        System.out.println("power"+power);

    }
}
