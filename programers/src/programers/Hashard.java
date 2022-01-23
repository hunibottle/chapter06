class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        boolean noanswer = false;
        int a, b, c, d, e;
        int sum;
        if(x>=10){
            if(x>=100){
                if(x>=1000){
                    if(x == 10000){
                        return answer;
                    }
                    a = x / 1000;
                    b = (x%1000) / 100;
                    c = (x%1000) % 100 /10;
                    d = (x%1000) % 100 % 10;
                    sum = a + b + c + d;
                    if(x%sum == 0){
                        return answer;
                    }else return noanswer;
                }
                a = x / 100;
                b = (x % 100) / 10;
                c = (x % 100) % 10;
                sum = a + b + c;
                if(x % sum == 0){
                    return answer;
                }else return noanswer;
            }
            a = x /10;
            b = x % 10 ;
            sum = a + b;
            if(x % sum == 0){
                return answer;
            }else return noanswer;
        }
        return answer;
    }
}