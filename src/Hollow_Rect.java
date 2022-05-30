public class Hollow_Rect {
    public static void main(String args[]){
        int m = 4;
        int n = 5;
        //Outer loop
        for(int i=1;i<=m;i++){
            //Inner loop
            for(int j =1;j<=n;j++){
                if(i==1||i==m||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
