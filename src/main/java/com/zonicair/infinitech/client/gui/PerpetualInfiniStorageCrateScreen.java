package com.zonicair.infinitech.client.gui;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.zonicair.infinitech.InfiniTech;
import com.zonicair.infinitech.container.PerpetualInfiniStorageCrateContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public class PerpetualInfiniStorageCrateScreen extends ContainerScreen<PerpetualInfiniStorageCrateContainer> {

    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(InfiniTech.MOD_ID, "textures/gui/perpetual_infini_storage_crate.png");

    public PerpetualInfiniStorageCrateScreen(PerpetualInfiniStorageCrateContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        this.guiLeft = 0;
        this.guiTop = 0;
        this.xSize = 255;
        this.ySize = 254;
    }

    @Override
    public void render(MatrixStack matrixStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY); // @mcp: func_230459_a_ = renderHoveredToolTip
    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack stack, int mouseX, int mouseY) {   //mcp: func_230451_b_ = drawGuiContainerForegroundLayer
        this.font.drawString(stack, this.title.getString(), 8.0F, 6.0F, 4210752);
        this.font.drawString(stack, this.playerInventory.getDisplayName().getString(), 47.0F, 164.0F, 4210752);

    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack stack, float partialTicks, int mouseX, int mouseY) { //mcp: func_230450_a_ = drawGuiContainerBackgroundLayer
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bindTexture(BACKGROUND_TEXTURE);
        int x = (this.width - this.xSize) / 2;
        int y = (this.height - this.ySize) / 2;
        this.blit(stack, x, y,0,0, this.xSize, this.ySize);
    }


}
