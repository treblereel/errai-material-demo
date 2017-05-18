package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiHandler;
import gwt.material.design.client.base.SearchObject;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.treblereel.demo.errai.client.dto.Hero;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 6/1/17.
 */
@Singleton
@Templated
@Page(path = "search")
public class SearchPage {

    @Inject
    @DataField
    private MaterialNavBar navBar, navBarSearch;

    @Inject
    @DataField
    private MaterialSearch txtSearch;

    @Inject
    @DataField
    private MaterialImage imgHero;

    @Inject
    @DataField
    private MaterialLabel lblName, lblDescription;

    @Inject
    @DataField
    private MaterialNavBrand navBrand;

    @Inject
    @DataField
    private MaterialLink btnSearch;

    @PostConstruct
    public void init() {
        // Add Open Handler
        txtSearch.addOpenHandler(openEvent -> {
            navBar.setVisible(false);
            navBarSearch.setVisible(true);
            MaterialToast.fireToast("Open Event was fired");
        });

        // Add Close Handler
        txtSearch.addCloseHandler(event -> {
            navBar.setVisible(true);
            navBarSearch.setVisible(false);
            MaterialToast.fireToast("Close Event was fired");
        });

        // Populate the search keyword into search component
        List<SearchObject> objects = new ArrayList<>();
        for(Hero hero : org.treblereel.demo.errai.client.utils.DemoUtils.getAllHeroes()){
            objects.add(hero);
        }
        txtSearch.setListSearches(objects);

        // Add Finish Handler
        txtSearch.addSearchFinishHandler(event -> {
            // Get the selected search object
            Hero hero = (Hero)txtSearch.getSelectedObject();
            MaterialAnimator.animate(Transition.ZOOMIN, imgHero, 0);
            imgHero.setResource(hero.getResource());
            lblName.setText(hero.getName());
            lblDescription.setText(hero.getDescription());
            MaterialToast.fireToast("Search Finish Event was fired");
        });
    }

    @EventHandler("btnSearch")
    void onSearch(ClickEvent e){
        txtSearch.open();
    }
}
