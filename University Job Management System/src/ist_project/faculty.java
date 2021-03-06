/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist_project;

import static com.microsoft.sqlserver.jdbc.StringUtils.isEmpty;
import static ist_project.application.id;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Surji
 */
public class faculty extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public faculty() {
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

        studBG = new javax.swing.ButtonGroup();
        facBG = new javax.swing.ButtonGroup();
        empBG = new javax.swing.ButtonGroup();
        evBG = new javax.swing.ButtonGroup();
        anaBG = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        student = new javax.swing.JButton();
        faculty = new javax.swing.JButton();
        employer = new javax.swing.JButton();
        events = new javax.swing.JButton();
        analytics = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        studAdd = new javax.swing.JRadioButton();
        studSearch = new javax.swing.JRadioButton();
        studField = new javax.swing.JTextField();
        studSearchB = new javax.swing.JButton();
        empAdd = new javax.swing.JRadioButton();
        facAdd = new javax.swing.JRadioButton();
        evAdd = new javax.swing.JRadioButton();
        rep = new javax.swing.JRadioButton();
        facSearch = new javax.swing.JRadioButton();
        empSearch = new javax.swing.JRadioButton();
        evSearch = new javax.swing.JRadioButton();
        facField = new javax.swing.JTextField();
        empField = new javax.swing.JTextField();
        evField = new javax.swing.JTextField();
        facSearchB = new javax.swing.JButton();
        empSearchB = new javax.swing.JButton();
        evSearchB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty");
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        student.setText("Student Info");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        faculty.setText("Faculty Info");
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });

        employer.setText("Employer Info");
        employer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employerActionPerformed(evt);
            }
        });

        events.setText("Events Info");
        events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsActionPerformed(evt);
            }
        });

        analytics.setText("Analytics");
        analytics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyticsActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        studBG.add(studAdd);
        studAdd.setText("Add");
        studAdd.setEnabled(false);
        studAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studAddActionPerformed(evt);
            }
        });

        studBG.add(studSearch);
        studSearch.setText("Search");
        studSearch.setEnabled(false);
        studSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studSearchActionPerformed(evt);
            }
        });

        studField.setEnabled(false);

        studSearchB.setText("Search");
        studSearchB.setEnabled(false);
        studSearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studSearchBActionPerformed(evt);
            }
        });

        empBG.add(empAdd);
        empAdd.setText("Add");
        empAdd.setEnabled(false);
        empAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAddActionPerformed(evt);
            }
        });

        facBG.add(facAdd);
        facAdd.setText("Add");
        facAdd.setEnabled(false);
        facAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facAddActionPerformed(evt);
            }
        });

        evBG.add(evAdd);
        evAdd.setText("Add");
        evAdd.setEnabled(false);
        evAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evAddActionPerformed(evt);
            }
        });

        anaBG.add(rep);
        rep.setText("Reports");
        rep.setEnabled(false);
        rep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repActionPerformed(evt);
            }
        });

        facBG.add(facSearch);
        facSearch.setText("Search");
        facSearch.setEnabled(false);
        facSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facSearchActionPerformed(evt);
            }
        });

        empBG.add(empSearch);
        empSearch.setText("Search");
        empSearch.setEnabled(false);
        empSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSearchActionPerformed(evt);
            }
        });

        evBG.add(evSearch);
        evSearch.setText("Search");
        evSearch.setEnabled(false);
        evSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evSearchActionPerformed(evt);
            }
        });

        facField.setEnabled(false);
        facField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facFieldActionPerformed(evt);
            }
        });

        empField.setEnabled(false);

        evField.setEnabled(false);

        facSearchB.setText("Search");
        facSearchB.setEnabled(false);

        empSearchB.setText("Search");
        empSearchB.setEnabled(false);

        evSearchB.setText("Search");
        evSearchB.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(employer, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faculty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(events, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(analytics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rep)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(facSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(facField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(evSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(evField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(evSearchB)
                    .addComponent(empSearchB)
                    .addComponent(facSearchB)
                    .addComponent(studSearchB))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(student)
                        .addGap(18, 18, 18)
                        .addComponent(faculty)
                        .addGap(18, 18, 18)
                        .addComponent(employer)
                        .addGap(18, 18, 18)
                        .addComponent(events)
                        .addGap(18, 18, 18)
                        .addComponent(analytics))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studAdd)
                            .addComponent(studSearch)
                            .addComponent(studField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studSearchB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facAdd)
                            .addComponent(facSearch)
                            .addComponent(facField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facSearchB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empAdd)
                            .addComponent(empSearch)
                            .addComponent(empField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empSearchB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(evAdd)
                            .addComponent(evSearch)
                            .addComponent(evField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evSearchB))
                        .addGap(18, 18, 18)
                        .addComponent(rep)))
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        mainPage mainPage = new mainPage();
        this.dispose();
        mainPage.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        studAdd.setEnabled(true);
        studSearch.setEnabled(true);
        studField.setEnabled(false);
        studSearchB.setEnabled(false);
        facAdd.setEnabled(false);
        facSearch.setEnabled(false);
        facField.setEnabled(false);
        facSearchB.setEnabled(false);
        empAdd.setEnabled(false);
        empSearch.setEnabled(false);
        empField.setEnabled(false);
        empSearchB.setEnabled(false);
        evAdd.setEnabled(false);
        evSearch.setEnabled(false);
        evField.setEnabled(false);
        evSearchB.setEnabled(false);
        rep.setEnabled(false);
        

        
    }//GEN-LAST:event_studentActionPerformed

    private void studAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studAddActionPerformed
        studField.setEnabled(false);
        studSearchB.setEnabled(false);
        studentInfo studentInfo = new studentInfo();
        studentInfo.getbutton("add");
        studentInfo.setVisible(true);
    }//GEN-LAST:event_studAddActionPerformed

    private void studSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studSearchActionPerformed
        studField.setEnabled(true);
        studSearchB.setEnabled(true);
    }//GEN-LAST:event_studSearchActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
        studAdd.setEnabled(false);
        studSearch.setEnabled(false);
        studField.setEnabled(false);
        studSearchB.setEnabled(false);
        facAdd.setEnabled(true);
        facSearch.setEnabled(true);
        facField.setEnabled(false);
        facSearchB.setEnabled(false);
        empAdd.setEnabled(false);
        empSearch.setEnabled(false);
        empField.setEnabled(false);
        empSearchB.setEnabled(false);
        evAdd.setEnabled(false);
        evSearch.setEnabled(false);
        evField.setEnabled(false);
        evSearchB.setEnabled(false);
        rep.setEnabled(false);
        
    }//GEN-LAST:event_facultyActionPerformed

    private void facFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facFieldActionPerformed

    private void facAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facAddActionPerformed
        facField.setEnabled(false);
        facSearchB.setEnabled(false);
        facultyInfo facultyInfo = new facultyInfo();
        facultyInfo.getbutton("add");
        facultyInfo.setVisible(true);
    }//GEN-LAST:event_facAddActionPerformed

    private void facSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facSearchActionPerformed
        facField.setEnabled(true);
        facSearchB.setEnabled(true);
        facultyInfo facultyInfo = new facultyInfo();
        facultyInfo.getVal(facField.getText());
        facultyInfo.getbutton("search");
        facultyInfo.setVisible(true);
    }//GEN-LAST:event_facSearchActionPerformed

    private void employerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employerActionPerformed
        studAdd.setEnabled(false);
        studSearch.setEnabled(false);
        studField.setEnabled(false);
        studSearchB.setEnabled(false);
        facAdd.setEnabled(false);
        facSearch.setEnabled(false);
        facField.setEnabled(false);
        facSearchB.setEnabled(false);
        empAdd.setEnabled(true);
        empSearch.setEnabled(true);
        empField.setEnabled(false);
        empSearchB.setEnabled(false);
        evAdd.setEnabled(false);
        evSearch.setEnabled(false);
        evField.setEnabled(false);
        evSearchB.setEnabled(false);
        rep.setEnabled(false);
        
    }//GEN-LAST:event_employerActionPerformed

    private void empAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAddActionPerformed
        empField.setEnabled(false);
        empSearchB.setEnabled(false);
        employerInfo employerInfo = new employerInfo();
        employerInfo.getbutton("add");
        employerInfo.setVisible(true);
    }//GEN-LAST:event_empAddActionPerformed

    private void empSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSearchActionPerformed
        empField.setEnabled(true);
        empSearchB.setEnabled(true);
        employerInfo employerInfo = new employerInfo();
        employerInfo.getVal(empField.getText());
        employerInfo.getbutton("search");
        employerInfo.setVisible(true);
    }//GEN-LAST:event_empSearchActionPerformed

    private void eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsActionPerformed
        studAdd.setEnabled(false);
        studSearch.setEnabled(false);
        studField.setEnabled(false);
        studSearchB.setEnabled(false);
        facAdd.setEnabled(false);
        facSearch.setEnabled(false);
        facField.setEnabled(false);
        facSearchB.setEnabled(false);
        empAdd.setEnabled(false);
        empSearch.setEnabled(false);
        empField.setEnabled(false);
        empSearchB.setEnabled(false);
        evAdd.setEnabled(true);
        evSearch.setEnabled(true);
        evField.setEnabled(false);
        evSearchB.setEnabled(false);
        rep.setEnabled(false);

    }//GEN-LAST:event_eventsActionPerformed

    private void evAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evAddActionPerformed
        evField.setEnabled(false);
        evSearchB.setEnabled(false);
        eventInfo eventInfo = new eventInfo();
        eventInfo.getbutton("add");
        eventInfo.setVisible(true);
    }//GEN-LAST:event_evAddActionPerformed

    private void evSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evSearchActionPerformed
        evField.setEnabled(true);
        evSearchB.setEnabled(true);
        eventInfo eventInfo = new eventInfo();
        eventInfo.getVal(evField.getText());
        eventInfo.getbutton("search");
        eventInfo.setVisible(true);
    }//GEN-LAST:event_evSearchActionPerformed

    private void analyticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyticsActionPerformed
        studAdd.setEnabled(false);
        studSearch.setEnabled(false);
        studField.setEnabled(false);
        studSearchB.setEnabled(false);
        facAdd.setEnabled(false);
        facSearch.setEnabled(false);
        facField.setEnabled(false);
        facSearchB.setEnabled(false);
        empAdd.setEnabled(false);
        empSearch.setEnabled(false);
        empField.setEnabled(false);
        empSearchB.setEnabled(false);
        evAdd.setEnabled(false);
        evSearch.setEnabled(false);
        evField.setEnabled(false);
        evSearchB.setEnabled(false);
        rep.setEnabled(true);
       
    }//GEN-LAST:event_analyticsActionPerformed

    private void repActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repActionPerformed
        reports reports = new reports();
        reports.setVisible(true);
    }//GEN-LAST:event_repActionPerformed

    private void studSearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studSearchBActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=IST659Project";
            Connection con=DriverManager.getConnection(url,"sa","root");
            Statement stmt = con.createStatement();
            String studId = studField.getText();
            if(! isEmpty(studId)){
                String SQL = "Select count(*) as cnt from dbo.student where studentId="+studId;
                ResultSet rs = stmt.executeQuery(SQL);
                if(rs.next() != false && Integer.parseInt(rs.getString("cnt")) == 1){
                    studentInfo studentInfo = new studentInfo();
                    studentInfo.getVal(studField.getText());
                    studentInfo.getbutton("search");
                    studentInfo.setVisible(true);
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Student ID","Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Student ID","Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_studSearchBActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup anaBG;
    private javax.swing.JButton analytics;
    private javax.swing.JRadioButton empAdd;
    private javax.swing.ButtonGroup empBG;
    private javax.swing.JTextField empField;
    private javax.swing.JRadioButton empSearch;
    private javax.swing.JButton empSearchB;
    private javax.swing.JButton employer;
    private javax.swing.JRadioButton evAdd;
    private javax.swing.ButtonGroup evBG;
    private javax.swing.JTextField evField;
    private javax.swing.JRadioButton evSearch;
    private javax.swing.JButton evSearchB;
    private javax.swing.JButton events;
    private javax.swing.JRadioButton facAdd;
    private javax.swing.ButtonGroup facBG;
    private javax.swing.JTextField facField;
    private javax.swing.JRadioButton facSearch;
    private javax.swing.JButton facSearchB;
    private javax.swing.JButton faculty;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JRadioButton rep;
    private javax.swing.JRadioButton studAdd;
    private javax.swing.ButtonGroup studBG;
    private javax.swing.JTextField studField;
    private javax.swing.JRadioButton studSearch;
    private javax.swing.JButton studSearchB;
    private javax.swing.JButton student;
    // End of variables declaration//GEN-END:variables
}
