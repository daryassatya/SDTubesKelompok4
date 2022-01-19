/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;
import com.github.freva.asciitable.AsciiTable;
import java.util.Scanner;
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
        String jawaban;
        boolean on = true;
            
        //Input Scannser
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("╔══════════════════════════════╗");
            System.out.println(YELLOW+"║ Sistem Informasi Keluar Masuk Barang Inventory ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println(YELLOW+"║ 1. Cek Inventory/Gudang                        ║");
            System.out.println(YELLOW+"║ 2. Barang Masuk                                ║");
            System.out.println(YELLOW+"║ 3. Barang Keluar                               ║");
            System.out.println(YELLOW+"║ 4. History                                     ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.println("Pilih Nomor menu :");
            pilihan = input.nextInt();
            
            if(pilihan == 1){
                
            } else if(pilihan == 2){
            
            } else if(pilihan == 3){
            
            } else if(pilihan == 4){
            
            }else{
            
            }
        }
        while(on == true);
        }
    }
    
}
