package net.nitrin.website.view.skills;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Skills extends VerticalLayout {

    public Skills() {
        H2 headline = new H2("Skills");
        headline.getStyle().set("padding-top", "5rem");
        VerticalLayout skills = new VerticalLayout(
                new HorizontalLayout(new Skill("Java", "Java ist meine stärkste Programmiersprache, sie beherrsche ich am meisten und mit ihr habe ich die meiste Erfahrung. Mindestens 7 Jahre Erfahrung bringe ich dort mit!"),
                        new Skill("Python", "Basiert auf Schulwissen, nicht viel aber auch nicht wenig, ein gutes Mittelmaß"),
                        new Skill("C#", "Angefangen zu lernen und einige Projekte mit C# umgesetzt, jedoch fühle ich mich nicht so sicher wie bei Java")),
                new HorizontalLayout(new Skill("Git", "Nutze ich um einige Projekte local über Gitlab zu speichern"),
                        new Skill("Cloud", "Hetzner Cloud und Azure habe ich bereits genutzt, jedoch nicht so viel"),
                        new Skill("Datenbank", "MySQL, Redis  und MongoDB sind die Datenbanken, die ich benutzt habe. Ich präferiere jedoch NonSQL Datenbanken, wodurch ich SQL nicht ganz beherrsche!")),
                new HorizontalLayout(new Skill("Terminal", "Ich beherrsche hier nur die nötigen Befehle, gerade in Linux, da ich viel mit einer SSH-Connection arbeiten muss"),
                        new Skill("Linux", "Ist mein Goto Betriebssystem wenn ich programmiere oder für einen Server"),
                        new Skill("Windows", "Benutze ich am häufigsten für Gaming oder alles was ich sonst mit Linux nicht machen kann")));
        skills.setPadding(true);
        skills.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.STRETCH);
        skills.setWidth("100%");
        setAlignSelf(Alignment.CENTER, headline);
        add(headline, skills);
    }
}
