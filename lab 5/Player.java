package lab_5;

public class Player {
	 String name;
	    int age;
	    String position;

	    public Player(String name, int age, String position) {
	        this.name = name;
	        this.age = age;
	        this.position = position;
	    }

	    public void play() {
	        System.out.println(name + " is playing.");
	    }

	    public void train() {
	        System.out.println(name + " is training.");
	    }
	}

	// Subclasses
	class Cricket_Player extends Player {
	    public Cricket_Player(String name, int age, String position) {
	        super(name, age, position);
	    }
	}
	class Football_Player extends Player {
	    public Football_Player(String name, int age, String position) {
	        super(name, age, position);
	    }
	}
	class Hockey_Player extends Player {
	    public Hockey_Player(String name, int age, String position) {
	        super(name, age, position);
	    }
	}

