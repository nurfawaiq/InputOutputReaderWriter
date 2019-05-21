/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author Faiq Noor
 */
public class inputScanner {
    public void process() {
        System.out.println("---------- SCANNER ----------");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("MASUKKAN NAMA ANDA : ");
        String nama = keyboard.nextLine();
        
        System.out.print("MASUKKAN NIM ANDA : ");
        int nim = keyboard.nextInt();
        
        System.out.println("NAMA : " + nama);
        System.out.println("NIM : " + nim);
        
        System.out.println("---------- SELESAI ----------");
    }
}
