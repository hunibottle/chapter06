class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0 ; phone_number.length(); i++){
            if(i< phone_number.length()-4){
                answer += "*";
            }else{
                answer += phone_number.charAt(i)
            }
        }
        return answer;
        //바꿈  
    }
}