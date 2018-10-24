package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 가장 큰 수

/*
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	6210
[3, 30, 34, 5, 9]	9534330
*/
public class Sort42746 {

	public static void main(String[] args) {
		
	}
	
	public String solution(int[] numbers) {
        String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }
	
	public String solution2(int[] numbers) {
        String[] s = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++)
            s[i] = String.valueOf(numbers[i]);

        Arrays.sort(s, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(a.charAt(0) == b.charAt(0)){
                    int aa = Integer.parseInt(a+b);
                    int bb = Integer.parseInt(b+a);
                    return bb - aa;
                }

                return b.charAt(0) - a.charAt(0);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length; i++)
            sb.append(s[i]);

        return sb.charAt(0) == '0' ? "0" : sb.toString();
    }
	
	public String solution3(int[] numbers) {
        String answer = "";
        S[] s = new S[numbers.length];
        for(int i=0; i<s.length; i++) {
            s[i] = new S(Integer.toString(numbers[i]));
        }
        Arrays.sort(s);
        for(int i=0; i<s.length; i++) {
            answer += s[i].s;
        }
        return answer.charAt(0)=='0'? "0" : answer;
    }

    class S implements Comparable<S> {
        String s;
        S(String i) {s = i;}
        public int compareTo(S o) {
            String so = s+o.s;
            String os = o.s+s;
            return os.compareTo(so);
        }
    }
}
