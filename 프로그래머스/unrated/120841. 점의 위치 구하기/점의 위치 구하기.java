class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        
        if(x > 0) {
            if(y < 0) 
                answer = 4;
            else 
                answer = 1;
        }
        else {
            if(y < 0) 
                answer = 3;
            else
                answer = 2;
        }
        return answer;
    }
}