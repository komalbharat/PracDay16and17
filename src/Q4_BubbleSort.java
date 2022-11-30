//Bubble Sort in java
public class Q4_BubbleSort {
    static void bubbleSort(int[]arr){
        int n = arr.length;
        int temp =0;
        for(int i=0;i<n;i++){
            for (int j=1;j<(n-1);j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j]=temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        int arr[] ={3,22,33,29,29,90};
        System.out.printf(" Array Before Bubble Sort \n ");
        for (int i=0;i<arr.length;i++){
            System.out.printf(arr[i] +""+"\n");
        }
        System.out.printf("");
        bubbleSort(arr);  //sorting array elements using bubble sort
        System.out.printf(" Array After Bubble Sort \n ");
        for (int i=0;i<arr.length;i++){
            System.out.printf(arr[i]+ "\n");
        }

    }
}
