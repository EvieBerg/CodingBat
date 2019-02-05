public class runner {
    //loneTeen
    public boolean loneTeen(int a, int b) {
        boolean ax = ( a > 12 && a < 20);
        boolean bx = ( b > 12 && b < 20);

        if(ax == true && bx == true){
            return false;
        }
        if(ax == true && bx == false){
            return true;
        }
        if(ax == false && bx == true){
            return true;
        }
        if(ax == false && bx == false){
            return false;
        }
        return false;
    }

    //warm up 2 countxx
    int countXX(String str) {
    int count = 0;
    String xx = "xx";
    for(int i = 0; i < (str.length() - 1); i++){
        if(str.substring(i, i+2).equals(xx)){
            count++;
        }
    }
    return count;
}

    //string1 helloName
    public String helloName(String name) {
        return("Hello " + name + "!");
    }

    //logic1 nearTen
    public boolean nearTen(int num) {
        if(num % 10 <= 2){
            return true;
        }
        if(num % 10 >= 8){
            return true;
        }
        if(num % 10 > 2){
            return false;
        }
        if(num % 10 < 8){
            return false;
        }
        return false;
    }

    //string2 repeat end
    public String repeatEnd(String str, int n) {
        String rr = "";
        String x = str.substring(str.length() - n, str.length());
        for(int i = 0; i < n; i++){
            rr = rr + x;
        }
        return(rr);
    }

    //array1 makeEnds
    public int[] makeEnds(int[] nums) {
        int[] x = new int[2];
        int howLong = nums.length;
        x[0]= nums[0];
        x[1] = nums[howLong - 1];
        return x;
    }

    //array 2 only14
    public boolean only14(int[] nums) {
        int leg = nums.length;
        for(int i = 0; i < (leg); i ++){
            if( nums[i] != 1 && nums[i] != 4){
                return false;
            }
        }
        return true;
    }

    //logic 2 blackjack
    public int blackjack(int a, int b) {
        if(a <= 21 && a > b ){
            return a;
        }
        if(b <= 21 && a < b ){
            return b;
        }
        if(b > 21 && a > 21 ){
            return 0;
        }
        if (a > 21){
            return b;
        }
        if (b > 21){
            return a;
        }
        return a;
    }

    //string3 gHappy
    public boolean gHappy(String str) {
        boolean answer = true;
        for(int i = 1; i < str.length() - 1; i++){
            String s1 = str.substring(i,i+1);
            String s2 = str.substring(i+1,i+2);
            String s3 = str.substring(i-1,i);
            if(s1.equals("g") && !s2.equals("g") && !s3.equals("g")){
                answer = false;
            }
        }
        if (str.length() > 1){
            String last = str.substring(str.length() - 1);
            String penultimate = str.substring(str.length()-2,str.length() - 1);
            if(last.equals("g") && !penultimate.equals("g")){
                answer = false;
            }
        }
        if (str.length() == 1){
            answer = false;
        }
        return answer;
    }

    //array3 linearIn
    public int countClumps(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1] && (i ==0 || nums[i] != nums[i-1])){
                count++;
            }
        }
        return count;
    }

}
