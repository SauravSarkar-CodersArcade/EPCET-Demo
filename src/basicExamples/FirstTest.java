package basicExamples;

class FirstTest {
    public static void display(){
        System.out.println("CSE/ECE");
    }
    public static void main(String[] args) {
        char[] letters = {'E','P','C','E','T'};
        String str = new String(letters);
        System.out.println(str);
        display();
        for (char letter : letters){
            System.out.println(letter);
        }

        boolean result = (2>3) ? true : false;
        System.out.println(result);
        String res = (4>3) ? "Yes": "No";
        System.out.println(res);

    }
}
/** Doc String
 * default : inside class, outside class, inside package. (Package Private)
 * public : Accessible Globally
 * private Inside the class : own vehicle
 * protected : inside class, outside class, inside package, outside package(Yes) (Inheritance)
 * for (returnType var_name : array_name ) {
 *     statements.....
 * }
 * returnType var_name = (condition) ? 1st : 2nd; Ternary or conditional
James Gosling , 1995, Sun Micro Systems, Oracle
 Guido van Rossum, 1991

Web Series:  Monty Python Flying Circus
 */

