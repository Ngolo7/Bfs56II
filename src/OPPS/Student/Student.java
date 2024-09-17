package OPPS;

public class Student {
    private int studentId;
    private String name;
    private String mobileNumber;
    private String address;
    private String course;

    // Constructor
    public Student(int studentId, String name, String mobileNumber, String address, String course) {
        this.studentId = studentId;
        setName(name);
        setMobileNumber(mobileNumber);
        this.address = address;
        this.course = course;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCourse() {
        return course;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.length() > 15) {
            System.out.println("Name must not be empty and should not exceed 15 characters.");
        }
        this.name = name;
    }

    public void setMobileNumber(String mobileNumber) {
        if (mobileNumber == null || !mobileNumber.matches("\\d{10}")) {
           System.out.println("Mobile number must be exactly 10 digits.");
        }
        this.mobileNumber = mobileNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Method to calculate the fee (to be overridden by child classes)
    public double calculateFee() {
        switch (course.toLowerCase()) {
            case "data science":
                return 6000.00;
            case "ai and ml":
                return 7000.00;
            case "cyber security":
                return 6500.00;
            case "blockchain":
                return 7500.00;
            default:
                return 5000.00;

        }
    }
}
