package sorting;

public class SelectionSort {
    public static void printt(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr ={5,2,7,1,3};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printt(arr);
    }
}
