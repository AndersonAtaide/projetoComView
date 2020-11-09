/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author ander
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        //setExtendedState(JFrame.MAXIMIZED_BOTH);        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        MenuItemUsuarios = new javax.swing.JMenuItem();
        MenuItemProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuItemSair = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuItemVenda = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        MenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto SysPad");
        setBackground(new java.awt.Color(255, 255, 0));
        setResizable(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        menuCadastro.setText("Cadastros");

        MenuItemUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemUsuarios.setText("Usuários");
        MenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuariosActionPerformed(evt);
            }
        });
        menuCadastro.add(MenuItemUsuarios);

        MenuItemProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemProdutos.setText("Produtos");
        MenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProdutosActionPerformed(evt);
            }
        });
        menuCadastro.add(MenuItemProdutos);
        menuCadastro.add(jSeparator1);

        MenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemSair.setText("Sair");
        MenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSairActionPerformed(evt);
            }
        });
        menuCadastro.add(MenuItemSair);

        jMenuBar1.add(menuCadastro);

        menuVendas.setText("Vendas");

        menuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemVenda.setText("Vendas");
        menuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVendaActionPerformed(evt);
            }
        });
        menuVendas.add(menuItemVenda);

        jMenuBar1.add(menuVendas);

        menuRelatorios.setText("Relatórios");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Relatórios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuRelatorios.add(jMenuItem1);

        jMenuBar1.add(menuRelatorios);

        menuSobre.setText("Sobre");

        MenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemSobre.setText("Sobre");
        MenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSobreActionPerformed(evt);
            }
        });
        menuSobre.add(MenuItemSobre);

        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MenuItemSairActionPerformed

    private void MenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuariosActionPerformed
        // TODO add your handling code here:
        TelaUsuario telaUsuario = new TelaUsuario();
        telaUsuario.setVisible(true);
        desktop.add(telaUsuario);
    }//GEN-LAST:event_MenuItemUsuariosActionPerformed

    private void MenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSobreActionPerformed
        // TODO add your handling code here:
        new TelaSobre().setVisible(true);
    }//GEN-LAST:event_MenuItemSobreActionPerformed

    private void menuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVendaActionPerformed
        // TODO add your handling code here:
        ViewVenda venda = new ViewVenda();
        venda.setVisible(true);
        desktop.add(venda);
    }//GEN-LAST:event_menuItemVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ViewLogVenda logVenda = new ViewLogVenda();
        logVenda.setVisible(true);
        desktop.add(logVenda);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void MenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProdutosActionPerformed
        // TODO add your handling code here:
        ViewProduto produto = new ViewProduto();
        produto.setVisible(true);
        desktop.add(produto);
    }//GEN-LAST:event_MenuItemProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemProdutos;
    private javax.swing.JMenuItem MenuItemSair;
    private javax.swing.JMenuItem MenuItemSobre;
    private javax.swing.JMenuItem MenuItemUsuarios;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuItemVenda;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVendas;
    // End of variables declaration//GEN-END:variables
}