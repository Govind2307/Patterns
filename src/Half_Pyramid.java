 public class Half_Pyramid {
        public static void main(String args[]){

            for (int i =1;i<=5;i++){
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
            //Inverted Pyramid
            for (int i =5;i>=1;i--){
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            //Half pyramid turned 180
            int n = 4;
            for(int i=1;i<=n;i++){
                for(int j=1;j<= n-i;j++ ){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

