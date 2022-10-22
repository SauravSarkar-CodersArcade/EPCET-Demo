package interviewQuestions;

public class Patient {
    String patientName;
    int patientAge;
    String doa; //(dateOfArrival)
    String disease;
    Information info;
    public Patient(String patientName, int patientAge, String doa, String disease, Information info){
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doa = doa;
        this.disease = disease;
        this.info = info;
    }
    void patientDetails(){
        System.out.println("Patient Details: ");
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("DateOfArrival: " + this.doa);
        System.out.println("Disease: " + this.disease);
        System.out.println("Admission Information: ");
        System.out.println("Block No: " + this.info.blockNo);
        System.out.println("Floor No: " + this.info.floorNo);
        System.out.println("Room No: " + this.info.roomNo);
        System.out.println("Bed No: " + this.info.bedNo);
    }
}
class PatientDetails{
    public static void main(String[] args) {
        Information info1 = new Information("A", 3, 301, 2);
        Information info2 = new Information("B", 5, 502, 10);
        Patient p1 = new Patient("ABC", 23, "12/10/22", "Malaria", info1);
        Patient p2 = new Patient("PQR", 33, "16/10/22", "SARS-COVID-19", info2);
        p1.patientDetails();
        p2.patientDetails();
    }
}
