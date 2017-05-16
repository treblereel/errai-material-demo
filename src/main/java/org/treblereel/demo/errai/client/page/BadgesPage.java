package org.treblereel.demo.errai.client.page;

import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/16/17.
 */
@Templated("#root")
@Page(path = "badges")
public class BadgesPage extends Composite {

    @Inject
    Logger logger;

    public BadgesPage(){
        //logger.warn("BadgesPage");
    }

    @PostConstruct
    public void init(){

    }
}
