/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.tests.testguibuilder;

/**
 * GUI builder created Form
 *
 * @author shannah
 */
public class GuiForm extends com.codename1.ui.Form {

    public GuiForm() {
        this(com.codename1.ui.util.Resources.getGlobalResources());
    }
    
    public GuiForm(com.codename1.ui.util.Resources resourceObjectInstance) {
        initGuiBuilderComponents(resourceObjectInstance);
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    protected com.codename1.ui.Label gui_MyLabel = new com.codename1.ui.Label();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        setLayout(new com.codename1.ui.layouts.LayeredLayout());
        setInlineStylesTheme(resourceObjectInstance);
        setScrollableY(true);
                setInlineStylesTheme(resourceObjectInstance);
        setTitle("GuiForm");
        setName("GuiForm");
        addComponent(gui_MyLabel);
        gui_MyLabel.setText("Label");
                gui_MyLabel.setInlineStylesTheme(resourceObjectInstance);
        gui_MyLabel.setName("MyLabel");
        ((com.codename1.ui.layouts.LayeredLayout)gui_MyLabel.getParent().getLayout()).setInsets(gui_MyLabel, "13.735178% auto auto 32.925587%").setReferenceComponents(gui_MyLabel, "-1 -1 -1 -1").setReferencePositions(gui_MyLabel, "0.0 0.0 0.0 0.0");
    }// </editor-fold>

//-- DON'T EDIT ABOVE THIS LINE!!!
}
