/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DomainModels.DichVu;
import DomainModels.Dien;
import Service.IServiceDichVu;
import Service.impl.ServiceDichVuImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewDichVu extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private IServiceDichVu serviceDichVu = new ServiceDichVuImpl();

    /**
     * Creates new form ViewPhong
     */
    public ViewDichVu() {
        initComponents();
        loadTable(serviceDichVu.getAllData());
    }

    public void loadTable(List<DichVu> list) {
        dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (DichVu d : list) {
            dtm.addRow(new Object[]{
                d.getId(), d.getMa(), d.getTen(), d.getThanhTien(), d.getNgayTao(), d.getNgaySua(),
                d.htTrangThai()
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdNgayTao = new com.toedter.calendar.JDateChooser();
        jdNgaySua = new com.toedter.calendar.JDateChooser();
        txtMa = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        rdoCo = new javax.swing.JRadioButton();
        rdoKhong = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã");

        jLabel2.setText("Tên");

        jLabel3.setText("Thành tiền");

        jLabel5.setText("Ngày tạo");

        jLabel6.setText("Ngày sửa");

        jLabel7.setText("Trạng thái");

        buttonGroup1.add(rdoCo);
        rdoCo.setText("Có");

        buttonGroup1.add(rdoKhong);
        rdoKhong.setText("Không");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên", "Thành tiền", "Ngày tạo", "Ngày sửa", "Trạng thái"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdNgaySua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(rdoCo)
                        .addGap(18, 18, 18)
                        .addComponent(rdoKhong)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jdNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rdoCo)
                            .addComponent(rdoKhong))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(btSua))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBack)
                            .addComponent(btXoa))))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên được để trống");
        } else if (txtThanhTien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thành tiền không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCo.isSelected() && !rdoKhong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtMa.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Mã không được vượt quá 20 kí tự");
        } else if (txtTen.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Tên không được vượt quá 20 kí tự");
        } else if (txtThanhTien.getText().matches("^[0-9]{0,10}+") == false) {
            JOptionPane.showMessageDialog(this, "Thành tiền phải là nguyên dương không được vượt quá 10 kí tự");
        } else if (serviceDichVu.findByMa(txtMa.getText()).equals(txtMa.getText())) {
            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            DichVu dv = new DichVu();
            dv.setMa(txtMa.getText());
            dv.setTen(txtTen.getText());
            dv.setThanhTien(Double.parseDouble(txtThanhTien.getText()));
            dv.setNgayTao(jdNgayTao.getDate());
            dv.setNgaySua(jdNgaySua.getDate());
            if (rdoCo.isSelected()) {
                dv.setTrangThai(1);
            } else {
                dv.setTrangThai(0);
            }
            serviceDichVu.save(dv);
            loadTable(serviceDichVu.getAllData());
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên được để trống");
        } else if (txtThanhTien.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Thành tiền không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCo.isSelected() && !rdoKhong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtMa.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Mã không được vượt quá 20 kí tự");
        } else if (txtTen.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Tên không được vượt quá 20 kí tự");
        } else if (txtThanhTien.getText().matches("^[0-9]{0,10}+") == false) {
            JOptionPane.showMessageDialog(this, "Thành tiền phải là nguyên dương không được vượt quá 10 kí tự");
//        } else if (serviceDichVu.findByMa(txtMa.getText()).equals(txtMa.getText())) {
//            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            int index = jTable1.getSelectedRow();
            DichVu dv = serviceDichVu.getAllData().get(index);
            dv.setMa(txtMa.getText());
            dv.setTen(txtTen.getText());
            dv.setThanhTien(Double.parseDouble(txtThanhTien.getText()));
            dv.setNgayTao(jdNgayTao.getDate());
            dv.setNgaySua(jdNgaySua.getDate());
            if (rdoCo.isSelected()) {
                dv.setTrangThai(1);
            } else {
                dv.setTrangThai(0);
            }
            serviceDichVu.save(dv);
            loadTable(serviceDichVu.getAllData());
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        serviceDichVu.delete(txtMa.getText());
        loadTable(serviceDichVu.getAllData());
    }//GEN-LAST:event_btXoaActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        ViewChuTro vct = new ViewChuTro();
        vct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        int row = jTable1.getSelectedRow();
        txtMa.setText(jTable1.getValueAt(row, 1).toString());
        txtTen.setText(jTable1.getValueAt(row, 2).toString());
        txtThanhTien.setText(jTable1.getValueAt(row, 3).toString());
        jdNgayTao.setDate((Date) jTable1.getValueAt(row, 4));
        jdNgaySua.setDate((Date) jTable1.getValueAt(row, 5));
        if (jTable1.getValueAt(row, 6).toString().equalsIgnoreCase("Có")) {
            rdoCo.setSelected(true);
        } else {
            rdoKhong.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ViewDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDichVu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDichVu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdNgaySua;
    private com.toedter.calendar.JDateChooser jdNgayTao;
    private javax.swing.JRadioButton rdoCo;
    private javax.swing.JRadioButton rdoKhong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}