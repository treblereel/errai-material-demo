package org.treblereel.demo.errai.client.widget;

import com.google.gwt.user.client.ui.Composite;
import org.treblereel.demo.errai.client.page.ButtonPage;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconPosition;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.SideNavType;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBrand;
import gwt.material.design.client.ui.MaterialSideNav;
import gwt.material.design.client.ui.html.Div;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class SideNav extends Composite {

    @Inject
    @DataField
    Div container;

    @Inject
    TransitionTo<ButtonPage> toButtonPage;


    @PostConstruct
    protected void init() {

        MaterialSideNav materialSideNav = new MaterialSideNav();
        materialSideNav.setWidth("300");
        materialSideNav.setType(SideNavType.FIXED);
        materialSideNav.setCloseOnClick(false);

        MaterialNavBrand materialNavBrand = new MaterialNavBrand();
        materialNavBrand.setText("Title");
        materialSideNav.add(materialNavBrand);

        MaterialLink inbox = new MaterialLink();
        inbox.setText("Buttons");
        inbox.setIconType(IconType.BATTERY_ALERT);
        inbox.setIconPosition(IconPosition.LEFT);
        inbox.setIconColor(Color.BLUE_GREY);
        inbox.addClickHandler( click -> toButtonPage.go());


        materialSideNav.add(inbox);

        MaterialLink simple = new MaterialLink();
        simple.setText("SIMPLE");
        simple.setHref("#simple");
        simple.setIconType(IconType.SATELLITE);
        simple.setIconPosition(IconPosition.LEFT);
        simple.setIconColor(Color.BLUE_GREY);
        materialSideNav.add(simple);

        MaterialLink home = new MaterialLink();
        home.setText("HOME");
        home.setHref("#home");
        home.setIconType(IconType.HOME);
        home.setIconPosition(IconPosition.LEFT);
        home.setIconColor(Color.BLUE_GREY);
        materialSideNav.add(home);

        container.add(materialSideNav);
    }

}

