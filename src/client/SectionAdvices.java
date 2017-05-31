/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.DescrpAdvice;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * Этот класс реализует заполнение раздела меню советы
 * @see diets.objects.DescrpAdvice
 * @author Pro
 */
public class SectionAdvices extends JPanel{
    public SectionAdvices(){
         
    DescrpAdvice adv = new  DescrpAdvice();
    adv.setBackground(new Color (235, 252, 224));

    this.add(adv);
    }
}
