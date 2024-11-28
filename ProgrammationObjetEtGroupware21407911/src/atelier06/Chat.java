package atelier06;

public class Chat extends Felin implements Domesticable{
	public Chat() {
		super("Chat");
	}
	
	public void domestiquer(String nom) {
		domestique = true;
		System.out.println("Mon nom est " + nom);
	}
	
	public static void main(String args[]) {
		Chat t = new Chat();
		t.domestiquer("chaton combat");
		t.présente();
	}
}
