package io.github.megatato.fauna.entity.renderer;

import io.github.megatato.fauna.Univar;
import io.github.megatato.fauna.entity.DeerEntity;
import io.github.megatato.fauna.entity.model.DeerEntityModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class DeerEntityRenderer extends MobEntityRenderer<DeerEntity, DeerEntityModel<DeerEntity>> {

    public DeerEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new DeerEntityModel<>(), 1f);
    }

    @Override
    public Identifier getTexture(DeerEntity entity) {
        String id = "textures/entity/deer/doe.png";

        return new Identifier(Univar.MODID, id);
    }
    
}