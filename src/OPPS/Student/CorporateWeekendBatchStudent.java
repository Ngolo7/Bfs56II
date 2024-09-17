package OPPS;

public class CorporateWeekendBatchStudent extends Student {
    // Constructor to initialize CorporateWeekendBatchStudent
    public CorporateWeekendBatchStudent(int studentId, String name, String mobileNumber, String address, String course) {
        super(studentId, name, mobileNumber, address, course);
    }

    @Override
    public double calculateFee() {
        // Corporate Weekend batch has an additional fee of 4000
        return super.calculateFee() + 4000.00;
    }
}
