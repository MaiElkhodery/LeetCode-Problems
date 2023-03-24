class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int rows = score.length;
        int columns = score[0].length;
        int key, pointer;
        int[] savedRow = new int[columns];
        for (int s = 1; s < score.length; s++) {
            key = score[s][k];
            for (int c = 0; c < columns; c++) {
                savedRow[c] = score[s][c];
            }
            pointer = s - 1;
            while (pointer >= 0 && key > score[pointer][k]) {
                for (int c = 0; c < columns; c++) {
                    score[pointer + 1][c] = score[pointer][c];
                }
                pointer--;
            }
            for (int c = 0; c < columns; c++) {
                score[pointer + 1][c] = savedRow[c];
            }
        }
        return score;
    }
}