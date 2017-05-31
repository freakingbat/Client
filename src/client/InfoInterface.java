/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
  

import com.alee.laf.label.WebLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Этот класс собирает страницу пользователя 
 * в окне меню
 * @author Pro
 */
public class InfoInterface extends JPanel {
    
    public InfoInterface(){
    
    JPanel info = new JPanel();    
    info.setPreferredSize ( new Dimension ( 220, 450 ) );
    info.setBackground( new Color ( 255, 255, 255 ) );
    info.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    final WebLabel user_name = new WebLabel ( "<Фамилия> <Имя>", WebLabel.CENTER );
    String kg = new String("<...>");
    
    String[] diets_variants = new String[] { "Японская диета", "Диета на 9 дней", "Французская гранатовая диета",
        "Кефирная диета с сухофруктами", "Апельсиновая диета ", "Творожная диета с яблоками",
        "Творожная диета с кефиром", "Диета 6 лепестков"};
          
         JComboBox combo = new JComboBox(diets_variants){
              public Dimension getPreferredSize(){
              return new Dimension(200,40);
              }
          }; 
//       combo.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//        String s = (String) combo.getSelectedItem();
//
//        switch (s) {
//            case "Японская диета":
//                
//                break;
//            case "Диета на 9 дней":
//               
//                break;
//            case  "Французская гранатовая диета":
//                
//                break;
//            case  "Кефирная диета с сухофруктами":
//                
//                break;
//                
//            case  "Творожная диета с яблоками":
//                
//                break;
//                
//             case  "Диета 6 лепестков":
//                
//                break;
//            }
//        }
//    });
    String city1 = new String("<...>");
    String day = new String("<...>");
    final WebLabel weight = new WebLabel ( "Вес при регистрации: "+ kg, WebLabel.CENTER );
    final WebLabel diet = new WebLabel ( "Диета: ", WebLabel.CENTER );
    final WebLabel city = new WebLabel ( "Город: "+city1, WebLabel.CENTER );
    final WebLabel day_of_diet = new WebLabel ( "День диеты: "+ day, WebLabel.CENTER );
    final WebLabel l4 = new WebLabel ( "Страница пользователя" );
    l4.setDrawShade(true);

    JLabel imageLabel = new JLabel(new ImageIcon("healthy.png"));
      
    addComponent(c,1, 0, 1);
    c.insets = new Insets(0,0,0,0);
    info.add(user_name, c);
    
    addComponent(c,1, 0, 2);
    c.insets = new Insets(0,0,0,0);
    info.add(weight, c);
    
    
    addComponent(c,1, 0, 4);
    c.insets = new Insets(0,0,0,0); 
    info.add(diet, c);
    
    addComponent(c,1, 0, 5);
    c.insets = new Insets(5,5,5,5); 
    info.add(combo, c);
    
    addComponent(c,1, 0, 6);
    c.insets = new Insets(0,0,0,0);
    info.add(day_of_diet, c);
    
    addComponent(c,1, 0, 7);
    c.insets = new Insets(0,0,0,0);
    info.add(city, c);
    
     addComponent(c,1, 0, 0);
    c.insets = new Insets(30,0,30,0);
    info.add(imageLabel, c);
   
    this.setBackground( new Color ( 255, 255, 255 ) );
    this.add(info);
    }
    
    
    public void addComponent(GridBagConstraints c, int height, int gx, int gy) { 
      c.anchor = GridBagConstraints.NORTHWEST;
      c.fill = GridBagConstraints.NONE;
      c.gridheight = height;
      c.gridwidth = GridBagConstraints.REMAINDER;
      c.gridx = gx;
      c.gridy = gy;
      c.weightx = 0;
      c.weighty = 0; 
            } 
       
}
