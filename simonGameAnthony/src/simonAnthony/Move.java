package simonAnthony;

public class Move implements MoveInterfaceAnthony {

private ButtonInterfaceAnthony b; 
	
	public Move(ButtonInterfaceAnthony b) {
		this.b = b;
	}

	public ButtonInterfaceAnthony getButton() {
		return b;
	}

}