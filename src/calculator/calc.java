/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class calc extends javax.swing.JFrame {

    /**
     * Creates new form calc
     */
    double firstnum;
   // double secondnum;
    double result;
    double resultf;
    String operation;
    int count =0;
    int count1 =0;
      String answer;
    public calc() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btninvere = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setForeground(new java.awt.Color(0, 51, 255));

        btn9.setBackground(new java.awt.Color(153, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(153, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(153, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(153, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(153, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(153, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(153, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(153, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(153, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btndot.setBackground(new java.awt.Color(153, 255, 255));
        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(153, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnequal.setBackground(new java.awt.Color(153, 255, 255));
        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        btndiv.setBackground(new java.awt.Color(153, 255, 255));
        btndiv.setText("%");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnmul.setBackground(new java.awt.Color(153, 255, 255));
        btnmul.setText("*");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(153, 255, 255));
        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnsub.setBackground(new java.awt.Color(153, 255, 255));
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        t1.setBackground(new java.awt.Color(255, 255, 204));
        t1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnclear.setBackground(new java.awt.Color(255, 102, 102));
        btnclear.setText("clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btninvere.setBackground(new java.awt.Color(153, 255, 255));
        btninvere.setText("+/-");
        btninvere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninvereActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(255, 255, 51));
        btnback.setText("backspace");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btndot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnback, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btninvere, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btninvere, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnequal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn4.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn5.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn9.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn1.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn8.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn7.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn6.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn3.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn2.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        // TODO add your handling code here:
        count++;
        if(count==1)
        {
        String number=t1.getText()+btndot.getText();
        t1.setText(number);
        }
        else
        {
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        String number=t1.getText()+btn0.getText();
        t1.setText(number);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        result=0;
        resultf=0;
        count=0;
        count1=0;
       // count2=0;
        //count3=0;
        //count4=0;
        t1.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        // TODO add your handling code here:
        if(t1.getText().equals(""))
        {
            operation="%";
        }
        else
        {
       count1++;
         result = Double.parseDouble(t1.getText());
         if(count1==1)
         {
             resultf=result;
         }
         else
         {
            if(result<0 && count1==2)
           {
               resultf=result;
           }
        else if(operation.equals("+"))
         {
             resultf=resultf+result;
         }
          else if(operation.equals("-"))
         {
             resultf=resultf-result;
         }
         else if(operation.equals("*"))
         {
             resultf=resultf*result;
         }
         else if(operation.equals("%"))
         {
             resultf=resultf/result;
         }
         }
        t1.setText("");
        operation="%";
        }
    }//GEN-LAST:event_btndivActionPerformed

    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulActionPerformed
        // TODO add your handling code here:
         if(t1.getText().equals(""))
        {
            operation="*";
        }
         else
         {
        count1++;
          result = Double.parseDouble(t1.getText());
         
        if(count1==1)
         {
             resultf=result;
         }
         else
         {
              if(result<0 && count1==2)
           {
               resultf=result;
           }
        else if(operation.equals("+"))
         {
             resultf=resultf+result;
         }
          else if(operation.equals("-"))
         {
             resultf=resultf-result;
         }
         else if(operation.equals("*"))
         {
             resultf=resultf*result;
         }
         else if(operation.equals("%"))
         {
             resultf=resultf/result;
         }
         }
         t1.setText("");
        operation="*";
    }//GEN-LAST:event_btnmulActionPerformed
    }
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
         if(t1.getText().equals(""))
        {
            operation="+";
        }
         else
         {
        count1++;
         result = Double.parseDouble(t1.getText());
         if(count1==1)
         {
             resultf=result;
         }
         else
         {
           if(result<0 && count1==2)
           {
               resultf=result;
           }
       else if(operation.equals("+"))
         {
             resultf=resultf+result;
         }
          else if(operation.equals("-"))
         {
             resultf=resultf-result;
         }
         else if(operation.equals("*"))
         {
             resultf=resultf*result;
         }
         else if(operation.equals("%"))
         {
             resultf=resultf/result;
         }
         }
        t1.setText("");
         operation="+";
    }//GEN-LAST:event_btnaddActionPerformed
    }
    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
        // TODO add your handling code here:
        count1++;
        if(count1==1)
        {
            t1.setText("-");
        }
        else
        {
        if(t1.getText().equals(""))
        {
            operation="-";
        }
        else
        {
         result = Double.parseDouble(t1.getText());
         if(count1==1)
         {
             resultf=result;
         }
         else
         {
              if(result<0 && count1==2)
           {
               resultf=result;
           }
        else  if(operation.equals("+"))
         {
             resultf=resultf+result;
         }
          else if(operation.equals("-"))
         {
             resultf=resultf-result;
         }
         else if(operation.equals("*"))
         {
             resultf=resultf*result;
         }
         else if(operation.equals("%"))
         {
             resultf=resultf/result;
         }
         }
        t1.setText("");
        operation="-";
    }//GEN-LAST:event_btnsubActionPerformed
    }
    }
    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
        // TODO add your handling code here:
       if(t1.getText().equals("") && !"inv".equals(operation))
        {
            JOptionPane.showMessageDialog(null,"invalid format");
        }
       else
       {
        firstnum=Double.parseDouble(t1.getText());
       if(operation.equals ("inv"))
        {
            answer=String.format("%.3f", resultf);
            t1.setText(answer);
            operation="=";
        }
       else if(operation .equals("+"))
        {
            resultf=firstnum + resultf;
            answer=String.format("%.3f",resultf);
             t1.setText(answer);
             operation="=";
        }
      else if(operation .equals( "-"))
         {
            resultf=resultf-firstnum ;
            answer=String.format("%.3f",resultf);
            t1.setText(answer);
             operation="=";
        }
     else if(operation .equals( "*"))
          {
            resultf=resultf * firstnum;
            answer=String.format("%.3f",resultf);
            t1.setText(answer);
             operation="=";
        }
       else if(operation .equals("%"))
           {
            resultf=resultf/firstnum;
            answer=String.format("%.3f",resultf);
           
            t1.setText(answer);
             operation="=";
        }
    }//GEN-LAST:event_btnequalActionPerformed
    }
    private void btninvereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninvereActionPerformed
        // TODO add your handling code here:
         if(t1.getText().equals(""))
        {
            resultf=resultf*(-1);
            operation="inv";
        }
         else
         {
          count1++;
        result=Double.parseDouble((t1.getText()));
        if(count1==1)
        {
            result=result*(-1);
            resultf=result;
        }
        
        else
        {
             if(operation.equals("+"))
         {
             resultf=resultf+result;
              resultf=resultf*(-1);
             
         }
          else if(operation.equals("-"))
         {
             resultf=resultf-result;
              resultf=resultf*(-1);
              
         }
         else if(operation.equals("*"))
         {
             resultf=resultf*result;
              resultf=resultf*(-1);
             
         }
         else if(operation.equals("%"))
         {
             resultf=resultf/result;
              resultf=resultf*(-1);
            
         }
        }
       operation="inv";
       t1.setText("");
    }//GEN-LAST:event_btninvereActionPerformed
    }
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        if(t1.getText().equals(""))
        {
        }
        else
        {
        String str = t1.getText();
        str=str.replace(str.substring(str.length()-1),"");
        t1.setText(str);}
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btninvere;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnsub;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
