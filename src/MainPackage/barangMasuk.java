/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class barangMasuk {
    
    public static void inputMasuk(String masuk[][], String history[][]){
        String jawaban, kode, nama, jenis, jumlah;
        //Input Scannser
        Scanner input = new Scanner(System.in);
       
        if(masuk.length > 0){
            for(int i=0; i < masuk.length; i++){
                masuk[i][0] = String.valueOf(i+1);
                System.out.println("Masukkan Kode Barang :");
                input.nextLine();
                kode = input.next();
                masuk[i][1] = jawaban;
                System.out.println("Masukkan Nama Barang :");
                masuk[i][2] = jawaban;
                System.out.println("Masukkan Jenis Barang :");
                jenis = input.nextLine();
                masuk[i][3] = jawaban;
                System.out.println("Masukkan Jumlah Barang :");
                jumlah = input.nextLine();
                masuk[i][4] = jawaban;
                if(masuk.length > 0){
                    for(int a=0; a < history.length; a++){
                        history[a][0] = String.valueOf(i+1);
                        history[a][1] =
                    }
                } else {
                
                }
            }
            System.out.println("\n");
        } else {
            masuk[1][0] = String.valueOf(1);
            System.out.println("Masukkan Kode Barang :");
            input.nextLine();
            jawaban = input.next();
            masuk[1][1] = jawaban;
            System.out.println("Masukkan Nama Barang :");
            jawaban = input.next();
            masuk[1][2] = jawaban;
            System.out.println("Masukkan Jenis Barang :");
            input.nextLine();
            jawaban = input.nextLine();
            masuk[1][3] = jawaban;
            System.out.println("Masukkan Jumlah Barang :");
            input.nextLine();
            jawaban = input.nextLine();
            masuk[1][4] = jawaban;
        }
    }
    
    public static void returnMasuk(String masuk[][], String history[][]){
    }
}
