
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
public class Integrales extends javax.swing.JFrame {

    /**
     * Creates new form Integrales
     */
    public Integrales() {
        super("Integrales");
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Grado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        A = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        B = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        N = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        Integral = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Funcion = new javax.swing.JTextArea();

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 8));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa el valor de los siguientes parámetros:");

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Grado de la función:");

        Grado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GradoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Intervalo \"a\":");

        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intervalo \"b\":");

        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de divisiones:");

        N.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("f(x):");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Área bajo la curva:");

        Resultado.setEditable(false);
        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        Integral.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Integral.setText("Ingresar función y realizar Integral");
        Integral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntegralActionPerformed(evt);
            }
        });
        Integral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IntegralKeyTyped(evt);
            }
        });

        Funcion.setColumns(20);
        Funcion.setRows(5);
        jScrollPane3.setViewportView(Funcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Integral, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Grado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel8)))
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Integral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntegralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IntegralKeyTyped
        // TODO add your handling code 
    }//GEN-LAST:event_IntegralKeyTyped

    private void GradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GradoKeyTyped
        
        char Grado = evt.getKeyChar();
        
        if(Character.isLetter(Grado))
        {
            getToolkit().beep();
            evt.consume();
            Integral.setEnabled(false);
        }
        
        else
        {
            Integral.setEnabled(true);
        }
        
    }//GEN-LAST:event_GradoKeyTyped

    private void AKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyTyped
        
        char A = evt.getKeyChar();
        
        if(Character.isLetter(A))
        {
            getToolkit().beep();
            evt.consume();
            Integral.setEnabled(false);
        }
        
        else
        {
            Integral.setEnabled(true);
        }
        
    }//GEN-LAST:event_AKeyTyped

    private void BKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyTyped
        
        char B = evt.getKeyChar();
        
        if(Character.isLetter(B))
        {
            getToolkit().beep();
            evt.consume();
            Integral.setEnabled(false);
        }
        
        else
        {
            Integral.setEnabled(true);
        }
        
    }//GEN-LAST:event_BKeyTyped

    private void NKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NKeyTyped
        
        char N = evt.getKeyChar();
        
        if(Character.isLetter(N))
        {
            getToolkit().beep();
            evt.consume();
            Integral.setEnabled(false);
        }
        
        else
        {
            Integral.setEnabled(true);
        }
        
    }//GEN-LAST:event_NKeyTyped

    private void IntegralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntegralActionPerformed
     
        try{
        
        int i, j; 
        double k;
        double a, b;
        double n;
        String a1, b1;
        int grado;
        float x;
        double integral = 0;
        double tramo = 0;
        
        n = Integer.parseInt(this.N.getText());
        a1 = A.getText();
        b1 = B.getText();
        grado = Integer.parseInt(this.Grado.getText());
        
        if(a1.indexOf('.') != -1)
        {
            a = Double.parseDouble(a1);
        }
            
        else if(a1.indexOf('/') != -1)
        {
            String arreglo1[]= a1.split("/");
            double fraccionA = Double.parseDouble(arreglo1[0]);
            double fraccionB = Double.parseDouble(arreglo1[1]);
            a = fraccionA / fraccionB;
        }
            
        else
        {
        a = Double.parseDouble(a1); 
        }
        
        
        
        if(b1.indexOf('.') != -1)
        {
            b = Double.parseDouble(b1);
        }
            
        else if(b1.indexOf('/') != -1)
        {
            String arreglo1[]= b1.split("/");
            double fraccionA = Double.parseDouble(arreglo1[0]);
            double fraccionB = Double.parseDouble(arreglo1[1]);
            b = fraccionA / fraccionB;
        }
            
        else
        {
        b = Double.parseDouble(b1); 
        }
        
        
        Funcion.setText(" ");
        Resultado.setText(" ");
        
        if(n < 0)
        {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor de 'n' mayor o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
            Funcion.setText("");
            Resultado.setText("");
        }
        
        else if(a > b)
        {
            JOptionPane.showMessageDialog(null, "El intervalo 'a' debe ser menor o igual al intervalo 'b'", "Error", JOptionPane.ERROR_MESSAGE);
            Funcion.setText("");
            Resultado.setText("");
        }
        
        else if(grado < 0)
        {
            JOptionPane.showMessageDialog(null, "El grado de la función debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
            Funcion.setText("");
            Resultado.setText("");
        }
        
        else if((n < 0 && grado < 0 && a > b) || (n < 0 && grado < 0) || (n < 0 && a > b) || (grado < 0 && a > b))
        {
            JOptionPane.showMessageDialog(null, "Algunos valores ingresados no cumplen con los \n"
                    + "parámetros para calcular la Integral", "Error", JOptionPane.ERROR_MESSAGE);
            Funcion.setText("");
            Resultado.setText("");
        }
        
        else if(a == b)
        {
            JOptionPane.showMessageDialog(null, "No importa la función que se ingrese, \n"
                    + "el resultado es 0", "Error", JOptionPane.INFORMATION_MESSAGE);
            Funcion.setText("");
            Resultado.setText("");
        }
        
        
        double ecuacion[] = new double [grado + 1];
        String ecuacion1[] = new String[grado + 1];
        
        JOptionPane.showMessageDialog(null, "Ahora ingresa los coeficientes de las variables", "POLINOMIO", JOptionPane.QUESTION_MESSAGE);
        
        for(i = grado; i >= 0; i--)
        {
            ecuacion1[i] = JOptionPane.showInputDialog(null, "X^" +i, "POLINOMIO", JOptionPane.QUESTION_MESSAGE);
            
            if(ecuacion1[i].indexOf('.') != -1)
            {
                ecuacion[i] = Double.parseDouble(ecuacion1[i]);
            }
            
            else if(ecuacion1[i].indexOf('/') != -1)
            {
                String arreglo1[]= ecuacion1[i].split("/");
                double fraccionA = Double.parseDouble(arreglo1[0]);
                double fraccionB = Double.parseDouble(arreglo1[1]);
                ecuacion[i] = fraccionA / fraccionB;
            }
            
            else
            {
            ecuacion[i] = Double.parseDouble(ecuacion1[i]); 
            }   
            
        }
        
        JOptionPane.showMessageDialog(null, "La función se muestra en el respectivo campo", "Integrales", JOptionPane.INFORMATION_MESSAGE);
        
        for(i = grado; i >= 0; i--)
        {
            
            if(ecuacion[i] == 0)
            {
                Funcion.append(String.valueOf(""));
            }
            
            else
            {
                if(i == n)
                {
                    if(ecuacion[i] == 1)
                    {
                        Funcion.append(String.valueOf(""));
                        Funcion.append(String.valueOf("x^" +i));
                    }
                    else if(ecuacion[i] > 0 && ecuacion[i] < 1)
                    {
                        Funcion.append(String.valueOf(""));
                        Funcion.append(String.valueOf(ecuacion[i] + "x^" +i));
                    }
                    else if(ecuacion[i] > 1)
                    {
                        Funcion.append(String.valueOf(""));
                        Funcion.append(String.valueOf(ecuacion[i] + "x^" +i));
                    }
                    else
                    {
                        Funcion.append(String.valueOf(" - "));
                        Funcion.append(String.valueOf((ecuacion[i] * (-1))+ "x^" +i));
                    }
                    
                }
                
                else if (i == 1)
                {
                    
                    if(ecuacion[i] == 1)
                    {
                        Funcion.append(String.valueOf(" + "));
                        Funcion.append(String.valueOf("x"));
                    }
                    else if(ecuacion[i] > 0 && ecuacion[i] < 1)
                    {
                        Funcion.append(String.valueOf(" + "));
                        Funcion.append(String.valueOf(ecuacion[i] + "x^" +i));
                    }
                    else if(ecuacion[i] > 1)
                    {
                        Funcion.append(String.valueOf(" + "));
                        Funcion.append(String.valueOf(ecuacion[i]+ "x"));
                    }
                    else
                    {
                        Funcion.append(String.valueOf(" - "));
                        Funcion.append(String.valueOf("x"));
                    }
                }
                
                else if (i == 0)
                    {
                        if(ecuacion[i] == 1)
                        {
                            Funcion.append(String.valueOf(" + "));
                            Funcion.append(String.valueOf(ecuacion[i]));
                        }
                        else if(ecuacion[i] > 0 && ecuacion[i] < 1)
                        {
                            Funcion.append(String.valueOf(" + "));
                            Funcion.append(String.valueOf(ecuacion[i] + "x^" +i));
                        }
                        else if(ecuacion[i] > 1)
                        {
                            Funcion.append(String.valueOf(" + "));
                            Funcion.append(String.valueOf(ecuacion[i]));
                        }
                        else
                        {
                            Funcion.append(String.valueOf(" - "));
                            Funcion.append(String.valueOf(ecuacion[i] * (-1)));
                        }
                         
                    }
                
                else
                {
                    if(ecuacion[i] == 1)
                    {
                        Funcion.append(String.valueOf(" + "));
                        Funcion.append(String.valueOf("x^" +i));  
                    }
                    else if(ecuacion[i] > 0 && ecuacion[i] < 1)
                    {
                        Funcion.append(String.valueOf(" + "));
                        Funcion.append(String.valueOf(ecuacion[i] + "x^" +i));
                    }
                    else if(ecuacion[i] > 1)
                    {
                        Funcion.append(String.valueOf(" + "));
                        Funcion.append(String.valueOf(ecuacion[i]+ "x^" +i));
                    }
                    else
                    {
                        Funcion.append(String.valueOf(" - "));
                        Funcion.append(String.valueOf((ecuacion[i] * (-1))+ "x^" +i));
                    }
                }
            }
            
        }
        
      
      double division = (b - a) / (n + 1);
      double funcion1, funcion2;
      double diferencia = 0;
      tramo = a;
      
      for (k = a; k <= b; k += division)
      {
        funcion1 = 0;
        funcion2 = 0;
      
        if(k == a)
        { 
         
        }
        else
        { 
          for(j = grado; j >= 0; j--)
          {
              funcion1 += (ecuacion[j] * (Math.pow((k - division), j)));
              funcion2 += (ecuacion[j] * (Math.pow(k, j)));
          }
       
          
        }
        
        diferencia = funcion1 + funcion2;
        integral += (division * (diferencia / 2));
      }
      
      
      Resultado.append(String.valueOf(integral));
        
        
        
        }catch(Exception e){JOptionPane.showMessageDialog(null, "Ingresa sólo los valores solicitados", "Error", JOptionPane.ERROR_MESSAGE);}  
    }//GEN-LAST:event_IntegralActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        AyudaIntegrales ai = new AyudaIntegrales();
        ai.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(Integrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Integrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Integrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Integrales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Integrales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextArea Funcion;
    private javax.swing.JTextField Grado;
    private javax.swing.JButton Integral;
    private javax.swing.JTextField N;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
