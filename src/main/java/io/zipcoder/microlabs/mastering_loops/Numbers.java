package io.zipcoder.microlabs.mastering_loops;


public class Numbers {


    public String oneToTen() {
        String output = "*** Output ***\n" + "oneToTen()";

        String filledString = "";

        for (int i = 1; i <= 10; i++) {
                filledString += "\n"+ i ;

        }
        return output + filledString;
    }


    public String oddNumbers() {
        String output = "*** Output ***\n"+ "oddNumbers()";
        String filledString = "";

        for (int i=1; i<=20;i+=2){
            filledString+= "\n"+i;
        }
        return output + filledString;
    }


    public String squares() {
        String output = "*** Output ***\n" +"squares()";
        String filledString = "";

        for (int i = 1; i <= 10; i++) {
                int answer = i * i;
                filledString += "\n"+ answer;

        }

        return output + filledString;
    }


    public String random4() {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomNumber = rng.randInt(0, 100);
            result += randomNumber;
        }

        int range = (10 - 1) + 1;
        int randomNumber = (int) (Math.random() * range) + 1;
        return Integer.toString(randomNumber);
    }


    public String even(int n) {
        String output = "*** Output ***\n"+"even(" + n + ")";
        String filledString = "";

        for (int i = 2; i < n; i+=2) {
                filledString += "\n" + i;

        }

        return output + filledString;
    }


    public String powers(int n) {
        String output = "*** Output ***\n"+ "powers(" + n + ")";
        String filledString = "";
        int answer = 1;

        for (int i = 1; i <= n; i++) {
                answer *= 2;
                filledString += "\n"+answer ;

        }
        return output + filledString;
    }


}
