public class net.minecraft.util.text.event.HoverEvent$EntityHover {
    public void HoverEvent$EntityHover(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> type, java.util.UUID id, net.minecraft.util.text.ITextComponent name) {
        invokespecial:Object(Object::<init>, this:HoverEvent$EntityHover)
        putfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(HoverEvent$EntityHover::type, this:HoverEvent$EntityHover, type:\u9255\u0c95\u4cd9\ube23\u760c<?>)
        putfield:UUID(HoverEvent$EntityHover::id, this:HoverEvent$EntityHover, id:UUID)
        putfield:ITextComponent(HoverEvent$EntityHover::name, this:HoverEvent$EntityHover, name:ITextComponent)
    }
    
    public static net.minecraft.util.text.event.HoverEvent$EntityHover deserialize(com.google.gson.JsonElement element) {
        // java.lang.NullPointerException
    }
    
    public static net.minecraft.util.text.event.HoverEvent$EntityHover deserialize(net.minecraft.util.text.ITextComponent component) {
        // java.lang.NullPointerException
    }
    
    public com.google.gson.JsonElement serialize() {
        var_3_0A : JsonObject
        
        var_3_0A = initobject:JsonObject(JsonObject::<init>)
        invokevirtual:void(JsonObject::addProperty, var_3_0A:JsonObject, ldc:String("type"), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(HoverEvent$EntityHover::type, this:HoverEvent$EntityHover))))
        invokevirtual:void(JsonObject::addProperty, var_3_0A:JsonObject, ldc:String("id"), invokevirtual:String(UUID::toString, getfield:UUID(HoverEvent$EntityHover::id, this:HoverEvent$EntityHover)))
        
        if (cmpne:boolean(getfield:ITextComponent(HoverEvent$EntityHover::name, this:HoverEvent$EntityHover), aconstnull:ITextComponent())) {
            invokevirtual:void(JsonObject::add, var_3_0A:JsonObject, ldc:String("name"), invokestatic:JsonElement(ITextComponent$Serializer::toJsonTree, getfield:ITextComponent(HoverEvent$EntityHover::name, this:HoverEvent$EntityHover)))
        }
        
        return:JsonElement(var_3_0A:JsonObject)
    }
    
    public java.util.List<net.minecraft.util.text.ITextComponent> getTooltip() {
        if (cmpeq:boolean(getfield:List<ITextComponent>(HoverEvent$EntityHover::field_240680_d_, this:HoverEvent$EntityHover), aconstnull:List<ITextComponent>())) {
            putfield:List<ITextComponent>(HoverEvent$EntityHover::field_240680_d_, this:HoverEvent$EntityHover, invokestatic:ArrayList[expected:List<ITextComponent>](Lists::newArrayList))
            
            if (cmpne:boolean(getfield:ITextComponent(HoverEvent$EntityHover::name, this:HoverEvent$EntityHover), aconstnull:ITextComponent())) {
                invokeinterface:boolean(List<ITextComponent>::add, getfield:List<ITextComponent>(HoverEvent$EntityHover::field_240680_d_, this:HoverEvent$EntityHover), getfield:ITextComponent(HoverEvent$EntityHover::name, this:HoverEvent$EntityHover))
            }
            
            invokeinterface:boolean(List<TranslationTextComponent>::add, getfield:List<ITextComponent>(HoverEvent$EntityHover::field_240680_d_, this:HoverEvent$EntityHover), initobject:TranslationTextComponent(TranslationTextComponent::<init>, ldc:String("gui.entity_tooltip.type"), initarray:Object[](java.lang.Object[].class, invokevirtual:ITextComponent[expected:Object](\u9255\u0c95\u4cd9\ube23\u760c<T>::\u392e\ua6bd\u3bd6\u5f50\u760c\u92ee, getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(HoverEvent$EntityHover::type, this:HoverEvent$EntityHover)))))
            invokeinterface:boolean(List<StringTextComponent>::add, getfield:List<ITextComponent>(HoverEvent$EntityHover::field_240680_d_, this:HoverEvent$EntityHover), initobject:StringTextComponent(StringTextComponent::<init>, invokevirtual:String(UUID::toString, getfield:UUID(HoverEvent$EntityHover::id, this:HoverEvent$EntityHover))))
        }
        
        return:List<ITextComponent>(getfield:List<ITextComponent>(HoverEvent$EntityHover::field_240680_d_, this:HoverEvent$EntityHover))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_1D : HoverEvent$EntityHover
        
        if (cmpeq:boolean(this:HoverEvent$EntityHover[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicaland:boolean(cmpne:boolean(p_equals_1_:Object, aconstnull:Object()), cmpeq:boolean(invokevirtual:Class<? extends HoverEvent$EntityHover>(HoverEvent$EntityHover::getClass, this:HoverEvent$EntityHover), invokevirtual:Class<?>(Object::getClass, p_equals_1_:Object)))) {
            var_4_1D = checkcast:HoverEvent$EntityHover(net.minecraft.util.text.event.HoverEvent$EntityHover.class, p_equals_1_:Object[expected:HoverEvent$EntityHover])
            return:boolean(logicaland:boolean(logicaland:boolean(invokevirtual:boolean(Object::equals, getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](HoverEvent$EntityHover::type, this:HoverEvent$EntityHover), getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(HoverEvent$EntityHover::type, var_4_1D:HoverEvent$EntityHover)), invokevirtual:boolean(UUID::equals, getfield:UUID(HoverEvent$EntityHover::id, this:HoverEvent$EntityHover), getfield:UUID(HoverEvent$EntityHover::id, var_4_1D:HoverEvent$EntityHover))), invokestatic:boolean(Objects::equals, getfield:ITextComponent[expected:Object](HoverEvent$EntityHover::name, this:HoverEvent$EntityHover), getfield:ITextComponent(HoverEvent$EntityHover::name, var_4_1D:HoverEvent$EntityHover))))
        }
        
        return:boolean(ldc:boolean(0))
    }
    
    public int hashCode() {
        return:int(add:int(mul:int(ldc:int(31), add:int(mul:int(ldc:int(31), invokevirtual:int(Object::hashCode, getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](HoverEvent$EntityHover::type, this:HoverEvent$EntityHover))), invokevirtual:int(UUID::hashCode, getfield:UUID(HoverEvent$EntityHover::id, this:HoverEvent$EntityHover)))), ternaryop:int(cmpne:boolean(getfield:ITextComponent(HoverEvent$EntityHover::name, this:HoverEvent$EntityHover), aconstnull:ITextComponent()), invokevirtual:int(Object::hashCode, getfield:ITextComponent[expected:Object](HoverEvent$EntityHover::name, this:HoverEvent$EntityHover)), ldc:int(0))))
    }
}
