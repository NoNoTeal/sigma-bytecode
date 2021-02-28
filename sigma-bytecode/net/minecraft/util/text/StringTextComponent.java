public class net.minecraft.util.text.StringTextComponent {
    public void StringTextComponent(java.lang.String msg) {
        invokespecial:TextComponent(TextComponent::<init>, this:StringTextComponent)
        putfield:String(StringTextComponent::text, this:StringTextComponent, msg:String)
    }
    
    public java.lang.String getText() {
        return:String(getfield:String(StringTextComponent::text, this:StringTextComponent))
    }
    
    public java.lang.String getUnformattedComponentText() {
        return:String(getfield:String(StringTextComponent::text, this:StringTextComponent))
    }
    
    public net.minecraft.util.text.StringTextComponent copyRaw() {
        return:StringTextComponent(initobject:StringTextComponent(StringTextComponent::<init>, getfield:String(StringTextComponent::text, this:StringTextComponent)))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        return:boolean(logicalor:boolean(cmpeq:boolean(this:StringTextComponent[expected:Object], p_equals_1_:Object), logicaland:boolean(logicaland:boolean(instanceof:boolean(net.minecraft.util.text.StringTextComponent.class, p_equals_1_:Object), invokevirtual:boolean(String::equals, getfield:String(StringTextComponent::text, this:StringTextComponent), invokevirtual:String[expected:Object](StringTextComponent::getText, checkcast:StringTextComponent(net.minecraft.util.text.StringTextComponent.class, p_equals_1_:Object[expected:StringTextComponent])))), invokespecial:boolean(TextComponent::equals, this:StringTextComponent[expected:TextComponent], p_equals_1_:Object))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("TextComponent{text='")), getfield:String(StringTextComponent::text, this:StringTextComponent)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](StringTextComponent::siblings, this:StringTextComponent)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:StringTextComponent[expected:TextComponent])), ldc:char(125))))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:StringTextComponent[expected:TextComponent](StringTextComponent::copyRaw, this:StringTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::copyRaw, this:StringTextComponent))
    }
    
    static {
        putstatic:ITextComponent(StringTextComponent::EMPTY, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, ldc:String("")))
    }
}
