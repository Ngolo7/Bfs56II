package OPPS;

public class FastTrackBatchStudent extends Student {
    // Constructor to initialize FastTrackBatchStudent
    public FastTrackBatchStudent(int studentId, String name, String mobileNumber, String address, String course) {
        super(studentId, name, mobileNumber, address, course);
    }

    @Override
    public double calculateFee() {
        // FastTrack batch has additional fee
        return super.calculateFee() + 2000.00;
    }
}
