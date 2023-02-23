package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenRadius(.1);
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(0, 0, 1, 1);
		StdDraw.line(0, 1, 1, 0);
		
		StdDraw.setPenRadius(.001);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(.15, .6, .13, .02);
				
		StdDraw.setPenColor(Color.LIGHT_GRAY);
		StdDraw.filledRectangle(.5, .6, .3, .05);
		
		double[] xVals = {.8, .8, .9};
		double[] yVals = 	{.65, .55, .6};
		StdDraw.filledPolygon(xVals, yVals);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(.2, .6, .025, .1);
		
		StdDraw.setPenColor(Color.DARK_GRAY);
		StdDraw.line(.225, .6, .899, .6);
		StdDraw.line(.8, .55, .8, .65);
		
		Color human = new Color(236, 188, 180);
		StdDraw.setPenColor(human);
		StdDraw.filledEllipse(.5, .55, .2, .25);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(.42, .61, .04);
		StdDraw.filledCircle(.58, .61, .04);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(.42, .61, .01);
		StdDraw.filledCircle(.58, .61, .01);		
		
		StdDraw.filledEllipse(.5, .45, .1, .01);
		StdDraw.setPenColor(Color.RED);
		StdDraw.ellipse(.5, .45, .1, .01);
		
		



		






		
	}
}