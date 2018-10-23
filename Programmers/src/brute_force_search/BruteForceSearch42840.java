package brute_force_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 모의고사

/*
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

수포자 1은 [1, 4]번 문제를 맞혔습니다.
수포자 2는 다섯 번째 문제를 맞혔습니다.
*/

public class BruteForceSearch42840 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {1,3,2,4,2}));
	}
	
	public static int[] solution(int[] answers) {
		int[] first = new int[] {1, 2, 3, 4, 5};
		int[] second = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
		int[] third = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int firstScore = 0;
		int secondScore = 0;
		int thirdScore = 0;
		
		for(int i = 0; i < answers.length; ++i) {
			if(answers[i] == first[i % first.length])
				firstScore++;

			if(answers[i] == second[i % second.length])
				secondScore++;
			
			if(answers[i] == third[i % third.length])
				thirdScore++;
		}
		
		int max = firstScore > secondScore ? firstScore : secondScore;
		max = max > thirdScore ? max : thirdScore;
		
        List<Integer> list = new ArrayList<Integer>(); 
        if(firstScore == max) {
        	list.add(1);
        }
        if(secondScore == max) {
        	list.add(2);
        }
        if(thirdScore == max) {
        	list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); ++i) {
        	answer[i] = list.get(i);
        	System.out.println(answer[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
	
	public int[] otherSolution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0; i<answer.length; i++) {
            if(answer[i] == a[i%a.length]) {score[0]++;}
            if(answer[i] == b[i%b.length]) {score[1]++;}
            if(answer[i] == c[i%c.length]) {score[2]++;}
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
