package easy._191;

class Solution {

    public static int hammingWeight(int n) {

        int acc = 0;
        for (int i = 0; i < 32; i++) {
            if ((n >> i & 1) == 1)  acc++;
        }
        return acc;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(521));
    }
}