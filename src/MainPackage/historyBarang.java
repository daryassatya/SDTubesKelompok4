/*  By Dimas Aryasatya
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.github.freva.asciitable.AsciiTable;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class historyBarang {
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static void semuaHistory(String[][] history){
        int getLength = 0;
        for(int i = 0; i<history.length; i++ ){
            if(history[i][0] != null){
                getLength +=1; 
            }
        }
        System.out.println(getLength);
        String reArray[][] = new String[getLength][7];
        if(history[0][0] != null){
            for(int i = 0; i<history.length; i++ ){
                if(history[i][0] != null){
                   reArray[i][0] = String.valueOf(i+1);
                   reArray[i][1] = history[i][1];
                   reArray[i][2] = history[i][2];
                   reArray[i][3] = history[i][3];
                   reArray[i][4] = history[i][4];
                   reArray[i][5] = history[i][5];
                   reArray[i][6] = history[i][6];
                }
            }
            String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Status", "Tanggal"};
            System.out.print("\n");
            System.out.println(AsciiTable.getTable(headers, reArray));
        }else{
            System.out.println(GREEN+"Tidak Ada History Keluar/Masuk Barang!");
        }
    }
    
    public static void masukHistory(String[][] history){
        int getLength = 0;
        for(int i = 0; i<history.length; i++ ){
            if(history[i][5].equalsIgnoreCase("Masuk")){
                getLength +=1; 
            }
        }
        String reArray[][] = new String[getLength][7];
        if(history[0][0] != null){
            for(int i = 0; i<history.length; i++ ){
                if(history[i][5].equalsIgnoreCase("Masuk")){
                   reArray[i][0] = String.valueOf(i+1);
                   reArray[i][1] = history[i][1];
                   reArray[i][2] = history[i][2];
                   reArray[i][3] = history[i][3];
                   reArray[i][4] = history[i][4];
                   reArray[i][5] = history[i][5];
                   reArray[i][6] = history[i][6];
                }
            }
            String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Status", "Tanggal"};
            System.out.print("\n");
            System.out.println(AsciiTable.getTable(headers, reArray));
        }else{
            System.out.println(GREEN+"Tidak Ada History Keluar/Masuk Barang!");
        }
    }
    
    public static void keluarHistory(String[][] history){
          int getLength = 0;
        for(int i = 0; i<history.length; i++ ){
            if(history[i][5].equalsIgnoreCase("Keluar")){
                getLength +=1; 
            }
        }
        String reArray[][] = new String[getLength][7];
        if(history[0][0] != null){
            for(int i = 0; i<history.length; i++ ){
                if(history[i][5].equalsIgnoreCase("Keluar")){
                   reArray[i][0] = String.valueOf(i+1);
                   reArray[i][1] = history[i][1];
                   reArray[i][2] = history[i][2];
                   reArray[i][3] = history[i][3];
                   reArray[i][4] = history[i][4];
                   reArray[i][5] = history[i][5];
                   reArray[i][6] = history[i][6];
                }
            }
            String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Status", "Tanggal"};
            System.out.print("\n");
            System.out.println(AsciiTable.getTable(headers, reArray));
        }else{
            System.out.println(GREEN+"Tidak Ada History Keluar/Masuk Barang!");
        }
    }
    
    public static void inventory(String inventory[][]){
        int getLength = 0;
        for(int i = 0; i<inventory.length; i++ ){
            if(inventory[i][0] != null){
                getLength +=1; 
            }
        }
        String reArray[][] = new String[getLength][7];
        if(inventory[0][0] != null){
            for(int i = 0; i<inventory.length; i++ ){
                if(inventory[i][5] != null){
                   reArray[i][0] = String.valueOf(i+1);
                   reArray[i][1] = inventory[i][1];
                   reArray[i][2] = inventory[i][2];
                   reArray[i][3] = inventory[i][3];
                   reArray[i][4] = inventory[i][4];
                   reArray[i][5] = inventory[i][5];
                }
            }
            String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Tanggal"};
            System.out.print("\n");
            System.out.println(AsciiTable.getTable(headers, reArray));
        }else{
            System.out.println(GREEN+"Tidak Ada History Keluar/Masuk Barang!");
        }
    }
}
