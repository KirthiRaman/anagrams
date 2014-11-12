package com.fiveamsolutions.util;

import java.util.*;

public class ArrayUtil {
 
    public int[] getMap(String str){
        int maxsize = 255;   // lookup in ASCII table to reduce it further
        int charmap[] = new int[maxsize]; 

        for(int i=0; i<maxsize; i++) charmap[i] = 0;

        int len1 = str.length();
        int intc=0;
        char c;

        for(int i=0; i<len1; i++){
          c = str.charAt(i);
          intc = c;
          if( !Character.isWhitespace(c) ){
           charmap[intc] = charmap[intc] + 1;
          }
        }

        return charmap;
    }


}
