/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author prajwal
 */
public class CalculatorDrag extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorDrag
     */
    public CalculatorDrag() {
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

        jPanel1 = new javax.swing.JPanel();
        Monitor = new javax.swing.JTextField();
        One = new javax.swing.JButton();
        Two = new javax.swing.JButton();
        Three = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        Five = new javax.swing.JButton();
        Six = new javax.swing.JButton();
        four = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        Eight = new javax.swing.JButton();
        Nine = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Percent = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        EqualsTo = new javax.swing.JButton();
        Zero = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Monitor.setEditable(false);
        Monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonitorActionPerformed(evt);
            }
        });
        jPanel1.add(Monitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 52));

        One.setText("1");
        One.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneActionPerformed(evt);
            }
        });
        jPanel1.add(One, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 84, 38));

        Two.setText("2");
        Two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoActionPerformed(evt);
            }
        });
        jPanel1.add(Two, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 58, 84, 38));

        Three.setText("3");
        Three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeActionPerformed(evt);
            }
        });
        jPanel1.add(Three, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 58, 84, 38));

        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });
        jPanel1.add(decimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 84, 38));

        Five.setText("5");
        Five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveActionPerformed(evt);
            }
        });
        jPanel1.add(Five, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 80, 40));

        Six.setText("6");
        Six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixActionPerformed(evt);
            }
        });
        jPanel1.add(Six, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 84, 38));

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 84, 38));

        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });
        jPanel1.add(Seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 84, 38));

        Eight.setText("8");
        Eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EightActionPerformed(evt);
            }
        });
        jPanel1.add(Eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 84, 38));

        Nine.setText("9");
        Nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineActionPerformed(evt);
            }
        });
        jPanel1.add(Nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 84, 38));

        Delete.setText("Del");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 84, 38));

        Percent.setText("%");
        Percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentActionPerformed(evt);
            }
        });
        jPanel1.add(Percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 50, 38));

        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });
        jPanel1.add(Divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 50, 38));

        EqualsTo.setText("=");
        EqualsTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsToActionPerformed(evt);
            }
        });
        jPanel1.add(EqualsTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 50, 38));

        Zero.setText("0");
        Zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroActionPerformed(evt);
            }
        });
        jPanel1.add(Zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 84, 38));

        Clear.setText("C");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 120, 50));

        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });
        jPanel1.add(Minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 50, 38));

        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });
        jPanel1.add(Plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 50, 38));

        Multiply.setText("*");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });
        jPanel1.add(Multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 50, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineActionPerformed
          Monitor.setText(Monitor.getText()+"9");
    }//GEN-LAST:event_NineActionPerformed

    private void EightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EightActionPerformed
          Monitor.setText(Monitor.getText()+"8");
    }//GEN-LAST:event_EightActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
          Monitor.setText(Monitor.getText()+"7");
    }//GEN-LAST:event_SevenActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
          Monitor.setText(Monitor.getText()+"4");
    }//GEN-LAST:event_fourActionPerformed

    private void SixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixActionPerformed
          Monitor.setText(Monitor.getText()+"6");
    }//GEN-LAST:event_SixActionPerformed

    private void OneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneActionPerformed
        
        Monitor.setText(Monitor.getText()+"1");
    }//GEN-LAST:event_OneActionPerformed

    private void MonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonitorActionPerformed
        
    }//GEN-LAST:event_MonitorActionPerformed

    private void EqualsToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsToActionPerformed
        SecondNum=Double.parseDouble(Monitor.getText());
        double result = FirstNum;
        switch(operator){
            case "+": {
                result=result + SecondNum;           
                break;        
            }
            
             case "-": {
                result=result - SecondNum;  
                break;
            }
             
            case "*": {
                 result=result * SecondNum;
                 break;
            }
            
            case "/": {
                 result=result / SecondNum; 
                 break;
            }
            
        }
        monitorSetText(result);
        
    }//GEN-LAST:event_EqualsToActionPerformed

    private void PercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PercentActionPerformed
        double r=Double.parseDouble(Monitor.getText())/100;
        monitorSetText(r);
    }//GEN-LAST:event_PercentActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        getFirstNum();
        clearMonitor();
        operator=evt.getActionCommand();
    }//GEN-LAST:event_MultiplyActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        getFirstNum();
        clearMonitor();
        operator=evt.getActionCommand();
    }//GEN-LAST:event_DivideActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        getFirstNum();
        clearMonitor();
        operator=evt.getActionCommand();
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        getFirstNum();
        clearMonitor();
        operator=evt.getActionCommand();
    }//GEN-LAST:event_PlusActionPerformed

    private void ThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeActionPerformed
          Monitor.setText(Monitor.getText()+"3");
    }//GEN-LAST:event_ThreeActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        Monitor.setText("");
        operator="";
        FirstNum=0;
    }//GEN-LAST:event_ClearActionPerformed

    private void ZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroActionPerformed
          Monitor.setText(Monitor.getText()+"0");
          
    }//GEN-LAST:event_ZeroActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String s= Monitor.getText();
        if(s.length()>0)
        {
            s=s.substring(0,s.length()-1);
            Monitor.setText(s);
        };
    }//GEN-LAST:event_DeleteActionPerformed

    private void TwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoActionPerformed
          Monitor.setText(Monitor.getText()+"2");
    }//GEN-LAST:event_TwoActionPerformed

    private void FiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveActionPerformed

          Monitor.setText(Monitor.getText()+"5");
    }//GEN-LAST:event_FiveActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        int count=0;
        char[] s=Monitor.getText().toCharArray();
        for(char z : s){
            if(z=='.')
                count++;
        }
        if(count==0)
            Monitor.setText(Monitor.getText()+".");
    }//GEN-LAST:event_decimalActionPerformed

    private void getFirstNum(){
        FirstNum=Double.parseDouble(Monitor.getText());
    }
    
    private void clearMonitor(){
        Monitor.setText("");
    }
    
    private void monitorSetText(double s){
        Monitor.setText(String.valueOf(s));
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
            java.util.logging.Logger.getLogger(CalculatorDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorDrag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorDrag().setVisible(true);
            }
        });
    }
    
    private double FirstNum,SecondNum;
    private String operator;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Eight;
    private javax.swing.JButton EqualsTo;
    private javax.swing.JButton Five;
    private javax.swing.JButton Minus;
    private javax.swing.JTextField Monitor;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Nine;
    private javax.swing.JButton One;
    private javax.swing.JButton Percent;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Six;
    private javax.swing.JButton Three;
    private javax.swing.JButton Two;
    private javax.swing.JButton Zero;
    private javax.swing.JButton decimal;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}