public class Matrix {
    public static void main(String[] args){
        int n = 3;
        Integer[][] a = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n* i + j;
            }
        }
        System.out.println("Матрица начальная");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int next = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = next;
            }
        }

        System.out.println();
        System.out.println("Новая матрица");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
