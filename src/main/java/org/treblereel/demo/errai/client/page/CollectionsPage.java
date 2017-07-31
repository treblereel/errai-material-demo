package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/16/17.
 */
@Singleton
@Templated("#root")
@Page(path = "collections")
public class CollectionsPage {

    @Inject
    @DataField
    MaterialCollectionItem collectWifi, collectBluetooth, collectData;

    @EventHandler("collectWifi")
    void onWifi(ClickEvent e) {
        MaterialToast.fireToast("Wifi Network");
    }

    @EventHandler("collectBluetooth")
    void onBluetooth(ClickEvent e) {
        MaterialToast.fireToast("Bluetooth");
    }

    @EventHandler("collectData")
    void onData(ClickEvent e) {
        MaterialToast.fireToast("Data Usage");
    }
}
