/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteMapManipulator {
 
    public static void join(String inputPath, String outputPath, int des) throws IOException {
        //mở file
        File directory = new File(inputPath);
        // lấy tất cả các file trong thư mục
        File[] files = directory.listFiles();
        //System.out.println(files.length);
 
        //lấy thông tin của 1 hình nhỏ chiều rộng chiều cao
        BufferedImage sprite = ImageIO.read(files[0]);
        int width = sprite.getWidth() * des;
        int height = sprite.getHeight() * des;
//        System.out.println(width);
//        System.out.println(height);
        
        BufferedImage spriteMap = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = spriteMap.createGraphics();
        int x = 0;
        int y = 0;
        int k = 0;
        for (File file : files) {
            sprite = ImageIO.read(file);
            if( k == des){
            y+=sprite.getHeight();
            x=0;
            k=0;
            }  
        
        g2d.drawImage(sprite, null, x, y);
        x+=sprite.getWidth();
        k++;}
        //ghi spriteMap
        ImageIO.write(spriteMap, "png", new File(outputPath));    
    }
//    public void sub(String inputPath,String outputPath) throws IOException{
//
//        File directory= new File(inputPath);
//        
//        BufferedImage spritesheet = ImageIO.read(directory);
//        int subWidth = 64;
//        int subHeight = 64;
//
//        int number = spritesheet.getWidth()/subWidth;
//         System.out.println(spritesheet.getWidth()/subWidth);
//        int x = 0;
//        for(int i = 0; i < number; i++){
//            BufferedImage subimage = spritesheet.getSubimage(x, 0, 64,64);
//            ImageIO.write(subimage, "png", new File(outputPath + i + "_output.png"));
//            x += 64;
//        }
//    }
}