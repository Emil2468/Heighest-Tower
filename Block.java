public class Block {
    int[] sides = new int[2];
    int largest;
    public Block (int[] s) {
        sides = s;
        if (s[0] > s[1]) {
            largest = 0;
        } else {
            largest = 1;
        }
    }
}
