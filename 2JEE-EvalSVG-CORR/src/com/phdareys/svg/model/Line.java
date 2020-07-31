package com.phdareys.svg.model;

public class Line extends Shape implements SvgDrawable {

	private int x2;	// specific atts to Line
	private int y2;
	
	public Line(int x, int y, String col, String strokeCol, int strokeWidth, float opacity, int x2, int y2) {
		super(x, y, col, strokeCol, strokeWidth, opacity);
		this.x2 = x2;
		this.y2 = y2;
		this.setSvgCode(this.getSvgCode());
	}
	@Override
	public String getSvgCode() {
		return "<line x1=\"" + this.x + "\" y1=\"" + this.y + "\" x2=\"" + this.x2 + "\" y2=\"" + this.y2 + 
			   "\" style=\"" + this.style + "\" />";
	}	
}