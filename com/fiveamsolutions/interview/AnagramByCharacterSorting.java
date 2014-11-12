package com.fiveamsolutions.interview;

import java.util.*;

import com.fiveamsolutions.util.StringUtil;

/**   Author: Kirthi Raman 
  *    Seems like an efficient algorithm 
  *    - relying on java Arrays sort means, it is equivalent to
  *      counting sort which is O(1) almost for character array
  *
  *    Assuming: (a) whitespaces are truly in the context java.lang.Character does
  *              (b) Case sensitive (default) 
  */
public class AnagramByCharacterSorting implements AnagramFinder {
 
    private boolean caseSensitive = true;

    public AnagramByCharacterSorting(){
    }

    public AnagramByCharacterSorting(boolean iscaseSensitive){
      this.caseSensitive = iscaseSensitive;
    }

    @Override
    public boolean areAnagrams(String str1, String str2){

        StringUtil sutil = new StringUtil();
        String s1 = sutil.removeWhitespaces(str1);
        String s2 = sutil.removeWhitespaces(str2);

        if ( s1.length() != s2.length() ) {
            return false;
        }

        // Do handle this only if they pass the length equality test
        if ( !caseSensitive ){
           s1 = s1.toLowerCase();
           s2 = s2.toLowerCase();
        }

        char[] scharr1 = s1.toCharArray();
        char[] scharr2 = s2.toCharArray();

        Arrays.sort(scharr1);
        Arrays.sort(scharr2);

        String st1 = new String(scharr1);
        String st2 = new String(scharr2);

        return st1.equals(st2);
    }

    public void setCaseSensitive(boolean isCaseSensitive){
       this.caseSensitive = isCaseSensitive;
    }

}
