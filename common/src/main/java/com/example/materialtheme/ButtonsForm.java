package com.example.materialtheme;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.util.Resources;

public class ButtonsForm extends Form {

    public ButtonsForm() {
        super(BoxLayout.y());

        Button xfButton = new Button("Xataface");
        xfButton.setIcon(Resources.getGlobalResources().getImage("logo-small.jpg"));
        add(xfButton);
    }
}
