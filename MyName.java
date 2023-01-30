public class MyName {
    public static void main(String[] args) {
        int n=11;
        // My Name is KARAN
        for(int i=0; i<n; i++){
            // Prints K
            for(int j=0; j<n; j++){
                if (j==0||i+j==(n)/2||i-j==(n-1)/2) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            // Prints A
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j == 0 && i > 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i > 0 || i == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Prints R
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j==0 ||i==0&&j>0&&j<n-1 || j==n-1&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<n-1 ||i>=(n-1)/2&&i-j==1) {
                    System.out.print("*");
                }                
                else{
                    System.out.print(" ");
                }
            }
               // Prints A
               System.out.print("  ");
               for (int j = 0; j < n; j++) {
                   if (j == 0 && i > 0 || i == 0 && j > 0 && j < n - 1 || j == n - 1 && i > 0 || i == (n - 1) / 2) {
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
               }
                  // Prints n
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (j==0 || j==n-1 || i==j) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}
