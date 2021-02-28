public enum net.minecraft.util.text.event.ClickEvent$Action {
    public static net.minecraft.util.text.event.ClickEvent$Action[] values() {
        return:ClickEvent$Action[](checkcast:ClickEvent$Action[](net.minecraft.util.text.event.ClickEvent$Action[].class, invokevirtual:ClickEvent$Action[](ClickEvent$Action[]::clone, getstatic:ClickEvent$Action[](ClickEvent$Action::$VALUES))))
    }
    
    public static net.minecraft.util.text.event.ClickEvent$Action valueOf(java.lang.String name) {
        return:ClickEvent$Action(checkcast:ClickEvent$Action(net.minecraft.util.text.event.ClickEvent$Action.class, invokestatic:ClickEvent$Action(Enum<E>::valueOf, ldc:Class<ClickEvent$Action>(net.minecraft.util.text.event.ClickEvent$Action.class), name:String)))
    }
    
    private void ClickEvent$Action(java.lang.String p0, int p1, java.lang.String canonicalNameIn, boolean allowedInChatIn) {
        invokespecial:Enum(Enum::<init>, this:ClickEvent$Action, p0:String, p1:int)
        putfield:String(ClickEvent$Action::canonicalName, this:ClickEvent$Action, canonicalNameIn:String)
        putfield:boolean(ClickEvent$Action::allowedInChat, this:ClickEvent$Action, allowedInChatIn:boolean)
    }
    
    public boolean shouldAllowInChat() {
        return:boolean(getfield:boolean(ClickEvent$Action::allowedInChat, this:ClickEvent$Action))
    }
    
    public java.lang.String getCanonicalName() {
        return:String(getfield:String(ClickEvent$Action::canonicalName, this:ClickEvent$Action))
    }
    
    public static net.minecraft.util.text.event.ClickEvent$Action getValueByCanonicalName(java.lang.String canonicalNameIn) {
        return:ClickEvent$Action(checkcast:ClickEvent$Action(net.minecraft.util.text.event.ClickEvent$Action.class, invokeinterface:ClickEvent$Action(Map<String, ClickEvent$Action>::get, getstatic:Map<String, ClickEvent$Action>(ClickEvent$Action::NAME_MAPPING), canonicalNameIn:String[expected:Object])))
    }
    
    private static net.minecraft.util.text.event.ClickEvent$Action lambda$static$0(net.minecraft.util.text.event.ClickEvent$Action p_199851_0_) {
        return:ClickEvent$Action(p_199851_0_:ClickEvent$Action)
    }
    
    static {
        putstatic:ClickEvent$Action(ClickEvent$Action::OPEN_URL, initobject:ClickEvent$Action(ClickEvent$Action::<init>, ldc:String("OPEN_URL"), ldc:int(0), ldc:String("open_url"), ldc:boolean(1)))
        putstatic:ClickEvent$Action(ClickEvent$Action::OPEN_FILE, initobject:ClickEvent$Action(ClickEvent$Action::<init>, ldc:String("OPEN_FILE"), ldc:int(1), ldc:String("open_file"), ldc:boolean(0)))
        putstatic:ClickEvent$Action(ClickEvent$Action::RUN_COMMAND, initobject:ClickEvent$Action(ClickEvent$Action::<init>, ldc:String("RUN_COMMAND"), ldc:int(2), ldc:String("run_command"), ldc:boolean(1)))
        putstatic:ClickEvent$Action(ClickEvent$Action::SUGGEST_COMMAND, initobject:ClickEvent$Action(ClickEvent$Action::<init>, ldc:String("SUGGEST_COMMAND"), ldc:int(3), ldc:String("suggest_command"), ldc:boolean(1)))
        putstatic:ClickEvent$Action(ClickEvent$Action::CHANGE_PAGE, initobject:ClickEvent$Action(ClickEvent$Action::<init>, ldc:String("CHANGE_PAGE"), ldc:int(4), ldc:String("change_page"), ldc:boolean(1)))
        putstatic:ClickEvent$Action(ClickEvent$Action::COPY_TO_CLIPBOARD, initobject:ClickEvent$Action(ClickEvent$Action::<init>, ldc:String("COPY_TO_CLIPBOARD"), ldc:int(5), ldc:String("copy_to_clipboard"), ldc:boolean(1)))
        putstatic:ClickEvent$Action[](ClickEvent$Action::$VALUES, initarray:ClickEvent$Action[](net.minecraft.util.text.event.ClickEvent$Action[].class, getstatic:ClickEvent$Action(ClickEvent$Action::OPEN_URL), getstatic:ClickEvent$Action(ClickEvent$Action::OPEN_FILE), getstatic:ClickEvent$Action(ClickEvent$Action::RUN_COMMAND), getstatic:ClickEvent$Action(ClickEvent$Action::SUGGEST_COMMAND), getstatic:ClickEvent$Action(ClickEvent$Action::CHANGE_PAGE), getstatic:ClickEvent$Action(ClickEvent$Action::COPY_TO_CLIPBOARD)))
        putstatic:Map<String, ClickEvent$Action>(ClickEvent$Action::NAME_MAPPING, checkcast:Map<String, ClickEvent$Action>(java.util.Map<java.lang.String, net.minecraft.util.text.event.ClickEvent$Action>.class, invokeinterface:Map<String, ClickEvent$Action>(Stream<ClickEvent$Action>::collect, invokestatic:Stream<ClickEvent$Action>(Arrays::stream, invokestatic:ClickEvent$Action[](ClickEvent$Action::values)), invokestatic:Collector<? super ClickEvent$Action, ?, Map<String, ClickEvent$Action>>(Collectors::toMap, invokedynamic:Function<? super ClickEvent$Action, String>(apply:()Ljava/util/function/Function;), bind:Function<Object, ClickEvent$Action>((p_199851_0_:ClickEvent$Action) -> return:ClickEvent$Action(p_199851_0_:ClickEvent$Action))))))
    }
}
