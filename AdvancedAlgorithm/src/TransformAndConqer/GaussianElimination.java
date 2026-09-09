
package TransformAndConqer;
// Deema Mohammed AL-Maqadma
public class GaussianElimination {

    public static void main(String[] args) {
        int n = 3;
        double[][] a = {
            {2, 3, -1, 5},
            {4, 4, -3, 3},
            {2, 3, 2, 7}
        };
        // Forward Elimination with Pivoting
        for (int i = 0; i < n; i++) {
            // Pivoting
            int maxRow = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(a[k][i]) > Math.abs(a[maxRow][i])) {
                    maxRow = k;
                }
            }
            // Swap rows
            double[] temp = a[i];
            a[i] = a[maxRow];
            a[maxRow] = temp;
            // Elimination
            for (int j = i + 1; j < n; j++) {
                double factor = a[j][i] / a[i][i];
                for (int k = i; k <= n; k++) {
                    a[j][k] -= factor * a[i][k];
                }
            }
        }
        // Back Substitution
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            x[i] = a[i][n];
            for (int j = i + 1; j < n; j++) {
                x[i] -= a[i][j] * x[j];
            }
            x[i] /= a[i][i];
        }
        // Output
        System.out.println("Solution:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.2f\n", i + 1, x[i]);
        }
    }
}


