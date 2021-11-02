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
import model.Vitaldesc;
import model.Vitaldeschistory;








/**
 *
 * 
 */
public class AnalyseVitals extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Persondeschistory history;
    Vitaldeschistory vitalhistory;
     //public static final String[] com = {"Street1", "Street2"};
    public AnalyseVitals(Persondeschistory history,Vitaldeschistory vitalhistory) {
        initComponents();
        this.history = history;
        this.vitalhistory = vitalhistory;
          tblvital.setShowVerticalLines(true);
          //  tblencount.setShowVerticalLines(true);
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
        jButton1 = new javax.swing.JButton();
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
                "Selobj", "Community", "Normal SBP", "Abnormal SBP", "Normal DBP", "Abnormal DBP"
            }
        ));
        jScrollPane1.setViewportView(tblvital);
        if (tblvital.getColumnModel().getColumnCount() > 0) {
            tblvital.getColumnModel().getColumn(0).setMinWidth(20);
            tblvital.getColumnModel().getColumn(0).setMaxWidth(20);
            tblvital.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblvital.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Analyse  People For BP Vitals");

        jLabel2.setText("Systolic Range");

        txtmaxsbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxsbpActionPerformed(evt);
            }
        });

        jLabel3.setText("Diastolic Range");

        txtmaxdbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaxdbpActionPerformed(evt);
            }
        });

        btncomm.setText(" by Community");
        btncomm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncommActionPerformed(evt);
            }
        });

        btnsbp.setText(" bySBP");
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

        btndbp.setText(" byDBP");
        btndbp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndbpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btndbp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnsbp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btncomm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtminsbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtmaxsbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsbp))
                    .addComponent(btncomm, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmindbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaxdbp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndbp)
                    .addComponent(btnage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnage;
    private javax.swing.JButton btncomm;
    private javax.swing.JButton btndbp;
    private javax.swing.JButton btnsbp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblvital;
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
     
     private void commpopulateTable() {
        DefaultTableModel model =(DefaultTableModel) tblvital.getModel();
   int i;
   int found;
    //new code starts
   // String[] distinctcomm =new String[10];
   String[] distinctcomm = new String[20] ;
    distinctcomm[0]="x";
  //  var distinctcomm =[];
   // String distinctcomm = [];
   //int alength= histo;
    //for (var i = 0; i < array.length; i++)
    found=0;
     for( Persondesc vs: history.getHistory())
       {System.out.println("hello"+vs.getCommunity());
       String comm=vs.getCommunity();
       int icomm=distinctcomm.length;
       for(i=0;i<icomm;i++)
       {if(distinctcomm[i]==null)
       {break;}
       else
           if(distinctcomm[i].equals(comm))
           {found=1;
           }
       }
        if(found==0)
       {distinctcomm[i]=comm;
       System.out.println("added");
       }
       }
    
     int pid;
     int vid;
     int personcount=0;
     int patientcount=0;
     int nsbp;
     int ndbp;
     int asbp;
     int adbp;
     String pcomm;
      model.setRowCount(0);
    for(int j=1;j<distinctcomm.length;j++)    
    { String commname=distinctcomm[j];
    if(commname==null)
    { break;}
    else
    {
         System.out.println("dist comm name="+commname);   
     nsbp=0;
     ndbp=0;
     asbp=0;
      adbp=0;
     // int sbp=0;
    // int dbp=0;
     for( Persondesc vs: history.getHistory())
     {  pcomm=vs.getCommunity();
        pid=vs.getId();
        System.out.println("person=" +pcomm+"id="+pid);
    int  Patientfound=0;
     if(pcomm.equals(commname))
     {
     int sbp=0;
     int dbp=0;
     personcount++;
     String vcomm;
      System.out.println("1=sbp="+sbp+"dbp="+dbp+"nsbp="+nsbp+"asbp="+adbp+"ndbp="+ndbp+"adbp="+adbp);
      
       for( Vitaldesc vs1: vitalhistory.getvitalHistory())
       {vid=vs1.getId();
           if(vid==pid)
           {sbp=vs1.getSp();
           dbp=vs1.getDp();
           Patientfound=1;
           }
       }//for vital loop
       if(sbp>120) asbp++; else nsbp++;
       if(dbp<80) adbp++; else ndbp++;
       System.out.println("2=sbp="+sbp+"dbp="+dbp+"nsbp="+nsbp+"asbp="+asbp+"ndbp="+ndbp+"adbp="+adbp);
       patientcount++;
     }//if pcomm equals
     }//for person loop
     
  // }
   //DefaultTableModel model1 =(DefaultTableModel) tblencount.getModel();
   
    
    // System.out.println("hello"+vs.get(0));
    
    
  
    Object[] row= new Object[7];
//     
  row[0]= 0;
 // System.out.println("hellosize"+vs.getseats());
//String s=cmbmanufacture.getItemAt(vs.getManufacturer());

   row[1]=commname;
   row[2]=nsbp;
   row[3]=asbp;
   row[4]=ndbp;
   row[5]=adbp;
  // row[6]=vs.getCity();
  
    model.addRow(row);
    }
    }//distinct loop
      
       
      // if(vs.getCommunity() not in distintcomm)
     // ArrayUtils.
    
              
                      
      
  
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
   // if(!txtage.getText().isEmpty())
    {
    //int sage=Integer.parseInt(txtage.getText());
        
   model.setRowCount(0);
   
  
 for( Persondesc vs: history.getHistory())
       {
     Object[] row= new Object[7];
//   
//if(sage==vs.getAge())
{
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
   // else
    {
         JOptionPane.showMessageDialog(this, "Please enter Valid value");
            
        return;
    }
    }
    
    
     //searchtable ends
   // @Override
//public void setValueAt(Object value, int row, int col) {

//}
}
