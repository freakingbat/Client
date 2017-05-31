/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.alee.laf.label.WebLabel;
import diets.objects.DietBase;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;

/** 
 * Этот класс - содержимое раздела диет
 * @author Pro
 */
public class DescrpDiets extends JPanel {
    
    DescrpDiets(){
        JPanel d_diet = new JPanel();
        int j = 0; 
        d_diet.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        d_diet.setBackground( new Color ( 235, 252, 224) );
        
        JButton button_new = new JButton("Добавить");
    button_new.addActionListener((ActionEvent e) -> {
       
        try {
            
            new AddDiet();
//            List<DietBase> dietBase = Service.getDataService().getDietBases();
//            for(int i = 0; i<dietBase.size(); i++ ){
//                String name = "<html><h3>"+dietBase.get(i).getName()+"</h3><br>"+dietBase.get(i).getText();
//                
//                j+=1;
//                addComponent(c,1, 1, j);
//                c.insets = new Insets(0,0,0,0);
//                d_diet.add(textDiets(name), c);
//                
//
//            }
            
        } catch (IOException ex) {
            Logger.getLogger(DescrpDiets.class.getName()).log(Level.SEVERE, null, ex);
        }
        } /**
         * Этот метод вызывает окно меню при нажатии кнопки
         */ ); 
                addComponent(c,1, 1, 0);
                c.insets = new Insets(0,0,0,0); 
                d_diet.add(button_new, c);
    
        try {
            List<DietBase> dietBase = Service.getDataService().getDietBases();
            for(int i = 0; i<dietBase.size(); i++ ){
                String name = "<html><h3>"+dietBase.get(i).getName()+"</h3><br>"+dietBase.get(i).getText();
                
                
                addComponent(c,1, 1, i+1);
                c.insets = new Insets(0,0,0,0);
                d_diet.add(textDiets(name), c);
                

            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(DescrpDiets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.add(d_diet);
    
     }
     
     public void addComponent(GridBagConstraints c, int height, int gx, int gy) { 
      c.anchor = GridBagConstraints.CENTER;
      c.fill = GridBagConstraints.NONE;
      c.gridheight = height;
      c.gridwidth = GridBagConstraints.REMAINDER;
      c.gridx = gx;
      c.gridy = gy;
      c.weightx = 0;
      c.weighty = 0; 
            } 
    
    public static WebLabel textDiets(String string){
       
        
        final WebLabel shop_name = new WebLabel ( string , WebLabel.CENTER );
        shop_name.setBackground(new Color (235, 252, 224));
        shop_name.setMaximumWidth(350); 
      
        return(shop_name);
    }
    
}
