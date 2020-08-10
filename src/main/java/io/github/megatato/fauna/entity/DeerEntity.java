package io.github.megatato.fauna.entity;

import io.github.megatato.fauna.FaunaEntityType;
import io.github.megatato.fauna.FaunaItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class DeerEntity extends AnimalEntity {
    public DeerEntity(EntityType<? extends DeerEntity> entityType, World world) {
        super(entityType, world);
        /* need to figure out how to have spawn egg produce male and/or female deer */
    }

    static {
    }

    protected void initGoals(){
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0D, DeerEntity.class));
        this.goalSelector.add(1, new LookAroundGoal(this));
        //this.goalSelector.add(2, new FleeEntityGoal<>(this, PlayerEntity.class, 7, 0.25, 0.75));
    }

	@Override
	public PassiveEntity createChild(PassiveEntity mate) {
        DeerEntity child = (DeerEntity)FaunaEntityType.DEER.create(this.world);   

		return child;
    }
    
    @Override
    public boolean canBreedWith(AnimalEntity other) {
        if (other == this) {
           return false;
        } else if (other.getClass() != this.getClass()) {
           return false;
        } else {
           return this.isInLove() && other.isInLove();
        }
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return 
            stack.getItem() == Items.SWEET_BERRIES || stack.getItem() == FaunaItems.ACORN
        ;
    }
}