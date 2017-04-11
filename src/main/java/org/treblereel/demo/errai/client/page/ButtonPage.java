package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 4/4/17.
 */
@Templated
@Page(path = "buttons")
public class ButtonPage extends Composite {

    @Inject
    @DataField
    private MaterialButton materialButton;

    @Inject
    Logger logger;


    @PostConstruct
    public void init(){
        materialButton.setBackgroundColor(Color.BROWN_LIGHTEN_1);
        materialButton.setType(ButtonType.RAISED);
        materialButton.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                 logger.warn(" addClickHandler");
            }
        });
    }

}
