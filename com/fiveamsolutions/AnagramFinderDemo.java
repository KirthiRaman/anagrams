package com.fiveamsolutions;

import java.util.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fiveamsolutions.interview.AnagramByMapping;
import com.fiveamsolutions.interview.AnagramByCharacterSorting;
import com.fiveamsolutions.interview.AnagramByArray;
import com.fiveamsolutions.interview.Context;

public class AnagramFinderDemo {
 
    static public void main(String[] args){
        
         String s1[] = { " ALP ULBLY HA ", "B UL L SAND", "INFERIORITY-COMPLEX", "ANAGRAM ASSIGN MENT",
                         "WIZARDS WASH INGTON", "SEAT TLE SEA HAWKS"  };
         String s2[] = {"ALPHA  BULLY", "SANDBULL", "COMP- LEXINFERITYIOR", "ASSIGNMENT ANAG RAM",
                         "WASHINGTON WIZA RD S", "SEAHAW KS SEA TTLE"};
         String s3[] = { " Alp ULbLY HA ", "b UL L sAND", "jNFERmORkTY-COMPLEX", "bNbGRdM AtSIGN MENT",
                         "WIZARDS wash INGTON", "SEAT tle SEA HAWKS"  };
         String s4[] = {"ALpHA  bUlLY", "sANDbULT", "COMP- LEXjNFERkTYmOR", "dStIGNMENT bNbG RAM",
                         "WAShINGTON wIZa RD s", "SEAHAW KS SEA tTle"};

         // First algorithm is being tested here with both case sensitive - true and false
         // Record the time started
         SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss SSSSS");
         System.out.println("Started ... @ "+ft.format(new Date()));
         int len = s1.length;
         // With case-sensitive as default (true)
         Context context = new Context(new AnagramByMapping());
         for(int i=0; i<len; i++){
           context.executeAnagramCheck(s1[i], s2[i]);
         }
         // With case-sensitive as false 
         context = new Context(new AnagramByMapping(false));
         for(int i=0; i<len; i++){
           context.executeAnagramCheck(s3[i], s4[i]);
         }
         // Record the time ended
         ft = new SimpleDateFormat("hh:mm:ss SSSSS");
         System.out.println("  Ended ... @ "+ft.format(new Date()));
         System.out.println("------------------------------------");


         // Second algorithm is being tested here with both case sensitive - true and false
         // Record the time started
         ft = new SimpleDateFormat("hh:mm:ss SSSSS");
         System.out.println("Started ... @ "+ft.format(new Date()));
         // With case-sensitive as default (true)
         context = new Context(new AnagramByCharacterSorting());
         for(int i=0; i<len; i++){
           context.executeAnagramCheck(s1[i], s2[i]);
         }
         // With case-sensitive as false 
         context = new Context(new AnagramByCharacterSorting(false));
         for(int i=0; i<len; i++){
           context.executeAnagramCheck(s3[i], s4[i]);
         }
         // Record the time ended
         ft = new SimpleDateFormat("hh:mm:ss SSSSS");
         System.out.println("  Ended ... @ "+ft.format(new Date()));
         System.out.println("------------------------------------");

         // Third algorithm is being tested here with both case sensitive - true and false
         // Record the time started
         ft = new SimpleDateFormat("hh:mm:ss SSSSS");
         System.out.println("Started ... @ "+ft.format(new Date()));
         // With case-sensitive as default (true)
         context = new Context(new AnagramByArray());
         for(int i=0; i<len; i++){
           context.executeAnagramCheck(s1[i], s2[i]);
         }
         // With case-sensitive as false 
         context = new Context(new AnagramByArray(false));
         for(int i=0; i<len; i++){
           context.executeAnagramCheck(s3[i], s4[i]);
         }
         // Record the time ended
         ft = new SimpleDateFormat("hh:mm:ss SSSSS");
         System.out.println("  Ended ... @ "+ft.format(new Date()));
         System.out.println("------------------------------------");
    }

}
