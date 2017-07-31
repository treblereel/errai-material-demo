package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import gwt.material.design.client.constants.FABType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialFAB;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/1/17.
 */
@Singleton
@Templated
@Page(path = "fabs")
public class FabsPage {

    @Inject
    @DataField
    private MaterialFAB fab, btnFABEvent, btnClickOnlyFABEvent;

    @Inject
    @DataField
    private MaterialButton btnOpen, btnClose;


    @PostConstruct
    public void init() {
        btnFABEvent.addOpenHandler(openEvent -> MaterialToast.fireToast("Opened Default FAB"));
        btnFABEvent.addCloseHandler(closeEvent -> MaterialToast.fireToast("Closed Default FAB"));
        btnClickOnlyFABEvent.addOpenHandler(openEvent -> MaterialToast.fireToast("Opened Click Only FAB"));
        btnClickOnlyFABEvent.addCloseHandler(closeEvent -> MaterialToast.fireToast("Closed Click Only FAB"));
        new MaterialFAB().setType(FABType.CLICK_ONLY);
    }

    @EventHandler("btnOpen")
    void onOpen(ClickEvent e) {
        fab.open();
    }

    @EventHandler("btnClose")
    void onClose(ClickEvent e) {
        fab.close();
    }
}
