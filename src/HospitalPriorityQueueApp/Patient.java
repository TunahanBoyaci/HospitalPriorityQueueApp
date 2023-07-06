package HospitalPriorityQueueApp;

public class Patient implements Comparable<Patient> {

    private String name;
    private String disease;
    private int priority;

    public Patient (String name, String disease) {
        this.name = name;
        this.disease = disease;

        if (disease.equals("Appendicitis")){
            this.priority = 3;
        }
        else if (disease.equals("Burns")){
            this.priority = 2;
        }
        else {
            this.priority = 1;
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Name:'" + name + '\'' +
                ", Disease='" + disease + '\'' +
                ", Priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Patient patient) {
        if (this.priority > patient.priority) {
            return -1;
        }
        else if (this.priority < patient.priority){
            return 1;
        }
        else {
            return 0;
        }
    }
}