package org.treblereel.demo.errai.client.widget;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSideNav;
import gwt.material.design.client.ui.MaterialSideNavDrawer;
import gwt.material.design.client.ui.MaterialSideNavPush;
import gwt.material.design.client.ui.MaterialTooltip;
import gwt.material.design.client.ui.html.Div;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Templated
@Dependent
public class Header extends Composite {

    @DataField
    @Inject
    private MaterialRow root;

    @Inject
    @DataField
    private MaterialNavBar navBar;

    @Inject
    @DataField
    private MaterialHeader header;

    @Inject
    @DataField
    private MaterialSideNavPush sideBar;

    @PostConstruct
    private void init() {

    }

}
