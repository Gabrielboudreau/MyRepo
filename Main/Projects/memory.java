public class memory {
    public static int multiply(int num1, int num2){
        int total = (num1 * num2);
        return total; 
    }
    public static void main(String[] args){
        Integer number1 = 5; 
        Integer number2 = 2;
        System.out.println(multiply(number1, number2));
        number2 = number1; 
    }
}
