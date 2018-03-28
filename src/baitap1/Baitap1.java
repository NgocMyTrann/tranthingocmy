/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.io.IOException;

/**
 *
 * @author VS9 X64Bit
 */
public class Baitap1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            SpriteMapManipulator.join("D:\\Compressed\\Baitap1\\Sprite", "D:\\Compressed\\Baitap1\\imgs\\out.png", 2);
//            String[] chuoi = {"D:\\Compressed\\Baitap1\\Sprite", "D:\\Compressed\\Baitap1"};
             // String[] chuoi = {"D:\\Compressed\\Baitap1\\Sprite", "D:\\Compressed\\Baitap1\\Image"};
           // args[0] = "F:\\HoDacHung\\Game213\\images";
            //args[1] = "F:\\HoDacHung\\Game213";
            //SpriteMapManipulator.join(chuoi[0], chuoi[1]);
        }
        catch(IOException ex){
            System.err.println(ex.getMessage());
        }
            
    }
}