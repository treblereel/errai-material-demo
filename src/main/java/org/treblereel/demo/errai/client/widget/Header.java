package org.treblereel.demo.errai.client.widget;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavSection;
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

    @Inject
    @DataField
    Div container;

    @Inject
    SideNav sideNav;

    @PostConstruct
    protected void init() {
       MaterialNavBar materialNavBar = new MaterialNavBar();
        materialNavBar.setBackgroundColor(Color.BLUE);
/*
        materialNavBar.setActivates("mysidebar");
*/
        container.add(materialNavBar);

        MaterialNavSection materialNavSection = new MaterialNavSection();
        materialNavSection.setTextAlign(TextAlign.RIGHT);
        materialNavBar.add(materialNavSection);

        MaterialTooltip materialTooltip = new MaterialTooltip();

        MaterialLink materialLink = new MaterialLink();
        materialLink.setIconType(IconType.MERGE_TYPE);
        materialLink.setTextColor(Color.WHITE);
        materialTooltip.add(materialLink);
        materialNavSection.add(materialTooltip);


        materialTooltip.setText("Starter");


    }

}
