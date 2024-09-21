import java.util.Scanner;

public class LengthString {
    String name;

    public void getInfo(){
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Length of this String is "+ name.length());
    }
}
