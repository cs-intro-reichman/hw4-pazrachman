public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        int precent = 0;
        int count = 0;

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;

                }
            }
        }
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
                System.out.println(" " + i);
            }

        }

        precent = (int) ((double) count / n * 100);
        System.out.println("There are " + count + " primes between 2 and " + n + ".(" + precent + "% are primes)");
    }

}
