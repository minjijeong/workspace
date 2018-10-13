package convert_N_Game;
import java.util.*;
public class Solution03 {

    public static String solution(int n, int t, int m, int p)
    {
        String answer = "";
        int start = 0 ;
        int index = 1 ;
        boolean isEnd = false ;

        while(!isEnd)
        {
            String result = convert(start, n);

            for(char c : result.toCharArray())
            {
                if(index == p) {
                    answer += c;
                    if (answer.length() == t){
                        isEnd = true;
                        break;
                    }
                }

                index++;
                if(index == m + 1) index = 1;
            }

            start++;
        }

        return answer;
    }

    public static String convert(int value, int n)
    {
        List<String> list = new ArrayList<>();

        do
        {
            int remain = value % n;
            switch(remain)
            {
                case 10:
                    list.add("A");
                    break;
                case 11:
                    list.add("B");
                    break;
                case 12:
                    list.add("C");
                    break;
                case 13:
                    list.add("D");
                    break;
                case 14:
                    list.add("E");
                    break;
                case 15:
                    list.add("F");
                    break;
                default:
                    list.add(String.valueOf(remain));
                    break;
            }
            value /= n ;
        }while(value != 0);

        String result = "";
        for(int i = list.size() - 1 ; i >= 0 ; i--)
            result += list.get(i);

        return result;
    }
}
