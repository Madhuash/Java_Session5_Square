import java.awt.Rectangle;


 public class Square extends Rectangle 
{


public Square(int length) {
    //setLocation(x - length / 2, y - length / 2);
    setSize(length, length);
}

public int getArea() {
    return (int) (getWidth() * getHeight());
}

public String toString() {
    int x = (int) getX();
    int y = (int) getY();
    int w = (int) getWidth();
    int h = (int) getHeight();
    return "Square[x=" + x + ",y=" + y + ",width=" + w + ",height=" + h
           + "]";
}
}

