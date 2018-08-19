# Sudoku
Solving sudoku using backtracking in java

We can solve Sudoku by one by one assigning numbers to empty cells. Before assigning a number, we check whether it
is safe to assign. We basically check that the same number is not present in the current row, current column and
current 3X3 subgrid. After checking for safety, we assign the number, and recursively check whether this assignment
leads to a solution or not. If the assignment doesn’t lead to a solution, then we try next number for the current
empty cell. And if none of the number leads to a solution, we return false.

'0' represents empty cells.

INPUT :  
4 0 2 9 0 5 8 0 3  
3 9 0 0 0 0 0 6 4  
0 0 1 0 0 0 9 0 0  
0 0 0 5 0 1 0 0 0  
0 4 0 6 0 2 0 3 0  
0 0 0 4 0 8 0 0 0  
0 0 7 0 0 0 5 0 0  
5 1 0 0 0 0 0 2 7  
9 0 4 7 0 3 6 0 8  


OUTPUT :  
4	6	2	9	1	5	8	7	3	  
3	9	5	2	8	7	1	6	4	  
7	8	1	3	6	4	9	5	2	  
2	7	9	5	3	1	4	8	6	  
1	4	8	6	9	2	7	3	5	  
6	5	3	4	7	8	2	9	1	  
8	3	7	1	2	6	5	4	9	  
5	1	6	8	4	9	3	2	7	  
9	2	4	7	5	3	6	1	8  


                      
