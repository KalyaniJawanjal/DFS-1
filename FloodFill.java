/*
DFS
time - O(n)
space - O(n)
*/
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image==null) return image;
        if(image[sr][sc]==newColor) return image;
        int n = image.length, m = image[0].length;
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    private void dfs(int[][] image, int row, int col, int newColor, int oldColor){
        if(row < 0 || row == image.length || col < 0 || col == image[0].length || image[row][col]!=oldColor) return;

        if(image[row][col]==oldColor) image[row][col] = newColor;

        dfs(image, row-1, col, newColor, oldColor);
        dfs(image, row+1, col, newColor, oldColor);
        dfs(image, row, col-1, newColor, oldColor);
        dfs(image, row, col+1, newColor, oldColor);
    }
}