/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.alee.laf.label.WebLabel;
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
 * Этот класс - содержимое раздела магазинов
 * @author Pro
 */
public class DescrpVegShops extends JPanel {
     DescrpVegShops(){
        JPanel d_vshops = new JPanel();
         
        d_vshops.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        d_vshops.setBackground( new Color ( 235, 252, 224) );
        
        JButton button_new = new JButton("Добавить");
    button_new.addActionListener(new ActionListener() {
         @Override
      /**
      * Этот метод вызывает окно меню при нажатии кнопки
      */
         public void actionPerformed(ActionEvent e) {
             try {
                 new AddShopVeg();
             } catch (IOException ex) {
                 Logger.getLogger(DescrpAdvice.class.getName()).log(Level.SEVERE, null, ex);
             }
             
         }
     }); 
                addComponent(c,1, 1, 0);
                c.insets = new Insets(0,0,0,0); 
                d_vshops.add(button_new, c);
    
        try {
            List<Shop1> shop1 = Service.getDataService().getShop1();
            for(int i = 0; i<shop1.size(); i++ ){
                String name = "<html><h3>"+shop1.get(i).getName()+"</h3><br>"+shop1.get(i).getAdress()+"<br>"+shop1.get(i).getDescrip();
                
                
                addComponent(c,1, 1, i+1);
                c.insets = new Insets(0,0,0,0);
                d_vshops.add(textShops(name), c);
                

            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(DescrpDiets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.add(d_vshops);
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
    
    public static WebLabel textShops(String string){
       
        
        final WebLabel shop_name = new WebLabel ( string , WebLabel.CENTER );
        shop_name.setBackground(new Color (235, 252, 224));
        shop_name.setMaximumWidth(350);
      
        return(shop_name);
    }
}
