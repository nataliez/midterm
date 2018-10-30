package shape;


class Rectangle extends Shape{
	private int iLength;
	private int iWidth;
	
	public Rectangle(int iLength, int iWidth) {
		this.iLength = iLength;
		this.iWidth = iWidth;
	}
	
	public int getiLength() {
		return this.iLength;}
	
	public void setiLength(int iL) {
		iLength = iL;}
	
	public int getiWidth() {
		return this.iWidth;}
	
	public void setiWidth(int iW) {
		iWidth = iW;}
	
	
	
	public double area(int iLength, int iWidth) {
		return (iLength * iWidth);
	}

	public double perimeter(int iLength, int iWidth) {
		return (2 * iLength)+(2 * iWidth);	
	}
     
	public static Rectangle[] compareTo(Rectangle rect1, Rectangle rect2) {
        double a1 = rect1.area(rect1.iLength, rect1.iWidth);
        double a2 = rect2.area(rect2.iLength, rect2.iWidth);
		int comp =  Double.compare(a1, a2);
        if (comp < 0) {
        	Rectangle[] ascend1 = {rect1, rect2};
        	return ascend1;
        	}
        else {
        	Rectangle[] ascend2 = {rect2, rect1};
        	return ascend2;
        	}
        }

}

