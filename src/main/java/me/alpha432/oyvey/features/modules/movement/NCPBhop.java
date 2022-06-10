//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "E:\desktop\Minecraft-Deobfuscator3000-1.2.3\Minecraft-Deobfuscator3000-1.2.3\1.12 stable mappings"!

// 
// Decompiled by Procyon v0.5.36
// 

package me.alpha432.oyvey.features.modules.movement;

import net.minecraft.client.entity.EntityPlayerSP;
import me.alpha432.oyvey.util.Timer;
import me.alpha432.oyvey.features.modules.Module;

public class NCPBhop extends Module
{
    private final Timer timer;
    
    public NCPBhop() {
        super("NCPBhop", "NCPBypass.", Category.MOVEMENT, true, false, false);
        this.timer = new Timer();
    }
    
    @Override
    public void onUpdate() {
        if (NCPBhop.mc.player.moveForward > 0.0f || NCPBhop.mc.player.moveStrafing > 0.0f) {
            if (NCPBhop.mc.player.onGround) {
                final double timerSpeed = 1.0;
                NCPBhop.mc.player.jump();
                final EntityPlayerSP player = NCPBhop.mc.player;
                player.motionX *= 1.0227999687194824;
                final EntityPlayerSP player2 = NCPBhop.mc.player;
                player2.motionZ *= 1.0227999687194824;
            }
            else {
                if (NCPBhop.mc.player.ticksExisted % 3 == 0) {}
                final EntityPlayerSP player3 = NCPBhop.mc.player;
                player3.motionX *= 1.0;
                final EntityPlayerSP player4 = NCPBhop.mc.player;
                player4.motionZ *= 1.0;
                NCPBhop.mc.player.jumpMovementFactor = 0.0265f;
                final EntityPlayerSP player5 = NCPBhop.mc.player;
                player5.moveStrafing *= 1.0f;
                final EntityPlayerSP player6 = NCPBhop.mc.player;
                player6.moveForward *= 1.0f;
                if (NCPBhop.mc.player.fallDistance >= 0.3) {
                    final double timerSpeed = 1.2000000476837158;
                    final EntityPlayerSP player7 = NCPBhop.mc.player;
                    player7.motionY -= 62.0;
                }
            }
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
