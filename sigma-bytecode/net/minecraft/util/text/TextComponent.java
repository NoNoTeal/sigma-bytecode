public abstract class net.minecraft.util.text.TextComponent {
    public void TextComponent() {
        invokespecial:Object(Object::<init>, this:TextComponent)
        putfield:List<ITextComponent>(TextComponent::siblings, this:TextComponent, invokestatic:ArrayList[expected:List<ITextComponent>](Lists::newArrayList))
        putfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(TextComponent::field_244278_d, this:TextComponent, getstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u64f2\u3c25\u67e9\u8d90\u67d0\u8709))
        putfield:Style(TextComponent::style, this:TextComponent, getstatic:Style(Style::EMPTY))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent append(net.minecraft.util.text.ITextComponent sibling) {
        invokeinterface:boolean(List<ITextComponent>::add, getfield:List<ITextComponent>(TextComponent::siblings, this:TextComponent), sibling:ITextComponent)
        return:IFormattableTextComponent(this:TextComponent[expected:IFormattableTextComponent])
    }
    
    public java.lang.String getUnformattedComponentText() {
        return:String(ldc:String(""))
    }
    
    public java.util.List<net.minecraft.util.text.ITextComponent> getSiblings() {
        return:List<ITextComponent>(getfield:List<ITextComponent>(TextComponent::siblings, this:TextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent setStyle(net.minecraft.util.text.Style style) {
        putfield:Style(TextComponent::style, this:TextComponent, style:Style)
        return:IFormattableTextComponent(this:TextComponent[expected:IFormattableTextComponent])
    }
    
    public net.minecraft.util.text.Style getStyle() {
        return:Style(getfield:Style(TextComponent::style, this:TextComponent))
    }
    
    public abstract net.minecraft.util.text.TextComponent copyRaw();
    
    public final net.minecraft.util.text.IFormattableTextComponent deepCopy() {
        var_3_07 : TextComponent
        
        var_3_07 = invokevirtual:TextComponent(TextComponent::copyRaw, this:TextComponent)
        invokeinterface:boolean(List<ITextComponent>::addAll, getfield:List<ITextComponent>(TextComponent::siblings, var_3_07:TextComponent), getfield:List<ITextComponent>[expected:Collection<? extends ITextComponent>](TextComponent::siblings, this:TextComponent))
        invokevirtual:IFormattableTextComponent(TextComponent::setStyle, var_3_07:TextComponent, getfield:Style(TextComponent::style, this:TextComponent))
        return:IFormattableTextComponent(var_3_07:TextComponent[expected:IFormattableTextComponent])
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d func_241878_f() {
        var_3_06 : LanguageMap
        
        var_3_06 = invokestatic:LanguageMap(LanguageMap::getInstance)
        
        if (cmpne:boolean(getfield:LanguageMap(TextComponent::field_244279_e, this:TextComponent), var_3_06:LanguageMap)) {
            putfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(TextComponent::field_244278_d, this:TextComponent, invokevirtual:\u718f\u8413\u1833\u72f1\u5fe1\u927d(LanguageMap::func_241870_a, var_3_06:LanguageMap, this:TextComponent[expected:ITextProperties]))
            putfield:LanguageMap(TextComponent::field_244279_e, this:TextComponent, var_3_06:LanguageMap)
        }
        
        return:\u718f\u8413\u1833\u72f1\u5fe1\u927d(getfield:\u718f\u8413\u1833\u72f1\u5fe1\u927d(TextComponent::field_244278_d, this:TextComponent))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_17 : TextComponent
        
        if (cmpeq:boolean(this:TextComponent[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalnot:boolean(instanceof:boolean(net.minecraft.util.text.TextComponent.class, p_equals_1_:Object))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_17 = checkcast:TextComponent(net.minecraft.util.text.TextComponent.class, p_equals_1_:Object[expected:TextComponent])
        return:boolean(logicaland:boolean(invokeinterface:boolean(List<E>::equals, getfield:List<ITextComponent>(TextComponent::siblings, this:TextComponent), getfield:List<ITextComponent>(TextComponent::siblings, var_4_17:TextComponent)), invokestatic:boolean(Objects::equals, invokevirtual:Style[expected:Object](TextComponent::getStyle, this:TextComponent), invokevirtual:Style(TextComponent::getStyle, var_4_17:TextComponent))))
    }
    
    public int hashCode() {
        return:int(invokestatic:int(Objects::hash, initarray:Object[](java.lang.Object[].class, invokevirtual:Style[expected:Object](TextComponent::getStyle, this:TextComponent), getfield:List<ITextComponent>[expected:Object](TextComponent::siblings, this:TextComponent))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("BaseComponent{style=")), getfield:Style[expected:Object](TextComponent::style, this:TextComponent)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](TextComponent::siblings, this:TextComponent)), ldc:char(125))))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:TextComponent[expected:IFormattableTextComponent](TextComponent::copyRaw, this:TextComponent))
    }
}
