import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	private Font titleFont;
	private Font sideFont;
	Rocketship ship = new Rocketship(250,700, 50, 50);
	Timer frameDraw;
	  final int MENU = 0;
	    final int GAME = 1;
	    final int END = 2;
	    int currentState = MENU;
	    GamePanel(){
	    	sideFont = new Font("Arial", Font.PLAIN,24);
	    	titleFont = new Font("Arial", Font.PLAIN,48);
	    	frameDraw = new Timer(1000/60, this);
	    	frameDraw.start();
	    }
@Override
public void paintComponent(Graphics g) {
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	    drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
}
void updateMenuState() { 
	
}
void updateGameState() { 
	
}
void updateEndState()  {
	
}
void drawMenuState(Graphics g) { 

	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("League Invaders", 60, 50);
	g.setFont(sideFont);
	g.drawString("Press ENTER to start", 140, 300);
	g.drawString("Press SPACE for instructions", 100, 500);
	
}
void drawGameState(Graphics g) { 
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	ship.draw(g);
}
void drawEndState(Graphics g)  { 
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setFont(titleFont);
	g.setColor(Color.YELLOW);
	g.drawString("Game Over", 30, 30);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(currentState == MENU){
	    updateMenuState();
	}else if(currentState == GAME){
	    updateGameState();
	}else if(currentState == END){
	    updateEndState();
	}
repaint();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		System.out.println("ENTER");
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	        currentState++;
	    }
	    System.out.println(currentState);
	} 
	if (e.getKeyCode()==KeyEvent.VK_UP) {
		
	    System.out.println("UP");
	    if (ship.y>0) {
	    ship.up(); 
	    }
	}
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println("DOWN");
	    if (ship.y<LeagueInvaders.HEIGHT-ship.height-25) {
	    ship.down();
	    }
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	    if (ship.x>0) {
	    ship.left();
	    }
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	    if (ship.x<LeagueInvaders.WIDTH-ship.width) {
	    ship.right();
	    }
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
