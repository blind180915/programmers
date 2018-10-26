package dfs_bfs;

import java.util.HashSet;
import java.util.Set;

// 네트워크

/*
문제 설명
네트워크란 컴퓨터 상호 간에 정보를 교환할 수 있도록 연결된 형태를 의미합니다. 예를 들어, 컴퓨터 A와 컴퓨터 B가 직접적으로 연결되어있고, 컴퓨터 B와 컴퓨터 C가 직접적으로 연결되어 있을 때 컴퓨터 A와 컴퓨터 C도 간접적으로 연결되어 정보를 교환할 수 있습니다. 따라서 컴퓨터 A, B, C는 모두 같은 네트워크 상에 있다고 할 수 있습니다.

컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 하도록 solution 함수를 작성하시오.

제한사항
컴퓨터의 개수 n은 1 이상 200 이하인 자연수입니다.
각 컴퓨터는 0부터 n-1인 정수로 표현합니다.
i번 컴퓨터와 j번 컴퓨터가 연결되어 있으면 computers[i][j]를 1로 표현합니다.
computer[i][i]는 항상 1입니다.
입출력 예
n	computers	return
3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1
입출력 예 설명
예제 #1
아래와 같이 2개의 네트워크가 있습니다.

예제 #2
아래와 같이 1개의 네트워크가 있습니다.
*/
public class DFS_BFS43162 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
		System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
	}
	
	 public static int getParent(int[] parents, int x) {
        if (parents[x] == x) {
                return x;
        }
        int parent = getParent(parents, parents[x]);
        return parent;
    }
 
    public static void unionParent(int[] parents, int x, int y) {
        x = getParent(parents, x);
        y = getParent(parents, y);
 
        // 더 작은 값으로 부모 노드 설정
        if (x < y) {
            parents[y] = x;
        } else {
            parents[x] = y;
        }
    }
    
    public static boolean isSameParent(int[] parents, int x, int y) {
        boolean result = false;
        if (parents[x] == parents[y])
            result = true;
        return result;
    }
	
	public static int solution(int n, int[][] computers) {
		int parents[] = new int[n];
		
		for(int i = 0; i < n; ++i) {
			parents[i] = i;
		}
        
        for(int i = 0; i < computers.length; ++i) {
        	for(int j = 0; j < computers[i].length; ++j) {
        		if(i == j) continue;
        		if(computers[i][j] == 1) {
        			if(isSameParent(parents, i, j))
        				continue;
        			else 
        				unionParent(parents, i, j);
        		}
        	}
        }
        
        Set s = new HashSet();
        
        for(int i = 0; i < n; ++i) {
        	s.add(parents[i]);
        }
    
        return s.size();
    }
}