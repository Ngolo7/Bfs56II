package OPPS;

public class CorporateBatchStudent extends Student {
    //constructor to initialize CorporateBatchStudent
    public CorporateBatchStudent(int studentId, String name, String mobileNumber, String address, String course) {
        super(studentId, name, mobileNumber, address, course);
    }

    @Override
    public double calculateFee() {
            return super.calculateFee()+ 3000.00;
    }
}
