package io.github.megatato.fauna.entity.renderer;

import io.github.megatato.fauna.Univar;
import io.github.megatato.fauna.entity.DeerEntity;
import io.github.megatato.fauna.entity.model.DeerEntityModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.util.Identifier;

public class DeerEntityRenderer extends MobEntityRenderer<DeerEntity, DeerEntityModel<DeerEntity>> {

    public DeerEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new DeerEntityModel<>(), 1f);
    }

    @Override
    public Identifier getTexture(DeerEntity entity) {
        String id = Univar.MODID + ":textures/entity/deer/doe2.png";

        return new Identifier(id);
    }
    
}