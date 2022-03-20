/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.os.project.rework;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author Tato
 */
public class Main extends javax.swing.JFrame {

    ArrayList historialList = new ArrayList();
    DefaultListModel historialModelo = new DefaultListModel();
    Reloj hora = new Reloj();
    Memoria memoria = new Memoria();
    Simulador simulador = new Simulador();
    int ProgressBar;

    public Main() {
        initComponents();
        historial.setModel(historialModelo);
        memoria.iniciarMemoria(100, 5, 10);
        memoria.start();
        hora.start();
        simulador.start();
        //memoria.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Calendarizador = new javax.swing.JTextField();
        Contador = new javax.swing.JTextField();
        Base = new javax.swing.JTextField();
        Limite = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        historial = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        HourSystem = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Inicial = new javax.swing.JLabel();
        Final = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Progress = new javax.swing.JProgressBar();

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel7.setText("Limite");

        jTextField2.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Procesos");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel1.setText("Procesador");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel2.setText("Calendarizador");

        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel4.setText("Contador");

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel5.setText("Base");

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel6.setText("Limite");

        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel8.setText("Historial");

        Calendarizador.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Calendarizador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Calendarizador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0)));

        Contador.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Contador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contador.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0)));

        Base.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Base.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Base.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0)));

        Limite.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        Limite.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Limite.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(0, 0, 0)));

        historial.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        historial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(historial);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Calendarizador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Calendarizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Contador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel9.setText("Hora");

        HourSystem.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        HourSystem.setText("00:00:00:00");

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jLabel3.setText("Memoria principal");

        Inicial.setFont(new java.awt.Font("Palatino Linotype", 2, 12)); // NOI18N
        Inicial.setText("Memory");

        Final.setFont(new java.awt.Font("Palatino Linotype", 2, 12)); // NOI18N
        Final.setText("Memory");

        jButton2.setFont(new java.awt.Font("Palatino Linotype", 2, 14)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inicial)
                    .addComponent(Final))
                .addGap(18, 18, 18)
                .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HourSystem)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(HourSystem))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Final)
                                .addGap(18, 18, 18)
                                .addComponent(Inicial))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(Progress, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Process createdProcess = memoria.AddProcess();
        System.out.println(createdProcess);
        historialList.add("Proceso: " + createdProcess.getProcess_id() + " - Creado a las: " + hora.getHora());
        historialModelo.removeAllElements();
        new Thread (new PaintProgress()).start();
        for (int i = 0; i < historialList.size(); i++) {
            historialModelo.addElement(historialList.get(i));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private class PaintProgress implements Runnable{
        @Override
        public void run() {
            Process process = memoria.getProcesos().get(memoria.getCurrentProcess() - 1);
            for(int i = 2 ; i <= memoria.getProcesos().size(); i++){
                if (process.getProcess_size() != 0 && process.getMissing_time() > memoria.getQuantum()){
                    for (int x = 0; x <= memoria.getQuantum(); x++){
                        Barra(memoria.getSize(), memoria.getQuantum());
                        Pintar();
                    }
                    if (process.getMissing_time() == 0){
                        Pintar();
                        Progress.setValue(2);
                    }
                }else{
                    if (process.getMissing_time() > 0 && memoria.getQuantum() !=0){
                        while(process.getMissing_time() > 0){
                            Barra(memoria.getSize(), memoria.getQuantum());
                            Pintar();
                        }
                        if (process.getMissing_time() == 0 && memoria.getQuantum() != 0){
                            Pintar();
                            Progress.setValue(2);
                        }
                    }else{
                        if(process.getMissing_time()==0 && memoria.getQuantum() != 0){
                            Pintar();
                            Progress.setValue(2);
                        }
                    }
                }
            }
           /* while(condition!=0){
                while (count < memoria.getSize()){
                    if (process.getMissing_time() != 0 && process.getMissing_time() > memoria.getQuantum()){
                        for(int i=0; i <= memoria.getQuantum(); i++){
                            Barra(memoria.getSize(), process.getMissing_time());
                            Pintar();
                        }
                        if (process.getMissing_time() == 0){
                            Pintar();
                            Progress.setValue(0);
                        }
                    }else{
                        if(process.getMissing_time() >0 && process.getQuantum() != 0){
                            while(process.getMissing_time()>0){
                                Barra(memoria.getSize(),process.getMissing_time());
                                Pintar();
                            }
                            if(process.getMissing_time()==0 && process.getQuantum() != 0){
                                Pintar();
                                Progress.setValue(0);
                            }
                        }else{
                            if(process.getMissing_time()==0 && process.getQuantum() != 0){
                                Pintar();
                                Progress.setValue(0);
                            }
                        }
                    }
                    count++;
                }
                count = 0;
            }
        }*/
    }
    
    public void Pintar(){
        Progress.setValue(ProgressBar + 2);
        Progress.repaint();
    }
    
    public void Barra(int size, int missing){
        int valor = 100/size;
        int porcentaje = 100-(valor*missing);
        ProgressBar = porcentaje;
    }
    
    public class Simulador extends Thread {

        @Override
        public void run() {
            while (true) {
                if (memoria.getProcesos().size() > 2) {
                    try {
                        Calendarizador.setText(memoria.getProcesos().get(memoria.getCurrentProcess()).getProcess_id());
                        Contador.setText(memoria.getCurrentInstruction().toString());

                        Base.setText(memoria.getProcesos().get(memoria.getCurrentProcess()).getBase().toString());
                        Limite.setText(memoria.getProcesos().get(memoria.getCurrentProcess()).getLimit().toString());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Catch");
                        Calendarizador.setText("Sin proceso activo");
                        Contador.setText("");
                        Base.setText("");
                        Limite.setText("");
                    }
                } else {
                    Calendarizador.setText("Sin proceso activo");
                    Contador.setText("");
                    Base.setText("");
                    Limite.setText("");
                }
            }
        }
    }

    public class Reloj extends Thread {

        Calendar calendario;

        private String hora;

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        @Override
        public void run() {
            while (true) {
                String horaSistema = "";
                calendario = Calendar.getInstance();
                if (calendario.get(Calendar.HOUR_OF_DAY) < 10) {
                    horaSistema += String.valueOf("0" + calendario.get(Calendar.HOUR_OF_DAY)) + ":";
                } else {
                    horaSistema += String.valueOf(calendario.get(Calendar.HOUR_OF_DAY)) + ":";
                }
                if (calendario.get(Calendar.MINUTE) < 10) {
                    horaSistema += String.valueOf("0" + calendario.get(Calendar.MINUTE)) + ":";
                } else {
                    horaSistema += String.valueOf(calendario.get(Calendar.MINUTE)) + ":";
                }
                if (calendario.get(Calendar.SECOND) < 10) {
                    horaSistema += String.valueOf("0" + calendario.get(Calendar.SECOND)) + ":";
                } else {
                    horaSistema += String.valueOf(calendario.get(Calendar.SECOND)) + ":";
                }
                horaSistema += String.valueOf(calendario.get(Calendar.MILLISECOND)) + " hrs";
                this.hora = horaSistema;
                HourSystem.setText(horaSistema);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Base;
    private javax.swing.JTextField Calendarizador;
    private javax.swing.JTextField Contador;
    private javax.swing.JLabel Final;
    private javax.swing.JLabel HourSystem;
    private javax.swing.JLabel Inicial;
    private javax.swing.JTextField Limite;
    private javax.swing.JProgressBar Progress;
    private javax.swing.JList<String> historial;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
