import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicSpinnerUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cesar
 */
public class MainGUI extends javax.swing.JFrame {
    private Productor[] productores;
    private Consumidor[] consumidores;
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
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

        ejecucionLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productorTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        consumidorTable = new javax.swing.JTable();
        productorProgressbar = new javax.swing.JProgressBar();
        tareasRealizadas = new javax.swing.JSpinner();
        confLabel = new javax.swing.JLabel();
        numProdLabel = new javax.swing.JLabel();
        numConsLabel = new javax.swing.JLabel();
        numProductores = new javax.swing.JComboBox<>();
        numConsumidores = new javax.swing.JComboBox<>();
        sleepProdLabel = new javax.swing.JLabel();
        sleepConsLabel = new javax.swing.JLabel();
        sleepProductores = new javax.swing.JTextField();
        sleepConsumidores = new javax.swing.JTextField();
        msLabel = new javax.swing.JLabel();
        msLabel2 = new javax.swing.JLabel();
        tamAlmLabel = new javax.swing.JLabel();
        sizeAlmacen = new javax.swing.JTextField();
        controlesLabel = new javax.swing.JLabel();
        iniciarButton = new javax.swing.JButton();
        pararButton = new javax.swing.JButton();
        schemeLabel = new javax.swing.JLabel();
        lowerBoundLabel = new javax.swing.JLabel();
        lowerBoundValue = new javax.swing.JComboBox<>();
        upperBoundLabel = new javax.swing.JLabel();
        upperBoundValue = new javax.swing.JComboBox<>();
        plusCheck = new javax.swing.JCheckBox();
        minusCheck = new javax.swing.JCheckBox();
        multiplicationCheck = new javax.swing.JCheckBox();
        divisionCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ejecucionLabel.setText("——Ejecución——————————————————————————————————————————————————————————————————");

        productorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ProductorID", "Producción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productorTable);

        consumidorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ConsumidorID", "Operacion", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(consumidorTable);

        productorProgressbar.setStringPainted(true);

        tareasRealizadas.setName(""); // NOI18N

        confLabel.setText("——Configuración————————————————————————————————————————————————————————————————");

        numProdLabel.setText("# Productores:");

        numConsLabel.setText("# Consumidores:");

        numProductores.setMaximumRowCount(10);
        numProductores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        numConsumidores.setMaximumRowCount(10);
        numConsumidores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        sleepProdLabel.setText("Sleep Productores:     [0 - 10000]");

        sleepConsLabel.setText("Sleep Consumidores:  [0 - 10000]");

        sleepProductores.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sleepProductores.setText("1000");

        sleepConsumidores.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sleepConsumidores.setText("1000");

        msLabel.setText("ms");

        msLabel2.setText("ms");

        tamAlmLabel.setText("Tamaño almacen: [1-100]");

        sizeAlmacen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sizeAlmacen.setText("25");

        controlesLabel.setText("——Controles——————————————————————————————————————————————————————————————————");

        iniciarButton.setText("INICIAR");
        iniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarButtonActionPerformed(evt);
            }
        });

        pararButton.setText("PARAR");
        pararButton.setEnabled(false);
        pararButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararButtonActionPerformed(evt);
            }
        });

        schemeLabel.setText("Scheme:");

        lowerBoundLabel.setText("LowerBound:");

        lowerBoundValue.setMaximumRowCount(10);
        lowerBoundValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        upperBoundLabel.setText("UpperBound:");

        upperBoundValue.setMaximumRowCount(10);
        upperBoundValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        upperBoundValue.setSelectedIndex(9);

        plusCheck.setText("+");

        minusCheck.setText("-");

        multiplicationCheck.setText("*");

        divisionCheck.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ejecucionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(confLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(productorProgressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tareasRealizadas)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numConsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numProdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numProductores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numConsumidores, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sleepProdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sleepConsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sleepProductores)
                            .addComponent(sleepConsumidores, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(schemeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tamAlmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iniciarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pararButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addComponent(controlesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lowerBoundLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lowerBoundValue, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upperBoundLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upperBoundValue, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(324, 324, 324)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(minusCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiplicationCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ejecucionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productorProgressbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tareasRealizadas))
                .addGap(18, 18, 18)
                .addComponent(confLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numProdLabel)
                    .addComponent(numProductores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleepProdLabel)
                    .addComponent(sleepProductores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msLabel))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numConsLabel)
                    .addComponent(numConsumidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sleepConsLabel)
                    .addComponent(sleepConsumidores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tamAlmLabel)
                    .addComponent(sizeAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(schemeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lowerBoundLabel)
                            .addComponent(lowerBoundValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plusCheck)
                            .addComponent(multiplicationCheck))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(upperBoundLabel)
                                    .addComponent(upperBoundValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(divisionCheck))))
                    .addComponent(minusCheck))
                .addGap(19, 19, 19)
                .addComponent(controlesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pararButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarButtonActionPerformed
        if (!validateForm()) {
            return;
        }
        
        // Disable button
        JButton iniciar = (JButton) evt.getSource();
        iniciar.setEnabled(false);
        pararButton.setEnabled(true);
        
        int sleepProd = Integer.parseInt(sleepProductores.getText());
        int sleepCons = Integer.parseInt(sleepConsumidores.getText());
        int numProd = Integer.parseInt((String) numProductores.getSelectedItem());
        int numCons = Integer.parseInt((String) numConsumidores.getSelectedItem());
        int lowerBound = Integer.parseInt((String) lowerBoundValue.getSelectedItem());
        int upperBound = Integer.parseInt((String) upperBoundValue.getSelectedItem());;
        
        String symbols = "";
        if (plusCheck.isSelected())
            symbols += "+";
        if (minusCheck.isSelected())
            symbols += "-";
        if (multiplicationCheck.isSelected())
            symbols += "*";
        if (divisionCheck.isSelected())
            symbols += "/";
        
        System.out.println("================================\n"
                + "Working as follows:\n\n"
                + "Tamaño almacen: " + Integer.parseInt(sizeAlmacen.getText()) + "\n"
                + "# Productores: " + numProd + "\n"
                + "# Consumidores: " + numCons + "\n"
                + "Sleep Productores: " + sleepProd + "\n"
                + "Sleep Consumidores: " + sleepCons + "\n"
                + "Scheme range: [" + lowerBound + " - " + upperBound + "]\n"
                + "Symbols: " + symbols + "\n"
                + "================================");

        Almacen scheme = new Almacen(Integer.parseInt(sizeAlmacen.getText()), 
                this, 
                symbols, 
                lowerBound,
                upperBound);
        this.productores = new Productor[numProd];
        this.consumidores = new Consumidor[numCons];
        
        for (int i = 1; i < numCons + 1; i++) {
            this.consumidores[i-1] = new Consumidor(i, sleepCons, scheme);
            this.consumidores[i-1].start();
        }
        
        for (int i = 1; i < numProd + 1; i++) {
            this.productores[i-1] = new Productor(i, sleepProd, scheme);
            this.productores[i-1].start();
        }

    }//GEN-LAST:event_iniciarButtonActionPerformed

    private void pararButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararButtonActionPerformed
        // TODO add your handling code here:
        
        //Stop all threads
        for (int i = 1; i < this.productores.length + 1; i++) {
            this.productores[i-1].end();
            this.productores[i-1] = null;
        }
        for (int i = 1; i < this.consumidores.length + 1; i++) {
            this.consumidores[i-1].end();
            this.consumidores[i-1] = null;
        }
        
        // Disable button
        JButton parar = (JButton) evt.getSource();
        parar.setEnabled(false);
        iniciarButton.setEnabled(true);
    }//GEN-LAST:event_pararButtonActionPerformed

    private boolean validateForm() {
        // Check if they are numbers
        Integer sizeAlm, sleepProd, sleepCons, lowerBound, upperBound;
        
        try {
            sizeAlm = Integer.parseInt(sizeAlmacen.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error 'Tamaño almacen':\n\nDebe ser:\nNúmero");
            return false;
        }
        
        try {
            sleepProd = Integer.parseInt(sleepProductores.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error 'Sleep Productores':\n\nDebe ser:\nNúmero");
            return false;
        }
        
        try {
            sleepCons = Integer.parseInt(sleepConsumidores.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error 'Sleep Consumidores':\n\nDebe ser:\nNúmero");
            return false;
        }
        
        try {
            lowerBound = Integer.parseInt((String) lowerBoundValue.getSelectedItem());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error 'LowerBound':\n\nDebe ser:\nNúmero");
            return false;
        }
        
        try {
            upperBound = Integer.parseInt((String) upperBoundValue.getSelectedItem());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error 'LowerBound':\n\nDebe ser:\nNúmero");
            return false;
        }

        // Check if in valid range
        if (sizeAlm < 1 || sizeAlm > 100) {
            JOptionPane.showMessageDialog(this, "Error 'Tamaño almacen':\n\nDebe ser:\n>= 1\n<= 100");
            return false;
        } else if (sleepProd < 0 || sleepProd > 10000) {
            JOptionPane.showMessageDialog(this, "Error 'Sleep Productores':\n\nDebe ser:\n>= 0\n<= 10000");
            return false;
        } else if (sleepCons < 0 || sleepCons > 10000) {
            JOptionPane.showMessageDialog(this, "Error 'Sleep Consumidores':\n\nDebe ser:\n>= 0\n<= 10000");
            return false;
        } else if (lowerBound == upperBound){
            JOptionPane.showMessageDialog(this, "Error 'LowerBound' 'UpperBound':\n\nDeben ser:\nLowerBound != UpperBound");
            return false;
        }
        
        int numOfChecks = 0;
        
        if (plusCheck.isSelected())
            numOfChecks++;
        if (minusCheck.isSelected())
            numOfChecks++;
        if (multiplicationCheck.isSelected())
            numOfChecks++;
        if (divisionCheck.isSelected())
            numOfChecks++;
        
        if (numOfChecks == 0){
            JOptionPane.showMessageDialog(this, "Error 'Checkboxes':\n\nSe debe escoger:\n1>Al menos un elemento");
            return false;
        }
        return true;
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confLabel;
    private javax.swing.JTable consumidorTable;
    private javax.swing.JLabel controlesLabel;
    private javax.swing.JCheckBox divisionCheck;
    private javax.swing.JLabel ejecucionLabel;
    private javax.swing.JButton iniciarButton;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lowerBoundLabel;
    private javax.swing.JComboBox<String> lowerBoundValue;
    private javax.swing.JCheckBox minusCheck;
    private javax.swing.JLabel msLabel;
    private javax.swing.JLabel msLabel2;
    private javax.swing.JCheckBox multiplicationCheck;
    private javax.swing.JLabel numConsLabel;
    private javax.swing.JComboBox<String> numConsumidores;
    private javax.swing.JLabel numProdLabel;
    private javax.swing.JComboBox<String> numProductores;
    private javax.swing.JButton pararButton;
    private javax.swing.JCheckBox plusCheck;
    private javax.swing.JProgressBar productorProgressbar;
    private javax.swing.JTable productorTable;
    private javax.swing.JLabel schemeLabel;
    private javax.swing.JTextField sizeAlmacen;
    private javax.swing.JLabel sleepConsLabel;
    private javax.swing.JTextField sleepConsumidores;
    private javax.swing.JLabel sleepProdLabel;
    private javax.swing.JTextField sleepProductores;
    private javax.swing.JLabel tamAlmLabel;
    private javax.swing.JSpinner tareasRealizadas;
    private javax.swing.JLabel upperBoundLabel;
    private javax.swing.JComboBox<String> upperBoundValue;
    // End of variables declaration//GEN-END:variables

    public void setTareasRealizadasValue(long value) {
        tareasRealizadas.setValue(value);
    }
    
    public void setPercentage(int value){
        productorProgressbar.setValue(value);
    }
}
