public class Merge {
    public int[] merge(int[] A, int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < L.length; i++) {
            L[i] = A[p + i];
        }
        for (int i = 0; i < R.length ; i++) {
            R[i] = A[q + i];
        }
        int i = 0;
        int j = 0;
        int k = p;
        while(k < r && i < L.length && j < R.length) {
            if (L[i] > R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        for (int t = j; t < R.length; t++){
            // System.out.println("R");
            A[k] = R[t];
            k++;
        }
        for (int t = i; t < L.length; t++){
            //System.out.println("L");
            A[k] = L[t];
            k++;
        }

        return A;
    }
    public int[] mergeSort(int[] A_, int p, int r) {
        // println("p: " + p);
        // println("r: " + r);
        if (r - p > 1) {
            int q = (int)Math.floor((p+r)/2);
            // println("q: " + q);
            // println("");
            mergeSort(A_, p, q);
            mergeSort(A_, q, r);
            merge(A_, p, q, r);
        }

        return A_;
    }
}
