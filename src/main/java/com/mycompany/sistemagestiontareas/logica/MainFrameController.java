/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.logica;
import javax.swing.JTable;

import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JCheckBox;

/**
 *
 * @author melipilla
 */
public class MainFrameController {
    
    
    public String agregarTarea(String nombre,String fecha,int prioridad, JTable tablaTareas){
       Task nuevaTarea=null;
       if(!nombre.isBlank()&&!fecha.isBlank()){
           nuevaTarea= new Task(1, nombre, fecha, prioridad);
           DefaultTableModel modelo = (DefaultTableModel) tablaTareas.getModel();
           
            // Agregar filas al modelo de la tabla
            
            modelo.addRow(new Object[]{nuevaTarea.getIdTask(), 
                nuevaTarea.getNombre(), nuevaTarea.getFechaLimite(),
                nuevaTarea.getPrioridad()});
           
            System.out.println("se creo una tarea");
        
           
           return "Se ha creado una nueva tarea";
       }
       return "No se ha podido crear la tarea";
    }
    
}
