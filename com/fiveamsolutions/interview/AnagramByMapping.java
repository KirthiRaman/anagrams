package com.fiveamsolutions.interview;

import java.util.*;

import com.fiveamsolutions.util.MapUtil;

/** Author: Kirthi Raman 
  * Seems like less efficient algorithm because of map creation and lookup 
  *    Assuming: (a) whitespaces are truly in the context java.lang.Character does
  *              (b) Case sensitive (default)
  */
public class AnagramByMapping implements AnagramFinder {
 
    private boolean caseSensitive = true;

    public AnagramByMapping(){
    } 

    public AnagramByMapping(boolean iscaseSensitive){
      this.caseSensitive = iscaseSensitive;
    }

    @Override
    public boolean areAnagrams(String s1, String s2){
        boolean anagram_sofar = true;

        int i=0, len1=s1.length();

        // Early termination check, if strings are of unequal lengths,
        // then they cannot be anagrams
        if ( len1 != s2.length() ) {
            return false;
        }
    
        // Do handle this only if they pass the length equality test
        if ( !caseSensitive ){
           s1 = s1.toLowerCase();
           s2 = s2.toLowerCase();
        }

        MapUtil mutil = new MapUtil();
        HashMap<Character, Integer> charmap1 = mutil.getMap(s1);
        HashMap<Character, Integer> charmap2 = mutil.getMap(s2);

        while ( anagram_sofar && i<len1){
            if ( charmap1.get(s1.charAt(i)) != charmap2.get(s1.charAt(i)) ){
               anagram_sofar = false;
            }
            i++;
        }          

        return anagram_sofar;
    }

    public void setCaseSensitive(boolean isCaseSensitive){
       this.caseSensitive = isCaseSensitive;
    }
}


