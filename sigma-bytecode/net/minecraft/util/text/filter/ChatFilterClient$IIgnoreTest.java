public interface net.minecraft.util.text.filter.ChatFilterClient$IIgnoreTest {
    boolean shouldIgnore(java.lang.String p0, int p1);
    
    boolean lambda$static$1(java.lang.String p_244581_0_, int p_244581_1_) {
        return:boolean(cmpeq:boolean(invokevirtual:int(String::length, p_244581_0_:String), p_244581_1_:int))
    }
    
    boolean lambda$static$0(java.lang.String p_244583_0_, int p_244583_1_) {
        return:boolean(ldc:boolean(0))
    }
    
    static {
        putstatic:ChatFilterClient$IIgnoreTest(ChatFilterClient$IIgnoreTest::field_244577_a, bind:ChatFilterClient$IIgnoreTest((p_244583_0_:String, p_244583_1_:int) -> return:boolean(ldc:boolean(0))))
        putstatic:ChatFilterClient$IIgnoreTest(ChatFilterClient$IIgnoreTest::field_244578_b, bind:ChatFilterClient$IIgnoreTest((p_244581_0_:String, p_244581_1_:int) -> return:boolean(cmpeq:boolean(invokevirtual:int(String::length, p_244581_0_:String), p_244581_1_:int))))
    }
}
