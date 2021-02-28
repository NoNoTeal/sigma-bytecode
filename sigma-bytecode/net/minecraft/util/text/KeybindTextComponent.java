public class net.minecraft.util.text.KeybindTextComponent {
    public void KeybindTextComponent(java.lang.String keybind) {
        invokespecial:TextComponent(TextComponent::<init>, this:KeybindTextComponent)
        putfield:String(KeybindTextComponent::keybind, this:KeybindTextComponent, keybind:String)
    }
    
    public static void func_240696_a_(java.util.function.Function<java.lang.String, java.util.function.Supplier<net.minecraft.util.text.ITextComponent>> p_240696_0_) {
        putstatic:Function<String, Supplier<ITextComponent>>(KeybindTextComponent::displaySupplierFunction, p_240696_0_:Function<String, Supplier<ITextComponent>>)
    }
    
    private net.minecraft.util.text.ITextComponent func_240698_i_() {
        if (cmpeq:boolean(getfield:Supplier<ITextComponent>(KeybindTextComponent::displaySupplier, this:KeybindTextComponent), aconstnull:Supplier<ITextComponent>())) {
            putfield:Supplier<ITextComponent>(KeybindTextComponent::displaySupplier, this:KeybindTextComponent, checkcast:Supplier<ITextComponent>(java.util.function.Supplier<net.minecraft.util.text.ITextComponent>.class, invokeinterface:Supplier<ITextComponent>(Function<String, Supplier<ITextComponent>>::apply, getstatic:Function<String, Supplier<ITextComponent>>(KeybindTextComponent::displaySupplierFunction), getfield:String(KeybindTextComponent::keybind, this:KeybindTextComponent))))
        }
        
        return:ITextComponent(checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:ITextComponent(Supplier<ITextComponent>::get, getfield:Supplier<ITextComponent>(KeybindTextComponent::displaySupplier, this:KeybindTextComponent))))
    }
    
    public java.util.Optional<T> func_230533_b_(net.minecraft.util.text.ITextProperties$ITextAcceptor<T> p_230533_1_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextComponent::func_230438_a_, invokespecial:ITextComponent(KeybindTextComponent::func_240698_i_, this:KeybindTextComponent), p_230533_1_:ITextProperties$ITextAcceptor<T>))
    }
    
    public java.util.Optional<T> func_230534_b_(net.minecraft.util.text.ITextProperties$IStyledTextAcceptor<T> p_230534_1_, net.minecraft.util.text.Style p_230534_2_) {
        return:Optional<T>(invokeinterface:Optional<T>(ITextComponent::func_230439_a_, invokespecial:ITextComponent(KeybindTextComponent::func_240698_i_, this:KeybindTextComponent), p_230534_1_:ITextProperties$IStyledTextAcceptor<T>, p_230534_2_:Style))
    }
    
    public net.minecraft.util.text.KeybindTextComponent copyRaw() {
        return:KeybindTextComponent(initobject:KeybindTextComponent(KeybindTextComponent::<init>, getfield:String(KeybindTextComponent::keybind, this:KeybindTextComponent)))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        return:boolean(logicalor:boolean(cmpeq:boolean(this:KeybindTextComponent[expected:Object], p_equals_1_:Object), logicaland:boolean(logicaland:boolean(instanceof:boolean(net.minecraft.util.text.KeybindTextComponent.class, p_equals_1_:Object), invokevirtual:boolean(String::equals, getfield:String(KeybindTextComponent::keybind, this:KeybindTextComponent), getfield:String[expected:Object](KeybindTextComponent::keybind, checkcast:KeybindTextComponent(net.minecraft.util.text.KeybindTextComponent.class, p_equals_1_:Object[expected:KeybindTextComponent])))), invokespecial:boolean(TextComponent::equals, this:KeybindTextComponent[expected:TextComponent], p_equals_1_:Object))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("KeybindComponent{keybind='")), getfield:String(KeybindTextComponent::keybind, this:KeybindTextComponent)), ldc:char(39)), ldc:String(", siblings=")), getfield:List<ITextComponent>[expected:Object](KeybindTextComponent::siblings, this:KeybindTextComponent)), ldc:String(", style=")), invokevirtual:Style[expected:Object](TextComponent::getStyle, this:KeybindTextComponent[expected:TextComponent])), ldc:char(125))))
    }
    
    public java.lang.String getKeybind() {
        return:String(getfield:String(KeybindTextComponent::keybind, this:KeybindTextComponent))
    }
    
    public net.minecraft.util.text.TextComponent copyRaw() {
        return:TextComponent(invokevirtual:KeybindTextComponent[expected:TextComponent](KeybindTextComponent::copyRaw, this:KeybindTextComponent))
    }
    
    public net.minecraft.util.text.IFormattableTextComponent copyRaw() {
        return:IFormattableTextComponent(invokevirtual:KeybindTextComponent[expected:IFormattableTextComponent](KeybindTextComponent::copyRaw, this:KeybindTextComponent))
    }
    
    private static java.util.function.Supplier lambda$static$1(java.lang.String p_193635_0_) {
        return:Supplier(bind:Supplier<StringTextComponent>(() -> return:StringTextComponent(initobject:StringTextComponent[expected:Object](StringTextComponent::<init>, p_193635_0_:String))))
    }
    
    private static net.minecraft.util.text.ITextComponent lambda$null$0(java.lang.String p_193635_0_) {
        return:ITextComponent(initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p_193635_0_:String))
    }
    
    static {
        putstatic:Function<String, Supplier<ITextComponent>>(KeybindTextComponent::displaySupplierFunction, bind:Function<String, Supplier<ITextComponent>>((p_193635_0_:String) -> return:Supplier<StringTextComponent>(bind:Supplier<StringTextComponent>[expected:StringTextComponent](() -> return:StringTextComponent(initobject:StringTextComponent(StringTextComponent::<init>, p_193635_0_:String))))))
    }
}
