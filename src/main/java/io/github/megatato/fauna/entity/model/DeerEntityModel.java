package io.github.megatato.fauna.entity.model;

import io.github.megatato.fauna.entity.DeerEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;

public class DeerEntityModel<T extends DeerEntity> extends AnimalModel<T> {
    public DeerEntityModel() {

    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float customAngle, float headYaw,
            float headPitch) {
        // TODO Auto-generated method stub

    }
}