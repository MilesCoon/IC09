public class Main {
    public static void main(String[] args) {
        System.out.println("productOfEvens:");
        System.out.println(productOfEvens(3));

        System.out.println("\nfunkyHeader");
        funkyHeader(8);

        System.out.println("\nhowManyDigitsMatch");
        System.out.println(howManyDigitsMatch(12398123,120398902));
    }

    public static int productOfEvens(int n) {
        if (n <= 0) { throw new IllegalArgumentException("n must be greater than 0"); }
        else if (n == 1) {return 2*n; }
        else {
            n = n * (productOfEvens(n - 1));
            return 2*n;
        }
    }

    public static void funkyHeader(int n) {
        if (n < 1) { throw new IllegalArgumentException("n must be greater than 0"); }
        else if (n==1) {
            System.out.print("*");
        }
        else if (n==2) {
            System.out.print("**");
        }
        else {
            System.out.print("<");
            funkyHeader(n-2);
            System.out.print(">");
        }
    }

    public static int howManyDigitsMatch(int n1, int n2) {
        int count = 0;
        int d1 = n1 % 10;
        int d2 = n2 % 10;
        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("Both numbers must be positive");
        } else if (n1 == 0 || n2 == 0) {
            return count;
        } else if (d1 == d2) {
            count++;
        }
        n1 /= 10;
        n2 /= 10;
        return count + howManyDigitsMatch(n1, n2);
    }
}