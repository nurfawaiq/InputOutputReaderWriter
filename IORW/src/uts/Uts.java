/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Faiq Noor
 */
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        for(String yn = "y"; yn.equals("y") || yn.equals("Y");){
            System.out.println("\n------------------ PROGRAM SEDERHANA -----------------\n" +
"             MENU PROGRAM :\n" +
"             1. INPUT SCANNER\n" +
"             2. MEMBACA DATA FILE INPUT STREAM\n" +
"             3. MENULIS DATA FILE OUTPUT STREAM\n" +
"             4. MEMBACA DATA DENGAN READER\n" +
"             5. MENULIS DATA DENGAN WRITER\n" +
"             6. KELUAR\n" +
"------------------------------------------------------");
            
            Scanner keyboard = new Scanner(System.in);
            System.out.print("SILAHKAN MASUKKAN PILIHAN ANDA : ");
            int menu = keyboard.nextInt();
            if(menu == 1) {
                inputScanner is = new inputScanner();
                is.process();
            } else if(menu == 2) {
                inputStream is2 = new inputStream();
                is2.process();
            } else if(menu == 3) {
                outputStream os = new outputStream();
                os.process();
            } else if(menu == 4) {
                Reader r = new Reader();
                r.process();
            } else if(menu == 5) {
                Writer w = new Writer();
                w.process();
            } else if(menu == 6) {
                System.out.println("KELUAR");
                System.exit(0);
            } else {
                System.out.println("Menu yang Anda Pilih Tidak Terdaftar");
            }
            
            System.out.print("Apakah Anda Mau Memilih Menu Lain? (Y/T) "); 
            yn = keyboard.next();
        }
        System.out.println("KELUAR");
    }
    
}
