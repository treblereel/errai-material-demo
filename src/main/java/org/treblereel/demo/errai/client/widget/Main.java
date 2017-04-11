package org.treblereel.demo.errai.client.widget;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.MaterialContainer;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;

@Templated
public class Main extends Composite {

    @Inject
    @DataField
    private MaterialContainer main;

    public MaterialContainer getContainer() {
        return main;
    }
}
