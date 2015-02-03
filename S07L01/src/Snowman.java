import java.awt.Graphics;
import java.awt.Color;

public class Snowman extends Geometry {

	Geometry[] parts;

	public Snowman(int positionX, int positionY, Color color) {
		super(positionX, positionY, color);
		int height = 150;
		parts = new Geometry[10];

		final int MID = super.getPositionX() / 2; // middle of the snowman
		final int TOP = positionY - height / 2; // top of the snowman

		int bottomRadius = (int) (height * 0.5);
		int middleRadius = (int) (bottomRadius * 0.7);
		int headRadius = (int) (bottomRadius * 0.4);

		int i = 0;
		parts[i] = new Line(MID, TOP + 50, Color.BLACK, TOP + 30, MID - 50);
		// draw right arm
		i++;
		parts[i] = new Line(MID, TOP + 50, Color.BLACK, TOP + 30, MID + 60);
		i++;
		parts[i] = new Oval(MID - headRadius / 2, TOP, color, headRadius,
				headRadius);
		// draw middle (upper torso)
		i++;
		parts[i] = new Oval(MID - middleRadius / 2, TOP + middleRadius / 2,
				color, (int) (middleRadius * 0.8), middleRadius);
		// draw base (lower torso)
		i++;
		parts[i] = new Oval(MID - bottomRadius / 2,
				(int) (TOP + bottomRadius * 0.8), color,
				(int) (bottomRadius * 0.8), bottomRadius);

		i++;
		parts[i] = new Oval(MID - 10, TOP + 10, Color.BLACK,5,5 );
		// draw right eye
		i++;
		parts[i] = new Oval(MID + 5, TOP + 10, Color.BLACK, 5, 5 );


		i++;
		parts[i] = new Arc (MID - 10, TOP + 10, Color.RED, 20, 10, 160, 160);

		i++;
		parts[i] = new Line(MID - 20, TOP + 5, Color.black, TOP + 5, MID + 20);
		// draw hat
		/*
		 * // draw brim of hat ; // draw top of hat */
		i++;
		parts[i] = new Rectangle (MID - 15, TOP - 20, Color.BLACK, 30, 25);


	}

	public void draw(Graphics g, int frame) {
		for (int i = 0; i < parts.length; i++) {
			if( i < 2)
			parts[i].draw(g, frame);
			else
				parts[i].draw(g, 0);
		}

	}

}