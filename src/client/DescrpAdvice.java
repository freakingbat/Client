/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.alee.laf.label.WebLabel;
import static client.DescrpGym.textGym;
import static client.DescrpVegShops.textShops;
import diets.objects.Advice;
import diets.objects.Shop1;
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
 * Этот класс - содержимое раздела советов
 * @author Pro
 */
public class DescrpAdvice extends JPanel {
    public DescrpAdvice(){
        
    JPanel d_advice = new JPanel();
         
        d_advice.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        d_advice.setBackground( new Color ( 235, 252, 224) );
        
        
    JButton button_new = new JButton("Добавить");
    button_new.addActionListener(new ActionListener() {
         @Override
      /**
      * Этот метод вызывает окно меню при нажатии кнопки
      */
         public void actionPerformed(ActionEvent e) {
             try {
                 new AddAdvice();
             } catch (IOException ex) {
                 Logger.getLogger(DescrpAdvice.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         }
     }); 
        
                  addComponent(c,1, 1, 0);
                c.insets = new Insets(0,0,0,0); 
                d_advice.add(button_new, c);
    
        try {
            List<Advice> advice = Service.getDataService().getAdvice();
            for(int i = 0; i<advice.size(); i++ ){
                String name = advice.get(i).getAdvice();
                
                
                addComponent(c,1, 1, i+1);
                c.insets = new Insets(0,0,0,0);
                d_advice.add(textAdv(name), c);
                

            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(DescrpDiets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.add(d_advice);
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
    
    public static WebLabel textAdv(String string){
       
        
        final WebLabel shop_name = new WebLabel ( string , WebLabel.CENTER );
        shop_name.setBackground(new Color (235, 252, 224));
        shop_name.setMaximumWidth(350);
      
        return(shop_name);
    }
}
