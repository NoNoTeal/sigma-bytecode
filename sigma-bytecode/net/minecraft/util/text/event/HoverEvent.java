public class net.minecraft.util.text.event.HoverEvent {
    public void HoverEvent(net.minecraft.util.text.event.HoverEvent$Action<T> action, T value) {
        invokespecial:Object(Object::<init>, this:HoverEvent)
        putfield:HoverEvent$Action<?>(HoverEvent::action, this:HoverEvent, action:HoverEvent$Action<T>)
        putfield:Object(HoverEvent::value, this:HoverEvent, value:T[expected:Object])
    }
    
    public net.minecraft.util.text.event.HoverEvent$Action<?> getAction() {
        return:HoverEvent$Action<?>(getfield:HoverEvent$Action<?>(HoverEvent::action, this:HoverEvent))
    }
    
    public T getParameter(net.minecraft.util.text.event.HoverEvent$Action<T> actionType) {
        return:T(ternaryop:Object[expected:T](cmpeq:boolean(getfield:HoverEvent$Action<?>(HoverEvent::action, this:HoverEvent), actionType:HoverEvent$Action<T>), invokestatic:Object(HoverEvent$Action<Object>::access$000, actionType:HoverEvent$Action<T>, getfield:Object(HoverEvent::value, this:HoverEvent)), aconstnull:Object()))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_1D : HoverEvent
        
        if (cmpeq:boolean(this:HoverEvent[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicaland:boolean(cmpne:boolean(p_equals_1_:Object, aconstnull:Object()), cmpeq:boolean(invokevirtual:Class<? extends HoverEvent>(HoverEvent::getClass, this:HoverEvent), invokevirtual:Class<?>(Object::getClass, p_equals_1_:Object)))) {
            var_4_1D = checkcast:HoverEvent(net.minecraft.util.text.event.HoverEvent.class, p_equals_1_:Object[expected:HoverEvent])
            return:boolean(logicaland:boolean(cmpeq:boolean(getfield:HoverEvent$Action<?>(HoverEvent::action, this:HoverEvent), getfield:HoverEvent$Action<?>(HoverEvent::action, var_4_1D:HoverEvent)), invokestatic:boolean(Objects::equals, getfield:Object(HoverEvent::value, this:HoverEvent), getfield:Object(HoverEvent::value, var_4_1D:HoverEvent))))
        }
        
        return:boolean(ldc:boolean(0))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("HoverEvent{action=")), getfield:HoverEvent$Action<?>[expected:Object](HoverEvent::action, this:HoverEvent)), ldc:String(", value='")), getfield:Object(HoverEvent::value, this:HoverEvent)), ldc:char(39)), ldc:char(125))))
    }
    
    public int hashCode() {
        return:int(add:int(mul:int(ldc:int(31), invokevirtual:int(Object::hashCode, getfield:HoverEvent$Action<?>[expected:Object](HoverEvent::action, this:HoverEvent))), ternaryop:int(cmpne:boolean(getfield:Object(HoverEvent::value, this:HoverEvent), aconstnull:Object()), invokevirtual:int(Object::hashCode, getfield:Object(HoverEvent::value, this:HoverEvent)), ldc:int(0))))
    }
    
    public static net.minecraft.util.text.event.HoverEvent deserialize(com.google.gson.JsonObject json) {
        // java.lang.NullPointerException
    }
    
    public com.google.gson.JsonObject serialize() {
        var_3_0A : JsonObject
        
        var_3_0A = initobject:JsonObject(JsonObject::<init>)
        invokevirtual:void(JsonObject::addProperty, var_3_0A:JsonObject, ldc:String("action"), invokevirtual:String(HoverEvent$Action<T>::getCanonicalName, getfield:HoverEvent$Action<?>(HoverEvent::action, this:HoverEvent)))
        invokevirtual:void(JsonObject::add, var_3_0A:JsonObject, ldc:String("contents"), invokevirtual:JsonElement(HoverEvent$Action<T>::serialize, getfield:HoverEvent$Action<?>(HoverEvent::action, this:HoverEvent), getfield:Object(HoverEvent::value, this:HoverEvent)))
        return:JsonObject(var_3_0A:JsonObject)
    }
    
    public static org.apache.logging.log4j.Logger access$400() {
        return:Logger(getstatic:Logger(HoverEvent::LOGGER))
    }
    
    static {
        putstatic:Logger(HoverEvent::LOGGER, invokestatic:Logger(LogManager::getLogger))
    }
}
