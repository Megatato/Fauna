package io.github.megatato.fauna.entity.renderer;

import io.github.megatato.fauna.Univar;
import io.github.megatato.fauna.entity.DeerEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.util.Identifier;

public class DeerEntityRenderer extends MobEntityRenderer<DeerEntity, HorseEntityModel<DeerEntity>> {

    public DeerEntityRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new HorseEntityModel<>(0.02f), 1f);
    }

    @Override
    public Identifier getTexture(DeerEntity entity) {
        String id = Univar.MODID + ":textures/entity/deer/";

        if(entity.getGender() == Univar.MALE) id += "buck.png";
        else id += "doe.png";

        return new Identifier(id);
    }
    
}