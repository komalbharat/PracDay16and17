//Write static functions to return all permutations of a String using iterative method and
//Recursion method. Check if the arrays returned by two string functions are equal.

public class Static_Function {
    static void Recursion(char[] chars, int i, int j) {
        char temp = chars[i]; // swaping
        chars[i] = chars[j];
        chars[j] = temp;


    }
    private static void permutations(char[] chars , int currentIndex){
        if(currentIndex == chars.length -1){
            System.out.printf( String.valueOf(chars));
        }
        for (int i = currentIndex; i < chars.length; i++){
            Recursion(chars,currentIndex,i);
            permutations(chars,currentIndex+1);
            Recursion(chars,currentIndex,i);
        }
    }
    public static void findPermutations(String str){
        if (str == null || str.length() == 0){
            return;
        }
        permutations(str.toCharArray(),0);

    }
    public static void main(String[] args) {

    String str = "ABC";
    findPermutations(str);

    }
}
