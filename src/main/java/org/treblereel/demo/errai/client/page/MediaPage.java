package org.treblereel.demo.errai.client.page;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialSlider;
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
@Page(path = "media")
public class MediaPage {


    @Inject
    @DataField
    private MaterialSlider slider;

    @Inject
    @DataField
    private MaterialButton fullscreenBtn;

    @EventHandler("fullscreenBtn")
    protected void fullscreenBtnClick(ClickEvent e) {
        setFullscreen(fullscreenBtn.getText().equals("Fullscreen Slider"));
    }

    private void setFullscreen(boolean fullscreen) {
        slider.setFullscreen(fullscreen);

        if(fullscreen) {
            slider.getElement().getStyle().setPosition(Style.Position.FIXED);
            slider.getElement().getStyle().setZIndex(9998);
            slider.setHeight("100%");

            fullscreenBtn.getElement().getStyle().setPosition(Style.Position.FIXED);
            fullscreenBtn.getElement().getStyle().setZIndex(9999);
            fullscreenBtn.getElement().getStyle().setBottom(0, Style.Unit.PX);
            fullscreenBtn.getElement().getStyle().setLeft(0, Style.Unit.PX);
            fullscreenBtn.setIconType(IconType.FULLSCREEN_EXIT);
            fullscreenBtn.setText("Close Fullscreen");
        } else {
            slider.getElement().getStyle().clearPosition();
            slider.getElement().getStyle().clearZIndex();
            slider.getElement().getStyle().clearHeight();

            fullscreenBtn.getElement().getStyle().clearPosition();
            fullscreenBtn.getElement().getStyle().clearZIndex();
            fullscreenBtn.getElement().getStyle().clearBottom();
            fullscreenBtn.getElement().getStyle().clearLeft();
            fullscreenBtn.setIconType(IconType.FULLSCREEN);
            fullscreenBtn.setText("Fullscreen Slider");
        }
    }
}
