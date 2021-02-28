public interface \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5654\u7049\u7049\u0800\u6cfe\ubefe {
    void \u385b\uc2bd\u59ec\u3e2a\u8350\u67d0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0);
    
    void \u385b\uc2bd\u59ec\u3e2a\u8350\u67d0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0, java.lang.Object p1) {
        var_3_86 : int
        var_5_8E : \u8389\u0b8e\u1833\ub8be\ud7e8\u8709
        
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
            var_3_86 = and:int(ldc:int(-956383339), ldc:int(-530893431))
            
            try {
                do {
                    if (cmpeq:boolean(and:int(var_3_86:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_86 = and:int(var_3_86:int, ldc:int(-123400473))
                    }
                    else {
                        var_3_86 = and:int(var_3_86:int, ldc:int(1599763623))
                        invokeinterface:void(\u5654\u7049\u7049\u0800\u6cfe\ubefe::\u385b\uc2bd\u59ec\u3e2a\u8350\u67d0, this:\u5654\u7049\u7049\u0800\u6cfe\ubefe, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                    }
                } while (cmpeq:boolean(and:int(var_3_86:int, ldc:int(1024)), ldc:int(0)))
                
                var_3_86 = and:int(var_3_86:int, ldc:int(905592528))
            }
            catch (\u51fa\u12cb\u7330\u74b1\u6c52.\u8389\u0b8e\u1833\ub8be\ud7e8\u8709 var_5_8E) {
                invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\u9af2\u4cd9\u7ce1\u927d\u4bc8\u9af2, var_5_8E:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709, invokevirtual:Class<? extends \u5654\u7049\u7049\u0800\u6cfe\ubefe>(\u5654\u7049\u7049\u0800\u6cfe\ubefe::getClass, this:\u5654\u7049\u7049\u0800\u6cfe\ubefe))
                athrow(var_5_8E:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
}
