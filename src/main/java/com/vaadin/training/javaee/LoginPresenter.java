package com.vaadin.training.javaee;

import javax.enterprise.event.Event;
import javax.inject.Inject;

import com.vaadin.cdi.annotation.RouteScopeOwner;
import com.vaadin.cdi.annotation.RouteScoped;
import com.vaadin.ui.UI;

@RouteScoped
@RouteScopeOwner(LoginRouteAdapter.class)
public class LoginPresenter {

	private ILogin view;

	@Inject
	private Event<LoginEvent> event;

	public void setView(ILogin login) {
		view = login;
	}

	public void login(String user, String pass) {
		if (user.equals("demo") && pass.equals("demo")) {
			event.fire(new LoginEvent(user));
		} else {
			view.showError("Login failed");
		}
	}

}
