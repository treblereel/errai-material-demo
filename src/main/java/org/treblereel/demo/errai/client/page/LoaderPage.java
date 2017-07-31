package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.Timer;
import gwt.material.design.client.constants.ProgressType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCardContent;
import gwt.material.design.client.ui.MaterialLoader;
import gwt.material.design.client.ui.MaterialNavBar;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/1/17.
 */
@Singleton
@Templated
@Page(path = "loader")
public class LoaderPage {

    @Inject
    @DataField
    private MaterialNavBar navBar;

    @Inject
    @DataField
    private MaterialCardContent cardContent;

    @Inject
    @DataField
    private MaterialButton btnLoader, btnProgress, btnShowLoader, btnShowProgress, btnShowNavBarProgress ;

    @EventHandler("btnLoader")
    void onShowLoaderSpecific(ClickEvent e) {
        MaterialLoader.showLoading(true, cardContent);
        btnProgress.setEnabled(false);
        Timer timer = new Timer() {
            @Override
            public void run() {
                btnProgress.setEnabled(true);
                MaterialLoader.showLoading(false);
            }
        };
        timer.schedule(2000);
    }

    @EventHandler("btnProgress")
    void onShowProgressSpecific(ClickEvent e) {
        MaterialLoader.showProgress(true, cardContent);
        btnLoader.setEnabled(false);
        Timer timer = new Timer() {
            @Override
            public void run() {
                btnLoader.setEnabled(true);
                MaterialLoader.showProgress(false);
            }
        };
        timer.schedule(2000);
    }

    @EventHandler("btnShowLoader")
    void onShowLoader(ClickEvent e) {
        MaterialLoader.showLoading(true);
        Timer t = new Timer() {
            @Override
            public void run() {
                MaterialLoader.showLoading(false);
            }
        };
        t.schedule(3000);
    }

    @EventHandler("btnShowProgress")
    void onShowProgress(ClickEvent e) {
        MaterialLoader.showProgress(true);
        Timer t = new Timer() {
            @Override
            public void run() {
                MaterialLoader.showProgress(false);
            }
        };
        t.schedule(3000);
    }

    @EventHandler("btnShowNavBarProgress")
    void onShowNavBarProgress(ClickEvent e) {
        navBar.showProgress(ProgressType.INDETERMINATE);
        Timer t = new Timer() {
            @Override
            public void run() {
                navBar.hideProgress();
            }
        };
        t.schedule(3000);
    }
}
