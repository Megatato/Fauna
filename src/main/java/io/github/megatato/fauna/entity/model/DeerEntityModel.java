package io.github.megatato.fauna.entity.model;

import com.google.common.collect.ImmutableList;

import io.github.megatato.fauna.entity.DeerEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;

public class DeerEntityModel<T extends DeerEntity> extends AnimalModel<T> {
    protected final ModelPart torso, head;
    private final ModelPart
        neck
    ;

    public DeerEntityModel() {
        super(true, 0, 0, -1, -1, -1);

        float z_offset = -5f;

        this.textureWidth = 55;
        this.textureHeight = 30;

        this.torso = new ModelPart(this, 0, 0);
        this.torso.addCuboid(-5, 0, 0 + z_offset, 10, 9, 16, 0);
        this.torso.setPivot(0, 0, 0);

        this.neck = new ModelPart(this, 0, 20);
        this.neck.addCuboid(-2f, -7, -3 + z_offset, 4f, 11, 6, 0);
        this.neck.pitch = 0.4f;

        this.head = new ModelPart(this, 30, 0);
        this.head.addCuboid(-2.5f, -10, -9.5f + z_offset, 5, 5, 9, 0);

        ModelPart l_ear = new ModelPart(this, 0, 0);
        l_ear.addCuboid(-5.5f, -13, -1.2f + z_offset, 5, 4, 2, 0);
        ModelPart r_ear = new ModelPart(this, 0, 0);
        r_ear.addCuboid(0.5f, -13, -1.2f + z_offset, 5, 4, 2, 0);
        
        this.head.addChild(l_ear);
        this.head.addChild(r_ear);
    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(this.head);
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of(this.torso, this.neck);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float customAngle, float headYaw,
            float headPitch) {

    }
}