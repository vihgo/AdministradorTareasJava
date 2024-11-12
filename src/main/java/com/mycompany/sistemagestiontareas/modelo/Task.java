/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.modelo;

import java.time.LocalDate;


public class Task 
{
    private int idTask;
    private String nombre;
    private String fechaLimite;
    private int prioridad;
    private boolean completada;

    public Task() {
        idTask=0;
        nombre="";
        prioridad=0;
        completada=false;
    }

    public Task(int idTask, String nombre, String fechaLimite, int prioridad) {
        this.idTask = idTask;
        this.nombre = nombre;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        completada=false;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
    
    
    
}
