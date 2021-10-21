package hw2;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        String mov="UDLR";
        System.out.println(judgeCircle(mov));
    }
    static final Map<Character,Integer> map = new HashMap<>();
    static {
        map.put('U',1);
        map.put('D',-1);
        map.put('L',2);
        map.put('R',-2);
    }
    static public boolean judgeCircle(String moves) {
        int vert =0;
        int horz= 0;
        for(char c:moves.toCharArray()){
            if(c=='L'||c=='L')
                vert+=map.get(c);
            else
                horz+=map.get(c);

        }
        return vert==0&&horz==0;
    }
}
