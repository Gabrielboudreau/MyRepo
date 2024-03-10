public class courserun {
    public static void main(String[] args) {
        course course1 = new course();
        course1.setCourseInfo("ECE287", "Digital Systems Design");
        course1.printInfo();

        System.out.println();

        OfferedCourse course2 = new OfferedCourse();
        course2.setCourseInfo("ECE387", "Embedded Systems Design", "Mark Patterson", "Wilson Hall 231", "WF: 2-3:30 pm");
        course2.printInfo();
    }
}