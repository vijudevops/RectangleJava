import org.junit.Test;
import org.junit.Assert.assertEquals;

public class RectangleTest {
    Rectangle  myRectangle = new Rectangle(10,20);

    @Test
    public void testGetArea(){
       assertEquals(myRectangle.getArea(),200); 
    }

    @Test
    public void testPerimeter(){
        assertEquals(myRectangle.getPerimeter(), 60);
    }

    @Test
    public void testLength(){
        assertEquals(myRectangle.length,10);
    }

    @Test
    public void testWidth(){
        assertEquals(myRectangle.width, 20);
    }
}