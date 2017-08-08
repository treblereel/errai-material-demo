package org.treblereel.demo.errai.client.widget;

import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSideNavPush;
import gwt.material.design.themes.amber.ThemeAmber;
import gwt.material.design.themes.blue.ThemeBlue;
import gwt.material.design.themes.brown.ThemeBrown;
import gwt.material.design.themes.client.ThemeLoader;
import gwt.material.design.themes.green.ThemeGreen;
import gwt.material.design.themes.grey.ThemeGrey;
import gwt.material.design.themes.orange.ThemeOrange;
import gwt.material.design.themes.pink.ThemePink;
import gwt.material.design.themes.purple.ThemePurple;
import gwt.material.design.themes.red.ThemeRed;
import gwt.material.design.themes.yellow.ThemeYellow;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.treblereel.demo.errai.client.utils.ThemeManager;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Templated
@Dependent
public class Header extends Composite {

    @DataField
    @Inject
    private MaterialRow root;

    @Inject
    @DataField
    private MaterialNavBar navBar;

    @Inject
    @DataField
    private MaterialHeader header;

    @Inject
    @DataField
    private MaterialSideNavPush sideBar;

    @Inject
    @DataField
    private MaterialComboBox<ThemeLoader.ThemeBundle> comboThemes;


    @PostConstruct
    private void init() {
        initThemes();
    }

    protected void initThemes() {
        ThemeManager.initialize();
        ThemeManager.register(navBar, ThemeManager.DARKER_SHADE);
        buildThemeList();
        comboThemes.setSingleValue(ThemeManager.getBundle());
        comboThemes.addValueChangeHandler(event -> {
            ThemeManager.loadTheme(comboThemes.getSingleValue());
        });
    }

    protected void buildThemeList() {
        comboThemes.addItem("Amber", ThemeAmber.INSTANCE);
        comboThemes.addItem("Blue", ThemeBlue.INSTANCE);
        comboThemes.addItem("Brown", ThemeBrown.INSTANCE);
        comboThemes.addItem("Green", ThemeGreen.INSTANCE);
        comboThemes.addItem("Grey", ThemeGrey.INSTANCE);
        comboThemes.addItem("Orange", ThemeOrange.INSTANCE);
        comboThemes.addItem("Pink", ThemePink.INSTANCE);
        comboThemes.addItem("Purple", ThemePurple.INSTANCE);
        comboThemes.addItem("Red", ThemeRed.INSTANCE);
        comboThemes.addItem("Yellow", ThemeYellow.INSTANCE);
    }

}
