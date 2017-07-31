package org.treblereel.demo.errai.client.page;

import gwt.material.design.client.ui.MaterialTab;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.PageHiding;
import org.jboss.errai.ui.nav.client.local.PageShowing;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/6/17.
 */
@Singleton
@Templated
@Page(path = "tabs")
public class TabsPage {

    @Inject
    @DataField
    private MaterialTab tab, tab2, eventTab;


    @PageShowing
    private void preparePage() {
        tab2.setTabIndex(1);
        eventTab.addSelectionHandler(selectionEvent -> MaterialToast.fireToast(selectionEvent.getSelectedItem() + " Selected Index"));
    }

    @PageHiding
    private void unpreparePage() {

    }

}
