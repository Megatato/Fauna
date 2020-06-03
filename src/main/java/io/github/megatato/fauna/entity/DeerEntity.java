package io.github.megatato.fauna.entity;

import java.util.Random;

import io.github.megatato.fauna.FaunaEntityType;
import io.github.megatato.fauna.Univar;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.HorseBaseEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class DeerEntity extends HorseBaseEntity {

    protected Boolean gender;

    public DeerEntity(EntityType<? extends DeerEntity> entityType, World world) {
        super(entityType, world);
        this.gender = Univar.FEMALE;
        /* currently need to figure out how to allow for different
        specimens of the deer species to have different genders */
    }

    public Boolean getGender(){
        return gender;
    }

    public void setGender(Boolean gender){
        this.gender = gender;
    }

	@Override
	public PassiveEntity createChild(PassiveEntity mate) {
        DeerEntity 
        child = (DeerEntity)FaunaEntityType.DEER.create(this.world)
        
        ;

        if(new Random().nextInt(1) == 1){
            child.setGender(Univar.MALE);
        }
        else{
            child.setGender(Univar.MALE);
        }

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
        return stack.getItem() == Items.WHEAT;
    }
}