/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package WeatherReport;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
/*
/**
 *
 * @author Gabriel
 */
public class WeatherReport extends javax.swing.JFrame {

    /**
     * Creates new form WeatherReport
     */
    public WeatherReport() {
        initComponents();
    }
Array s = new Array();
WeatherBits W;
int count;
int count2;
double sumD;
double totalDamage;
double AverageDamage;
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
        EventIDField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        DistrictField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BeginDateField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        StartTimeField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        DeathsField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        InjuriesField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        DamagesField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LatitudeField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        LongitudeField = new javax.swing.JTextField();
        Add = new javax.swing.JToggleButton();
        Remove = new javax.swing.JToggleButton();
        AverageDamageCheck = new javax.swing.JLabel();
        TotalDeathCheck = new javax.swing.JLabel();
        Exit = new javax.swing.JToggleButton();
        EventDropDown = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WeatherReport/794c12a5-78b0-4174-baeb-70658f3d1826-jumbo9x16_288668656_443427167603498_1567265179263268101_n.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Weather Documenter");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Enter weather data:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Event ID:");

        EventIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventIDFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("District:");

        DistrictField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistrictFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("*If you want to remove an Event, only enter the ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Beginning Date:");

        BeginDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginDateFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("(MM/DD/YYYY)");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Start Time:");

        StartTimeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartTimeFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Ex: 8:00PM as 2000");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Event Type:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Deaths:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Injuries:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Damages: ");

        jLabel15.setText("In Dollars");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Latitude: ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Longitude:");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Remove.setText("Remove");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        AverageDamageCheck.setText("Current Average Damages:");

        TotalDeathCheck.setText("Current Total Deaths: ");

        Exit.setText("Close");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        EventDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thunderstorm", "Heat Wave", "Tropical Storm", "Hurricane" }));
        EventDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventDropDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StartTimeField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EventIDField)
                                    .addComponent(DistrictField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BeginDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Add)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LongitudeField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Remove))))
                            .addComponent(AverageDamageCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EventDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeathsField)
                                    .addComponent(InjuriesField)
                                    .addComponent(DamagesField)
                                    .addComponent(LatitudeField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TotalDeathCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(EventIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistrictField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(BeginDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(StartTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(EventDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(DeathsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(InjuriesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(DamagesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(LatitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(LongitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Remove))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Exit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(AverageDamageCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalDeathCheck)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EventIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventIDFieldActionPerformed

    private void DistrictFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistrictFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistrictFieldActionPerformed

    private void BeginDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeginDateFieldActionPerformed

    private void StartTimeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartTimeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartTimeFieldActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        sumD = 0;
        totalDamage = 0;
        String EventID = EventIDField.getText();
        String district = DistrictField.getText();
        String BeginDate = BeginDateField.getText();
        int StartTime = Integer.parseInt(StartTimeField.getText());
        String EventType = EventDropDown.getSelectedItem() + "";
        int deaths = Integer.parseInt(DeathsField.getText());
        int injuries = Integer.parseInt(InjuriesField.getText());
        int damages = Integer.parseInt(DamagesField.getText());
        String Latitude = LatitudeField.getText();
        String Longitude = LongitudeField.getText();
        W = new WeatherBits(EventID, district, BeginDate, StartTime, EventType, deaths, injuries, damages, Latitude, Longitude);
        s.ArList.add(W);
        for (int x = 0; x < s.ArList.size(); x++){
            count2 = x+1;
            sumD += s.ArList.get(x).deaths;
            totalDamage += s.ArList.get(x).damages;           
        }
         AverageDamage = totalDamage / count2;
        TotalDeathCheck.setText("Current Total deaths: " + sumD);
        AverageDamageCheck.setText("Current Average Damages: " + AverageDamage);
{
    }//GEN-LAST:event_AddActionPerformed
    EventIDField.setText("");
    DistrictField.setText("");
    BeginDateField.setText("");
    StartTimeField.setText("");
    DeathsField.setText("");
    InjuriesField.setText("");
    DamagesField.setText("");
    LatitudeField.setText("");
    LongitudeField.setText("");
    
    }
    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        String remove = EventIDField.getText();
        for (int r = 0; r < s.ArList.size(); r++){
            if (remove.equals(s.ArList.get(r).EventID)){
                sumD -= s.ArList.get(r).deaths;
                totalDamage -= s.ArList.get(r).damages;
                s.ArList.remove(r);
             
            }
            
        }
        
        EventIDField.setText("");
        TotalDeathCheck.setText("Current Total deaths: " + sumD);
        AverageDamageCheck.setText("Current Average Damages: " + AverageDamage);
        if(AverageDamage == 0){
            AverageDamageCheck.setText("Current Average Damages: 0");
        }
    }//GEN-LAST:event_RemoveActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
               try{
            PrintWriter out = new PrintWriter("weatherdata.txt");
      for (int i = 0; i < s.ArList.size(); i++){
           count = i + 1;
          out.print("Event ID: " );
          out.print(s.ArList.get(i).EventID);
          out.print(" , Event Type: ");
          out.print(s.ArList.get(i).EventType);
          out.print(" , District: ");
          out.print(s.ArList.get(i).district);
          out.print(" , Beginning Date: ");
          out.print(s.ArList.get(i).BeginDate);
          out.print(" , Start Time: ");
          out.print(s.ArList.get(i).StartTime);
          out.print(" , Deaths: ");
          out.print(s.ArList.get(i).deaths);
          out.print(" , Injuries: ");
          out.print(s.ArList.get(i).injuries);
          out.print(" , Damages: ");
          out.print(s.ArList.get(i).damages);
          out.print(" , Latitude and Longitude: ");
          out.print(s.ArList.get(i).Latitude);
          out.print(",");
          out.println(s.ArList.get(i).Longitude);
      }
      out.println("Here is the total amount of incidients: " + count);
      out.println("Total Deaths: " + sumD);
      out.println("Here's the dates and Event IDs where some has died: ");
      for (int d = 0; d < s.ArList.size(); d++){
          if (s.ArList.get(d).deaths > 0){
              out.print(s.ArList.get(d).EventID);
              out.print(" ");
              out.println(s.ArList.get(d).BeginDate);
          }
      }
      if(AverageDamage == 0){
          out.println("Average Damages: 0");
      }
      else{
      out.println("Average Damages:" + AverageDamage);
      }
      out.println("Here is all the dates for all recorded heat events: ");
      String heat= "Heat Wave";
      for(int h = 0; h < s.ArList.size(); h++){
          if (heat.equals(s.ArList.get(h).EventType)){
              out.println(s.ArList.get(h).BeginDate);
          }
      }
      out.println("The Start Times (in military) for thunder storms are as follows: ");
      String thunder = "Thunderstorm";
      for(int t = 0; t < s.ArList.size(); t++){
          if(thunder.equals(s.ArList.get(t).EventType)){
              out.println(s.ArList.get(t).StartTime);
          }
      }
out.print("Here's the total property damage: $");
out.println(totalDamage);


      out.close();
       }catch (Exception e){
           
       }
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void EventDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EventDropDownActionPerformed

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
            java.util.logging.Logger.getLogger(WeatherReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton Add;
    private javax.swing.JLabel AverageDamageCheck;
    private javax.swing.JTextField BeginDateField;
    private javax.swing.JTextField DamagesField;
    private javax.swing.JTextField DeathsField;
    private javax.swing.JTextField DistrictField;
    public javax.swing.JComboBox<String> EventDropDown;
    private javax.swing.JTextField EventIDField;
    private javax.swing.JToggleButton Exit;
    private javax.swing.JTextField InjuriesField;
    private javax.swing.JTextField LatitudeField;
    private javax.swing.JTextField LongitudeField;
    public javax.swing.JToggleButton Remove;
    private javax.swing.JTextField StartTimeField;
    private javax.swing.JLabel TotalDeathCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
