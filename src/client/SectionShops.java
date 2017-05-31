/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.alee.laf.tabbedpane.TabbedPaneStyle;
import com.alee.laf.tabbedpane.WebTabbedPane;
import client.DescrShops;
import client.DescrpVegShops;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Этот класс реализует заполнение раздела меню магазины
 * @author Pro
 */
public class SectionShops extends JPanel{
    
    /**
     * В конструкторе собирается подменю раздела магазинов
     */
    public SectionShops(){

    WebTabbedPane sections = new WebTabbedPane ();
    sections.setBackground(new Color (212,252,184) );
    sections.setTabbedPaneStyle ( TabbedPaneStyle.attached );
    sections.setPreferredSize ( new Dimension ( 420, 470 ) );
    sections.setTabPlacement ( WebTabbedPane.NORTH);
    setupTabbedPaneSections ( sections );
    this.add(sections);
    }
    /**
     * Этот метод создает разделы подменю
     * @param sections объект класса WebTabbedPane
     * @see diets.objects.DescrpVegShops
     * @see diets.objects.DescrShops
     */
     private static void setupTabbedPaneSections(WebTabbedPane sections) {
         
        final JPanel panel1 = new JPanel();
        panel1.setBackground(new Color (235, 252, 224));
        DescrShops d1 = new  DescrShops();
        d1.setBackground(new Color (235, 252, 224));
        panel1.add(d1 );
        final JScrollPane scrollPane1 = new JScrollPane(panel1);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane1.setBackground(new Color (235, 252, 224)); 
        sections.addTab ( "Магазины правильного питания", scrollPane1 );
        
        final JPanel panel2 = new JPanel();
        panel2.setBackground(new Color (235, 252, 224));
        DescrpVegShops v1 = new  DescrpVegShops();
        v1.setBackground(new Color (235, 252, 224));
        panel2.add(v1);
        final JScrollPane scrollPane2 = new JScrollPane(panel2);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sections.addTab ( "Вегетерианские", scrollPane2 );
        
        
    }
}
