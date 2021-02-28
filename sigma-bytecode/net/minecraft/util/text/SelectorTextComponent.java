public class net.minecraft.util.text.SelectorTextComponent {
    public void SelectorTextComponent(java.lang.String selectorIn) {
        var_4_0D : \u7bad\u71ae\ua61f\ub102\u8413
        entityselectorparser : \u8413\uc4d2\u839e\u965f\u0800
        var_5_2A : CommandSyntaxException
        
        invokespecial:TextComponent(TextComponent::<init>, this:SelectorTextComponent)
        putfield:String(SelectorTextComponent::selector, this:SelectorTextComponent, selectorIn:String)
        var_4_0D = aconstnull:\u7bad\u71ae\ua61f\ub102\u8413()
        
        try {
            entityselectorparser = invokevirtual:\u7bad\u71ae\ua61f\ub102\u8413[expected:\u8413\uc4d2\u839e\u965f\u0800](\u8413\uc4d2\u839e\u965f\u0800::\ud171\uceb8\u71ae\uae87\u74b1\ubb2b, initobject:\u8413\uc4d2\u839e\u965f\u0800(\u8413\uc4d2\u839e\u965f\u0800::<init>, initobject:StringReader(StringReader::<init>, selectorIn:String)))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_5_2A) {
            invokeinterface:void(Logger::warn, getstatic:Logger(SelectorTextComponent::LOGGER), ldc:String("Invalid selector component: {}"), selectorIn:String[expected:Object], invokevirtual:String[expected:Object](CommandSyntaxException::getMessage, var_5_2A:CommandSyntaxException))
        }
        
        putfield:\u7bad\u71ae\ua61f\ub102\u8413(SelectorTextComponent::field_197670_d, this:SelectorTextComponent, var_4_0D:\u7bad\u71ae\ua61f\ub102\u8413)
    }
    
    public java.lang.String getSelector() {
        return:String(getfield:String(SelectorTextComponent::selector, this:SelectorTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent func_230535_a_(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p_230535_1_, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p_230535_2_, int p_230535_3_) {
        return:IFormattableTextComponent(ternaryop:IFormattableTextComponent(logicaland:boolean(cmpne:boolean(p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937, aconstnull:\u8413\u5140\u64f2\uc9f6\u9937()), cmpne:boolean(getfield:\u7bad\u71ae\ua61f\ub102\u8413(SelectorTextComponent::field_197670_d, this:SelectorTextComponent), aconstnull:\u7bad\u71ae\ua61f\ub102\u8413())), invokestatic:IFormattableTextComponent(\u7bad\u71ae\ua61f\ub102\u8413::\u6198\ub1b9\uc7fe\ub32d\uff55\u416d, invokevirtual:List<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u7bad\u71ae\ua61f\ub102\u8413::\ucb79\ub83f\u56bd\u7006\u6d69\u62da, getfield:\u7bad\u71ae\ua61f\ub102\u8413(SelectorTextComponent::field_197670_d, this:SelectorTextComponent), p_230535_1_:\u8413\u5140\u64f2\uc9f6\u9937)), initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, ldc:String(""))))
    }
    
    public java.lang.String getUnformattedComponentText() {
        return:String(getfield:String(SelectorTextComponent::selector, this:SelectorTextComponent))
    }
    
    public net.minecraft.util.text.SelectorTextComponent copyRaw() {
        return:SelectorTextComponent(initobject:SelectorTextComponent(SelectorTextComponent::<init>, getfield:String(SelectorTextComponent::selector, this:SelectorTextComponent)))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        return:boolean(logicalor:boolean(cmpeq:boolean(this:SelectorTextComponent[expected:Object], p_equals_1_:Object), logicaland:boolean(logicaland:boolean(instanceof:boolean(net.minecraft.util.text.SelectorTextComponent.class, p_equals_1_:Object), invokevirtual:boolean(String::equals, getfield:String(SelectorTextComponent::selector, this:SelectorTextComponent), getfield:String[expected:Object](SelectorTextComponent::selector, checkcast:SelectorTextComponent(net.minecraft.util.text.SelectorTextComponent.class, p_equals_1_:Object[expected:SelectorTextComponent])))), invokespecial:boolean(TextComponent::equals, this:SelectorTextComponent[expected:TextComponent], p_equals_1_:Object))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("SelectorComponent{pattern='")), getfield:String(SelectorTextComponent::selector, this:SelectorTextComponent)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](SelectorTextComponent::siblings, this:SelectorTextComponent)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:SelectorTextComponent[expected:TextComponent])), ldc:char(125))))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:SelectorTextComponent[expected:TextComponent](SelectorTextComponent::copyRaw, this:SelectorTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:SelectorTextComponent[expected:IFormattableTextComponent](SelectorTextComponent::copyRaw, this:SelectorTextComponent))
    }
    
    static {
        putstatic:Logger(SelectorTextComponent::LOGGER, invokestatic:Logger(LogManager::getLogger))
    }
}
