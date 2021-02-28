public class net.minecraft.util.text.ITextComponent$Serializer {
    public void ITextComponent$Serializer() {
        invokespecial:Object(Object::<init>, this:ITextComponent$Serializer)
    }
    
    public net.minecraft.util.text.IFormattableTextComponent deserialize(com.google.gson.JsonElement p_deserialize_1_, java.lang.reflect.Type p_deserialize_2_, com.google.gson.JsonDeserializationContext p_deserialize_3_) {
        // java.lang.NullPointerException
    }
    
    private void serializeChatStyle(net.minecraft.util.text.Style style, com.google.gson.JsonObject object, com.google.gson.JsonSerializationContext ctx) {
        var_6_0C : JsonElement
        var_8_27 : Iterator
        var_9_3D : Entry<String, V>
        
        var_6_0C = invokeinterface:JsonElement(JsonSerializationContext::serialize, ctx:JsonSerializationContext, style:Style[expected:Object])
        
        if (invokevirtual:boolean(JsonElement::isJsonObject, var_6_0C:JsonElement)) {
            var_8_27 = invokeinterface:Iterator(Set::iterator, invokevirtual:Set(JsonObject::entrySet, checkcast:JsonObject(com.google.gson.JsonObject.class, var_6_0C:JsonObject)))
            
            while (invokeinterface:boolean(Iterator::hasNext, var_8_27:Iterator)) {
                var_9_3D = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_8_27:Iterator<Entry<String, V>>))
                invokevirtual:void(JsonObject::add, object:JsonObject, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_9_3D:Entry<String, V>)), checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:V(Entry<K, V>::getValue, var_9_3D:Entry<String, V>)))
            }
        }
    }
    
    public com.google.gson.JsonElement serialize(net.minecraft.util.text.ITextComponent p_serialize_1_, java.lang.reflect.Type p_serialize_2_, com.google.gson.JsonSerializationContext p_serialize_3_) {
        // java.lang.NullPointerException
    }
    
    public static java.lang.String toJson(net.minecraft.util.text.ITextComponent component) {
        return:String(invokevirtual:String(Gson::toJson, getstatic:Gson(ITextComponent$Serializer::GSON), component:ITextComponent[expected:Object]))
    }
    
    public static com.google.gson.JsonElement toJsonTree(net.minecraft.util.text.ITextComponent p_200528_0_) {
        return:JsonElement(invokevirtual:JsonElement(Gson::toJsonTree, getstatic:Gson(ITextComponent$Serializer::GSON), p_200528_0_:ITextComponent[expected:Object]))
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240643_a_(java.lang.String p_240643_0_) {
        return:IFormattableTextComponent(checkcast:IFormattableTextComponent(net.minecraft.util.text.IFormattableTextComponent.class, invokestatic:IFormattableTextComponent(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u0a06\u6d99\u71f1\u527a\uc87f\u98a4, getstatic:Gson(ITextComponent$Serializer::GSON), p_240643_0_:String, ldc:Class<IFormattableTextComponent>(net.minecraft.util.text.IFormattableTextComponent.class), ldc:boolean(0))))
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240641_a_(com.google.gson.JsonElement p_240641_0_) {
        return:IFormattableTextComponent(checkcast:IFormattableTextComponent(net.minecraft.util.text.IFormattableTextComponent.class, invokevirtual:Object[expected:IFormattableTextComponent](Gson::fromJson, getstatic:Gson(ITextComponent$Serializer::GSON), p_240641_0_:JsonElement, ldc:Class<IFormattableTextComponent>(net.minecraft.util.text.IFormattableTextComponent.class))))
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240644_b_(java.lang.String p_240644_0_) {
        return:IFormattableTextComponent(checkcast:IFormattableTextComponent(net.minecraft.util.text.IFormattableTextComponent.class, invokestatic:IFormattableTextComponent(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u0a06\u6d99\u71f1\u527a\uc87f\u98a4, getstatic:Gson(ITextComponent$Serializer::GSON), p_240644_0_:String, ldc:Class<IFormattableTextComponent>(net.minecraft.util.text.IFormattableTextComponent.class), ldc:boolean(1))))
    }
    
    public static net.minecraft.util.text.IFormattableTextComponent func_240642_a_(com.mojang.brigadier.StringReader p_240642_0_) {
        // java.lang.NullPointerException
    }
    
    private static int getPos(com.google.gson.stream.JsonReader p_197673_0_) {
        var_3_16 : IllegalAccessException
        
        try {
            return:int(add:int(sub:int(invokevirtual:int(Field::getInt, getstatic:Field(ITextComponent$Serializer::JSON_READER_POS_FIELD), p_197673_0_:JsonReader[expected:Object]), invokevirtual:int(Field::getInt, getstatic:Field(ITextComponent$Serializer::JSON_READER_LINESTART_FIELD), p_197673_0_:JsonReader[expected:Object])), ldc:int(1)))
        }
        catch (java.lang.IllegalAccessException var_3_16) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Couldn't read position of JsonReader"), var_3_16:IllegalAccessException[expected:Throwable]))
        }
    }
    
    public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        return:Object(invokevirtual:IFormattableTextComponent[expected:Object](ITextComponent$Serializer::deserialize, this:ITextComponent$Serializer, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
    }
    
    public com.google.gson.JsonElement serialize(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        return:JsonElement(invokevirtual:JsonElement(ITextComponent$Serializer::serialize, this:ITextComponent$Serializer, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, p0:Object[expected:ITextComponent]), p1:Type, p2:JsonSerializationContext))
    }
    
    private static java.lang.reflect.Field lambda$static$2() {
        expr_04 : JsonReader [generated]
        var_2_1F : Field
        var_2_27 : NoSuchFieldException
        
        try {
            expr_04 = initobject:JsonReader(JsonReader::<init>, initobject:StringReader[expected:Reader](StringReader::<init>, ldc:String("")))
            var_2_1F = invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<JsonReader>(com.google.gson.stream.JsonReader.class), ldc:String("lineStart"))
            invokevirtual:void(AccessibleObject::setAccessible, var_2_1F:Field[expected:AccessibleObject], ldc:boolean(1))
            return:Field(var_2_1F:Field)
        }
        catch (java.lang.NoSuchFieldException var_2_27) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Couldn't get field 'lineStart' for JsonReader"), var_2_27:NoSuchFieldException[expected:Throwable]))
        }
    }
    
    private static java.lang.reflect.Field lambda$static$1() {
        expr_04 : JsonReader [generated]
        var_2_1F : Field
        var_2_27 : NoSuchFieldException
        
        try {
            expr_04 = initobject:JsonReader(JsonReader::<init>, initobject:StringReader[expected:Reader](StringReader::<init>, ldc:String("")))
            var_2_1F = invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<JsonReader>(com.google.gson.stream.JsonReader.class), ldc:String("pos"))
            invokevirtual:void(AccessibleObject::setAccessible, var_2_1F:Field[expected:AccessibleObject], ldc:boolean(1))
            return:Field(var_2_1F:Field)
        }
        catch (java.lang.NoSuchFieldException var_2_27) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Couldn't get field 'pos' for JsonReader"), var_2_27:NoSuchFieldException[expected:Throwable]))
        }
    }
    
    private static com.google.gson.Gson lambda$static$0() {
        var_2_0B : GsonBuilder
        
        var_2_0B = initobject:GsonBuilder(GsonBuilder::<init>)
        invokevirtual:GsonBuilder(GsonBuilder::disableHtmlEscaping, var_2_0B:GsonBuilder)
        invokevirtual:GsonBuilder(GsonBuilder::registerTypeHierarchyAdapter, var_2_0B:GsonBuilder, ldc:Class<ITextComponent>(net.minecraft.util.text.ITextComponent.class), initobject:ITextComponent$Serializer[expected:Object](ITextComponent$Serializer::<init>))
        invokevirtual:GsonBuilder(GsonBuilder::registerTypeHierarchyAdapter, var_2_0B:GsonBuilder, ldc:Class<Style>(net.minecraft.util.text.Style.class), initobject:Style$Serializer[expected:Object](Style$Serializer::<init>))
        invokevirtual:GsonBuilder(GsonBuilder::registerTypeAdapterFactory, var_2_0B:GsonBuilder, initobject:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe[expected:TypeAdapterFactory](\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe::<init>))
        return:Gson(invokevirtual:Gson(GsonBuilder::create, var_2_0B:GsonBuilder))
    }
    
    static {
        var_2_0B : GsonBuilder
        var_2_1F : Field
        var_2_27 : NoSuchFieldException
        var_2_1F : Field
        var_2_27 : NoSuchFieldException
        
        putstatic:Gson(ITextComponent$Serializer::GSON, checkcast:Gson(com.google.gson.Gson.class, invokestatic:Gson(\ud217\u3504\u760c\uc29a\u97e6\ube23::\ub70c\ud51e\uc9f6\u7873\u5140\u983f, bind:Supplier<Gson>(() -> {
            var_2_0B = initobject:GsonBuilder(GsonBuilder::<init>)
            invokevirtual:GsonBuilder(GsonBuilder::disableHtmlEscaping, var_2_0B:GsonBuilder)
            invokevirtual:GsonBuilder(GsonBuilder::registerTypeHierarchyAdapter, var_2_0B:GsonBuilder, ldc:Class<ITextComponent>(net.minecraft.util.text.ITextComponent.class), initobject:ITextComponent$Serializer[expected:Object](ITextComponent$Serializer::<init>))
            invokevirtual:GsonBuilder(GsonBuilder::registerTypeHierarchyAdapter, var_2_0B:GsonBuilder, ldc:Class<Style>(net.minecraft.util.text.Style.class), initobject:Style$Serializer[expected:Object](Style$Serializer::<init>))
            invokevirtual:GsonBuilder(GsonBuilder::registerTypeAdapterFactory, var_2_0B:GsonBuilder, initobject:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe[expected:TypeAdapterFactory](\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe::<init>))
            return:Gson(invokevirtual:Gson(GsonBuilder::create, var_2_0B:GsonBuilder))
        }))))
        putstatic:Field(ITextComponent$Serializer::JSON_READER_POS_FIELD, checkcast:Field(java.lang.reflect.Field.class, invokestatic:Field(\ud217\u3504\u760c\uc29a\u97e6\ube23::\ub70c\ud51e\uc9f6\u7873\u5140\u983f, bind:Supplier<Field>(() -> {
            try {
                invokespecial:JsonReader(JsonReader::<init>, __new:JsonReader(com.google.gson.stream.JsonReader.class), initobject:StringReader[expected:Reader](StringReader::<init>, ldc:String("")))
                invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<JsonReader>(com.google.gson.stream.JsonReader.class), ldc:String("pos"))
                invokevirtual:void(AccessibleObject::setAccessible, var_2_1F:Field[expected:AccessibleObject], ldc:boolean(1))
                return:Field(var_2_1F:Field[expected:Object])
            }
            catch (java.lang.NoSuchFieldException var_2_27) {
                athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Couldn't get field 'pos' for JsonReader"), var_2_27:NoSuchFieldException[expected:Throwable]))
            }
        }))))
        putstatic:Field(ITextComponent$Serializer::JSON_READER_LINESTART_FIELD, checkcast:Field(java.lang.reflect.Field.class, invokestatic:Field(\ud217\u3504\u760c\uc29a\u97e6\ube23::\ub70c\ud51e\uc9f6\u7873\u5140\u983f, bind:Supplier<Field>(() -> {
            try {
                invokespecial:JsonReader(JsonReader::<init>, __new:JsonReader(com.google.gson.stream.JsonReader.class), initobject:StringReader[expected:Reader](StringReader::<init>, ldc:String("")))
                invokevirtual:Field(Class<T>::getDeclaredField, ldc:Class<JsonReader>(com.google.gson.stream.JsonReader.class), ldc:String("lineStart"))
                invokevirtual:void(AccessibleObject::setAccessible, var_2_1F:Field[expected:AccessibleObject], ldc:boolean(1))
                return:Field(var_2_1F:Field[expected:Object])
            }
            catch (java.lang.NoSuchFieldException var_2_27) {
                athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("Couldn't get field 'lineStart' for JsonReader"), var_2_27:NoSuchFieldException[expected:Throwable]))
            }
        }))))
    }
}
