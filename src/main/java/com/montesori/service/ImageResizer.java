package com.montesori.service;

import com.montesori.model.ResizeParameter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImageResizer {

    private static File resizeImages;


    public static void resizeImages(List<ResizeParameter> resizeParameters){
        if(resizeParameters.get(0) !=null){

            File newFileDestynation = resizeParameters.get(0).getFile();
            System.out.println("Tworze folder" + newFileDestynation.getParent() + "/resizeImages");
            resizeImages = new File(newFileDestynation.getParent() + "/resizeImages");
            resizeImages.mkdirs();
        }

        for (ResizeParameter resizeParameter: resizeParameters) {
            resizeImage(resizeParameter);

        }
    }


    public static void resizeImage(ResizeParameter resizeParameter){
        try{

            BufferedImage originalImage = ImageIO.read(resizeParameter.getFile());

            BufferedImage resizeImageJpg = resizeImage(originalImage, resizeParameter);

            ImageIO.write(resizeImageJpg, "jpg", new File(resizeImages.getAbsolutePath() + "/" +resizeParameter.getFile().getName() + ".jpg"));



//            BufferedImage resizeImagePng = resizeImage(originalImage, type);
//            ImageIO.write(resizeImagePng, "png", new File("c:\\image\\mkyong_png.jpg"));
//
//            BufferedImage resizeImageHintJpg = resizeImageWithHint(originalImage, type);
//            ImageIO.write(resizeImageHintJpg, "jpg", new File("c:\\image\\mkyong_hint_jpg.jpg"));
//
//            BufferedImage resizeImageHintPng = resizeImageWithHint(originalImage, type);
//            ImageIO.write(resizeImageHintPng, "png", new File("c:\\image\\mkyong_hint_png.jpg"));

        }catch(IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, ResizeParameter resizeParameter) {
        int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();

        BufferedImage resizedImage = new BufferedImage(resizeParameter.getWidth(), resizeParameter.getHeight(), type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, resizeParameter.getWidth(), resizeParameter.getHeight(), null);
        g.dispose();

        return resizedImage;
    }
}
