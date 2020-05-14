package HW;
//********************************************************************
//Name: Greys Espinoza Hualpa
//Date: 3/4/2020
//Class: CSC122
//Drawing a Snowman using the library JFrame in java.
//********************************************************************
import javax.swing.JFrame;
import java.awt.*;

public class Snowman extends JFrame {
	
	public Snowman(){
		setSize(400,400);
		setVisible(true);
		setTitle(" Snowman ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics draw){
		
		 //Sky
	     draw.setColor (Color.cyan);
	  	 draw.fillRect(0, 0, 400, 400);
		
	     // Ground
		 draw.setColor (Color.blue);
	     draw.fillRect (0, 310, 400, 90);
	     
	     
	     // Sun
	     draw.setColor (Color.yellow);
	     draw.fillArc(-67,-44, 150, 150, 0, -90);
	    
      // Body of the Snowman
	     draw.setColor (Color.white);
	     draw.fillOval (180, 170, 40, 40);      // head
	     draw.fillOval (165, 205, 70, 50);      // upper torso
	     draw.fillOval (150, 250, 100, 60);     // lower torso
	    
      // Eyes
	     draw.setColor (Color.black);
	     draw.fillOval (190, 180, 5, 5);    // left eye
	     draw.fillOval (205,180, 5, 5);    // right eye
	     
	     // smile
	     draw.drawArc (190, 188, 20, 10, 190, 160);   
	     
	     // Arms
	     draw.drawLine (175, 230, 150, 210);  // left arm
	     draw.drawLine (225, 230, 255, 230);  // right arm

	     // Hat
	     draw.drawLine (180, 175, 220, 175);  // brim of hat
	     draw.fillRect (185, 150, 30, 25);    // top of hat
	   
	    }


	public static void main(String[] args) {
		 new Snowman();
		
	}

}
