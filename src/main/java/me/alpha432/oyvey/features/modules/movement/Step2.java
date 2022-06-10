//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "E:\desktop\Minecraft-Deobfuscator3000-1.2.3\Minecraft-Deobfuscator3000-1.2.3\1.12 stable mappings"!

// 
// Decompiled by Procyon v0.5.36
// 

package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.util.Timer;
import me.alpha432.oyvey.features.modules.Module;

public class Step2 extends Module
{
    private final Timer timer;
    
    public Step2() {
        super("StepTest", "Teleports you.", Category.MOVEMENT, true, false, false);
        this.timer = new Timer();
    }
    
    @Override
    public void onUpdate() {
        if (Step2.mc.player.onGround) {
            Step2.mc.player.stepHeight = 1.0f;
            Step2.mc.player.posY = 2.0;
        }
    }
    
    @Override
    public void onEnable() {
    }
    
    @Override
    public void onDisable() {
        final double timerSpeed = 1.0;
    }
}
