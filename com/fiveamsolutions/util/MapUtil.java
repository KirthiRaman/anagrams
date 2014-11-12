package com.fiveamsolutions.util;

import java.util.*;

public class MapUtil {
 
    public HashMap<Character, Integer> getMap(String str){
        HashMap<Character, Integer> charmap  = new HashMap<Character, Integer>();

        int len1 = str.length();
        int count=0;
        char c;

        for(int i=0; i<len1; i++){
          c = str.charAt(i);
          if( !Character.isWhitespace(c) ){
           if ( charmap.get(c) == null ){
              charmap.put(c, 1);
           } else {
              count = (charmap.get(c)).intValue();
              count++;
              charmap.put(c, count);
           }
          }
        }

        return charmap;
    }


}
