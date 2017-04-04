package org.treblereel.demo.errai.client.widget;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.*;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class Footer extends Composite {

    @Inject
    @DataField
    private MaterialFooter footer;

    private MaterialFooterCopyright copyright = new MaterialFooterCopyright();

    @PostConstruct
    protected void init() {
        footer.setBackgroundColor(Color.BLUE);
        footer.add(copyright);

        copyright.setBackgroundColor(Color.BLUE);
        copyright.add(new MaterialLabel("2017 Errai Material Demo"));
    }
}
