public class project_1_2 {

    public static int getWordFrequency(String wordsList[], int listSize, String currWord){
        
        //First loop iterates word by word and sets currWord to the associated word in the list. It also resets rep
        for(int i = 0; i < listSize;i++ ){
            currWord = wordsList[i].toLowerCase();
            int rep = 1; //counter for word repetition

            // Checks all words backwards to see if currWord repeats. Increases rep by the repetitions
            for(int j = i; j >= 0; j--){
                String temp = wordsList[j].toLowerCase();
                if (currWord == temp){
                    rep++;
                }
                
            }
            //prints word by word as well as it's repetitions
            System.out.println(wordsList[i] + " " + rep);
        }
        
        return 0; //close
    }
    public static void main(String[] args) {
        String arr[] = {"Hi", "Hello", "hi", "Greetings", "greetings"}; //input array
        getWordFrequency(arr, arr.length, arr[0]);
    }
}
