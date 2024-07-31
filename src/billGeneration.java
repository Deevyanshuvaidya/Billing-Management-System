import Project.ConnectionProvider;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.util.Date;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.management.modelmbean.ModelMBean;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.pdf.PdfPTable;
import javax.swing.ComboBoxEditor;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DD
 */
public class billGeneration extends javax.swing.JFrame {
    public int finaltotal=0;
    public int Total=0;

    /**
     * Creates new form billGeneration
     */
    public billGeneration() {
        initComponents();
        billHeader();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dateFormat.format(date));
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        jLabel5.setText(dtf.format(now));
    }
    private void billHeader()
    {
        
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("Select max(InvoiceNumber) from billdetails");
            if(rs.first())
            {
                int id=rs.getInt(1);
                id=id+1;
                String str=String.valueOf(id);
                
                
                    DateTimeFormatter dft=DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                String z=dft.format(now);
                SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
                Date date=new Date();
                String j=dateFormat.format(date);
                
                
                txtbill.setText("\t    ***** AIML STORE *****"+"\n\n"
                                +"                      KIT College of Engineering, Kolhapur.\n"
                                +"                      Gokul Shirgaon, Maharashtra-416234\n"
                                +"                         Contact no :- (+91) 8625969023\n"
                                +"                                               (+91) 9404288592\n"
                                +"*****************************************************************\n"
                +"Invoice Number :- "+str+"\tDate :-"+j+"\n\t\tTime :-"+z+"\n"
                +"*****************************************************************"+"\n"+
                 "Name"+"\t"+"Rate"+"\t"+"Quantity"+"\t"+"Total"+"\n"+
                                "*****************************************************************"+"\n");
        
             
                
                
            }
            else{
            jLabel25.setText("1");}}
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billing ani.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 6, 276, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 126, 960, 10));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setText("Date :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 30, 60, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setText("Time :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 67, 60, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 30, 158, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 67, 158, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Buyer :-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 142, 78, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 50, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 146, 231, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel8.setText("Mobile Number ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 130, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 146, 180, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 180, 960, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Product :-");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 196, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel10.setText("Product ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 203, 90, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 100, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel11.setText("Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 150, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel12.setText("Rate");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 40, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 80, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel13.setText("Quantity Available");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 150, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 90, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 262, 960, 12));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Rate", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 280, 575, 252));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel14.setText("Calculation Details :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 538, 160, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel15.setText("Total Amount");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 579, 150, -1));

        txtbill.setColumns(20);
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 280, 330, 376));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel16.setText("Disscount in %");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 614, 150, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 576, 246, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel17.setText("Amount to Be Paid");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 648, 150, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 645, 246, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel18.setText("Paid Amount");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 689, 150, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 686, 246, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel19.setText("Return Amount");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 730, 150, -1));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 727, 246, -1));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 576, -1, -1));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 645, 110, -1));

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close Jframe_1.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 715, 110, -1));

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/printer.png"))); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 686, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel20.setText("Quantity");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 80, -1));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 60, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel23.setText("Discount ");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 80, -1));

        jTextField12.setText("0");
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 40, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("1");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 71, -1));

        jTextField13.setText("0");
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 614, 246, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel25.setText("Invoice No. :- ");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 120, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billingbg.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
                String pID=jTextField3.getText();
        try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from productdetails where pID='"+pID+"'");
        if(rs.next()){
        jTextField4.setText(rs.getString(2));
        jTextField5.setText(rs.getString(3));
        jTextField6.setText(rs.getString(4));
        }
        else{
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here
        String Quantity=jTextField6.getText();
           String quantity=jTextField11.getText();
           int d=Integer.parseInt(Quantity);
           int s=Integer.parseInt(quantity);
           d=d-s;
           String d1=String.valueOf(d);
           jTextField6.setText(d1);
         String pID=jTextField3.getText();
         String pName=jTextField4.getText();
          String rate=jTextField5.getText();
          

           try{
           Connection con=ConnectionProvider.getCon();
           Statement st=con.createStatement();
           st.executeUpdate("update productdetails set pName='"+pName+"',rate='"+rate+"',quantity='"+d1+"'where pID='"+pID+"'");}
           catch(Exception e){
           JOptionPane.showMessageDialog(null, e);}

        
        int price=Integer.parseInt(jTextField5.getText());
        int quantit=Integer.parseInt(jTextField11.getText());
        int dis= Integer.parseInt(jTextField12.getText());
        int total=price*quantit;
        int o=dis*total/100;
        int total1=total-o;
        
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[]{jTextField3.getText(),jTextField4.getText(),price,quantity,total1});
        finaltotal=finaltotal+total1;
        String finaltotal1=String.valueOf(finaltotal);
        jTextField7.setText(finaltotal1);
        txtbill.setText(
        txtbill.getText()+jTextField4.getText()+"\t"+jTextField5.getText()+"\t"+jTextField11.getText()+"\t"+total1+"\n");
         if(dis!=0){
          txtbill.setText(txtbill.getText()+"\t Discount on "+jTextField4.getText()+" :- "+jTextField3.getText()+"%\n");
         }
       
        
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField11.setText("");
        jTextField12.setText("0");
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        String x=dateFormat.format(date);
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        String j=dtf.format(now);
        String InvoiceNumber=jLabel22.getText();
        String CustomerName=jTextField1.getText();
        String MobileNumber=jTextField2.getText();
        String TotalAmountpaid=jTextField8.getText();

        try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        st.executeUpdate("insert into billdetails values('"+InvoiceNumber+"','"+CustomerName+"','"+MobileNumber+"','"+TotalAmountpaid+"','"+x+"','"+j+"')");

        }
        catch(Exception e){}
        String paidAmount=jTextField9.getText();
        int z=Integer.parseInt(paidAmount);
        
        Total=z-Total;
        String total1=String.valueOf(Total);
        jTextField10.setText(total1);
        jTextField10.setEditable(false);
          txtbill.setText(
        txtbill.getText()+"\n"+"Paid Amount :"+"\t\t\t"+jTextField9.getText()+"\n"+"Return Amount :"+"\t\t"+jTextField10.getText()+"\n");
            txtbill.setText(
        txtbill.getText()+"==========================================="+"\n"+"\t"+"Thank You For Visiting...!"+"\n\n");

    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                setVisible(false);
        new billGeneration().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int q=16;
                String discount=jTextField13.getText();
        int j=Integer.parseInt(discount);
        j=j*finaltotal/100;
        Total=(finaltotal-j)+q;
        String Total1=String.valueOf(Total);
        jTextField8.setText(Total1);
        txtbill.setText(
        txtbill.getText()+"==========================================="+"\n");
        txtbill.setText(
        txtbill.getText()+"Total Amount :"+"\t\t\t"+jTextField7.getText()+" \n"+"Discount :"+"\t\t\t"+jTextField13.getText()+"%"+"\n"+"S GST:"+"\t\t\t"+"8"+"\n"+"C GST:"+"\t\t\t"+"8"+"\n"+"\n"+"Amount to be Paid :"+"\t\t"+jTextField8.getText()+"\n");
 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
        txtbill.setText(txtbill.getText()+"\n"+"Develop by: Software Chasers");
        txtbill.print();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
      ResultSet rs=st.executeQuery("Select max(InvoiceNumber) from billdetails");
        if(rs.first())
        {
        int id=rs.getInt(1);
        id=id+1;
        String str=String.valueOf(id);
        jLabel22.setText(str);
        }
        else{
        jLabel22.setText("1");}}
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
                        String pName=jTextField4.getText();
        try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select *from productdetails where pName='"+pName+"'");
        if(rs.next()){
        jTextField3.setText(rs.getString(1));
        jTextField5.setText(rs.getString(3));
        jTextField6.setText(rs.getString(4));
        }
        else{
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(billGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billGeneration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextArea txtbill;
    // End of variables declaration//GEN-END:variables
}
