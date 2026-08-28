class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(bredthSearch(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public boolean bredthSearch(char[][] board, String word, int i, int j, int index){
        int m = board.length;
        int n = board[0].length;

        //boundary
        if(word.length()==index)
           return true;
        if(i<0 || j<0 || i>=m || j>=n || word.charAt(index)!=board[i][j])
            return false;
        
        char temp = board[i][j];
        board[i][j]='*';
        boolean result=false;
        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};

        for(int[] dir: directions){
            result = bredthSearch(board, word, i+dir[0], j+dir[1], index+1);
            
            if(result)
                break;
        }

        board[i][j]=temp;  //for backstep incase failed somewhere
        return result;
    }
}
