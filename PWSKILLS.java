public class PWSKILLS {
    public static void main(String[] args) {
        int n=11;
        for (int i = 0; i < n; i++) {
            // This inner loop prints P
            for (int j = 0; j < n; j++) {
                if(j==0||i==0&&j>0&&j<n-1||j==n-1&&i<(n-1)/2&&i>0||i==(n-1)/2&&j<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            // This inner loop prints W
            for(int k=0; k<n; k++){
                    if(k==0||k==n-1||i+k==n-1&&i>=(n-1)/2||i==k&&i>(n-1)/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            // This inner loop prints S
            System.out.print("   ");
            for(int k=0; k<n; k++){
                if(i==0&&k>0 || k==0&&i>0&&i<(n-1)/2 || i==(n-1)/2&&k>0&&k<n-1 || k==(n-1)&&i>(n-1)/2&&i<n-1 || i==n-1&&k<n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
        }
        // This Inner loop prints K
        System.out.print("  ");
        for(int j=0; j<n; j++){
            if (j==0||i+j==(n)/2||i-j==(n)/2) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        // This loop Prints I
        for(int j=0; j<n; j++){
            if (i==0 || i==n-1 || j==(n-1)/2) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        // This Inner loop prints I
        for(int j=0; j<n; j++){
            if (i==0 || i==n-1 || j==(n-1)/2) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.print("  ");
        // This inner loops Prints L
        for(int j=0; j<n; j++){
            if(j==0 || i==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        // This inner loop Prints S
        System.out.print("  ");
        for(int k=0; k<n; k++){
            if(i==0&&k>0 || k==0&&i>0&&i<(n-1)/2 || i==(n-1)/2&&k>0&&k<n-1 || k==(n-1)&&i>(n-1)/2&&i<n-1 || i==n-1&&k<n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
    }
            System.out.println();
        }
    }
}
