/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seabattle_mvp;



public class Board extends Color{
    char[][] MyBoard = new char[15][15];
    char[][] EnemyBoard = new char[15][15];

    public Board() {
        for(int row = 0;row < 15;++row) {
            for(int column = 0; column < 15;++column){
                MyBoard[row][column] = ' ';
            }
        }
        
        for(int row = 0;row < 15;++row) {
            for(int column = 0; column < 15;++column){
                EnemyBoard[row][column] = ' ';
            }
        }
    }
    
    public void displayMyboard(String MyName) {
        System.out.println(MyName);
        System.out.print("-  ");
        for(int column = 1;column<=10;++column){ // in số cột của bảng của bản thân
            if(column < 10) System.out.print(column + "  ");
            else System.out.print(column + " ");
        }
        System.out.println("");
        for(int row = 0;row < 10;++row){
            int row_present = row + 1;
            // cột của mình
            if(row < 9) System.out.print(row_present + " |");
            else System.out.print(row_present + "|");
            
            for(int column = 0;column < 10 ;++column) {
               if(MyBoard[row][column] != 'X') System.out.print(MyBoard[row][column] + " |");
                else{
                    System.out.print(RED_BACKGROUND + MyBoard[row][column] + ANSI_RESET + RED_BACKGROUND + " " + ANSI_RESET);
                    if(MyBoard[row][column+1] == 'X') System.out.print(RED_BACKGROUND + " " + ANSI_RESET);
                    else System.out.print("|");
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------------------------");
    }
    
    
    public void display(String MyName,String EnemyName) {
        //in dòng chữ Sea Battle
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-                          Welcome to SeaBattle!                        -");
        System.out.println("-------------------------------------------------------------------------");
        // in tên của bản thân -> qui định nhập tên không quá 33 ký tự
        System.out.print(MyName);
        int sizeMyName = MyName.length();
        int remainChar = 33 - sizeMyName;
        
        for(int column = 0;column < remainChar;++column) {
            System.out.print(" ");
        }
        // khoảng trống giữa 2 bảng
        System.out.print("       ");
        // in tên của đối thủ
        System.out.print(EnemyName);
        int sizeEnemyName = EnemyName.length();
        remainChar = 33 - sizeEnemyName;
        
        for(int column = 0;column < remainChar;++column) {
            System.out.print(" ");
        }
        System.out.println("");
        // in tiếp bảng
        System.out.println("");
        //System.out.println("-------------------------------------------------------------------------");
        System.out.print("-  ");
        for(int column = 1;column<=10;++column){ // in số cột của bảng của bản thân
            if(column < 10) System.out.print(column + "  ");
            else System.out.print(column + "|");
        }
        System.out.print("~~~~~| -  ");
        
        for(int column = 1;column<=10;++column){ // in số cột của bảng của đối thủ
            if(column < 10) System.out.print(column + "  ");
            else System.out.println(column + "|");
        }
        
        //System.out.println("  -------------------------------");
        // in hàng
        for(int row = 0;row < 10;++row){
            int row_present = row + 1;
            // cột của mình
            if(row < 9) System.out.print(row_present + " |");
            else System.out.print(row_present + "|");
            
            for(int column = 0;column < 10 ;++column) {
                if(MyBoard[row][column] != 'X') System.out.print(MyBoard[row][column] + " |");
                else{
                    System.out.print(RED_BACKGROUND + MyBoard[row][column] + ANSI_RESET + RED_BACKGROUND + " " + ANSI_RESET);
                    if(MyBoard[row][column+1] == 'X') System.out.print(RED_BACKGROUND + " " + ANSI_RESET);
                    else System.out.print("|");
                }
            }
            System.out.print("~~~~~| ");
            // cột của đối thủ
            if(row < 9) System.out.print(row_present + " |");
            else System.out.print(row_present + "|");
            
            for(int column = 0;column < 10 ;++column) {
                if(EnemyBoard[row][column] != 'X') System.out.print(EnemyBoard[row][column] + " |");
                else{
                    System.out.print(RED_BACKGROUND + EnemyBoard[row][column] + ANSI_RESET + RED_BACKGROUND + " " + ANSI_RESET);
                    if(EnemyBoard[row][column+1] == 'X') System.out.print(RED_BACKGROUND + " " + ANSI_RESET);
                    else System.out.print("|");
                }
            }
            
            System.out.println("");
            //System.out.println("  -------------------------------");
        }
        System.out.println("-------------------------------------------------------------------------");
    }
}
        