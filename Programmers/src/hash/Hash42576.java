package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

// 완주하지 못한 선수

public class Hash42576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySolution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
		System.out.println(mySolution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "mislav", "ana"}));
	}
	
	public static String mySolution(String[] participant, String[] completion) {
		HashMap<String, Integer> map = new HashMap<>();
		int length = participant.length;
		for(int i = 0; i < length; ++i) {
			if(map.containsKey(participant[i])) {
				map.put(participant[i], map.get(participant[i]) + 1);
			} else {
				map.put(participant[i], 1);
			}
			
		}
		
		length = completion.length;
		
		for(int i = 0; i < length; ++i) {
			if(map.get(completion[i]) == 1) {
				map.remove(completion[i]);
			} else {
				map.put(completion[i], map.get(completion[i]) - 1);
			}
			
		}
		
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
	        return key;
	    }
		return null;
    }
	
	public String otherSolution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
	public String otherSolution2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for ( i=0; i<completion.length; i++){

            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
	
	public String otherSolution3(String[] participant, String[] completion) {
	      String answer = "";
	        HashMap<String, Integer> hm = new HashMap<>();
	        for(int i = 0; i < completion.length; i++){
	            if(hm.containsKey(completion[i])){
	                hm.put(completion[i], hm.get(completion[i])+1);
	            }else{
	                hm.put(completion[i], 1);
	            }
	        }
	        for(int i = 0; i < participant.length; i++){
	            if(hm.containsKey(participant[i])){
	                if(hm.get(participant[i]) > 0){
	                    hm.put(participant[i], hm.get(participant[i]) - 1);
	                }else{
	                    answer = participant[i];
	                    break;
	                }
	            }else{
	                answer = participant[i];
	                break;
	            }
	        }
	        return answer;
	    }

}
