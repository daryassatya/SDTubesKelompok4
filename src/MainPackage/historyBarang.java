/*  By Dimas Aryasatya
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.github.freva.asciitable.AsciiTable;

/**
 *
 * @author USER
 */
public class historyBarang {
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static void semuaHistory(String[][] history){
        if(history.length > 0){
            String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Status", "Tanggal"};
            System.out.print("\n");
            System.out.println(AsciiTable.getTable(headers, history));
        }else{
            System.out.println(GREEN+"Tidak Ada History Keluar/Masuk Barang!");
        }
    }
    
    public static void masukHistory(String[][] history){
        String reArray[][] = {{null, null, null, null, null, null, null}};
        
        if(history.length > 0){
            for(int a=0; a < history.length; a++){
                if(history[a][5].equalsIgnoreCase("Masuk")){
                    reArray[a][0] = String.valueOf(a+1);
                    reArray[a][1] = history[0][1];
                    reArray[a][2] = history[0][2];
                    reArray[a][3] = history[0][3];
                    reArray[a][4] = history[0][4];
                    reArray[a][5] = history[0][5];
                    reArray[a][6] = history[0][6];
                }
            }
            
            if(reArray.length > 0){
                String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Status", "Tanggal"};
                System.out.print("\n");
                System.out.println(AsciiTable.getTable(headers, reArray));
            }else {
                System.out.println(GREEN+"Tidak Ada History Barang Masuk!");
            }
        } else {
            System.out.println(GREEN+"Tidak Ada History Barang Masuk!");
        }
        
        
    }
    
    public static void keluarHistory(String[][] history){
        String reArray[][] = {{null, null, null, null, null, null, null}};
        
        if(history.length > 0){
            for(int a=0; a < history.length; a++){
                if(history[a][5].equalsIgnoreCase("Keluar")){
                    reArray[a][0] = String.valueOf(a+1);
                    reArray[a][1] = history[0][1];
                    reArray[a][2] = history[0][2];
                    reArray[a][3] = history[0][3];
                    reArray[a][4] = history[0][4];
                    reArray[a][5] = history[0][5];
                    reArray[a][6] = history[0][6];
                }
            }
            
            if(reArray.length > 0){
                String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Status", "Tanggal"};
                System.out.print("\n");
                System.out.println(AsciiTable.getTable(headers, reArray));
            }else {
                System.out.println(GREEN+"Tidak Ada History Barang Keluar!");
            }
        } else {
            System.out.println(GREEN+"Tidak Ada History Barang Keluar!");
        }
        
        
    }
}
