/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.controlador;

import com.mycompany.sistemagestiontareas.modelo.AdministradorListaProyectos;
import com.mycompany.sistemagestiontareas.modelo.Proyecto;
import com.mycompany.sistemagestiontareas.modelo.ProyectoDao;
import com.mycompany.sistemagestiontareas.modelo.Tarea;

import com.mycompany.sistemagestiontareas.vista.MainFrame;
import java.util.ArrayList;
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
    private ProyectoDao proyectoDao;
    
    public MainFrameController(){
        proyectos= new ArrayList();
        proyectoDao= new AdministradorListaProyectos();
    }
    public MainFrameController(MainFrame mainFrame){
        this.mainFrame=mainFrame;
        proyectos= new ArrayList();
        proyectoDao= new AdministradorListaProyectos();
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
                Proyecto nuevoProyecto=proyectoDao.crearProyecto(nombreProyecto);
                Tarea nuevaTarea= nuevoProyecto.agregarTarea(nombre, fecha, prioridad);
                mainFrame.agregarDatosTabla(nuevaTarea.getPrioridad(), nuevaTarea.getNombre(), nuevaTarea.getFechaLimite(), nuevaTarea.getPrioridad(), nuevoProyecto.getNombre(), nuevaTarea.isCompletada());
                
                
                
            }
        });
    }
    
    
    
    
}
