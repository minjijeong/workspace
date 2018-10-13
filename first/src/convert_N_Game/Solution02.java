package convert_N_Game;

public class Solution02 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";

        int order = 0;
        int num = 0;

        while(order < p + m * (t - 1)) {
            String temp = change(num, n);
            int a = 0;
            for(int inx = 0; inx < temp.length(); inx++) {
                a++;
                if((order + a - p) % m == 0) {
                    answer += Character.toString(temp.charAt(inx));
                    break;
                }
            }
            order += temp.length();
            num++;
        }   

        return answer;
    }

    public String change(int num, int n) {
        String str = "";

        if(num == 0) {
            str = "0";
        }
        while(num != 0) {
            if(num % n > 9) {
                str = Character.toString((char)(num % n + 55)) + str;
                num = num / n;
            } else {
                str = Integer.toString(num % n) + str;
                num = num / n;
            }
        }       
        return str;
    }
}
