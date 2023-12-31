package dev.mayaqq.estrogen.registry;

import dev.architectury.registry.item.ItemPropertiesRegistry;
import dev.mayaqq.estrogen.registry.common.EstrogenItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;

public class EstrogenModelPredicateProviders {
    public static void register() {
        ItemPropertiesRegistry.register(EstrogenItems.ESTROGEN_PATCHES, new ResourceLocation("stacked"), (stack, world, entity, seed) -> {
            return stack.getCount() > 1 ? 1 : 0;
        });
    }
}