/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan20_targetsaldotabungan;
import java.text.DecimalFormat;

/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO20
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Target Saldo Tabungan Perbulan
 */
public class SI_RegPagi_22166010_Latihan20_TargetSaldoTabungan {

    public static void main(String[] args) {
        // Saldo Awal
        double saldoAwal = 3500000;
        // Bunga per Bulan (dalam persen)
        double bungaPerBulan = 8.0;
        // Saldo Target
        double saldoTarget = 6000000;

        // Format saldo awal sebagai mata uang
        DecimalFormat df = new DecimalFormat("#,###,###");
        String saldoAwalFormatted = df.format(saldoAwal);

        int bulan = 0;
        while (saldoAwal < saldoTarget) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
            bulan++;

            // Format saldo per bulan sebagai mata uang
            String saldoBulanFormatted = df.format(saldoAwal);
            System.out.println("Saldo di Bulan ke- " + bulan + ": Rp. " + saldoBulanFormatted);
        }
    
    }
    
}
