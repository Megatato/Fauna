package io.github.megatato.fauna;

import io.github.megatato.fauna.entity.renderer.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class FaunaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerEntityRenderers();
    }

    private void registerEntityRenderers(){
		EntityRendererRegistry.INSTANCE.register(FaunaEntityType.DEER, (EntityRenderDispatcher, context) -> new DeerEntityRenderer(EntityRenderDispatcher));
	}
    
}