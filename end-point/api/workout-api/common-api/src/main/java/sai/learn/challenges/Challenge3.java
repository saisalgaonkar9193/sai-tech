package sai.learn.challenges;

public class Challenge3 {

    static int dice=6,face=6,sum=5;

    public static void main(String[] args) {
        try {
            checkIfSumPossible();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkIfSumPossible() throws Exception {
        if(sum<dice){
            throw new Exception(String.format("No combination Possible as SUM i.e. %d is less than no of DICE i.e. %d",sum,dice));
        }
    }
}
