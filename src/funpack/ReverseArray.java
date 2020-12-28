package funpack;

public class ReverseArray {
    public static void main(String []args){
        double[] a = {2.3, 4.6, 3.2};
        int N = a.length;

        for (int i = 0; i < N/2; i++)
        {
            double temp = a[i]; // get the current element 2.3
            a[i] = a[N-1-i]; // get the last element and set it to the current 3.2
            a[N-i-1] = temp; // set the current element to the last element 2.3
        }

        for (double v : a) {
            System.out.println(v);
        }
    }
}
