public class halfPtrn {
    public static void main(String[] args) {

        for(int i =0;i<4;i++){
            for(int j=0;j<4-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i =5;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =1;i<5;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("Floyd's Triangle");
        int temp=1;
        for(int i =1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }

        System.out.println("0 and 1 Triangle");
        int temp2=0;
        for(int i =1;i<6;i++){
            for(int j=1;j<=i;j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
