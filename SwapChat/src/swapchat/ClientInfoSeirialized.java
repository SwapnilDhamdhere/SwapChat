/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapchat;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class ClientInfoSeirialized implements Serializable {
    
    private final static long serialVersionUID = 1;
    
    String name;
    
    String group;
    
    String msg;
    
    String recipient;
    
    boolean showOnline;
    
}
