public class recurr {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int fact_nm1 = factorial(n - 1);
        int fact_n = fact_nm1 * n;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
