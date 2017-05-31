/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.DescrpGym;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * Этот класс реализует заполнение раздела меню фитнес
 * @see diets.objects.DescrpGym
 * @author Pro
 */
public class SectionFitness extends JPanel {
    
    public SectionFitness(){
        
        
        DescrpGym g = new  DescrpGym();
        g.setBackground(new Color (235, 252, 224));

        this.add(g);
        
    }
    
}
