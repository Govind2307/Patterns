public class Number_pyramid {
    public static void main(String args[]){
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //Inverted
        for(int i = 5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        int number = 1;
        for(int i = 1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
