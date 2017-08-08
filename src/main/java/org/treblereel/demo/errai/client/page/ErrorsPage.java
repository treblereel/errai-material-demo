package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import gwt.material.design.addins.client.autocomplete.MaterialAutoComplete;
import gwt.material.design.addins.client.autocomplete.base.MaterialSuggestionOracle;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.addins.client.timepicker.MaterialTimePicker;
import gwt.material.design.client.ui.*;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.treblereel.demo.errai.client.utils.EmailValidator;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/19/17.
 */
@Singleton
@Templated
@Page(path = "errors")
public class ErrorsPage {

    @Inject
    @DataField
    private MaterialTextBox txtBoxValidator, txtBox, txtBoxValidate;

    @Inject
    @DataField
    private MaterialButton btnValidate, btnValidateAll, btnError, btnSuccess, btnClear, btnErrorDp, btnSuccessDp, btnClearDp, btnErrorTime, btnSuccessTime, btnClearTime;

    @Inject
    @DataField
    private MaterialButton btnErrorRange, btnSuccessRange, btnClearRange, btnErrorSwitch, btnSuccessSwitch, btnClearSwitch, btnErrorTxtArea, btnSuccessTxtArea, btnClearTxtArea;

    @Inject
    @DataField
    private MaterialButton btnErrorTxtBox, btnSuccessTxtBox, btnClearTxtBox, btnErrorComboBox, btnSuccessComboBox, btnClearComboBox, btnErrorListBox, btnSuccessListBox, btnClearListBox;

    @Inject
    @DataField
    MaterialSwitch  sw;

    @Inject
    @DataField
    MaterialTextArea txtAreaValidate, txtArea;

    @Inject
    @DataField
    MaterialIntegerBox intBoxValidate;


    @Inject
    @DataField
    MaterialDoubleBox doubleBoxValidate;

    @Inject
    @DataField
    MaterialFloatBox floatBoxValidate;

    @Inject
    @DataField
    MaterialLongBox longBoxValidate;

    @Inject
    @DataField
    MaterialDatePicker datePickerValidate, dp;

    @Inject
    @DataField
    MaterialTimePicker timePickerValidate, tp;

    @Inject
    @DataField
    MaterialAutoComplete acList;

    @Inject
    @DataField
    MaterialRange range;

    @Inject
    @DataField
    MaterialComboBox combobox;

    @Inject
    @DataField
    MaterialListBox listBox;

    @PostConstruct
    public void init(){
        acList.setSuggestions(getSimpleSuggestions());
        txtBoxValidator.addValidator(new EmailValidator());
    }

    private MaterialSuggestionOracle getSimpleSuggestions() {
        MaterialSuggestionOracle suggestions = new MaterialSuggestionOracle();
        suggestions.add("Alabama");
        suggestions.add("Alaska");
        suggestions.add("Arizona");
        suggestions.add("Arkansas");
        suggestions.add("California");
        suggestions.add("Colorado");
        suggestions.add("Connecticut");
        suggestions.add("Delaware");
        suggestions.add("Florida");
        suggestions.add("Georgia");
        suggestions.add("Hawaii");
        suggestions.add("Idaho");
        suggestions.add("Illinois");
        suggestions.add("Indiana");
        suggestions.add("Iowa");
        suggestions.add("Kansas");
        suggestions.add("Kentucky");
        suggestions.add("Louisiana");
        suggestions.add("Maine");
        suggestions.add("Maryland");
        suggestions.add("Massachusetts");
        suggestions.add("Michigan");
        suggestions.add("Minnesota");
        suggestions.add("Mississippi");
        suggestions.add("Missouri");
        suggestions.add("Montana");
        suggestions.add("Louisiana");
        return suggestions;
    }

    @EventHandler("btnValidateAll")
    void btnValidateAll(ClickEvent e) {
        txtBoxValidate.validate();
        txtAreaValidate.validate();
        intBoxValidate.validate();
        doubleBoxValidate.validate();
        longBoxValidate.validate();
        floatBoxValidate.validate();
        datePickerValidate.validate();
        timePickerValidate.validate();
    }

    @EventHandler("btnValidate")
    void btnValidateClick(ClickEvent e) {
        txtBoxValidator.validate();
    }

    @EventHandler("btnError")
    void onError(ClickEvent e) {
        acList.setError("This is an error message for autocomplete.");
    }

    @EventHandler("btnSuccess")
    void onSuccess(ClickEvent e) {
        acList.setSuccess("This is a success message for autocomplete");
    }

    @EventHandler("btnClear")
    void onClear(ClickEvent e) {
        acList.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorDp")
    void onErrorDp(ClickEvent e) {
        dp.setError("This is an error message for date picker.");
    }

    @EventHandler("btnSuccessDp")
    void onSuccessDp(ClickEvent e) {
        dp.setSuccess("This is a success message for date picker.");
    }

    @EventHandler("btnClearDp")
    void onClearDp(ClickEvent e) {
        dp.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorRange")
    void onErrorRange(ClickEvent e) {
        range.setError("This is an error message for range.");
    }

    @EventHandler("btnSuccessRange")
    void onSuccessRange(ClickEvent e) {
        range.setSuccess("This is a success message for range.");
    }

    @EventHandler("btnClearRange")
    void onClearRange(ClickEvent e) {
        range.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorSwitch")
    void onErrorSwitch(ClickEvent e) {
        sw.setError("This is an error message for switch.");
    }

    @EventHandler("btnSuccessSwitch")
    void onSuccessSwitch(ClickEvent e) {
        sw.setSuccess("This is a success message for switch.");
    }

    @EventHandler("btnClearSwitch")
    void onClearSwitch(ClickEvent e) {
        sw.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorTxtArea")
    void onErrorTxtArea(ClickEvent e) {
        txtArea.setError("This is an error message for text area.");
    }

    @EventHandler("btnSuccessTxtArea")
    void onSuccessTxtArea(ClickEvent e) {
        txtArea.setSuccess("This is a success message text area.");
    }

    @EventHandler("btnClearTxtArea")
    void onClearTxtArea(ClickEvent e) {
        txtArea.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorTxtBox")
    void onErrorTxtBox(ClickEvent e) {
        txtBox.setError("This is an error message for text box.");
    }

    @EventHandler("btnSuccessTxtBox")
    void onSuccessTxtBox(ClickEvent e) {
        txtBox.setSuccess("This is a success message for text box.");
    }

    @EventHandler("btnClearTxtBox")
    void onClearTxtBox(ClickEvent e) {
        txtBox.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorTime")
    void onErrorTime(ClickEvent e) {
        tp.setError("This is an error message for time picker.");
    }

    @EventHandler("btnSuccessTime")
    void onSuccessTime(ClickEvent e) {
        tp.setSuccess("This is a success message for time picker.");
    }

    @EventHandler("btnClearTime")
    void onClearTime(ClickEvent e) {
        tp.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorComboBox")
    void onErrorComboBox(ClickEvent e) {
        combobox.setError("This is an error message for ComboBox.");
    }

    @EventHandler("btnSuccessComboBox")
    void onSuccessComboBox(ClickEvent e) {
        combobox.setSuccess("This is a success message for ComboBox.");
    }

    @EventHandler("btnClearComboBox")
    void onClearComboBox(ClickEvent e) {
        combobox.clearErrorOrSuccess();
    }

    @EventHandler("btnErrorListBox")
    void onErrorListBox(ClickEvent e) {
        listBox.setError("This is an error message for ListBox.");
    }

    @EventHandler("btnSuccessListBox")
    void onSuccessListBox(ClickEvent e) {
        listBox.setSuccess("This is a success message for ListBox.");
    }

    @EventHandler("btnClearListBox")
    void onClearListBox(ClickEvent e) {
        listBox.clearErrorOrSuccess();
    }
}
