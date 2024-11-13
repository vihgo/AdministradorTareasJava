/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestiontareas.controlador;

import com.mycompany.sistemagestiontareas.modelo.Proyecto;
import com.mycompany.sistemagestiontareas.modelo.Task;
import com.mycompany.sistemagestiontareas.vista.MainFrame;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author melipilla
 */
public class MainFrameController {
    private ArrayList<Proyecto> proyectos;
    private MainFrame mainFrame;
    public MainFrameController(){
        proyectos= new ArrayList();
    }
    public MainFrameController(MainFrame mainFrame){
        this.mainFrame=mainFrame;
        proyectos= new ArrayList();
    }
    
    
    private void agregarListeners(){
        mainFrame.getRbProyectoNo().addActionListener(new ActionListener(){ 
            @Override
             public void actionPerformed(ActionEvent e) {
                mainFrame.getLblProyecto().setVisible(false);
                mainFrame.getTxtNombreProyecto().setText("");
                mainFrame.getTxtNombreProyecto().setVisible(false);
            }
        });
        mainFrame.getRbProyectoSi().addActionListener(new ActionListener(){ 
            @Override
             public void actionPerformed(ActionEvent e) {
                mainFrame.getLblProyecto().setVisible(true);
                mainFrame.getTxtNombreProyecto().setVisible(true);
            }
        });
        
        mainFrame.getBtnAgregar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre= mainFrame.getTxtNombreTarea().getText();
                String fecha= mainFrame.getFtxtFechaLimite().getText();
                int prioridad=  mainFrame.getCmbPrioridad().getSelectedIndex();
                System.out.println(fecha);
                crearTarea(nombre, fecha, prioridad);
            }
        });
    }
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
    
    public String crearTarea(String nombre,String fecha,int prioridad){
      
        if(!nombre.isBlank()&&!fecha.isBlank()){
            Task nuevaTarea= new Task(1, nombre, fecha, prioridad);
            
            
           
        
           
            return "Se ha creado una nueva tarea";
       }
       return "No se ha podido crear la tarea";
    }
    private void agregarFila(Task nuevaTarea){
        DefaultTableModel modelo = (DefaultTableModel) mainFrame.getTbTareas().getModel();
           
            // Agregar filas al modelo de la tabla
            
            modelo.addRow(new Object[]{nuevaTarea.getIdTask(), 
                nuevaTarea.getNombre(), nuevaTarea.getFechaLimite(),
                nuevaTarea.getPrioridad(),nuevaTarea.isCompletada()});
        
    }
    
}
