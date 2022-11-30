//Binary Search the Word from Word List
public class Q2_BTS_SearchStr {


    static int Bsearch(String[] wordList , String x){
        int l = 0, r = wordList.length - 1;
        while (l<=r){
            int m=l +(r-1)/2;
            int res = x.compareTo(wordList[m]);
            if(res ==0)
                return m;
            if(res > 0)
                l= m+1;
            else
                r=m-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] wordList = {"Nashik", "Pune","Mumbai","Aurangabad"};
        String x = "Pune";
        int result = Bsearch(wordList ,x);

        if (result == -1)
            System.out.printf(" Element is not Present \n" );
        else
            System.out.printf(" Element Found at index \n" + result);
    }
}
