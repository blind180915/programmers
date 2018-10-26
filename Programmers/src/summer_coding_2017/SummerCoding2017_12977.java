package summer_coding_2017;

// 소수 만들기
/*
문제 설명
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
nums의 각 원소는 1 이상 1000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
입출력 예
nums	result
[1,2,3,4]	1
[1,2,7,6,4]	4
입출력 예 설명
입출력 예 #1
[1,2,4]를 이용해서 7을 만들 수 있습니다.

입출력 예 #2
[1,2,4]를 이용해서 7을 만들 수 있습니다.
[1,4,6]을 이용해서 11을 만들 수 있습니다.
[2,4,7]을 이용해서 13을 만들 수 있습니다.
[4,6,7]을 이용해서 17을 만들 수 있습니다.

*/
public class SummerCoding2017_12977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {1,2,3,4}));
		System.out.println(solution(new int[] {1,2,7,6,4}));
	}
	
	public static int solution(int[] nums) {
        int answer = 0;
        int total = 0;
        boolean isPrime = true;
        
        for(int i = 0; i < nums.length - 2; ++i) {
        	for(int j = i + 1; j < nums.length - 1; ++j) {
        		for(int k = j + 1; k < nums.length; ++k) {
        			total = nums[i] + nums[j] + nums[k];
        			isPrime = true;
        			for(int num = 2; num <= Math.sqrt(total); ++num) {
        				if(total % num == 0) {
        					isPrime = false;
        					break;
        				}
        			}
        			if(isPrime) {
        				System.out.println("total = " + total);
        				answer++;
        			}
        		}
        	}
        }

        return answer;
    }

}
