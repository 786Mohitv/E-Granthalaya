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
public class pubsearch extends javax.swing.JInternalFrame {
Connection c=null;
Statement s;
ResultSet rs=null;
String q="select * from pubconsole";


    

   
    /**
     * Creates new form pubsearch
     */
    public pubsearch() {
  
        initComponents();
        a.setEnabled(false);
     as.setEnabled(false);
     sa.setEnabled(false);
     t2.setEditable(false);
     t3.setEditable(false);
     t4.setEditable(false);
     t1.setEditable(false);
     t5.setEditable(false);
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","");
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,e.getMessage());
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

        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        t1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        as = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        a = new javax.swing.JButton();
        sa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(555, 419));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 162, -1, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 534, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("  Landline No.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 188, -1, -1));

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 212, 111, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 134, 139, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 331, 524, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 102, 80, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Phone/Mobile");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 214, -1, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 160, 179, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Publisher No./ID");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 104, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("                Publisher Information");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, 497, 28));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 133, -1, 20));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 186, 111, -1));

        as.setText("NEXT");
        as.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asActionPerformed(evt);
            }
        });
        getContentPane().add(as, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 344, -1, -1));

        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 344, -1, -1));

        jButton1.setText("FIRST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 344, -1, -1));

        a.setText("PREVIOUS");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 344, -1, -1));

        sa.setText("LAST");
        sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saActionPerformed(evt);
            }
        });
        getContentPane().add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 344, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/granth/abstract_colour_background_orange.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asActionPerformed

        try{
    
            if(rs.next())
            {
     t1.setText(rs.getString("publisher_id"));
     t2.setText(rs.getString("name"));
     t3.setText(rs.getString("address"));
    t4.setText(rs.getString("phone_no"));
     t5.setText(rs.getString("landline_no"));  
            }
        else
                   JOptionPane.showMessageDialog(rootPane,"You Are At The Last Record ");
                }
     catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
    
}               
    }//GEN-LAST:event_asActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         try{
             s=c.createStatement();
            rs=s.executeQuery(q); 
     if(rs.first())
     {
     t1.setText(rs.getString("publisher_id"));
     t2.setText(rs.getString("name"));
     t3.setText(rs.getString("address"));
    t4.setText(rs.getString("phone_no"));
     t5.setText(rs.getString("landline_no")); 
     a.setEnabled(true);
     as.setEnabled(true);
     sa.setEnabled(true);
     }
        else
         JOptionPane.showMessageDialog(rootPane,"You Are Already At The First Record");
        }
     catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
    
}

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
       try{
    
            if(rs.previous())
            {
     t1.setText(rs.getString("publisher_id"));
     t2.setText(rs.getString("name"));
     t3.setText(rs.getString("address"));
    t4.setText(rs.getString("phone_no"));
     t5.setText(rs.getString("landline_no"));  
            }
        else
                   JOptionPane.showMessageDialog(rootPane,"You Are At The First Record ");
                }
     catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
    
}               
    }//GEN-LAST:event_aActionPerformed

    private void saActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saActionPerformed
        try{
    
            if(rs.last())
            {
     t1.setText(rs.getString("publisher_id"));
     t2.setText(rs.getString("name"));
     t3.setText(rs.getString("address"));
    t4.setText(rs.getString("phone_no"));
     t5.setText(rs.getString("landline_no"));  
            }
        else
                   JOptionPane.showMessageDialog(rootPane,"You Are Already At The Last Record ");
                }
     catch(Exception e)
{
    JOptionPane.showMessageDialog(rootPane,e.getMessage());
    
}               
    }//GEN-LAST:event_saActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton as;
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
    private javax.swing.JButton sa;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
