public interface \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u7873\u7006\u960f\ua6bd\u839e\u7873 {
    void \u5d20\uff55\ub171\ud158\u6c52\u7d52(int p0);
    
    void \ub18d\u3bc9\u4cd9\u983f\ua6bd\u6ec6(int p0);
    
    void \ub19c\ubff1\u71ae\ud171\u647c\u2dcc(int p0);
    
    void \ub113\ufcaf\uc7fe\ua6bd\uc84e\ud523(float p0);
    
    void \u647c\u7006\u7006\u69d9\u759a\u718f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, float p1) {
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
            invokeinterface:void(\u7873\u7006\u960f\ua6bd\u839e\u7873::\u5d20\uff55\ub171\ud158\u6c52\u7d52, this:\u7873\u7006\u960f\ua6bd\u839e\u7873, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            invokeinterface:void(\u7873\u7006\u960f\ua6bd\u839e\u7873::\ub18d\u3bc9\u4cd9\u983f\ua6bd\u6ec6, this:\u7873\u7006\u960f\ua6bd\u839e\u7873, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            invokeinterface:void(\u7873\u7006\u960f\ua6bd\u839e\u7873::\ub19c\ubff1\u71ae\ud171\u647c\u2dcc, this:\u7873\u7006\u960f\ua6bd\u839e\u7873, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
            invokeinterface:void(\u7873\u7006\u960f\ua6bd\u839e\u7873::\ub113\ufcaf\uc7fe\ua6bd\uc84e\ud523, this:\u7873\u7006\u960f\ua6bd\u839e\u7873, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
}
