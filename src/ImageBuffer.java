import java.awt.*;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import java.awt.event.MouseMotionListener;  
import java.awt.image.BufferedImage;  
import java.io.*;  
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;  
import javax.swing.*; 
//import contour.FileRead;  
//import org.eclipse.swt.graphics.GC;  
     
   public class ImageBuffer extends JPanel implements MouseListener, MouseMotionListener{  
       int mouse_x, mouse_y, x,y;   
       String modifierKeys = "";   
       BufferedImage image;  
       String c="";
       Dimension size = new Dimension();  //  @jve:decl-index=0:  
       String imgFile;  
       private String dir = null;  
       int amt_input=0;  
       int radius =20; 
       String q=null;
       JFrame fram;
     Statement smt;
     String s,s1;
          ArrayList a1 = new ArrayList();
           ArrayList a2 = new ArrayList();
       public ImageBuffer (BufferedImage image,String id,String w,JFrame fram) {  
           try {

               DBconnect co=new DBconnect();
               Connection con=co.connect();
               smt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
          this.image = image;  
          this.c=id;
          this.q=w;
          this.fram=fram;
          System.out.println(w);
           size.setSize(image.getWidth(), image.getHeight());  
           this.addMouseListener(this);  
           this.addMouseMotionListener(this);  
             
      }  
         
       
       protected void paintComponent(Graphics g){  
           super.paintComponent(g);  
           int x = (getWidth() - size.width)/2;  
           int y = (getHeight() - size.height)/2;  
           g.drawImage(image, x, y, this);  
           g.setColor(Color.black);  
           g.drawString("ID : 00:24:c3:31:2b:e0", 730, 175);  
           g.setColor(Color.red);  
           //g.drawString("User at coordinate : (" + mouse_x + "," + mouse_y + ")", mouse_x, mouse_y);  
           g.setColor(Color.blue);  
           g.fillOval(mouse_x, mouse_y, 10, 10);  
          g.drawOval(mouse_x, mouse_y, 10, 10);  
       }  
       public static void main(String[] args) throws IOException {  
             
           SwingUtilities.invokeLater(new Runnable()  
           {  
               public void run()  
               {  
                   new ImageBuffer();  
                     
               }  
           });  
             
       }  
         
       public ImageBuffer () {  
           try{  
               //Init();  
                 
           }  
           catch(Exception e){  
               e.printStackTrace();  
           }  
       }  
            
   void setInfo(MouseEvent e) {  
         // set up the information about event for display  
       mouse_x = e.getX();  
       mouse_y = e.getY();  
       modifierKeys = "";  
     if (e.isShiftDown())  
          modifierKeys += "Shift  ";  
       if (e.isControlDown())  
          modifierKeys += "Control  ";  
       if (e.isMetaDown())  
          modifierKeys += "Meta  ";  
       if (e.isAltDown())  
          modifierKeys += "Alt";  
       this.repaint();  
     }  
       
     public void drawCircle(int x, int y) {  
        
      Graphics g = getGraphics();  
        
      g.drawOval(x - radius , y - radius, 2 * radius, 2 * radius);  
      g.setColor(Color.BLACK);  
      g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);  
      }  
     @Override  
      public void mouseClicked(MouseEvent e  ) {  

     try{
        int radius = 20;
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7, d8, d9, d10 = 0;
        mouse_x = e.getX();
        mouse_y = e.getY();
        System.out.println("mouse clicked " + amt_input);
        System.out.println(mouse_x + "," + mouse_y);
        System.out.println(c);
        a1.add( mouse_x);
        a2.add( mouse_y);
        
        amt_input++;
        
        if(amt_input==3)
        {
           for (int i = 0; i < 2; i++) {
            //System.out.println(c.get(i));

            d1 = Integer.parseInt(a1.get(0).toString());
            d2 = Integer.parseInt(a1.get(1).toString());
            d3 = Integer.parseInt(a1.get(2).toString());
           

            d4 = Integer.parseInt (a2.get(0).toString());
            d5 = Integer.parseInt (a2.get(1).toString());
            d6 = Integer.parseInt (a2.get(2).toString());
            
          }
              int query=0;
              query=smt.executeUpdate("update register set imagepixelx= '"+d1+"', imagepixely='"+d4+"',imagepixelx1= '"+d2+"', imagepixely1='"+d5+"',imagepixelx2= '"+d3+"', imagepixely2='"+d6+"' where account='"+c+"'");
              
              this.setVisible(false);
              this.fram.dispose();
              
              Home as=new Home();
              as.setVisible(true);
              
        }else if(amt_input>=3){
            amt_input=0;
            JOptionPane.showMessageDialog(this, "Try agion...!!!");
                             
            a1.clear();
            a2.clear();
            
           // this.setVisible(false);

            } 
        }catch(Exception ex){
            
          ex.printStackTrace();
        } 
      }  
    
      @Override  
      public void mouseEntered(MouseEvent e) {  
          // TODO Auto-generated method stub  
            
      }  
    
      @Override  
      public void mouseExited(MouseEvent e) {  
          // TODO Auto-generated method stub  
            
      }  
    
      @Override  
      public void mousePressed(MouseEvent e) {  
            
          x = e.getX();
          y = e.getY();  
          drawCircle(e.getX()-(radius/2), e.getY()-(radius/2));  
            
      }  
    
      @Override  
      public void mouseReleased(MouseEvent e) {  
          // TODO Auto-generated method stub  
            
      }  
    
      @Override  
      public void mouseDragged(MouseEvent e) {  
          // TODO Auto-generated method stub  
            
      }  
    
      @Override  
      public void mouseMoved(MouseEvent e) {  
            setInfo(e);  
            
      }  
  }  
        