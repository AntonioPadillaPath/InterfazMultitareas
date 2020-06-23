
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio
 */
public class GraficaPolinomios extends javax.swing.JFrame {

    /**
     * Creates new form GraficaPolinomios
     */
    public GraficaPolinomios() {
        super("Gráfica");
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        Polinomios polinomios = new Polinomios();
        
        
        resize(390, 450);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        Graficar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        grado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AKeyTyped(evt);
            }
        });

        B.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                BComponentAdded(evt);
            }
        });
        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BKeyTyped(evt);
            }
        });

        Graficar.setText("Ingresar coeficientes y graficar");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setText("Ingrese el grado de la ecuación y los intervalos de graficado:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Intervalo a:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Intervalo b:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Grado:");

        grado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gradoKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(Graficar))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Graficar)
                .addContainerGap(335, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        
        try{
        
        double a, b;
        double punto, y = 0; 
        double funcion = 0;
        int i;
        int k;
        int n;
        
        n = Integer.parseInt(this.grado.getText());
        
        float ecuacion[] = new float [n + 1];
        String ecuacion2[] = new String [n + 1];
        
        JOptionPane.showMessageDialog(null, "Ahora ingresa los coeficientes de las variables", "Ecuación a la 'n'", JOptionPane.QUESTION_MESSAGE);
        
        for(i = n; i >= 0; i--)
        {
            ecuacion2[i] = JOptionPane.showInputDialog(null, "X^" +i, "Ecuación a la 'n'", JOptionPane.QUESTION_MESSAGE);
            
            if(ecuacion2[i].indexOf('.') != -1)
            {
                ecuacion[i] = Float.parseFloat(ecuacion2[i]);
            }
            
            else if(ecuacion2[i].indexOf('/') != -1)
            {
                String ecuacion3[] = ecuacion2[i].split("/");
                float fraccionA = Float.parseFloat(ecuacion3[0]);
                float fraccionB = Float.parseFloat(ecuacion3[1]);
                ecuacion[i] = fraccionA / fraccionB;
            }
            
            else
            {
                ecuacion[i] = Float.parseFloat(ecuacion2[i]);
            }
            
        }
       
        
        if(A.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingresa el intervalo 'a':");
            A.requestFocus();
        }
        else
        {
            String intA = A.getText();
            
            if(intA.indexOf('.') != -1)
            {
                a = Double.parseDouble(this.A.getText());
            }
            
            else if(intA.indexOf('/') != -1)
            {
                String ecuacion3[] = intA.split("/");
                double fraccionA = Double.parseDouble(ecuacion3[0]);
                double fraccionB = Double.parseDouble(ecuacion3[1]);
                a = fraccionA / fraccionB;
            }
            
            else
            {
                a = Double.parseDouble(A.getText());
            }

                if(B.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Ingresa el intervalo 'b':");
                    B.requestFocus();
                }
                else
                {
                    
                    String intB = B.getText();
            
                    if(intB.indexOf('.') != -1)
                    {
                        b = Double.parseDouble(this.B.getText());
                    }
            
                    else if(intB.indexOf('/') != -1)
                    {
                        String ecuacion3[] = intB.split("/");
                        double fraccionA = Double.parseDouble(ecuacion3[0]);
                        double fraccionB = Double.parseDouble(ecuacion3[1]);
                        b = fraccionA / fraccionB;
                    }
            
                    else
                    {
                        b = Double.parseDouble(B.getText());
                    }
                    
                    if(a >= b)
                    {
                        JOptionPane.showMessageDialog(null, "Ingresa un intervalo 'a' menor a 'b'");
                    }
                    else
                    {
                    Graphics p = getGraphics();
                    
                    p.setColor(new Color(255, 255, 255));
                    
                    p.fillRect(0, 100, 300, 400);
                    p.setColor(new Color(0, 0, 0));
                    p.drawLine(10, 300, 300, 300);
                    p.drawLine(150, 120, 150, 450);
                    
                    p.setColor(new Color(255, 0, 0));
                    
                    for(i = 10; i < 300; i +=8) //vertical
                    {
                       p.drawLine(i, 305, i, 295); 
                    }
                    
                    for(int j = 120; j < 450; j +=8) // horizontal
                    {
                       p.drawLine(145, j, 155, j); 
                    }
                    
                    for(double x = a; x < b; x += 0.001)
                    {
                        for(k = n; k >= 0; k--)
                        {
                            funcion += (ecuacion[k] * Math.pow(x, k));
                        }
                        
                        punto = 150 + x * 30;

                        y = 300 - (funcion) * 30;

                        p.drawLine((int)punto, (int)y, (int)punto + 1, (int) y + 1);
                        
                        funcion = 0;
                        
                    }
                    
                
            }
            
        }
        
    }}catch (Exception e) {JOptionPane.showMessageDialog(null, "Introduzca el tipo de dato solicitado", "Error", JOptionPane.ERROR_MESSAGE);}
        
    }//GEN-LAST:event_GraficarActionPerformed

    private void AKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyTyped
        
        char A = evt.getKeyChar();
        
        if(Character.isLetter(A))
        {
            getToolkit().beep();
            evt.consume();
            Graficar.setEnabled(false);
        }
        
        else
        {
            Graficar.setEnabled(true);
        }
        
    }//GEN-LAST:event_AKeyTyped

    private void BKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyTyped
       
        char B = evt.getKeyChar();
        
        if(Character.isLetter(B))
        {
            getToolkit().beep();
            evt.consume();
            Graficar.setEnabled(false);
        }
        
        else
        {
            Graficar.setEnabled(true);
        }
        
    }//GEN-LAST:event_BKeyTyped

    private void BComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_BComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_BComponentAdded

    private void gradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gradoKeyTyped
        
        char grado = evt.getKeyChar();
        
        if(Character.isLetter(grado))
        {
            getToolkit().beep();
            evt.consume();
            Graficar.setEnabled(false);
        }
        
        else
        {
            Graficar.setEnabled(true);
        }
        
    }//GEN-LAST:event_gradoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        AGP agp = new AGP();
        agp.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GraficaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaPolinomios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JButton Graficar;
    private javax.swing.JTextField grado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
