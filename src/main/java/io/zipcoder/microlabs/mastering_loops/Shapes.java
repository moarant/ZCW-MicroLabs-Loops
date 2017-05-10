package io.zipcoder.microlabs.mastering_loops;


public class Shapes {

    public String triangle(){
        String output= "*** Output ***\ntriangle()";

        String filledString="";
        int i, j;
        for (i=1; i<=6; i++) {
            for(j=1;j<i;j++) {
               filledString +=("*");
            }
            if(i<=5){
            filledString+=("\n");
            }
        }
        return output + filledString;
    }

    public String tableSquare() {
        String output= "*** Output ***\ntableSquare()";
        String filledTable="";
        for (int i = 1; i <= 4; i++) {
            filledTable+= "\n";

            for (int j = 1; j <= 4; j++) {
                filledTable+= "|";
                int multiple = i * j;
                if (multiple <= 9) {
                    filledTable += "  " + multiple + " ";
                } else if (multiple >= 10) {
                    filledTable += " " + multiple+ " ";
                }
            }
                filledTable += "|";
        }


        return output +filledTable;
    }

    public String tableSquares(int n){
        String output= "*** Output ***\ntableSquares("+n +")";
        String filledTable="";
        for (int i = 1; i <= n; i++) {
            filledTable+= "\n";

            for (int j = 1; j <= n; j++) {
                filledTable+= "|";
                int multiple = i * j;
                if (multiple <= 9) {
                    filledTable += "  " + multiple + " ";
                } else if (multiple >= 10) {
                    filledTable += " " + multiple+ " ";
                }
            }
            filledTable += "|";
        }


        return output + filledTable;
    }
}
