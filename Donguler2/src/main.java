import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // Tek sayı girince işlemi sonlandıran, çift ve dördün katlarını toplayıp ekrana yazan program.
        Scanner girdi = new Scanner(System.in);
        int t;
        int total = 0;

        do {
            System.out.print("Sayıları Giriniz: ");
            t= girdi.nextInt();
            if (t%2==0 && t%4==0){
                total += t;
            }
     }
        while (t > 0 && t % 2 == 0);
        System.out.print(" Döngü bitti, girilen sayıların toplamı: " + total);
    }
}