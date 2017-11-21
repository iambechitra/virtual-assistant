package Assistant;

import java.util.HashMap;


public class SameSoundingWordDetector {
    
    
    public String generateSoundCode(String word) {
        word = word.toUpperCase();
        
        char[] ch = word.toCharArray();
        String text = "";
        text += ch[0];
        String temp = new String(ch, 1, ch.length-1);
        temp = RemoveConsecutiveCharacter(temp);
        char[] character = temp.toCharArray();
        String code = "";
        
        for(int i = 1; i < character.length; i++) 
            code += Integer.toString(getCode(character[i]));
        
        code = RemoveZerosFromAString(code);
        
        text += code;
        
        return text;
        
    }
    
    private  String RemoveZerosFromAString(String text) {
        char[] ch = text.toCharArray();
        String temp = "";
        for(Character c : ch)
            if(c != '0')
                temp += c;
        
        return temp;
    }
    
    private String RemoveConsecutiveCharacter(String word) {
        String temp = "";
        char rem = '0';
        char[] ch = word.toCharArray();
        
        for(int i = 0; i < ch.length; i++) {
            if(rem != ch[i])
                temp += ch[i];
            
            rem = ch[i];
        }
        
        return temp;
    }
    
    private int getCode(char ch) {
        HashMap<Character, Integer> latter = new HashMap<>();
        
        //vowel with also some char that sound like vowel;
        latter.put('A', 0);
        latter.put('E', 0);
        latter.put('I', 0);
        latter.put('O', 0);
        latter.put('U', 0);
        latter.put('H', 0);
        latter.put('W', 0);
        latter.put('Y', 0);
        
        latter.put('B', 1);
        latter.put('F', 1);
        latter.put('P', 1);
        latter.put('V', 1);
        
        latter.put('C', 2);
        latter.put('G', 2);
        latter.put('J', 2);
        latter.put('K', 2);
        latter.put('Q', 2);
        latter.put('S', 2);
        latter.put('X', 2);
        latter.put('Z', 2);
        
        latter.put('D', 3);
        latter.put('T', 3);
        
        latter.put('L', 4);
        
        latter.put('M', 5);
        latter.put('N', 5);
        
        //Character that contains value 6;
        latter.put('R', 6);
        
        return latter.get(ch);
    }
}
