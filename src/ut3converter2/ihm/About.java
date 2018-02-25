/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * About.java
 *
 * Created on 1 mai 2009, 08:57:09
 */

package ut3converter2.ihm;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import ut3converter2.Installation;
import ut3converter2.Main;

/**
 *
 * @author Hyperion
 */
public class About extends javax.swing.JDialog {

    /** Creates new form About */

    URI uri = null;
    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public About(java.awt.Frame parent, boolean modal,Credits credits,String version) {
        super(parent, modal);
        initComponents();

        jlblversion.setText(version);
        try {
            jTextPane1.setText(loadHistory());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);

        String name="";
        String product="";

        int numofcredits = credits.alcredits.size();
        int numofthanks = credits.althanks.size();

        jxpadcredits.setLayout(new java.awt.GridLayout(numofcredits, 2));
        jxpthanks.setLayout(new java.awt.GridLayout(numofthanks, 2));


        for(int i=0;i<credits.althanks.size();i++)
        {
            Credits.thanks thk = credits.althanks.get(i);
            jxpthanks.add(thk.getName());
            jxpthanks.add(new JLabel(thk.getDescription()));
        }
        for(int i=0;i<credits.alcredits.size();i++)
        {
            Credits.credit crd = credits.alcredits.get(i);
            jxpadcredits.add(crd.getName());
            jxpadcredits.add(crd.getProduct());
        }
    }

    private void open(URI uri) {
        if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                        desktop.browse(uri);
                } catch (IOException e) {
                                    }
        } else {
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jxpAbout = new org.jdesktop.swingx.JXPanel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        jlblversion = new javax.swing.JLabel();
        jxpadcredits = new org.jdesktop.swingx.JXPanel();
        jxpthanks = new org.jdesktop.swingx.JXPanel();
        jxpHistory = new org.jdesktop.swingx.JXPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About ...");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jXPanel1.add(jButton1);

        getContentPane().add(jXPanel1, java.awt.BorderLayout.SOUTH);

        jxpAbout.setLayout(new java.awt.BorderLayout());

        jXHyperlink1.setText("UT3 Converter by XtremeXp -");
        jXHyperlink1.setToolTipText("http://utforums.epicgames.com/showthread.php?p=25131566");
        jXHyperlink1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXHyperlink1ActionPerformed(evt);
            }
        });
        jXPanel2.add(jXHyperlink1);

        jlblversion.setText("-Version");
        jXPanel2.add(jlblversion);

        jxpAbout.add(jXPanel2, java.awt.BorderLayout.PAGE_START);

        jxpadcredits.setBorder(javax.swing.BorderFactory.createTitledBorder("Additional Credits"));
        jxpadcredits.setLayout(new java.awt.GridLayout(2, 3));
        jxpAbout.add(jxpadcredits, java.awt.BorderLayout.CENTER);

        jxpthanks.setBorder(javax.swing.BorderFactory.createTitledBorder("Additional thanks ..."));
        jxpthanks.setLayout(new java.awt.GridLayout(1, 2));
        jxpAbout.add(jxpthanks, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("About", jxpAbout);

        jxpHistory.setLayout(new java.awt.BorderLayout());

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jxpHistory.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("History", jxpHistory);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jXHyperlink1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXHyperlink1ActionPerformed
        try {
             open(new URI("http://utforums.epicgames.com/showthread.php?p=25131566"));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jXHyperlink1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                About dialog = new About(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    private String loadHistory() throws FileNotFoundException, IOException
    {
        Installation inst = new Installation();
        File fhistory = inst.getInstallDirectory(Main.class);
        fhistory = new File(fhistory.getAbsolutePath()+"//history.txt");
        if(!fhistory.exists())
        {
            return "Unavailable";
        }
        BufferedReader bfr = new BufferedReader(new FileReader(fhistory));
        String line="";
        String tmp="";
        while((line=bfr.readLine())!=null)
        {
            tmp += line+"\n";
        }
        return tmp;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private javax.swing.JLabel jlblversion;
    private org.jdesktop.swingx.JXPanel jxpAbout;
    private org.jdesktop.swingx.JXPanel jxpHistory;
    private org.jdesktop.swingx.JXPanel jxpadcredits;
    private org.jdesktop.swingx.JXPanel jxpthanks;
    // End of variables declaration//GEN-END:variables

}
