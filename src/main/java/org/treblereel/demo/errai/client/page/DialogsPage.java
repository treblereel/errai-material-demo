package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialModal;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/19/17.
 */
@Singleton
@Templated
@Page(path = "dialogs")
public class DialogsPage {


    @Inject
    @DataField
    private MaterialButton btnToastAction, btnToast, btnToastRounded, btnToastCallback, btnCloseFixedModal, btnModalFixFooter, btnCloseBottomSheetModal, btnMoadalBottomSheets, btnCloseModalDismiss, btnClosable, btnCloseModal, btnModal;

    @Inject
    @DataField
    private MaterialModal modal, modalFixed, modalBottomSheet, modalClosable;

    @PostConstruct
    public void init() {

    }

    @EventHandler("btnToast")
    void onToast(ClickEvent e) {
        MaterialToast.fireToast("I Love Material Design");
    }

    @EventHandler("btnToastAction")
    void onToastAction(ClickEvent e) {
        MaterialLink link = new MaterialLink("UNDO");
        link.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                MaterialToast.fireToast("UNDO DONE");
            }
        });
        new MaterialToast(link).toast("Item Deleted");
    }

    @EventHandler("btnToastCallback")
    void onToastCallback(ClickEvent e) {
        new MaterialToast(() -> {
            MaterialToast.fireToast("BANG!");
        }).toast("Explosion in: 5, 4, 3, 2, 1", 5000);
    }

    @EventHandler("btnToastRounded")
    void onToastStyle(ClickEvent e) {
        MaterialToast.fireToast("I Love Material Design", "rounded");
    }

    @EventHandler("btnModal")
    void onModal(ClickEvent e) {
        modal.open();
    }

    @EventHandler("btnMoadalBottomSheets")
    void onModalBottom(ClickEvent e) {
        modalBottomSheet.open();
    }

    @EventHandler("btnModalFixFooter")
    void onModalFix(ClickEvent e) {
        modalFixed.open();
    }

    @EventHandler("btnClosable")
    void onClosable(ClickEvent e) {
        modalClosable.open();
    }

    @EventHandler("btnCloseModal")
    void onCloseModal(ClickEvent e){
        modal.close();
    }

    @EventHandler("btnCloseFixedModal")
    void onCloseFixedModal(ClickEvent e) {
        modalFixed.close();
    }

    @EventHandler("btnCloseBottomSheetModal")
    void onCloseBottomModal(ClickEvent e) {
        modalBottomSheet.close();
    }

    @EventHandler("btnCloseModalDismiss")
    void onCloseModalDismiss(ClickEvent e) {
        modalClosable.close();
    }

}
