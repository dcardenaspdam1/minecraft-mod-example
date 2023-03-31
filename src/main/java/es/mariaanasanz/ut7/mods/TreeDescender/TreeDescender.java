package es.mariaanasanz.ut7.mods.TreeDescender;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeDescender extends Item {
    public TreeDescender(Properties properties) {
        super(properties);
    }

    public <World> boolean TreeDescender(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        // Aquí va la lógica para descender los bloques del árbol.
        return TreeDescender(stack, world, state, pos, entityLiving);
    }
    public <World, InventoryPlayer> void descenderBloques(BlockPos pos, World world, InventoryPlayer playerInventory) {
        List<BlockPos> arbolBloques = new
                ArrayList<BlockPos>();
        List<BlockPos> bloquesVi = new ArrayList<BlockPos>();
        Set<BlockPos> visitarBlo = new HashSet<BlockPos>();

        bloquesVi.add(pos);
        arbolBloques.add(pos);

        while (!bloquesVi.isEmpty()) {
            BlockPos currentBlock = bloquesVi.remove(0);
            visitarBlo.add(currentBlock);

            for (BlockPos adjacentBlock : getAdjacentBlocks(currentBlock)) {
                if (isTreeBlock(adjacentBlock, world)) {
                    if (!visitarBlo.contains(adjacentBlock)) {
                        bloquesVi.add(adjacentBlock);
                        arbolBloques.add(adjacentBlock);
                    }
                }
            }
        }
    }}

