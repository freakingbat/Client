
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;


import com.alee.laf.WebLookAndFeel;
import com.alee.laf.tabbedpane.TabbedPaneStyle;
import com.alee.laf.tabbedpane.WebTabbedPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import layout.TableLayout;
 
/**
 * Этот класс собирает окно меню
 * @author Pro
 */
public class PageInterface extends JFrame { 

    /**
     * В конструкторе создается панель
     * На ней расположены: страница пользователя и разделы меню
     * @see client.InfoInterface 
     */
    public PageInterface(){
        super("Начни сегодня!");
    WebLookAndFeel.install ();
    JPanel page = new JPanel();
    page.setBackground(new Color(235, 252, 224));
    setDefaultCloseOperation( EXIT_ON_CLOSE );
    
    WebTabbedPane tabbedPane3 = new WebTabbedPane ();
    tabbedPane3.setBackground(new Color (212,252,184 ) );
    tabbedPane3.setTabbedPaneStyle ( TabbedPaneStyle.attached );
    tabbedPane3.setPreferredSize ( new Dimension (420, 500) ); 
    tabbedPane3.setTabPlacement ( WebTabbedPane.NORTH);
   
    setupTabbedPane ( tabbedPane3 );
        
    double [][] size_page = { {TableLayout.PREFERRED, TableLayout.PREFERRED}, 
                         {TableLayout.PREFERRED }
                            };
   
   page.setLayout(new TableLayout(size_page));
   
  
   InfoInterface info1 = new InfoInterface();

   page.add(info1, "0,0");
   page.add(tabbedPane3, "1,0");
   
   getContentPane().add(page);   
   pack();
   setLocationRelativeTo(null);
        
   setVisible(true);
   setFocusCycleRoot(true);
   setResizable(false);

    //setSize(630,510);
    }
     
    
    /**
     * 
     * @param tabbedPane объект класса JTabbedPane
     * на каждый раздел добавляется панель
     * @see SectionDiets
     * @see SectionRecipes
     * @see SectionFitness
     * @see SectionShops
     * @see SectionAdvices
     * @see SectionExit
     */
      private  void setupTabbedPane ( JTabbedPane tabbedPane )
    {
//        final JPanel panel1 = new JPanel();
//        panel1.setBackground(new Color (235, 252, 224));   
//        final JScrollPane scrollPane1 = new JScrollPane(panel1);
//        scrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        tabbedPane.addTab ("Прогресс" , scrollPane1 );
        
        
        SectionDiets panel2 = new SectionDiets();
        panel2.setBackground(new Color (235, 252, 224));
        GridBagConstraints c = new GridBagConstraints();
        final JScrollPane scrollPane2 = new JScrollPane(panel2);
        scrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        tabbedPane.addTab ( "Диеты", scrollPane2);
        
        
        
        SectionsRecipes panel3 = new SectionsRecipes();
        panel3.setBackground(new Color(235, 252, 224));  
        tabbedPane.addTab ( "Рецепты", panel3 );
        
       
        SectionFitness panel4 = new SectionFitness();
        final JScrollPane scrollPane4 = new JScrollPane(panel4);
        panel4.setBackground(new Color (235, 252, 224));
        scrollPane4.setSize(500, 480);
        scrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);   
        tabbedPane.addTab ( "Фитнес", scrollPane4 );
        
       
        SectionShops panel5 = new SectionShops();
        panel5.setBackground(new Color (235, 252, 224));  
        tabbedPane.addTab ( "Магазины", panel5 );
        
        
        SectionAdvices panel6 = new SectionAdvices();
        final JScrollPane scrollPane6 = new JScrollPane(panel6);
        panel6.setBackground(new Color (235, 252, 224));
        scrollPane6.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane6.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        tabbedPane.addTab ( "Советы", scrollPane6 );
        
        SectionExit panel7 = new SectionExit();
        final JScrollPane scrollPane7 = new JScrollPane(panel7);
        panel7.setBackground(new Color (235, 252, 224));
        scrollPane7.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane7.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        tabbedPane.addTab ("Выход", scrollPane7 ); 
        
    }

      /**
       * 
       * @param c 
       * @param height
       * @param gx
       * @param gy 
       */
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
       
}
