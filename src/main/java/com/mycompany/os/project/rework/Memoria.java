/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.os.project.rework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alison
 */
public class Memoria extends Thread {

    private int so;
    private int quantum;
    public List<Process> procesos = new ArrayList<>();
    private int size;
    private int activador;
    private int disponible;
    private boolean run = false;
    private int pointer;
    private Integer counter;

    public Memoria() {
        this.counter = 0;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void iniciarMemoria(int size, int activador, int so) {
        this.size = size;
        this.activador = activador;
        this.so = so;
        this.disponible = size - activador - so;
        this.pointer = (activador + so) + 1;

        //verificadores
        System.out.println("Tamaño de memoria: " + this.size);
        System.out.println("Activador: " + this.activador);
        System.out.println("Tamaño del SO: " + this.so);
        System.out.println("Espacio disponible: " + this.disponible);
        System.out.println("Puntero: " + this.pointer);

        Process osProcess = new Process("Sistema operativo");
        procesos.add(osProcess);

        Process activadorProcess = new Process("Activador");
        procesos.add(activadorProcess);

        QuantumTime();

        this.run = true;
    }

    public void QuantumTime() {
        Random random = new Random();
        // this.quantum = (int) Math.floor(Math.random() * (4 - 9 + 1) + 9);
        this.quantum = 1;
        System.out.println("Duracion del quantum: " + this.quantum + "s");
    }

    public void AddProcess() {
        Process process = new Process("P" + counter);
        if (process.getProcess_size() < disponible) {
            this.disponible = disponible - process.getProcess_size();
            this.pointer = pointer + process.getProcess_size();
            procesos.add(process);
            this.counter = this.counter + 1;
            System.out.println("Nuevo espacio disponible: " + this.disponible);
            System.out.println("Nuevo puntero: " + this.pointer);
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente espacio para agregar el proceso", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void run() {
        while (run) {
            try {
                sleep(this.quantum * 1000);
                /*
                    procesos.get(2).start();
                    Activar el proceso si posible
                    Adentro del proceso va a ir disminuyendo el tiempo
                
                */
                System.out.println(procesos.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(Memoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
