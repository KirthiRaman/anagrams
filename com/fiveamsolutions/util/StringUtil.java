package com.fiveamsolutions.util;

import java.util.*;

public class StringUtil {
 
    public String removeWhitespaces(String str){
        int len = str.length();

        StringBuilder sb = new StringBuilder();
        char c;

        for(int i=0; i<len; i++){
          c = str.charAt(i);
          if ( !Character.isWhitespace(c) )
            sb.append(c);
        }

        return sb.toString();
    }

}
