/*
lol
*/
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Niranjan
 */
public class home extends javax.swing.JFrame {
    public Connection connection;
    public PreparedStatement pstmt;
    public ResultSet rs;
    public ResultSetMetaData rsmd;
    public int flag=0;
    
    void initConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            try{
                connection = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-2U6J23R:1521:orcl","scott","tiger");
                System.out.println("Connected to the database");
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(this, "Connection Failed\n"+ex.getMessage());
            }
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, "Driver not found\n"+ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Unknown Error\n"+ex.getMessage());
        }
    }
    
    
    private void updateno_bookslent() {                                             
        try{
            String sql ="select count(*) as cnt from orders where return_date is null";
            pstmt =connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            rs.next();
            String numberbook= rs.getString("cnt");
            no_bookslent.setText(numberbook);
            
            
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }        
    
    
    private void updateno_books() {                                             
        try{
            String sql ="select count(*) as cnt from books";
            pstmt =connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            rs.next();
            String numberbook= rs.getString("cnt");
            books.setText(numberbook);
            
            
        }
        catch( Exception e ){
            e.printStackTrace();
        }
    }        
    
    
    public home() {
        initComponents();
        initConnection();
        updateno_bookslent();
        updateno_books();
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
        jPanel3 = new javax.swing.JPanel();
        newmem_bt_hp = new javax.swing.JButton();
        Viewbookbtn = new javax.swing.JButton();
        lendbook_bt_hp1 = new javax.swing.JButton();
        newbook_bt_hp2 = new javax.swing.JButton();
        lendbook_bt_hp2 = new javax.swing.JButton();
        Viewmemberbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        no_bookslent = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        books = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 36, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newmem_bt_hp.setBackground(new java.awt.Color(204, 204, 255));
        newmem_bt_hp.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        newmem_bt_hp.setForeground(new java.awt.Color(0, 0, 102));
        newmem_bt_hp.setText("New Member");
        newmem_bt_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmem_bt_hpActionPerformed(evt);
            }
        });
        jPanel3.add(newmem_bt_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 140, 43));

        Viewbookbtn.setBackground(new java.awt.Color(204, 204, 255));
        Viewbookbtn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Viewbookbtn.setForeground(new java.awt.Color(0, 0, 102));
        Viewbookbtn.setText("View Books");
        Viewbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbookbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Viewbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 40));

        lendbook_bt_hp1.setBackground(new java.awt.Color(204, 204, 255));
        lendbook_bt_hp1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lendbook_bt_hp1.setForeground(new java.awt.Color(0, 0, 102));
        lendbook_bt_hp1.setText("Return Book");
        lendbook_bt_hp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendbook_bt_hp1ActionPerformed(evt);
            }
        });
        jPanel3.add(lendbook_bt_hp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 140, 40));

        newbook_bt_hp2.setBackground(new java.awt.Color(204, 204, 255));
        newbook_bt_hp2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        newbook_bt_hp2.setForeground(new java.awt.Color(0, 0, 102));
        newbook_bt_hp2.setText("New Book");
        newbook_bt_hp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbook_bt_hp2ActionPerformed(evt);
            }
        });
        jPanel3.add(newbook_bt_hp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 140, 40));

        lendbook_bt_hp2.setBackground(new java.awt.Color(204, 204, 255));
        lendbook_bt_hp2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        lendbook_bt_hp2.setForeground(new java.awt.Color(0, 0, 102));
        lendbook_bt_hp2.setText("Lend Book");
        lendbook_bt_hp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendbook_bt_hp2ActionPerformed(evt);
            }
        });
        jPanel3.add(lendbook_bt_hp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, 40));

        Viewmemberbtn.setBackground(new java.awt.Color(204, 204, 255));
        Viewmemberbtn.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        Viewmemberbtn.setForeground(new java.awt.Color(0, 0, 102));
        Viewmemberbtn.setText("View Members");
        Viewmemberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewmemberbtnActionPerformed(evt);
            }
        });
        jPanel3.add(Viewmemberbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 140, 470));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 50));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no_bookslent.setBackground(new java.awt.Color(204, 204, 255));
        no_bookslent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        no_bookslent.setText("----");
        no_bookslent.setBorder(null);
        no_bookslent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_bookslentActionPerformed(evt);
            }
        });
        jPanel4.add(no_bookslent, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jTextField3.setBackground(new java.awt.Color(204, 204, 255));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setText("Books lent");
        jTextField3.setBorder(null);
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 150, 100));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setBackground(new java.awt.Color(204, 204, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setText("Total Books");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        books.setText("-----");
        jPanel6.add(books, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 60, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 150, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lendbook_bt_hp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendbook_bt_hp1ActionPerformed
        returnBook newlb = new returnBook();
        newlb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lendbook_bt_hp1ActionPerformed

    private void ViewbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbookbtnActionPerformed
        Bookspage newbBookRegPage = new Bookspage();
        newbBookRegPage.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_ViewbookbtnActionPerformed

    private void newbook_bt_hp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbook_bt_hp2ActionPerformed
        bookReg newbookreg = new bookReg();
        newbookreg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newbook_bt_hp2ActionPerformed

    private void lendbook_bt_hp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendbook_bt_hp2ActionPerformed
        LendBook lb = new LendBook();
        lb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lendbook_bt_hp2ActionPerformed

    private void no_bookslentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_bookslentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_bookslentActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void newmem_bt_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmem_bt_hpActionPerformed
        memReg newmemreg = new memReg();
        newmemreg.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_newmem_bt_hpActionPerformed

    private void ViewmemberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewmemberbtnActionPerformed
        Memberspage newbMemberRegPage = new Memberspage();
        newbMemberRegPage.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_ViewmemberbtnActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Viewbookbtn;
    private javax.swing.JButton Viewmemberbtn;
    private javax.swing.JLabel books;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton lendbook_bt_hp1;
    private javax.swing.JButton lendbook_bt_hp2;
    private javax.swing.JButton newbook_bt_hp2;
    private javax.swing.JButton newmem_bt_hp;
    private javax.swing.JTextField no_bookslent;
    // End of variables declaration//GEN-END:variables
}
