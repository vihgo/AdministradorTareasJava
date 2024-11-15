/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melipilla
 */
public class AdministradorListaProyectos implements ProyectoDao{
    
    ArrayList <Proyecto>proyectos= new ArrayList<Proyecto>();
    
    
    
    
    @Override
    public Proyecto crearProyecto(String nombre) {
        
        for(Proyecto miProyecto:proyectos){
            if(nombre.equalsIgnoreCase(miProyecto.getNombre()))
                return miProyecto;
        }
        
        
        int idProyecto=1;
        if(!proyectos.isEmpty())//si el arraylist de proyectos no está vacio
            idProyecto=proyectos.size()+1;
        
        Proyecto  nuevoProyecto=new Proyecto();
        nuevoProyecto.setIdProyecto(idProyecto);
        nuevoProyecto.setNombre(nombre);
        proyectos.add(nuevoProyecto);
        return nuevoProyecto;
        
    }

    @Override
    public ArrayList<Proyecto> obtenerTodosLosProyectos() {
        return proyectos;
        
    }

    @Override
    public String eliminarProyecto(Proyecto proyecto) {
        if(proyectos.contains(proyecto)){
            proyectos.remove(proyecto);
            return "Proyecto Eliminado";
        }else{
            return "Ese proyecto no se encuentra en la lista de proyectos creados";
        }
    }

    @Override
    public Proyecto actualizarProyecto(int id,String nombre, ArrayList<Tarea> tareas) {
       for(Proyecto miProyecto:proyectos){
           if(miProyecto.getIdProyecto()==id){
             
               miProyecto.setTareas(tareas);
               miProyecto.setNombre(nombre);
               return miProyecto;
           }
       }
       return null;
    }

    @Override
    public ArrayList<Tarea> filtrarTareasPorProyecto(String nombreProyecto) {
        for(Proyecto miProyecto:proyectos){
            if(miProyecto.getNombre().equalsIgnoreCase(nombreProyecto))
                return miProyecto.getTareas();
        }
        return null;
    }
    
}
