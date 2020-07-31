package fr.richard.svg2.model;

public class Rect extends Shape implements SvgDrawable {
	private int h;	// specific atts to Rectangle
	private int w;

	public Rect(int x, int y, String col, String strokeCol, int strokeWidth, float opacity, int h, int w) {
		super(x, y, col, strokeCol, strokeWidth, opacity);
		this.h = h;
		this.w = w;
		this.setSvgCode(this.getSvgCode());
	}

	@Override
	public String getSvgCode() {
		return "<rect x=\"" + this.x + "\" y=\"" + this.y + "\" width=\"" + this.w + "\" height=\"" + this.h + 
				   "\" style=\"" + this.style + "\" />";
	}

}
