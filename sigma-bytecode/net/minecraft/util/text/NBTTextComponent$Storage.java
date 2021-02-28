public class net.minecraft.util.text.NBTTextComponent$Storage {
    public void NBTTextComponent$Storage(java.lang.String p_i226087_1_, boolean p_i226087_2_, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p_i226087_3_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent$Storage, p_i226087_1_:String, p_i226087_2_:boolean)
        putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage, p_i226087_3_:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
    }
    
    public void NBTTextComponent$Storage(java.lang.String p_i226086_1_, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p_i226086_2_, boolean p_i226086_3_, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p_i226086_4_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent$Storage, p_i226086_1_:String, p_i226086_2_:\ub171\u47c2\u3bd6\u3776\u59ec, p_i226086_3_:boolean)
        putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage, p_i226086_4_:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 func_229726_k_() {
        return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage))
    }
    
    public net.minecraft.util.text.NBTTextComponent$Storage copyRaw() {
        return:NBTTextComponent$Storage(initobject:NBTTextComponent$Storage(NBTTextComponent$Storage::<init>, getfield:String(NBTTextComponent$Storage::field_218679_c, this:NBTTextComponent$Storage), getfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent$Storage::field_218680_d, this:NBTTextComponent$Storage), getfield:boolean(NBTTextComponent$Storage::field_218678_b, this:NBTTextComponent$Storage), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage)))
    }
    
    public java.util.stream.Stream<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> func_218673_a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_218673_1_) {
        return:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(invokestatic:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(Stream<T>::of, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u516c\u8aa5\u8df4\u71f1\u8258\u4d85::\u64f2\u3c25\u9255\u56bd\u4bc8\uc87f, invokevirtual:\u516c\u8aa5\u8df4\u71f1\u8258\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\u0a06\ua3b4\u3776\ubf56\uc29a\u12b2, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p_218673_1_:\u8413\u5140\u64f2\uc9f6\u9937)), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage))))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_17 : NBTTextComponent$Storage
        
        if (cmpeq:boolean(this:NBTTextComponent$Storage[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.NBTTextComponent$Storage.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:NBTTextComponent$Storage(net.minecraft.util.text.NBTTextComponent$Storage.class, p_equals_1_:Object[expected:NBTTextComponent$Storage])
        return:boolean(logicaland:boolean(logicaland:boolean(invokestatic:boolean(Objects::equals, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(NBTTextComponent$Storage::field_229725_e_, var_4_17:NBTTextComponent$Storage)), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](NBTTextComponent$Storage::field_218679_c, this:NBTTextComponent$Storage), getfield:String(NBTTextComponent$Storage::field_218679_c, var_4_17:NBTTextComponent$Storage))), invokespecial:boolean(TextComponent::equals, this:NBTTextComponent$Storage[expected:TextComponent], p_equals_1_:Object)))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("StorageNbtComponent{id='")), getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](NBTTextComponent$Storage::field_229725_e_, this:NBTTextComponent$Storage)), ldc:char(39)), ldc:String("path='")), getfield:String(NBTTextComponent$Storage::field_218679_c, this:NBTTextComponent$Storage)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](NBTTextComponent$Storage::siblings, this:NBTTextComponent$Storage)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:NBTTextComponent$Storage[expected:TextComponent])), ldc:char(125))))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:NBTTextComponent$Storage[expected:TextComponent](NBTTextComponent$Storage::copyRaw, this:NBTTextComponent$Storage))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:NBTTextComponent$Storage[expected:IFormattableTextComponent](NBTTextComponent$Storage::copyRaw, this:NBTTextComponent$Storage))
    }
}
