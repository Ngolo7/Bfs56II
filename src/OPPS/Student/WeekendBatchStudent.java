package OPPS;

public class WeekendBatchStudent extends Student{
    public WeekendBatchStudent(int studentId, String name, String mobileNumber, String address, String course) {
        super(studentId, name, mobileNumber, address, course);
    }

    public double CalculateFee(){
        return super.calculateFee() * 1.2;
    }
}
