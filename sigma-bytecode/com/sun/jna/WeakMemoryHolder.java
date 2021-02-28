public class com.sun.jna.WeakMemoryHolder {
    public void WeakMemoryHolder() {
        invokespecial:Object(Object::<init>, this:WeakMemoryHolder)
        putfield:ReferenceQueue<Object>(WeakMemoryHolder::referenceQueue, this:WeakMemoryHolder, initobject:ReferenceQueue<Object>(ReferenceQueue<T>::<init>))
        putfield:IdentityHashMap<Reference<Object>, Memory>(WeakMemoryHolder::backingMap, this:WeakMemoryHolder, initobject:IdentityHashMap<Reference<Object>, Memory>(IdentityHashMap<K, V>::<init>))
    }
    
    public synchronized void put(java.lang.Object o, com.sun.jna.Memory m) {
        invokevirtual:void(WeakMemoryHolder::clean, this:WeakMemoryHolder)
        invokevirtual:Memory(IdentityHashMap<WeakReference<Object>, Memory>::put, getfield:IdentityHashMap<Reference<Object>, Memory>(WeakMemoryHolder::backingMap, this:WeakMemoryHolder), initobject:WeakReference<Object>(WeakReference<Object>::<init>, o:Object, getfield:ReferenceQueue<Object>(WeakMemoryHolder::referenceQueue, this:WeakMemoryHolder)), m:Memory)
    }
    
    public synchronized void clean() {
        var_3_0A : Reference<?>
        
        var_3_0A = invokevirtual:Reference<?>(ReferenceQueue<Object>::poll, getfield:ReferenceQueue<Object>(WeakMemoryHolder::referenceQueue, this:WeakMemoryHolder))
        
        while (cmpne:boolean(var_3_0A:Reference<?>, aconstnull:Reference<?>())) {
            invokevirtual:Memory(IdentityHashMap<Reference<Object>, Memory>::remove, getfield:IdentityHashMap<Reference<Object>, Memory>(WeakMemoryHolder::backingMap, this:WeakMemoryHolder), var_3_0A:Reference<?>[expected:Object])
            var_3_0A = invokevirtual:Reference<?>(ReferenceQueue<Object>::poll, getfield:ReferenceQueue<Object>(WeakMemoryHolder::referenceQueue, this:WeakMemoryHolder))
        }
    }
}
