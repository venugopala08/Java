public class MergeSort {
    public static void main(String[] args){
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Unsorted array: ");
        for (int num : arr){
            System.out.print(num + " ");
        }


        mergesort(arr,0,arr.length-1);


        System.out.println("Sorted array: ");
        for (int num : arr){
            System.out.print(num + " ");
        }   
    }

    public static void mergesort(int[] arr,int left,int right){
        if(left < right){
            int mid = (left+right)/2;
            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);
                
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        
        int n1 = mid-left+1;
        int n2 = right-mid;

        int []larr = new int[n1];
        int []rarr = new int[n2];
        int i=0,j = 0;
        int k = left;

        for(int x = 0 ;x<n1;x++){
            larr[x] = arr[left+x];
        }
        for(int x =0;x<n2;x++){
            rarr[x] = arr[mid+1+x];
        }

        while(i < n1 && j< n2){
            if(larr[i] <= rarr[j]){
                arr[k] = larr[i];
                i++;              
            }
            else{
                arr[k]= rarr[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }  
}
