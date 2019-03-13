/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galge;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import server.GalgeInterf;

/**
 *
 * @author alexander
 */
public class View extends javax.swing.JFrame {
    
    private GalgeInterf g;
    private boolean loggedin = false;

    /**
     * Creates new form View
     */
    public View() {
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

        label_guess = new javax.swing.JLabel();
        button_guess = new javax.swing.JButton();
        text_guess = new javax.swing.JTextField();
        label_title = new javax.swing.JLabel();
        toggle_newGame = new javax.swing.JToggleButton();
        label_errors = new javax.swing.JLabel();
        panel_ = new java.awt.Panel();
        button_restart = new javax.swing.JButton();
        textBrugernavn = new javax.swing.JTextField();
        textKodeord = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_guess.setText("[Ordet]");

        button_guess.setText("GÆT");
        button_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guessActionPerformed(evt);
            }
        });

        label_title.setText("velkommen til Galgespillet");

        toggle_newGame.setText("forbind til server");
        toggle_newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggle_newGameActionPerformed(evt);
            }
        });

        label_errors.setText("forbind til server");

        javax.swing.GroupLayout panel_Layout = new javax.swing.GroupLayout(panel_);
        panel_.setLayout(panel_Layout);
        panel_Layout.setHorizontalGroup(
            panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel_Layout.setVerticalGroup(
            panel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        button_restart.setText("start igen");
        button_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_restartActionPerformed(evt);
            }
        });

        textBrugernavn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBrugernavnActionPerformed(evt);
            }
        });

        jLabel1.setText("brugernavn");

        jLabel2.setText("kodeord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(toggle_newGame))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(button_guess))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(text_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button_restart))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(label_guess)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(textBrugernavn)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textKodeord))
                                .addGap(0, 66, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_errors)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_title)
                    .addComponent(toggle_newGame))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label_guess)
                        .addGap(46, 46, 46)
                        .addComponent(text_guess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(button_guess)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(label_errors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_restart))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textBrugernavn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textKodeord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guessActionPerformed
        
          buttonPressed();

        // TODO add your handling code here:
    }//GEN-LAST:event_button_guessActionPerformed

    private void toggle_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggle_newGameActionPerformed

          Connect();
        
    }//GEN-LAST:event_toggle_newGameActionPerformed

    private void button_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_restartActionPerformed
        startIgen();        // TODO add your handling code here:
    }//GEN-LAST:event_button_restartActionPerformed

    private void textBrugernavnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBrugernavnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrugernavnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_guess;
    private javax.swing.JButton button_restart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel label_errors;
    private javax.swing.JLabel label_guess;
    private javax.swing.JLabel label_title;
    private java.awt.Panel panel_;
    private javax.swing.JTextField textBrugernavn;
    private javax.swing.JTextField textKodeord;
    private javax.swing.JTextField text_guess;
    private javax.swing.JToggleButton toggle_newGame;
    // End of variables declaration//GEN-END:variables

    
    
    
    //-------------buttons logik-----------//
    
    
    
    
    private void buttonPressed() {
        
        String brugerNavn = textBrugernavn.getText().toString();
        String kodeOrd = textKodeord.getText().toString();
        
        String str = text_guess.getText().toLowerCase();
        text_guess.setText("");
        
        String synligtOrd;
        
        try {
            synligtOrd = g.gæt(brugerNavn, kodeOrd, str);
            label_guess.setText(synligtOrd);
            label_errors.setText("du har " + g.antalFejl(brugerNavn, kodeOrd) + "/7 fejl");
        } catch (RemoteException | NullPointerException e) {
            System.err.println("der er ikke forbindelse til serveren" + e);
            toggle_newGame.setText("ingen forbindelse");
            this.loggedin=false;
        } finally {
            toggle_newGame.setSelected(this.loggedin);
        }
            
        
        //panel_.imageUpdate(img, NORMAL, WIDTH, WIDTH, WIDTH, WIDTH)
        try {
            if (g.erSpilletSlut(brugerNavn, kodeOrd)) {
                if (g.erSpilletVundet(brugerNavn, kodeOrd)) {
                    label_errors.setText("tillykke!\ndu har vundet!\n" + g.antalFejl(brugerNavn, kodeOrd) + " fejl" );
                } else {
                    label_errors.setText("du har tabt!");
                }
            }
        } catch (RemoteException | NullPointerException e) {
            System.err.println("der er ikke forbindelse til serveren" + e);
            toggle_newGame.setText("ingen forbindelse");
            loggedin = false;
        } finally {
            toggle_newGame.setSelected(loggedin);
        }
    }

    

   
    private void startIgen(){
        String brugerNavn = textBrugernavn.getText().toString();
        String kodeOrd = textKodeord.getText().toString();

        try {
            g.startIgen(brugerNavn, kodeOrd);
            buttonPressed();
        } catch (RemoteException | NullPointerException e) {
            System.err.println("kunne ikke starte spillet igen " + e);
        }
    }

    private void Connect() {
        String brugerNavn = textBrugernavn.getText().toString();
        String kodeOrd = textKodeord.getText().toString();
                
        try {
            GalgeInterf gi = (GalgeInterf) Naming.lookup("rmi://130.225.170.204:5477/s165477");
//            GalgeInterf gi  = (GalgeInterf) Naming.lookup("rmi://localhost:1234/galge");
//            GalgeInterf gi = (GalgeInterf) Naming.lookup("rmi://130.225.170.204/s165477");

            this.g = gi;
            loggedin = gi.logInd(brugerNavn, kodeOrd);
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.err.println("der er ikke forbindelse til serveren" + e);
            toggle_newGame.setText("ingen forbindelse");
            loggedin = false;
        } finally {
            toggle_newGame.setSelected(loggedin);
        }

        if (loggedin) {
        toggle_newGame.setText("Forbindelse oprettet");
        buttonPressed();                
        } else {
            System.err.println("du er ikke logget ind på serveren");
            toggle_newGame.setText("forkert kode tryk her igen");
        }

        
        




    }
    
}
