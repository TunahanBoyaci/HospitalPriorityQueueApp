package HospitalPriorityQueueApp;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Patient> emergencyQueue = new PriorityQueue<Patient>();

        emergencyQueue.add(new Patient("John","Burns"));
        emergencyQueue.add(new Patient("Olivia","Headache"));
        emergencyQueue.add(new Patient("Eva","Appendicitis"));
        emergencyQueue.add(new Patient("Amy","Burns"));
        emergencyQueue.add(new Patient("Nathan","Burns"));
        emergencyQueue.add(new Patient("Gary","Appendicitis"));

        int i = 1;

        while (emergencyQueue.isEmpty() != true){
            System.out.println("****************");
            System.out.println(i + ". place");
            System.out.println(emergencyQueue.poll());
            System.out.println("****************");
            i++;
        }

    }
}