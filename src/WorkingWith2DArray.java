import java.util.Arrays;

public class WorkingWith2DArray {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i = 0; i < 3; i++ ) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.toString(board));
        System.out.println("Hi");
    }
}
