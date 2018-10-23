package heap;

import java.util.Collections;
import java.util.PriorityQueue;

//더 맵게

public class Heap42626 {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
	}

	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		int length = scoville.length;
		
		for (int i = 0; i < length; ++i) {
			priorityQueue.add(scoville[i]);
		}
		
		int count = 0;
		int temp = 0;
		
		while(true) {
			if(priorityQueue.peek() >= K) {
				break;
			}
			
			if(priorityQueue.size() <= 1) {
				return -1;
			}
			
			temp = priorityQueue.poll();
			temp += priorityQueue.poll() * 2;
			
			priorityQueue.add(temp);
			count ++;
		}
		
		// 오름차순 
//		PriorityQueue<Integer> reversedPriorityQueue = new PriorityQueue<Integer>(priorityQueue.size(), Collections.reverseOrder());
//		reversedPriorityQueue.addAll(priorityQueue);
//		System.out.println(reversedPriorityQueue.peek());
		return count;

	}
	
	public int otherSolution(int[] scoville, int K) {
        PriorityQueue<Integer> que = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
            que.add(scoville[i]);
        }

        int size = que.size();
        int sum = 0;
        for(int i=0; i<size-1; i++){
            if(que.peek() < K){
                sum = que.poll() + que.poll() * 2;
                que.add(sum);

            } else {
                return i;
            }
        }
        return -1;
    }
}