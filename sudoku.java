import java.util.Scanner;

public class sudoku
{
    int row, col;
    boolean solve(int table[][])
    {
        if(solved(table))
            return true;
        int currentRow = row, currentCol = col;

        for(int i=1;i<=9;i++)
        {
            if(!used(table, i, currentRow, currentCol))
            {
                table[currentRow][currentCol] = i;
                //System.out.println("Assign " + currentRow + " " + currentCol + " " + i);
                //print(table);
                if(solve(table))
                    return true;

                table[currentRow][currentCol] = 0;
            }
        }
        return false;
    }

    boolean solved(int table[][])
    {
        for (row = 0; row < 9; row++)
            for (col = 0; col < 9; col++)
                if (table[row][col] == 0)
                    return false;
        return true;
    }

    boolean used(int table[][], int num, int r, int c)
    {
        boolean flag = true, flag1 = true, flag2 = true;
        for (int coll = 0; coll < 9; coll++)
            if (table[r][coll] == num) {
                flag = true;
                break;
            }
            else
                flag = false;

        for (int roll = 0; roll < 9; roll++)
            if (table[roll][c] == num) {
                flag1 = true;
                break;
            }
            else
                flag1 = false;

        int startRow = r - r%3, startCol = c - c%3;
        for (int roll = 0; roll < 3; roll++) {
            for (int coll = 0; coll < 3; coll++)
                if (table[roll + startRow][coll + startCol] == num) {
                    flag2 = true;
                    break;
                } else
                    flag2 = false;
            if(flag2)
                break;
        }
        //System.out.println((flag || flag1 || flag2) + " " + r + " " + c + " " + num);
        return (flag || flag1 || flag2);
    }

    void print(int table[][])
    {
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                System.out.print(table[i][j] + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String a[])
    {
        Scanner scanner = new Scanner(System.in);
        int table[][] = new int[9][9];
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                table[i][j] = scanner.nextInt();

        sudoku s = new sudoku();
        if(s.solve(table))
            s.print(table);
    }
}
