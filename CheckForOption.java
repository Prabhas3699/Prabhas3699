
public class CheckForOption {

	public static void main(String[] args) {
		
		int position =0;
		String optionValue="";
		int option=(int)(Math.random()*3)+1;
		
		switch(option) {
		case 1:
			optionValue="No Play";
			break;
		case 2:
			optionValue="Ladder";
			break;
		case 3:
			optionValue="Snake";
			break;
		}
		
		int roll=(int)(Math.random()*6)+1;
		System.out.println("The Starting Position of the Player is "+position);
		System.out.println("The Value of the die roll "+roll);
		
		if(optionValue=="No Play") {
			System.out.println("No Play.Skip this turn");
		}else if(optionValue=="Ladder") {
			System.out.println("Ladder option play.Move forward");
			position=position+roll;
			System.out.println("The player's position is "+position);
		}else {
			System.out.println("Snake option play.Move backward");
			position=position-roll;
			System.out.println("The player's position is "+position);
		}

	}

}
