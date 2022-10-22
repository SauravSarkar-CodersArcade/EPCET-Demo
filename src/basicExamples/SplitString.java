package basicExamples;

public class SplitString {
    public static void main(String[] args) {
        String jumbled = "I1Am1Learning1Java1Programming";
        String[] message = jumbled.split("1");
        System.out.println(message[0]);
        for (String word : message){
            System.out.print(word+" ");
        }
    }
}
