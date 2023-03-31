package es.mariaanasanz.ut7.mods.TreeDescender;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class TreeDescender extends Item {
    public TreeDescender(Properties properties) {
        super(properties);
    }

    public <World> boolean TreeDescender(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        // Aquí va la lógica para descender los bloques del árbol.
        return TreeDescender(stack, world, state, pos, entityLiving);
    }

}
