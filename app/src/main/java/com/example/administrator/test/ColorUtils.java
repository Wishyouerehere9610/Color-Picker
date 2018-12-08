package com.example.administrator.test;

import android.graphics.Color;

public class ColorUtils {


    public static String int2Hex(int colorInt){
        String hexCode = "";
        hexCode = String.format("#%06X", Integer.valueOf(16777215 & colorInt));
        return hexCode;
    }


    public static String int2Hex2(int colorInt){
        String hexCode = "";
        int[] rgb = int2Rgb(colorInt);
        hexCode = rgb2Hex(rgb);
        return hexCode;
    }


    public static int[] int2Rgb(int colorInt){
        int[] rgb = new int[]{0,0,0};

        int red = Color.red(colorInt);
        int green = Color.green(colorInt);
        int blue = Color.blue(colorInt);
        rgb[0] = red;
        rgb[1] = green;
        rgb[2] = blue;

        return rgb;
    }

    public static String rgb2Hex(int[] rgb){
        String hexCode="#";
        for(int i=0;i<rgb.length;i++){
            int rgbItem = rgb[i];
            if(rgbItem < 0){
                rgbItem = 0;
            }else if(rgbItem > 255){
                rgbItem = 255;
            }
            String[] code = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
            int lCode = rgbItem / 16;
            int rCode = rgbItem % 16;
            hexCode += code[lCode] + code[rCode];//FF
        }
        return hexCode;
    }

    public static int hex2Int(String colorHex){
        int colorInt = 0;
        colorInt = Color.parseColor(colorHex);
        return colorInt;
    }


    public static int[] hex2Rgb(String colorHex){
        int colorInt = hex2Int(colorHex);
        return int2Rgb(colorInt);
    }


    public static int rgb2Int(int[] rgb){
        int colorInt = 0;
        colorInt = Color.rgb(rgb[0],rgb[1],rgb[2]);
        return colorInt;
    }

}
