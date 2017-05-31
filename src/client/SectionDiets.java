/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.DescrpDiets;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * Этот класс реализует заполнение раздела диеты
 * @see diets.objects.DescrpDiets
 * @author Pro
 */
public class SectionDiets extends JPanel {
    public SectionDiets(){
    
        DescrpDiets diets = new  DescrpDiets();
        diets.setBackground(new Color (235, 252, 224));
        
        this.add(diets);
        
    }
   
}
