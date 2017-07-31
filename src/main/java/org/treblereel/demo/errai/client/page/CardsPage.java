package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/18/17.
 */
@Templated
@Page(path = "cards")
public class CardsPage {

    @Inject
    @DataField
    private MaterialRow rowCards;

    @Inject
    @DataField
    private MaterialButton btnShow;

    @EventHandler("btnShow")
    void onShow(ClickEvent e) {
        MaterialAnimator.animate(Transition.SHOW_GRID, rowCards, 0);
    }
}
