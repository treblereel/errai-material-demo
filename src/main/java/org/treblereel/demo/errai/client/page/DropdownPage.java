package org.treblereel.demo.errai.client.page;

import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/16/17.
 */
@Singleton
@Templated("#root")
@Page(path = "dropdown")
public class DropdownPage {

    @Inject
    @DataField
    private MaterialDropDown dropdown;

    @Inject
    @DataField
    private MaterialLink linkDialPad, linkVoicemail, linkNotification;


    @PostConstruct
    public void init(){
        dropdown.addSelectionHandler(event ->  MaterialToast.fireToast("Selected : " + ((MaterialLink)event.getSelectedItem()).getText()));
    }

}
