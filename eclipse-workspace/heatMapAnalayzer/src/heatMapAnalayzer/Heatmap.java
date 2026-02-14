package heatMapAnalayzer;
import java.util.*;

public class Heatmap {
	int[][] heat;
	public void heatInitial(int x, int y, int xh, int yh) {
		this.heat = new int[x][y];
		this.heat[xh][yh] = 5;
		heatMaker();
	}
	void heatMaker() {
		int xh = 0, yh = 0;
		
		for (int i = 0; i < heat.length; i++) {
			for (int f = 0; f < heat[i].length; f++) {
				if (heat[i][f] == 5) {
					xh = i;
					yh = f;
				}
			}
		}
		for (int i = 5; i >= 0; i--) {
			boolean xLess = false, yLess = false, xMess = false;
			if (xh-i >= 0) {
				heat[xh-i][yh] = absoluteFinder(i);
				xLess = true;
			}
			if (yh-i >= 0) {
				heat[xh][yh-i] = absoluteFinder(i);
				if (xLess) {
					heat[xh-i][yh-i] = absoluteFinder(i);
				}
				yLess = true;
			}
			if (xh+i >= heat.length) {
				heat[xh+i][yh] = absoluteFinder(i);
				xMess = true;
				if (yLess) {
					heat[xh+i][yh-i] = absoluteFinder(i);
				}
				
			}
			if (yh+i >= heat[0].length) {
				heat[xh][yh+i] = absoluteFinder(i);
				if (xMess) {
					heat[xh+i][yh+i] = absoluteFinder(i);
				}
				if (xLess) {
					heat[xh-i][yh+i] = absoluteFinder(i);
				}
				
			}
			
		}
	}
	int absoluteFinder(int i) {return (i-5) * -1;}

	
	
	
}
