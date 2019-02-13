/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galge;

import brugerautorisation.data.Bruger;
import brugerautorisation.data.Diverse;
import brugerautorisation.transport.rmi.Brugeradmin;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import server.GalgeImpl;
import server.GalgeInterf;
import server.GalgeLogik;

/**
 *
 * @author alexander
 */
public class View extends javax.swing.JFrame {
    
    private GalgeInterf g;
    private boolean forbindelse = false;
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(29, 29, 29)
                        .addComponent(label_guess)
                        .addGap(46, 46, 46)
                        .addComponent(text_guess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(button_guess)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(label_errors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_restart)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guessActionPerformed
        
          buttonPressed();

        // TODO add your handling code here:
    }//GEN-LAST:event_button_guessActionPerformed

    private void toggle_newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggle_newGameActionPerformed

        serverCon();        
        
    }//GEN-LAST:event_toggle_newGameActionPerformed

    private void button_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_restartActionPerformed
        startIgen();        // TODO add your handling code here:
    }//GEN-LAST:event_button_restartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_guess;
    private javax.swing.JButton button_restart;
    private javax.swing.JLabel label_errors;
    private javax.swing.JLabel label_guess;
    private javax.swing.JLabel label_title;
    private java.awt.Panel panel_;
    private javax.swing.JTextField text_guess;
    private javax.swing.JToggleButton toggle_newGame;
    // End of variables declaration//GEN-END:variables

    
    
    
    //-------------buttons logik-----------//
    
    
    
    
    private void buttonPressed() {
        
        String str = text_guess.getText().toLowerCase();
        text_guess.setText("");
        
        try {
            g.gætBogstav(str);
            label_guess.setText(this.g.getOrd());
            label_errors.setText("du har " + g.antalFejl() + "/7 fejl");
        } catch (RemoteException | NullPointerException e) {
            System.err.println("der er ikke forbindelse til serveren" + e);
            toggle_newGame.setText("ingen forbindelse");
            forbindelse = false;
        } finally {
            toggle_newGame.setSelected(forbindelse);
        }
            
        
        //panel_.imageUpdate(img, NORMAL, WIDTH, WIDTH, WIDTH, WIDTH)
        try {            
            if (g.erSpilletSlut()) {
                if (g.erSpilletVundet()) {
                    label_errors.setText("tillykke!\ndu har vundet!\n" + g.antalFejl() + " fejl" );
                } else {
                    label_errors.setText("du har tabt!");
                }
            }
        } catch (RemoteException | NullPointerException e) {
            System.err.println("der er ikke forbindelse til serveren" + e);
            toggle_newGame.setText("ingen forbindelse");
            forbindelse = false;
        } finally {
            toggle_newGame.setSelected(forbindelse);
        }
    }

    
    
    private void serverCon(){
        
        try {
            GalgeInterf gi = (GalgeInterf) Naming.lookup("rmi://130.225.170.204:5477/s165477");
            this.g = gi;
            toggle_newGame.setText("Forbindelse oprettet");
            forbindelse = true;
            //buttonPressed();
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.err.println("der er ikke forbindelse til serveren" + e);
            toggle_newGame.setText("ingen forbindelse");
            forbindelse = false;
        } finally {
            toggle_newGame.setSelected(forbindelse);
        }
        
        login();

    }
   
    private void startIgen(){
        try {
            g.startIgen();
            buttonPressed();
        } catch (RemoteException | NullPointerException e) {
            System.err.println("kunne ikke starte spillet igen " + e);
        }
    }
    
    private void login(){
        Brugeradmin ba;
        try {
            ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
            System.out.println("logged ind");
        } catch (Exception e) {
            System.err.println("ikke logget ind");
        }

        
        
        
    }
    
    
    
}


