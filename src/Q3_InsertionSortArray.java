public class Q3_InsertionSortArray {
    public static void insertionSort(int array[]){
        int n=array.length;
        for (int j=1;j<n;j++){
            int key = array[j];
            int i=j-1;
            while ((i>-1)&&(array[i]>key)){
                array[i+1]=array[i];
                i--;
            }
            array[i+1]=key;

        }
    }
    public static void main(String[] args) {
        int[]arr1={9,1,22,34,55,67,24,12};
        System.out.printf(" Before Insertion Sort ");
        for (int i:arr1){
            System.out.printf(i+"");
        }
        System.out.printf("");
        insertionSort(arr1);
        System.out.printf(" After Insertion Sort ");
        for (int i:arr1){
            System.out.printf(i+"");
        }

    }
}
