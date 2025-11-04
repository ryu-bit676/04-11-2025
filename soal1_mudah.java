import java.util.Scanner;

public class soal1_mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan berat paket(kg) :");
        int berat = input.nextInt();
        System.out.println("masukan jarak tujuan(km :");
        int jarak = input.nextInt();
        int biaya = 0;

        if (berat <= 10){
            biaya = 4250;   
        }else if (berat > 10){
            biaya = 6000;
        }
        System.out.println("masukan panjang, lebar, tinggi(cm) ");
        System.out.println("masukan panjang :");
        int panjang = input.nextInt();
        System.out.println("masukan lebar :");
        int lebar = input.nextInt();
        System.out.println("masukan tinggi :");
        int tinggi = input.nextInt();
        int volume = panjang * lebar * tinggi;{

        }double biayaTambahan = 0;
        if (volume > 100){
            biayaTambahan = 50000;
        }

     double totalbiaya =(biaya * jarak) + biayaTambahan;
     System.out.println("total biaya pengiriman paket adalah : rp." +totalbiaya);
    }
}