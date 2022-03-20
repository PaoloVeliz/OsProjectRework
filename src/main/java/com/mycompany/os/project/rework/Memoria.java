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
    private Integer pointer;
    private Integer counter;
    private Integer currentInstruction = 1;
    private int quantum2;
    private int currentProcess = 2;

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

    public List<Process> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Process> procesos) {
        this.procesos = procesos;
    }

    public int getCurrentProcess() {
        return currentProcess;
    }

    public void setCurrentProcess(int currentProcess) {
        this.currentProcess = currentProcess;
    }

    public Integer getCurrentInstruction() {
        return currentInstruction;
    }

    public void setCurrentInstruction(Integer currentInstruction) {
        this.currentInstruction = currentInstruction;
    }

    public Integer getPointer() {
        return pointer;
    }

    public void setPointer(Integer pointer) {
        this.pointer = pointer;
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
        this.quantum = (int) Math.floor(Math.random() * (3 - 6 + 1) + 6);
        this.quantum2 = this.quantum;
        System.out.println("Duracion del quantum: " + this.quantum + "s");
    }

    public Process AddProcess() {
        Process process = new Process("P" + counter);
        if (process.getProcess_size() < disponible) {
            System.out.println("El proceso " + process.getProcess_id() + "empieza en la dirección: " + this.pointer);
            process.setBase(this.pointer);
            this.disponible = disponible - process.getProcess_size();
            this.pointer = pointer + process.getProcess_size();
            System.out.println("El proceso " + process.getProcess_id() + "termina en la dirección: " + (this.pointer - 1));
            process.setLimit(this.pointer - 1);
            procesos.add(process);
            this.counter = this.counter + 1;
            System.out.println("Nuevo espacio disponible: " + this.disponible);
            System.out.println("Nuevo puntero: " + this.pointer);
            return process;
        } else {
            JOptionPane.showMessageDialog(null, "No hay suficiente espacio para agregar el proceso", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    @Override
    public void run() {
        while (run) {
            try {
                sleep(2000);
                //la primera comprobación es la del tiempo restante debido a que se
                //hace el cambio del proceso sin importar si todavía queda tiempo en el quantum
                if (this.procesos.size() > 2) {
                    if (this.procesos.get(currentProcess).getMissing_time() != 0) {
                        if (this.quantum2 != 0) {
                            //Aqui empieza a ejecutar las instrucciones
                            System.out.println("Proceso: " + this.procesos.get(currentProcess).getProcess_id());
                            System.out.println("Instrucciones: " + this.procesos.get(currentProcess).getProcess_size());
                            System.out.println("Procesando instruccion no.: " + (this.procesos.get(currentProcess).getProcess_size() - this.procesos.get(currentProcess).getMissing_time() + 1));
                            this.procesos.get(currentProcess).setMissing_time(this.procesos.get(currentProcess).getMissing_time() - 1);
                            this.currentInstruction = (this.procesos.get(currentProcess).getProcess_size() - this.procesos.get(currentProcess).getMissing_time());
                            this.quantum2 = this.quantum2 - 1;
                        } else {
                            //Si quedan instrucciones restantes pero se acabo el tiempo del quantum
                            //reincia el quantum, y se pasa al proceso siguiente
                            this.quantum2 = this.quantum;
                            int ultimo = this.procesos.size() - 1;
                            if (this.currentProcess >= ultimo) {
                                this.currentProcess = 2;
                            } else {
                                this.currentProcess = currentProcess + 1;
                            }
                            currentInstruction = -1;
                            System.out.println("Activador encendido");

                        }

                    } else {
                        //De lo contrario se elimina el proceso y reinicia el quantum
                        this.quantum2 = this.quantum;
                        this.disponible = this.disponible + this.procesos.get(currentProcess).getProcess_size();
                        System.out.println("Disponible: " + this.disponible);
                        this.procesos.remove(currentProcess);
                        System.out.println("Activador encendido");
                        currentInstruction = -1;
                        int ultimo = this.procesos.size() - 1;
                        if (this.currentProcess >= ultimo) {
                            this.currentProcess = 2;
                        }

                    }

                }

                System.out.println(procesos.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(Memoria.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
