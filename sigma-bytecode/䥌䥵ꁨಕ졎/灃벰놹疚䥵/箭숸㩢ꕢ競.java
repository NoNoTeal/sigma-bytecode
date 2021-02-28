public interface \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7bad\uc238\u3a62\ua562\u7af6<T> {
    T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab \uc2e8\uc31c\u74b1\u0c95\u839e\u3c25(java.io.DataInput p0, int p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u8aa5\u0800\u5654\u3e75\ud51e p2);
    
    boolean \u40a9\ua068\u64f2\uc7fe\ua3b4\uc9f6() {
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
            return:boolean(and:int[expected:boolean](ldc:int(20137), ldc:int(-32492)))
        }
        
        goto(Label_0006)
    }
    
    java.lang.String \uc84e\u5245\ua6bd\u0a06\u34df\u946b();
    
    java.lang.String \u71f1\u4e72\u759a\u071d\u759a\ucb79();
    
    \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u7bad\uc238\u3a62\ua562\u7af6<\u36d3\u9033\u6b0d\u983f\u8d90.\ubded\uc9f6\u071d\u8258\u0c95> \u3bc9\uceb8\u4bc8\uae87\u8308\u93a2(int p0) {
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
            return:\u7bad\uc238\u3a62\ua562\u7af6<\ubded\uc9f6\u071d\u8258\u0c95>(initobject:\u67e9\u183a\u8389\u4c04\u5d20[expected:\u7bad\uc238\u3a62\ua562\u7af6<\ubded\uc9f6\u071d\u8258\u0c95>](\u67e9\u183a\u8389\u4c04\u5d20::<init>, p0:int))
        }
        
        goto(Label_0006)
    }
}
