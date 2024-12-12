import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] hargaBuku = {350000, 450000, 500000, 95000};

        System.out.println("Daftar Buku:");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println((i + 1) + ". " + namaBuku[i] + " " + hargaBuku[i]);
        }

        ArrayList<Integer> hargaBelanja = new ArrayList<>();
        while (true) {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihan = input.nextInt();
            hargaBelanja.add(hargaBuku[pilihan - 1]);
            System.out.print("Input lagi (Y/N)?: ");
            String jawaban = input.next();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }

        int[] totalHarga = new int[1];
        hitungTotalHarga(hargaBelanja, totalHarga);

        int[] voucherBelanja = new int[1];
        hitungVoucherBelanja(totalHarga[0], voucherBelanja);

        System.out.println("Total voucher belanja : " + voucherBelanja[0]);
        System.out.println("Total yang harus dibayar : " + totalHarga[0]);

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
        input.close();
    }

    public static void hitungTotalHarga(ArrayList<Integer> hargaBelanja, int[] totalHarga) {
        totalHarga[0] = 0;
        for (int harga : hargaBelanja) {
            totalHarga[0] += harga;
        }
    }

    public static void hitungVoucherBelanja(int totalHarga, int[] voucherBelanja) {
        if (totalHarga < 200000) {
            voucherBelanja[0] = 0;
        } else if (totalHarga >= 200000 && totalHarga <= 500000) {
            voucherBelanja[0] = 50000;
        } else if (totalHarga > 500000 && totalHarga <= 750000) {
            voucherBelanja[0] = 100000;
        } else if (totalHarga > 750000 && totalHarga <= 1000000) {
            voucherBelanja[0] = 150000;
        } else {
            voucherBelanja[0] = 200000;
        }
    }
}