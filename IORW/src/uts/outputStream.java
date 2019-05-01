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
public class outputStream {
    public void process() {
        String source = "D:\\DATA\\KULIAH\\Semester 6\\Pemrograman Jaringan (Bu Ratih)\\uts\\mydata.txt";
        String dest = "D:\\DATA\\KULIAH\\Semester 6\\Pemrograman Jaringan (Bu Ratih)\\uts\\mydata_out.txt";
        byte buf[];
        try {
            System.out.println("---------- OUTPUT STREAM ----------");
            
            InputStream input = new FileInputStream(source);
            byte[] byData = new byte[100];
            int data = input.read(byData);

            OutputStream output = new FileOutputStream(dest);

            while(data != -1) {
                String strData = new String(byData);
                System.out.println("Baca data : " + strData);
                System.out.println("Panjang pembacaan data : " + data);
                
                buf = strData.getBytes();
                System.out.println("Tulisan ini akan di simpan ke sebuah file ");
                output.write(buf);
                
                data = input.read(byData);
            }
            
            input.close();
            output.close();
            
            System.out.println("---------- SELESAI ----------");
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
