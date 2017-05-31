
package client;

import com.alee.laf.tabbedpane.TabbedPaneStyle;
import com.alee.laf.tabbedpane.WebTabbedPane;
import client.DescrpBeverages;
import client.DescrpDeserts;
import client.DescrpMain;
import client.DescrpMeat;
import client.DescrpSoup;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
/** 
 * Этот класс реализует заполнение раздела меню рецепты
 * @author Pro
 */
public class SectionsRecipes extends JPanel {
    
    /**
     * В конструкторе собирается подменю раздела рецептов
     */
    public SectionsRecipes(){
    
    WebTabbedPane sections = new WebTabbedPane ();
    sections.setBackground(new Color (212,252,184) );
    sections.setTabbedPaneStyle ( TabbedPaneStyle.attached );
    sections.setPreferredSize ( new Dimension ( 420, 470 ) );
    sections.setTabPlacement ( WebTabbedPane.NORTH);
    setupTabbedPaneSections ( sections );
    this.add(sections);
    }
    /**
     * Этот метод создает разделы рецептов
     * @param sections  объект класса WebTabbedPane
     * @see diets.objects.DescrpDeserts
     * @see diets.objects.DescrpBeverages
     * @see diets.objects.DescrpMain
     * @see diets.objects.DescrpSoup
     * @see diets.objects.DescrpMeat
     */
    private static void setupTabbedPaneSections(WebTabbedPane sections) {
        
        final JPanel panel1 = new JPanel();
        panel1.setBackground(new Color (235, 252, 224));  
        DescrpDeserts d = new  DescrpDeserts();
        d.setBackground(new Color (235, 252, 224));
        panel1.add(d);
        final JScrollPane scrollPane1 = new JScrollPane(panel1);
        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sections.addTab ( "Десерты", scrollPane1 );
       
        final JPanel panel2 = new JPanel();
        panel2.setBackground(new Color (235, 252, 224));   
        DescrpMeat m = new  DescrpMeat();
        m.setBackground(new Color (235, 252, 224));
        panel2.add(m);
        final JScrollPane scrollPane2 = new JScrollPane(panel2);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sections.addTab ( "Мясные блюда", scrollPane2 );
        
        final JPanel panel3 = new JPanel();
        panel3.setBackground(new Color (235, 252, 224));
        DescrpBeverages b = new  DescrpBeverages();
        b.setBackground(new Color (235, 252, 224));
        panel3.add(b);
        final JScrollPane scrollPane3 = new JScrollPane(panel3);
        scrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sections.addTab ( "Напитки", scrollPane3 );
       
        final JPanel panel4 = new JPanel();
        panel4.setBackground(new Color (235, 252, 224)); 
        DescrpMain main = new  DescrpMain();
        main.setBackground(new Color (235, 252, 224));
        panel4.add(main);
        final JScrollPane scrollPane4 = new JScrollPane(panel4);
        scrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sections.addTab ( "Гарниры", scrollPane4 );
       
        final JPanel panel5 = new JPanel();
        panel5.setBackground(new Color (235, 252, 224));   
        DescrpSoup s = new  DescrpSoup();
        s.setBackground(new Color (235, 252, 224));
        panel5.add(s);
        final JScrollPane scrollPane5 = new JScrollPane(panel5);
        scrollPane5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane5.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sections.addTab ( "Супы", scrollPane5 );
        
    }
    
}
 