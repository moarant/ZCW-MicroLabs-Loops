package io.zipcoder.microlabs.mastering_loops;


public class Numbers {



    public String oneToTen(){
        String output= "*** Output ***\n";
        String methodName= "oneToTen()\n";
        String filledString="";

        for (int i=1; i<=10; i++){
            if (i<=9){
                filledString= filledString +Integer.toString(i) + "\n";
            }
            else{
                filledString = filledString + Integer.toString(i);
            }
        }
        return output + methodName +  filledString;
    }

    public String oddNumbers(){
        String output= "*** Output ***\n";
        String methodName= "oddNumbers()\n";
        String filledString= "";

        for(int i=1; i<=20;i++){
            if(i%2==1 && i<=18){
                filledString= filledString + Integer.toString(i)+"\n";
            }
            else if (i%2==1 && i>18){
                filledString= filledString + Integer.toString(i);
            }
        }
        return output + methodName +filledString;
    }

    public String squares(){
        String output = "*** Output ***\n";
        String methodName= "squares()\n";
        String filledString= "";

        for(int i=1; i<=10;i++){
            if(i<=9){
                int answer= i*i;
                filledString= filledString +Integer.toString(answer)+ "\n";
            }
            else{
                int answer = i*i;
                filledString= filledString + Integer.toString(answer);
            }
        }

        return output + methodName+ filledString;
    }

    public String random4(){
        RandomNumberGenerator rng = new RandomNumberGenerator();
        String result = "";
        for(int i=0;i<4;i++) {
            int randomNumber = rng.randInt(0, 100);
            result += randomNumber;
        }

        int range = (10-1)+1;
        int randomNumber= (int)(Math.random()*range)+1;
        return Integer.toString(randomNumber);
    }

    public String even(int n){
        String output= "*** Output ***\n";
        String methodName= "even(" + n +")\n";
        String filledString= "";

        for(int i=1; i<n;i++){
            if (i%2 ==0 && i<=(n-3)) {
                filledString = filledString + Integer.toString(i) + "\n";
            }
            else if (i%2 ==0 && i>(n-3)){
                filledString = filledString + Integer.toString(i);

            }
        }




        return output +methodName + filledString;
    }

    public String powers(int n){
        String output= "*** Output ***\n";
        String methodName= "powers("+ n +")\n";
        String filledString= "";
        int answer= 1;

        for(int i=1; i<=n; i++) {
            if (i < n) {
                answer *= 2;
                filledString += Integer.toString(answer) + "\n";
            } else {
                answer *= 2;
                filledString += Integer.toString(answer);
            }
        }
        return output+ methodName +filledString;
    }



}
