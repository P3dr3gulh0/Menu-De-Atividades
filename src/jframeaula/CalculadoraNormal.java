/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframeaula;

/**
 *
 * @author 1017729
 */
public class CalculadoraNormal extends javax.swing.JFrame {

    private String strNum1 = "";
    private String operador = "";
    private String historico = "";
    private String strNum2 = "";

    public String getStrNum1() {
        return strNum1;
    }

    public void setStrNum1(String strNum1) {
        this.strNum1 = strNum1;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getStrNum2() {
        return strNum2;
    }

    public void setStrNum2(String strNum2) {
        this.strNum2 = strNum2;
    }

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculadoraNormal.class.getName());

    /**
     * Creates new form CalculadoraNormal
     */
    public CalculadoraNormal() {
        initComponents();
    }

    public void limparTudo() {
        setStrNum1("");
        jlEquacao.setText("");
        setOperador("");
    }

    public void adicionarNumero(String numero) {
        strNum1 += numero;
        jlEquacao.setText(strNum1);
    }

    public double conversao(String valor) {
        double valorTratado = Double.parseDouble(valor);
        return valorTratado;
    }

    public void decimal() {
        if (!strNum1.contains(".")) {
            if (getStrNum1().isBlank()) {
                adicionarNumero("0.");
            } else {
                adicionarNumero(".");
            }
        }
    }

    public void operacao() {

        String operador = getOperador();
        double num1 = conversao(getStrNum1());
        double num2 = conversao(jlEquacao.getText());

        double resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    jlHistorico.setText("Erro!");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                return;
        }

        String strResultado = String.valueOf(resultado);

        jlEquacao.setText(strResultado);
        setStrNum1(strResultado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btOpMult = new javax.swing.JButton();
        btOpSoma = new javax.swing.JButton();
        btOpSubtrair = new javax.swing.JButton();
        btDividir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlHistorico = new javax.swing.JLabel();
        jlEquacao = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btValor8 = new javax.swing.JButton();
        btValor5 = new javax.swing.JButton();
        btValor6 = new javax.swing.JButton();
        btValor9 = new javax.swing.JButton();
        btValor0 = new javax.swing.JButton();
        btValor4 = new javax.swing.JButton();
        btValor7 = new javax.swing.JButton();
        btValor2 = new javax.swing.JButton();
        btValor1 = new javax.swing.JButton();
        btValor3 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        btOpMult.setText("x");
        btOpMult.addActionListener(this::btOpMultActionPerformed);

        btOpSoma.setText("+");
        btOpSoma.addActionListener(this::btOpSomaActionPerformed);

        btOpSubtrair.setText("-");
        btOpSubtrair.addActionListener(this::btOpSubtrairActionPerformed);

        btDividir.setText("/");
        btDividir.addActionListener(this::btDividirActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btOpSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOpSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btOpMult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btOpSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOpSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOpMult, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlHistorico.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlHistorico.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlHistorico.setText(" ");

        jlEquacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlEquacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlEquacao.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlHistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jlEquacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlEquacao, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        btValor8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor8.setText("8");
        btValor8.addActionListener(this::btValor8ActionPerformed);

        btValor5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor5.setText("5");
        btValor5.addActionListener(this::btValor5ActionPerformed);

        btValor6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor6.setText("6");
        btValor6.addActionListener(this::btValor6ActionPerformed);

        btValor9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor9.setText("9");
        btValor9.addActionListener(this::btValor9ActionPerformed);

        btValor0.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor0.setText("0");
        btValor0.addActionListener(this::btValor0ActionPerformed);

        btValor4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor4.setText("4");
        btValor4.addActionListener(this::btValor4ActionPerformed);

        btValor7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor7.setText("7");
        btValor7.addActionListener(this::btValor7ActionPerformed);

        btValor2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor2.setText("2");
        btValor2.addActionListener(this::btValor2ActionPerformed);

        btValor1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor1.setText("1");
        btValor1.addActionListener(this::btValor1ActionPerformed);

        btValor3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btValor3.setText("3");
        btValor3.addActionListener(this::btValor3ActionPerformed);

        jButton16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton16.setText("C");
        jButton16.addActionListener(this::jButton16ActionPerformed);

        jButton17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton17.setText("=");
        jButton17.addActionListener(this::jButton17ActionPerformed);

        jButton15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton15.setText(",");
        jButton15.addActionListener(this::jButton15ActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btValor0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btValor6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btValor9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btValor7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btValor0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor2ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("2");
    }//GEN-LAST:event_btValor2ActionPerformed

    private void btValor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor5ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("5");
    }//GEN-LAST:event_btValor5ActionPerformed

    private void btValor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor6ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("6");
    }//GEN-LAST:event_btValor6ActionPerformed

    private void btValor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor9ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("9");

    }//GEN-LAST:event_btValor9ActionPerformed

    private void btValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor1ActionPerformed
        // TODO add your handling code here:

        adicionarNumero("1");
    }//GEN-LAST:event_btValor1ActionPerformed

    private void btOpMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpMultActionPerformed
        // TODO add your handling code here:

        if ("".equals(getOperador()) || !"x".equals(getOperador())) {
            setOperador("x");

            setStrNum2(jlEquacao.getText());

            //Limpa
            setStrNum1(jlEquacao.getText());
            jlEquacao.setText("");
        }
    }//GEN-LAST:event_btOpMultActionPerformed

    private void btOpSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpSubtrairActionPerformed
        // TODO add your handling code here:

        if ("".equals(getOperador()) || "-".equals(getOperador())) {

            setOperador("-");
            //Limpa
            setStrNum1(jlEquacao.getText());
            jlEquacao.setText("");
        }
    }//GEN-LAST:event_btOpSubtrairActionPerformed

    private void btDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDividirActionPerformed
        // TODO add your handling code here:
        if ("".equals(getOperador()) || "/".equals(getOperador())) {

            setOperador("/");

            //Limpa
            setStrNum1(jlEquacao.getText());
            jlEquacao.setText("");
        }
    }//GEN-LAST:event_btDividirActionPerformed

    private void btOpSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpSomaActionPerformed

        if ("".equals(getOperador()) || !"+".equals(getOperador())) {
            setOperador("+");
            //Limpa
            setStrNum1(jlEquacao.getText());
            jlEquacao.setText("");
        }
    }//GEN-LAST:event_btOpSomaActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        limparTudo();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btValor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor3ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("3");
    }//GEN-LAST:event_btValor3ActionPerformed

    private void btValor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor4ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("4");
    }//GEN-LAST:event_btValor4ActionPerformed

    private void btValor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor7ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("7");
    }//GEN-LAST:event_btValor7ActionPerformed

    private void btValor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor8ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("8");
    }//GEN-LAST:event_btValor8ActionPerformed

    private void btValor0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValor0ActionPerformed
        // TODO add your handling code here:
        adicionarNumero("0");
    }//GEN-LAST:event_btValor0ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        operacao();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        decimal();
    }//GEN-LAST:event_jButton15ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CalculadoraNormal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDividir;
    private javax.swing.JButton btOpMult;
    private javax.swing.JButton btOpSoma;
    private javax.swing.JButton btOpSubtrair;
    private javax.swing.JButton btValor0;
    private javax.swing.JButton btValor1;
    private javax.swing.JButton btValor2;
    private javax.swing.JButton btValor3;
    private javax.swing.JButton btValor4;
    private javax.swing.JButton btValor5;
    private javax.swing.JButton btValor6;
    private javax.swing.JButton btValor7;
    private javax.swing.JButton btValor8;
    private javax.swing.JButton btValor9;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlEquacao;
    private javax.swing.JLabel jlHistorico;
    // End of variables declaration//GEN-END:variables
}
