public interface \ua562\ucb79\uc87f\u3dd3\ubcb0.\ufcaf\uc238\u64ab\uc31c\u3d64 {
    void \u61a4\u3711\u7049\u12b2\u8258\u71f1(com.google.gson.JsonObject p0);
    
    com.google.gson.JsonObject \u071d\u8413\u385b\ub1b9\u7e3f\ud523() {
        var_3_67 : JsonObject
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_67 = initobject:JsonObject(JsonObject::<init>)
            invokevirtual:void(JsonObject::addProperty, var_3_67:JsonObject, ldc:String("type"), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc29a\uae5d\u1187\u5fe1\u527a\u6d99<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc29a\uae5d\u1187\u5fe1\u527a\u6d99<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6198\u8350\u392e\u120d\u64f2\u1187), invokeinterface:\uc29a\uae5d\u1187\u5fe1\u527a\u6d99<?>(\ufcaf\uc238\u64ab\uc31c\u3d64::\u8df4\uc31c\u385b\u51fa\ubcb0\u5bc4, this:\ufcaf\uc238\u64ab\uc31c\u3d64))))
            invokeinterface:void(\ufcaf\uc238\u64ab\uc31c\u3d64::\u61a4\u3711\u7049\u12b2\u8258\u71f1, this:\ufcaf\uc238\u64ab\uc31c\u3d64, var_3_67:JsonObject)
            return:JsonObject(var_3_67:JsonObject)
        }
        
        goto(Label_0006)
    }
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u8df4\u4f4a\ud12e\u6cfe\u0a06\u8df4();
    
    \u5d20\u97b7\u8753\u873d\u16f6.\uc29a\uae5d\u1187\u5fe1\u527a\u6d99<?> \u8df4\uc31c\u385b\u51fa\ubcb0\u5bc4();
    
    com.google.gson.JsonObject \u839e\ud12e\u927d\u6d69\uf995\u93a2();
    
    \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u97e6\uc238\u760c\u624e\u8413\u4492();
}
