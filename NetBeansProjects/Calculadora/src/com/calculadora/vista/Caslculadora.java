/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadora.vista;

import javax.swing.JButton;

/**
 *
 * @author José
 */
public class Caslculadora extends javax.swing.JFrame {

    static int opcion = 0;
    static BaseDeDatos bd = new BaseDeDatos();
 String dato="";
    /**
     * Creates new form Caslculadora
     */
    public Caslculadora() {
        initComponents();
        /**
         * Se usa el patron de DI (Inyección de dependencias)
         */
        InyeccionDependenciasOperacionesMatematicas operacionresta=new InyeccionDependenciasOperacionesMatematicas();
        //Se define el tipo de Operación a realizar por el botón
        operacionresta.operacion(new OperacionResta());
        resta.addActionListener(operacionresta);
        
        InyeccionDependenciasOperacionesMatematicas operacionsuma=new InyeccionDependenciasOperacionesMatematicas();
        //Se define el tipo de Operación a realizar por el botón
        operacionsuma.operacion(new OperacionSuma());
        suma.addActionListener(operacionsuma);
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
        resultado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        limpiar = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 3, 3));
        jPanel1.add(resultado);

        jPanel2.setLayout(new java.awt.GridLayout(4, 3, 3, 3));

        limpiar.setText("C");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(limpiar);

        jButton14.setText("<--");
        jPanel2.add(jButton14);

        jButton15.setText("-->");
        jPanel2.add(jButton15);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setText("4");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel2.add(jButton9);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jPanel4.setLayout(new java.awt.GridLayout());

        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ejemplo(evt);
            }
        });
        jPanel4.add(jButton10);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout());

        resta.setText("-");
        jPanel5.add(resta);

        suma.setText("+");
        jPanel5.add(suma);

        igual.setText("=");
        jPanel5.add(igual);

        jPanel3.add(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ejemplo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ejemplo
      
       dato=resultado.getText();
        if(evt.getSource().equals(jButton1)){
            dato=dato+"1";
            resultado.setText(dato);
        }
        
        else if(evt.getSource().equals(jButton2)){
            dato=dato+"2";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton3)){
            dato=dato+"3";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton4)){
            dato=dato+"4";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton5)){
            dato=dato+"5";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton6)){
            dato=dato+"6";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton7)){
            dato=dato+"7";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton8)){
            dato=dato+"8";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton9)){
            dato=dato+"9";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(jButton10)){
            dato=dato+"0";
            resultado.setText(dato);
        }
        else if(evt.getSource().equals(limpiar)){
            dato="";
            resultado.setText("");
        }
    }//GEN-LAST:event_Ejemplo
	public static void muestraBackup(int t) {
        System.out.format("Existen %s backups.", t);
        System.out.print("\nDigite el backup que desea restaurar: ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        

        bd.agregarRegistro("Alexys Lozada", 33, true);
        bd.agregarRegistro("Ronald Lozada", 32, true);
        bd.generarBackup();

        bd.agregarRegistro("Carol Lozada", 18, true);
        bd.agregarRegistro("Leidy Gonzalez", 10, true);
        bd.generarBackup();

        bd.agregarRegistro("Yamile Gamboa", 33, false);
        bd.agregarRegistro("Jennifer Piedrahita", 27, false);
        bd.generarBackup();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Caslculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caslculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caslculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caslculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caslculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton resta;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
