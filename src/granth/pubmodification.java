/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granth;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MOHIT
 */
public class pubmodification extends javax.swing.JInternalFrame {
Connection c=null;
Statement s=null;
ResultSet rs=null;

    /**
     * Creates new form pubmodification
     */
    public pubmodification() {
        initComponents();
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","");
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,e.getMessage());
                    }
        
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        t5 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        t1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(507, 385));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 255));
        jLabel18.setText("                Publisher Information");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 458, 28));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 111, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 680, 0));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 111, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 680, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 80, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Publisher No./ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("  Landline No.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 139, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Phone/Mobile");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 320, -1));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/granth/abstract_colour_background_orange.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String qry="update pubconsole  set name='"+t2.getText()+"',address='"+t3.getText()+"',phone_no="+t4.getText()+",landline_no="+t5.getText()+" where publisher_id="+t1.getText()+"";
        try{
            s=c.createStatement();
            s.executeUpdate(qry);
          JOptionPane.showMessageDialog(rootPane,"INFORMATION UPDATED");
            
            
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(rootPane,e.getMessage());
          
        }
        
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText(""); t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t5.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String q="select * from pubconsole where publisher_id="+t1.getText()+"";
        try{
             s=c.createStatement();
            rs=s.executeQuery(q); 
     rs.next();     
     t2.setText(rs.getString("name"));
     t3.setText(rs.getString("address"));
    t4.setText(rs.getString("phone_no"));
     t5.setText(rs.getString("landline_no")); 

     
}
     catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
    
}  
        
                      
        
        
        
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        t5.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
