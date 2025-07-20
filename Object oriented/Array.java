public class Array {
    public static void main(String[] args){
        int nums[] = {9,8,7,6};

        int num [] = new int[5];
        num [0] = 3;
        num [1] = 5;
        num[2] = 6;
        num[3] = 2;
        num[4] = 8;

        for (int i = 0; i<=3; i++){
            System.out.println("the arrayvalus are :" + nums[i]);
        }
        for (int i = 0; i<5; i++){
            System.out.println("the array values are :" + num[i]);
        }


        //  multidimensional array

        int numm[][] = new int[3][4];

        // initializing the array with random values
        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){

                numm[i][j] = (int) (Math.random() *10);
            }
        } 

        for (int i=0; i<3; i++){
            for (int j=0; j<4; j++){
                
                System.out.print(numm[i][j]+" ");
            }
            System.out.println();
        } 


        // Enhanced for loop
        System.out.println("Using enhanced for loop:");

        for (int n[] : numm){
            for (int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }


        System.out.println("\n\n");

        // Jagged array
        System.out.println("Jagged array:");

        int jagged[][] = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[4];
        jagged[2] = new int[2];

        for (int n[] : jagged){
            for (int m:n){
                m = (int) (Math.random() * 10); //we can directly assign random values here . no need to initialize at begining with 2 loops
                System.out.print(m + " ");
            }
            System.out.println();
        }


        // three dimensional array
        System.out.println("Three dimensional array:");
        int threeD[][][] = new int[2][3][4];

        for (int i = 0; i<2; i++){
            for (int j=0; j<3; j++){
                for (int k=0; k<4; k++){
                    threeD[i][j][k] = (int) (Math.random()*10); // assigning random values
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
