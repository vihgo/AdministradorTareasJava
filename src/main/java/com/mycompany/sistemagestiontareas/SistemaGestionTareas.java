
package com.mycompany.sistemagestiontareas;

import com.mycompany.sistemagestiontareas.vista.MainFrame;
import com.mycompany.sistemagestiontareas.controlador.MainFrameController;

public class SistemaGestionTareas {

    public static void main(String[] args) 
    {
        MainFrame mainFrame= new MainFrame();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
        
        MainFrameController mainFrameController= new MainFrameController(mainFrame);
    
        
    }
}
