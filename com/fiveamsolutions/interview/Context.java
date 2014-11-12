package com.fiveamsolutions.interview;

public class Context {
     private AnagramFinder anagram;

     public Context(AnagramFinder anagram){   // Dependency Injection
         this.anagram = anagram;
     }

     public boolean executeAnagramCheck(String str1, String str2){
         return anagram.areAnagrams(str1, str2);
     }
}
