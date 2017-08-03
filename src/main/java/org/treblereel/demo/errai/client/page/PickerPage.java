package org.treblereel.demo.errai.client.page;

import com.google.gwt.core.client.JsDate;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import gwt.material.design.client.constants.DatePickerLanguage;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.html.Option;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.slf4j.Logger;
import org.treblereel.demo.errai.client.utils.DemoUtils;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/16/17.
 */
@Singleton
@Templated("#root")
@Page(path = "pickers")
public class PickerPage {

    @Inject
    @DataField
    MaterialListBox lstLanguage;

    @Inject
    @DataField
    MaterialDatePicker dpTranslation, dpOpenClose, dp, dpValue, dpLimit, dpClear, dpEvents;

    @Inject
    @DataField
    MaterialButton btnOpen, btnSetDate, btnGetDate, btnDpValue, btnDpValueEvent, btnClear;

    @Inject
    //@DataField
    MaterialPanel container;

    @Inject
    Logger logger;

    private List<DatePickerLanguage> languages = new ArrayList<>();


    @PostConstruct
    public void init(){

        MaterialDatePicker mdp = new MaterialDatePicker();
        container.add(mdp);
        mdp.setSelectionType(MaterialDatePicker.MaterialDatePickerType.YEAR);
        mdp.reinitialize();
        container.add(mdp);



        for(DatePickerLanguage lang : DemoUtils.getAllDateLanguage()) {
            languages.add(lang);
            lstLanguage.add(new Option(lang.getName()));
        }

        lstLanguage.addValueChangeHandler(new ValueChangeHandler<String>() {
            @Override
            public void onValueChange(ValueChangeEvent<String> event) {
                DatePickerLanguage lang = languages.get(lstLanguage.getSelectedIndex());
                dpTranslation.setLanguage(lang);
                dpTranslation.reinitialize();
            }
        });

        dpValue.addValueChangeHandler(event -> MaterialToast.fireToast(event.getValue() + "") );

        dpOpenClose.addOpenHandler(event -> {
            if(event.getTarget().getValue() != null){
                MaterialToast.fireToast("Opened Date Picker " + event.getTarget().getValue());
            } else {
                MaterialToast.fireToast("Opened Date Picker" );
            }
        });

        dpOpenClose.addCloseHandler(event -> MaterialToast.fireToast("Closed Date Picker with value " + event.getTarget().getValue()));

        dpOpenClose.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Date Selected " + event.getValue());
            dpOpenClose.close();
        });

        dpEvents.addOpenHandler(event -> {
            if(event.getTarget().getValue() != null){
                MaterialToast.fireToast("Opened Date Picker " + event.getTarget().getValue());
            }else{
                MaterialToast.fireToast("Opened Date Picker" );
            }
        });
        dpEvents.addCloseHandler(event -> MaterialToast.fireToast("Closed Date Picker with value " + event.getTarget().getValue()));
        dpEvents.addValueChangeHandler(event -> MaterialToast.fireToast("Date Selected " + event.getValue()));

        dpLimit.setDateMin(new Date(117, 0, 1));
        dpLimit.setDateMax(new Date(117, 0, 15));
    }

    @EventHandler("btnOpen")
    public void onBtnOpen(ClickEvent e) {
        dpOpenClose.open();
    }

    @EventHandler("btnSetDate")
    void onSetDate(ClickEvent e){
        dp.setDate(new Date(116, 0,1));
    }

    @EventHandler("btnGetDate")
    void onGetDate(ClickEvent e){
        MaterialToast.fireToast("" + dp.getDate());
    }

    @EventHandler("btnDpValue")
    void onDpValue(ClickEvent e) {
        dpValue.setValue(new Date(), false);
        Long l = new Date().getTime();
        l = l - 2592000000L;      //1 Months in Milliseconds = 2592000000
        Date dd = new Date();
        dd.setTime(l);
        dpValue.setPickerDate(JsDate.create(dd.getTime()), dpValue.getDateInput().getElement());
    }

    @EventHandler("btnDpValueEvent")
    void onDpValueEvent(ClickEvent e) {
        Date date = new Date(123,1,1);
        dpValue.setValue(date, true);
    }

    @EventHandler("btnClear")
    void onDpClear(ClickEvent e) {
        dpClear.clear();
    }
}
