// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashMap;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        countLetters("Hello");
        
    }
    
    
    // Today we will learn how to count letters in a sentence
    // here I willl pass "Hello world" to the countLetters function
    
    static void countLetters(String s){
    // first of all I am converting sentence to lowerr case.
    // confirm with interviewer if they want it case sensitive or not
    // if they want case sensitive then don't make it lowercase
    // in this example I am assuming case insensitive
    
    // making it to lower case
     String sentence = s.toLowerCase();
     
     // Now I am declaring hashMap
     // this hashmap has key of char type and value of int type
     // so I decalred it like this
     HashMap<Character, Integer> counter = new HashMap<>();
     
     // now I will loop the sentence cahracter by cahracter
      System.out.println("Sentence is "+ sentence);
     for(int i =0; i < sentence.length();i++){
         Character c = sentence.charAt(i);
         System.out.println("character:"+ c+" found at position "+i);
         // now I will check if character is found in the map or not
         if (counter.get(c)==null){
              System.out.println("character:"+ c +" not found in map, so I will initialize it with 1");
              counter.put(c,1);
              
         }else{
              System.out.println("found character:"+ c+"in the map so I will inncrement its value");
              counter.put(c, counter.get(c)+1);
         }
          System.out.println("after this loop we have "+ counter);
           System.out.println("run: "+ i +"finished ");
            System.out.println("");
         //System.out.println(c);
         //counter.put(c, counter.getOrDefault(c,0) +1);
         
     }
      System.out.println("finally we have");
      System.out.println(counter);
    }
    
}


