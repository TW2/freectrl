/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wingate.freectrl.demo;

import java.awt.BorderLayout;
import org.wingate.freectrl.TreeTableTimeline;
import org.wingate.freectrl.data.t3.ChildNode;

/**
 *
 * @author util2
 */
public class TreeTableTimelineDemo extends javax.swing.JFrame {
    
    private final TreeTableTimeline t3 = new TreeTableTimeline();

    /**
     * Creates new form TreeTableTimelineDemo
     */
    public TreeTableTimelineDemo() {
        initComponents();
        init();
    }
    
    private void init(){
        setLocationRelativeTo(null);
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(t3, BorderLayout.CENTER);
        
        ChildNode<Object> cn = new ChildNode<>();
        ChildNode<Object> cn_cn1 = new ChildNode<>();
        ChildNode<Object> cn_cn2 = new ChildNode<>();
        cn.setName(cn.getName() + " A1");
        cn_cn1.setName(cn_cn1.getName() + " A11");
        cn_cn2.setName(cn_cn2.getName() + " A12");
        t3.addNode(cn);
        t3.addNodeTo(cn, cn_cn1);
        t3.addNodeTo(cn, cn_cn2);
        
        ChildNode<Object> cnA = new ChildNode<>();
        ChildNode<Object> cnA_cn1 = new ChildNode<>();
        cnA.setName(cnA.getName() + " B1");
        cnA_cn1.setName(cnA_cn1.getName() + " B11");
        t3.addNode(cnA);
        t3.addNodeTo(cnA, cnA_cn1);
        
        ChildNode<Object> cnB = new ChildNode<>();
        cnB.setName(cnB.getName() + " C1");
        t3.addNode(cnB);
        
        ChildNode<Object> cnC = new ChildNode<>();
        ChildNode<Object> cnC_cn1 = new ChildNode<>();
        ChildNode<Object> cnC_cn2 = new ChildNode<>();
        ChildNode<Object> cnC_cn3 = new ChildNode<>();
        cnC.setName(cnC.getName() + " D1");
        cnC_cn1.setName(cnC_cn1.getName() + " D11");
        cnC_cn2.setName(cnC_cn2.getName() + " D12");
        cnC_cn3.setName(cnC_cn3.getName() + " D13");
        t3.addNode(cnC);
        t3.addNodeTo(cnC, cnC_cn1);
        t3.addNodeTo(cnC, cnC_cn2);
        t3.addNodeTo(cnC, cnC_cn3);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreeTableTimelineDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TreeTableTimelineDemo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
