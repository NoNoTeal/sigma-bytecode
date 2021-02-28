public class net.minecraft.util.text.event.ClickEvent {
    public void ClickEvent(net.minecraft.util.text.event.ClickEvent$Action theAction, java.lang.String theValue) {
        invokespecial:Object(Object::<init>, this:ClickEvent)
        putfield:ClickEvent$Action(ClickEvent::action, this:ClickEvent, theAction:ClickEvent$Action)
        putfield:String(ClickEvent::value, this:ClickEvent, theValue:String)
    }
    
    public net.minecraft.util.text.event.ClickEvent$Action getAction() {
        return:ClickEvent$Action(getfield:ClickEvent$Action(ClickEvent::action, this:ClickEvent))
    }
    
    public java.lang.String getValue() {
        return:String(getfield:String(ClickEvent::value, this:ClickEvent))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_1D : ClickEvent
        
        if (cmpeq:boolean(this:ClickEvent[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicalor:boolean(cmpeq:boolean(p_equals_1_:Object, aconstnull:Object()), cmpne:boolean(invokevirtual:Class<? extends ClickEvent>(ClickEvent::getClass, this:ClickEvent), invokevirtual:Class<?>(Object::getClass, p_equals_1_:Object)))) {
            return:boolean(ldc:boolean(0))
        }
        
        var_4_1D = checkcast:ClickEvent(net.minecraft.util.text.event.ClickEvent.class, p_equals_1_:Object[expected:ClickEvent])
        
        if (cmpne:boolean(getfield:ClickEvent$Action(ClickEvent::action, this:ClickEvent), getfield:ClickEvent$Action(ClickEvent::action, var_4_1D:ClickEvent))) {
            return:boolean(ldc:boolean(0))
        }
        
        if (cmpne:boolean(getfield:String(ClickEvent::value, this:ClickEvent), aconstnull:String())) {
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, getfield:String(ClickEvent::value, this:ClickEvent), getfield:String(ClickEvent::value, var_4_1D:ClickEvent)))) {
                return:boolean(ldc:boolean(0))
            }
        }
        else {
            if (cmpne:boolean(getfield:String(ClickEvent::value, var_4_1D:ClickEvent), aconstnull:String())) {
                return:boolean(ldc:boolean(0))
            }
        }
        
        return:boolean(ldc:boolean(1))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("ClickEvent{action=")), getfield:ClickEvent$Action[expected:Object](ClickEvent::action, this:ClickEvent)), ldc:String(", value='")), getfield:String(ClickEvent::value, this:ClickEvent)), ldc:char(39)), ldc:char(125))))
    }
    
    public int hashCode() {
        return:int(add:int(mul:int(ldc:int(31), invokevirtual:int(Enum<E>::hashCode, getfield:ClickEvent$Action[expected:Enum<ClickEvent$Action>](ClickEvent::action, this:ClickEvent))), ternaryop:int(cmpne:boolean(getfield:String(ClickEvent::value, this:ClickEvent), aconstnull:String()), invokevirtual:int(String::hashCode, getfield:String(ClickEvent::value, this:ClickEvent)), ldc:int(0))))
    }
}
