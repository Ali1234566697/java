public class xpown {

    public static int calpower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==1){
            return 0;
        }
        int xpowernm1 = calpower(x, n-1);
        int xpowern = x * xpowernm1;
        return xpowern;

    }
    
    public static void main(String[] args) {
        int x=2,y=5;
        int ans = calpower(x, y);
        System.out.println(ans);
    }
}
