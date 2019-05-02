/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.training.javaee;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.core.MprTheme;
import com.vaadin.ui.Notification;
import javax.enterprise.event.Observes;
/**
 *
 * @author User
 */
@MprTheme
@SuppressWarnings("serial")
@Route("")
public class EntryPoint extends Div{
    
    private void login(@Observes LoginEvent event){
        Notification.show("Login succesful! Welcome "+event.getUser());
        UI.getCurrent().navigate("main");
    }

    @Override
    protected void onAttach(AttachEvent attachEvent) {
        super.onAttach(attachEvent); 
        attachEvent.getUI().navigate("login");
    }
    
    
}
