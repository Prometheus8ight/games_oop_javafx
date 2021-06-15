package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return checkHorizontal(board) || checkVertical(board);
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean isTrue = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 1) {
                isTrue = true;
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] != 1) {
                        isTrue = false;
                        break;
                    }
                }
            }
        }
        return isTrue;
    }

    public static boolean checkVertical(int[][] board) {
        boolean isTrue = false;
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == 1) {
                isTrue = true;
                for (int j = 1; j < board.length; j++) {
                    if (board[j][i] != 1) {
                        isTrue = false;
                        break;
                    }
                }
            }
        }
        return isTrue;
    }
}
