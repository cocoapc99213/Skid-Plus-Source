// 
// Decompiled by Procyon v0.5.36
// 

package me.alpha432.oyvey.features.modules.skidplus;

import org.lwjgl.opengl.Display;
import me.alpha432.oyvey.features.modules.Module;

public class SetTitle extends Module
{
    String set;
    
    public SetTitle() {
        super("SetTitle", "LumaSKid", Category.SKIDPLUS, true, false, false);
        this.set = "Skid+";
    }
    
    @Override
    public void onUpdate() {
        Display.setTitle(this.set);
        this.disable();
    }
}
