//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "E:\desktop\Minecraft-Deobfuscator3000-1.2.3\Minecraft-Deobfuscator3000-1.2.3\1.12 stable mappings"!

// 
// Decompiled by Procyon v0.5.36
// 

package me.alpha432.oyvey.features.modules.movement;

import me.alpha432.oyvey.features.setting.Setting;
import me.alpha432.oyvey.util.Timer;
import me.alpha432.oyvey.features.modules.Module;

public class VanillaFly extends Module
{
    private final Timer timer;
    public Setting<Float> Speed;
    
    public VanillaFly() {
        super("vanillaFlyTest", "Fly", Category.MOVEMENT, true, false, false);
        this.timer = new Timer();
        this.Speed = (Setting<Float>)this.register(new Setting("Speed", (T)4.0f, (T)0.1f, (T)20.0f));
    }
    
    @Override
    public void onEnable() {
        VanillaFly.mc.player.capabilities.allowFlying = true;
        VanillaFly.mc.player.capabilities.isFlying = true;
    }
    
    @Override
    public void onDisable() {
        VanillaFly.mc.player.capabilities.allowFlying = false;
        VanillaFly.mc.player.capabilities.isFlying = false;
    }
}
