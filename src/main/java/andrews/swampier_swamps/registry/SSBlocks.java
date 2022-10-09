package andrews.swampier_swamps.registry;

import andrews.swampier_swamps.objects.blocks.*;
import andrews.swampier_swamps.util.Reference;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class SSBlocks
{
    // Mud Blocks
    public static final Block MUD_SLAB              = createBlock("mud_slab", new MudSlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Block MUD_STAIRS            = createBlock("mud_stairs", new MudStairsBlock(Blocks.MUD.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MUD)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    // Frog Lights
    public static final Block WHITE_FROG_LIGHT      = createBlock("white_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.SNOW).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block MAGENTA_FROG_LIGHT    = createBlock("magenta_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_MAGENTA).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block LIGHT_BLUE_FROG_LIGHT = createBlock("light_blue_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_LIGHT_BLUE).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block YELLOW_FROG_LIGHT     = createBlock("yellow_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_YELLOW).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block LIME_FROG_LIGHT       = createBlock("lime_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_LIGHT_GREEN).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block PINK_FROG_LIGHT       = createBlock("pink_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_PINK).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block GRAY_FROG_LIGHT       = createBlock("gray_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_GRAY).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block LIGHT_GRAY_FROG_LIGHT = createBlock("light_gray_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_LIGHT_GRAY).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block CYAN_FROG_LIGHT       = createBlock("cyan_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_CYAN).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block BLUE_FROG_LIGHT       = createBlock("blue_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_BLUE).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block BROWN_FROG_LIGHT      = createBlock("brown_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_BROWN).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block RED_FROG_LIGHT        = createBlock("red_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_RED).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block BLACK_FROG_LIGHT      = createBlock("black_froglight", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.FROGLIGHT, MaterialColor.COLOR_BLACK).strength(0.3F).lightLevel((brightness) -> 15).sound(SoundType.FROGLIGHT)), CreativeModeTab.TAB_DECORATIONS);
    // Vines
    public static final Block SWAMP_VINE            = createBlock("swamp_vine", new SwampVineBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().randomTicks().strength(0.2F).sound(SoundType.VINE)), CreativeModeTab.TAB_DECORATIONS);
    // Plants
    public static final Block CATTAIL               = createBlock("cattail", new CattailBlock(), CreativeModeTab.TAB_DECORATIONS);
    public static final Block SINKING_LILY_PAD      = createBlockNoItem("sinking_lily_pad", new SinkingLilyPad(BlockBehaviour.Properties.copy(Blocks.LILY_PAD)));
    public static final Block BIG_LILY_PAD          = createWaterPlacementBlock("big_lily_pad", new BigLilyPadBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).randomTicks()), CreativeModeTab.TAB_DECORATIONS);
    public static final Block SMALL_LILY_PAD        = createWaterPlacementBlock("small_lily_pad", new SmallLilyPadBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).noCollission().randomTicks()), CreativeModeTab.TAB_DECORATIONS);
    // Kinda a Plant?
    public static final Block DECAYING_KELP         = createBlock("decaying_kelp", new DecayingKelpBlock(BlockBehaviour.Properties.copy(Blocks.DRIED_KELP_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    // Util
    public static final Block FERTILE_FARMLAND      = createBlock("fertile_farmland", new FertileFarmlandBlock(BlockBehaviour.Properties.copy(Blocks.FARMLAND)), CreativeModeTab.TAB_DECORATIONS);
    public static final Block GAS_LAMP              = createBlock("gas_lamp", new GasLampBlock(BlockBehaviour.Properties.copy(Blocks.LANTERN)), CreativeModeTab.TAB_DECORATIONS);

    public static void init() {}

    public static void registerBlockRenderTypes()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(BIG_LILY_PAD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CATTAIL, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GAS_LAMP, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SINKING_LILY_PAD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SMALL_LILY_PAD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SWAMP_VINE, RenderType.cutout());
    }

    private static Block createBlock(String name, Block block, CreativeModeTab group)
    {
        Block blockForItem = createBlockNoItem(name, block);
        Registry.register(Registry.ITEM, new ResourceLocation(Reference.MODID, name), new BlockItem(blockForItem, new Item.Properties().tab(group)));
        return block;
    }

    private static Block createBlockNoItem(String name, Block block)
    {
        return Registry.register(Registry.BLOCK, new ResourceLocation(Reference.MODID, name), block);
    }

    private static Block createWaterPlacementBlock(String name, Block block, CreativeModeTab group)
    {
        Block blockForItem = createBlockNoItem(name, block);
        Registry.register(Registry.ITEM, new ResourceLocation(Reference.MODID, name), new PlaceOnWaterBlockItem(blockForItem, new Item.Properties().tab(group)));
        return block;
    }
}