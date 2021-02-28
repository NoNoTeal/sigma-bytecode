public class net.minecraft.util.text.NBTTextComponent$Entity {
    public void NBTTextComponent$Entity(java.lang.String p_i51292_1_, boolean p_i51292_2_, java.lang.String p_i51292_3_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent$Entity, p_i51292_1_:String, p_i51292_2_:boolean)
        putfield:String(NBTTextComponent$Entity::field_218688_e, this:NBTTextComponent$Entity, p_i51292_3_:String)
        putfield:\u7bad\u71ae\ua61f\ub102\u8413(NBTTextComponent$Entity::field_218689_f, this:NBTTextComponent$Entity, invokestatic:\u7bad\u71ae\ua61f\ub102\u8413(NBTTextComponent$Entity::func_218686_b, p_i51292_3_:String))
    }
    
    private static \u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\u71ae\ua61f\ub102\u8413 func_218686_b(java.lang.String p_218686_0_) {
        try {
            return:\u7bad\u71ae\ua61f\ub102\u8413(invokevirtual:\u7bad\u71ae\ua61f\ub102\u8413(\u8413\uc4d2\u839e\u965f\u0800::\ud171\uceb8\u71ae\uae87\u74b1\ubb2b, initobject:\u8413\uc4d2\u839e\u965f\u0800(\u8413\uc4d2\u839e\u965f\u0800::<init>, initobject:StringReader(StringReader::<init>, p_218686_0_:String))))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_3_18) {
            return:\u7bad\u71ae\ua61f\ub102\u8413(aconstnull:\u7bad\u71ae\ua61f\ub102\u8413())
        }
    }
    
    private void NBTTextComponent$Entity(java.lang.String p_i51293_1_, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p_i51293_2_, boolean p_i51293_3_, java.lang.String p_i51293_4_, \u6435\ub8be\u718f\u6b0d\u67e9.\u7bad\u71ae\ua61f\ub102\u8413 p_i51293_5_) {
        invokespecial:NBTTextComponent(NBTTextComponent::<init>, this:NBTTextComponent$Entity, p_i51293_1_:String, p_i51293_2_:\ub171\u47c2\u3bd6\u3776\u59ec, p_i51293_3_:boolean)
        putfield:String(NBTTextComponent$Entity::field_218688_e, this:NBTTextComponent$Entity, p_i51293_4_:String)
        putfield:\u7bad\u71ae\ua61f\ub102\u8413(NBTTextComponent$Entity::field_218689_f, this:NBTTextComponent$Entity, p_i51293_5_:\u7bad\u71ae\ua61f\ub102\u8413)
    }
    
    public java.lang.String func_218687_k() {
        return:String(getfield:String(NBTTextComponent$Entity::field_218688_e, this:NBTTextComponent$Entity))
    }
    
    public net.minecraft.util.text.NBTTextComponent$Entity copyRaw() {
        return:NBTTextComponent$Entity(initobject:NBTTextComponent$Entity(NBTTextComponent$Entity::<init>, getfield:String(NBTTextComponent$Entity::field_218679_c, this:NBTTextComponent$Entity), getfield:\ub171\u47c2\u3bd6\u3776\u59ec(NBTTextComponent$Entity::field_218680_d, this:NBTTextComponent$Entity), getfield:boolean(NBTTextComponent$Entity::field_218678_b, this:NBTTextComponent$Entity), getfield:String(NBTTextComponent$Entity::field_218688_e, this:NBTTextComponent$Entity), getfield:\u7bad\u71ae\ua61f\ub102\u8413(NBTTextComponent$Entity::field_218689_f, this:NBTTextComponent$Entity)))
    }
    
    public java.util.stream.Stream<\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc> func_218673_a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_218673_1_) {
        if (cmpne:boolean(getfield:\u7bad\u71ae\ua61f\ub102\u8413(NBTTextComponent$Entity::field_218689_f, this:NBTTextComponent$Entity), aconstnull:\u7bad\u71ae\ua61f\ub102\u8413())) {
            return:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(invokeinterface:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, invokevirtual:List<? extends \u7d52\u718f\u3776\u6fb0\ub83f>[expected:Collection<Object>](\u7bad\u71ae\ua61f\ub102\u8413::\ucb79\ub83f\u56bd\u7006\u6d69\u62da, getfield:\u7bad\u71ae\ua61f\ub102\u8413(NBTTextComponent$Entity::field_218689_f, this:NBTTextComponent$Entity), p_218673_1_:\u8413\u5140\u64f2\uc9f6\u9937)), invokedynamic:Function<\u7d52\u718f\u3776\u6fb0\ub83f, \uc31c\uc87f\uc246\u3776\ub7dc>(apply:()Ljava/util/function/Function;)))
        }
        
        return:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(invokestatic:Stream<\uc31c\uc87f\uc246\u3776\ub7dc>(Stream<T>::empty))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_17 : NBTTextComponent$Entity
        
        if (cmpeq:boolean(this:NBTTextComponent$Entity[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.NBTTextComponent$Entity.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:NBTTextComponent$Entity(net.minecraft.util.text.NBTTextComponent$Entity.class, p_equals_1_:Object[expected:NBTTextComponent$Entity])
        return:boolean(logicaland:boolean(logicaland:boolean(invokestatic:boolean(Objects::equals, getfield:String[expected:Object](NBTTextComponent$Entity::field_218688_e, this:NBTTextComponent$Entity), getfield:String(NBTTextComponent$Entity::field_218688_e, var_4_17:NBTTextComponent$Entity)), invokestatic:boolean(Objects::equals, getfield:String[expected:Object](NBTTextComponent$Entity::field_218679_c, this:NBTTextComponent$Entity), getfield:String(NBTTextComponent$Entity::field_218679_c, var_4_17:NBTTextComponent$Entity))), invokespecial:boolean(TextComponent::equals, this:NBTTextComponent$Entity[expected:TextComponent], p_equals_1_:Object)))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("EntityNbtComponent{selector='")), getfield:String(NBTTextComponent$Entity::field_218688_e, this:NBTTextComponent$Entity)), ldc:char(39)), ldc:String("path='")), getfield:String(NBTTextComponent$Entity::field_218679_c, this:NBTTextComponent$Entity)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](NBTTextComponent$Entity::siblings, this:NBTTextComponent$Entity)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:NBTTextComponent$Entity[expected:TextComponent])), ldc:char(125))))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:NBTTextComponent$Entity[expected:TextComponent](NBTTextComponent$Entity::copyRaw, this:NBTTextComponent$Entity))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:NBTTextComponent$Entity[expected:IFormattableTextComponent](NBTTextComponent$Entity::copyRaw, this:NBTTextComponent$Entity))
    }
}
