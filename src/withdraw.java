
import consents.consent;
import dataset.AESDecryption;
import dataset.AesEncryption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERUMAL
 */
public class withdraw extends javax.swing.JFrame {
    
     String a2="";
     consent c;
     String mail = null;
     AesEncryption asc;
     AESDecryption dsc;
     int v2=0;
     Connection con;
     Statement st;
    /**
     * Creates new form Register
     */
    public withdraw(String a1) {
        a2=a1;
        initComponents();
        c= new consent();
        this.setTitle(c.appname);
        
        try{
            
          asc=new AesEncryption();
          dsc=new AESDecryption();

          DBconnect co=new DBconnect();
          con=co.connect();
          
          st=con.createStatement();


            ResultSet rs1=st.executeQuery("select * from register where account='"+asc.toEncrypt(a2.getBytes())+"'");
            if(rs1.next()){
                v2=Integer.parseInt(dsc.toDeycrypt(rs1.getString("amount")));
                mail=rs1.getString("email");
               String val=v2+"";
                this.curbal.setText(val);

            }   
        } catch(Exception e){
            e.getMessage();
        }

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
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        curbal = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setMaximizedBounds(new java.awt.Rectangle(1100, 700, 1100, 700));
        setMaximumSize(new java.awt.Dimension(1500, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WITHDRAW FORM");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 360, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(140, 190, 80, 30);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(240, 190, 90, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(170, 130, 210, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText(":");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 80, 10, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Amount");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 130, 110, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Current Amount");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 80, 120, 40);

        curbal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        curbal.setText(".");
        jPanel1.add(curbal);
        curbal.setBounds(190, 80, 190, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 140, 450, 260);

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setText("LOG_OUT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(890, 110, 100, 40);

        jButton6.setBackground(new java.awt.Color(51, 204, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(90, 110, 140, 40);

        jLabel17.setBackground(new java.awt.Color(0, 204, 204));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("THREE FACTOR AUTHENTICATION TO SAFEGUARD AN ONLINE TRANSACTION");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 20, 1030, 50);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try{
          int v=0,v1=0,v3=0,v4=0,v5=0;
          
            
            Statement st1=con.createStatement();
            Date date = new Date();
            SimpleDateFormat sdf;

            sdf = new SimpleDateFormat("yyyy-MM-dd");
            String a15=sdf.format(date);  
            String transfer="WITHDRAWN";  

            
            v3=Integer.parseInt(jTextField2.getText());
            
            v4=v2-v3;

            v5=v1+v3;
            
            ResultSet rs2=st1.executeQuery("select max(tid) from transaction ");
            if(rs2.next()){
                v5=Integer.parseInt(rs2.getString(1))+1;
            }  
              String st5=v5+"";
              String st6=v4+"";
              
              v=st.executeUpdate("insert into transaction values('"+v5+"','"+asc.toEncrypt(a2.getBytes())+"','"+asc.toEncrypt(a2.getBytes())+"','"+asc.toEncrypt(jTextField2.getText().getBytes())+"','"+asc.toEncrypt(transfer.getBytes())+"','"+a15+"')");
               System.out.println(v4);
            if(v4>0){
                
              v=st.executeUpdate("update register set amount='"+asc.toEncrypt(st6.getBytes())+"' where account='"+asc.toEncrypt(a2.getBytes())+"'");
                        
            
              eMail email = new eMail();
              
            if(v==1){
                this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Withdraw Successfully");
             withdraw rs11=new withdraw(a2);
                rs11.setVisible(true);
                
                email.send(mail,"Hi " + a2 + ",\n" + c.withmessage +"\n Withdraw Amount "+ v3 + "\n Total Amount : " + v4,c.withsubject);
                
            }else{
                 this.setVisible(false);
                JOptionPane.showMessageDialog(null,"Withdraw Failed");
                withdraw rs11=new withdraw(a2);
                rs11.setVisible(true);
                
                email.send(mail,"Hi " + a2 + ",\n" + c.withmessage +"\n Withdraw Amount "+ v3 + "\n Total Amount : " + v4,c.withsubject);

            }
            } else{
                this.dispose();
                JOptionPane.showMessageDialog(null,"Withdraw Failed,you didn't have money");
                withdraw rs11=new withdraw(a2);
                rs11.setVisible(true);
            }
          
      }catch(Exception ex){
          ex.printStackTrace();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Home rs=new Home();
        rs.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           this.dispose();
              
                withdraw rs11=new withdraw(a2);
                rs11.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        atm rs11=new atm(a2);
        rs11.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new fund().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curbal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
