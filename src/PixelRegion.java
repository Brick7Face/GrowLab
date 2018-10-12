import java.awt.Point;

public class PixelRegion {
	int colorX, colorY;
	Point pixel8, pixel7, pixel6, pixel5, pixel4, pixel3, pixel2, pixel1;
	
	public PixelRegion(int x, int y) {
		colorX = x;
		colorY = y;
		pixel8.x = x - 1;
		pixel8.y = y - 1;
		pixel7.x = x;
		pixel7.y = y - 1;
		pixel6.x = x + 1;
		pixel6.y = y - 1;
		pixel5.x = x + 1;
		pixel5.y = y;
		pixel4.x = x + 1;
		pixel4.y = y + 1;
		pixel3.x = x;
		pixel3.y = y + 1;
		pixel2.x = x - 1;
		pixel2.y = y + 1;
		pixel1.x = x - 1;
		pixel1.y = y;
		
	}
}
