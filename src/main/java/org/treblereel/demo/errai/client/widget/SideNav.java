package org.treblereel.demo.errai.client.widget;

import com.google.gwt.user.client.ui.Composite;
import org.treblereel.demo.errai.client.page.*;
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
    Div sidenav;

    @Inject
    TransitionTo<ButtonPage> toButtonPage;

    @Inject
    TransitionTo<BadgesPage> toBadgesPage;

    @Inject
    TransitionTo<DropdownPage> toDropdownPage;

    @Inject
    TransitionTo<BreadcrumbsPage> toBreadcrumbsPage;

    @Inject
    TransitionTo<CollapsiblesPage> toCollapsiblesPage;

    @Inject
    TransitionTo<CollectionsPage> toCollectionsPage;
    @Inject
    TransitionTo<DatePickerPage> toDatePickerPage;


    @PostConstruct
    protected void init() {

        MaterialSideNav materialSideNav = new MaterialSideNav();
        materialSideNav.setWidth("300");
        //materialSideNav.setType(SideNavType.FIXED);
        materialSideNav.setCloseOnClick(false);

        MaterialNavBrand materialNavBrand = new MaterialNavBrand();
        materialNavBrand.setText("Title");
        materialSideNav.add(materialNavBrand);

        MaterialLink badges = new MaterialLink();
        badges.setText("Badges");
        badges.setIconType(IconType.ACCOUNT_BALANCE);
        badges.setIconPosition(IconPosition.LEFT);
        badges.setIconColor(Color.BLUE_GREY);
        badges.addClickHandler( click -> toBadgesPage.go());
        materialSideNav.add(badges);

        MaterialLink breadcrumbs = new MaterialLink();
        breadcrumbs.setText("Breadcrumbs");
        breadcrumbs.setIconType(IconType.NATURE);
        breadcrumbs.setIconPosition(IconPosition.LEFT);
        breadcrumbs.setIconColor(Color.BLUE_GREY);
        breadcrumbs.addClickHandler( click -> toBreadcrumbsPage.go());
        materialSideNav.add(breadcrumbs);

        MaterialLink inbox = new MaterialLink();
        inbox.setText("Buttons");
        inbox.setIconType(IconType.BATTERY_ALERT);
        inbox.setIconPosition(IconPosition.LEFT);
        inbox.setIconColor(Color.BLUE_GREY);
        inbox.addClickHandler( click -> toButtonPage.go());
        materialSideNav.add(inbox);

        MaterialLink datepicker = new MaterialLink();
        datepicker.setText("Datepicker");
        datepicker.setIconType(IconType.DATE_RANGE);
        datepicker.setIconPosition(IconPosition.LEFT);
        datepicker.setIconColor(Color.BLUE_GREY);
        datepicker.addClickHandler( click -> toDatePickerPage.go());
        materialSideNav.add(datepicker);

        MaterialLink dropdown = new MaterialLink();
        dropdown.setText("Dropdown");
        dropdown.setIconType(IconType.FAST_FORWARD);
        dropdown.setIconPosition(IconPosition.LEFT);
        dropdown.setIconColor(Color.BLUE_GREY);
        dropdown.addClickHandler( click -> toDropdownPage.go());
        materialSideNav.add(dropdown);

        MaterialLink collapsibles = new MaterialLink();
        collapsibles.setText("Collapsibles");
        collapsibles.setIconType(IconType.FAST_REWIND);
        collapsibles.setIconPosition(IconPosition.LEFT);
        collapsibles.setIconColor(Color.BLUE_GREY);
        collapsibles.addClickHandler( click -> toCollapsiblesPage.go());
        materialSideNav.add(collapsibles);

        MaterialLink collections = new MaterialLink();
        collections.setText("Collections");
        collections.setIconType(IconType.LABEL_OUTLINE);
        collections.setIconPosition(IconPosition.LEFT);
        collections.setIconColor(Color.BLUE_GREY);
        collections.addClickHandler( click -> toCollectionsPage.go());
        materialSideNav.add(collections);

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

        MaterialLink dune = new MaterialLink();
        dune.setText("DUNE");
        dune.setHref("#dune");
        dune.setIconType(IconType.HOME);
        dune.setIconPosition(IconPosition.LEFT);
        dune.setIconColor(Color.AMBER_LIGHTEN_1);
        materialSideNav.add(dune);

        sidenav.add(materialSideNav);
    }

}

