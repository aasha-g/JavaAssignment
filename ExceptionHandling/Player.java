package exceptionHandling;

public class Player {
	private String name;
    private int score;

    public Player(String name, int score) {
         if (score < 0) 
         {
        	 throw new IllegalArgumentException("Score cannot be negative!: " + score);
         }

        this.name = name;
        this.score = score;
    }

    public void display() {
        System.out.println("Player: " + name + " , Score: " + score);
    }

	public static void main(String[] args) {
		try {
            // This will work fine
            Player p1 = new Player("A", 50);
            p1.display();

            // This will trigger the exception
            Player p2 = new Player("B", -10);
            p2.display(); 

        } catch (IllegalArgumentException e) {
            System.out.println("Error creating player: " + e.getMessage());
		

	}

}
}
