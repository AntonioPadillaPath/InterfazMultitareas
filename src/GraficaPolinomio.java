/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;
/**
 *
 * @author Antonio
 */
public class GraficaPolinomio extends javax.swing.JApplet {

    /**
     * Initializes the applet GraficaPolinomio
     */
    @Override
    public void init() {
        
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
            java.util.logging.Logger.getLogger(GraficaPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaPolinomio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        resize(310, 450);
        
        this.getContentPane().setBackground(Color.white);
        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }

                //private void initComponents() {
                  //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                //}

                
                
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    double a, b;
    double punto, y = 0;
    
    /*public void Graficar(){
        
       if(A.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingresa el intervalo 'a':");
            A.requestFocus();
        }
        else
        {
            a = Double.parseDouble(A.getText());

                if(B.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Ingresa el intervalo 'b':");
                    B.requestFocus();
                }
                else
                {
                    b = Double.parseDouble(B.getText());
                    
                    if(a >= b)
                    {
                        JOptionPane.showMessageDialog(null, "Ingresa un intervalo 'a' menor a 'b'");
                    }
                    else
                    {
                    Graphics p = getGraphics();
                    
                    p.setColor(new Color(0, 0, 0));
                    
                    p.fillRect(100, 100, 300, 400);
                    p.setColor(new Color(255, 0, 0));
                    p.drawLine(300, 300, 300, 300);
                    p.drawLine(150, 350, 150, 350);
                    
                    p.setColor(new Color(255, 255, 255));
                    
                    for(int i = 300; i < 300; i +=8) //vertical
                    {
                       p.drawLine(i, 305, i, 295); 
                    }
                    
                    for(int j = 350; j < 350; j +=8) // horizontal
                    {
                       p.drawLine(145, j, 155, j); 
                    }
                    
                    for(double x = a; x < b; x += 0.01)
                    {
                        punto = 150 + x * 30;

                                y = 300 - (Math.pow(x, 4) + Math.pow(x, 3) + Math.pow(x, 2) + x + 1) * 30;

                        p.drawLine((int)punto, (int)y, (int)punto + 1, (int) y + 1);
                        
                    }
                    
                
            }
            
        }
        }
    }*/

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        Graficar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Graficar.setText("Graficar");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Graficar)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(510, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Graficar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        
        if(A.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Ingresa el intervalo 'a':");
            A.requestFocus();
        }
        else
        {
            a = Double.parseDouble(A.getText());

                if(B.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Ingresa el intervalo 'b':");
                    B.requestFocus();
                }
                else
                {
                    b = Double.parseDouble(B.getText());
                    
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
                    
                    for(int i = 10; i < 300; i +=8) //vertical
                    {
                       p.drawLine(i, 305, i, 295); 
                    }
                    
                    for(int j = 120; j < 450; j +=8) // horizontal
                    {
                       p.drawLine(145, j, 155, j); 
                    }
                    
                    for(double x = a; x < b; x += 0.001)
                    {
                        punto = 150 + x * 30;

                                y = 300 - (/*Math.pow(x, 4) + Math.pow(x, 3) + Math.pow(x, 2) + x + 1*/9) * 30;

                        p.drawLine((int)punto, (int)y, (int)punto + 1, (int) y + 1);
                        
                    }
                    
                
            }
            
        }
        
    }
        
    }//GEN-LAST:event_GraficarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JButton Graficar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
