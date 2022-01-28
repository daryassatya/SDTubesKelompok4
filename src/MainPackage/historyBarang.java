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
        String reArray[][] = new String[history.length][7];
        
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
    
    public static void inventory(String inventory[][]){
        
        
//        if(history[0][0] != null){
//            for(int a=0; a<reArray.length; a++){
//                System.out.println(GREEN+reArray[0][0]);
//                
//                for(int i=0; i<history.length; i++){
//                    if(history[i][5].equalsIgnoreCase("Masuk")){
//                        if(reArray[a][1].equalsIgnoreCase(history[i][1])){
//                            reArray[a][4] += history[i][4];
//                            System.out.println(GREEN+"Ada yang sama!");
//                                
//                        } 
//                        
//                        if(reArray[a][0] == null){
//                            a-=1;1
//                                    
//                        }
//                    }
//                }
//            }
//            
            if(inventory[0][0] != null){
                String[] headers = {"No", "Kode", "Nama Barang", "Jenis", "Jumlah", "Tanggal"};
                System.out.print("\n");
                System.out.println(AsciiTable.getTable(headers, inventory));
            }else {
                System.out.println(GREEN+"Tidak Ada Barang di Inventory!");
            }
//        } else {
//            System.out.println(GREEN+"Tidak Ada Barang di Inventory!");
//        }
    }
}
