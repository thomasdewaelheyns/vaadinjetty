package com.vaadinjetty.testproject;

import com.vaadin.flow.server.VaadinServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

/**
 * Created by Thomas on 31/01/2020.
 */
@WebServlet(name = "Vaadin test app", value = { "/app/*"}, asyncSupported = true)
public class VaadinAppServlet extends VaadinServlet {

    @Override
    protected void servletInitialized() throws ServletException {
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
