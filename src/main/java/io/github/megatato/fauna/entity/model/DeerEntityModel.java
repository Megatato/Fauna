package io.github.megatato.fauna.entity.model;

import com.google.common.collect.ImmutableList;

import io.github.megatato.fauna.entity.DeerEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.AnimalModel;

public class DeerEntityModel<T extends DeerEntity> extends AnimalModel<T> {
    protected final ModelPart torso, head;
    private final ModelPart
        neck,
        lf_leg,
        rf_leg,
        lh_leg,
        rh_leg,
        tail
    ;

    public DeerEntityModel() {
        super(true, 0, 0, -1, -1, -1);

        this.textureWidth = 52;
        this.textureHeight = 39;

        float
            prime_pivot_x = 0,
            prime_pivot_y = 5,
            prime_pivot_z = -5
        ;

        this.torso = new ModelPart(this, -16, 0);
        this.torso.addCuboid(-5, 0, 0, 10, 9, 16);
        this.torso.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        this.tail = new ModelPart(this, 24, 25);
        this.tail.addCuboid(0, 0, 0, 3, 2, 7);
        this.tail.setPivot(prime_pivot_x - 1, prime_pivot_y + 0.5f, prime_pivot_z + 15);
        this.tail.pitch = -0.85f;

        this.neck = new ModelPart(this, 20, -1);
        this.neck.addCuboid(-2f, -7, -3, 4, 11, 6);
        this.neck.pitch = 0.4f;
        this.neck.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        this.head = new ModelPart(this, -2, 25);
        this.head.addCuboid(-2.5f, -10, -9.5f, 5, 5, 9);
        this.head.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        ModelPart l_ear = new ModelPart(this, 17, 26);
        l_ear.addCuboid(2.1f, -13, -1.2f, 5, 4, 2);
        ModelPart r_ear = new ModelPart(this, 17, 26);
        r_ear.mirror = true;
        r_ear.addCuboid(-7.1f, -13, -1.2f, 5, 4, 2);
        
        this.rf_leg = new ModelPart(this, 40, 3);
        this.rf_leg.mirror = true;
        this.rf_leg.addCuboid(-5, 9, 0, 3, 10, 3);
        this.rf_leg.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        this.lf_leg = new ModelPart(this, 40, 3);
        this.lf_leg.addCuboid(2f, 9, 0, 3, 10, 3);
        this.lf_leg.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        this.rh_leg = new ModelPart(this, 40, 3);
        this.rh_leg.mirror = true;
        this.rh_leg.addCuboid(-5, 9, 12, 3, 10, 3);
        this.rh_leg.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        this.lh_leg = new ModelPart(this, 40, 3);
        this.lh_leg.addCuboid(2f, 9, 12, 3, 10, 3);
        this.lh_leg.setPivot(prime_pivot_x, prime_pivot_y, prime_pivot_z);

        this.head.addChild(l_ear);
        this.head.addChild(r_ear);
    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(this.head);
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of(this.torso, this.tail, this.rf_leg, this.lf_leg, this.rh_leg, this.lh_leg, this.neck);
    }

    @Override
    public void setAngles(T entity, float limbAngle, float limbDistance, float customAngle, float headYaw,
            float headPitch) {

    }
}