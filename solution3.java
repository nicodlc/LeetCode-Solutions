import java.util.*;
class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Haystack: ");
        String hay = scan.nextLine();
        System.out.print("Needle: ");
        String need = scan.nextLine();

        System.out.println(strStr(hay, need)); 
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
