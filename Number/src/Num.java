import java.util.Scanner;

public class Num {
    double conso;

    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        this.conso  = sc.nextDouble();
    }

    public void display(){
        System.out.println("Cos x = " + Math.cos(conso));
        System.out.println("Sin x = " + Math.sin(conso));
        System.out.println("√ x = "+ Math.sqrt(conso));
    }


}
