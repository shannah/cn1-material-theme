package com.example.materialtheme;

import com.codename1.components.InfiniteProgress;
import com.codename1.ui.CN;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.Border;

import static com.codename1.ui.ComponentSelector.$;

public class InfiniteProgressContainer extends Container {

    public InfiniteProgressContainer() {
        this(null);
    }

    public InfiniteProgressContainer(Component content) {
        super(new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
        if (content == null) {
            InfiniteProgress prg = new InfiniteProgress();
            content = prg;
        }
        setGrabsPointerEvents(true);
        $(this)
                .setBgTransparency(128)
                .setBorder(Border.createEmpty())
                .setBgColor(0x0);

        add(BorderLayout.CENTER, content);

    }
    public void show() {
        if (isInitialized()) return;
        remove();
        Form form = CN.getCurrentForm();
        if (form == null) return;
        Container layeredPane = form.getFormLayeredPane(InfiniteProgressContainer.class, true);
        layeredPane.removeAll();
        layeredPane.setLayout(new BorderLayout());
        layeredPane.getAllStyles().stripMarginAndPadding();
        layeredPane.add(BorderLayout.CENTER, this);
        form.revalidateWithAnimationSafety();

    }

    public void dispose() {
        if (isInitialized()) {
            Form form = getComponentForm();
            remove();
            form.revalidateWithAnimationSafety();
        }
    }
}
