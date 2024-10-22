/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assistant;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainWindow extends javax.swing.JFrame {
    public static final String VOICENAME = "kevin";
    private static final String Driver = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String JDBC_URL = "jdbc:derby:Database;create=true";
    static DatabaseHandler db;
    static TextToSpeech tts;
    static LoginPanel login;
    static TaskManager task;
    int xPoint;
    int yPoint;
    SameSoundingWordDetector swd;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() throws SQLException, ClassNotFoundException, IOException {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        db = new DatabaseHandler();
        tts = new TextToSpeech();
        task = new TaskManager();
        chatbox.setEditable(false);
        swd = new SameSoundingWordDetector();
       // VoiceRecognizer();
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
        jPanel2 = new javax.swing.JPanel();
        aboutLabel = new javax.swing.JLabel();
        AdminPanel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        switchRecognizer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatbox = new javax.swing.JTextArea();
        massage = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        aboutLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(204, 204, 204));
        aboutLabel.setText("About");
        aboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLabelMouseClicked(evt);
            }
        });

        AdminPanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AdminPanel.setForeground(new java.awt.Color(204, 204, 204));
        AdminPanel.setText("Admin Panel");
        AdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminPanelMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageResource/Admin_18px.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageResource/Info_18px.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageResource/Assistant_24px.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Virtual Assistant");

        ExitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ExitLabel.setForeground(new java.awt.Color(204, 204, 204));
        ExitLabel.setText("Exit");
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageResource/Exit_16px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageResource/Plush_100px.png"))); // NOI18N

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("VA powered by JAVA");

        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Voice Recognition :");

        switchRecognizer.setForeground(new java.awt.Color(51, 255, 102));
        switchRecognizer.setText("OFF");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExitLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aboutLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdminPanel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(62, 62, 62))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(switchRecognizer)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(switchRecognizer))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdminPanel)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(aboutLabel))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExitLabel)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chatbox.setBackground(new java.awt.Color(0, 153, 153));
        chatbox.setColumns(20);
        chatbox.setFont(new java.awt.Font("Nirmala UI", 1, 15)); // NOI18N
        chatbox.setForeground(new java.awt.Color(255, 255, 255));
        chatbox.setRows(5);
        chatbox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(chatbox);

        massage.setBackground(new java.awt.Color(0, 204, 204));
        massage.setForeground(new java.awt.Color(255, 255, 255));
        massage.setText("Type your massage here...");
        massage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        massage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                massageMouseClicked(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(0, 153, 51));
        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Machine");

        statusLabel.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(204, 0, 0));
        statusLabel.setText("Manual");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageResource/Gas Mask_28px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 51));
        jLabel12.setText("MODE :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(massage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statusLabel)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(statusLabel)))
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(massage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        if(switchRecognizer.getText().equals("ON"))
            TextToSpeech.generateVoice("Turn off voice recognizer first");
        else {
            try {
                DataProcessor(massage.getText());
            } catch (IOException | InterruptedException | SQLException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_sendButtonActionPerformed
    
    private String QuestionAssumer(String word) throws SQLException {
        System.out.println(word+"lds");
        StringTokenizer stk = new StringTokenizer(word, " ");
        String q = "";
        while(stk.hasMoreTokens()) {
            String temp = stk.nextToken().toUpperCase();
            System.out.println("Code: "+db.getCodeOfWord(temp));
           //if(db.getCodeOfWord(temp).equals(swd.generateSoundCode(temp)))
                q += (db.getWordOfCode(swd.generateSoundCode(temp)) + " ");
        }
        System.out.println("Question: "+q);
        return q.trim();
    }
    
    public void DataProcessor(String data) throws IOException, InterruptedException, SQLException {
        String cacheData = data;
        
        if(data.toLowerCase().contains("wake"))
            return;
        
        if(data.toLowerCase().contains("open browser")) {
            TextToSpeech.generateVoice("Opening browser");
            chatbox.append("opening browser\n");
            task.openTaskManager(task.getBrowserPath());
            return;
        }
        
        if(data.toLowerCase().contains("close browser")) {
            TextToSpeech.generateVoice("closing browser");
            chatbox.append("closing browser\n");
            task.closeApplication("chrome");
            return;
        }
        
        if(data.toLowerCase().contains("open media")) {
            TextToSpeech.generateVoice("Opening media player");
            chatbox.append("opening vlc media player\n");
            task.openTaskManager(task.getMediaPlayerPath());
            return;
        }
        
        if(data.toLowerCase().contains("close media")) {
            TextToSpeech.generateVoice("closing media player");
            chatbox.append("closing media player\n");
            task.closeApplication("vlc");
            return;
        }
        
        data = QuestionAssumer(data);
        System.out.println("Data: "+data);
        
        String question = "";
        String result = "null";
        System.out.println();
        boolean flag = false;
        
        if(!data.equals("")) {
            try {
                question = db.getResultOfQueryLikeOperation(data.toLowerCase());
                result = db.getResultOfQueryModelBasedTable(question);
                if(result == null)
                    flag = true;
                
            } catch (SQLException ex) {
                Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(flag);
        } else {
            chatbox.append("Answer Unknown, admin will review the Questain Later.\n");
            TextToSpeech.generateVoice("I am unable to assume that questain.");
            db.insertDataOnTempDatSet(cacheData);
            return;
        }
        if(flag) {
            chatbox.append("Answer Unknown, admin will review the Questain Later.\n");
            TextToSpeech.generateVoice("I am unable to answer that questain.");
            db.insertDataOnTempDatSet(data);
        }
        else {
            chatbox.append("~Human : "+question+"\n");
            chatbox.append("~Machine : "+result+"\n");
            TextToSpeech.generateVoice(result);
        }
    }
    public void isRecognitionStart(String mode) {
        switchRecognizer.setText(mode);
    }
    private void massageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_massageMouseClicked
        massage.setText("");
    }//GEN-LAST:event_massageMouseClicked

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitLabelMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xPoint, y-yPoint);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xPoint = evt.getX();
        yPoint = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void aboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseClicked
        AboutWindow about = new AboutWindow();
        about.show();
    }//GEN-LAST:event_aboutLabelMouseClicked

    private void AdminPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPanelMouseClicked
        login = new LoginPanel();
        login.show();
    }//GEN-LAST:event_AdminPanelMouseClicked
    
    public ResultSet getResultOfQuery (String sql) throws SQLException {
        return db.getAllTheResultSet(sql);
    }
    
    public void setStatusMode(String mode) {
        statusLabel.setText(mode);
    }
    
    public static void main(String args[]) throws SQLException, IOException {
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainWindow().setVisible(true);
                } catch (SQLException | ClassNotFoundException | IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void appendInChatBox(String data) {
        chatbox.setText(data);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminPanel;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel aboutLabel;
    private static javax.swing.JTextArea chatbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField massage;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel switchRecognizer;
    // End of variables declaration//GEN-END:variables
}
