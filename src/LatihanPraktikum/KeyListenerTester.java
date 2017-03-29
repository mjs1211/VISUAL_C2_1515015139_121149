/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Jodi
 */
public class KeyListenerTester extends Frame implements KeyListener {
    
    TextField t1;
    Label l1;
    
    public KeyListenerTester(String s){
    super(s);
        Panel p = new Panel();
        l1 = new Label ("Key Listener!");
        p.add(l1);
        add(p);
        
    }
    
}
