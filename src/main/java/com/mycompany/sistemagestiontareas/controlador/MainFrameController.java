/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.controlador;

import com.mycompany.sistemagestiontareas.modelo.Proyecto;
import com.mycompany.sistemagestiontareas.modelo.Tarea;
import com.mycompany.sistemagestiontareas.vista.MainFrame;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//el controlador debe  tener acceso a servicios en el modelo que modifican los datos y a los servicios de las vistas que modifican la GUI. La principal tarea de los controladores es coordinar el flujo de la aplicación.

/**
 *
 * @author melipilla
 */
//implementar patron dao para manejar el acceso a los datos: https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm
public class MainFrameController {
    private ArrayList<Proyecto> proyectos;
    private MainFrame mainFrame;
    
    public MainFrameController(){
        proyectos= new ArrayList();
    }
    public MainFrameController(MainFrame mainFrame){
        this.mainFrame=mainFrame;
        proyectos= new ArrayList();
        agregarListeners();
    }
    
    
    private void agregarListeners(){
        mainFrame.getRbProyectoNo().addActionListener(new ActionListener(){ 
            @Override
             public void actionPerformed(ActionEvent e) {
                mainFrame.ocultarCamposProyecto();
            }
        });
        mainFrame.getRbProyectoSi().addActionListener(new ActionListener(){ 
            @Override
             public void actionPerformed(ActionEvent e) {
                mainFrame.mostrarCamposProyecto();
            }
        });
        
        mainFrame.getBtnAgregar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre= mainFrame.getTxtNombreTarea().getText();
                String fecha= mainFrame.getFtxtFechaLimite().getText();
                String nombreProyecto= mainFrame.getTxtNombreProyecto().getText();
                int prioridad=  mainFrame.getCmbPrioridad().getSelectedIndex();
                //System.out.println(fecha);
                crearTarea(nombre, fecha, prioridad,nombreProyecto);
            }
        });
    }
    
    
    private Proyecto obtenerProyecto(String nombreProyecto){
         
        
        for(Proyecto proyecto :proyectos){
            if(nombreProyecto.equalsIgnoreCase(proyecto.getNombre())){
               //si hay un proyecto con el mismo nombre, retorna ese proyecto.
               return proyecto;
            }
        }
        //si no hay un proyecto con el mismo nombre se crea uno y se agregaa la lista
       int ultimoId=0;
        if(!proyectos.isEmpty())
            ultimoId= proyectos.size()-1;
        
        ultimoId+=1;
        Proyecto  nuevoProyecto=new Proyecto();
        nuevoProyecto.setIdProyecto(ultimoId);
        nuevoProyecto.setNombre(nombreProyecto);
        proyectos.add(nuevoProyecto);
        return nuevoProyecto;

    }
    //este metodo podria estar en la vista y recibir los parametros con los datos para que sea llamado solamente desde el controlador
    private void agregarFila(Tarea nuevaTarea,String nombreProyecto)
    {
      //  mainFrame.agregarDatosTabla(0, nombreProyecto, nombreProyecto, 0, nombreProyecto, true);
        
    }
    
    public String crearTarea(String nombre,String fecha,int prioridad,String nombreProyecto){
      
        if(!nombre.isBlank()&&!fecha.isBlank()){
            
            Proyecto proyecto=obtenerProyecto(nombreProyecto);
            int ultimoId= proyecto.obtenerUltimoIdTarea()+1;
            Tarea nuevaTarea= new Tarea(ultimoId, nombre, fecha, prioridad);
            proyecto.agregarTarea(nuevaTarea);
            agregarFila(nuevaTarea,proyecto.getNombre());
        
           
            return "Se ha creado una nueva tarea";
       }
       return "No se ha podido crear la tarea";
    }
    
    
}
