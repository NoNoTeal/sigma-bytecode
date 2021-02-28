public interface com.sun.jna.win32.W32APIOptions {
    static {
        putstatic:Map<String, Object>(W32APIOptions::UNICODE_OPTIONS, invokestatic:Map<String, Object>(Collections::unmodifiableMap, initobject:W32APIOptions$1[expected:Map<? extends String, ?>](W32APIOptions$1::<init>)))
        putstatic:Map<String, Object>(W32APIOptions::ASCII_OPTIONS, invokestatic:Map<String, Object>(Collections::unmodifiableMap, initobject:W32APIOptions$2[expected:Map<? extends String, ?>](W32APIOptions$2::<init>)))
        putstatic:Map<String, Object>(W32APIOptions::DEFAULT_OPTIONS, ternaryop:Map<String, Object>(invokestatic:boolean(Boolean::getBoolean, ldc:String("w32.ascii")), getstatic:Map<String, Object>(W32APIOptions::ASCII_OPTIONS), getstatic:Map<String, Object>(W32APIOptions::UNICODE_OPTIONS)))
    }
}
