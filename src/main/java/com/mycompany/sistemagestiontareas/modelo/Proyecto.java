
package com.mycompany.sistemagestiontareas.modelo;

import java.util.ArrayList;


public class Proyecto {
    private int idProyecto;
    private String nombre;
    private ArrayList<Task>tareas;

    public Proyecto() {
        tareas= new ArrayList();
        idProyecto=0;
        nombre="";
    }

    public Proyecto(int idProyecto, String nombre, ArrayList<Task> tareas) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.tareas = tareas;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Task> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Task> tareas) {
        this.tareas = tareas;
    }
    
    public void agregarTarea(Task tarea){
        tareas.add(tarea);
    }
    public boolean eliminarTarea(Task tarea){
        if(tareas.contains(tarea)){
            tareas.remove(tarea);
            return true;
        }
        else
            return false;
    }
    public Task obtenerTarea(int idTarea){
        for(Task tarea:tareas){
            if(idTarea==tarea.getIdTask())
                return tarea;
        }
        return null;
    }
    
}
