import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Hello... Selamat Datang di Perpustakaan!!");
        System.out.println("=========================================");
        System.out.println("");
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();

        databuku pelajaran = new databuku("Pelajaran", 10, 2000);
        databuku novel = new databuku("Novel", 10, 5000);
        databuku skripsi = new databuku("Skripsi", 10, 10000);


        System.out.print("Masukkan Jenis buku yang anda pinjam : ");
        String jenisbuku = input.nextLine();

        System.out.print("Masukkan Berapa hari anda terlambat : ");
        int totalterlambat = input.nextInt();

        databuku databuku;
        if (jenisbuku.equalsIgnoreCase("Pelajaran")){
            databuku = pelajaran;
        } else if (jenisbuku.equalsIgnoreCase("Novel")) {
            databuku = novel;
        } else if (jenisbuku.equalsIgnoreCase("Skripsi")) {
            databuku = skripsi;
        }else{
            System.out.println("Data jenis buku yang anda masukkan tidak valid!!");
            return;
        }
        if (totalterlambat <= 0) {
            System.out.println("anda tidak mendapat denda!!");
        }else {
            int denda = databuku.denda(totalterlambat);
            System.out.println("Denda yang harus dibayarkan = Rp." + denda);
        }

        System.out.println(" ");
        System.out.println("=============================");
        System.out.println("Terimakasih atas kunjungannya");
        System.out.println("=============================");
        }

    }

    class databuku{
        String jenisbuku;
        int bataspinjam;
        int dendaperhari;
        int totalterlambat;

        databuku(String jenisbuku, int bataspinjam, int dendaperhari){
            this.jenisbuku = jenisbuku;
            this.bataspinjam = bataspinjam;
            this.dendaperhari = dendaperhari;
        }
        int denda (int totalterlambat){
            return totalterlambat * dendaperhari ;
        }
    }

