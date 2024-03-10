class course {
   private String courseNumber;
   private String courseTitle;

   public void setCourseInfo(String number, String title) {
       this.courseNumber = number;
       this.courseTitle = title;
   }

   public String getCourseNumber() {
       return this.courseNumber;
   }

   public String getCourseTitle() {
       return this.courseTitle;
   }

   public void printInfo() {
       System.out.println("Course Information:");
       System.out.println("   Course Number: " + this.courseNumber);
       System.out.println("   Course Title: " + this.courseTitle);
   }
}