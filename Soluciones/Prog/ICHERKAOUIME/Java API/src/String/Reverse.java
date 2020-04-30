package String;

public class Reverse {
    private String original;
    private char[] reversed;

    Reverse(String original){
        this.original=original;
        reversed = new char[original.length()];
    }

    public char[] reverseString(){
        for(int i=0; i<original.length();i++){
            reversed[(original.length()-1)-i] = original.charAt(i);
        }
        return reversed;
    }
}
