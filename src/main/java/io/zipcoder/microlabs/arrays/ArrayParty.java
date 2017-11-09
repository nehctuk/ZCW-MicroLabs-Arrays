package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    String example =
            "Example\n" +
            "1: String [] breakfast = {\"Sausage\", \"Eggs\", \"Beans\",\n" +
            "\"Bacon\", \"Tomatoes\", \"Mushrooms\"};";

    public String printArray(String[] inputArray){
        String output = "*** Output ***";

        for (String aString:inputArray) {
            output += "\n"+aString;
        }
        return output;
    }

    public String lastElement(String[] inputArray){
        return inputArray[inputArray.length-1];
    }

    public String lastButOne(String[] inputArray){
        return inputArray[inputArray.length-2];
    }

    public String reverse(String[] inputArray) {
        String output = "*** Output ***";
        for (int x = inputArray.length-1; x>=0; x--) {
            output+="\n"+inputArray[x];
        }
        return output;
    }

    public boolean isPalindrome(String[] inputArray) {
        ArrayParty arrayParty = new ArrayParty();
        if (arrayParty.printArray(inputArray).equals(arrayParty.reverse(inputArray))) {
            return true;
        }
        else {
            return false;
        }
    }

    public String compress(int[] inputArray) {
        String output = "*** Output ***";
        boolean isNew = true;
        output+="\n"+inputArray[0];
        for(int x = 0; x<=inputArray.length-2;x++) {
            if (inputArray[x]!=inputArray[x+1]){
                output+="\n"+inputArray[x+1];
            }
        }
        return output;
    }

    //TODO Define the method pack
    public String pack(char[] inputArray) {
        String output = "*** Output ***\n";

        for (int x=0; x<=inputArray.length-2;x++) {
            output += inputArray[x];
            if (inputArray[x] != inputArray[x+1]) {
                output += ", ";
            }

        }
        output += inputArray[inputArray.length-1];
        return output;
    }



}
