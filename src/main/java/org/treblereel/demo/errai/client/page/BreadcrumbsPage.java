package org.treblereel.demo.errai.client.page;

import com.google.gwt.user.client.ui.Composite;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/16/17.
 */
@Singleton
@Templated("#root")
@Page(path = "breadcrumbs")
public class BreadcrumbsPage extends Composite {
}
