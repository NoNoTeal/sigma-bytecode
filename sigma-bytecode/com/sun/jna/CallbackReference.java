public class com.sun.jna.CallbackReference {
    public static com.sun.jna.CallbackThreadInitializer setCallbackThreadInitializer(com.sun.jna.Callback cb, com.sun.jna.CallbackThreadInitializer initializer) {
        monitorenter(getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers))
        
        try {
            if (cmpne:boolean(initializer:CallbackThreadInitializer, aconstnull:CallbackThreadInitializer())) {
                return:CallbackThreadInitializer(checkcast:CallbackThreadInitializer(com.sun.jna.CallbackThreadInitializer.class, invokeinterface:CallbackThreadInitializer(Map<Callback, CallbackThreadInitializer>::put, getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers), cb:Callback, initializer:CallbackThreadInitializer)))
            }
            
            return:CallbackThreadInitializer(checkcast:CallbackThreadInitializer(com.sun.jna.CallbackThreadInitializer.class, invokeinterface:CallbackThreadInitializer(Map<Callback, CallbackThreadInitializer>::remove, getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers), cb:Callback[expected:Object])))
        }
        finally {
            monitorexit(getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers))
        }
    }
    
    private static java.lang.ThreadGroup initializeThread(com.sun.jna.Callback cb, com.sun.jna.CallbackReference$AttachOptions args) {
        var_4_28 : CallbackThreadInitializer
        var_5_39 : ThreadGroup
        group : ThreadGroup
        
        if (instanceof:boolean(com.sun.jna.CallbackReference$DefaultCallbackProxy.class, cb:Callback)) {
            cb = invokevirtual:Callback(CallbackReference$DefaultCallbackProxy::getCallback, checkcast:CallbackReference$DefaultCallbackProxy(com.sun.jna.CallbackReference$DefaultCallbackProxy.class, cb:Callback[expected:CallbackReference$DefaultCallbackProxy]))
        }
        
        monitorenter(getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers))
        
        try {
            var_4_28 = checkcast:CallbackThreadInitializer(com.sun.jna.CallbackThreadInitializer.class, invokeinterface:CallbackThreadInitializer(Map<Callback, CallbackThreadInitializer>::get, getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers), cb:Callback[expected:Object]))
        }
        finally {
            monitorexit(getstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers))
        }
        
        var_5_39 = aconstnull:ThreadGroup()
        
        if (cmpne:boolean(group:ThreadGroup, aconstnull:ThreadGroup())) {
            var_5_39 = invokevirtual:ThreadGroup(CallbackThreadInitializer::getThreadGroup, group:ThreadGroup[expected:CallbackThreadInitializer], cb:Callback)
            putfield:String(CallbackReference$AttachOptions::name, args:CallbackReference$AttachOptions, invokevirtual:String(CallbackThreadInitializer::getName, group:ThreadGroup[expected:CallbackThreadInitializer], cb:Callback))
            putfield:boolean(CallbackReference$AttachOptions::daemon, args:CallbackReference$AttachOptions, invokevirtual:boolean(CallbackThreadInitializer::isDaemon, group:ThreadGroup[expected:CallbackThreadInitializer], cb:Callback))
            putfield:boolean(CallbackReference$AttachOptions::detach, args:CallbackReference$AttachOptions, invokevirtual:boolean(CallbackThreadInitializer::detach, group:ThreadGroup[expected:CallbackThreadInitializer], cb:Callback))
            invokevirtual:void(Structure::write, args:CallbackReference$AttachOptions[expected:Structure])
        }
        
        return:ThreadGroup(var_5_39:ThreadGroup)
    }
    
    public static com.sun.jna.Callback getCallback(java.lang.Class<?> type, com.sun.jna.Pointer p) {
        return:Callback(invokestatic:Callback(CallbackReference::getCallback, type:Class<?>, p:Pointer, ldc:boolean(0)))
    }
    
    private static com.sun.jna.Callback getCallback(java.lang.Class<?> type, com.sun.jna.Pointer p, boolean direct) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void CallbackReference(com.sun.jna.Callback callback, int callingConvention, boolean direct) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private java.lang.Class<?> getNativeType(java.lang.Class<?> cls) {
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), cls:Class<?>)) {
            invokestatic:void(Structure::validate, cls:Class<?>)
            
            if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure$ByValue>(com.sun.jna.Structure$ByValue.class), cls:Class<?>))) {
                return:Class<?>(ldc:Class<Pointer>(com.sun.jna.Pointer.class))
            }
        }
        else {
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<NativeMapped>(com.sun.jna.NativeMapped.class), cls:Class<?>)) {
                return:Class<?>(invokevirtual:Class<?>(NativeMappedConverter::nativeType, invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, cls:Class<?>)))
            }
            
            if (logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(cmpeq:boolean(cls:Class<?>, ldc:Class<String>(java.lang.String.class)), cmpeq:boolean(cls:Class<?>, ldc:Class<WString>(com.sun.jna.WString.class))), cmpeq:boolean(cls:Class<?>, ldc:Class<String[]>(java.lang.String[].class))), cmpeq:boolean(cls:Class<?>, ldc:Class<WString[]>(com.sun.jna.WString[].class))), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Callback>(com.sun.jna.Callback.class), cls:Class<?>))) {
                return:Class<?>(ldc:Class<Pointer>(com.sun.jna.Pointer.class))
            }
        }
        
        return:Class<?>(cls:Class<?>)
    }
    
    private static java.lang.reflect.Method checkMethod(java.lang.reflect.Method m) {
        if (cmpgt:boolean(arraylength:int(invokevirtual:Class<?>[](Method::getParameterTypes, m:Method)), ldc:int(256))) {
            athrow(initobject:UnsupportedOperationException(UnsupportedOperationException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Method signature exceeds the maximum parameter count: ")), m:Method[expected:Object]))))
        }
        
        return:Method(m:Method)
    }
    
    public static java.lang.Class<?> findCallbackClass(java.lang.Class<?> type) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static java.lang.reflect.Method getCallbackMethod(com.sun.jna.Callback callback) {
        return:Method(invokestatic:Method(CallbackReference::getCallbackMethod, invokestatic:Class<?>(CallbackReference::findCallbackClass, invokevirtual:Class<? extends Callback>(Callback::getClass, callback:Callback))))
    }
    
    private static java.lang.reflect.Method getCallbackMethod(java.lang.Class<?> cls) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private void setCallbackOptions(int options) {
        invokevirtual:void(Pointer::setInt, getfield:Pointer(CallbackReference::cbstruct, this:CallbackReference), i2l:long(getstatic:int(Pointer::SIZE)), options:int)
    }
    
    public com.sun.jna.Pointer getTrampoline() {
        if (cmpeq:boolean(getfield:Pointer(CallbackReference::trampoline, this:CallbackReference), aconstnull:Pointer())) {
            putfield:Pointer(CallbackReference::trampoline, this:CallbackReference, invokevirtual:Pointer(Pointer::getPointer, getfield:Pointer(CallbackReference::cbstruct, this:CallbackReference), ldc:long(0L)))
        }
        
        return:Pointer(getfield:Pointer(CallbackReference::trampoline, this:CallbackReference))
    }
    
    public void finalize() {
        invokevirtual:void(CallbackReference::dispose, this:CallbackReference)
    }
    
    public synchronized void dispose() {
        if (cmpne:boolean(getfield:Pointer(CallbackReference::cbstruct, this:CallbackReference), aconstnull:Pointer())) {
            try {
                invokestatic:void(Native::freeNativeCallback, getfield:long(Pointer::peer, getfield:Pointer(CallbackReference::cbstruct, this:CallbackReference)))
            }
            finally {
                putfield:long(Pointer::peer, getfield:Pointer(CallbackReference::cbstruct, this:CallbackReference), ldc:long(0L))
                putfield:Pointer(CallbackReference::cbstruct, this:CallbackReference, aconstnull:Pointer())
                invokeinterface:Reference<CallbackReference>(Map<CallbackReference, Reference<CallbackReference>>::remove, getstatic:Map<CallbackReference, Reference<CallbackReference>>(CallbackReference::allocatedMemory), this:CallbackReference[expected:Object])
            }
        }
    }
    
    public static void disposeAll() {
        var_3_1A : Iterator<CallbackReference>
        
        var_3_1A = invokeinterface:Iterator<CallbackReference>(Collection<CallbackReference>::iterator, initobject:LinkedList<CallbackReference>[expected:Collection<CallbackReference>](LinkedList<CallbackReference>::<init>, invokeinterface:Set<CallbackReference>[expected:Collection<? extends CallbackReference>](Map<CallbackReference, Reference<CallbackReference>>::keySet, getstatic:Map<CallbackReference, Reference<CallbackReference>>(CallbackReference::allocatedMemory))))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_1A:Iterator<CallbackReference>)) {
            invokevirtual:void(CallbackReference::dispose, checkcast:CallbackReference(com.sun.jna.CallbackReference.class, invokeinterface:CallbackReference(Iterator<CallbackReference>::next, var_3_1A:Iterator<CallbackReference>)))
        }
    }
    
    private com.sun.jna.Callback getCallback() {
        return:Callback(checkcast:Callback(com.sun.jna.Callback.class, invokevirtual:Callback(Reference<Callback>::get, this:CallbackReference[expected:Reference<Callback>])))
    }
    
    private static com.sun.jna.Pointer getNativeFunctionPointer(com.sun.jna.Callback cb) {
        var_3_12 : InvocationHandler
        
        if (invokestatic:boolean(Proxy::isProxyClass, invokevirtual:Class<? extends Callback>(Callback::getClass, cb:Callback))) {
            var_3_12 = invokestatic:InvocationHandler(Proxy::getInvocationHandler, cb:Callback[expected:Object])
            
            if (instanceof:boolean(com.sun.jna.CallbackReference$NativeFunctionHandler.class, var_3_12:InvocationHandler)) {
                return:Pointer(invokevirtual:Pointer(CallbackReference$NativeFunctionHandler::getPointer, checkcast:CallbackReference$NativeFunctionHandler(com.sun.jna.CallbackReference$NativeFunctionHandler.class, var_3_12:CallbackReference$NativeFunctionHandler[expected:InvocationHandler])))
            }
        }
        
        return:Pointer(aconstnull:Pointer())
    }
    
    public static com.sun.jna.Pointer getFunctionPointer(com.sun.jna.Callback cb) {
        return:Pointer(invokestatic:Pointer(CallbackReference::getFunctionPointer, cb:Callback, ldc:boolean(0)))
    }
    
    private static com.sun.jna.Pointer getFunctionPointer(com.sun.jna.Callback cb, boolean direct) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private static boolean isAllowableNativeType(java.lang.Class<?> cls) {
        return:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Void>(Void::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Void>(java.lang.Void.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Boolean>(Boolean::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Boolean>(java.lang.Boolean.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Byte>(Byte::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Byte>(java.lang.Byte.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Short>(Short::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Short>(java.lang.Short.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Character>(Character::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Character>(java.lang.Character.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Integer>(Integer::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Integer>(java.lang.Integer.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Long>(Long::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Long>(java.lang.Long.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Float>(Float::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Float>(java.lang.Float.class))), cmpeq:boolean(cls:Class<?>, getstatic:Class<Double>(Double::TYPE))), cmpeq:boolean(cls:Class<?>, ldc:Class<Double>(java.lang.Double.class))), logicaland:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure$ByValue>(com.sun.jna.Structure$ByValue.class), cls:Class<?>), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), cls:Class<?>))), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Pointer>(com.sun.jna.Pointer.class), cls:Class<?>)))
    }
    
    private static com.sun.jna.Pointer getNativeString(java.lang.Object value, boolean wide) {
        var_4_14 : NativeString
        
        if (cmpne:boolean(value:Object, aconstnull:Object())) {
            var_4_14 = initobject:NativeString(NativeString::<init>, invokevirtual:String(Object::toString, value:Object), wide:boolean)
            invokeinterface:NativeString(Map<Object, NativeString>::put, getstatic:Map<Object, Object>(CallbackReference::allocations), value:Object, var_4_14:NativeString)
            return:Pointer(invokevirtual:Pointer(NativeString::getPointer, var_4_14:NativeString))
        }
        
        return:Pointer(aconstnull:Pointer())
    }
    
    public static com.sun.jna.Callback access$000(com.sun.jna.CallbackReference x0) {
        return:Callback(invokespecial:Callback(CallbackReference::getCallback, x0:CallbackReference))
    }
    
    public static com.sun.jna.Pointer access$100(java.lang.Object x0, boolean x1) {
        return:Pointer(invokestatic:Pointer(CallbackReference::getNativeString, x0:Object, x1:boolean))
    }
    
    static {
        putstatic:Map<Callback, CallbackReference>(CallbackReference::callbackMap, initobject:WeakHashMap<Callback, CallbackReference>[expected:Map<Callback, CallbackReference>](WeakHashMap<K, V>::<init>))
        putstatic:Map<Callback, CallbackReference>(CallbackReference::directCallbackMap, initobject:WeakHashMap<Callback, CallbackReference>[expected:Map<Callback, CallbackReference>](WeakHashMap<K, V>::<init>))
        putstatic:Map<Pointer, Reference<Callback>>(CallbackReference::pointerCallbackMap, initobject:WeakHashMap<Pointer, Reference<Callback>>[expected:Map<Pointer, Reference<Callback>>](WeakHashMap<K, V>::<init>))
        putstatic:Map<Object, Object>(CallbackReference::allocations, initobject:WeakHashMap<Object, Object>[expected:Map<Object, Object>](WeakHashMap<K, V>::<init>))
        putstatic:Map<CallbackReference, Reference<CallbackReference>>(CallbackReference::allocatedMemory, invokestatic:Map<CallbackReference, Reference<CallbackReference>>(Collections::synchronizedMap, initobject:WeakHashMap<CallbackReference, Reference<CallbackReference>>[expected:Map<CallbackReference, Reference<CallbackReference>>](WeakHashMap<K, V>::<init>)))
        
        try {
            putstatic:Method(CallbackReference::PROXY_CALLBACK_METHOD, invokevirtual:Method(Class<T>::getMethod, ldc:Class<CallbackProxy>(com.sun.jna.CallbackProxy.class), ldc:String("callback"), initarray:Class[](java.lang.Class[].class, ldc:Class<Object[]>(java.lang.Object[].class))))
        }
        catch (java.lang.Exception var_2_52) {
            athrow(initobject:Error(Error::<init>, ldc:String("Error looking up CallbackProxy.callback() method")))
        }
        
        putstatic:Map<Callback, CallbackThreadInitializer>(CallbackReference::initializers, initobject:WeakHashMap<Callback, CallbackThreadInitializer>[expected:Map<Callback, CallbackThreadInitializer>](WeakHashMap<K, V>::<init>))
    }
}
