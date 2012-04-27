import java.io.IOException;

public final class access_nsieve {

  private static int nsieve(int m, int isPrime[]){
    int i, k, count;

     for (i=2; i<=m; i++) { isPrime[i] = 1; }
     count = 0;

     for (i=2; i<=m; i++){
        if (isPrime[i] != 0) {
           for (k=i+i; k<=m; k+=i) isPrime[k] = 0;
           count++;
        }
     }
     return count;
  }

  private static int sieve() {
      int ret = 0;
      for (int i = 1; i <= 9; i++ ) {
          int m = (1<<i)*3000;
          int flags[] = new int[m+1];
          ret += nsieve(m, flags);
      }
      return ret;
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    System.out.println("" + sieve());
  }
}

