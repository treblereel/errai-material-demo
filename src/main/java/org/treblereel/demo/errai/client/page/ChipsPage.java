package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.material.design.client.ui.MaterialChip;
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
 *         Created by treblereel on 5/18/17.
 */
@Singleton
@Templated
@Page(path = "chips")
public class ChipsPage {

    @Inject
    @DataField
    private MaterialChip chip, chipClick;

    @PostConstruct
    public void init() {
        chip.getIcon().addClickHandler(event -> MaterialToast.fireToast(chip.getText()));
    }

    @EventHandler("chipClick")
    private void onClickChip(ClickEvent e) {
        MaterialToast.fireToast("You clicked me");
    }
}
