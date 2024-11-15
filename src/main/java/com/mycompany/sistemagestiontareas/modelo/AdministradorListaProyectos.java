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
        int idProyecto=1;
        if(!proyectos.isEmpty())
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
    
}
