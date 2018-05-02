package sougouZisshuu.sigekiJava.ch17Chokuretsuka.rectangleIO;

class Rectangle implements java.io.Serializable {
	int width, height;
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width*height;
	}
}
