
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
 * @author Sengetha
 */
public class Register extends javax.swing.JFrame {
    
    consent c;
    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        c= new consent();
        this.setTitle(c.appname);
        
        Random rand = new Random(); 
        int rand_int1 = rand.nextInt(1000); 
        int rand_int2 = rand.nextInt(1000); 
        int rand_int3 = rand.nextInt(1000); 
        String rdg="",rdg1="",rdg2="";
             rdg=rand_int1+"";
             rdg1=rand_int2+"";
             rdg2=rand_int3+"";
              jTextField2.setText(rdg);
              jTextField1.setText(rdg1);
           jTextField2.setVisible(false);
           jTextField1.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField3 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jButton11 = new javax.swing.JButton();
        jNameField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Email");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 80, 30);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 350, 140, 40);

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 350, 150, 40);

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField2MouseEntered(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(250, 240, 70, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("LEVEL 1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 240, 80, 30);

        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(150, 240, 90, 30);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(580, 230, 50, 30);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(630, 280, 0, 30);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 280, 50, 30);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(630, 330, 0, 30);

        jLabel11.setText("     ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 330, 50, 30);

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(150, 160, 330, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("RETYPE ACC NO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 150, 50);

        jPasswordField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField3FocusLost(evt);
            }
        });
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField3);
        jPasswordField3.setBounds(150, 200, 330, 30);

        jButton3.setText("VIEW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(270, 240, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LEVEL 2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 290, 80, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(250, 290, 70, 30);

        jButton4.setText("VIEW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 290, 110, 30);

        jLabel7.setBackground(new java.awt.Color(0, 51, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REGISTRATION FORM");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 20, 430, 40);

        jPasswordField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField5KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField5);
        jPasswordField5.setBounds(390, 240, 90, 30);

        jPasswordField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField6ActionPerformed(evt);
            }
        });
        jPasswordField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField6KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField6);
        jPasswordField6.setBounds(150, 290, 90, 30);

        jPasswordField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField4FocusLost(evt);
            }
        });
        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        jPasswordField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField4KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField4);
        jPasswordField4.setBounds(390, 290, 90, 30);

        jButton11.setBackground(new java.awt.Color(51, 204, 255));
        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton11.setText("Login");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(160, 410, 320, 60);

        jNameField3.setToolTipText("Name");
        jPanel1.add(jNameField3);
        jNameField3.setBounds(150, 70, 330, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("ACCOUNT NO");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 160, 120, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 70, 80, 30);

        jTextField3.setToolTipText("");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(150, 115, 330, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(570, 100, 500, 540);

        jLabel17.setBackground(new java.awt.Color(0, 204, 204));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("THREE FACTOR AUTHENTICATION TO SAFEGUARD AN ONLINE TRANSACTION");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 20, 1040, 50);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rgs.gif"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel18.setMaximumSize(new java.awt.Dimension(1000, 524));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(30, 90, 530, 540);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped

        String str = jTextField2.getText();


    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        Random objGenerator = new Random();

        String rdg="",rdg1="",rdg2="";
        int randomNumber = objGenerator.nextInt(100);
        rdg=randomNumber+"";

        jTextField2.setText(rdg);

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int bn=0;
            AesEncryption asc=new AesEncryption();
            String status="Active",amt="0000";
              
          //  Class.forName("com.mysql.jdbc.Driver");
          //  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/security","root","root");
          
          
            DBconnect co=new DBconnect();
            Connection con=co.connect();
            
            Statement st=con.createStatement();
            Statement ob=con.createStatement();
            
      if((jPasswordField1.getText().equals(""))||(jPasswordField2.getText().equals(""))||(jPasswordField3.getText().equals(""))||(jPasswordField4.getText().equals(""))||(jPasswordField5.getText().equals(""))||(jTextField1.getText().equals(""))||(jTextField2.getText().equals(""))||(jNameField3.getText().equals(""))){
          
                JOptionPane.showMessageDialog(null,"Please Enter All Values");   
          
         }else{
            ResultSet rs1=st.executeQuery("select * from register where account='"+asc.toEncrypt(jPasswordField1.getText().getBytes())+"' ");
            if(rs1.next()){
           this.setVisible(true);
                JOptionPane.showMessageDialog(null,"Account number Already Exist");
            }else{
                 bn=st.executeUpdate("insert into register values('"+jNameField3.getText().toString()+"','"+jTextField3.getText().toString() +"','"+asc.toEncrypt(jPasswordField1.getText().getBytes())+"','"+asc.toEncrypt(jPasswordField2.getText().getBytes())+"','"+asc.toEncrypt(jTextField2.getText().getBytes())+"','"+asc.toEncrypt(jPasswordField5.getText().getBytes())+"','"+asc.toEncrypt(jPasswordField6.getText().getBytes())+"','"+asc.toEncrypt(jTextField1.getText().getBytes())+"','"+asc.toEncrypt(jPasswordField4.getText().getBytes())+"','"+asc.toEncrypt(status.getBytes())+"','"+asc.toEncrypt(amt.getBytes())+"','','','','','','','','','')");
            
            if(bn==1){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Added Successfully");
                Register1 rs=new Register1(asc.toEncrypt(jPasswordField1.getText().getBytes()));
                rs.setVisible(true);

            }else{
                this.setVisible(true);
                JOptionPane.showMessageDialog(null,"Added Failed");
            } 
            }
      }             
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
           this.setVisible(false);
            Register rs11=new Register();
                rs11.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
     
    }//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jPasswordField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField3FocusLost
        if(jPasswordField1.getText().equals(jPasswordField3.getText())){
          //  JOptionPane.showMessageDialog(null,"Added");
        }else{
            JOptionPane.showMessageDialog(null,"Please Enter Account no Correctly");
        }
    }//GEN-LAST:event_jPasswordField3FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setVisible(false);
        jTextField2.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyTyped
         char c = evt.getKeyChar();
       if(!(Character.isAlphabetic(c) || (c==evt.VK_BACK_SPACE) || c==evt.VK_DELETE )) {
        evt.consume();  // ignore the event if it's not an alphabet
    }
   
    }//GEN-LAST:event_jPasswordField2KeyTyped

    private void jPasswordField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField5KeyTyped
          char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
        }
    }//GEN-LAST:event_jPasswordField5KeyTyped

    private void jPasswordField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField6KeyTyped
          char c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
        }
    }//GEN-LAST:event_jPasswordField6KeyTyped

    private void jPasswordField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField4KeyTyped
      char c = evt.getKeyChar();
       if(!(Character.isAlphabetic(c) || (c==evt.VK_BACK_SPACE) || c==evt.VK_DELETE )) {
        evt.consume();  // ignore the event if it's not an alphabet
    }
    }//GEN-LAST:event_jPasswordField4KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      jButton4.setVisible(false);
        jTextField1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    private void jPasswordField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField4FocusLost
        if(jPasswordField2.getText().equals(jPasswordField4.getText())){
           JOptionPane.showMessageDialog(null,"Please Enter Different ALPANUMERIC Password");
        }else{
           // JOptionPane.showMessageDialog(null,"Please Enter Account no Correctly");
        }
    }//GEN-LAST:event_jPasswordField4FocusLost

    private void jPasswordField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField6ActionPerformed
         if(jPasswordField5.getText().equals(jPasswordField6.getText())){
          JOptionPane.showMessageDialog(null,"Please Enter Different NUMERIC Password");
        }else{
            //JOptionPane.showMessageDialog(null,"Please Enter Account no Correctly");
        }
    }//GEN-LAST:event_jPasswordField6ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
       try{
            int bn=0;

    AesEncryption asc=new AesEncryption();
                             
            DBconnect co=new DBconnect();
            Connection con=co.connect();
            
            Statement st=con.createStatement();
            Statement ob=con.createStatement();
    
              ResultSet rs1=st.executeQuery("select * from register where account='"+asc.toEncrypt(jPasswordField1.getText().getBytes())+"' ");
            if(rs1.next()){
           this.setVisible(true);
                JOptionPane.showMessageDialog(null,"Account number Already Exist");
            }else{
             
            }
               
              
            
                             
                            
        }catch(Exception ex){
            ex.printStackTrace();
             if(ex.getMessage().contains("Duplicate entry") 
            && ex.getMessage().contains("for key")){
                JOptionPane.showMessageDialog(null,"Added Failed");

             }

        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        Home rs=new Home();
        rs.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jNameField3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
