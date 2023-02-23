package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		Color color = new Color(redComponent, greenComponent, blueComponent);
		StdDraw.setPenColor(color);
		
		if (shape.equals("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		else if (shape.equals("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajorAxis = in.nextDouble();
			double semiMinorAxis = in.nextDouble();
			if (isFilled) {
				StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			}
			else {
				StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
				}
		}
		else {		
			double[] xVals = new double[3];
			double[] yVals = new double[3];
			xVals[0] = in.nextDouble();
			yVals[0] = in.nextDouble();
			xVals[1] = in.nextDouble();
			yVals[1] = in.nextDouble();
			xVals[2] = in.nextDouble();
			yVals[2] = in.nextDouble();
			if (isFilled) {
				StdDraw.filledPolygon(xVals, yVals);
			}
			else {
				StdDraw.polygon(xVals, yVals);
			}
		}
	}
}


