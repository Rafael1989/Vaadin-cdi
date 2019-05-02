/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaadin.training.javaee;

import com.vaadin.flow.router.Route;
import com.vaadin.mpr.MprRouteAdapter;

/**
 *
 * @author User
 */
@Route("login")
class LoginRouteAdapter extends MprRouteAdapter<LoginView>{

    public LoginRouteAdapter() {
        setSizeFull();
    }
    
}
