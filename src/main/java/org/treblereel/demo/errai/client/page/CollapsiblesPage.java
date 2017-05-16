package org.treblereel.demo.errai.client.page;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.MaterialCollapsible;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/16/17.
 */
@Templated("#root")
@Page(path = "collapsibles")
public class CollapsiblesPage extends Composite {

    @PostConstruct
    public void init(){
    }
}
