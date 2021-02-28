public class net.minecraft.util.text.event.HoverEvent$ItemHover {
    public void HoverEvent$ItemHover(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9af2\u1833\u156b\u12cb\u7d52\u6c52 item, int count, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc tag) {
        invokespecial:Object(Object::<init>, this:HoverEvent$ItemHover)
        putfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(HoverEvent$ItemHover::item, this:HoverEvent$ItemHover, item:\u9af2\u1833\u156b\u12cb\u7d52\u6c52)
        putfield:int(HoverEvent$ItemHover::count, this:HoverEvent$ItemHover, count:int)
        putfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover, tag:\uc31c\uc87f\uc246\u3776\ub7dc)
    }
    
    public void HoverEvent$ItemHover(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 stack) {
        invokespecial:HoverEvent$ItemHover(HoverEvent$ItemHover::<init>, this:HoverEvent$ItemHover, invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, stack:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, stack:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), ternaryop:\uc31c\uc87f\uc246\u3776\ub7dc(cmpne:boolean(invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u416d\ud12e\u071d\u69d9\u9af2\u0b8e, stack:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::\u3d64\u12cb\u56bd\u0a06\u6cfe\u120d, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u416d\ud12e\u071d\u69d9\u9af2\u0b8e, stack:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()))
    }
    
    public boolean equals(java.lang.Object p_equals_1_) {
        var_4_1D : HoverEvent$ItemHover
        
        if (cmpeq:boolean(this:HoverEvent$ItemHover[expected:Object], p_equals_1_:Object)) {
            return:boolean(ldc:boolean(1))
        }
        
        if (logicaland:boolean(cmpne:boolean(p_equals_1_:Object, aconstnull:Object()), cmpeq:boolean(invokevirtual:Class<? extends HoverEvent$ItemHover>(HoverEvent$ItemHover::getClass, this:HoverEvent$ItemHover), invokevirtual:Class<?>(Object::getClass, p_equals_1_:Object)))) {
            var_4_1D = checkcast:HoverEvent$ItemHover(net.minecraft.util.text.event.HoverEvent$ItemHover.class, p_equals_1_:Object[expected:HoverEvent$ItemHover])
            return:boolean(logicaland:boolean(logicaland:boolean(cmpeq:boolean(getfield:int(HoverEvent$ItemHover::count, this:HoverEvent$ItemHover), getfield:int(HoverEvent$ItemHover::count, var_4_1D:HoverEvent$ItemHover)), invokevirtual:boolean(Object::equals, getfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](HoverEvent$ItemHover::item, this:HoverEvent$ItemHover), getfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(HoverEvent$ItemHover::item, var_4_1D:HoverEvent$ItemHover))), invokestatic:boolean(Objects::equals, getfield:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object](HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover), getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, var_4_1D:HoverEvent$ItemHover))))
        }
        
        return:boolean(ldc:boolean(0))
    }
    
    public int hashCode() {
        return:int(add:int(mul:int(ldc:int(31), add:int(mul:int(ldc:int(31), invokevirtual:int(Object::hashCode, getfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:Object](HoverEvent$ItemHover::item, this:HoverEvent$ItemHover))), getfield:int(HoverEvent$ItemHover::count, this:HoverEvent$ItemHover))), ternaryop:int(cmpne:boolean(getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc()), invokevirtual:int(\uc31c\uc87f\uc246\u3776\ub7dc::hashCode, getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover)), ldc:int(0))))
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 createStack() {
        if (cmpeq:boolean(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(HoverEvent$ItemHover::stack, this:HoverEvent$ItemHover), aconstnull:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56())) {
            putfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(HoverEvent$ItemHover::stack, this:HoverEvent$ItemHover, initobject:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::<init>, getfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52[expected:\u92ff\u600f\u4f4a\u8aa5\u1187\ub6ab](HoverEvent$ItemHover::item, this:HoverEvent$ItemHover), getfield:int(HoverEvent$ItemHover::count, this:HoverEvent$ItemHover)))
            
            if (cmpne:boolean(getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
                invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ub18d\u67d0\ud7e8\u36d3\u494c\u4f4a, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(HoverEvent$ItemHover::stack, this:HoverEvent$ItemHover), getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover))
            }
        }
        
        return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(HoverEvent$ItemHover::stack, this:HoverEvent$ItemHover))
    }
    
    private static net.minecraft.util.text.event.HoverEvent$ItemHover deserialize(com.google.gson.JsonElement element) {
        // java.lang.NullPointerException
    }
    
    private static net.minecraft.util.text.event.HoverEvent$ItemHover deserialize(net.minecraft.util.text.ITextComponent component) {
        var_3_19 : CommandSyntaxException
        
        try {
            return:HoverEvent$ItemHover(initobject:HoverEvent$ItemHover(HoverEvent$ItemHover::<init>, invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ub32d\u4c04\ufcaf\u5bc4\ua6bd\u3d4b, invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e75\u6c52\u946b\u76bc\uc31c::\u8df4\u0b8e\u983f\u8c8a\uc9f6\u8308, invokeinterface:String(ITextComponent::getString, component:ITextComponent)))))
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_3_19) {
            invokeinterface:void(Logger::warn, invokestatic:Logger(HoverEvent::access$400), ldc:String("Failed to parse item tag: {}"), component:ITextComponent[expected:Object], var_3_19:CommandSyntaxException[expected:Object])
            return:HoverEvent$ItemHover(aconstnull:HoverEvent$ItemHover())
        }
    }
    
    private com.google.gson.JsonElement serialize() {
        var_3_0A : JsonObject
        
        var_3_0A = initobject:JsonObject(JsonObject::<init>)
        invokevirtual:void(JsonObject::addProperty, var_3_0A:JsonObject, ldc:String("id"), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u36d3\u67e9\u3504\u7bad\u3504\u2dcc), getfield:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(HoverEvent$ItemHover::item, this:HoverEvent$ItemHover))))
        
        if (cmpne:boolean(getfield:int(HoverEvent$ItemHover::count, this:HoverEvent$ItemHover), ldc:int(1))) {
            invokevirtual:void(JsonObject::addProperty, var_3_0A:JsonObject, ldc:String("count"), invokestatic:Integer[expected:Number](Integer::valueOf, getfield:int(HoverEvent$ItemHover::count, this:HoverEvent$ItemHover)))
        }
        
        if (cmpne:boolean(getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover), aconstnull:\uc31c\uc87f\uc246\u3776\ub7dc())) {
            invokevirtual:void(JsonObject::addProperty, var_3_0A:JsonObject, ldc:String("tag"), invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::toString, getfield:\uc31c\uc87f\uc246\u3776\ub7dc(HoverEvent$ItemHover::tag, this:HoverEvent$ItemHover)))
        }
        
        return:JsonElement(var_3_0A:JsonObject)
    }
    
    public static net.minecraft.util.text.event.HoverEvent$ItemHover access$100(net.minecraft.util.text.ITextComponent x0) {
        return:HoverEvent$ItemHover(invokestatic:HoverEvent$ItemHover(HoverEvent$ItemHover::deserialize, x0:ITextComponent))
    }
    
    public static com.google.gson.JsonElement access$200(net.minecraft.util.text.event.HoverEvent$ItemHover x0) {
        return:JsonElement(invokespecial:JsonElement(HoverEvent$ItemHover::serialize, x0:HoverEvent$ItemHover))
    }
    
    public static net.minecraft.util.text.event.HoverEvent$ItemHover access$300(com.google.gson.JsonElement x0) {
        return:HoverEvent$ItemHover(invokestatic:HoverEvent$ItemHover(HoverEvent$ItemHover::deserialize, x0:JsonElement))
    }
}
