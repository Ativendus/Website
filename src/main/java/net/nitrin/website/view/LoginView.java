package net.nitrin.website.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;

@Route("login")
@PageTitle("Login | NITRIN")
public class LoginView extends VerticalLayout implements HasUrlParameter<String> {

    private final LoginForm login = new LoginForm();

    public LoginView(){
        addClassName("login-view");
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        login.setForgotPasswordButtonVisible(false);
        login.setAction("login");

        add(new H1("NITRIN INTERFACE"), login);
    }

    @Override
    public void setParameter(BeforeEvent event, @OptionalParameter String parameter) {
        if(event.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")) {
            login.setError(true);
        }
    }
}
