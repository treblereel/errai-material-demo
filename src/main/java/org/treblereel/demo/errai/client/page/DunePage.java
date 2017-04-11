package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialAnchorButton;
import gwt.material.design.client.ui.MaterialCard;
import gwt.material.design.client.ui.MaterialCardImage;
import gwt.material.design.client.ui.MaterialIcon;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 4/5/17.
 */
@Templated("#root")
@Page(path = "dune")
public class DunePage extends Composite {

    @Inject
    Logger logger;

    @Inject
    @DataField
    MaterialCard materialCard;

    @Inject
    @DataField
    MaterialAnchorButton btnPlay;

    @Inject
    @DataField
    MaterialCardImage cardimage;


    @PostConstruct
    public void init(){

        materialCard.setBackgroundColor(Color.RED);

        btnPlay.setBackgroundColor(Color.RED);
        btnPlay.addStyleName("circle");
        btnPlay.setIconType(IconType.ACCESS_ALARM);

        cardimage.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                cardimage.removeFromParent();

                logger.warn("cardimage addClickHandler");
            }
        });

        btnPlay.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                logger.warn("btnPlay addClickHandler");
                cardimage.removeFromParent();

            }
        });

        //btnPlay.setBackgroundColor(Color.YELLOW_ACCENT_2);



    }

}
