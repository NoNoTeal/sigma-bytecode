public class net.minecraft.util.text.NBTTextComponent$Block {
    public void NBTTextComponent$Block(java.lang.String p_i51294_1_, boolean p_i51294_2_, java.lang.String p_i51294_3_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent$Block, p_i51294_1_:String, p_i51294_2_:boolean)
        putfield:String(NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block, p_i51294_3_:String)
        putfield:\u3c25\u8d98\u7330\uf94d\u8bb0(NBTTextComponent$Block::field_218685_f, this:NBTTextComponent$Block, invokespecial:\u3c25\u8d98\u7330\uf94d\u8bb0(NBTTextComponent$Block::func_218682_b, this:NBTTextComponent$Block, getfield:String(NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block)))
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u3c25\u8d98\u7330\uf94d\u8bb0 func_218682_b(java.lang.String p_218682_1_) {
        try {
            return:\u3c25\u8d98\u7330\uf94d\u8bb0(invokevirtual:\u3c25\u8d98\u7330\uf94d\u8bb0(\u8413\uc2e8\u3e2a\u7043\uc9f6::parse, invokestatic:\u8413\uc2e8\u3e2a\u7043\uc9f6(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u3dd3\uc7fe\u8350\uc4d2\u600f\uc2e8), initobject:StringReader(StringReader::<init>, p_218682_1_:String)))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_4_12) {
            return:\u3c25\u8d98\u7330\uf94d\u8bb0(aconstnull:\u3c25\u8d98\u7330\uf94d\u8bb0())
        }
    }
    
    private void NBTTextComponent$Block(java.lang.String p_i51295_1_, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p_i51295_2_, boolean p_i51295_3_, java.lang.String p_i51295_4_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u3c25\u8d98\u7330\uf94d\u8bb0 p_i51295_5_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent$Block, p_i51295_1_:String, p_i51295_2_:\ub171\u47c2\u3bd6\u3776\u59ec, p_i51295_3_:boolean)
        putfield:String(NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block, p_i51295_4_:String)
        putfield:\u3c25\u8d98\u7330\uf94d\u8bb0(NBTTextComponent$Block::field_218685_f, this:NBTTextComponent$Block, p_i51295_5_:\u3c25\u8d98\u7330\uf94d\u8bb0)
    }
    
    public java.lang.String func_218683_k() {
        return:String(getfield:String(NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block))
    }
    
    public net.minecraft.util.text.NBTTextComponent$Block copyRaw() {
        return:NBTTextComponent$Block(initobject:NBTTextComponent$Block(NBTTextComponent$Block::<init>, getfield:String(NBTTextComponent$Block::field_218679_c, this:NBTTextComponent$Block), getfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent$Block::field_218680_d, this:NBTTextComponent$Block), getfield:boolean(NBTTextComponent$Block::field_218678_b, this:NBTTextComponent$Block), getfield:String(NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block), getfield:\u3c25\u8d98\u7330\uf94d\u8bb0(NBTTextComponent$Block::field_218685_f, this:NBTTextComponent$Block)))
    }
    
    public java.util.stream.Stream<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> func_218673_a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_218673_1_) {
        // java.lang.NullPointerException
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_17 : NBTTextComponent$Block
        
        if (cmpeq:boolean(this:NBTTextComponent$Block[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.NBTTextComponent$Block.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:NBTTextComponent$Block(net.minecraft.util.text.NBTTextComponent$Block.class, p_equals_1_:Object[expected:NBTTextComponent$Block])
        return:boolean(logicaland:boolean(logicaland:boolean(invokestatic:boolean(Objects::equals, getfield:String[expected:Object](NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block), getfield:String(NBTTextComponent$Block::field_218684_e, var_4_17:NBTTextComponent$Block)), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](NBTTextComponent$Block::field_218679_c, this:NBTTextComponent$Block), getfield:String(NBTTextComponent$Block::field_218679_c, var_4_17:NBTTextComponent$Block))), invokespecial:boolean(TextComponent::equals, this:NBTTextComponent$Block[expected:TextComponent], p_equals_1_:Object)))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("BlockPosArgument{pos='")), getfield:String(NBTTextComponent$Block::field_218684_e, this:NBTTextComponent$Block)), ldc:char(39)), ldc:String("path='")), getfield:String(NBTTextComponent$Block::field_218679_c, this:NBTTextComponent$Block)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](NBTTextComponent$Block::siblings, this:NBTTextComponent$Block)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:NBTTextComponent$Block[expected:TextComponent])), ldc:char(125))))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:NBTTextComponent$Block[expected:TextComponent](NBTTextComponent$Block::copyRaw, this:NBTTextComponent$Block))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:NBTTextComponent$Block[expected:IFormattableTextComponent](NBTTextComponent$Block::copyRaw, this:NBTTextComponent$Block))
    }
}
