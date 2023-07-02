import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("x: ");
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static boolean isPalindrome(int x) {
        int og = x;
        int rev = 0;
        while(x > 0){
            int last = x%10;
            rev = rev*10 + last;
            x = x/10;
        }
        if(rev == og){
            return true;
        }
        else{return false;}
    }
}
