package io.zipcoder.microlabs.mastering_loops;


public class Numbers {



    public String oneToTen(){
        String output= "*** Output ***\n";
        String methodName= "oneToTen()\n";
        String number="";

        for (int i=1; i<=10; i++){
            if (i<=9){
                number= number +Integer.toString(i) + "\n";
            }
            else{
                number = number + Integer.toString(i);
            }
        }
        return output + methodName +  number;
    }

    public String oddNumbers(){
        return "";
    }

    public String squares(){
        return "";
    }

    public String random4(){
        return "";
    }

    public String even(int n){
        return "";
    }

    public String powers(int n){
        return "";
    }

}
