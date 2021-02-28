public class net.minecraft.util.text.event.HoverEvent$Action<T> {
    public void HoverEvent$Action(java.lang.String canonicalName, boolean allowedInChat, java.util.function.Function<com.google.gson.JsonElement, T> p_i232565_3_, java.util.function.Function<T, com.google.gson.JsonElement> p_i232565_4_, java.util.function.Function<net.minecraft.util.text.ITextComponent, T> p_i232565_5_) {
        invokespecial:Object(Object::<init>, this:HoverEvent$Action<T>)
        putfield:String(HoverEvent$Action::canonicalName, this:HoverEvent$Action<T>, canonicalName:String)
        putfield:boolean(HoverEvent$Action::allowedInChat, this:HoverEvent$Action<T>, allowedInChat:boolean)
        putfield:Function<JsonElement, T>(HoverEvent$Action::field_240665_g_, this:HoverEvent$Action<T>, p_i232565_3_:Function<JsonElement, T>)
        putfield:Function<T, JsonElement>(HoverEvent$Action::field_240666_h_, this:HoverEvent$Action<T>, p_i232565_4_:Function<T, JsonElement>)
        putfield:Function<ITextComponent, T>(HoverEvent$Action::field_240667_i_, this:HoverEvent$Action<T>, p_i232565_5_:Function<ITextComponent, T>)
    }
    
    public boolean shouldAllowInChat() {
        return:boolean(getfield:boolean(HoverEvent$Action::allowedInChat, this:HoverEvent$Action<T>))
    }
    
    public java.lang.String getCanonicalName() {
        return:String(getfield:String(HoverEvent$Action::canonicalName, this:HoverEvent$Action<T>))
    }
    
    public static net.minecraft.util.text.event.HoverEvent$Action getValueByCanonicalName(java.lang.String canonicalNameIn) {
        return:HoverEvent$Action(checkcast:HoverEvent$Action(net.minecraft.util.text.event.HoverEvent$Action.class, invokeinterface:HoverEvent$Action(Map<String, HoverEvent$Action>::get, getstatic:Map<String, HoverEvent$Action>(HoverEvent$Action::NAME_MAPPING), canonicalNameIn:String[expected:Object])))
    }
    
    private T castParameter(java.lang.Object parameter) {
        return:T(parameter:Object[expected:T])
    }
    
    public net.minecraft.util.text.event.HoverEvent deserialize(com.google.gson.JsonElement element) {
        var_4_0D : T
        
        var_4_0D = invokeinterface:T(Function<JsonElement, T>::apply, getfield:Function<JsonElement, T>(HoverEvent$Action::field_240665_g_, this:HoverEvent$Action<T>), element:JsonElement)
        return:HoverEvent(ternaryop:HoverEvent(cmpeq:boolean(var_4_0D:T, aconstnull:T()), aconstnull:HoverEvent(), initobject:HoverEvent(HoverEvent::<init>, this:HoverEvent$Action<T>, var_4_0D:T)))
    }
    
    public net.minecraft.util.text.event.HoverEvent deserialize(net.minecraft.util.text.ITextComponent component) {
        var_4_0D : T
        
        var_4_0D = invokeinterface:T(Function<ITextComponent, T>::apply, getfield:Function<ITextComponent, T>(HoverEvent$Action::field_240667_i_, this:HoverEvent$Action<T>), component:ITextComponent)
        return:HoverEvent(ternaryop:HoverEvent(cmpeq:boolean(var_4_0D:T, aconstnull:T()), aconstnull:HoverEvent(), initobject:HoverEvent(HoverEvent::<init>, this:HoverEvent$Action<T>, var_4_0D:T)))
    }
    
    public com.google.gson.JsonElement serialize(java.lang.Object parameter) {
        return:JsonElement(checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Function<T, JsonElement>::apply, getfield:Function<T, JsonElement>(HoverEvent$Action::field_240666_h_, this:HoverEvent$Action<T>), invokespecial:T(HoverEvent$Action<T>::castParameter, this:HoverEvent$Action<T>, parameter:Object))))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("<action ")), getfield:String(HoverEvent$Action::canonicalName, this:HoverEvent$Action<T>)), ldc:String(">"))))
    }
    
    private static net.minecraft.util.text.event.HoverEvent$Action lambda$static$3(net.minecraft.util.text.event.HoverEvent$Action p_240671_0_) {
        return:HoverEvent$Action(p_240671_0_:HoverEvent$Action)
    }
    
    private static net.minecraft.util.text.event.HoverEvent$ItemHover lambda$static$2(net.minecraft.util.text.ITextComponent p_240675_0_) {
        return:HoverEvent$ItemHover(invokestatic:HoverEvent$ItemHover(HoverEvent$ItemHover::access$100, p_240675_0_:ITextComponent))
    }
    
    private static com.google.gson.JsonElement lambda$static$1(net.minecraft.util.text.event.HoverEvent$ItemHover p_240676_0_) {
        return:JsonElement(invokestatic:JsonElement(HoverEvent$ItemHover::access$200, p_240676_0_:HoverEvent$ItemHover))
    }
    
    private static net.minecraft.util.text.event.HoverEvent$ItemHover lambda$static$0(com.google.gson.JsonElement p_240673_0_) {
        return:HoverEvent$ItemHover(invokestatic:HoverEvent$ItemHover(HoverEvent$ItemHover::access$300, p_240673_0_:JsonElement))
    }
    
    public static java.lang.Object access$000(net.minecraft.util.text.event.HoverEvent$Action x0, java.lang.Object x1) {
        return:Object(invokespecial:Object(HoverEvent$Action<Object>::castParameter, x0:HoverEvent$Action<Object>, x1:Object))
    }
    
    static {
        putstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT, initobject:HoverEvent$Action<ITextComponent>(HoverEvent$Action<ITextComponent>::<init>, ldc:String("show_text"), ldc:boolean(1), invokedynamic:Function<JsonElement, IFormattableTextComponent>(apply:()Ljava/util/function/Function;), invokedynamic:Function<ITextComponent, JsonElement>(apply:()Ljava/util/function/Function;), invokestatic:Function<ITextComponent, ITextComponent>(Function<T, R>::identity)))
        putstatic:HoverEvent$Action<HoverEvent$ItemHover>(HoverEvent$Action::SHOW_ITEM, initobject:HoverEvent$Action<HoverEvent$ItemHover>(HoverEvent$Action<HoverEvent$ItemHover>::<init>, ldc:String("show_item"), ldc:boolean(1), bind:Function<Object, HoverEvent$ItemHover>((p_240673_0_:JsonElement) -> return:HoverEvent$ItemHover(invokestatic:HoverEvent$ItemHover(HoverEvent$ItemHover::access$300, p_240673_0_:JsonElement))), bind:Function<Object, JsonElement>((p_240676_0_:HoverEvent$ItemHover) -> return:JsonElement(invokestatic:JsonElement(HoverEvent$ItemHover::access$200, p_240676_0_:HoverEvent$ItemHover))), bind:Function<Object, HoverEvent$ItemHover>((p_240675_0_:ITextComponent) -> return:HoverEvent$ItemHover(invokestatic:HoverEvent$ItemHover(HoverEvent$ItemHover::access$100, p_240675_0_:ITextComponent)))))
        putstatic:HoverEvent$Action<HoverEvent$EntityHover>(HoverEvent$Action::SHOW_ENTITY, initobject:HoverEvent$Action<HoverEvent$EntityHover>(HoverEvent$Action<HoverEvent$EntityHover>::<init>, ldc:String("show_entity"), ldc:boolean(1), invokedynamic:Function<JsonElement, HoverEvent$EntityHover>(apply:()Ljava/util/function/Function;), invokedynamic:Function<HoverEvent$EntityHover, JsonElement>(apply:()Ljava/util/function/Function;), invokedynamic:Function<ITextComponent, HoverEvent$EntityHover>(apply:()Ljava/util/function/Function;)))
        putstatic:Map<String, HoverEvent$Action>(HoverEvent$Action::NAME_MAPPING, checkcast:Map<String, HoverEvent$Action>(java.util.Map<java.lang.String, net.minecraft.util.text.event.HoverEvent$Action>.class, invokeinterface:Map<String, HoverEvent$Action>(Stream<HoverEvent$Action>::collect, invokestatic:Stream<HoverEvent$Action>(Stream<T>::of, initarray:HoverEvent$Action[](net.minecraft.util.text.event.HoverEvent$Action[].class, getstatic:HoverEvent$Action<ITextComponent>(HoverEvent$Action::SHOW_TEXT), getstatic:HoverEvent$Action<HoverEvent$ItemHover>(HoverEvent$Action::SHOW_ITEM), getstatic:HoverEvent$Action<HoverEvent$EntityHover>(HoverEvent$Action::SHOW_ENTITY))), invokestatic:Collector(ImmutableMap::toImmutableMap, invokedynamic:Function<T, String>(apply:()Ljava/util/function/Function;), bind:Function<Object, HoverEvent$Action>((p_240671_0_:HoverEvent$Action) -> return:HoverEvent$Action(p_240671_0_:HoverEvent$Action))))))
    }
}
