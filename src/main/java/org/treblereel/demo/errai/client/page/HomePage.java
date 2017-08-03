package org.treblereel.demo.errai.client.page;

import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Singleton;

@Singleton
@Templated("#root")
@Page(path = "home", role = DefaultPage.class)
public class HomePage extends Composite {

}
