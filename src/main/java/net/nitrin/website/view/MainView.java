package net.nitrin.website.view;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.AnchorTarget;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.dom.Style;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import net.nitrin.website.security.SecurityService;

@Route
@Theme(themeFolder = "theme", variant = Lumo.DARK)
@PageTitle("NITRIN | Mats Fischer")
@PWA(name = "Nitrin Application",
        shortName = "Nitrin App",
        description = "This is an production Nitrin application.",
        enableInstallPrompt = false)
public class MainView extends AppLayout {

    public MainView(SecurityService securityService) {
        H1 logo = new H1("NITRIN | Mats Fischer");
        Style logoStyle = logo.getStyle();
        logoStyle.set("margin", "0");

        Anchor linkedIn = new Anchor("https://www.linkedin.com/in/mats-fischer-a97889228/", "LinkedIn", AnchorTarget.BLANK);
        Anchor gitHub = new Anchor("https://github.com/Ativendus", "GitHub", AnchorTarget.BLANK);

        Button user;

        if (securityService.isUserLoggedIn())
            user = new Button("Log out", e -> securityService.logout());
        else
            user = new Button("Log in", e -> UI.getCurrent().getPage().setLocation(new RouterLink("login", LoginView.class).getHref()));

        user.addThemeVariants(ButtonVariant.LUMO_LARGE, ButtonVariant.LUMO_PRIMARY);

        HorizontalLayout header = new HorizontalLayout(logo, linkedIn, gitHub, user);

        header.setPadding(true);
        header.setMargin(true);
        header.setDefaultVerticalComponentAlignment(Alignment.CENTER);
        header.setWidth("100%");
        header.expand(logo);

        addToNavbar(header);

        setContent(new Content());
    }

}
