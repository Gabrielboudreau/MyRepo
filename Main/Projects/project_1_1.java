public class project_1_1 {
    public static void sortArray(int[] myArr, int arrSize){
        for(int i = 0; i < arrSize; i++) {
            for(int j = 0; j < arrSize - 1; j++){
                if(myArr[j] < myArr[j + 1]){                  
                    int a = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = a;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("hi");
        int arr[] = {7, 4, 3, 9, 64, 984, 12, 89};
        sortArray(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        
    }

}
