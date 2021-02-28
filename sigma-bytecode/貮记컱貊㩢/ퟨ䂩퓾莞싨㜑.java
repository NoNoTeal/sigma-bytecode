public interface \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ud7e8\u40a9\ud4fe\u839e\uc2e8\u3711<T> {
    int \u600f\u6b5f\u56bd\u6c52\u62da\u8640(T p0);
    
    int \u600f\u6b5f\u56bd\u6c52\u62da\u8640(java.util.UUID p0);
    
    boolean \uceb8\ubf56\u516c\ub1b9\ubded\u67d0(java.util.UUID p0) {
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
            return:boolean(invokeinterface:boolean(\ud7e8\u40a9\ud4fe\u839e\uc2e8\u3711<T>::\u47c2\u0800\uc229\ubf56\u99f7\u3504, this:\ud7e8\u40a9\ud4fe\u839e\uc2e8\u3711<T>, p0:UUID))
        }
        
        goto(Label_0006)
    }
    
    boolean \u47c2\u0800\uc229\ubf56\u99f7\u3504(java.util.UUID p0);
    
    java.lang.String \ud7e8\uc4d2\u4f4a\u960f\uc7fe\u64f2();
    
    void \u965f\u4f4a\u5140\ubff1\ub113\u7006(T p0, io.netty.buffer.ByteBuf p1);
    
    void \u965f\u4f4a\u5140\ubff1\ub113\u7006(java.util.UUID p0, io.netty.buffer.ByteBuf p1);
    
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u3711\u8413\u40a9\ud36e\ud7e8\u67e9(java.lang.String p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b p1, \u494c\u4975\ua068\u0c95\uc84e.\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4 p2);
    
    \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u64ab\u64ab\uc4d2\u6cfe\u9033\uc9f6 \u3711\u8413\u40a9\ud36e\ud7e8\u67e9(java.lang.String p0, float p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uc87f\uae5d\u0a06\ubcb0\uf94d\u385b p2, \u494c\u4975\ua068\u0c95\uc84e.\ud12e\u7e3f\u7049\u759a\u52d3\u5bc4 p3);
    
    java.util.SortedSet<java.lang.Integer> \uc238\u3e75\u3776\uc2bd\u4c2b\u9033();
}
