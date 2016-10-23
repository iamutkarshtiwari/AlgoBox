/* Given a 2D binary matrix filled with 0's and 1's, 
find the largest rectangle containing only 1's and return its area.
*/


import java.io.*;
import java.util.*;


public class rectangle {
	public static void main(String Args[]) throws IOException {

	int array[][] = { {1, 0, 1, 0 ,0},
					  {0, 1, 1, 1, 1},
					  {1, 1, 1, 0, 1},
					  {1, 1, 1, 1, 1},
					  {1, 0, 1, 1, 1}};

	int maxH = 0;
	int maxW = 0;
	int maxArea = 0;
	int x, y, i, j;
	int tempheight, tempwidth;
	int rows = array.length;
	int columns = array[0].length;

	for (i = 0; i < rows; i++) {
		for (j = 0; j < columns; j++) {
			x   = i;
			y = j;
			
			if (array[i][j] == 1) {

				int height = rows;
				int width = 0;

				while (array[i][y] != 0) {
					tempheight = 0;
					x=i;
					
					while (array[x][y] != 0) {
						
						tempheight ++;

						x++;
						if (x == rows)
							break;					}
					if (tempheight < height)
						height = tempheight;


					width++;
					y++;
					if (y == columns)
						break;

				}


				//System.out.println(width + " " + height);	
				

				if ((width * height) > maxArea)
					maxArea = width * height;
					
			} else { continue; }

			}
		}
		System.out.println(maxArea);

	}


	}
