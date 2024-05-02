public class StringOperations{
    public static void main(String[] args){
        String str="malayalam"
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        String str1=reverse(str);
        if(str.equals(str1))
        return true;
        else
        return false;
    }

    public static String reverse(String str){
        char[] ch=str.toCharArray();
        String str1="";
        for(intv i=0;i<ch.length;i++){
            str1=ch[i]+str;
        }
        retrun str1;
    }
}