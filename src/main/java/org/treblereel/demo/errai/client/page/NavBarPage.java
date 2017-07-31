package org.treblereel.demo.errai.client.page;

import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
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
@Page(path = "navbar")
public class NavBarPage {

    @Inject
    @DataField
    MaterialNavSection navSection;

    @PostConstruct
    public void init() {
        navSection.addSelectionHandler(selectionEvent -> MaterialToast.fireToast(selectionEvent.getSelectedItem() + " Selected Index"));
    }
}
