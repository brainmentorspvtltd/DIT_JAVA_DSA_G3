public class LabeledLoops {
    public static void main(String[] args) {
        outer: // this is a label
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                  //break outer;
                     continue outer; // skip the i iteration
                }
                System.out.println("I is "+i +" and j is "+j);
            }
        }
    }
}
