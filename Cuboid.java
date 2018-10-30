package shape;

public class Cuboid extends Rectangle{
	private int iDepth;
	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;
	}
	public int getiDepth() {
		return this.iDepth;}
	
	public void setiDepth(int iD) {
		iDepth = iD;
	}
	
	//@Override
	public double area (int iLength, int iWidth, int iDepth) {
		return ((2 * iLength * iWidth) + (2 * iLength * iDepth) + (2 * iWidth * iDepth));
		}
	
	public double volume (int iLength, int iWidth, int iDepth) {
		return (iLength * iWidth * iDepth);
	}
	public double perimeter(int iLength, int iWidth, int iDepth) {
		throw new UnsupportedOperationException ("Perimeter is not valid in this context");	
	}
	
	private int SortByArea;
	private int SortByVolume;
}

