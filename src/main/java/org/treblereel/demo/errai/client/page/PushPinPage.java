package org.treblereel.demo.errai.client.page;

import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialPushpin;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.treblereel.demo.errai.client.utils.ThemeManager;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/1/17.
 */
@Singleton
@Templated
@Page(path = "pushpin")
public class PushPinPage {

    @Inject
    @DataField
    private MaterialPanel source;

    @PostConstruct
    public void init(){
        ThemeManager.register(source);
        MaterialPushpin.apply(source, 300.0, 64.0);
    }
}
