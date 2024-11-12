/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.controlador;
import com.mycompany.sistemagestiontareas.modelo.Proyecto;
import com.mycompany.sistemagestiontareas.modelo.Proyecto;
import com.mycompany.sistemagestiontareas.modelo.Task;
import com.mycompany.sistemagestiontareas.modelo.Task;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author melipilla
 */
public class MainFrameController {
    private ArrayList<Proyecto> proyectos;
    
    public void crearProyecto(String nombre){
        Proyecto nuevoProyecto=null;
        int ultimoId=0;
        if(proyectos.size()!=0)
            ultimoId= proyectos.size();
        
        ultimoId+=1;
        nuevoProyecto=new Proyecto();
        nuevoProyecto.setIdProyecto(ultimoId);
        nuevoProyecto.setNombre(nombre);
        proyectos.add(nuevoProyecto);

    }
    
    public String agregarTarea(String nombre,String fecha,int prioridad, JTable tablaTareas){
        Task nuevaTarea=null;//Task es tarea en ingles
        if(!nombre.isBlank()&&!fecha.isBlank()){
           nuevaTarea= new Task(1, nombre, fecha, prioridad);
           DefaultTableModel modelo = (DefaultTableModel) tablaTareas.getModel();
           
            // Agregar filas al modelo de la tabla
            
            modelo.addRow(new Object[]{nuevaTarea.getIdTask(), 
                nuevaTarea.getNombre(), nuevaTarea.getFechaLimite(),
                nuevaTarea.getPrioridad(),nuevaTarea.isCompletada()});
           
            System.out.println("se creo una tarea");
        
           
           return "Se ha creado una nueva tarea";
       }
       return "No se ha podido crear la tarea";
    }
    
}
