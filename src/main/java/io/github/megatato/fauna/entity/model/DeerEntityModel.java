package io.github.megatato.fauna.entity.model;

import com.google.common.collect.ImmutableList;

import io.github.megatato.fauna.entity.DeerEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;

public class DeerEntityModel<T extends DeerEntity> extends AnimalModel<T> {
    protected final ModelPart torso, head;

    public DeerEntityModel() {
        super(true, 0, 0, 0, 0, 0);

        this.textureWidth = 40;
        this.textureHeight = 30;

        this.torso = new ModelPart(this, 0, 0);
        this.torso.addCuboid(0, 0, 0, 10, 10, 10, 0);
        this.torso.setPivot(0, 0, 0);

        this.head = new ModelPart(this, 0, 20);
        this.head.addCuboid(0, -5, 0, 5, 5, 5, 0);
        this.head.setPivot(0, 0, 0);
    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(this.head);
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of(this.torso);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float customAngle, float headYaw,
            float headPitch) {

    }
}