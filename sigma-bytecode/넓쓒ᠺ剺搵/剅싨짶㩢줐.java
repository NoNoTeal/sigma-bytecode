public class \ub113\uc4d2\u183a\u527a\u6435.\u5245\uc2e8\uc9f6\u3a62\uc910 {
    public void \u5245\uc2e8\uc9f6\u3a62\uc910(\ub113\ufcaf\u3c25\u071d\u97b7.\u12cb\u3776\ua562\uc3e3\u92ff p0) {
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
            invokespecial:\uc87f\ub70c\uc87f\ubb2b\u0c95(\uc87f\ub70c\uc87f\ubb2b\u0c95::<init>, this:\u5245\uc2e8\uc9f6\u3a62\uc910)
            putfield:\u12cb\u3776\ua562\uc3e3\u92ff(\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910, p0:\u12cb\u3776\ua562\uc3e3\u92ff)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u62da\u0b8e\u5f50\u718f\u7ce1\ud523() {
        var_1_CC : int
        stack_105_0 : int [generated]
        
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
        var_1_CC = and:int(ldc:int(969482020), ldc:int(-1183760469))
        
        if (cmpeq:boolean(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u12cb\u3776\ua562\uc3e3\u92ff::\u3711\u56bd\u52d3\uc3e3\ub102\u52d3, getfield:\u12cb\u3776\ua562\uc3e3\u92ff(\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)), aconstnull:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d())) {
            loop {
                if (cmpne:boolean(and:int(var_1_CC:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_CC = and:int(var_1_CC:int, ldc:int(1885791329))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_1_CC:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_CC = and:int(var_1_CC:int, ldc:int(-35271783))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u12cb\u3776\ua562\uc3e3\u92ff::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u12cb\u3776\ua562\uc3e3\u92ff(\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910))), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u6b0d\u927d\u47c2\u624e\uae87\uafe7)))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-15254), ldc:int(15249)))
                    }
                }
                
                Label_0152:
                
                if (cmpeq:boolean(and:int(var_1_CC:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_1_CC:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_CC = and:int(var_1_CC:int, ldc:int(1036472138))
                    
                    if (cmpeq:boolean(invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)), ldc:int(20)), ldc:int(0))) {
                        stack_105_0 = xor:int(ldc:int(24708), ldc:int(24709))
                        looporswitchbreak()
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_1_CC:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpne:boolean(and:int(var_1_CC:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_CC = and:int(var_1_CC:int, ldc:int(1003744191))
                    stack_105_0 = and:int(ldc:int(-1227), ldc:int(1226))
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_105_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-2038), ldc:int(1957)))
    }
    
    public void \u4c04\u74b1\u0800\u3a62\uafe7\u718f() {
        var_3_67 : Random
        var_4_6F : \uf9c5\ud158\u4975\uf94d\ud523\uc31c
        var_5_88 : int
        var_6_9D : int
        var_7_B6 : int
        var_8_C5 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_9_CE : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_10_D5 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        var_14_149 : boolean
        
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
            var_3_67 = invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910))
            var_4_6F = getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u12cb\u3776\ua562\uc3e3\u92ff::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\u12cb\u3776\ua562\uc3e3\u92ff(\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910))
            var_5_88 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)), ldc:double(2.0)), mul:double(invokevirtual:double(Random::nextDouble, var_3_67:Random), ldc:double(4.0))))
            var_6_9D = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)), mul:double(invokevirtual:double(Random::nextDouble, var_3_67:Random), ldc:double(3.0))))
            var_7_B6 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)), ldc:double(2.0)), mul:double(invokevirtual:double(Random::nextDouble, var_3_67:Random), ldc:double(4.0))))
            var_8_C5 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, var_5_88:int, var_6_9D:int, var_7_B6:int)
            var_9_CE = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, var_4_6F:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_8_C5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_10_D5 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_9_CE:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
            var_14_149 = invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ud4fe\u120d\u9a18\u385b\u4492\u5f50::\u0b8e\ub83f\uf995\u5245\u59ec\u9937, invokevirtual:\ud4fe\u120d\u9a18\u385b\u4492\u5f50(\u718f\u6435\uc31c\u4ab3\u98a4::\u56bd\u3e75\uc4d2\ub19c\u59ec\u7ce1, var_4_6F:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4], initobject:\u8709\u6198\u16f6\u7043\u965f\u8c8a(\u8709\u6198\u16f6\u7043\u965f\u8c8a::<init>, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, add:double(i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)))), ldc:double(0.5)), add:double(i2d:double(var_6_9D:int), ldc:double(0.5)), add:double(i2d:double(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)))), ldc:double(0.5))), initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, add:double(i2d:double(var_5_88:int), ldc:double(0.5)), add:double(i2d:double(var_6_9D:int), ldc:double(0.5)), add:double(i2d:double(var_7_B6:int), ldc:double(0.5))), getstatic:\u156b\u5f50\uafe7\u56bd\u071d\u385b(\u156b\u5f50\uafe7\u56bd\u071d\u385b::\u7043\u97b7\ub18d\u6c52\uc229\u6c52), getstatic:\ub19c\u59ec\u9937\u7049\u983f\u62da(\ub19c\u59ec\u9937\u7049\u983f\u62da::\u516c\u5fe1\u8aa5\u8413\ub32d\ub6ab), getfield:\u12cb\u3776\ua562\uc3e3\u92ff[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910)))), var_8_C5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object])
            
            if (invokevirtual:boolean(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u647c\u7bad\u64f2\u97e6\u71ae\ud171, var_10_D5:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\u67e9\u34df\ucb79\u8753\ub8be\u647c))) {
                if (var_14_149:boolean) {
                    invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u0b8e\u983f\uc238\ub6ab\u7049\ud4fe, var_4_6F:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, var_8_C5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(-20771), ldc:int(20770)))
                    invokevirtual:void(\u12cb\u3776\ua562\uc3e3\u92ff::\u0b8e\u600f\ub113\u759a\u98a4\u3504, getfield:\u12cb\u3776\ua562\uc3e3\u92ff(\u5245\uc2e8\uc9f6\u3a62\uc910::\u97e6\u3d4b\ubded\u7043\u9255\uae5d, this:\u5245\uc2e8\uc9f6\u3a62\uc910), invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_9_CE:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub8be\u4c2b\u071d\ub70c\ubded\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_655 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_660 : int
        
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
        var_3_655 = and:int(ldc:int(193493292), ldc:int(1714420107))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5245\uc2e8\uc9f6\u3a62\uc910[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_655 = and:int(var_3_655:int, ldc:int(-684033591))
            var_5_7D = and:int(ldc:int(-13980), ldc:int(12955))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5989), ldc:int(5984)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_655:int, ldc:int(-1421713489))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-32382), ldc:int(-32381)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-30711), ldc:int(-30712)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_655 = and:int(var_3_CA:int, ldc:int(451402574))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(279), ldc:int(545)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-470111501))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1287263181))
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1735008841))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(411824239))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(686883361))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(909139897))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-139807647))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-157466231))
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(2034852214))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1675944149))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(1605204303))
                        var_11_DB = and:int(ldc:int(1810), ldc:int(-1811))
                        goto(Label_1500)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-62867401))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1531703210))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1372204762))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(1647542238))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1786490423))
                        goto(Label_1364)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1785412710))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(998447269))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(1129334000))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1438569705))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1280060836))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(314998107))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(987801385))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-53630313))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1859148821))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-694247636))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-69238789))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-14335), ldc:int(-14336))
                                goto(Label_1124)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-569487767))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(735271641))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-458771901))
                        goto(Label_1221)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-2038328797))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-633098349))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(-1115524860))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-484745396))
                        var_11_DB = and:int(ldc:int(-20785), ldc:int(20784))
                    }
                    
                    Label_1124:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-378318584))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-956465284))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1364)
                            }
                        }
                    }
                    
                    Label_1221:
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1568685322))
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(246571354))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1124)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(529197259))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(627442591))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                            var_3_655 = and:int(var_3_655:int, ldc:int(1197834592))
                            loopcontinue()
                        }
                        
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1771701478))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1500)
                    }
                    
                    Label_1364:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(817932362))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-964449570))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1557251791))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(256)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(267239734))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_655 = and:int(var_3_655:int, ldc:int(1851285261))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1500:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_660 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1511:
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(512)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(302054169))
                        goto(Label_1364)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-1508926737))
                        goto(Label_1221)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1124)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(-924544068))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_655:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_655:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_655 = and:int(var_3_655:int, ldc:int(594697213))
                        var_17_660 = add:int(var_16_109:int, xor:int(ldc:int(8752), ldc:int(8753)))
                        looporswitchbreak()
                    }
                    
                    var_3_655 = and:int(var_3_655:int, ldc:int(622256260))
                }
                
                var_3_655 = and:int(var_3_655:int, ldc:int(-748167172))
                
                if (cmple:boolean(var_5_7D = var_17_660:int, sub:int(var_6_84:int, xor:int(ldc:int(8728), ldc:int(8729))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_655:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
