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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;  
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;  
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
     Statement smt;
     String s,s1;
          ArrayList a1 = new ArrayList();
           ArrayList a2 = new ArrayList();
       public ImageBuffer (BufferedImage image,String id,String w) {  
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
         /*
       private void Init() throws Exception {  
           JFrame frame = new JFrame();  
           frame.setTitle("Picture");  
           frame.setSize(1200, 1200);  
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           frame.setResizable(false);  
             
           MenuBar menuBar = new MenuBar();  
           Menu menu = new Menu("File");         
           menu.add("Image");  
           menu.add("Quit");  
           menuBar.add(menu);     
           menu.addActionListener(new axnListener());  
           frame.setMenuBar(menuBar);  
             
           frame.addWindowListener(new WindowAdapter(){  
               public void windowClosing(WindowEvent e)  
              {  
                 System.exit(0);  
               }  
             });  
           
         frame.setVisible(true);  
    }//end init  
    * */

       /*
     public void loadImage() {  
         JFrame choose = new JFrame();  
         FileDialog dlg = new FileDialog(choose, "Choose Image", FileDialog.LOAD);  
         //set current directory  
         if(dir != null){  
             dlg.setDirectory(dir);  
         }  
         dlg.setVisible(true);  
         //get image name and path  
         imgFile = dlg.getDirectory()+dlg.getFile();  
         dir = dlg.getDirectory();  
         //create image using filename  
         try {  
             image = ImageIO.read(new File(imgFile));  
        } catch (IOException e) {  
             e.printStackTrace();  
         }  
         ImageBuffer test = new ImageBuffer(image);  
        JFrame f = new JFrame();  
           
         f.setTitle("Viewer");  
         f.add(new JScrollPane(test));  
         f.setVisible(true);  
         Insets insets = f.getInsets();  
         f.setSize(image.getWidth()+insets.left+insets.right+1, image.getHeight()+insets.top+insets.bottom+1);
        // f.setSize(500,500);  
          
         f.setResizable(false);  
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           
     }//end load image  
       */
       /*
     class axnListener implements ActionListener{  
         public void actionPerformed(ActionEvent e){  
           if(e.getActionCommand().equalsIgnoreCase("Image")){  
               loadImage();          
            }  
            else System.exit(0);  
          }  
       }//end of inner class axnListener  
       * 
       */
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
//     private void printtextfile(){  
//          PrintWriter pw = null;  
//         try  
//          {  
//            // created as a separate variable to emphasize that I'm appending to this file  
//           boolean append = true;  
//           pw = new PrintWriter(new FileWriter(new File("C:\\lll.txt"), append));  
//           // a print writer gives you many more methods to write with  
//            pw.println(mouse_x);  
//           pw.println(mouse_y);  
//          }  
//         catch (IOException e)  
//          {  
//           e.printStackTrace();  
//           // deal with the exception  
//          }  
//         finally  
//          {  
//            pw.close();  
//          }  
//    }  
        
       
     public void drawCircle(int x, int y) {  
        
      Graphics g = getGraphics();  
        
      g.drawOval(x - radius , y - radius, 2 * radius, 2 * radius);  
      g.setColor(Color.BLACK);  
      g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);  
      }  
     @Override  
      public void mouseClicked(MouseEvent e  ) {  
//        try {
//            int radius = 20;  
//            amt_input++;  
//            mouse_x = e.getX();  
//             mouse_y = e.getY(); 
//             
//             System.out.println("mouse clicked "+amt_input);  
//              System.out.println( mouse_x + "," + mouse_y ); 
//              System.out.println(c);
////              int x1=image.getWidth();
////              int y1=image.getHeight();
//               int x1=e.getX(); 
//              int y1=e.getY();
//            Random Rx= new Random();
//            Random Ry= new Random();
//           
//        int random = Rx.nextInt(x1);
//        int random1 = Ry.nextInt(y1);    
//           s=Integer.toString(random); 
//               s1=Integer.toString(random1); 
//         System.out.println( s + "," + s1 ); 
//         
//            
//      int query=0;
//       query=smt.executeUpdate("update register set imagepixelx= '"+mouse_x+"', imagepixely='"+mouse_y+"' where account='"+c+"'");
//           
//         this.setVisible(false);
//      // new slider(c).setVisible(true);
//         //new SmsSender(c);
//         Register as=new Register();
//         as.setVisible(true);
//                 
//        } catch (SQLException ex) {
//            Logger.getLogger(ImageBuffer.class.getName()).log(Level.SEVERE, null, ex);
//        }
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

         
                 
        if(amt_input<=3)
        {
              for (int i = 0; i < 2; i++) {
            //System.out.println(c.get(i));

         d1 = Integer.parseInt(a1.get(0).toString());
            d2 = Integer.parseInt( a1.get(1).toString());
            d3 = Integer.parseInt(a1.get(2).toString());
           

            d4 = Integer.parseInt (a2.get(0).toString());
            d5 = Integer.parseInt (a2.get(1).toString());
            d6 = Integer.parseInt (a2.get(2).toString());
            
        }
              int query=0;
              query=smt.executeUpdate("update register set imagepixelx= '"+d1+"', imagepixely='"+d4+"',imagepixelx1= '"+d2+"', imagepixely1='"+d5+"',imagepixelx2= '"+d3+"', imagepixely2='"+d6+"' where account='"+c+"'");
              this.setVisible(false);
              
              Home as=new Home();
              as.setVisible(true);
        }
        }catch(Exception ex){
            
          ex.printStackTrace();
           this.setVisible(false);
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
        