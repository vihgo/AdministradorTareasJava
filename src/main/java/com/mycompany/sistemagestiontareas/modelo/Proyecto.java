
package com.mycompany.sistemagestiontareas.modelo;

import java.util.ArrayList;


public class Proyecto {
    private int idProyecto;
    private String nombre;
    private ArrayList<Tarea>tareas;

    public Proyecto() {
        tareas= new ArrayList();
        idProyecto=0;
        nombre="";
    }

    public Proyecto(int idProyecto, String nombre, ArrayList<Tarea> tareas) {
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

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tarea> tareas) {
        this.tareas = tareas;
    }
    
    public Tarea agregarTarea(String nombreTarea,String fechaLimite,int prioridad){
        if(!nombreTarea.isBlank()&&!fechaLimite.isBlank()){
            
           
            int ultimoId= obtenerUltimoIdTarea()+1;
            Tarea nuevaTarea= new Tarea(ultimoId, nombreTarea, fechaLimite, prioridad);
            tareas.add(nuevaTarea);
            return nuevaTarea;
        }
        return null;
    }
    public boolean eliminarTarea(Tarea tarea){
        if(tareas.contains(tarea)){
            tareas.remove(tarea);
            return true;
        }
        else
            return false;
    }
    public Tarea obtenerTarea(int idTarea){
        for(Tarea tarea:tareas){
            if(idTarea==tarea.getIdTask())
                return tarea;
        }
        return null;
    }
    public int obtenerUltimoIdTarea(){
        if(!tareas.isEmpty())
            return tareas.get(tareas.size()-1).getIdTask();
        return 0;
    }
    
}
