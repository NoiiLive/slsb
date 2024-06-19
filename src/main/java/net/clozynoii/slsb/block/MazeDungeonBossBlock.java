
package net.clozynoii.slsb.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class MazeDungeonBossBlock extends Block {
	public MazeDungeonBossBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.STONE).strength(-1, 3600000));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}