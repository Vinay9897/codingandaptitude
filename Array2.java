import java.util.Arrays;
import java.util.Comparator;

/*Given a string array words, 
return the maximum value of length(word[i]) * length(word[j]) where 
the two words do not share common letters.
 If no such two words exist, return 0. */

public class Array2 {

    public int maxProduct(String[] words){
        int max = 0;
        if(words == null || words.length==0){
            return 0;
        }

        Arrays.sort(words,new Comparator<String>()
        {
            public int compare(String a ,String b){
                return b.length() - a.length();
            }
        });

        int[] marks = new int[words.length];
        for(int i =0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                marks[i] |= 1<<(c-'a');
            }
        }


        for(int i = 0;i<words.length;i++){
            if(words[i].length() * words[i].length() <= max)break;
            for(int j = i+1;j<words.length;j++){
                if(( marks[i] & marks[j] )==0){
                    max = Math.max(max,words[i].length() * words[j].length());
                    
                  }
                  System.out.println(words[i]+" "+ words[j]);
            }
            
        }
         return max;
 
     }
   
     
    public static void main(String[] args) {

        String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};

        Array2 ar  = new Array2();
       
        System.out.println( ar.maxProduct(words));
        
    }

    
    
}
