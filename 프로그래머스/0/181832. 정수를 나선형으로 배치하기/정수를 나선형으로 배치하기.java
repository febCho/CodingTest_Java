class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int row = 0;
        int col = 0;
        int maxRow = n - 1;
        int maxCol = n - 1;

        while (num <= n * n) {
            for (int i=col; i<=maxCol; i++) { //오른쪽으로 이동
                answer[row][i] = num++;
            }
            row++;
            for (int i=row; i<=maxRow; i++) { //아래쪽으로 이동
                answer[i][maxCol] = num++;
            }
            maxCol--;
            for (int i=maxCol; i>=col; i--) { //왼쪽으로 이동
                answer[maxRow][i] = num++;
            }
            maxRow--;
            for (int i=maxRow; i>=row; i--) { //위쪽으로 이동
                answer[i][col] = num++;
            }
            col++;
        }

        return answer;
    }
}
