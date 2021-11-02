/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Persondesc;
import model.Persondeschistory;








/**
 *
 * 
 */
public class ViewJPanelperson1 extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Persondeschistory history;
    public ViewJPanelperson1(Persondeschistory history) {
        initComponents();
        this.history = history;
        populateTable();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblvital = new javax.swing.JTable();
        btnview = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        lblmanufacturer = new javax.swing.JLabel();
        lblmodel = new javax.swing.JLabel();
        lblyear = new javax.swing.JLabel();
        lblserial = new javax.swing.JLabel();
        cmbmanufacture = new javax.swing.JComboBox<>();
        cmbmodel = new javax.swing.JComboBox<>();
        txtserial = new javax.swing.JTextField();
        cmbavailable = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cmbyear = new javax.swing.JComboBox<>();
        cmbexpired = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbcity = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(691, 542));

        tblvital.setBackground(new java.awt.Color(204, 255, 204));
        tblvital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Selobj", "id", "Name", "Address", "Community", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblvital);
        if (tblvital.getColumnModel().getColumnCount() > 0) {
            tblvital.getColumnModel().getColumn(0).setMinWidth(20);
            tblvital.getColumnModel().getColumn(0).setMaxWidth(20);
            tblvital.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        btnview.setBackground(new java.awt.Color(102, 153, 255));
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(102, 153, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        lblmanufacturer.setText("Manufacturer");

        lblmodel.setText("Model");

        lblyear.setText("Year Of Manufacture");

        lblserial.setText("Serial Number");

        cmbmanufacture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Hyundai", "Tata", "BMW", "Audi" }));

        cmbmodel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hatchback", "Sedan", "XUV" }));
        cmbmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmodelActionPerformed(evt);
            }
        });

        cmbavailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));
        cmbavailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbavailableActionPerformed(evt);
            }
        });

        jLabel2.setText("Availability");

        cmbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021" }));

        cmbexpired.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y", "N" }));
        cmbexpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbexpiredActionPerformed(evt);
            }
        });

        jLabel4.setText("City Available");

        cmbcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "New Jersey", "New York", "Dallas" }));

        jLabel5.setText("Expired Maintainance");

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("View Registered Persons");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnview)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete)
                        .addGap(262, 262, 262))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(lblmanufacturer)
                            .addComponent(lblyear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbavailable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbyear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbmanufacture, 0, 1, Short.MAX_VALUE)
                            .addComponent(cmbexpired, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmodel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblserial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtserial)
                            .addComponent(cmbmodel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbcity, 0, 1, Short.MAX_VALUE))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton1)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnview)
                    .addComponent(btndelete))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmanufacturer)
                    .addComponent(cmbmanufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmodel)
                    .addComponent(cmbmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblyear)
                    .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblserial)
                    .addComponent(txtserial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbavailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbexpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmodelActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        
        int SelectedRowIndex=tblvital.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
        Persondesc selectedvital= (Persondesc) model.getValueAt(SelectedRowIndex, 0);
        history.deletevitals(selectedvital);
        JOptionPane.showMessageDialog(this, "selected data deleted");
        populateTable();
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
     int SelectedRowIndex=tblvital.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to view");
            
        return;
        }
        DefaultTableModel model1 =(DefaultTableModel) tblvital.getModel();
        Persondesc selectedvital= (Persondesc) model1.getValueAt(SelectedRowIndex, 0); 
       // cmbmodel.setText(String.valueOf(selectedvital.getModelno()));
      /* cmbmanufacture.setSelectedIndex(selectedvital.getManufacturer());
        txtserial.setText(String.valueOf(selectedvital.getSerial()));
        cmbmodel.setSelectedIndex(selectedvital.getModelno());
        // cmbseat.setSelectedIndex(selectedvital.getSeats());
        cmbavailable.setSelectedIndex(selectedvital.getAvailable());
         cmbyear.setSelectedIndex(selectedvital.getManyear());
         cmbcity.setSelectedIndex(selectedvital.getCity());
        // txtunits.setText(String.valueOf(selectedvital.getQty_available()));
         cmbexpired.setSelectedIndex(selectedvital.getExp_certificate());*/
         var now = new Date();
       // DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
         DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
  //  System.out.println("date is " + df.format(currentDate));
      //  var now = new Date();
        //now=df.format(now);
        //txtfleet.setText(df.format(selectedvital.getFleet()));
        // txtfleet.setText(selectedvital.getFleet());
        // cmbmanufacturer.set
    }//GEN-LAST:event_btnviewActionPerformed

    private void cmbavailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbavailableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbavailableActionPerformed

    private void cmbexpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbexpiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbexpiredActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnview;
    private javax.swing.JComboBox<String> cmbavailable;
    private javax.swing.JComboBox<String> cmbcity;
    private javax.swing.JComboBox<String> cmbexpired;
    private javax.swing.JComboBox<String> cmbmanufacture;
    private javax.swing.JComboBox<String> cmbmodel;
    private javax.swing.JComboBox<String> cmbyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmanufacturer;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JLabel lblserial;
    private javax.swing.JLabel lblyear;
    private javax.swing.JTable tblvital;
    private javax.swing.JTextField txtserial;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
     //System.out.println("hellohistory"+history.getHistory());
    // System.out.println("hellosize"+ vs.size());
     //System.out.println(vs.get(1).getManufacturer());
   /* if((vs!=null)&&(vs.size()>0))
    {
    for(int i=0;i<vs.size();i++)
    {System.out.println("hello1");
     vs:history.getHistory();
        System.out.println(vs.get(i).getManufacturer());
     Object[] row;   
         row = new Object[4];
     
    row[0]= vs.get(i).getManufacturer();
    row[1]=vs.get(i).getModel();
    row[2]=vs.get(i).getNoseats();
    row[3]=vs.get(i).getManyear();
    model.addRow(row);
    }
    } */
   model.setRowCount(0);
  
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
//     
  row[0]= vs;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=vs.getId();
   row[2]=vs.getPname();
   row[3]=vs.getAddress();
   row[4]=vs.getCommunity();
   row[5]=vs.getAge();
   // row[2]=cmbmodel.getItemAt(vs.getModelno());
   
  // row[3]=cmbseat.getItemAt(vs.getSeats());
  // row[3]=vs.getSeats();
  // row[4]=vs.getQty_available();
   // row[5]=cmbcity.getItemAt(vs.getCity());
  //  row[6]=vs.getFleet();
    model.addRow(row);
   }
    }
    
}
