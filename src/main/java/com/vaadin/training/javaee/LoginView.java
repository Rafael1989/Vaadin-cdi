package com.vaadin.training.javaee;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.vaadin.cdi.annotation.RouteScopeOwner;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SuppressWarnings("serial")
public class LoginView extends VerticalLayout implements ILogin, View {

	@Inject
        @RouteScopeOwner(LoginRouteAdapter.class)
	private LoginPresenter presenter;

	public LoginView() {
		setSizeFull();

		final FormLayout form = new FormLayout();
		form.setSizeUndefined();
		addComponent(form);
		setComponentAlignment(form, Alignment.MIDDLE_CENTER);

		final TextField name = new TextField("Username");
		form.addComponent(name);

		final PasswordField password = new PasswordField("Password");
		form.addComponent(password);

		final Button login = new Button("Login");
		login.addStyleName(ValoTheme.BUTTON_PRIMARY);
		login.setClickShortcut(KeyCode.ENTER);
		form.addComponent(login);
		login.addClickListener(event -> presenter.login(name.getValue(), password.getValue()));
	}

	@PostConstruct
	private void init() {
		presenter.setView(this);
	}

	@Override
	public void showError(String error) {
		Notification.show(error, Type.ERROR_MESSAGE);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
