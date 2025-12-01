package Sett_7.Es6_VII_Sett;
public class Tris{
    private char[][] board;
   
    public Tris(){
        this.board = new char[][] {{'-','-','-'},{'-','-','-'},{'-','-','-'}};
    }
    public String toString(){   
        return "-------------\n| "+this.board[0][0]+" | "+this.board[0][1]+" | "+this.board[0][2]+" |\n| "+this.board[1][0]+" | "+this.board[1][1]+" | "+this.board[1][2]+" |\n| "+this.board[2][0]+" | "+this.board[2][1]+" | "+this.board[2][2]+" |\n-------------\n";
    }    
    public boolean setCharInPosition(int row, int column, char c){  
        if(row >2 && row <0 || column >2 && column <0) throw new IllegalArgumentException();
        if(this.board[row][column]!='-') return false; 
        this.board[row][column] = c;
        return true;
    }
    public char getCharInPosition(int row, int column){   
        if(row >2 && row <0 || column >2 && column <0) throw new IllegalArgumentException();
        return this.board[row][column];
    }
    private int getCount(){
        int count = 0; 
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(this.board[i][j]!='-')count++;
            }
        }
        return count;
    }
    public int isWinning(char c){ 
        boolean win = true, win2 = true;
        for(int i=0; i<3; i++){
            if(this.board[i][i]!=c){
                win = false;
            }
            if(this.board[2-i][i]!=c){
                win2 = false;
            }
        }
        if(win || win2) return 1;
        for(int i=0; i<3; i++){
            win = win2 = true;
            for(int j=0; j<3; j++){
                if(this.board[i][j]!=c){
                    win = false;
                }
                if(this.board[j][i]!=c){
                    win2 = false;
                }
            }  
            if(win || win2) return 1;
        } 
        if(getCount()==9){
            return 2;
        }else{
            return 0;
        }
    }
}