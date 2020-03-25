import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
Random rand = new Random();
ArrayList<Alien> aliens = new ArrayList<Alien>();
ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
ObjectManager(Rocketship rocket){
this.rocket = rocket;	
}
void addProjectile(Projectile projectile) {
projectiles.add(projectile);
		
	}

void addAlien(){
	aliens.add(new Alien(rand.nextInt(LeagueInvaders.WIDTH),0,50,50));
}
void update() {
for (Alien alien : aliens) {
	alien.update();
	if (alien.y>800) {
		alien.isActive=false;
}
}
}
public void draw(Graphics g) {
	rocket.draw(g);
for(int i=0; i<aliens.size(); i++) {
	aliens.get(i).draw(g);
}
}

public void purgeObjects() {
	for(int i=0; i<aliens.size(); i++) {
		if(aliens.get(i).isActive=false) {
			aliens.remove(i);
		}
}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	addAlien();
}
}

