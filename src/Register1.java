import dataset.AesEncryption;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SMK
 */
public class Register1 extends javax.swing.JFrame {
String a2="";int id,c=0;
 String a,b=null;
    /**
     * Creates new form Register
     */
    public Register1(String as) {
        a2=as;
        initComponents();
        
        
            
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(1100, 700, 1100, 700));
        setMaximumSize(new java.awt.Dimension(1500, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 270, 84, 30);

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
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 290, 50, 30);
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

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("Question");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(50, 150, 70, 20);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setText("Answer");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(50, 210, 60, 20);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(130, 140, 300, 30);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(130, 200, 300, 30);

        jLabel7.setBackground(new java.awt.Color(0, 102, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LEVEL 2");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 60, 350, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(590, 90, 490, 540);

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
        jLabel18.setBounds(30, 90, 550, 540);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int bn=0;

    AesEncryption asc=new AesEncryption();
                  
                      
            DBconnect co=new DBconnect();
            Connection con=co.connect(); 
            Statement st=con.createStatement();
            Statement ob=con.createStatement();
            int s10 = 0, s11 = 0, s12 = 0,  cal11 = 0, cal12 = 0, cal13 = 0;
            int mul1=1,mul2=1,mul3=1;
            String v111="",v112="",v113="";
            
           if((jTextField10.getText().equals(""))||(jTextField11.getText().equals(""))){
                JOptionPane.showMessageDialog(null,"Please Enter all value");
           }else{
                bn=st.executeUpdate("update register set ques='"+asc.toEncrypt(jTextField10.getText().getBytes())+"',ans='"+asc.toEncrypt(jTextField11.getText().getBytes())+"' where account='"+a2+"'");
            
            if(bn==1){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Added Successfully");
//                Register2 rs=new Register2(a2);
//                rs.setVisible(true);
                  new test(a2);
            }else{
                this.setVisible(true);
                JOptionPane.showMessageDialog(null,"Added Failed");
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
               // new Register1(a2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    // End of variables declaration//GEN-END:variables
}
