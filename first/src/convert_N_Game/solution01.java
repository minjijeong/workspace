package convert_N_Game;

class Solution01 {
  public String solution(int n, int t, int m, int p) {
        int decimal = 0;
        int nextTube = p;
        int allocated = 0; 
        StringBuilder sb = new StringBuilder();

        loop: while (true) {
            String convertedNum = convert(decimal++, n);
            for (int j = 0; j < convertedNum.length(); j++) {
                allocated++;
                if (allocated == nextTube) {
                    nextTube += m;
                    sb.append(convertedNum.charAt(j));
                    if (sb.length() == t) {
                        break loop;
                    }
                }
            }
        }

        String answer = sb.toString();
        return answer;
    }

    private String convert(int decimal, int n) {
        StringBuilder converted = new StringBuilder();
        while (true) {
            int carry = decimal % n;
            if (carry >= 10) {
                carry = 'A' + carry - 10;
                char c = (char) carry;
                converted.append(c);
            } else {
                converted.append(carry);
            }
            decimal /= n;
            if (decimal == 0) {
                break;
            }
        }
        return converted.reverse().toString();
    }
}

