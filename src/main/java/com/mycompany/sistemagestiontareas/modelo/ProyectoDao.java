/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemagestiontareas.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melipilla
 */
public interface ProyectoDao {
    
    Proyecto crearProyecto(String nombre);
    List obtenerTodosLosProyectos();
    String eliminarProyecto(Proyecto proyecto);
    Proyecto actualizarProyecto(int id,String nombre,ArrayList<Tarea>  tareas);
    
}
