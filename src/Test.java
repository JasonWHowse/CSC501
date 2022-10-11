import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        boolean[] locker = new boolean[100];// boolean[] default is false

//        for (int i = 0; i < locker.length; i++) {
//            locker[i] = false;




        int numOfStudent, numOfLock = 100;
        numOfStudent = numOfLock;

        for (numOfStudent = 0; numOfStudent < locker.length; numOfStudent++) {// loop for each student
            int s = numOfStudent + 1;
            for (numOfLock = numOfStudent; numOfLock < locker.length; numOfLock+=numOfStudent+1) { // each student visiting multiple lockers
                int lock = numOfLock + 1;
                System.out.println("student " + s + " visited locker " + lock);
            }}}}