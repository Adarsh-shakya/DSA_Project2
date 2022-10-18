public class QuickSort {
    public static void quickSort(int [] arr, int start, int end){
    if(start<end){
        int pivot = position(arr,start,end);
        quickSort(arr,start, pivot-1);
        quickSort(arr,pivot+1,end);
    }
    }
    public static int position(int []arr, int p, int q){
        int pivot = q;
        int i = p-1;
        for(int j = p; j<=q; j++){
            if(arr[j]<=arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
    public static void displayArr(int [] arr){
        for(int res: arr){
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        int []arr = new int[]{56, 1, 0, 35, 89, 102, 65, 45};
        quickSort(arr,0,arr.length-1);
        displayArr(arr);
    }
}
