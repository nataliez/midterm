package shape;

class SortByArea{
	public static Cuboid[] compareTo(Cuboid c, Cuboid d) {
		double ca = c.area(c.getiLength(), c.getiWidth(), c.getiDepth());
		double da = d.area(c.getiLength(), c.getiWidth(), c.getiDepth());
		int comp =  Double.compare(ca, da);
        if (comp < 0) {
        	Cuboid[] ascend1 = {c, d};
        	return ascend1;
        	}
        else {
        	Cuboid[] ascend1 = {d, c};
        	return ascend1;
        	}
        }
}    
		   
		    


