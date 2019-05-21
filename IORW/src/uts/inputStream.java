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
public class inputStream {
    public void process() {
        String inputFile = "D:\\DATA\\KULIAH\\tugas\\is_data.txt";
        try {
            System.out.println("---------- INPUT STREAM ----------");
            
            InputStream input = new FileInputStream(inputFile);
            
//            int byteData = input.read();
//            while(byteData != -1) {
//                String strData = new String(new byte[]{(byte)byteData});
//                System.out.println("Data : " + strData + "| Databyte : " + byteData);
//                byteData = input.read();
//            }
            
            byte[] myData = new byte[20];
            int data = input.read(myData);
            while(data != -1) {
                String strData = new String(myData);
                System.out.println("Data : " + strData);
                System.out.println("Panjang data terbaca : " + data);
                
                data = input.read(myData);
            }
            
            input.close();
            
            System.out.println("---------- SELESAI ----------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
