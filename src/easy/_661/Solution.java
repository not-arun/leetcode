package easy._661;

class Solution {

    public int[][] imageSmoother(int[][] img) {

        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[i].length; j++) {
                res[i][j] = smoothen(i, j, img.length, img[i].length, img);
            }
        }
        return res;
    }

    private int smoothen(int i, int j, int rowLen, int colLen, int[][] img) {

        int acc = 0;
        int sub = 0;
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                int newI = i + k;
                int newJ = j + l;
                if (newI >= 0 && newJ >= 0) {
                    if (newI < rowLen && newJ < colLen) {
                        acc = acc + img[newI][newJ];
                        sub++;
                    }
                }
            }
        }
        return (int) (double) (acc / sub);
    }
}
