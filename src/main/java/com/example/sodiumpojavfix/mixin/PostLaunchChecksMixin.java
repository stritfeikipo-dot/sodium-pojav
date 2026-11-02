package com.example.sodiumpojavfix.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = net.caffeinemc.mods.sodium.client.compatibility.checks.PostLaunchChecks.class, remap = false)
public class PostLaunchChecksMixin {

    @Inject(method = "onContextInitialized", at = @At("HEAD"), cancellable = true)
    private static void cancelPojavCheck(CallbackInfo ci) {
        ci.cancel();
    }
}
