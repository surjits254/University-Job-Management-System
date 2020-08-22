/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ist_project;

//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Surji
 */
public class student extends javax.swing.JFrame {
    
    public static String id;

    /**
     * Creates new form student
     */
    public student() {
        initComponents();
    }
    public String getVal(String arg){
        id = arg;
        return id;
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
        jobs = new javax.swing.JButton();
        events = new javax.swing.JButton();
        editProfile = new javax.swing.JButton();
        viewProfile = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        enroll = new javax.swing.JButton();
        apply = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        conLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        urlLabel = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        conField = new javax.swing.JTextField();
        addField = new javax.swing.JTextField();
        urlField = new javax.swing.JTextField();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student");
        setBounds(new java.awt.Rectangle(200, 200, 200, 200));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setSize(new java.awt.Dimension(600, 400));

        jobs.setText("JOBS");
        jobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsActionPerformed(evt);
            }
        });

        events.setText("EVENTS");
        events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventsActionPerformed(evt);
            }
        });

        editProfile.setText("Edit Profile");
        editProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileActionPerformed(evt);
            }
        });

        viewProfile.setText("View Profile");
        viewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(events, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jobs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jobs)
                .addGap(49, 49, 49)
                .addComponent(events)
                .addGap(43, 43, 43)
                .addComponent(viewProfile)
                .addGap(42, 42, 42)
                .addComponent(editProfile)
                .addGap(41, 41, 41)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(51, 51, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 50));

        enroll.setText("Enroll");
        enroll.setEnabled(false);
        enroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollActionPerformed(evt);
            }
        });

        apply.setText("Apply");
        apply.setEnabled(false);
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("Name");
        nameLabel.setEnabled(false);

        dobLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dobLabel.setText("DOB");
        dobLabel.setEnabled(false);

        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLabel.setText("Email");
        emailLabel.setEnabled(false);

        conLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conLabel.setText("Contact");
        conLabel.setEnabled(false);

        addLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLabel.setText("Address");
        addLabel.setEnabled(false);

        urlLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        urlLabel.setText("Profile URL");
        urlLabel.setEnabled(false);

        dobField.setEnabled(false);

        nameField.setEnabled(false);

        emailField.setEnabled(false);

        conField.setEnabled(false);

        addField.setEnabled(false);

        urlField.setEnabled(false);

        submit.setText("Submit");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(urlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dobLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(conLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dobField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urlField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 592, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(enroll)
                        .addGap(43, 43, 43)
                        .addComponent(nameLabel))
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addLabel)
                            .addComponent(conField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(submit)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conLabel)
                    .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlLabel)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(apply)
                    .addContainerGap(943, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsActionPerformed
        try {
            enroll.setEnabled(false);
            submit.setEnabled(false);
            nameLabel.setEnabled(false);
            dobLabel.setEnabled(false);
            emailLabel.setEnabled(false);
            conLabel.setEnabled(false);
            addLabel.setEnabled(false);
            urlLabel.setEnabled(false);
            nameField.setEnabled(false);
            dobField.setEnabled(false);
            emailField.setEnabled(false);
            conField.setEnabled(false);
            addField.setEnabled(false);
            urlField.setEnabled(false);
            apply.setEnabled(true); 
            String[] columns = new String[] {
                "Job Id", "Job Name", "Description", "Job Type","Location","Deadline","URL","Posted By"
            };
            JFrame frame1;
            frame1 = new JFrame("Jobs");
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame1.setBounds(200, 200, 200, 200);
            frame1.setLayout(new BorderLayout()); 
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columns);
            JTable table = new JTable();
            table.setModel(model);
            JScrollPane scroll = new JScrollPane(table);
            scroll.setHorizontalScrollBarPolicy(
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=IST659Project";
            Connection con=DriverManager.getConnection(url,"sa","root");
            Statement stmt = con.createStatement();
            String SQL = "Select * from dbo.jobs";
            ResultSet rs = stmt.executeQuery(SQL);
            int i =0;
            while(rs.next())
            {
                String jobid = rs.getString("jobId");
                String jobname = rs.getString("jobName");
                String desc = rs.getString("description");
                String jobtype = rs.getString("jobType"); 
                String loc = rs.getString("location");
                String deadline = rs.getString("applicationDeadline");
                String urls = rs.getString("jobUrl");
                String post = rs.getString("posterId");
                model.addRow(new Object[]{jobid, jobname, desc, jobtype, loc, deadline, urls,post });
                i++; 
                frame1.add(scroll);
                frame1.setVisible(true);
                frame1.setSize(800,500);
            }
            if(i <1)
            {
                JOptionPane.showMessageDialog(null, "No Jobs Found","Error",
                JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jobsActionPerformed

    private void eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventsActionPerformed
            try{
            apply.setEnabled(false);
            submit.setEnabled(false);
            nameLabel.setEnabled(false);
            dobLabel.setEnabled(false);
            emailLabel.setEnabled(false);
            conLabel.setEnabled(false);
            addLabel.setEnabled(false);
            urlLabel.setEnabled(false);
            nameField.setEnabled(false);
            dobField.setEnabled(false);
            emailField.setEnabled(false);
            conField.setEnabled(false);
            addField.setEnabled(false);
            urlField.setEnabled(false);
            enroll.setEnabled(true);
            String[] columns = new String[] {
                "Event Id", "Event Name", "Description", "Start Date","End Date","Host"
            };
            JFrame frame1;
            frame1 = new JFrame("Events");
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame1.setBounds(200, 200, 200, 200);
            frame1.setLayout(new BorderLayout()); 
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columns);
            JTable table = new JTable();
            table.setModel(model);
            JScrollPane scroll = new JScrollPane(table);
            scroll.setHorizontalScrollBarPolicy(
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=IST659Project";
            Connection con=DriverManager.getConnection(url,"sa","root");
            Statement stmt = con.createStatement();
            String SQL = "Select * from dbo.events";
            ResultSet rs = stmt.executeQuery(SQL);
            int i =0;
            while(rs.next())
            {
                String eventid = rs.getString("eventId");
                String eventname = rs.getString("eventName");
                String desc = rs.getString("description");
                String sdate = rs.getString("startDate"); 
                String edate = rs.getString("endDate");
                String host = rs.getString("host");
                model.addRow(new Object[]{eventid, eventname, desc, sdate, edate, host });
                i++; 
                frame1.add(scroll);
            frame1.setVisible(true);
            frame1.setSize(800,500);
            }
            if(i <1)
            {
                JOptionPane.showMessageDialog(null, "No Events Found","Error",
                JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }            
        
    }//GEN-LAST:event_eventsActionPerformed

    private void enrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollActionPerformed
        event event = new event();
        event.getVal(id);
        event.setVisible(true);
    }//GEN-LAST:event_enrollActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        application application = new application();
        application.getVal(id);
        application.setVisible(true);
    }//GEN-LAST:event_applyActionPerformed

    private void editProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileActionPerformed
        try {
            enroll.setEnabled(false);
        submit.setEnabled(true);
        apply.setEnabled(false);
        nameLabel.setEnabled(true);
        dobLabel.setEnabled(true);
        emailLabel.setEnabled(true);
        conLabel.setEnabled(true);
        addLabel.setEnabled(true);
        urlLabel.setEnabled(true);
        nameField.setEnabled(true);
        dobField.setEnabled(true);
        emailField.setEnabled(true);
        conField.setEnabled(true);
        addField.setEnabled(true);
        urlField.setEnabled(true);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=IST659Project";
            Connection con=DriverManager.getConnection(url,"sa","root");
            Statement stmt = con.createStatement();
            String SQL = "Select studentName,dob,email,contact,address,profileURL from dbo.student where studentID="+id;
            ResultSet rs = stmt.executeQuery(SQL);
            int i =0;
            if(rs.next())
            {
                nameField.setText(rs.getString("studentName"));
                dobField.setText(rs.getString("dob"));
                emailField.setText(rs.getString("email"));
                conField.setText(rs.getString("contact"));
                addField.setText(rs.getString("address"));
                urlField.setText(rs.getString("profileURL"));
                
                i++; 
            }
            if(i <1)
            {
                JOptionPane.showMessageDialog(null, "No Record Found","Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {        
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_editProfileActionPerformed

    private void viewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileActionPerformed
        try
        {
        enroll.setEnabled(false);
        submit.setEnabled(false);
        apply.setEnabled(false);
        nameLabel.setEnabled(true);
        dobLabel.setEnabled(true);
        emailLabel.setEnabled(true);
        conLabel.setEnabled(true);
        addLabel.setEnabled(true);
        urlLabel.setEnabled(true);
        nameField.setEnabled(false);
        dobField.setEnabled(false);
        emailField.setEnabled(false);
        conField.setEnabled(false);
        addField.setEnabled(false);
        urlField.setEnabled(false);
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=IST659Project";
            Connection con=DriverManager.getConnection(url,"sa","root");
            Statement stmt = con.createStatement();
            String SQL = "Select studentName,dob,email,contact,address,profileURL from dbo.student where studentID="+id;
            ResultSet rs = stmt.executeQuery(SQL);
            int i =0;
            if(rs.next())
            {
                nameField.setText(rs.getString("studentName"));
                dobField.setText(rs.getString("dob"));
                emailField.setText(rs.getString("email"));
                conField.setText(rs.getString("contact"));
                addField.setText(rs.getString("address"));
                urlField.setText(rs.getString("profileURL"));
                
                i++; 
            }
            if(i <1)
            {
                JOptionPane.showMessageDialog(null, "No Record Found","Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (ClassNotFoundException ex) {        
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_viewProfileActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            String name = nameField.getText();
            String dob = dobField.getText();
            String email = emailField.getText();
            String add = addField.getText();
            String cont = conField.getText();
            String urlp = urlField.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost\\SQLEXPRESS:1433;database=IST659Project";
            Connection con=DriverManager.getConnection(url,"sa","root");
            Statement stmt = con.createStatement();
            String SQL = "Update dbo.student set studentName='"+name+"',dob='"+dob+"',email='"+email+"',"
                    + "address='"+add+"',contact="+cont+",profileURL='"+urlp+"' where studentID="+id;
            stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(this, "Information Updated Successfully");
            nameField.setEnabled(false);
            dobField.setEnabled(false);
            emailField.setEnabled(false);
            conField.setEnabled(false);
            addField.setEnabled(false);
            urlField.setEnabled(false);
            
        } catch (ClassNotFoundException ex) {        
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        mainPage mainPage = new mainPage();
        this.dispose();
        mainPage.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
    private javax.swing.JTextField addField;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton apply;
    private javax.swing.JTextField conField;
    private javax.swing.JLabel conLabel;
    private javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JButton editProfile;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton enroll;
    private javax.swing.JButton events;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jobs;
    private javax.swing.JButton logout;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton submit;
    private javax.swing.JTextField urlField;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JButton viewProfile;
    // End of variables declaration//GEN-END:variables
}
