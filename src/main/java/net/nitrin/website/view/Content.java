package net.nitrin.website.view;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import net.nitrin.website.view.skills.Skills;

public class Content extends VerticalLayout {

    public Content() {
        H2 headline = new H2("Über mich");
        Span text = new Span("Hey, ich bin Mats, ich programmiere gerne und liebe es mit PCs zu arbeiten. Mein Traum ist es in der Branche zu arbeiten und mich um Netzwerke und Server zu kümmern! Mein Leben dreht sich um Computer und mein Motorrad. Ansonsten treffe ich mich mit Freunden und genieße das Leben!");

        setAlignItems(Alignment.CENTER);

        H2 progressHeadline = new H2("Fortschritt der Seite");
        ProgressBar progressBar = new ProgressBar();
        progressBar.setValue(0.35);
        progressBar.setWidth("50%");
        progressBar.getStyle().set("padding-bottom", "5rem");

        add(progressHeadline, progressBar, headline, text, new Skills());
    }
}
