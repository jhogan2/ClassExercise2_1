import javax.swing.JOptionPane;
public class Assignment_3 {
	public static void main( String [] args ) {
		String username = "";
		String password = "";
		String users[]= {"Ron B","Bob R", "Tae T"};
		String passes[] = {"password","password1","password2"};
		int count=0;
		username = JOptionPane.showInputDialog(null,"What is your username: ");
		while(count < 2) {
		if(username.equals(users[count])) {
			JOptionPane.showMessageDialog(null,"Correct ");
			  password = JOptionPane.showInputDialog(null,"What is your password");
			     if(password.equals(passes[count])){ 
			     String accounts[]={"Admin","Staff", "Student"};
				 JOptionPane.showMessageDialog(null,"Correct");
				JOptionPane.showMessageDialog(null, "Welcome " + users[count]);
				String input  =(String) JOptionPane.showInputDialog(null,"Choose position type ","Account Type", JOptionPane.QUESTION_MESSAGE,null,accounts,accounts[2]);
				 switch(input) {
				 case "Admin":
				 JOptionPane.showMessageDialog(null,"Welcome Admin! You can update and read files");
				 break;
				 case "Student":
				 JOptionPane.showMessageDialog(null, "Welcome Student! You can only read files.");
				 break;
				 case "Staff":
				 JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete files");
				 break;
				 }
				 }else {
				 JOptionPane.showMessageDialog(null,"Try Again or contact Admin");
				 password = JOptionPane.showInputDialog(null, "What is your password");
				}
				break;
			}else {
			JOptionPane.showMessageDialog(null,"Try Again or contact Administrator");
			username = JOptionPane.showInputDialog(null, "What was you username: ");
			}
			count++;
			}
		}
}
			
	       
	
	  

