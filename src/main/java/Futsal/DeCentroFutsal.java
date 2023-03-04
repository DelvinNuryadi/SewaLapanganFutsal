/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Futsal;

/**
 *
 * @author me
 */
public class DeCentroFutsal extends javax.swing.JFrame {

    /**
     * Creates new form DeCentroFutsal
     */
    public DeCentroFutsal() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbJenisMember = new javax.swing.JComboBox<>();
        cmbJenisLapangan = new javax.swing.JComboBox<>();
        cmbFasToolkit = new javax.swing.JComboBox<>();
        txtJumlahJam = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnHitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtJenisMember = new javax.swing.JTextField();
        txtJenisLapangan = new javax.swing.JTextField();
        txtFasToolkit = new javax.swing.JTextField();
        txtHargaSewa = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        txtTotalBayar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("De Centro Futsal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DE CENTRO FUTSAL");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Jenis Member");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Jenis Lapangan");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jenis Fasilitas toolkit");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Jumlah jam");

        cmbJenisMember.setBackground(new java.awt.Color(255, 255, 255));
        cmbJenisMember.setForeground(new java.awt.Color(51, 51, 51));
        cmbJenisMember.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Non Member" }));
        cmbJenisMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisMemberActionPerformed(evt);
            }
        });

        cmbJenisLapangan.setBackground(new java.awt.Color(255, 255, 255));
        cmbJenisLapangan.setForeground(new java.awt.Color(51, 51, 51));
        cmbJenisLapangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rumput Sintetis", "Matras", "Beton" }));

        cmbFasToolkit.setBackground(new java.awt.Color(255, 255, 255));
        cmbFasToolkit.setForeground(new java.awt.Color(51, 51, 51));
        cmbFasToolkit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Full", "None" }));
        cmbFasToolkit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFasToolkitActionPerformed(evt);
            }
        });

        txtJumlahJam.setBackground(new java.awt.Color(255, 255, 255));

        btnHitung.setBackground(new java.awt.Color(255, 255, 255));
        btnHitung.setForeground(new java.awt.Color(51, 51, 51));
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Jenis Member");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Jenis Lapangan");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Jenis Fasilitas toolkit");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Harga Sewa");

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Diskon");

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Total Bayar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbJenisMember, 0, 241, Short.MAX_VALUE)
                                    .addComponent(cmbJenisLapangan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbFasToolkit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtJumlahJam))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtJenisMember)
                                .addComponent(txtJenisLapangan)
                                .addComponent(txtFasToolkit)
                                .addComponent(txtHargaSewa)
                                .addComponent(txtDiskon)
                                .addComponent(txtTotalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbJenisMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbJenisLapangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbFasToolkit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtJumlahJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHitung)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJenisMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtJenisLapangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtFasToolkit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbFasToolkitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFasToolkitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFasToolkitActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        double diskon = 0;
        double totalBayar = 0;
        double hargaSewa = 0;
        int jam = Integer.parseInt(txtJumlahJam.getText());
        
        String member = cmbJenisMember.getSelectedItem().toString();
        txtJenisMember.setText(member);
        
        String lapangan = cmbJenisLapangan.getSelectedItem().toString();
        txtJenisLapangan.setText(lapangan);
        
        String fastoolkit =cmbFasToolkit.getSelectedItem().toString();
        txtFasToolkit.setText(fastoolkit);
        
        
        //if member
        if(cmbJenisMember.getSelectedItem().equals("Member")){
             txtDiskon.setText("10%     - -Harga Sewa- -");
            //if member rumput sintetis
            if(cmbJenisLapangan.getSelectedItem().equals("Rumput Sintetis")){
                   hargaSewa = 250000 * jam;
                   diskon = hargaSewa * 10/100;
                   txtHargaSewa.setText(Double.toString(hargaSewa));                  
               //if fastoolkit full
                  if(cmbFasToolkit.getSelectedItem().equals("Full")){
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - -Rp 100000- -");
                   totalBayar = hargaSewa + 100000;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp " + Double.toString(totalBayar));            
                   }                      
               //if fastoolkit none
                  else{
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - Rp 0 -");
                   totalBayar = hargaSewa + 0;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText(Double.toString(totalBayar));            
               }
            }
            
            //if member matras
            else if(cmbJenisLapangan.getSelectedItem().equals("Matras")){
               hargaSewa = 200000 * jam;
               diskon = hargaSewa * 10/100;
               txtHargaSewa.setText(Double.toString(hargaSewa));
               
                //if fastoolkit full
               if(cmbFasToolkit.getSelectedItem().equals("Full")){
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - -Rp 100000- -");
                   totalBayar = hargaSewa + 100000;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText(Double.toString(totalBayar));            
               }         
               //if fastoolkit none
               else{
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - Rp 0 -");
                   totalBayar = hargaSewa + 0;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText(Double.toString(totalBayar));            
               }
            }
            
            //if member matras
            else if(cmbJenisLapangan.getSelectedItem().equals("Beton")){
               hargaSewa = 150000 * jam;
               diskon = hargaSewa * 10/100;
               txtHargaSewa.setText(Double.toString(hargaSewa));
               
                //if fastoolkit full
               if(cmbFasToolkit.getSelectedItem().equals("Full")){
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - -Rp 100000- -");
                   totalBayar = hargaSewa + 100000;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText(Double.toString(totalBayar));            
               }         
               //if fastoolkit none
               else{
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - Rp 0 -");
                   totalBayar = hargaSewa + 0;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText(Double.toString(totalBayar));            
               }
            }
        }
        
        
        
        
        //if non member
        else{
            txtDiskon.setText("5%     - -Harga Sewa- -");
            // if non member rumput sintetis
             if(cmbJenisLapangan.getSelectedItem().equals("Rumput Sintetis")){
               hargaSewa = 300000 * jam;
               diskon = hargaSewa * 5/100;
               txtHargaSewa.setText(Double.toString(hargaSewa));
               
                //if fastoolkit full
               if(cmbFasToolkit.getSelectedItem().equals("Full")){
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - -Rp 100000- -");
                   totalBayar = hargaSewa + 100000;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp " + Double.toString(totalBayar));            
               }         
               //if fastoolkit none
               else{
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - Rp 0 -");
                   totalBayar = hargaSewa + 0;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp " + Double.toString(totalBayar));            
               }     
            }
             
               //if non member matras
            else if(cmbJenisLapangan.getSelectedItem().equals("Matras")){
               hargaSewa = 250000 * jam;
               diskon = hargaSewa * 5/100;
               txtHargaSewa.setText(Double.toString(hargaSewa));
                //if fastoolkit full
               if(cmbFasToolkit.getSelectedItem().equals("Full")){
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - -Rp 100000- -");
                   totalBayar = hargaSewa + 100000;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp " + Double.toString(totalBayar));            
               }         
               //if fastoolkit none
               else{
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - Rp 0 -");
                   totalBayar = hargaSewa + 0;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp " + Double.toString(totalBayar));            
               }
            }
            
            //if non member matras
            else if(cmbJenisLapangan.getSelectedItem().equals("Beton")){
               hargaSewa = 200000 * jam;
               diskon = hargaSewa * 5/100;
               txtHargaSewa.setText(Double.toString(hargaSewa));
                //if fastoolkit full
               if(cmbFasToolkit.getSelectedItem().equals("Full")){
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - -Rp 100000- -");
                   totalBayar = hargaSewa + 100000;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp "+Double.toString(totalBayar));            
               }         
               //if fastoolkit none
               else{
                   txtFasToolkit.setText(cmbFasToolkit.getSelectedItem()+"     - Rp 0 -");
                   totalBayar = hargaSewa + 0;
                   totalBayar = totalBayar - diskon;
                   txtTotalBayar.setText("Rp "+Double.toString(totalBayar));            
               }
            }
        }
        
    }//GEN-LAST:event_btnHitungActionPerformed

    private void cmbJenisMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJenisMemberActionPerformed

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
            java.util.logging.Logger.getLogger(DeCentroFutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeCentroFutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeCentroFutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeCentroFutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeCentroFutsal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cmbFasToolkit;
    private javax.swing.JComboBox<String> cmbJenisLapangan;
    private javax.swing.JComboBox<String> cmbJenisMember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtFasToolkit;
    private javax.swing.JTextField txtHargaSewa;
    private javax.swing.JTextField txtJenisLapangan;
    private javax.swing.JTextField txtJenisMember;
    private javax.swing.JTextField txtJumlahJam;
    private javax.swing.JTextField txtTotalBayar;
    // End of variables declaration//GEN-END:variables
}
