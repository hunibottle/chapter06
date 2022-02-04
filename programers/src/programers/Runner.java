package programers;

public class Runner {
	
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		String answer = "";
		String temp = participant[0];
	    int count = 0;  
	        for(int i = 0 ; i < participant.length ; i++){
	            for(int j = 0 ; j < completion.length ; j++) {
	            	if(participant[i] == completion[j]) {
	            		count++;
	            	}
	            	
	            }
	            if(count == 0) {
        			temp = participant[i];
        		}
	            count = 0;
	        }
	        answer = temp;
		System.out.println(answer);
		
	}

}
