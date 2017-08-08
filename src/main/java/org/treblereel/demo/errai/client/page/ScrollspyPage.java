package org.treblereel.demo.errai.client.page;

import gwt.material.design.client.ui.MaterialPushpin;
import gwt.material.design.client.ui.MaterialScrollspy;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/6/17.
 */
@Singleton
@Templated("#root")
@Page(path = "scrollspy")
public class ScrollspyPage {

    @Inject
    @DataField
    MaterialScrollspy scrollspy;


    @PostConstruct
    public void init(){
        MaterialPushpin.apply(scrollspy, 00.0, 32.0);
    }
}
