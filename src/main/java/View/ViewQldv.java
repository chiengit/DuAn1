/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DomainModels.ChiTietDichVu;
import DomainModels.DichVu;
import DomainModels.Dien;
import DomainModels.Nuoc;
import DomainModels.Phong;
import Service.IServiceQldv;
import Service.impl.ServiceQldvImpl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewQldv extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private DefaultComboBoxModel dccbm;
    private IServiceQldv serviceQldv = new ServiceQldvImpl();

    /**
     * Creates new form ViewQldv
     */
    public ViewQldv() {
        initComponents();
        loadTable(serviceQldv.getAll());
        loadCbbPhong(serviceQldv.getCbbPhong());
        loadCbbDien(serviceQldv.getCbbDien());
        loadCbbNuoc(serviceQldv.getCbbNuoc());
        loadCbbDv(serviceQldv.getCbbDv());
    }

    public void loadTable(List<ChiTietDichVu> list) {
        dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (ChiTietDichVu c : list) {
            dtm.addRow(new Object[]{
                c.getId(), c.getMa(), c.getPhong().getGia(), c.getDien().getThanhTien(),
                c.getNuoc().getThanhTien(), c.getDichVu().getThanhTien(), c.getNgayTao(),
                c.getNgaySua(), c.htTrangThai()
            });
        }
    }

    public void loadCbbPhong(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbPhong.getModel();
        cbbPhong.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
        }
    }

    public void loadCbbDien(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbDien.getModel();
        cbbDien.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
        }
    }

    public void loadCbbNuoc(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbNuoc.getModel();
        cbbNuoc.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
        }
    }

    public void loadCbbDv(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbDv.getModel();
        cbbDv.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jdNgayTao = new com.toedter.calendar.JDateChooser();
        jdNgaySua = new com.toedter.calendar.JDateChooser();
        rdoCo = new javax.swing.JRadioButton();
        rdoKhong = new javax.swing.JRadioButton();
        cbbPhong = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbbDien = new javax.swing.JComboBox<>();
        cbbNuoc = new javax.swing.JComboBox<>();
        cbbDv = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã");

        jLabel2.setText("Ngày tạo ");

        jLabel3.setText("Ngày sửa ");

        jLabel4.setText("Trạng thái");

        rdoCo.setText("Có");

        rdoKhong.setText("Không");

        jLabel5.setText("Phòng");

        jLabel6.setText("Điện");

        jLabel7.setText("Nước");

        jLabel8.setText("Dịch vụ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Mã", "Phòng", "Điện", "Nước ", "Dịch vụ", "Ngày tạo", "Ngày sửa", "Trạng thái"
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

        btback.setText("Back");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jdNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdoCo)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdoKhong))
                                        .addComponent(jdNgayTao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbDien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbNuoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbDv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(3, 3, 3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btback, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))
                            .addComponent(jdNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdNgaySua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoCo)
                                .addComponent(rdoKhong)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbbNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbbDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(btSua))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btXoa)
                            .addComponent(btback)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCo.isSelected() && !rdoKhong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtMa.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Mã không được vượt quá 20 kí tự");
        } else if (serviceQldv.findByMa(txtMa.getText()).equals(txtMa.getText())) {
            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            ChiTietDichVu c = new ChiTietDichVu();
            Phong p = new Phong();
            Dien d = new Dien();
            Nuoc n = new Nuoc();
            DichVu dv = new DichVu();

            String tenPhong = cbbPhong.getSelectedItem().toString();
            String tenDien = cbbDien.getSelectedItem().toString();
            String tenNuoc = cbbNuoc.getSelectedItem().toString();
            String tenDv = cbbDv.getSelectedItem().toString();

            UUID idP = serviceQldv.findByIdPhong(tenPhong);
            UUID idD = serviceQldv.findByIdDien(tenDien);
            UUID idN = serviceQldv.findByIdNuoc(tenNuoc);
            UUID idDv = serviceQldv.findByIdDv(tenDv);

            p.setId(idP);
            d.setId(idD);
            n.setId(idN);
            dv.setId(idDv);

            c.setMa(txtMa.getText());
            c.setPhong(p);
            c.setDien(d);
            c.setNuoc(n);
            c.setDichVu(dv);
            c.setNgayTao(jdNgayTao.getDate());
            c.setNgaySua(jdNgaySua.getDate());
            if (rdoCo.isSelected()) {
                c.setTrangThai(1);
            } else {
                c.setTrangThai(0);
            }
            serviceQldv.save(c);
            loadTable(serviceQldv.getAll());
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCo.isSelected() && !rdoKhong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtMa.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Mã không được vượt quá 20 kí tự");

//        } else if (serviceQldv.findByMa(txtMa.getText()).equals(txtMa.getText())) {
//            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            int index = jTable1.getSelectedRow();
            ChiTietDichVu c = serviceQldv.getAll().get(index);
            Phong p = new Phong();
            Dien d = new Dien();
            Nuoc n = new Nuoc();
            DichVu dv = new DichVu();

            String tenPhong = cbbPhong.getSelectedItem().toString();
            String tenDien = cbbDien.getSelectedItem().toString();
            String tenNuoc = cbbNuoc.getSelectedItem().toString();
            String tenDv = cbbDv.getSelectedItem().toString();

            UUID idP = serviceQldv.findByIdPhong(tenPhong);
            UUID idD = serviceQldv.findByIdDien(tenDien);
            UUID idN = serviceQldv.findByIdNuoc(tenNuoc);
            UUID idDv = serviceQldv.findByIdDv(tenDv);

            p.setId(idP);
            d.setId(idD);
            n.setId(idN);
            dv.setId(idDv);

            c.setMa(txtMa.getText());
            c.setPhong(p);
            c.setDien(d);
            c.setNuoc(n);
            c.setDichVu(dv);
            c.setNgayTao(jdNgayTao.getDate());
            c.setNgaySua(jdNgaySua.getDate());
            if (rdoCo.isSelected()) {
                c.setTrangThai(1);
            } else {
                c.setTrangThai(0);
            }
            serviceQldv.save(c);
            loadTable(serviceQldv.getAll());
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        serviceQldv.delete(txtMa.getText());
        loadTable(serviceQldv.getAll());
    }//GEN-LAST:event_btXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        int row = jTable1.getSelectedRow();
        txtMa.setText(jTable1.getValueAt(row, 1).toString());
        cbbPhong.setSelectedItem(jTable1.getValueAt(row, 2));
        cbbDien.setSelectedItem(jTable1.getValueAt(row, 3));
        cbbNuoc.setSelectedItem(jTable1.getValueAt(row, 4));
        cbbDv.setSelectedItem(jTable1.getValueAt(row, 5));
        jdNgayTao.setDate((Date) jTable1.getValueAt(row, 6));
        jdNgaySua.setDate((Date) jTable1.getValueAt(row, 7));
        if (jTable1.getValueAt(row, 8).toString().equalsIgnoreCase("Có")) {
            rdoCo.setSelected(true);
        } else {
            rdoKhong.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        // TODO add your handling code here:
        ViewChuTro vct = new ViewChuTro();
        vct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btbackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewQldv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQldv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQldv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQldv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQldv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btback;
    private javax.swing.JComboBox<String> cbbDien;
    private javax.swing.JComboBox<String> cbbDv;
    private javax.swing.JComboBox<String> cbbNuoc;
    private javax.swing.JComboBox<String> cbbPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdNgaySua;
    private com.toedter.calendar.JDateChooser jdNgayTao;
    private javax.swing.JRadioButton rdoCo;
    private javax.swing.JRadioButton rdoKhong;
    private javax.swing.JTextField txtMa;
    // End of variables declaration//GEN-END:variables
}
