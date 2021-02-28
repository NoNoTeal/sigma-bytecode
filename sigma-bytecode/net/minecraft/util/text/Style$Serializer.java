public class net.minecraft.util.text.Style$Serializer {
    public void Style$Serializer() {
        invokespecial:Object(Object::<init>, this:Style$Serializer)
    }
    
    public net.minecraft.util.text.Style deserialize(com.google.gson.JsonElement p_deserialize_1_, java.lang.reflect.Type p_deserialize_2_, com.google.gson.JsonDeserializationContext p_deserialize_3_) {
        // java.lang.NullPointerException
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 deserializeFont(com.google.gson.JsonObject json) {
        // java.lang.NullPointerException
    }
    
    private static net.minecraft.util.text.event.HoverEvent deserializeHoverEvent(com.google.gson.JsonObject json) {
        var_4_17 : HoverEvent
        
        if (invokevirtual:boolean(JsonObject::has, json:JsonObject, ldc:String("hoverEvent"))) {
            var_4_17 = invokestatic:HoverEvent(HoverEvent::deserialize, invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, json:JsonObject, ldc:String("hoverEvent")))
            
            if (logicaland:boolean(cmpne:boolean(var_4_17:HoverEvent, aconstnull:HoverEvent()), invokevirtual:boolean(HoverEvent$Action<T>::shouldAllowInChat, invokevirtual:HoverEvent$Action<?>(HoverEvent::getAction, var_4_17:HoverEvent)))) {
                return:HoverEvent(var_4_17:HoverEvent)
            }
        }
        
        return:HoverEvent(aconstnull:HoverEvent())
    }
    
    private static net.minecraft.util.text.event.ClickEvent deserializeClickEvent(com.google.gson.JsonObject json) {
        // java.lang.NullPointerException
    }
    
    private static java.lang.String deserializeInsertion(com.google.gson.JsonObject json) {
        return:String(invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, json:JsonObject, ldc:String("insertion"), checkcast:String(java.lang.String.class, aconstnull:String())))
    }
    
    private static net.minecraft.util.text.Color deserializeColor(com.google.gson.JsonObject json) {
        if (invokevirtual:boolean(JsonObject::has, json:JsonObject, ldc:String("color"))) {
            return:Color(invokestatic:Color(Color::func_240745_a_, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, json:JsonObject, ldc:String("color"))))
        }
        
        return:Color(aconstnull:Color())
    }
    
    private static java.lang.Boolean deserializeBooleanValue(com.google.gson.JsonObject json, java.lang.String memberName) {
        return:Boolean(ternaryop:Boolean(invokevirtual:boolean(JsonObject::has, json:JsonObject, memberName:String), invokestatic:Boolean(Boolean::valueOf, invokevirtual:boolean(JsonElement::getAsBoolean, invokevirtual:JsonElement(JsonObject::get, json:JsonObject, memberName:String))), aconstnull:Boolean()))
    }
    
    public com.google.gson.JsonElement serialize(net.minecraft.util.text.Style p_serialize_1_, java.lang.reflect.Type p_serialize_2_, com.google.gson.JsonSerializationContext p_serialize_3_) {
        // java.lang.NullPointerException
    }
    
    public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        return:Object(invokevirtual:Style[expected:Object](Style$Serializer::deserialize, this:Style$Serializer, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
    }
    
    public com.google.gson.JsonElement serialize(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        return:JsonElement(invokevirtual:JsonElement(Style$Serializer::serialize, this:Style$Serializer, checkcast:Style(net.minecraft.util.text.Style.class, p0:Object[expected:Style]), p1:Type, p2:JsonSerializationContext))
    }
}
