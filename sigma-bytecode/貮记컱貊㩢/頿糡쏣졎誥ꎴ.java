public interface \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4 {
    void \u62da\u0b8e\u6198\u647c\u7043\u3711(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0);
    
    void \u385b\uc2bd\u59ec\u3e2a\u8350\u67d0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0, java.lang.Object p1) {
        var_3_8E : int
        var_5_96 : \u8389\u0b8e\u1833\ub8be\ud7e8\u8709
        
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
            var_3_8E = and:int(ldc:int(137696163), ldc:int(-1189906437))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_3_8E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_8E = and:int(var_3_8E:int, ldc:int(-1989319439))
                    }
                    else {
                        var_3_8E = and:int(var_3_8E:int, ldc:int(180303847))
                        invokeinterface:void(\u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4::\u62da\u0b8e\u6198\u647c\u7043\u3711, this:\u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_8E:int, ldc:int(1024)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_8E = and:int(var_3_8E:int, ldc:int(-676142382))
                }
                
                var_3_8E = and:int(var_3_8E:int, ldc:int(-1982351421))
            }
            catch (\u51fa\u12cb\u7330\u74b1\u6c52.\u8389\u0b8e\u1833\ub8be\ud7e8\u8709 var_5_96) {
                invokevirtual:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709(\u8389\u0b8e\u1833\ub8be\ud7e8\u8709::\u9af2\u4cd9\u7ce1\u927d\u4bc8\u9af2, var_5_96:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709, invokevirtual:Class<? extends \u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4>(\u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4::getClass, this:\u983f\u7ce1\uc3e3\uc84e\u8aa5\ua3b4))
                athrow(var_5_96:\u8389\u0b8e\u1833\ub8be\ud7e8\u8709)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
}
