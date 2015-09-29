import javax.swing.JOptionPane;

public class ClassExercise3_4 {
	public static void main(String [] args){
	int numPeople, numPlayers, groupSize, groupSize1, teamSize;
	numPeople = Integer.parseInt(JOptionPane.showInputDialog("Number of People:"));
	numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Number of Players:"));
	if(numPeople>10){
	groupSize =numPeople/2;			
	System.out.println("The group size is "+groupSize);
	}else if(numPeople > 3 && numPeople < 10){
	groupSize1 = numPeople/3;
	System.out.println("The group size is "+groupSize1);
	}else {
	System.out.println("The number of people has to be at least 3");
	}
	 if(numPlayers >= 11 && numPlayers <=55 ){
	  teamSize = numPlayers/11;
	System.out.println("The team size is "+teamSize);
	}else {
	System.out.println("The team size is 1"); }
	}																																																	
}

