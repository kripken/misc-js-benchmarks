import java.io.IOException;
import java.lang.Math;

public final class threed_morph {

  private static final int loops = 15;
  private static final int nx = 4000;
  private static final int nz = 120;

  private static double a[] = new double[nx*nz*3];

  private static void morph(double f) {
      double PI2nx = Math.PI * 8/nx;
      double f30 = -(50 * Math.sin(f*Math.PI*2));
      
      for (int i = 0; i < nz; ++i) {
          for (int j = 0; j < nx; ++j) {
              a[3*(i*nx+j)+1]    = Math.sin((j-1) * PI2nx ) * -f30;
          }
      }
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    for (int i = 0; i < loops; ++i) {
        morph(((double)i)/(double)loops);
    }
    double testOutput = 0;
    for (int i = 0; i < nx*nz*3; i++)
        testOutput += a[i];
    System.out.println("" + testOutput);
  }
}


