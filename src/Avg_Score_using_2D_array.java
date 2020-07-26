// Write a Java program to find the average score of two students in three papers.
//NOTE: Given, score of first student is 60, 55 and 70 while 
//score of the second student is 80, 60 and 41. i.e. int[][] score = { {60, 55, 70}, {80, 60, 41} };  


public class Avg_Score_using_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score_list= { {60, 55, 70}, {80, 60, 41} };  
					
		int first=1;
		
		for(int i=0;i<score_list.length;i++)
		{
			float avg=0;
			System.out.println("The score of student "+  first + " :- ");
			
			for(int j=0;j<score_list[i].length;j++)
			{
				System.out.println(score_list[i][j]);
				
				avg = avg + score_list[i][j];
			}
			System.out.println();

			System.out.println("The average score of student is:- "+avg/3);
			
			first++;
			
			System.out.println();
		}
		
	}

}
