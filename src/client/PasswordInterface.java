/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.alee.laf.label.WebLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Этот класс собирает окно восстановления пароля
 * @author Pro
 */
public class PasswordInterface extends JFrame {
    
    public PasswordInterface() throws IOException{
        super("Восстановление пароля");
      
    JPanel pass = new JPanel();
    pass.setBackground( new Color (255, 255, 255) );
    pass.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
   
    WebLabel text_mail = new WebLabel("Введите почту:");
    final JTextField field_mail = new JTextField(20);
    
    JButton button_finish = new JButton("Восстановить"){
              @Override
              public Dimension getPreferredSize(){
              return new Dimension(100,30);
              }
          };
    button_finish.addActionListener(new ActionListener() {
        /**
         * Этот метод вызывает окно входа при нажатии кнопки
         * @param e 
         */
        public void actionPerformed(ActionEvent e) {
            try {
                new EnterInterface();
            } catch (IOException ex) {
                Logger.getLogger(PasswordInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
          setVisible(false);
         }
        }); 
    addComponent(c,1, 1, 1);
    c.insets = new Insets(0,0,0,0);
    pass.add(text_mail, c);
   
    addComponent(c,1, 1, 2);
    c.insets = new Insets(5,0,0,0);
    pass.add(field_mail, c);
   
    addComponent(c,1, 1, 3);
    c.insets = new Insets(5,0,0,0);
    pass.add(button_finish, c);
    
    getContentPane().add(pass); 
        
    pack();
    setLocationRelativeTo(null);
         
    setVisible(true);
    setSize(400,400);
    
          }
    
    public final void addComponent(GridBagConstraints c, int height, int gx, int gy) { 
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
