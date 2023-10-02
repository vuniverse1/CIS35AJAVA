
public class Statistics {
private int[] lowscores= new int[5];
private int[] highscores= new int[5];
private float[] avgscores= new float[5];

public void findlow(Student[] a, int counter){ // finds low score.
	
	for(int i=0;i<5; i++) {
		int low =100;
		if(counter ==0) {
			low = 0;
		}
			for(int j=0; j< counter; j++){
				int[] scores= a[j].getScores();
				if(low > scores[i]){
					low = scores[i];
							}
							}
				lowscores[i]= low;
								}
	
								}

public void findhigh(Student[] a, int counter){ // find high score

	for(int i=0;i<5; i++){
			int high = 0;
				for(int j=0; j< counter; j++){
					int[] scores= a[j].getScores();
					if(high < scores[i]){
						high = scores[i];
						}
					}
					highscores[i]= high;
						}
						}

public void findavg(Student[] a, int counter){ // find average score.

	for(int i=0;i<5; i++){
		float sum =0;
		for(int j=0; j<counter; j++){
			int[] scores= a[j].getScores();
			sum= sum + scores[i];
							}
		avgscores[i]= sum/counter;
		
							}
							}

public void print(int option){ // print statistics for all students and all quizes

		
		switch(option) {
		case 1:
		System.out.printf("Lowest Scores: %d  %d  %d  %d  %d ", lowscores[0], lowscores[1], lowscores[2], lowscores[3], lowscores[4]);
		break;
		case 2: System.out.printf("Highest Scores: %d  %d  %d  %d  %d ", highscores[0], highscores[1], highscores[2], highscores[3], highscores[4]);
		break;
		case 3:  System.out.printf("Average Scores: %d  %d  %d  %d  %d ", avgscores[0], avgscores[1], avgscores[2], avgscores[3], avgscores[4]);
		break;
		case 4: 
			System.out.printf("\nLowest Scores: %d  %d  %d  %d  %d ", lowscores[0], lowscores[1], lowscores[2], lowscores[3], lowscores[4]);			
			System.out.printf("\nHighest Scores: %d  %d  %d  %d  %d ", highscores[0], highscores[1], highscores[2], highscores[3], highscores[4]);
			System.out.printf("\nAverage Scores: %.2f  %.2f  %.2f  %.2f  %.2f ", avgscores[0], avgscores[1], avgscores[2], avgscores[3], avgscores[4]);		
			break;
}
}
}

