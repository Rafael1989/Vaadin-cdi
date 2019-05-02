package com.vaadin.training.javaee;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Solution to the bonus task
 *
 * @author Vaadin Ltd
 *
 */
@SuppressWarnings("serial")
public class MainView extends VerticalLayout implements View {

	public MainView() {
		setSizeFull();
		Label label = new Label("main view");
		label.addStyleName(ValoTheme.LABEL_H1);
		label.setSizeUndefined();
		addComponent(label);
		setComponentAlignment(label, Alignment.MIDDLE_CENTER);
	}

	@Override
	public void enter(ViewChangeEvent event) {
	}
}
