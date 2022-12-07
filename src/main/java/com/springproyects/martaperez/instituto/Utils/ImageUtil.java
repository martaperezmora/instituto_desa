package com.springproyects.martaperez.instituto.Utils;

import java.util.Base64;

public class ImageUtil {
    public static String getImgData(byte[] byteData){
        if(byteData != null){
            return Base64.getMimeEncoder().encodeToString(byteData);
        } else {
            return null;
        }
    }
}
