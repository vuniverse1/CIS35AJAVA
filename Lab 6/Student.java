

public class Student {
	
		private int SID;
		private int scores[] = new int[5];


		//get and set functions for scores and ID
		public int getSID(){
		return SID;
		}
		public void setSID(int SID){
		this.SID= SID;
		}
		public int[] getScores(){
		return scores;
		}
		public void setScores(int[] scores){
		this.scores= scores;
		}

		public void print(){ //print all data of a student
		System.out.printf("\n%d   %d  %d  %d  %d  %d ", SID ,scores[0], scores[1], scores[2] ,scores[3] ,scores[4]);
		}
		}