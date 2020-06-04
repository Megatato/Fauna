package io.github.megatato.fauna.entity;

import java.util.Random;

import io.github.megatato.fauna.FaunaEntityType;
import io.github.megatato.fauna.Univar;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.HorseBaseEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;

public class DeerEntity extends HorseBaseEntity {

    protected static final TrackedData<Boolean> GENDER;

    public DeerEntity(EntityType<? extends DeerEntity> entityType, World world) {
        super(entityType, world);
        /* need to figure out how to have spawn egg produce male and/or female deer */
    }

    protected void initDataTracker(){
        super.initDataTracker();
        this.dataTracker.startTracking(GENDER, Univar.FEMALE);
    }

    static {
        GENDER = DataTracker.registerData(DeerEntity.class, TrackedDataHandlerRegistry.BOOLEAN);
    }

    public Boolean getGender(){
        return (Boolean)this.dataTracker.get(GENDER);
    }

    public void setGender(Boolean gender){
        this.dataTracker.set(GENDER, gender);
    }

	@Override
	public PassiveEntity createChild(PassiveEntity mate) {
        DeerEntity 
        child = (DeerEntity)FaunaEntityType.DEER.create(this.world)
        
        ;

        Double rand = new Random().nextDouble();
        //System.out.println("rand: " + rand); //rand value output; for debug.

        if(rand >= 0.5){
            child.setGender(Univar.MALE);
            //System.out.println("Child is Male!");
        }
        else{
            child.setGender(Univar.FEMALE);
            //System.out.println("Child is Female!");
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