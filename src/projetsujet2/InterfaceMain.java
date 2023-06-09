/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetsujet2;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author gargo
 */
public class InterfaceMain extends javax.swing.JFrame {
    
    private String nom1,prenom1,nom2,prenom2,login,Pass;
    private String admin1="Ahmed"; 
    private String passw1="admin123";
    private String admin2="Jasser"; 
    private String passw2="admin456";
    private String adminError="userName not found"; 
    private String passwError="Password missmatch";      
    private Le_Jeu Jeu = new Le_Jeu();
    private Administrateur Admin = new Administrateur(); 

    /**
     * Creates new form InterfaceMain
     */
    public InterfaceMain() {
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

        jPanel1 = new javax.swing.JPanel();
        Tire = new javax.swing.JLabel();
        jouer = new javax.swing.JButton();
        parametre = new javax.swing.JButton();
        javaImage = new javax.swing.JLabel();
        instructions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jeu Sujet2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(186, 209, 194));

        Tire.setFont(new java.awt.Font("Cooper Black", 1, 36)); // NOI18N
        Tire.setForeground(new java.awt.Color(13, 117, 149));
        Tire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tire.setText("JAVA GAME");
        Tire.setToolTipText("");

        jouer.setBackground(new java.awt.Color(246, 246, 201));
        jouer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jouer.setForeground(new java.awt.Color(79, 160, 149));
        jouer.setText("Jouer");
        jouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jouerActionPerformed(evt);
            }
        });

        parametre.setBackground(new java.awt.Color(246, 246, 201));
        parametre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        parametre.setForeground(new java.awt.Color(79, 160, 149));
        parametre.setText("Paramètres");
        parametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametreActionPerformed(evt);
            }
        });

        javaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetsujet2/java.png"))); // NOI18N

        instructions.setBackground(new java.awt.Color(246, 246, 201));
        instructions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        instructions.setForeground(new java.awt.Color(79, 160, 149));
        instructions.setText("Instructions");
        instructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jouer, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parametre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(instructions, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Tire, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(javaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(javaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tire, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parametre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jouer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(instructions))
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void parametreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametreActionPerformed
        String pass = "";
        login = JOptionPane.showInputDialog(this, "LOGIN");
        if (login.equals(admin1)) {
            JPasswordField pwd = new JPasswordField(10);
            int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password",JOptionPane.OK_CANCEL_OPTION);
            if(action < 0)JOptionPane.showMessageDialog(null,"Cancel, X or escape key selected");
            if (String.valueOf(pwd.getPassword()).equals(passw1)){
               // changements must occur to pass admi name 
                Admin.show(true);
                this.show(false);
                Admin.setname(login);
            }
            else 
                JOptionPane.showMessageDialog(this,passwError);
        }
        else if (login.equals(admin2)) {
            JPasswordField pwd = new JPasswordField(10);
            int action = JOptionPane.showConfirmDialog(null, pwd,"Enter Password",JOptionPane.OK_CANCEL_OPTION);
            if(action < 0)JOptionPane.showMessageDialog(null,"Cancel, X or escape key selected");
            if (String.valueOf(pwd.getPassword()).equals(passw2)){
               // changements must occur to pass admi name 
                Admin.show(true);
                this.show(false);
                Admin.setname(login);
            }
            else 
                JOptionPane.showMessageDialog(this,passwError);
        }
        else 
             JOptionPane.showMessageDialog(this,adminError);   
    }//GEN-LAST:event_parametreActionPerformed

    private void jouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jouerActionPerformed
        // TODO add your handling code here:
        nom1 = JOptionPane.showInputDialog(this, "Entrer Le Nom Du Joueur 1");
        if (!nom1.isEmpty())
            nom2 = JOptionPane.showInputDialog(this, "Entrer Le Nom Du Joueur 2");
        if (!nom2.isEmpty()){
            Jeu.show(true);
            this.show(false);
            Jeu.setnom(nom1,nom2);
        }
        
    }//GEN-LAST:event_jouerActionPerformed

    private void instructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsActionPerformed
        String instText= "Dans ce jeu on a besoin  de deux joueurs.Le premier joueur doit saisir son nom et puis le deuxième. \n"
                + "A chaque fois 12 caractères, entre voyelles et consonnes. \n" +
"Chaque joueur donne dans sa grille une proposition de mot avec le maximum de caractères proposés.\n" +
"Le joueur qui atteint le premier 10, sera considéré gagnant.\n" +
                "Chaque joueur peut faire entrer plus qu’un mot . \n"+
"Chaque mot correct ajoute +1 au score . \n"+
"Chaque mot faux  va soustraire -1 du score . \n"+
"NB: un mot est considéré faux si et seulement si : \n"+
"le mot est non existant dans le dictionnaire ou n’utilise pas les caractères spécifiés.\n"+
"le joueur qui possède le nombre de caractère le plus élévé dans un mot aura une inrémentation du score par ce nombre.\n"+
"En cas d’égalité de la longueur des mots proposés l’ajout du nombre de caractère ne sera pas fait ."; 
        JOptionPane.showMessageDialog(this, instText); 
        
    }//GEN-LAST:event_instructionsActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceMain().setVisible(true);
                                
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tire;
    private javax.swing.JButton instructions;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel javaImage;
    private javax.swing.JButton jouer;
    private javax.swing.JButton parametre;
    // End of variables declaration//GEN-END:variables
}
