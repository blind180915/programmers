package binary_search;

import java.util.Arrays;

// 입국심사

/*
문제 설명
n명이 입국심사를 위해 줄을 서서 기다리고 있습니다. 각 입국심사대에 있는 심사관마다 심사하는데 걸리는 시간은 다릅니다.

처음에 모든 심사대는 비어있습니다. 한 심사대에서는 동시에 한 명만 심사를 할 수 있습니다. 가장 앞에 서 있는 사람은 비어 있는 심사대로 가서 심사를 받을 수 있습니다. 하지만 더 빨리 끝나는 심사대가 있으면 기다렸다가 그곳으로 가서 심사를 받을 수도 있습니다.

모든 사람이 심사를 받는데 걸리는 시간을 최소로 하고 싶습니다.

입국심사를 기다리는 사람 수 n, 각 심사관이 한 명을 심사하는데 걸리는 시간이 담긴 배열 times가 매개변수로 주어질 때, 모든 사람이 심사를 받는데 걸리는 시간의 최솟값을 return 하도록 solution 함수를 작성해주세요.

제한사항
입국심사를 기다리는 사람은 1명 이상 1,000,000,000명 이하입니다.
각 심사관이 한 명을 심사하는데 걸리는 시간은 1분 이상 1,000,000,000분 이하입니다.
심사관은 1명 이상 100,000명 이하입니다.
입출력 예
n	times	return
6	[7, 10]	28
	[]
입출력 예 설명
가장 첫 두 사람은 바로 심사를 받으러 갑니다.

7분이 되었을 때, 첫 번째 심사대가 비고 3번째 사람이 심사를 받습니다.

10분이 되었을 때, 두 번째 심사대가 비고 4번째 사람이 심사를 받습니다.

14분이 되었을 때, 첫 번째 심사대가 비고 5번째 사람이 심사를 받습니다.

20분이 되었을 때, 두 번째 심사대가 비지만 6번째 사람이 그곳에서 심사를 받지 않고 1분을 더 기다린 후에 첫 번째 심사대에서 심사를 받으면 28분에 모든 사람의 심사가 끝납니다.
*/
public class BinarySearch43238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(solution(6,	new int[] {7, 10}));
//		System.out.println(solution(8,	new int[] {3, 5, 9}));
		
//		System.out.println(solution2(6,	new int[] {7, 10}));
//		System.out.println(solution2(8,	new int[] {3, 5, 9}));
		System.out.println(solution2(8,	new int[] {11, 1, 43, 34, 10}));
	}
	
	public static int solution(int n, int[] times) {
		Arrays.sort(times);
		int average = n / times.length;
		int length = times.length;
		
		int mid = 0;
        int left = times[0] * average;
        int right = times[length - 1] * (average + 1);
        int total = 0; 
        int answer = Integer.MAX_VALUE;
 
        while (right >= left) {
            mid = (right + left) / 2;
            
            total = 0;
            
            for(int i = 0; i < length; ++i) {
            	total += mid / times[i];
            }
            
//            System.out.println("mid : " + mid + ", left : " + left + ", right : " + right + ", total : " + total);
            
            if(total == n) {
            	break;
            }
            
            if(total > n) {
            	right = mid - 1;
            } else {
            	left = mid + 1;
            }
        }
       
		return mid;
    }
	
	public static int solution2(int n, int[] times) {
		int length = times.length;
		int[] sortTimes = new int[length];
		System.arraycopy(times, 0, sortTimes, 0, length);
		quickSort(times, sortTimes, 0, length - 1);
		
		for(int i = 0; i < length; ++i) {
			System.out.println("times" + i + " : " + times[i]);
			System.out.println("sortTimes" + i + " : " + sortTimes[i]);
		}
		return 0;
	}
	
	public static void quickSort(int arr[], int arr2[], int left, int right) {
		if(left < right) {
			int pivotNewIndex = partition(arr, arr2, left, right);
			
			quickSort(arr, arr2, left, pivotNewIndex - 1);
			quickSort(arr, arr2, pivotNewIndex + 1, right);
		}
	}
	
	public static int partition(int arr[], int arr2[], int left, int right) {
		int pivot = arr[(left + right) / 2];
		
		while (left < right) {
			while((arr[left] < pivot) && (left < right))
				left++;
			while((arr[right] > pivot) && (left < right))
				right--;
			
			if(left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				// arr2
				int temp2 = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		
		return left;
	}
}
