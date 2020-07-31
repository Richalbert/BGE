package com.phdareys.svg.model;

import java.util.ArrayList;

import com.phdareys.svg.exception.ShapeException;

public class Grid {
	private final static int DEF_WIDTH = 600;
	private final static int DEF_HEIGHT = 500;
	private final static int LINES_NB = 3;
	private final static int RECTS_NB = 4;
	private final static int DISKS_NB = 2;
	private final static int Y_THRESHOLD = 50;
	private final static int RECT_HEIGHT_MAX = 50;
	private final static int RECT_WIDTH_MAX = 50;
	private final static int DISK_RADIUS_MAX = 50;
	
	private final static String [] COLORS = {"blue", "red", "yellow", "maroon", "green", "violet", "aquamarine"};

	private int width;
	private int height;
	private int linesNb;
	private int rectsNb;
	private int disksNb;
	
	private ArrayList<Shape> shapes = null;	// list of various elements

	
	public Grid(int width, int height, int linesNb, int rectsNb, int disksNb) {
		super();
		this.width = width;
		this.height = height;
		this.linesNb = linesNb;
		this.rectsNb = rectsNb;
		this.disksNb = disksNb;
		this.shapes = new ArrayList<Shape>();
	}

	public Grid() {
		this(DEF_WIDTH, DEF_HEIGHT, LINES_NB, RECTS_NB, DISKS_NB);
	}
	
	public Grid(int linesNb, int rectsNb, int disksNb) {
		this(DEF_WIDTH, DEF_HEIGHT, linesNb, rectsNb, disksNb);
	}

	public Grid (Shape[] shapes) {	// or Shape ...
		this.width = DEF_WIDTH;
		this.height = DEF_HEIGHT;
		this.shapes = new ArrayList<Shape>();
		for (Shape s:shapes) {
			this.shapes.add(s);
		}
		
	}
	public void generateShapes() throws ShapeException {
		for (int i=0; i<this.linesNb; i++) 
			this.shapes.add(new Line(
					this.randomInt(1, this.width), 
					this.randomInt(1, this.height), 
					this.randomColor(), 
					this.randomColor(), 
					this.randomInt(1, 5), 
					(float) Math.random(), 
					this.randomInt(1, this.width), 
					this.randomInt(1, this.height)));
		
		for (int i=0; i<this.rectsNb; i++) 
			this.shapes.add(new Rect(
					this.randomInt(1, this.width), 
					this.randomInt(1, this.height), 
					this.randomColor(), 
					this.randomColor(), 
					this.randomInt(1, 5), 
					(float) Math.random(), 
					this.randomInt(1, RECT_HEIGHT_MAX), 
					this.randomInt(1, RECT_WIDTH_MAX)));
		for (int i=0; i<this.disksNb; i++) 
			this.shapes.add(new Disk(
					this.randomInt(1, this.width), 
					this.randomInt(1, this.height), 
					this.randomColor(), 
					this.randomColor(), 
					this.randomInt(1, 5), 
					(float) Math.random(), 
					this.randomInt(1, DISK_RADIUS_MAX)));
			
		this.checkShapes();
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	private void checkShapes() throws ShapeException {
		// generated Y must be > 100 for lines inside grid
		for (Shape s: this.shapes) {
			if (s.getClass().toString().contains("Line") && s.y < Y_THRESHOLD)
				throw new ShapeException ("Line -> y: " + s.y + " is not allowed");
			/*			if (s.getClass().toString().contains("Rect") && 
					(s.y > this.height-RECT_HEIGHT_MAX || s.x > this.width-RECT_WIDTH_MAX))
				throw new ShapeException ("Rect out of Grid ");*/
		}

	}
	private int randomInt(int min, int max)	{
	     return (int) (Math.random()*(max-min+1))+min;
	}
	private String randomColor()	{
	     return COLORS[randomInt(0, COLORS.length-1)];
	}

}
