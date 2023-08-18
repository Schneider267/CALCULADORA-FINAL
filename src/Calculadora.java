/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santo
 */
public class Calculadora extends javax.swing.JFrame {

   private String cadnum="";
   private String opinv="nula"; 
   private double num1;
   private double resul;
   private boolean act=true;
   private boolean pto=true;
    
    
    public Calculadora() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Tan = new javax.swing.JButton();
        Cos = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        raizene = new javax.swing.JButton();
        div = new javax.swing.JButton();
        poten = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        porcen = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        cl = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        cle = new javax.swing.JButton();
        negpos = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        etnum = new javax.swing.JLabel();
        etnum1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(5, 5));

        Tan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tan.setText("tan");
        Tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanActionPerformed(evt);
            }
        });
        jPanel2.add(Tan);

        Cos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cos.setText("cos");
        Cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CosActionPerformed(evt);
            }
        });
        jPanel2.add(Cos);

        sin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });
        jPanel2.add(sin);

        raizene.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        raizene.setText(" y √ x");
        raizene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizeneActionPerformed(evt);
            }
        });
        jPanel2.add(raizene);

        div.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel2.add(div);

        poten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        poten.setText("x^y");
        poten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenActionPerformed(evt);
            }
        });
        jPanel2.add(poten);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton11.setText("7");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setText("8");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton17.setText("9");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton17);

        mult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mult.setText("x");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        jPanel2.add(mult);

        porcen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        porcen.setText("%");
        porcen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcenActionPerformed(evt);
            }
        });
        jPanel2.add(porcen);

        jButton27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton27.setText("4");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton27);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton18.setText("5");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton18);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton19.setText("6");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton19);

        rest.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rest.setText("-");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });
        jPanel2.add(rest);

        cl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cl.setText("C");
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        jPanel2.add(cl);

        jButton22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton22.setText("1");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton22);

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton21.setText("2");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);

        jButton24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton24.setText("3");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton24);

        sum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sum.setText("+");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });
        jPanel2.add(sum);

        cle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cle.setText("CE");
        cle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleActionPerformed(evt);
            }
        });
        jPanel2.add(cle);

        negpos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        negpos.setText("+/-");
        negpos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negposActionPerformed(evt);
            }
        });
        jPanel2.add(negpos);

        jButton29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton29.setText("0");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29);

        punto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        jPanel2.add(punto);

        igual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel2.add(igual);

        etnum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        etnum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etnum.setText("0");

        etnum1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(etnum1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etnum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        double num2;
        if(opinv.equals("nula")){
           etnum.setText(cadnum);
        }else if(opinv.equals("sumar")){ 
            num2=Double.parseDouble(cadnum);
            resul=num1+num2;
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
        }
        
           else if(opinv.equals("restar")){
            num2=Double.parseDouble(cadnum);
            resul=num1-num2;
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
        }
           
        else if(opinv.equals("multiplicar")){
            num2=Double.parseDouble(cadnum);
            resul=num1*num2;
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
        }
        
        else if(opinv.equals("dividir")){
            num2=Double.parseDouble(cadnum);
            if(num2==0){
                etnum.setText("Error");
            }else{
                resul=num1/num2;
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
            }
        }
        
         else if(opinv.equals("raiz enesima")){
            num2=Double.parseDouble(cadnum);
            if(num1==-1){
                etnum.setText("Error");
            }else{
            double resul=Math.pow(num1,1.0/num2);
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
            }
        }
        
         else if(opinv.equals("potencia")){
            num2=Double.parseDouble(cadnum);
            double resul=Math.pow(num1,num2);
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
        }
        
         else if(opinv.equals("porcentaje")){
            num2=Double.parseDouble(cadnum);
            double resul=num1*(num2/100);
            etnum.setText(String.format("% .2f",resul));
            cadnum=String.valueOf(resul);
            opinv="nula";
        }
        
        etnum1.setText("");
        act=true;
        pto=true;
    }//GEN-LAST:event_igualActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        if(pto==true){
            if(cadnum.equals("")){
                cadnum="0.";
            }else{
                cadnum+=".";
            }
            etnum.setText(cadnum);
            pto=false;
        }
    }//GEN-LAST:event_puntoActionPerformed

    private void TanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanActionPerformed
     double num1=Double.parseDouble(cadnum);
         etnum1.setText("tan("+cadnum+")");
         resul=Math.tan(Math.toRadians(num1));
         cadnum=String.valueOf(resul);
    }//GEN-LAST:event_TanActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(etnum.getText().equals("0")){
            cadnum="7";
        }else{
            cadnum+="7";
        }
        etnum.setText(cadnum);
        act=true;
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="8";
        }else{
            cadnum+="8";
        }
        etnum.setText(cadnum);
        act=true;
       
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="9";
        }else{
            cadnum+="9";
        }
        etnum.setText(cadnum);
        act=true;
       
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="4";
        }else{
            cadnum+="4";
        }
        etnum.setText(cadnum);
        act=true;
    
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
           if(etnum.getText().equals("0")){
            cadnum="5";
        }else{
            cadnum+="5";
        }
        etnum.setText(cadnum);
        act=true;  
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="6";
        }else{
            cadnum+="6";
        }
        etnum.setText(cadnum);
        act=true;
       
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="1";
        }else{
            cadnum+="1";
        }
        etnum.setText(cadnum);
        act=true;
  
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="2";
        }else{
            cadnum+="2";
        }
        etnum.setText(cadnum);
        act=true;
     
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="3";
        }else{
            cadnum+="3";
        }
        etnum.setText(cadnum);
        act=true;
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
         if(etnum.getText().equals("0")){
            cadnum="0";
        }else{
            cadnum+="0";
        }
        etnum.setText(cadnum);
        
    }//GEN-LAST:event_jButton29ActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        if(act==true){
            num1=Double.parseDouble(cadnum);
            etnum1.setText(cadnum + "+");
            cadnum="";
            opinv="sumar";
            
            act=false;
            
        }
    }//GEN-LAST:event_sumActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
           if(act==true){
            num1=Double.parseDouble(cadnum);
            etnum1.setText(cadnum + "-");
            cadnum="";
            opinv="restar";
            
            act=false;
            
        }
    }//GEN-LAST:event_restActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
           if(act==true){
            num1=Double.parseDouble(cadnum);
            etnum1.setText(cadnum + "x");
            cadnum="";
            opinv="multiplicar";
            
            act=false;
          
        }
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
           if(act==true){
            num1=Double.parseDouble(cadnum);
            etnum1.setText(cadnum + "/");
            cadnum="";
            opinv="dividir";
            
            act=false;
           
        }
    }//GEN-LAST:event_divActionPerformed

    private void raizeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizeneActionPerformed
        num1=Double.parseDouble(cadnum);
        etnum1.setText(cadnum+"nthrt");
        cadnum="";
        opinv="raiz enesima";
        
        act=false;
       
    }//GEN-LAST:event_raizeneActionPerformed

    private void potenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenActionPerformed
        num1=Double.parseDouble(cadnum);
        etnum1.setText(cadnum+"pow");
        cadnum="";
        opinv="potencia";
        
        act=false;
       
    }//GEN-LAST:event_potenActionPerformed

    private void porcenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcenActionPerformed
        num1=Double.parseDouble(cadnum);
        etnum1.setText(cadnum + "  %");
        cadnum="";
        opinv="porcentaje";
        
        act=false;
      
    }//GEN-LAST:event_porcenActionPerformed

    private void negposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negposActionPerformed
        if(cadnum.charAt(0)!='-'){
            cadnum="-"+cadnum;
        }else{
            cadnum=cadnum.substring(1,cadnum.length());
        }
        etnum.setText(cadnum);
    }//GEN-LAST:event_negposActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        etnum1.setText("");
        etnum.setText("0");
        opinv="nula";
        cadnum="";
        act=true;
        pto=true;
    }//GEN-LAST:event_clActionPerformed

    private void cleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleActionPerformed
       int tam=cadnum.length();
       if(tam>0){
           if(tam==1){
               cadnum="0";
           }else{
               cadnum=cadnum.substring(0,cadnum.length()-1);
           }
           etnum.setText(cadnum);
       }
    }//GEN-LAST:event_cleActionPerformed

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
         double num1=Double.parseDouble(cadnum);
         etnum1.setText("sin("+cadnum+")");
         resul=Math.sin(Math.toRadians(num1));
         cadnum=String.valueOf(resul);
    }//GEN-LAST:event_sinActionPerformed

    private void CosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CosActionPerformed
         double num1=Double.parseDouble(cadnum);
         etnum1.setText("cos("+cadnum+")");
         resul=Math.cos(Math.toRadians(num1));
         cadnum=String.valueOf(resul);
    }//GEN-LAST:event_CosActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cos;
    private javax.swing.JButton Tan;
    private javax.swing.JButton cl;
    private javax.swing.JButton cle;
    private javax.swing.JButton div;
    private javax.swing.JLabel etnum;
    private javax.swing.JLabel etnum1;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mult;
    private javax.swing.JButton negpos;
    private javax.swing.JButton porcen;
    private javax.swing.JButton poten;
    private javax.swing.JButton punto;
    private javax.swing.JButton raizene;
    private javax.swing.JButton rest;
    private javax.swing.JButton sin;
    private javax.swing.JButton sum;
    // End of variables declaration//GEN-END:variables
}
