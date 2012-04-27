import java.io.IOException;
import java.lang.Math;

public final class partial_sums {

  private static void partial(int n){
      double a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0;
      double twothirds = 2.0/3.0;
      double alt = -1.0;
      double k2 = 0, k3 = 0, sk = 0, ck = 0;
      
      for (int k = 1; k <= n; k++){
          k2 = k*k;
          k3 = k2*k;
          sk = Math.sin(k);
          ck = Math.cos(k);
          alt = -alt;
          
          a1 += Math.pow(twothirds,k-1);
          a2 += Math.pow(k,-0.5);
          a3 += 1.0/(k*(k+1.0));
          a4 += 1.0/(k3 * sk*sk);
          a5 += 1.0/(k3 * ck*ck);
          a6 += 1.0/k;
          a7 += 1.0/k2;
          a8 += alt/k;
          a9 += alt/(2*k -1);
      }
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    for (int i = 1024; i <= 16384*50; i *= 2) {
        partial(i);
    }
  }
}


