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
public class Reader {
    
    File f;
    FileReader fr;
    BufferedReader fin;
    
    public Reader() throws FileNotFoundException {
        File f = new File ("D:\\DATA\\KULIAH\\tugas\\text.txt");
        fr = new FileReader(f);
        fin = new BufferedReader(fr);
    }
    
    public void process() throws IOException {
        System.out.println("---------- READER ----------");
            
        String str = null;
        for( ; ; ) {
            try {
                str = fin.readLine();
            } catch (IOException e) { }
            if(str == null)
                break;
            System.out.println(str);
        }
        fin.close();
        
        System.out.println("---------- SELESAI ----------");
    }
}
