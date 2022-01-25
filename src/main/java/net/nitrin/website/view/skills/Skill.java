package net.nitrin.website.view.skills;

import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Skill extends VerticalLayout {

    public Skill(String name, String description) {
        setAlignItems(Alignment.CENTER);

        add(new H3(name), new Span(description));
    }
}
