import javax.swing.JFrame;

public class LeagueInvaders {

	   
	private JFrame frame;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	private GamePanel panel;
public static void main(String[] args) {
	

	new LeagueInvaders().setup();
}
LeagueInvaders(){
	panel = new GamePanel();
	frame = new JFrame();
}
void setup() {
	frame.add(panel);
	frame.setSize(WIDTH, HEIGHT);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}

}
