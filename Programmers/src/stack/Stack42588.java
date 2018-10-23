package stack;

import java.util.Arrays;

// 탑

public class Stack42588 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[] {6,9,5,7,4}));
	}
	
	public static int[] solution(int[] heights) {
		int length = heights.length;
		int[] answer = new int[length];
		
		for(int i = 1; i < length; ++i) {
			for(int j = i - 1; j >= 0; --j) {
				if(heights[i] < heights[j]) {
					answer[i] = j + 1;
					break;
				}
			}
		}
		
		for(int i = 0; i < length; ++i) {
			System.out.println(answer[i]);
		}
        
        return answer;
    }
}
