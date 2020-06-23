/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class AyudaFib extends javax.swing.JFrame {

    /**
     * Creates new form AyudaFib
     */
    public AyudaFib() {
        super("Ayuda de la Secuencia Fibonacci");
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Ayuda de la secuencia Fibonacci:\n\n     La secuencia Fibonacci es una serie de números que comienza con 0 y 1, y el siguiente\nnúmero es la suma de estos dos, siendo el patrón a seguir esta última suma para el \npróximo valor, es decir, la suma de los dos números anteriores:\n                         0 + 1 = 1, entonces la secuencia queda: 0, 1, 1.\n                         1 + 1 = 2, entones la secuencia queda: 0, 1, 1, 2.\n                         2 + 1 = 3, entonces la secuencia queda: 0, 1, 1, 2, 3.\n                         2 + 3 = 5, entonces la secuencia queda: 0, 1, 1, 2, 3, 5.\n     En la anterior secuencia, sin contar al 0, el tercer valor sería el 2, o el cuarto valor el\n3 y el quinto sería el 5. Ésta ventana realiza el cálculo de cualquier valor (o lugar) de la\nsecuencia que sea requerido. La forma de calcularlo es la siguiente:\n\n1. Introduzca un valor entero positivo en el campo que lo solicita.\n2. Haga click en el botón \"Calcular Secuencia Fibonacci\".\n3. El número del lugar de la secuencia aparecerá en el campo de resultado.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 8));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AyudaFib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyudaFib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyudaFib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyudaFib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyudaFib().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}