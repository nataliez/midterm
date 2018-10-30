package shape;

class SortByVolume{
	public static Cuboid[] compareTo(Cuboid c, Cuboid d) {
		double cv = c.volume(c.getiLength(), c.getiWidth(), c.getiDepth());
		double dv = d.volume(c.getiLength(), c.getiWidth(), c.getiDepth());
		int comp =  Double.compare(cv, dv);
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