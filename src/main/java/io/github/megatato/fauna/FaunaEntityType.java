package io.github.megatato.fauna;

import io.github.megatato.fauna.entity.*;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FaunaEntityType {
    public static final EntityType<DeerEntity> DEER = 
        Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Univar.MODID, "deer"),
            FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, (EntityType.EntityFactory<DeerEntity>)DeerEntity::new).size(EntityDimensions.fixed(2.2f, 1.2f)).build()
        )
    ;
}