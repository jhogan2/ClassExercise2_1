import javax.swing.JOptionPane;

public class RoleCall {
	public static void main(String [] args) {
	String USER_ROLE;
	USER_ROLE =(JOptionPane.showInputDialog("What position do you hold: "));
	switch (USER_ROLE) {
	case "Administrator":
		System.out.println("Welcome "+ USER_ROLE + "!");
		break;
	case "Facullty":
		System.out.println("Welcome "+ USER_ROLE + "!");
		break;
	case "Staff":
		System.out.println("Welcome "+ USER_ROLE + "!");
		break;
	case "Student":
		System.out.println("Welcome "+ USER_ROLE + "!");
		break;
	case "Guest":
		System.out.println("Welcome "+ USER_ROLE + "!");
		break;
	default:
		System.out.println("Try again");
		}
	}
}
