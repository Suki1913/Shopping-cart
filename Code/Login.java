public class Login extends javax.swing.JFrame {
/**
* Creates new form Login
*/
public Login() {
initComponents();
}
public Login(String para){
initComponents();
}
/**
* This method is called from within the constructor to initialize the form. *
WARNING: Do NOT modify this code. The content of this method is always *
regenerated by the Form Editor.
*/
@SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
private void initComponents() {
jSeparator1 = new javax.swing.JSeparator();
jLabel7 = new javax.swing.JLabel();
jPanel2 = new javax.swing.JPanel();
jLabel2 = new javax.swing.JLabel();
jToggleButton1 = new javax.swing.JToggleButton();
jLabel15 = new javax.swing.JLabel();
jScrollPane1 = new javax.swing.JScrollPane();
jPanel5 = new javax.swing.JPanel();
jLabel3 = new javax.swing.JLabel();
jLabel30 = new javax.swing.JLabel();
jLabel31 = new javax.swing.JLabel();
jLabel32 = new javax.swing.JLabel();
jLabel33 = new javax.swing.JLabel();
jLabel34 = new javax.swing.JLabel();
jLabel35 = new javax.swing.JLabel();
jLabel36 = new javax.swing.JLabel();
jLabel37 = new javax.swing.JLabel();
jLabel38 = new javax.swing.JLabel();
jLabel39 = new javax.swing.JLabel();
jLabel40 = new javax.swing.JLabel();
jLabel41 = new javax.swing.JLabel();
jRadioButton1 = new javax.swing.JRadioButton();
jRadioButton2 = new javax.swing.JRadioButton();
jRadioButton3 = new javax.swing.JRadioButton();
jRadioButton4 = new javax.swing.JRadioButton();
jLabel1 = new javax.swing.JLabel();
jLabel5 = new javax.swing.JLabel();
jLabel4 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
jLabel6 = new javax.swing.JLabel();
jMenuBar1 = new javax.swing.JMenuBar();
jMenu1 = new javax.swing.JMenu();
jMenuItem1 = new javax.swing.JMenuItem();
jMenuItem2 = new javax.swing.JMenuItem();
jMenuItem3 = new javax.swing.JMenuItem();
jLabel7.setText("jLabel7");
setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
setBackground(new java.awt.Color(102, 102, 102));
setPreferredSize(new java.awt.Dimension(950, 600));
setSize(new java.awt.Dimension(880, 520));
getContentPane().setLayout(null);
jPanel2.setBackground(new java.awt.Color(0, 153, 204));
jPanel2.setMinimumSize(new java.awt.Dimension(920, 90));
jPanel2.setPreferredSize(new java.awt.Dimension(800, 90));
jLabel2.setBackground(new java.awt.Color(153, 153, 153));
jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
jLabel2.setForeground(new java.awt.Color(204, 204, 204));
jLabel2.setText("Welcome");
jToggleButton1.setText("Theme");
jToggleButton1.setActionCommand("L Theme");
jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jToggleButton1ActionPerformed(evt);
}
});
javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
jPanel2.setLayout(jPanel2Layout);
jPanel2Layout.setHorizontalGroup(
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap(330, Short.MAX_VALUE)
.addComponent(jLabel2)
.addGap(283, 283, 283)
.addComponent(jToggleButton1)
.addGap(58, 58, 58))
);
jPanel2Layout.setVerticalGroup(
jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel2Layout.createSequentialGroup()
.addContainerGap()
.addComponent(jToggleButton1)
.addContainerGap(56, Short.MAX_VALUE))
.addGroup(jPanel2Layout.createSequentialGroup()
.addComponent(jLabel2)
.addGap(0, 0, Short.MAX_VALUE))
);
getContentPane().add(jPanel2);
jPanel2.setBounds(0, 0, 940, 70);
jLabel15.setBackground(new java.awt.Color(51, 51, 51));
jLabel15.setForeground(new java.awt.Color(102, 102, 102));
jLabel15.setOpaque(true);
getContentPane().add(jLabel15);
jLabel15.setBounds(0, 96, 1000, 0);
jPanel5.setBackground(new java.awt.Color(51, 51, 51));
jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new
javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC Project\\logo1.jpg"))); // NOI18N
jPanel5.setForeground(new java.awt.Color(48, 45, 45));
jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC Project\\mug.jpg")); //
NOI18N
jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel30.setForeground(new java.awt.Color(204, 204, 204));
jLabel30.setText("Mug");
jLabel31.setBackground(new java.awt.Color(204, 204, 204));
jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel31.setForeground(new java.awt.Color(204, 204, 204));
jLabel31.setText("$ 2");
jLabel32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC
Project\\clock.jpg")); // NOI18N
jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel33.setForeground(new java.awt.Color(204, 204, 204));
jLabel33.setText("Analog Clock");
jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel34.setForeground(new java.awt.Color(204, 204, 204));
jLabel34.setText("$ 4");
jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC
Project\\bottle.jpg")); // NOI18N
jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel36.setForeground(new java.awt.Color(204, 204, 204));
jLabel36.setText("Water Bottle");
jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel37.setForeground(new java.awt.Color(204, 204, 204));
jLabel37.setText("$ 3");
jLabel38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC
Project\\shoe.jpg")); // NOI18N
jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
jLabel39.setForeground(new java.awt.Color(204, 204, 204));
jLabel39.setText("Sneakers");
jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jLabel40.setForeground(new java.awt.Color(204, 204, 204));
jLabel40.setText("$ 8");
jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jRadioButton1.setForeground(new java.awt.Color(204, 204, 204));
jRadioButton1.setText("Add to cart");
jRadioButton1.setOpaque(false);
jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton1ActionPerformed(evt);
}
});
jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jRadioButton2.setForeground(new java.awt.Color(204, 204, 204));
jRadioButton2.setText("Add to cart");
jRadioButton2.setOpaque(false);
jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton2ActionPerformed(evt);
}
});
jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jRadioButton3.setForeground(new java.awt.Color(204, 204, 204));
jRadioButton3.setText("Add to cart");
jRadioButton3.setOpaque(false);
jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton3ActionPerformed(evt);
}
});
jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
jRadioButton4.setForeground(new java.awt.Color(204, 204, 204));
jRadioButton4.setText("Add to cart");
jRadioButton4.setOpaque(false);
jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton4ActionPerformed(evt);
}
});
javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
jPanel5.setLayout(jPanel5Layout);
jPanel5Layout.setHorizontalGroup(
jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel41)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(120, 120, 120)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING
)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 218,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 198,
javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(jLabel38)
.addGap(20, 20, 20)))
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING
) .addGroup(jPanel5Layout.createSequentialGroup()
.addGap(85, 85, 85)
.addComponent(jLabel40))
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(43, 43, 43)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING
) .addComponent(jRadioButton1)
.addComponent(jRadioButton2)))
.addGroup(jPanel5Layout.createSequentialGroup() .addGap(84, 84, 84)
.addComponent(jLabel34))
.addGroup(jPanel5Layout.createSequentialGroup() .addGap(39, 39, 39)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING
) .addComponent(jLabel36)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING
)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING
) .addComponent(jLabel39)
.addComponent(jRadioButton3))
.addGroup(jPanel5Layout.createSequentialGroup() .addGap(13, 13, 13)
.addComponent(jRadioButton4)))))
.addGroup(jPanel5Layout.createSequentialGroup() .addGap(84, 84, 84)
.addComponent(jLabel37))))
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(71, 71, 71)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING
) .addComponent(jLabel33)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(12, 12, 12)
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING
) .addComponent(jLabel30)
.addComponent(jLabel31))))))))
.addContainerGap(113, Short.MAX_VALUE))
);
jPanel5Layout.setVerticalGroup(
jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(66, 66, 66)
.addComponent(jLabel30)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jLabel31)
.addGap(18, 18, 18)
.addComponent(jRadioButton1))
.addGroup(jPanel5Layout.createSequentialGroup()
.addComponent(jLabel41)
.addGap(20, 20, 20)
.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
javax.swing.GroupLayout.PREFERRED_SIZE)))
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(103, 103, 103)
.addComponent(jLabel33)
.addGap(18, 18, 18)
.addComponent(jLabel34)
.addGap(19, 19, 19)
.addComponent(jRadioButton2))
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(62, 62, 62)
.addComponent(jLabel32)))
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(159, 159, 159)
.addComponent(jLabel36)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(18, 18, 18)
.addComponent(jRadioButton3)
.addGap(87, 87, 87))
.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED) .addComponent(jLabel35,
javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGap(2, 2, 2)))
.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(92, 92, 92)
.addComponent(jLabel39)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addComponent(jRadioButton4))
.addGroup(jPanel5Layout.createSequentialGroup()
.addGap(66, 66, 66)
.addComponent(jLabel38)))
.addContainerGap(70, Short.MAX_VALUE))
);
jScrollPane1.setViewportView(jPanel5);
getContentPane().add(jScrollPane1);
jScrollPane1.setBounds(30, 150, 600, 370);
jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
jLabel1.setForeground(new java.awt.Color(204, 0, 0));
jLabel1.setText("Todays Deals ..!");
getContentPane().add(jLabel1);
jLabel1.setBounds(330, 90, 330, 51);
jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
jLabel5.setForeground(new java.awt.Color(204, 0, 0));
jLabel5.setText("Sub Total :");
getContentPane().add(jLabel5);
jLabel5.setBounds(650, 200, 140, 60);
jLabel4.setBackground(new java.awt.Color(255, 255, 255));
jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
jLabel4.setText("$ 0.00");
jLabel4.setOpaque(true);
getContentPane().add(jLabel4);
jLabel4.setBounds(720, 260, 70, 40);
jButton1.setBackground(new java.awt.Color(0, 204, 0));
jButton1.setText("Place Order");
jButton1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jButton1ActionPerformed(evt);
}
});
getContentPane().add(jButton1);
jButton1.setBounds(700, 320, 110, 30);
jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC
Project\\logo1.jpg")); // NOI18N
getContentPane().add(jLabel6);
jLabel6.setBounds(0, 80, 1000, 990);
jMenu1.setText("MENU");
jMenuItem1.setText("HOME");
jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem1ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem1);
jMenuItem2.setText("LOGOUT");
jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem2ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem2);
jMenuItem3.setText("QUIT");
jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
jMenuItem3ActionPerformed(evt);
}
});
jMenu1.add(jMenuItem3);
jMenuBar1.add(jMenu1);
setJMenuBar(jMenuBar1);
pack();
setLocationRelativeTo(null);
}// </editor-fold>
private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
if(jToggleButton1.isSelected()){
jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC
Project\\logo2.jpg"));
}
else{
jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sukith Devadiga\\Desktop\\OOC
Project\\logo1.jpg"));
} // TODO add your handling code here:
}
private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
this.setVisible(false);
new Main().setVisible(true);
// TODO add your handling code here:
}
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
this.setVisible(false);
new Login().setVisible(true); // TODO add your handling code here: }
private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
System.exit(0); // TODO add your handling code here:
}
static int billAmount = 0;
private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
if (jRadioButton1.isSelected()) {
billAmount=billAmount+2;
} else {
billAmount=billAmount-2;
if(billAmount<0){
billAmount=0;
}
}
jLabel4.setText(" $ "+String.valueOf(billAmount));// TODO add your handling code here: }
private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
if (jRadioButton2.isSelected()) {
billAmount=billAmount+4;
} else {
billAmount=billAmount-4;
}
jLabel4.setText(" $ "+String.valueOf(billAmount)); // TODO add your handling code here: }
private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
if (jRadioButton3.isSelected()) {
billAmount=billAmount+3;
} else {
billAmount=billAmount-3;
}
jLabel4.setText(" $ "+String.valueOf(billAmount)); // TODO add your handling code here: }
private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
if (jRadioButton4.isSelected()) {
billAmount=billAmount+8;
} else {
billAmount=billAmount-8;
}
jLabel4.setText(" $ "+String.valueOf(billAmount)); // TODO add your handling code here: }
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
this.setVisible(false);
String msg = jLabel4.getText();
new Payment(msg).setVisible(true);
jLabel4.setText(null);
// TODO add your handling code here:
}
/**
* @param args the command line arguments
*/
public static void main(String args[]) {
/* Set the Nimbus look and feel */
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) "> /* If
Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. * For
details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html */
try {
for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) { if
("Nimbus".equals(info.getName())) {
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
} catch (ClassNotFoundException ex) {
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); } catch
(InstantiationException ex) {
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); } catch
(IllegalAccessException ex) {
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); } catch
(javax.swing.UnsupportedLookAndFeelException ex) {
java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); }
//</editor-fold>
/* Create and display the form */
java.awt.EventQueue.invokeLater(new Runnable() {
public void run() {
new Login().setVisible(true);
}
});
}
// Variables declaration - do not modify
private javax.swing.JButton jButton1;
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel15;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel30;
private javax.swing.JLabel jLabel31;
private javax.swing.JLabel jLabel32;
private javax.swing.JLabel jLabel33;
private javax.swing.JLabel jLabel34;
private javax.swing.JLabel jLabel35;
private javax.swing.JLabel jLabel36;
private javax.swing.JLabel jLabel37;
private javax.swing.JLabel jLabel38;
private javax.swing.JLabel jLabel39;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel40;
private javax.swing.JLabel jLabel41;
private javax.swing.JLabel jLabel5;
private javax.swing.JLabel jLabel6;
private javax.swing.JLabel jLabel7;
private javax.swing.JMenu jMenu1;
private javax.swing.JMenuBar jMenuBar1;
private javax.swing.JMenuItem jMenuItem1;
private javax.swing.JMenuItem jMenuItem2;
private javax.swing.JMenuItem jMenuItem3;
private javax.swing.JPanel jPanel2;
private javax.swing.JPanel jPanel5;
private javax.swing.JRadioButton jRadioButton1;
private javax.swing.JRadioButton jRadioButton2;
private javax.swing.JRadioButton jRadioButton3;
private javax.swing.JRadioButton jRadioButton4;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JSeparator jSeparator1;
private javax.swing.JToggleButton jToggleButton1;
// End of variables declaration
}