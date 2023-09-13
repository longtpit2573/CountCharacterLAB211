package CountCharacter.common;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {

    HashMap<String, Integer> wordCountMap = new HashMap<>();
    HashMap<Character, Integer> charCountMap = new HashMap<>();

    public void countWord(String input){
        
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
    }


    public void CountCharacter(String input){
        
        for (char ch : input.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
    }

    public void displayCountWord(){
        System.out.println("so lan xuat hien cua tung tu trong chuoi:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public void displayCountCharacter() {
        System.out.println("So lan xuat hien cua tung ky tu trong chuoi:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (ch != ' ') {  // Kiểm tra nếu không phải ký tự khoảng trắng
                System.out.println(ch + "=" + count);
            }
        }
    }
    
}
