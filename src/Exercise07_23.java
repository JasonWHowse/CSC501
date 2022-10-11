import java.util.Arrays;
public class Exercise07_23 {
    private static boolean[] lockers;

    private static void studentFlip(int studentIndex){
        for(int c = studentIndex; c<Exercise07_23.lockers.length;c=c+studentIndex+1){
            Exercise07_23.lockers[c] = !Exercise07_23.lockers[c];
        }
    }

    public static boolean[] getLockers(){
        return Exercise07_23.lockers;
    }

    public static void setLockers(int lockerCount, int studentCount){
        Exercise07_23.lockers = new boolean[lockerCount];
        Arrays.fill(Exercise07_23.lockers, false);
        for(int c = 0; c<studentCount; c++){
            Exercise07_23.studentFlip(c);
        }
    }
}

class TestingExercise07_23{
    public static void main(String[] args) {
        Exercise07_23.setLockers(100,100);
        for(int c = 0; c< Exercise07_23.getLockers().length; c++){
            if(Exercise07_23.getLockers()[c]) {
                System.out.println("Locker L" + (c + 1) + " is open");
            }
        }
    }
}

