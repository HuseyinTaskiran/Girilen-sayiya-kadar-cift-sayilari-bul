import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i=1,n;
        System.out.print("bir sayı giriniz : ");
        n=inp.nextInt();
        while (i<=n){
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }







    }
}