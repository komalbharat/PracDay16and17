import java.util.*;
public class Q5_MergeSortString {
    public static void main(String[] args) {
        String[] list1 = { "Komal", "Priti", "Sonal", "Dolly", "Chhaya", "Mayur", "Joty.", "Isha" };
        String[] list2 = { "Minle", "Kitty", "Mady", "Miley", "Zeba", "Cristy", "Bably", "Avi", "Rani", "Manisha" };
        String[] sort1 = new String[list1.length + list2.length];
        mergeSort(list1);
        mergeSort(list2);
        merge(sort1, list1, list2);
        mergeSort(sort1);
//Arrays.sort(names);
        for (String Sort: sort1) {
            System.out.println(Sort);
        }
    }
    public static void mergeSort(String[] sort1) {
        if (sort1.length > 1) {
            String[] leftGo = new String[sort1.length / 2];
            String[] rightGo = new String[sort1.length - sort1.length / 2];
            for (int so = 0; so < leftGo.length; so++) {
                leftGo[so] = sort1[so];
            }
            for (int ki = 0; ki < rightGo.length; ki++) {
                rightGo[ki] = sort1[ki + sort1.length / 2];
            }
            mergeSort(leftGo);
            mergeSort(rightGo);
            merge(sort1, leftGo, rightGo);
        }
    }
    public static void merge(String[] nameH, String[] leftH, String[] rightH) {
        int as = 0;
        int bs = 0;
        for (int i = 0; i < nameH.length; i++) {
            if (bs >= rightH.length || (as < leftH.length && leftH[as].compareToIgnoreCase(rightH[bs]) < 0)) {
                nameH[i] = leftH[as];
                as++;
            } else {
                nameH[i] = rightH[bs];
                bs++;
            }
        }
    }

    }

