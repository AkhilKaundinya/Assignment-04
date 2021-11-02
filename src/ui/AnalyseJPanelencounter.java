/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Persondesc;
import model.Persondeschistory;
import model.Vitaldesc;
import model.Vitaldeschistory;








/**
 *
 * 
 */
public class AnalyseJPanelencounter extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Persondeschistory history;
    Vitaldeschistory vitalhistory;
     //public static final String[] com = {"Street1", "Street2"};
    public AnalyseJPanelencounter(Persondeschistory history,Vitaldeschistory vitalhistory) {
        initComponents();
        this.history = history;
        this.vitalhistory = vitalhistory;
          tblvital.setShowVerticalLines(true);
            tblencount.setShowVerticalLines(true);
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
        btnencount = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblencount = new javax.swing.JTable();
        lblcomm = new javax.swing.JLabel();
        txtcomm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtminsbp = new javax.swing.JTextField();
        txtmaxsbp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmindbp = new javax.swing.JTextField();
        txtmaxdbp = new javax.swing.JTextField();
        btncomm = new javax.swing.JButton();
        btnsbp = new javax.swing.JButton();
        btnage = new javax.swing.JButton();
        btndbp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtcity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(691, 542));

        tblvital.setBackground(new java.awt.Color(204, 255, 204));
        tblvital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Selobj", "id", "Name", "Address", "Community", "Age", "City"
            }
        ));
        jScrollPane1.setViewportView(tblvital);
        if (tblvital.getColumnModel().getColumnCount() > 0) {
            tblvital.getColumnModel().getColumn(0).setMinWidth(20);
            tblvital.getColumnModel().getColumn(0).setMaxWidth(20);
            tblvital.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        btnencount.setBackground(new java.awt.Color(102, 153, 255));
        btnencount.setText("View Encounters");
        btnencount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnencountActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Analyse  Encounters for Vitals");

        tblencount.setBackground(new java.awt.Color(204, 255, 204));
        tblencount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Selobj", "id", "Systolic Blood Pressure", "Diastolic blood pressure", "Date Of Encounter"
            }
        ));
        jScrollPane2.setViewportView(tblencount);
        if (tblencount.getColumnModel().getColumnCount() > 0) {
            tblencount.getColumnModel().getColumn(0).setMinWidth(20);
            tblencount.getColumnModel().getColumn(0).setMaxWidth(20);
            tblencount.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblencount.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblencount.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        lblcomm.setText("Community");

        jLabel1.setText("Age");

        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtageKeyPressed(evt);
            }
        });

        jLabel2.setText("Systolic Range");

        txtminsbp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtminsbpKeyPressed(evt);
            }
        });

        txtmaxsbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxsbpActionPerformed(evt);
            }
        });
        txtmaxsbp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmaxsbpKeyPressed(evt);
            }
        });

        jLabel3.setText("Diastolic Range");

        txtmindbp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmindbpKeyPressed(evt);
            }
        });

        txtmaxdbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxdbpActionPerformed(evt);
            }
        });
        txtmaxdbp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmaxdbpKeyPressed(evt);
            }
        });

        btncomm.setText(" By Comm");
        btncomm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncommActionPerformed(evt);
            }
        });

        btnsbp.setText(" BySBP");
        btnsbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsbpActionPerformed(evt);
            }
        });

        btnage.setText("By age");
        btnage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnageActionPerformed(evt);
            }
        });

        btndbp.setText(" ByDBP");
        btndbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndbpActionPerformed(evt);
            }
        });

        jButton2.setText("By City");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        txtcity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcityKeyPressed(evt);
            }
        });

        jLabel4.setText("City");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtminsbp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmaxsbp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmindbp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmaxdbp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btndbp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnsbp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblcomm)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtcomm, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btncomm)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnencount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtminsbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaxsbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsbp)
                    .addComponent(lblcomm)
                    .addComponent(txtcomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncomm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtmindbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmaxdbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndbp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnage)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnencount)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnencountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnencountActionPerformed
        // TODO add your handling code here:
     int SelectedRowIndex=tblvital.getSelectedRow();
     
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to view Encounters");
            
        return;
        }
        DefaultTableModel model1 =(DefaultTableModel) tblvital.getModel();
        Persondesc selectedvital= (Persondesc) model1.getValueAt(SelectedRowIndex, 0); 
     int perid=selectedvital.getId();
     
         var now = new Date();
       // DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
         DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
  //  System.out.println("date is " + df.format(currentDate));
       populateencountTable(perid);
    }//GEN-LAST:event_btnencountActionPerformed
    
    private void txtmaxsbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxsbpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxsbpActionPerformed

    private void btncommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncommActionPerformed
        // TODO add your handling code here:
         commpopulateTable();
        
    }//GEN-LAST:event_btncommActionPerformed

    private void btnsbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsbpActionPerformed
        // TODO add your handling code here:
        sbppopulateTable();
    }//GEN-LAST:event_btnsbpActionPerformed

    private void btnageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnageActionPerformed
        // TODO add your handling code here:
        agepopulateTable();
    }//GEN-LAST:event_btnageActionPerformed

    private void txtmaxdbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaxdbpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmaxdbpActionPerformed

    private void btndbpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndbpActionPerformed
        // TODO add your handling code here:
        dbppopulateTable();
    }//GEN-LAST:event_btndbpActionPerformed

    private void txtminsbpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtminsbpKeyPressed
        // TODO add your handling code here:
         String mins =txtminsbp.getText();
        //if(PhoneNo.matches("^[0-9]*$") && PhoneNo.length()==10)
        if((mins.matches("^[0-9]*$")) && (mins.length()<4) )
        {
            //txtage.setBackground(Color.yellow);
            //JOptionPane.showMessageDialog(null,"You Have Entered Correct PhoneNO");
        }
        else
       
        {
            //txtage.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Please Enter Correct Number");
            txtminsbp.setText("");
        }
    }//GEN-LAST:event_txtminsbpKeyPressed

    private void txtmaxsbpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaxsbpKeyPressed
        // TODO add your handling code here:
         String maxs =txtmaxsbp.getText();
        //if(PhoneNo.matches("^[0-9]*$") && PhoneNo.length()==10)
        if((maxs.matches("^[0-9]*$")) && (maxs.length()<4) )
        {
            //txtage.setBackground(Color.yellow);
            //JOptionPane.showMessageDialog(null,"You Have Entered Correct PhoneNO");
        }
        else
       
        {
            //txtage.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Please Enter Correct Number");
            txtmaxsbp.setText("");
        }
    }//GEN-LAST:event_txtmaxsbpKeyPressed

    private void txtmindbpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmindbpKeyPressed
        // TODO add your handling code here:
         String mind =txtmindbp.getText();
        //if(PhoneNo.matches("^[0-9]*$") && PhoneNo.length()==10)
        if((mind.matches("^[0-9]*$")) && (mind.length()<4) )
        {
            //txtage.setBackground(Color.yellow);
            //JOptionPane.showMessageDialog(null,"You Have Entered Correct PhoneNO");
        }
        else
       
        {
            //txtage.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Please Enter Correct Number");
            txtmindbp.setText("");
        }
    }//GEN-LAST:event_txtmindbpKeyPressed

    private void txtmaxdbpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmaxdbpKeyPressed
        // TODO add your handling code here:
         String maxd =txtmaxdbp.getText();
        //if(PhoneNo.matches("^[0-9]*$") && PhoneNo.length()==10)
        if((maxd.matches("^[0-9]*$")) && (maxd.length()<4) )
        {
            //txtage.setBackground(Color.yellow);
            //JOptionPane.showMessageDialog(null,"You Have Entered Correct PhoneNO");
        }
        else
       
        {
            //txtage.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Please Enter Correct Number");
            txtmaxdbp.setText("");
        }
    }//GEN-LAST:event_txtmaxdbpKeyPressed

    private void txtageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyPressed
        // TODO add your handling code here:
         String age =txtage.getText();
        //if(PhoneNo.matches("^[0-9]*$") && PhoneNo.length()==10)
        if((age.matches("^[0-9]*$")) && (age.length()<4) )
        {
            //txtage.setBackground(Color.yellow);
            //JOptionPane.showMessageDialog(null,"You Have Entered Correct PhoneNO");
        }
        else
       
        {
            //txtage.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Please Enter Correct Age");
            txtage.setText("");
        }
    }//GEN-LAST:event_txtageKeyPressed

    private void txtcityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcityKeyPressed
        // TODO add your handling code here:
        String city =txtcity.getText();
        Pattern pattern = Pattern.compile(new String ("^[a-zA-Z\\s]*$"));
        Matcher matcher = pattern.matcher(city);
    if(matcher.matches())
    {
         //if pattern matches
        //txtName.setBackground(Color.yellow);
    }
    else
    {
         //if pattern does not matches
        //txtName.setBackground(Color.orange);
            JOptionPane.showMessageDialog(null,"Please Enter Correct City");
            txtcity.setText("");
    }
    }//GEN-LAST:event_txtcityKeyPressed

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        citypopulateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnage;
    private javax.swing.JButton btncomm;
    private javax.swing.JButton btndbp;
    private javax.swing.JButton btnencount;
    private javax.swing.JButton btnsbp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcomm;
    private javax.swing.JTable tblencount;
    private javax.swing.JTable tblvital;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtcomm;
    private javax.swing.JTextField txtmaxdbp;
    private javax.swing.JTextField txtmaxsbp;
    private javax.swing.JTextField txtmindbp;
    private javax.swing.JTextField txtminsbp;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
    
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
   row[6]=vs.getCity();
   
   // row[2]=cmbmodel.getItemAt(vs.getModelno());
   
  // row[3]=cmbseat.getItemAt(vs.getSeats());
  // row[3]=vs.getSeats();
  // row[4]=vs.getQty_available();
   // row[5]=cmbcity.getItemAt(vs.getCity());
  //  row[6]=vs.getFleet();
    model.addRow(row);
   }
    }
    //encounterpopulate
     private void populateencountTable(int perid) {
    DefaultTableModel model1 =(DefaultTableModel) tblencount.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
    
   model1.setRowCount(0);
   
  
 for( Vitaldesc vse: vitalhistory.getvitalHistory())
       {
     Object[] row1= new Object[7];
//     
  row1[0]= vse;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());
if(vse.getId()==perid)
{
   row1[1]=vse.getId();
   row1[2]=vse.getSp();
   row1[3]=vse.getDp();
   row1[4]=vse.getVitaldate();
   
   
    model1.addRow(row1);
}
   }
    }
    //encounterpopulate ends
     //commsearchtable
     
     private void commpopulateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
    String scomm=txtcomm.getText();
               
   model.setRowCount(0);
   
  if(!txtcomm.getText().isEmpty())
  {
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
     String scomm1=scomm.trim().toLowerCase();
     String scomm2=vs.getCommunity().toLowerCase();
//     
System.out.println("scomm"+scomm);
System.out.println("vs"+vs.getCommunity());
if(scomm1.equals(scomm2))
{
    System.out.println("insie");
  row[0]= vs;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=vs.getId();
   row[2]=vs.getPname();
   row[3]=vs.getAddress();
   row[4]=vs.getCommunity();
   row[5]=vs.getAge();
   row[6]=vs.getCity();
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
 else
 { JOptionPane.showMessageDialog(this, "Please enter valid  values");
            
        return;
         }
    }
    
     //searchtable ends
       //sbpearchtable
     
     private void sbppopulateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
   
            int minsbp=Integer.parseInt(txtminsbp.getText());
            int maxsbp  =Integer.parseInt(txtmaxsbp.getText());
         
    
   model.setRowCount(0);
   
  if((!txtminsbp.getText().isEmpty())&&(!txtmaxsbp.getText().isEmpty()))
  {
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
// 
int tid=vs.getId();
int f=0;
for(Vitaldesc vs1: vitalhistory.getvitalHistory())
{
     Object[] row1= new Object[7];
     int tsbp=vs1.getSp();
     if((tsbp>=minsbp)&&(tsbp<=maxsbp)&&(tid==vs1.getId()))
     {f=1; break;}
}


if(f==1)
{

  row[0]= vs;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=vs.getId();
   row[2]=vs.getPname();
   row[3]=vs.getAddress();
   row[4]=vs.getCommunity();
   row[5]=vs.getAge();
   row[6]=vs.getCity();
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
  else
 { JOptionPane.showMessageDialog(this, "Please enter valid  values");
            
        return;
         }
     }
    
     //searchtable ends
       //dbpsearchtable
     
      private void dbppopulateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
   
            int mindbp=Integer.parseInt(txtmindbp.getText());
            int maxdbp  =Integer.parseInt(txtmaxdbp.getText());
         
    
   model.setRowCount(0);
   
  if((!txtmindbp.getText().isEmpty())&&(!txtmaxdbp.getText().isEmpty()))
  {
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
// 
int tid=vs.getId();
int f=0;
for(Vitaldesc vs1: vitalhistory.getvitalHistory())
{
     Object[] row1= new Object[7];
     int tdbp=vs1.getDp();
     if((tdbp>=mindbp)&&(tdbp<=maxdbp)&&(tid==vs1.getId()))
     {f=1; break;}
}


if(f==1)
{

  row[0]= vs;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=vs.getId();
   row[2]=vs.getPname();
   row[3]=vs.getAddress();
   row[4]=vs.getCommunity();
   row[5]=vs.getAge();
   row[6]=vs.getCity();
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
  else
 { JOptionPane.showMessageDialog(this, "Please enter valid  values");
            
        return;
         }
     }
    
     //searchtable ends
       //agesearchtable
     
     private void agepopulateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    if(!txtage.getText().isEmpty())
    {
    int sage=Integer.parseInt(txtage.getText());
        
   model.setRowCount(0);
   
  
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
//   
if(sage==vs.getAge())
{
  row[0]= vs;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=vs.getId();
   row[2]=vs.getPname();
   row[3]=vs.getAddress();
   row[4]=vs.getCommunity();
   row[5]=vs.getAge();
   row[6]=vs.getCity();
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
    else
    {
         JOptionPane.showMessageDialog(this, "Please enter Valid value");
            
        return;
    }
    }
    
    
     //searchtable ends
   // @Override
//public void setValueAt(Object value, int row, int col) {

//}
    private void citypopulateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
    String city=txtcity.getText();
               
   model.setRowCount(0);
   
  if(!txtcity.getText().isEmpty())
  {
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
     String city1=city.trim().toLowerCase();
     String city2=vs.getCity().toLowerCase();
//     
System.out.println("scomm"+city);
System.out.println("vs"+vs.getCity());
if(city1.equals(city2))
{
    System.out.println("insie");
  row[0]= vs;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=vs.getId();
   row[2]=vs.getPname();
   row[3]=vs.getAddress();
   row[4]=vs.getCommunity();
   row[5]=vs.getAge();
   row[6]=vs.getCity();
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
 else
 { JOptionPane.showMessageDialog(this, "Please enter valid  values");
            
        return;
         }
    } 
}
