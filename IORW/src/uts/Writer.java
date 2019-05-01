/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.io.*;

/**
 *
 * @author Faiq Noor
 */
public class Writer {
    File f;
    FileWriter fw;
    PrintWriter fout;

    public Writer() {
        try {
            f = new File("D:\\DATA\\KULIAH\\Semester 6\\Pemrograman Jaringan (Bu Ratih)\\uts\\writer.txt");
            fw = new FileWriter(f);
            fout = new PrintWriter(fw);   
        } catch (IOException e) {
            System.out.println("File gagal dibuka");
        }
    }
    
    public void tulisKalimat() {
        String kalimat [] = {
            "Tugas UTS Kelompok",
            "Mata Kuliah Pemrograman Jaringan",
            "Prodi Teknik Informatika"
        };
        for (int i = 0; i<kalimat.length; i++) {
            fout.println(kalimat[i]);
        } 
        fout.flush();
        fout.close();
    }
    
    public void process() throws FileNotFoundException, IOException {
        System.out.println("---------- WRITER ----------");
        
        new Writer().tulisKalimat();
        
        FileInputStream input = new FileInputStream("D:\\DATA\\KULIAH\\Semester 6\\Pemrograman Jaringan (Bu Ratih)\\uts\\writer.txt");
       
        int data;
        while((data = input.read()) != -1) {
            System.out.print((char)data);
        }        
        System.out.println("---------- SELESAI ----------");
    }
}
