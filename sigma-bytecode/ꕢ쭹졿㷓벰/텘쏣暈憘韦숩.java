public interface \ua562\ucb79\uc87f\u3dd3\ubcb0.\ud158\uc3e3\uf9c5\u6198\u97e6\uc229 {
    int \u5d20\u4f52\ua6bd\uc238\uc3e3\u8753();
    
    net.minecraft.util.text.ITextProperties \u6bb9\u071d\u92ff\u4c04\u4f52\uafe7(int p0);
    
    net.minecraft.util.text.ITextProperties \uc2bd\u47c2\u3bd6\u960f\u7ce1\ub171(int p0) {
        var_2_5F : int
        stack_90_0 : ITextProperties [generated]
        
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
            var_2_5F = and:int(ldc:int(1577706960), ldc:int(-561397794))
            
            if (logicaland:boolean(cmpge:boolean(p0:int, ldc:int(0)), cmplt:boolean(p0:int, invokeinterface:int(\ud158\uc3e3\uf9c5\u6198\u97e6\uc229::\u5d20\u4f52\ua6bd\uc238\uc3e3\u8753, this:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229)))) {
                stack_90_0 = invokeinterface:ITextProperties(\ud158\uc3e3\uf9c5\u6198\u97e6\uc229::\u6bb9\u071d\u92ff\u4c04\u4f52\uafe7, this:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229, p0:int)
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-551551009))
                stack_90_0 = getstatic:ITextProperties(ITextProperties::field_240651_c_)
            }
            
            return:ITextProperties(stack_90_0:ITextProperties)
        }
        
        goto(Label_0006)
    }
    
    \ua562\ucb79\uc87f\u3dd3\ubcb0.\ud158\uc3e3\uf9c5\u6198\u97e6\uc229 \u67d0\u92ee\u7043\u965f\uae5d\u8bb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
        var_3_64 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
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
        var_3_64 = invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
        
        if (cmpne:boolean(var_3_64:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\ub18d\u071d\u1187\u64ab\ua068\uc246))) {
            return:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229(ternaryop:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229(cmpne:boolean(var_3_64:\u9af2\u1833\u156b\u12cb\u7d52\u6c52, getstatic:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u4492\ua562\ud158\u4492\u6bb9\ub70c::\u494c\u47c2\u9255\u69d9\u8c8a\u624e)), getstatic:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229(\u960f\u7ce1\u98a4\uc238\u98a4\u4f52::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90), initobject:\u960f\u16f6\uc238\ubff1\u9a18\u927d[expected:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229](\u960f\u16f6\uc238\ubff1\u9a18\u927d::<init>, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
        }
        
        return:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229(initobject:\ubded\ub6ab\u760c\ubcb0\uc238\u183a[expected:\ud158\uc3e3\uf9c5\u6198\u97e6\uc229](\ubded\ub6ab\u760c\ubcb0\uc238\u183a::<init>, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
    }
}
