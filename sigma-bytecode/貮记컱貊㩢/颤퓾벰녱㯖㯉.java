public interface \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u98a4\ud4fe\ubcb0\ub171\u3bd6\u3bc9 {
    java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \uceb8\u120d\u6b0d\ud523\u71ae\ub18d(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<?>> p0);
    
    com.mojang.serialization.DataResult<com.mojang.datafixers.util.Pair<E, java.util.OptionalInt>> \uc84e\u6bb9\u64f2\u97e6\ub18d\u69d9(com.mojang.serialization.DynamicOps<com.google.gson.JsonElement> p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>> p1, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<E> p2, com.mojang.serialization.Decoder<E> p3);
    
    \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u98a4\ud4fe\ubcb0\ub171\u3bd6\u3bc9 \uc87f\u600f\u718f\ub19c\u446c\uc31c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            return:\u98a4\ud4fe\ubcb0\ub171\u3bd6\u3bc9(initobject:\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711[expected:\u98a4\ud4fe\ubcb0\ub171\u3bd6\u3bc9](\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::<init>, p0:\u6c52\u52d3\u516c\uae87\uae5d))
        }
        
        goto(Label_0006)
    }
}
