package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ioc.client.api.LoadAsync;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 4/4/17.
 */
@LoadAsync
@Templated
@Page(path = "buttons")
public class ButtonPage {

    @Inject
    @DataField
    private MaterialButton btnClick, btnHover, btnDoubleClick;

    @EventHandler("btnClick")
    void onClick(ClickEvent e) {
        MaterialToast.fireToast("Click Triggered");
        btnClick.setText("Clicked");
    }

    @EventHandler("btnHover")
    void onHover(MouseOverEvent e) {
        MaterialToast.fireToast("Hover Triggered");
        btnHover.setText("Hovered");
    }

    @EventHandler("btnDoubleClick")
    void onDoubleClick(DoubleClickEvent e) {
        MaterialToast.fireToast("Double Click Triggered");
        btnDoubleClick.setText("Double Clicked");
    }

}
