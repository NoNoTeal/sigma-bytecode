public interface \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4cd9\uc2bd\ud523\ud4fe\u8709\u64f2<T> {
    void \ub19c\u7bad\u7c6b\ucef1\uc9f6\ub7dc(int p0, int p1, int p2, \u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?> p3, java.util.Iterator<T> p4, int p5) {
        var_7_61 : int
        var_9_64 : int
        var_10_67 : int
        var_11_96 : \ub83f\u5bc4\u3711\u6bb9\u624e\ub70c
        var_7_13E : int
        var_11_7F : int
        var_12_88 : int
        stack_166_0 : int [generated]
        var_7_164 : int
        var_13_166 : int
        var_14_175 : int
        var_7_376 : int
        var_15_18A : int
        stack_253_0 : int [generated]
        var_7_251 : int
        var_13_253 : int
        var_14_262 : int
        var_16_266 : int
        stack_292_0 : int [generated]
        var_17_292 : int
        stack_3A5_0 : int [generated]
        
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
        var_7_61 = and:int(ldc:int(1024036342), ldc:int(-52708913))
        var_9_64 = p0:int
        var_10_67 = p1:int
        
        if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c.class, p3:\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c)) {
            var_11_96 = checkcast:\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c.class, p3:\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c)
            var_9_64 = invokevirtual:int(\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c::\u718f\u071d\u4179\u9033\u16f6\uc246, var_11_96:\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c)
            var_10_67 = invokevirtual:int(\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c::\u3dd3\u4c2b\ua6bd\u4492\ubff1\u516c, var_11_96:\ub83f\u5bc4\u3711\u6bb9\u624e\ub70c)
        }
        
        var_7_13E = and:int(var_7_61:int, ldc:int(2036595522))
        var_11_7F = and:int(ldc:int(25141), ldc:int(-25142))
        var_12_88 = and:int(ldc:int(-29076), ldc:int(28819))
        
        loop {
            if (cmplt:boolean(var_12_88:int, p1:int)) {
                if (cmpne:boolean(var_11_7F:int, p2:int)) {
                    goto(Label_0223)
                }
                
                inc:int(var_11_7F, ldc:int(1))
                goto(Label_0223)
            }
            
            Label_0179:
            
            if (cmpeq:boolean(and:int(var_7_13E:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0277)
            }
            
            if (cmpne:boolean(and:int(var_7_13E:int, ldc:int(256)), ldc:int(0))) {
                return:void()
            }
            
            var_7_13E = and:int(var_7_13E:int, ldc:int(1933128856))
            Label_0223:
            
            if (cmpne:boolean(and:int(var_7_13E:int, ldc:int(512)), ldc:int(0))) {
                var_7_13E = and:int(var_7_13E:int, ldc:int(-760013551))
            }
            else {
                if (cmpeq:boolean(and:int(var_7_13E:int, ldc:int(64)), ldc:int(0))) {
                    var_7_13E = and:int(var_7_13E:int, ldc:int(513095965))
                    goto(Label_0179)
                }
                
                var_7_13E = and:int(var_7_13E:int, ldc:int(2074606531))
                
                if (cmplt:boolean(i2f:float(var_10_67:int), div:float(i2f:float(p1:int), ldc:float(2.0f)))) {
                    stack_166_0 = and:int(ldc:int(5), ldc:int(25249))
                    goto(Label_0351)
                }
            }
            
            Label_0277:
            
            if (cmpne:boolean(and:int(var_7_13E:int, ldc:int(262144)), ldc:int(0))) {
                var_7_13E = and:int(var_7_13E:int, ldc:int(-1919532193))
                goto(Label_0223)
            }
            
            if (cmpne:boolean(and:int(var_7_13E:int, ldc:int(8192)), ldc:int(0))) {
                var_7_13E = and:int(var_7_13E:int, ldc:int(-1744294897))
                goto(Label_0179)
            }
            
            var_7_13E = and:int(var_7_13E:int, ldc:int(-1204688015))
            stack_166_0 = and:int(ldc:int(16587), ldc:int(-16620))
            Label_0351:
            var_7_164 = and:int(var_7_13E:int, ldc:int(976076775))
            var_13_166 = stack_166_0:int
            var_14_175 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:float(div:float(i2f:float(p1:int), ldc:float(2.0f)), div:float(i2f:float(var_10_67:int), ldc:float(2.0f))))
            
            if (cmpne:boolean(var_13_166:int, ldc:int(0))) {
                if (cmpgt:boolean(var_14_175:int, var_12_88:int)) {
                    var_11_7F = add:int(var_11_7F:int, p0:int)
                    inc:int(var_12_88, ldc:int(1))
                }
            }
            
            var_7_376 = and:int(var_7_164:int, ldc:int(-1083732097))
            var_15_18A = and:int(ldc:int(-11295), ldc:int(11294))
            
            loop {
                if (cmplt:boolean(var_15_18A:int, p0:int)) {
                    if (invokeinterface:boolean(Iterator::hasNext, p4:Iterator)) {
                        goto(Label_0482)
                    }
                    
                    return:void()
                }
                
                Label_0439:
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0536)
                }
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(1048576)), ldc:int(0))) {
                    var_7_13E = and:int(var_7_376:int, ldc:int(948019167))
                    inc:int(var_12_88, ldc:int(1))
                    looporswitchbreak()
                }
                
                Label_0482:
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(256)), ldc:int(0))) {
                    var_7_376 = and:int(var_7_376:int, ldc:int(1433234737))
                }
                else {
                    if (cmpne:boolean(and:int(var_7_376:int, ldc:int(8192)), ldc:int(0))) {
                        var_7_376 = and:int(var_7_376:int, ldc:int(69271745))
                        goto(Label_0439)
                    }
                    
                    var_7_376 = and:int(var_7_376:int, ldc:int(-1207583904))
                    
                    if (cmplt:boolean(i2f:float(var_9_64:int), div:float(i2f:float(p0:int), ldc:float(2.0f)))) {
                        stack_253_0 = xor:int(ldc:int(2049), ldc:int(2048))
                        goto(Label_0588)
                    }
                }
                
                Label_0536:
                
                if (cmpne:boolean(and:int(var_7_376:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0482)
                }
                
                if (cmpne:boolean(and:int(var_7_376:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0439)
                }
                
                var_7_376 = and:int(var_7_376:int, ldc:int(-117592123))
                stack_253_0 = and:int(ldc:int(5301), ldc:int(-5302))
                Label_0588:
                var_7_251 = and:int(var_7_376:int, ldc:int(964164438))
                var_13_253 = stack_253_0:int
                var_14_262 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, sub:float(div:float(i2f:float(p0:int), ldc:float(2.0f)), div:float(i2f:float(var_9_64:int), ldc:float(2.0f))))
                var_16_266 = var_9_64:int
                
                if (cmpge:boolean(var_15_18A:int, var_9_64:int)) {
                    var_7_251 = and:int(var_7_251:int, ldc:int(2068835153))
                    stack_292_0 = and:int(ldc:int(-28064), ldc:int(19734))
                }
                else {
                    stack_292_0 = and:int(ldc:int(28673), ldc:int(3331))
                }
                
                var_7_376 = and:int(var_7_251:int, ldc:int(-5788856))
                var_17_292 = stack_292_0:int
                
                if (cmpne:boolean(var_13_253:int, ldc:int(0))) {
                    var_16_266 = add:int(var_14_262:int, var_9_64:int)
                    
                    if (cmpgt:boolean(var_14_262:int, var_15_18A:int)) {
                        goto(Label_0847)
                    }
                    
                    if (cmpge:boolean(var_15_18A:int, add:int(var_14_262:int, var_9_64:int))) {
                        goto(Label_0847)
                    }
                    
                    stack_3A5_0 = xor:int(ldc:int(16453), ldc:int(16452))
                    goto(Label_0926)
                }
                
                Label_0665:
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(536870912)), ldc:int(0))) {
                    var_7_376 = and:int(var_7_376:int, ldc:int(1652433580))
                    goto(Label_0847)
                }
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(32768)), ldc:int(0))) {
                    var_7_376 = and:int(var_7_376:int, ldc:int(130892899))
                    goto(Label_0789)
                }
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_7_376 = and:int(var_7_376:int, ldc:int(-636669848))
                }
                else {
                    var_7_376 = and:int(var_7_376:int, ldc:int(999665100))
                    
                    if (cmpne:boolean(var_17_292:int, ldc:int(0))) {
                        invokeinterface:void(\u4cd9\uc2bd\ud523\ud4fe\u8709\u64f2<T>::\ub18d\u183a\ubf56\ud7e8\ub8be\uceb8, this:\u4cd9\uc2bd\ud523\ud4fe\u8709\u64f2<T>, p4:Iterator<T>, var_11_7F:int, p5:int, var_12_88:int, var_15_18A:int)
                        goto(Label_0789)
                    }
                }
                
                Label_0731:
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0847)
                }
                
                if (cmpne:boolean(and:int(var_7_376:int, ldc:int(8192)), ldc:int(0))) {
                    var_7_376 = and:int(var_7_376:int, ldc:int(523161092))
                }
                else {
                    if (cmpne:boolean(and:int(var_7_376:int, ldc:int(33554432)), ldc:int(0))) {
                        var_7_376 = and:int(var_7_376:int, ldc:int(289466790))
                        goto(Label_0665)
                    }
                    
                    var_7_376 = and:int(var_7_376:int, ldc:int(-74469411))
                    
                    if (cmpeq:boolean(var_16_266:int, var_15_18A:int)) {
                        var_11_7F = add:int(var_11_7F:int, sub:int(p0:int, var_15_18A:int))
                        goto(Label_0439)
                    }
                }
                
                Label_0789:
                
                if (cmpne:boolean(and:int(var_7_376:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_376:int, ldc:int(268435456)), ldc:int(0))) {
                        var_7_376 = and:int(var_7_376:int, ldc:int(968341858))
                        inc:int(var_11_7F, ldc:int(1))
                        inc:int(var_15_18A, ldc:int(1))
                        loopcontinue()
                    }
                    
                    goto(Label_0665)
                }
                
                Label_0847:
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(2048)), ldc:int(0))) {
                    var_7_376 = and:int(var_7_376:int, ldc:int(1559034168))
                    goto(Label_0789)
                }
                
                if (cmpne:boolean(and:int(var_7_376:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0731)
                }
                
                if (cmpeq:boolean(and:int(var_7_376:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0665)
                }
                
                var_7_376 = and:int(var_7_376:int, ldc:int(2074738536))
                stack_3A5_0 = and:int(ldc:int(-1155), ldc:int(1154))
                Label_0926:
                var_7_376 = and:int(var_7_376:int, ldc:int(989568364))
                var_17_292 = stack_3A5_0:int
                goto(Label_0665)
            }
        }
    }
    
    void \ub18d\u183a\ubf56\ud7e8\ub8be\uceb8(java.util.Iterator<T> p0, int p1, int p2, int p3, int p4);
}
