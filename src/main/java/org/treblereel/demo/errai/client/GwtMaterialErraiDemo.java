package org.treblereel.demo.errai.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.treblereel.demo.errai.client.widget.Footer;
import org.treblereel.demo.errai.client.widget.Header;
import org.treblereel.demo.errai.client.widget.Main;
import org.treblereel.demo.errai.client.widget.SideNav;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@EntryPoint
public class GwtMaterialErraiDemo extends Composite {

    @Inject
    private Navigation navigation;

    @Inject
    private Header header;

    @Inject
    private SideNav sideNav;

    @Inject
    private Main content;

    @Inject
    private Footer footer;

    @PostConstruct
    protected void init() {

        content.getContainer().add(navigation.getContentPanel());
        RootPanel.get().add(header);
        RootPanel.get().add(sideNav);
        RootPanel.get().add(content);
        RootPanel.get().add(footer);

    }
}
