import  javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Project11_TimothyLuong extends JPanel
{
  // You may change this constant
  private static final int SIZE = 300;
  
  public static void main(String[] args) 
  {
    // You may change the parameters in the code below a little, 
    // but proceed with extreme caution. Do not reorder the methods.
    JFrame frame = new JFrame("Line");
    JPanel panel = new Project11_TimothyLuong();
    frame.setSize(SIZE,SIZE);
    frame.getContentPane().add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
    
    // Do not change this method name or parameters
    public void paintComponent(Graphics g)
    {
      // Do not change the next two lines of code
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
      // This is where your code should go
      //House 
      Rectangle2D.Double house = new Rectangle2D.Double(50, 100, 200, 300); 
      g2d.setPaint(Color.RED);
      g2d.fill(house);
      g2d.draw(house); 
      
      //Door
      Rectangle2D.Double door = new Rectangle2D.Double(100, 250, 100, 150); 
      g2d.setPaint(Color.BLACK);
      g2d.fill(door);
      g2d.draw(door); 
      
      //Roof
      Line2D.Double roofLine1 = new Line2D.Double(150, 5, 50, 100);
      g2d.setColor(Color.BLACK);
      g2d.draw(roofLine1);
      
      //Roof
      Line2D.Double roofLine2 = new Line2D.Double(150, 5, 250, 100);
      g2d.setColor(Color.BLACK);
      g2d.draw(roofLine2);
      
      //Window 1
      Ellipse2D.Double window1 = new Ellipse2D.Double(155, 150, 50, 50); 
      g2d.setPaint(Color.BLUE);
      g2d.fill(window1);
      g2d.draw(window1);
      
      //Window 2
      Ellipse2D.Double window2 = new Ellipse2D.Double(100, 150, 50, 50); 
      g2d.setPaint(Color.GREEN);
      g2d.fill(window2);
      g2d.draw(window2);
      
      //Doorknob
      Ellipse2D.Double doorKnob = new Ellipse2D.Double(110, 335, 20, 20); 
      g2d.setPaint(Color.YELLOW);
      g2d.fill(doorKnob);
      g2d.draw(doorKnob);
      
      //Door window
      RoundRectangle2D.Double doorWindow = new RoundRectangle2D.Double(115, 255, 70, 70, 50, 50);
      g2d.setColor(Color.GRAY);
      g2d.fill(doorWindow);
      g2d.draw(doorWindow);
      
      // Don’t change anything after this
      }
}