public interface \u12b2\u7049\u8df4\uc9f6\uae87.\u97b7\u62da\u527a\ubefe\u98a4 {
    boolean \u760c\uc246\uceb8\ud4fe\u3e75\uc2bd();
    
    void \ubff1\u183a\ub7dc\u8308\u7ce1\u98a4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p0);
    
    float \u8308\u4e72\u5f50\u9937\u3c25\u7bad();
    
    boolean \u8350\u8d90\uc3e3\u120d\u76bc\u7d52(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u3d64\u7af6\uae87\uc238\u7d52.\u8709\u8389\u0b8e\u4e72\u2dcc p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p2) {
        var_6_AE : \u7d52\u718f\u3776\u6fb0\ub83f
        expr_166 : int [generated]
        var_7_19B : float
        
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
        
        if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc])) {
            var_6_AE = ternaryop:\u7d52\u718f\u3776\u6fb0\ub83f(invokeinterface:boolean(List<E>::isEmpty, invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\u983f\u4f4a\ub6ab\u3e75\u5140\u7bad, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f(), checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(List<\u7d52\u718f\u3776\u6fb0\ub83f>::get, invokevirtual:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\u983f\u4f4a\ub6ab\u3e75\u5140\u7bad, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), and:int(ldc:int(-7559), ldc:int(7558)))))
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8709\u9033\ubff1\u4ab3\u960f\u93a2, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                if (invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\u836c\u7d52\u4179\uc238\ub113\uf94d, p0:\u4f4a\uafe7\u76bc\u392e\ub8be)) {
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_6_AE:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, var_6_AE:\u7d52\u718f\u3776\u6fb0\ub83f))
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u5245\uae87\ua068\u6cfe\u6198\u0a06, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, getfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p0:\u4f4a\uafe7\u76bc\u392e\ub8be))
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, mul:float(getfield:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, var_6_AE:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:float(0.5f)))
                        invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\u8709\u983f\u67e9\u8350\ucef1, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p0:\u4f4a\uafe7\u76bc\u392e\ub8be), getfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, p0:\u4f4a\uafe7\u76bc\u392e\ub8be))
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\ud523\ua562\u64ab\u92ee\u71f1\uc87f, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, getfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p0:\u4f4a\uafe7\u76bc\u392e\ub8be))
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\ubb2b\u92ee\ub171\u385b\ucfaf\ubcb0, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, getfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, p0:\u4f4a\uafe7\u76bc\u392e\ub8be))
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\uc31c\uc2bd\u8709\ub171\u3a62\u51fa, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, ldc:float(1.0f))
                        putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u4bc8\u516c\u7c6b\u51fa\ud171\ubb2b, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, mul:float(invokevirtual:float(\ube23\u67d0\u64f2\u839e\u76bc::\ubff1\u7049\u8cae\ucb79\u0a06\uc2e8, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]), ldc:float(0.1f)))
                        
                        if (getfield:boolean(\u8709\u8389\u0b8e\u4e72\u2dcc::\uf94d\u7af6\ufe34\u9af2\ucb79\u759a, p1:\u8709\u8389\u0b8e\u4e72\u2dcc)) {
                            expr_166 = getfield:int(\u8709\u8389\u0b8e\u4e72\u2dcc::\uafe7\u8aa5\u960f\u0a06\uc238\u516c, p1:\u8709\u8389\u0b8e\u4e72\u2dcc)
                            putfield:int(\u8709\u8389\u0b8e\u4e72\u2dcc::\uafe7\u8aa5\u960f\u0a06\uc238\u516c, p1:\u8709\u8389\u0b8e\u4e72\u2dcc, add:int(expr_166:int, and:int(ldc:int(4613), ldc:int(3217))))
                            
                            if (cmpgt:boolean(expr_166:int, getfield:int(\u8709\u8389\u0b8e\u4e72\u2dcc::\u51b2\u3bc9\ubcb0\ud158\ua61f\u873d, p1:\u8709\u8389\u0b8e\u4e72\u2dcc))) {
                                putfield:boolean(\u8709\u8389\u0b8e\u4e72\u2dcc::\uf94d\u7af6\ufe34\u9af2\ucb79\u759a, p1:\u8709\u8389\u0b8e\u4e72\u2dcc, and:int[expected:boolean](ldc:int(19906), ldc:int(-24035)))
                            }
                        }
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\ud158\u99f7\u3504\u88c5\ub18d\u3bd6, p0:\u4f4a\uafe7\u76bc\u392e\ub8be))) {
                            invokevirtual:void(\ube23\u67d0\u64f2\u839e\u76bc::\uae87\u62da\ub8be\ubf56\ufe34\u97e6, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc], p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc], and:int[expected:boolean](ldc:int(6696), ldc:int(-6701)))
                            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ub102\u5bc4\u624e\ua3b4\u7d52\u5140, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f], getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd))
                        }
                        else {
                            var_7_19B = invokeinterface:float(\u97b7\u62da\u527a\ubefe\u98a4::\u8308\u4e72\u5f50\u9937\u3c25\u7bad, this:\u97b7\u62da\u527a\ubefe\u98a4)
                            
                            if (getfield:boolean(\u8709\u8389\u0b8e\u4e72\u2dcc::\uf94d\u7af6\ufe34\u9af2\ucb79\u759a, p1:\u8709\u8389\u0b8e\u4e72\u2dcc)) {
                                var_7_19B = add:float(var_7_19B:float, mul:float(mul:float(var_7_19B:float, ldc:float(1.15f)), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(div:float(i2f:float(getfield:int(\u8709\u8389\u0b8e\u4e72\u2dcc::\uafe7\u8aa5\u960f\u0a06\uc238\u516c, p1:\u8709\u8389\u0b8e\u4e72\u2dcc)), i2f:float(getfield:int(\u8709\u8389\u0b8e\u4e72\u2dcc::\u51b2\u3bc9\ubcb0\ud158\ua61f\u873d, p1:\u8709\u8389\u0b8e\u4e72\u2dcc))), ldc:float(3.1415927f)))))
                            }
                            
                            invokevirtual:void(\u4f4a\uafe7\u76bc\u392e\ub8be::\u8cae\u494c\u965f\ufe34\u3e75\u7330, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, var_7_19B:float)
                            invokeinterface:void(\u97b7\u62da\u527a\ubefe\u98a4::\ubff1\u183a\ub7dc\u8308\u7ce1\u98a4, this:\u97b7\u62da\u527a\ubefe\u98a4, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, ldc:double(0.0), ldc:double(0.0), ldc:double(1.0)))
                            putfield:int(\u4f4a\uafe7\u76bc\u392e\ub8be::\u6198\ube23\u6d99\u7bad\u7006\u92ee, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, and:int(ldc:int(9012), ldc:int(-11063)))
                        }
                        
                        return:boolean(xor:int[expected:boolean](ldc:int(-32492), ldc:int(-32491)))
                    }
                }
            }
            
            putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\uc31c\uc2bd\u8709\ub171\u3a62\u51fa, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, ldc:float(0.5f))
            putfield:float(\u4f4a\uafe7\u76bc\u392e\ub8be::\u4bc8\u516c\u7c6b\u51fa\ud171\ubb2b, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, ldc:float(0.02f))
            invokeinterface:void(\u97b7\u62da\u527a\ubefe\u98a4::\ubff1\u183a\ub7dc\u8308\u7ce1\u98a4, this:\u97b7\u62da\u527a\ubefe\u98a4, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8)
            return:boolean(and:int[expected:boolean](ldc:int(-32152), ldc:int(30102)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-25780), ldc:int(24739)))
    }
}
