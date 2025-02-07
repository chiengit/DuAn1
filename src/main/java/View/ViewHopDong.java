/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DomainModels.ChuTro;
import DomainModels.HopDong;
import DomainModels.KhachHang;
import DomainModels.Phong;
import Service.IServiceHopDong;
import Service.impl.ServiceHopDongImpl;
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
public class ViewHopDong extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    private IServiceHopDong svH = new ServiceHopDongImpl();
    private DefaultComboBoxModel dccbm;

    /**
     * Creates new form ViewHopDong
     */
    public ViewHopDong() {
        initComponents();
        loadTable(svH.getAllData());
        loadCbbCt(svH.getCbbCt());
        loadCbbKh(svH.getCbbKh());
        loadCbbPh(svH.getCbbPh());
    }

    public void loadCbbPh(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbPh.getModel();
        cbbPh.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
        }
    }

    public void loadCbbCt(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbCt.getModel();
        cbbCt.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
        }
    }

    public void loadCbbKh(List<String> list) {
        dccbm = (DefaultComboBoxModel) cbbKh.getModel();
        cbbKh.removeAllItems();
        for (String string : list) {
            dccbm.addElement(string);
        }
    }

    public void loadTable(List<HopDong> list) {
        dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (HopDong hd : list) {
            dtm.addRow(new Object[]{
                hd.getId(), hd.getMa(), hd.getChuTro().getTen(), hd.getKhachHang().getTen(),
                hd.getPhong().getTen(), hd.getNoiDung(), hd.getNgayBatDau(), hd.getNgayKetThuc(),
                hd.getNgayTao(), hd.getNgaySua(), hd.htTrangThai()
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
        txtMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbCt = new javax.swing.JComboBox<>();
        cbbKh = new javax.swing.JComboBox<>();
        cbbPh = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taNd = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jdNgayBatDau = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jdNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jdNgayTao = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jdNgaySua = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        rdoCon = new javax.swing.JRadioButton();
        rdoHet = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã");

        jLabel2.setText("Chủ trọ");

        jLabel3.setText("Khách hàng");

        jLabel4.setText("Phòng");

        jLabel5.setText("Nội dung");

        taNd.setColumns(20);
        taNd.setRows(5);
        jScrollPane1.setViewportView(taNd);

        jLabel6.setText("Ngày bắt đầu");

        jLabel7.setText("Ngày kết thúc");

        jLabel8.setText("Ngày tạo ");

        jLabel9.setText("Ngày sửa");

        jLabel10.setText("Trạng thái");

        buttonGroup1.add(rdoCon);
        rdoCon.setText("Còn hạn");

        buttonGroup1.add(rdoHet);
        rdoHet.setText("Hết hạn");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên chủ trọ", "Tên khách hàng", "Tên phòng", "Nội dung", "Ngày bắt đầu ", "Ngày kết thúc", "Ngày tạo ", "Ngày sửa", "Trạng thái"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbPh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbCt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoHet))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addComponent(cbbCt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cbbPh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jdNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jdNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jdNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jdNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rdoCon)
                            .addComponent(rdoHet))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btThem)
                            .addComponent(btXoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSua)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (taNd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nội dung không được để trống");
        } else if (jdNgayBatDau.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được để trống");
        } else if (jdNgayKetThuc.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCon.isSelected() && !rdoHet.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtMa.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Mã không được vượt quá 20 kí tự");
        } else if (taNd.getText().length() > 100) {
            JOptionPane.showMessageDialog(this, "Nội dung không được vượt quá 100 kí tự");
        } else if (svH.findByMa(txtMa.getText()).equalsIgnoreCase(txtMa.getText())) {
            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            HopDong h = new HopDong();
            ChuTro c = new ChuTro();
            KhachHang k = new KhachHang();
            Phong p = new Phong();

            String maCt = cbbCt.getSelectedItem().toString();
            String maKh = cbbKh.getSelectedItem().toString();
            String maPh = cbbPh.getSelectedItem().toString();

            UUID idCt = svH.findByIdCt(maCt);
            UUID idKh = svH.findByIdKh(maKh);
            UUID idPh = svH.findByIdPh(maPh);

            c.setId(idCt);
            k.setId(idKh);
            p.setId(idPh);

            h.setMa(txtMa.getText());
            h.setChuTro(c);
            h.setKhachHang(k);
            h.setPhong(p);
            h.setNoiDung(taNd.getText());
            h.setNgayBatDau(jdNgayBatDau.getDate());
            h.setNgayKetThuc(jdNgayKetThuc.getDate());
            h.setNgayTao(jdNgayTao.getDate());
            h.setNgaySua(jdNgaySua.getDate());
            if (rdoCon.isSelected()) {
                h.setTrangThai(1);
            } else {
                h.setTrangThai(0);
            }
            svH.add(h);
            loadTable(svH.getAllData());
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        txtMa.setText(jTable1.getValueAt(index, 1).toString());
        cbbCt.setSelectedItem(jTable1.getValueAt(index, 2));
        cbbKh.setSelectedItem(jTable1.getValueAt(index, 3));
        cbbPh.setSelectedItem(jTable1.getValueAt(index, 4));
        taNd.setText(jTable1.getValueAt(index, 5).toString());
        jdNgayBatDau.setDate((Date) jTable1.getValueAt(index, 6));
        jdNgayKetThuc.setDate((Date) jTable1.getValueAt(index, 7));
        jdNgayTao.setDate((Date) jTable1.getValueAt(index, 8));
        jdNgaySua.setDate((Date) jTable1.getValueAt(index, 9));
        if (jTable1.getValueAt(index, 10).equals("Còn hạn")) {
            rdoCon.setSelected(true);
        } else {
            rdoHet.setSelected(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (taNd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nội dung không được để trống");
        } else if (jdNgayBatDau.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được để trống");
        } else if (jdNgayKetThuc.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCon.isSelected() && !rdoHet.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtMa.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Mã không được vượt quá 20 kí tự");
        } else if (taNd.getText().length() > 100) {
            JOptionPane.showMessageDialog(this, "Nội dung không được vượt quá 100 kí tự");
//        } else if (svH.findByMa(txtMa.getText()).equalsIgnoreCase(txtMa.getText())) {
//            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            int index = jTable1.getSelectedRow();
            HopDong h = svH.getAllData().get(index);
            ChuTro c = new ChuTro();
            KhachHang k = new KhachHang();
            Phong p = new Phong();

            String maCt = cbbCt.getSelectedItem().toString();
            String maKh = cbbKh.getSelectedItem().toString();
            String maPh = cbbPh.getSelectedItem().toString();

            UUID idCt = svH.findByIdCt(maCt);
            UUID idKh = svH.findByIdKh(maKh);
            UUID idPh = svH.findByIdPh(maPh);

            c.setId(idCt);
            k.setId(idKh);
            p.setId(idPh);

            h.setMa(txtMa.getText());
            h.setChuTro(c);
            h.setKhachHang(k);
            h.setPhong(p);
            h.setNoiDung(taNd.getText());
            h.setNoiDung(taNd.getText());
            h.setNgayBatDau(jdNgayBatDau.getDate());
            h.setNgayKetThuc(jdNgayKetThuc.getDate());
            h.setNgayTao(jdNgayTao.getDate());
            h.setNgaySua(jdNgaySua.getDate());
            if (rdoCon.isSelected()) {
                h.setTrangThai(1);
            } else {
                h.setTrangThai(0);
            }
            svH.add(h);
            loadTable(svH.getAllData());
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        String ma = txtMa.getText();
        svH.delete(ma);
        loadTable(svH.getAllData());
    }//GEN-LAST:event_btXoaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewChuTro vct = new ViewChuTro();
        vct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHopDong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHopDong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbCt;
    private javax.swing.JComboBox<String> cbbKh;
    private javax.swing.JComboBox<String> cbbPh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdNgayBatDau;
    private com.toedter.calendar.JDateChooser jdNgayKetThuc;
    private com.toedter.calendar.JDateChooser jdNgaySua;
    private com.toedter.calendar.JDateChooser jdNgayTao;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoHet;
    private javax.swing.JTextArea taNd;
    private javax.swing.JTextField txtMa;
    // End of variables declaration//GEN-END:variables
}
