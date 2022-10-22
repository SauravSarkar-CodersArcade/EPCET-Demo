package interviewQuestions;

public class StringTask {
    public static void main(String[] args) {
        String str = "EPCET COLLEGE";
        //System.out.println(str.replaceAll("C", ""));
        char character = 'C';
        removeChar(str, character);

    }
    public static void removeChar(String str, char c){
        int n = str.length();

        String finalStr = "";
        for (int i=0; i<n; i++){
            if (str.charAt(i) != c){
                finalStr = finalStr + str.charAt(i); // Concatenation
            }
        }
        System.out.println(finalStr);

    }
}
