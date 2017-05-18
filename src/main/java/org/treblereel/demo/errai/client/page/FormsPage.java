package org.treblereel.demo.errai.client.page;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.*;
import gwt.material.design.client.ui.html.Label;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 *         Created by treblereel on 5/23/17.
 */

@Singleton
@Templated
@Page(path = "forms")
public class FormsPage {

    @Inject
    @DataField
    MaterialListBox lstOptions, lstSetValue, lstBoxDisabledStyles;

    @Inject
    @DataField
    MaterialCheckBox cbBoxAll, cbBox, cbBlue, cbRed, cbCyan, cbGreen, cbBrown, cbValue;

    @Inject
    @DataField
    MaterialSwitch switch1, switch2, switchSetValue;

    @Inject
    @DataField
    MaterialLabel lblRange;

    @Inject
    @DataField
    MaterialRange range, rangeSetValue;

    @Inject
    @DataField
    MaterialTextBox txtBoxValue;

    @Inject
    @DataField
    MaterialTextArea txtAreaAuto, txtAreaValue, txtAreaFocus;

    @Inject
    @DataField
    MaterialFloatBox txtFloatBox, txtFloatRO, txtFloatTRO, txtFloatValue;

    @Inject
    @DataField
    MaterialIntegerBox txtIntegerBox, txtIntegerRO, txtIntegerTRO, txtIntegerValue;

    @Inject
    @DataField
    MaterialDoubleBox txtDoubleBox, txtDoubleRO, txtDoubleTRO, txtDoubleValue;

    @Inject
    @DataField
    MaterialLongBox txtLongBox, txtLongRO, txtLongTRO, txtLongValue;

    @Inject
    @DataField
    MaterialRadioButton radioValue;

    @Inject
    @DataField
    MaterialSwitch switchEvent;

    @Inject
    @DataField
    MaterialButton btnTextDoubleValueEvent, btnTextDoubleValue, btnTextBoxValue, btnTextBoxValueEvent, btnTextAreaValue, btnTextAreaValueEvent, btnTextIntegerValue, btnTextIntegerValueEvent, btnTextLongValue, btnTextLongValueEvent;

    @Inject
    @DataField
    MaterialButton btnTextFloatValue, btnTextFloatValueEvent, btnListBoxValue, btnListBoxValueEvent, btnRadioValue, btnRadioValueEvent, btnCbValue, btnCbValueEvent, btnSwitchValue, btnSwitchValueEvent, btnRangeValue, btnRangeValueEvent;

    @PostConstruct
    public void init() {
        txtFloatBox.setValue(1000.25f);
        txtFloatRO.setValue(1000.25f);
        txtFloatTRO.setValue(1000.25f);
        txtFloatValue.setValue(1000.25f);
        txtIntegerBox.setValue(10);
        txtIntegerRO.setValue(10);
        txtIntegerTRO.setValue(10);
        txtIntegerValue.setValue(10);
        txtDoubleBox.setValue(9999.90);
        txtDoubleRO.setValue(9999.90);
        txtDoubleTRO.setValue(9999.90);
        txtDoubleValue.setValue(9999.90);
        txtLongBox.setValue((long) 1000.00);
        txtLongRO.setValue((long) 1000.00);
        txtLongTRO.setValue((long) 1000.00);
        txtLongValue.setValue((long) 1000.00);

        txtAreaAuto.setValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam mauris, accumsan placerat " +
                "lectus ac, tincidunt mattis nisl. Ut efficitur massa in libero gravida tincidunt. Vestibulum eget massa " +
                "eget ex auctor tempus. Aenean vitae augue euismod, lacinia lectus ut, rhoncus enim. Sed vitae laoreet " +
                "felis, eget ullamcorper nunc. Vivamus elit urna, varius et arcu vel, euismod auctor augue. Praesent " +
                "scelerisque scelerisque libero sit amet euismod. Mauris eu est at felis feugiat tincidunt eu vel lectus. " +
                "Ut pretium magna vitae massa sollicitudin, eu tincidunt sapien scelerisque. Maecenas gravida lorem non dui " +
                "pretium, id vestibulum mi imperdiet. Fusce facilisis, dui nec ultrices molestie, nisi metus bibendum lacus, " +
                "eget posuere est odio vitae nulla. Mauris laoreet non justo fringilla tempus. Mauris ut risus risus. " +
                "Vivamus auctor accumsan gravida. Nam venenatis sapien nisl, quis accumsan odio dignissim non. Vestibulum " +
                "aliquam semper condimentum. Suspendisse a eros elementum, dapibus quam in, aliquet lorem. Morbi mi dui, " +
                "convallis at luctus ultricies, malesuada at leo. Morbi et turpis a ex vehicula ullamcorper. Vestibulum " +
                "lacinia, orci eget elementum fermentum, lectus velit interdum erat, sit amet pharetra justo elit in tortor. " +
                "Suspendisse ac vestibulum nisi.\n" +
                "\n" +
                "Nunc euismod metus nec elit sollicitudin blandit. Proin eleifend ex bibendum sodales blandit. Vestibulum " +
                "varius pharetra arcu, sit amet pellentesque odio hendrerit nec. Integer faucibus imperdiet tortor a tempus. " +
                "Sed accumsan condimentum nisl. Cras interdum sapien quis maximus commodo. Nulla malesuada imperdiet enim, " +
                "non ornare elit auctor in. Fusce at ipsum eget turpis tincidunt maximus. Nunc sodales tortor nec tincidunt " +
                "fringilla. Quisque sollicitudin ipsum at dolor faucibus, ultricies convallis ipsum convallis. Donec " +
                "consequat velit vel molestie tempus. Donec et accumsan lacus, non sollicitudin quam. Morbi arcu lacus, " +
                "blandit eu lacus nec, finibus tempus ligula.", true);

        txtAreaFocus.setValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc quam mauris, accumsan placerat " +
                "lectus ac, tincidunt mattis nisl. Ut efficitur massa in libero gravida tincidunt. Vestibulum eget massa " +
                "eget ex auctor tempus. Aenean vitae augue euismod, lacinia lectus ut, rhoncus enim. Sed vitae laoreet " +
                "felis, eget ullamcorper nunc. Vivamus elit urna, varius et arcu vel, euismod auctor augue. Praesent " +
                "scelerisque scelerisque libero sit amet euismod. Mauris eu est at felis feugiat tincidunt eu vel lectus. " +
                "Ut pretium magna vitae massa sollicitudin, eu tincidunt sapien scelerisque. Maecenas gravida lorem non dui " +
                "pretium, id vestibulum mi imperdiet. Fusce facilisis, dui nec ultrices molestie, nisi metus bibendum lacus, " +
                "eget posuere est odio vitae nulla. Mauris laoreet non justo fringilla tempus. Mauris ut risus risus. " +
                "Vivamus auctor accumsan gravida. Nam venenatis sapien nisl, quis accumsan odio dignissim non. Vestibulum " +
                "aliquam semper condimentum. Suspendisse a eros elementum, dapibus quam in, aliquet lorem. Morbi mi dui, " +
                "convallis at luctus ultricies, malesuada at leo. Morbi et turpis a ex vehicula ullamcorper. Vestibulum " +
                "lacinia, orci eget elementum fermentum, lectus velit interdum erat, sit amet pharetra justo elit in tortor. " +
                "Suspendisse ac vestibulum nisi.\n" +
                "\n" +
                "Nunc euismod metus nec elit sollicitudin blandit. Proin eleifend ex bibendum sodales blandit. Vestibulum " +
                "varius pharetra arcu, sit amet pellentesque odio hendrerit nec. Integer faucibus imperdiet tortor a tempus. " +
                "Sed accumsan condimentum nisl. Cras interdum sapien quis maximus commodo. Nulla malesuada imperdiet enim, " +
                "non ornare elit auctor in. Fusce at ipsum eget turpis tincidunt maximus. Nunc sodales tortor nec tincidunt " +
                "fringilla. Quisque sollicitudin ipsum at dolor faucibus, ultricies convallis ipsum convallis. Donec " +
                "consequat velit vel molestie tempus. Donec et accumsan lacus, non sollicitudin quam. Morbi arcu lacus, " +
                "blandit eu lacus nec, finibus tempus ligula.", true);

        txtIntegerValue.addValueChangeHandler(event ->{
            MaterialToast.fireToast("Value " + ((MaterialIntegerBox)event.getSource()).getValue());
        });

        lstOptions.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Selected Index: " + lstOptions.getSelectedIndex());
        });

        txtBoxValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + txtBoxValue.getValue());

        });

        txtLongValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + txtLongValue.getValue());
        });

        txtDoubleValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + txtDoubleValue.getValue());
        });

        txtFloatValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + txtFloatValue.getValue());
        });

        cbValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + cbValue.getValue());
        });

        lstSetValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + lstSetValue.getValue());
        });

        radioValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + radioValue.getValue());
        });

        switchEvent.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + switchEvent.getValue());
        });

        switchSetValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + switchSetValue.getValue());
        });

        range.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + range.getValue());
        });

        rangeSetValue.addValueChangeHandler(event -> {
            MaterialToast.fireToast("Value " + rangeSetValue.getValue());
        });

        cbBox.addValueChangeHandler(event -> {
            if (cbBox.getValue()) {
                cbBox.setText("CheckBox 1: true");
            } else {
                cbBox.setText("CheckBox 1: false");
            }
        });

        cbBoxAll.addValueChangeHandler(event ->{
            if (cbBoxAll.getValue()) {
                cbBlue.setValue(true);
                cbRed.setValue(true);
                cbCyan.setValue(true);
                cbGreen.setValue(true);
                cbBrown.setValue(true);
            } else {
                cbBlue.setValue(false);
                cbRed.setValue(false);
                cbCyan.setValue(false);
                cbGreen.setValue(false);
                cbBrown.setValue(false);
            }
        });

        new MaterialLabel().setTextColor(Color.RED);
    }

    @EventHandler("btnTextBoxValue")
    void onTextBoxValue(ClickEvent e) {
        txtBoxValue.setValue("Text Box");
    }

    @EventHandler("btnTextBoxValueEvent")
    void onTextBoxValueEvent(ClickEvent e) {
        txtBoxValue.setValue("Text Box 2", true);
    }

    @EventHandler("btnTextAreaValue")
    void onTextAreaValue(ClickEvent e) {
        txtAreaValue.setValue("Text Area");
    }

    @EventHandler("btnTextAreaValueEvent")
    void onTextAreaValueEvent(ClickEvent e) {
        txtAreaValue.setValue("Text Area 2", true);
    }

    @EventHandler("btnTextIntegerValue")
    void onTextIntegerValue(ClickEvent e) {
        txtIntegerValue.setValue(20000);
    }

    @EventHandler("btnTextIntegerValueEvent")
    void onTextIntegerValueEvent(ClickEvent e) {
        txtIntegerValue.setValue(1000, true);
    }

    @EventHandler("btnTextLongValue")
    void onTextLongValue(ClickEvent e) {
        txtLongValue.setValue(20000l);
    }

    @EventHandler("btnTextLongValueEvent")
    void onTextLongValueEvent(ClickEvent e) {
        txtLongValue.setValue(1000l, true);
    }

    @EventHandler("btnTextDoubleValue")
    void onTextDoubleValue(ClickEvent e) {
        txtDoubleValue.setValue(20.00);
    }

    @EventHandler("btnTextDoubleValueEvent")
    void onTextDoubleValueEvent(ClickEvent e) {
        txtDoubleValue.setValue(10.50, true);
    }

    @EventHandler("btnTextFloatValue")
    void onTextFloatValue(ClickEvent e) {
        txtFloatValue.setValue(20.00f);
    }

    @EventHandler("btnTextFloatValueEvent")
    void onTextFloatValueEvent(ClickEvent e) {
        txtFloatValue.setValue(10.50f, true);
    }

    @EventHandler("btnCbValue")
    void onClickCbValue(ClickEvent e) {
        cbValue.setValue(true);
    }

    @EventHandler("btnCbValueEvent")
    void onClickCbValueEvent(ClickEvent e) {
        cbValue.setValue(false, true);
    }

    @EventHandler("btnListBoxValue")
    void onListBoxValue(ClickEvent e) {
        lstSetValue.setValue("Option 2");
    }

    @EventHandler("btnListBoxValueEvent")
    void onListBoxValueEvent(ClickEvent e) {
        lstSetValue.setValue("Option 3", true);
    }

    @EventHandler("btnRadioValue")
    void onClickRadioValue(ClickEvent e) {
        radioValue.setValue(true);
    }

    @EventHandler("btnRadioValueEvent")
    void onClickRadioValueEvent(ClickEvent e) {
        radioValue.setValue(false, true);
    }

    @EventHandler("btnSwitchValue")
    void onSwitchValue(ClickEvent e) {
        if (!switchSetValue.getValue()) {
            switchSetValue.setValue(true);
        } else {
            switchSetValue.setValue(false);
        }
    }

    @EventHandler("btnSwitchValueEvent")
    void onSwitchValueEvent(ClickEvent e) {
        if (!switchSetValue.getValue()) {
            switchSetValue.setValue(true, true);
        } else {
            switchSetValue.setValue(false, true);
        }
    }

    @EventHandler("btnRangeValue")
    void onRangeValue(ClickEvent e) {
        rangeSetValue.setValue(50);
    }

    @EventHandler("btnRangeValueEvent")
    void onRangeValueEvent(ClickEvent e) {
        rangeSetValue.setValue(20, true);
    }
}
