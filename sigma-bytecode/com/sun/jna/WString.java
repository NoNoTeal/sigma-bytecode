public final class com.sun.jna.WString {
    public void WString(java.lang.String s) {
        invokespecial:Object(Object::<init>, this:WString)
        
        if (cmpeq:boolean(s:String, aconstnull:String())) {
            athrow(initobject:NullPointerException(NullPointerException::<init>, ldc:String("String initializer must be non-null")))
        }
        
        putfield:String(WString::string, this:WString, s:String)
    }
    
    public java.lang.String toString() {
        return:String(getfield:String(WString::string, this:WString))
    }
    
    public boolean equals(java.lang.Object o) {
        return:boolean(logicaland:boolean(instanceof:boolean(com.sun.jna.WString.class, o:Object), invokevirtual:boolean(String::equals, invokevirtual:String(WString::toString, this:WString), invokevirtual:String[expected:Object](Object::toString, o:Object))))
    }
    
    public int hashCode() {
        return:int(invokevirtual:int(String::hashCode, invokevirtual:String(WString::toString, this:WString)))
    }
    
    public int compareTo(java.lang.Object o) {
        return:int(invokevirtual:int(String::compareTo, invokevirtual:String(WString::toString, this:WString), invokevirtual:String(Object::toString, o:Object)))
    }
    
    public int length() {
        return:int(invokevirtual:int(String::length, invokevirtual:String(WString::toString, this:WString)))
    }
    
    public char charAt(int index) {
        return:char(invokevirtual:char(String::charAt, invokevirtual:String(WString::toString, this:WString), index:int))
    }
    
    public java.lang.CharSequence subSequence(int start, int end) {
        return:CharSequence(invokevirtual:CharSequence(String::subSequence, invokevirtual:String(WString::toString, this:WString), start:int, end:int))
    }
}
