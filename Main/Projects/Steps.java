public class Steps {
    public static double stepsToMiles(int steps) throws Exception {
        if (steps < 0) {
            throw new Exception("Exception: Negative step count entered");
        }
        return steps / 2000.0; 
    }
    public static void main(String[] args) {
        int step1 = 5345;
        int step2 = -3850;
        try {
            System.out.println(stepsToMiles(step1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } try {
            System.out.println(stepsToMiles(step2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
