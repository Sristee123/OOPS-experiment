package lab_5;

public class PlayerDemo {
	public static void main(String[] args) {
        Cricket_Player c = new Cricket_Player("Sristee", 19, "Batsman");
        Football_Player f = new Football_Player("Aarushi", 19, "Forward");
        Hockey_Player h = new Hockey_Player("Sanskriti", 18, "Goalkeeper");

        c.play();
        f.train();
        h.play();
    }
}
