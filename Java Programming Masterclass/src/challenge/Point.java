package challenge;

public class Point {
	private int x, y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double distance() {
		return Math.sqrt(((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y)));
	}

	public double distance(int x, int y) {
		return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
	}

	public double distance(Point point) {
		return Math.sqrt(((point.x - this.x) * (point.x - this.x)) + ((point.y - this.y) * (point.y - this.y)));
	}
}
