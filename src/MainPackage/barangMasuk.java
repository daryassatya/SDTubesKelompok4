/*  By Dimas Aryasatya
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class barangMasuk {
    public static final String YELLOW = "\u001B[33m";   // YELLOW
    public static final String GREEN = "\033[0;32m";   // GREEN
    
    public static void inputMasuk(String inventory[][], String history[][]){
        String jawaban, kode, nama, jenis, jumlah;
        //Input Scannser
        Scanner input = new Scanner(System.in);
        
        //Get DateTime NOW
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
       
        if(inventory[0][0] != null){
            for(int i=0; i < 100; i++){
                inventory[i][0] = String.valueOf(i+1);
                System.out.print("Masukkan Kode Barang : ");
                kode = input.nextLine();
                inventory[i][1] = kode;
                System.out.print("Masukkan Nama Barang : ");
                nama = input.nextLine();
                inventory[i][2] = nama;
                System.out.print("Masukkan Jenis Barang : ");
                jenis = input.nextLine();
                inventory[i][3] = jenis;
                System.out.print("Masukkan Jumlah Barang : ");
                jumlah = input.nextLine();
                inventory[i][4] = jumlah;
                inventory[i][5] = dtf.format(now);
                saveHistory(history, kode, nama, jenis, jumlah);
                
                if(history[0][0] != null){
                    for(int a=0; a < history.length; a++){
                        if(history[a][1].equalsIgnoreCase(kode)){
                            inventory[i][4] += history[a][5];
                        }
                    }
                }
            }
            System.out.print("\n");
        } else {
            inventory[0][0] = String.valueOf(1);
            System.out.print("Masukkan Kode Barang : ");
            kode = input.nextLine();
            inventory[0][1] = kode;
            System.out.print("Masukkan Nama Barang : ");
            nama = input.nextLine();
            inventory[0][2] = nama;
            System.out.print("Masukkan Jenis Barang : ");
            jenis = input.nextLine();
            inventory[0][3] = jenis;
            System.out.print("Masukkan Jumlah Barang : ");
            jumlah = input.nextLine();
            inventory[0][4] = jumlah;
            inventory[0][5] = dtf.format(now);
                saveHistory(history, kode, nama, jenis, jumlah);
                
                if(history[0][0] != null){
                    for(int a=0; a < history.length; a++){
                        if(history[a][1].equalsIgnoreCase(kode)){
                            inventory[0][4] += history[a][5];
                        }
                    }
                }
        }
        System.out.println(GREEN+"Berhasil Menyimpan !");
        System.out.print("\n");
    }

    private static void saveHistory(String[][] history, String kode, String nama, String jenis, String jumlah) {
        //Get DateTime NOW
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now(); 
        
        if(history.length > 0){
            for(int a=0; a < history.length; a++){
                history[a][0] = String.valueOf(a+1);
                history[a][1] = kode;
                history[a][2] = nama;
                history[a][3] = jenis;
                history[a][4] = jumlah;
                history[a][5] = "Masuk";
                history[a][6] = dtf.format(now);
            }
        } else {
            history[0][0] = String.valueOf(1);
            history[0][1] = kode;
            history[0][2] = nama;
            history[0][3] = jenis;
            history[0][4] = jumlah;
            history[0][5] = "Masuk";
            history[0][6] = dtf.format(now);
        }
    }
}
