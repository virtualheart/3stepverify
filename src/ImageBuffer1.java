import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import java.awt.event.MouseMotionListener;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  
import java.awt.image.BufferedImage;  
import java.io.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;  
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;  
import javax.swing.*; 
     
   public class ImageBuffer1 extends JPanel implements MouseListener, MouseMotionListener{  
       int mouse_x, mouse_y, x,y;   
       String modifierKeys = "";   
       BufferedImage image;  
       String c="";  String s3 = null;
    int s4 = 0;
    int s5, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16 = 0;
    String s6 = null;
    int r, r1, r2, r3, r4, r5, r6, r7, r8 = 0;
    int t, t1, t2, t3, t4, t5, t6, t7, t8 = 0;
    String e = null;
    String f = null;
    int h, h2, h3, h4, h5, h6, h7, h8, h9 = 0;
    int s, g1, g2, g3, g4, g5, g6mg7, g8, g9 = 0;
    int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10 = 0;
       Dimension size = new Dimension();  //  @jve:decl-index=0:  
       String imgFile;  
       private String dir = null;  
       int amt_input=0;  
       int radius =20; 
       String q=null;
       Statement smt;
  
          ArrayList a1 = new ArrayList();
           ArrayList a2 = new ArrayList();
       public ImageBuffer1 (BufferedImage image,String id,String w) {  
           try {
//            Connection con;
//            String url = "jdbc:mysql://localhost:3306/security";
//            String driver = "com.mysql.jdbc.Driver";
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, "root", "root");
            DBconnect co=new DBconnect();
            Connection con=co.connect();
            smt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
          this.image = image;  
          this.c=id;
          this.q=w;
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
                   new ImageBuffer1();  
                     
               }  
           });  
             
       }  
         
       public ImageBuffer1 () {  
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
          
        mouse_x = e.getX();
        mouse_y = e.getY();
        System.out.println("mouse clicked " + amt_input);
        System.out.println(mouse_x + "," + mouse_y);
        System.out.println(c);
        a1.add( mouse_x);
        a2.add( mouse_y);
         
         
       
       
        amt_input++;

         
                 
        if(amt_input<=3)
        {
              for (int i = 0; i < 3; i++) {
            //System.out.println(c.get(i));

         d1 = Integer.parseInt(a1.get(0).toString());
            d2 = Integer.parseInt( a1.get(1).toString());
            d3 = Integer.parseInt(a1.get(2).toString());
           

            d4 = Integer.parseInt (a2.get(0).toString());
            d5 = Integer.parseInt (a2.get(1).toString());
            d6 = Integer.parseInt (a2.get(2).toString());
            
        }
               ResultSet rs = null;
    
            String query = "select * from register where account='" + c + "'";
            rs = smt.executeQuery(query);
            while (rs.next()) {
                s16=rs.getInt("account");
                             
                s4 = rs.getInt("imagepixelx");
                s5 = rs.getInt("imagepixely");
                s7 = rs.getInt("imagepixelx1");
                s8 = rs.getInt("imagepixely1");
                s9 = rs.getInt("imagepixelx2");
                s10 = rs.getInt("imagepixely2");
           
            }

            r = s4 + 5;
            t = s4 - 5;
            r1 = s7 + 5;
            t1 = s7 - 5;
            r2 = s9 + 5;
            t2 = s9 - 5;
            r3 = s11 + 5;
            t3 = s11 - 5;
            r4 = s13 + 5;
            t4 = s13 - 5;
            h = s5 + 5;
            s = s5 - 5;
            h2 = s8 + 5;
            g1 = s8 - 5;
            h3 = s10 + 5;
            g2 = s10 - 5;
           

            if (((r <= d1) || (t <= d1)) && ((h <= d4) || (s <= d4)) && ((r1 <= d2) || (t1 <= d2)) && ((h2 <= d5) || (g1 <= d5)) &&((r2 <= d3) || (t2 <= d3)) && ((h3 <= d6) || (g2 <= d6))  ) {

                 JOptionPane.showMessageDialog(this, "Login Successfully!!!");
                 this.setVisible(false);   
                 atm as=new atm(c);
                 as.setVisible(true);               
            
                        
            } else {
                JOptionPane.showMessageDialog(this, "Access Dined !!!");
                   Home as=new Home();
                  as.setVisible(true);
            }
        

         
            
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
        