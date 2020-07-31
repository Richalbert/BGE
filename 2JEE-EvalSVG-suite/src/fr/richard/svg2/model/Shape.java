package fr.richard.svg2.model;

public class Shape {
	protected int x;
	protected int y;
	protected String col;
	protected String strokeCol;
	protected int strokeWidth;
	protected float opacity;
	protected String style;		// out
	protected String svgCode;	// out

	protected Shape(int x, int y, String col, String strokeCol, int strokeWidth, float opacity) {
		super();
		this.x = x;
		this.y = y;
		this.col = col;
		this.strokeCol = strokeCol;
		this.strokeWidth = strokeWidth;
		this.opacity = opacity;
		
		this.style = "fill: " + this.col + "; stroke: " + this.strokeCol + 
				"; stroke-width: " + this.strokeWidth + "; fill-opacity: " + this.opacity;
	}
	
	public void setSvgCode(String svgCode) {
		this.svgCode = svgCode;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", col=" + col + ", strokeCol=" + strokeCol + ", strokeWidth="
				+ strokeWidth + ", opacity=" + opacity + ", style=" + style + ", svgCode=" + svgCode + "]";
	}


}
