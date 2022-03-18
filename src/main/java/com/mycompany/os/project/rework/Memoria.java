/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.os.project.rework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alison
 */
public class Memoria {
     private int so;
    private int quantum;
    public List<Process> procesos = new ArrayList<>();
    private int size;
    private int activador;
    private int disponible;
    private boolean run=false;
    private int pointer;
    

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
    public void ReservedSpace(int size, int activador, int so){
        this.size = size;
        this.activador = activador;
        this.so = so;
        this.disponible = size - activador - so;
        this.pointer = (activador + so) + 1;
        
        //verificadores
        System.out.println(this.size);
        System.out.println(this.activador);
        System.out.println(this.so);
        System.out.println(this.disponible);
        System.out.println(this.pointer);

    }
    
    public void QuantumTime(){
        Random random = new Random();
        this.quantum = (int) Math.floor(Math.random()*(4-9+1)+9);
    }

    
    public void AddProcess(){
        this.run = true;  
        this.run();
    }
    
    @Override
    public void run(){
        while(run){            
                Process process  = new Process();
                process.NewProcess(process);
                System.out.println(process.getProcess_instructions());
                System.out.println(process.getName());


                if(process.getProcess_instructions() < disponible){
                    this.disponible= disponible - process.getProcess_instructions();
                    this.pointer = pointer + process.getProcess_instructions();
                    procesos.add(process);
                    System.out.println(this.disponible);
                    System.out.println(this.pointer);
        
                }else{
                    JOptionPane.showMessageDialog(null, "No hay suficiente espacio para agregar el proceso", "Error", JOptionPane.ERROR_MESSAGE);
                }                 
            run = false;
            }
    
    
        
    }
    
}
