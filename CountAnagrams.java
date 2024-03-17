import java.util.HashMap;
import java.util.Map;

public class CountAnagrams {
    int search(String ptr, String str) {
        int sum = 0;
        int count = 0;
        int k = ptr.length();

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<ptr.length();i++){
            char ch = ptr.charAt(i);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,++a);
            } else{
                map.put(ch,1);
            }
        }

        count = map.size();
        int i=0,j=0;

        while(j<str.length()){
            char ch = str.charAt(j);
            if(map.containsKey(ch)){
                int a = map.get(ch);
                map.put(ch,--a);
                if(a==0){
                    count--;
                }
            }

            if(j-i+1 < k){
                j++;
                continue;
            }

            if(j-i+1 == k){
                char c = str.charAt(i);
                if(count == 0){
                    sum++;
                }
                if(map.containsKey(c)){
                    int a = map.get(c);
                    if(a==0){
                        count++;
                    }
                    map.put(c, ++a);
                }
            }
            i++;
            j++;
        }
        return sum;
    }
}
