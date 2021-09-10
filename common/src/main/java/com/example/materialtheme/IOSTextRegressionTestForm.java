package com.example.materialtheme;

import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;

public class IOSTextRegressionTestForm extends Form {

    IOSTextRegressionTestForm() {
        super("TestHintIssue", BoxLayout.y());
        Form test = this;
        Image iconSearch = FontImage.createMaterial(FontImage.MATERIAL_SEARCH, UIManager.getInstance().getComponentStyle("icon"));//Utils.getMaterialImageUnselected(FontImage.MATERIAL_SEARCH, Uiid.gpcl_iconSearchContact);
        Image icB        = FontImage.createMaterial(FontImage.MATERIAL_ARROW_BACK, UIManager.getInstance().getComponentStyle("icon"));

        TextField tf = new TextField("");
        tf.setHint("Search",iconSearch);
        tf.setUIID("ta");
        tf.getHintLabel().setUIID("hint");

        Container tb = new Container(new BorderLayout());
        Button btnB = new Button();
        btnB.setUIID("Btn");
        btnB.setIcon(icB);
        btnB.setDisabledIcon(icB);
        btnB.setPressedIcon(icB);

        tb.add(BorderLayout.WEST, btnB);
        tb.add(BorderLayout.CENTER, tf);
        tb.setUIID("cntBgnToolBar");

        test.getToolbar().setTitleComponent(tb);
        test.setSafeArea(true);

    }
}
