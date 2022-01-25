/*  By Dimas Aryasatya
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;
import com.github.freva.asciitable.AsciiTable;
import java.util.Scanner;
import  MainPackage.barangMasuk;
import  MainPackage.barangKeluar;
import  MainPackage.historyBarang;
/**
 *
 * @author USER
 */
public class index {

    /**
     * @param args the command line arguments
     */
    
    //Text Color
    public static final String YELLOW = "\u001B[33m";   // YELLOW
    
    
    public static void main(String[] args) {
        int pilihan;
        String jawaban, masuk[][] = {{null, null, null, null, null}}, keluar[][] = {{null, null, null, null, null}}, history[][] = {{null, null, null, null, null, null, null}};
        boolean on = true;
            
        //Input Scannser
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("╔═══════════════════════════════╗");
            System.out.println(YELLOW+"║ Sistem Informasi Keluar Masuk Barang Inventory  ║");
            System.out.println("╠═══════════════════════════════╣");
            System.out.println(YELLOW+"║ 1. Cek Inventory/Gudang                         ║");
            System.out.println(YELLOW+"║ 2. Barang Masuk                                 ║");
            System.out.println(YELLOW+"║ 3. Barang Keluar                                ║");
            System.out.println(YELLOW+"║ 4. History                                      ║");
            System.out.println(YELLOW+"║ 5. Keluar                                       ║");
            System.out.println("╚═══════════════════════════════╝");
            System.out.print("Pilih Nomor menu : ");
            pilihan = input.nextInt();
            
            if(pilihan == 1){
                historyBarang.inventory(history);
            } else if(pilihan == 2){
                barangMasuk.inputMasuk(masuk, history);
            } else if(pilihan == 3){
                barangKeluar.inputKeluar(keluar, history);
            } else if(pilihan == 4){
                System.out.println("╔═══════════════════════════════╗");
                System.out.println(YELLOW+"║                      HISTORY                    ║");
                System.out.println("╠═══════════════════════════════╣");
                System.out.println(YELLOW+"║ 1. Semua History                                ║");
                System.out.println(YELLOW+"║ 2. Masuk History                                ║");
                System.out.println(YELLOW+"║ 3. Keluar                                       ║");
                System.out.println(YELLOW+"║ 4. Kembali                                      ║");
                System.out.println("╚═══════════════════════════════╝");
                System.out.print("Pilih Nomor menu : ");
                pilihan = input.nextInt();
                if(pilihan == 1){
                    historyBarang.semuaHistory(history);
                } else if(pilihan == 2){
                    historyBarang.masukHistory(history);
                } else if(pilihan == 3){
                    historyBarang.keluarHistory(history);
                } else {
                    System.out.println("Tidak ada menu seperti itu!");
                }
            } else {
                on = false;
            }
        }
        while(on == true);
        }
    }
