public class revstring {
    public static void printrev(String str, int idx){
        if(idx < 0){
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "Hello World";
        printrev(str, str.length()-1);
    }
}
