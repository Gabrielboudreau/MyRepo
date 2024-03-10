class OfferedCourse extends course {
    private String instructorName;
    private String location;
    private String classTime;

    public void setCourseInfo(String number, String title, String instructor, String location, String time) {
        super.setCourseInfo(number, title);
        this.instructorName = instructor;
        this.location = location;
        this.classTime = time;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public String getLocation() {
        return this.location;
    }

    public String getClassTime() {
        return this.classTime;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Instructor Name: " + this.instructorName);
        System.out.println("   Location: " + this.location);
        System.out.println("   Class Time: " + this.classTime);
    }
}