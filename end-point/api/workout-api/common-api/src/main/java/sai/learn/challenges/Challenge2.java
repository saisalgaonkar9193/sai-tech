package sai.learn.challenges;

public class Challenge2 {

    static int tempFactorial=1,number=2;


    public static void main(String[] args) {

        int factorial=36288;
        try {
            checkFactorial(factorial);
            System.out.println(factorial+" is a factorial of "+(number-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void checkFactorial(int factorial) throws Exception {

        while(true){
            tempFactorial*=number++;

            if(tempFactorial==factorial){
                break;
            }else if(tempFactorial>factorial){
                throw new Exception(factorial+" is NOT a factorial Number");
            }
        }


    }
}
