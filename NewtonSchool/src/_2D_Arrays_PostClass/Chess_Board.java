//package _2D_Arrays_PostClass;

//Problem Statement
//Tom loves Chess boards. He admires its symmetry and how the black and white colours are 
//placed adjacently along both the axis.
//
//More formally, a chessboard like coloring implies that no two adjacent cells have the same color
//and all the cells are painted either white or black.
//
//On his birthday, Tom has been gifted a board which is in the form of a N*N grid. 
//Every cell is painted either black or white. Since Tom loves the placement of colours in a 
//chessboard, he will try to convert the board that has been gifted to him, identical to a 
//chessboard. He has both black and white colours available to him. Help him find out the 
//minimum number of the cell he will have to recolour to paint his board similar to chessboard.

//Output
//A single integer that is the minimum number of cells that Tom will have to re-color in 
//his board to convert the given board to a chess board like coloring.


package _2D_Arrays_PostClass;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Chess_Board {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int [][] input= new int[1000][1000];

        int zero=0;
        int one=0;
        int temp;
        int i=0, j=0;

        for( i =0; i<N; i++){
            String [] line = br.readLine().split("\\s+");
            for( j=0; j<N;j++){
                temp=((i+j)%2);
                input[i][j]= Integer.parseInt(line[j]);
                if(input[i][j]==temp){
                    zero++;
                }else{
                    one++;
                }

            }
        }
        System.out.print(Math.min(one,zero));

	}

}
