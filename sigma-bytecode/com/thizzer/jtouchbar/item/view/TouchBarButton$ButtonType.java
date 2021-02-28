public enum com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType {
    public static com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType[] values() {
        return:TouchBarButton$ButtonType[](checkcast:TouchBarButton$ButtonType[](com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType[].class, invokevirtual:TouchBarButton$ButtonType[](TouchBarButton$ButtonType[]::clone, getstatic:TouchBarButton$ButtonType[](TouchBarButton$ButtonType::$VALUES))))
    }
    
    public static com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType valueOf(java.lang.String name) {
        return:TouchBarButton$ButtonType(checkcast:TouchBarButton$ButtonType(com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType.class, invokestatic:TouchBarButton$ButtonType(Enum<E>::valueOf, ldc:Class<TouchBarButton$ButtonType>(com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType.class), name:String)))
    }
    
    private void TouchBarButton$ButtonType(java.lang.String p0, int p1) {
        invokespecial:Enum(Enum::<init>, this:TouchBarButton$ButtonType, p0:String, p1:int)
    }
    
    static {
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_LIGHT, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("MOMENTARY_LIGHT"), ldc:int(0)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::PUSH_ON_PUSH_OFF, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("PUSH_ON_PUSH_OFF"), ldc:int(1)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::TOGGLE, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("TOGGLE"), ldc:int(2)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::SWITCH, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("SWITCH"), ldc:int(3)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::RADIO, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("RADIO"), ldc:int(4)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_CHANGE, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("MOMENTARY_CHANGE"), ldc:int(5)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::ON_OFF, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("ON_OFF"), ldc:int(6)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_PUSH_IN, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("MOMENTARY_PUSH_IN"), ldc:int(7)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::ACCELERATOR, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("ACCELERATOR"), ldc:int(8)))
        putstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_MULTILEVEL_ACCELERATOR, initobject:TouchBarButton$ButtonType(TouchBarButton$ButtonType::<init>, ldc:String("MOMENTARY_MULTILEVEL_ACCELERATOR"), ldc:int(9)))
        putstatic:TouchBarButton$ButtonType[](TouchBarButton$ButtonType::$VALUES, initarray:TouchBarButton$ButtonType[](com.thizzer.jtouchbar.item.view.TouchBarButton$ButtonType[].class, getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_LIGHT), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::PUSH_ON_PUSH_OFF), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::TOGGLE), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::SWITCH), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::RADIO), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_CHANGE), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::ON_OFF), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_PUSH_IN), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::ACCELERATOR), getstatic:TouchBarButton$ButtonType(TouchBarButton$ButtonType::MOMENTARY_MULTILEVEL_ACCELERATOR)))
    }
}
