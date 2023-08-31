import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println(" Selamat Datang di Program java untuk menampilkan bilangan prima!!  ");
        System.out.println("====================================================================");
        System.out.println(" ");

        int n, i, pembagi=0;
        boolean angka_prima = true;

        System.out.print("input angka bilangan bulat :  ");
        n = input.nextInt();

        if (n == 0 || n == 1) {
            angka_prima = false;
        } else {
            for (i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    pembagi = i;
                    angka_prima = false;
                    break;
                }
            }
        }

        if (angka_prima)
            System.out.println(n + " adalah angka prima");
        else
            System.out.println(n + " bukan angka prima karena bisa dibagi dengan " +pembagi);
    }
}