import consents.consent;
import dataset.AesEncryption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Home1 extends javax.swing.JFrame {
String a2="";
    /**
     * Creates new form Register
     */
    public Home1(String a1) {
         a2=a1;
        initComponents();
        
        consent c = new consent();
        this.setTitle(c.appname);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximizedBounds(new java.awt.Rectangle(100, 100, 2000, 900));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LEVEL 2");
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 400, 30);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 270, 90, 30);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(250, 270, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Question");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 170, 110, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 170, 250, 30);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 430, 210, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Answer");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 220, 100, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 220, 250, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(590, 90, 460, 520);

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THREE FACTOR AUTHENTICATION TO SAFEGUARD AN ONLINE TRANSACTION");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 20, 1030, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3d-cube-wallpaper_05.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setMaximumSize(new java.awt.Dimension(1000, 524));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 90, 560, 520);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
            AesEncryption asc=new AesEncryption();
            int v=0,v1=0;
            Random randomGenerator = new Random();
                for (int idx = 1; idx <= 10; ++idx) {
                    v1 = randomGenerator.nextInt(100000);

                }

            DBconnect co=new DBconnect();
            Connection con=co.connect();  
            
            Statement st=con.createStatement();
            Statement ob=con.createStatement();
            
              if((jTextField1.getText().equals(""))||(jTextField3.getText().equals(""))){
                JOptionPane.showMessageDialog(null,"Please Enter all value");
           }else{
                   ResultSet rs=st.executeQuery("select * from register where account='"+asc.toEncrypt(a2.getBytes())+"' and ans='"+asc.toEncrypt(jTextField1.getText().getBytes())+"' and ques='"+asc.toEncrypt(jTextField3.getText().getBytes())+"'  ");
            if(rs.next()){
               v=1;
            } else{
                v=0;
            }
                  
            if((v==1)){
           
                JOptionPane.showMessageDialog(null,"Login Successfully");
                new test11(a2);
                this.setVisible(false);
                this.dispose();
              
            }else{
           //     send(email, "Security Alert");
                 this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Login Failed");
                Home1 rs11=new Home1(a2);
                rs11.setVisible(true);
            }
              }
      //  System.out.println("select * from register where account='"+a2+"' and rand='"+jTextField3.getText()+"' ");
           
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     
       
        jTextField3.setText("");
       
           this.setVisible(false);
          Home rs11=new Home();
                rs11.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
