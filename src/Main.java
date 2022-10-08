import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a,b,c;
        Scanner input =new Scanner(System.in);
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        a = input.nextInt();
        System.out.print("Üçgenin taban uzunluğunu giriniz: ");
        b = input.nextInt();
        c= (int) Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs değeri= " + c);
    }
}
