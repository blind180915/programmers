# programmers
 2018 Winter Coding - 겨울 스타트업 인턴 프로그램 준비

* 해시
  * 해시는 Key-value쌍으로 데이터를 저장하는 자료구조입니다.
  * 사용 클래스
    * java.util.HashMap
      * put(key, value) HashMap에 키와 값을 저장.
      * containsKey(key) HashMap에 지정된 키(Key)가 포함되어 있는지 알려준다. 
      * get(key) 지정된 Key 의 값을 반환한다. 
      * remove(key) HashMap에서 지정된 키로 지정된 값을 제거한다.
      * keySet() HashMap에 저장된 모든 키가 저장된 Set을 반환한다.
    * java.util.Set
  * [완주하지 못한 선수](https://programmers.co.kr/learn/courses/30/lessons/42576)
    * 마라톤을 참가한 사람과 마라톤을 완주한 사람 배열을 주고 완주하지 못한 사람을 찾는 문제.
    * HashMap 에 직접 넣어서 비교 및 삭제 다른 사람들은 숫자를 집어넣어 좀더 간편하게 해결.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/hash/Hash42576.java)
  * [전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577)
    * 전화번호가 다른 전화번호에 접두어가 되는지 확인하는 문제.
    * 정렬을 통해 다음 번호와 지금 번호를 비교 다른 사람들은 정렬을 하지 않고 전체를 비교.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/hash/Hash42577.java)
* 스택/큐
  * LIFO, FIFO, push & pop! 스택과 큐를 이용해서 문제를 풀어보세요.
  * 사용 클래스
    * java.util.Stack
      * push(value) 해당 스택의 제일 상단에 전달된 요소를 삽입함.
      * peek() 해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환함.
      * pop() 해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거함.
  * [탑](https://programmers.co.kr/learn/courses/30/lessons/42588)
    * 탑 N대가 높은 탑에서만 수신할 수 있는 신호를 보내 어떠한 탑이 받았는지 알아내는 문제.
    * 2중 포문을 통해 조건이 맞는지 확인하여 해결.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/stack_queue/StackQueue42588.java)
  * [쇠막대기](https://programmers.co.kr/learn/courses/30/lessons/42585)
    * 레이저()와 쇠막대기(..)를 찾아 레이저를 통해 쇠막대기가 몇개가 되었는지 알아내는 문제.
    * 레이저인 경우 현재 count를 전체 더해주고 쇠막대기가 추가 될때마다 count를 하나씩 증가.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/stack_queue/StackQueue42585.java)
* 힙(Heap)
  * 힙은 특정한 규칙을 가지는 트리로, 힙을 이용해서 우선순위 큐를 구현할 수 있습니다.
  * 사용 클래스 
    * java.util.PriorityQueue
      * add(value) element를 추가한다.
      * poll() head에서 element를 제거하며 읽는다. 만약 queue가 empty이면 null을 반환한다.
      * peek() head에서 element를 제거하지 않고 읽는다. 만약 queue가 empty이면 null을 반환한다
  * 추가 클래스
    * java.util.Collections 
      * reverseOrder()
  * [더 맵게](https://programmers.co.kr/learn/courses/30/lessons/42626)
    * 매운 음식을 만드는 조건을 통해 모든 음식을 일정 수치 이상으로 만드는 문제.
    * 우선순위 큐에 데이터를 저장하고 처음 2개의 데이터를 조건을 적용하여 계산후 다시 적용하여 조건에 맞는지 확인.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/heap/Heap42626.java)
  * [이중우선순위큐](https://programmers.co.kr/learn/courses/30/lessons/42628)
    * 명령어를 통해 큐에 숫자를 삽입, 최댓값을 삭제, 최솟값을 삭제한 후 [최댓값, 최솟값]을 리턴하는 문제.
    * 이중 우선순위 큐를 사용하여 해결.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/heap/Heap42628.java)
* 정렬
  * 정렬을 이용해서 문제를 효율적으로 풀어보세요.
  * 사용 클래스
    * java.util.Arrays
      * sort(data)
    * java.util.Collections
    * java.util.Comparator
  * [K번째수](https://programmers.co.kr/learn/courses/30/lessons/42748)
    * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하는 문제.
    * i, j 배열을 만들어 정렬 후 k 번째 수를 저장.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/sort/Sort42748.java)
  * [가장 큰 수](https://programmers.co.kr/learn/courses/30/lessons/42746)
    * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내는 문제.
    * 숫자를 문자로 변경해 더한 후 더 큰 수로 정렬.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/sort/Sort42746.java)
* 완전탐색
  * 무식해 보여도 사실은 최고의 방법일 때가 있지요.
  * 사용 클래스
    * java.util.ArrayList
    * java.util.List
      * add(value)
  * 추가 클래스
    * Math.max(value, value)
  * [모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840)
    * 수포자가 찍는 방식을 준 후 누가 더 문제를 많이 맞췄는지 리턴하는 문제.
    * 수포자가 찍는 방식을 통해 문젤르 푼 후 점수를 계산해 누가 더 많이 맞췄는지 구한 후 해결.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/brute_force_search/BruteForceSearch42840.java)
  * [카펫](https://programmers.co.kr/learn/courses/30/lessons/42842)
    * 안에 빨간색과 바깥쪽 브라운색으로 되어 있는 카펫에 크기를 구하는 문제.
    * 규칙을 찾은 후 규칙을 적용 시켜 문제를 해결.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/brute_force_search/BruteForceSearch42842.java)
* 탐욕법(Greedy)
  * 부분적인 최적해가 전체적인 최적해가 되는 마법!
  * 사용 클래스
    * java.util.Arrays
      * fill(data, value)
  * [체육복](https://programmers.co.kr/learn/courses/30/lessons/42862)
    * 체육복을 도난 당한 사람과 체육복을 여벌로 가져온 사람들 중 체육복을 앞뒤로 빌려준 후 얼마나 많은 사람이 체육 수업을 들을 수 있는 지 구하는 문제.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/greedy/Greedy42862.java)
    * 주의 사항 
      * 문제를 잘읽자!! (문제를 내 마음대로 생각하지 않기) ex) 체육복 도난을 2개로 생각..
* 동적계획법(Dynamic Programming)
  * 불필요한 계산을 줄이고, 효율적으로 최적해를 찾아야만 풀리는 문제들입니다.
  * [타일 장식물](https://programmers.co.kr/learn/courses/30/lessons/43104)
    * 규칙이 있는 타일들의 전체 둘레를 구하는 문제.
    * 피보나치 배열과 흡사하여 비슷하게 해결. 
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/dynamic_programming/DynamicProgramming43104.java)
    * 주의 사항
      * 타입을 맞춰 준다. ex) 배열을 long타입으로 하지않아 틀림.
  * [정수 삼각형](https://programmers.co.kr/learn/courses/30/lessons/43105)
    * 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중, 거쳐간 숫자의 합이 가장 큰 경우를 찾는다. 아래 칸으로 이동할 때는 대각선 방향으로 한 칸 오른쪽 또는 왼쪽으로만 이동 가능.
    * 규칙을 적용하여 전부 더 큰 수를 더하면서 내려오면서 마지막에 가장 큰 수를 확인하여 리턴.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/dynamic_programming/DynamicProgramming43105.java)
* 깊이/너비 우선 탐색(DFS/BFS)
  * 깊이/너비 우선 탐색을 사용해 원하는 답을 찾아보세요.
  * [타겟 넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)
    * n개의 음이 아닌 정수를 적절히 더하거나 빼서 타겟 넘버를 만드는 문제.
    * 재귀를 통해 해결.
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/dfs_bfs/DFS_BFS43165.java)
  * [네트워크](https://programmers.co.kr/learn/courses/30/lessons/43162)
    * 컴퓨터의 개수 n, 연결에 대한 정보가 담긴 2차원 배열 computers가 매개변수로 주어질 때, 네트워크의 개수를 return 
    * union find 알고리즘을 사용하여 해결하려 했지만 아직 **미해결**
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/dfs_bfs/DFS_BFS43162.java)
* 이분탐색
  * 이분탐색 기법을 이용해 효율적으로 값을 찾아보세요.
  * [예산](https://programmers.co.kr/learn/courses/30/lessons/43237)
    * 국가에 예산 최대치를 지방에 배정하는 문제.
    * 이분 탐색을 사용했지만 아직 **미해결**
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/binary_search/BinarySearch43237.java)
  * [입국심사](https://programmers.co.kr/learn/courses/30/lessons/43238)
    * 입국심사를 기다리는 사람 수 n, 각 심사관이 한 명을 심사하는데 걸리는 시간이 담긴 배열 times가 매개변수로 주어질 때, 모든 사람이 심사를 받는데 걸리는 시간의 최솟값을 return 
    * 이분 탐색을 사용했지만 아직 **미해결**
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/binary_search/BinarySearch43238.java)
