import Exceptions.OutOfBound;
import Exceptions.SingularityException;

public class Arithmos{

    static Integer[] v = new Integer[25];
    static Integer i;
    static Integer aux= 0;

    public static String showArray(){
        String array="";
        for (i =0; i<v.length; i++){
            array = array +" " + v[i];
        }
        return array;
    }

    public static void random() {
        for(i=0; i<v.length; i++){
            v[i] = (int)(Math.random() * v.length);
        }
    }


    public static void bubbleAlgorithm(){
        for(i=0; i<v.length-1; i++){
            if(v[i] > v[i+1]){
                aux = v[i+1];
                v[i+1] = v[i];
                v[i] = aux;
                i=-1;
            }
        }
    }

    public static void binaryAlgorithm(Integer a) throws OutOfBound, SingularityException {
        if(a>v.length){
            throw new OutOfBound("Number can't exceed " + v.length);
        }
        if(a<0){
            throw new SingularityException("Number can't be negative");
        }
        Integer mid;
        Integer top=v.length-1;
        Integer bot=0;
        while(bot<=top){
            mid=(bot+top)/2;
            if(v[mid].equals(a)){
                System.out.println(" "+a+ " is in the " + mid + ordinal(mid) + " position of the array");
                break;
            }
            if(a<v[mid]){ top=mid-1; }
            if(a>v[mid]){ bot=mid+1; }
            if(bot.equals(top)&& !a.equals(mid)){ System.out.println(" Number doesn't exist in the array"); }
        }
    }

    public static String ordinal(Integer a){
        String position="";
        if(a%10 == 1 && a != 11){
            position="st";
        }
        if(a%10 == 2 && a!=12){
            position="nd";
        }
        if(a%10 == 3 && a !=13){
            position="rd";
        }
        if((a%10 != 3 && a%10 != 2 && a%10 != 1) || a==11 || a==12 || a==13){
            position="th";
        }
        return position;
    }


    public static void main(String[] args) {
        try{
            random();
            System.out.println(showArray());
            bubbleAlgorithm();
            System.out.println(showArray());
            binaryAlgorithm(22);
        }catch(OutOfBound | SingularityException e){
            System.err.println(e.getMessage());
        }
    }
}
