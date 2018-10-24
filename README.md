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
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/hash/Hash42576.java)
  * [전화번호 목록](https://programmers.co.kr/learn/courses/30/lessons/42577)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/hash/Hash42577.java)
* 스택/큐
  * LIFO, FIFO, push & pop! 스택과 큐를 이용해서 문제를 풀어보세요.
  * 사용 클래스
    * java.util.Stack
      * push(value) 해당 스택의 제일 상단에 전달된 요소를 삽입함.
      * peek() 해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환함.
      * pop() 해당 스택의 제일 상단에 있는(제일 마지막으로 저장된) 요소를 반환하고, 해당 요소를 스택에서 제거함.
  * [탑](https://programmers.co.kr/learn/courses/30/lessons/42588)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/stack/Stack42588.java)
  * [쇠막대기](https://programmers.co.kr/learn/courses/30/lessons/42585)
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
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/heap/Heap42626.java)
* 정렬
  * 정렬을 이용해서 문제를 효율적으로 풀어보세요.
  * 사용 클래스
    * java.util.Arrays
      * sort(data)
  * [K번째수](https://programmers.co.kr/learn/courses/30/lessons/42748)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/sort/Sort42748.java)
* 완전탐색
  * 무식해 보여도 사실은 최고의 방법일 때가 있지요.
  * 사용 클래스
    * java.util.ArrayList
    * java.util.List
      * add(value)
  * 추가 클래스
    * Math.max(value, value)
  * [모의고사](https://programmers.co.kr/learn/courses/30/lessons/42840)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/brute_force_search/BruteForceSearch42840.java)
* 탐욕법(Greedy)
  * 부분적인 최적해가 전체적인 최적해가 되는 마법!
  * 사용 클래스
    * java.util.Arrays
      * fill(data, value)
  * [체육복](https://programmers.co.kr/learn/courses/30/lessons/42862)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/greedy/Greedy42862.java)
    * 주의 사항 
      * 문제를 잘읽자!! (문제를 내 마음대로 생각하지 않기) ex) 체육복 도난을 2개로 생각..
* 동적계획법(Dynamic Programming)
  * 불필요한 계산을 줄이고, 효율적으로 최적해를 찾아야만 풀리는 문제들입니다.
  * [타일 장식물](https://programmers.co.kr/learn/courses/30/lessons/43104)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/dynamic_programming/DynamicProgramming43104.java)
    * 주의 사항
      * 타입을 맞춰 준다. ex) 배열을 long타입으로 하지않아 틀림.
* 깊이/너비 우선 탐색(DFS/BFS)
  * 깊이/너비 우선 탐색을 사용해 원하는 답을 찾아보세요.
  * [타겟 넘버](https://programmers.co.kr/learn/courses/30/lessons/43165)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/dfs_bfs/DFS_BFS43165.java)
* 이분탐색
  * 이분탐색 기법을 이용해 효율적으로 값을 찾아보세요.
  * [예산](https://programmers.co.kr/learn/courses/30/lessons/43237)
    * [코드](https://github.com/blind180915/programmers/blob/master/Programmers/src/binary_search/BinarySearch43237.java)
