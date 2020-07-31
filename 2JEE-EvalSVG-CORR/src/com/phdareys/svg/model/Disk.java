package com.phdareys.svg.model;

public class Disk extends Shape implements SvgDrawable {

	private int radius;	// specific att to Disk
	
	public Disk(int x, int y, String col, String strokeCol, int strokeWidth, float opacity, int radius) {
		super(x, y, col, strokeCol, strokeWidth, opacity);
		this.radius = radius;
		this.setSvgCode(this.getSvgCode());
	}

	@Override
	public String getSvgCode() {
		return "<circle cx=\"" + this.x + "\" cy=\"" + this.y + "\" r=\"" + this.radius +  
				   "\" style=\"" + this.style + "\" />";
	}

}
