public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc87f\ua6bd\ub19c\uc2bd\u51fa {
    public void \uc87f\ua6bd\ub19c\uc2bd\u51fa(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25 p0) {
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
            invokespecial:\uc4d2\u3e2a\u071d\u51fa\uc229(\uc4d2\u3e2a\u071d\u51fa\uc229::<init>, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, p0:\ua3b4\u9a18\ufcaf\ubff1\u3c25)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u8640\ubcb0\ube23\u4daf\u5bc4() {
        var_1_FA : int
        var_1_90 : int
        var_3_15D : double
        var_5_165 : double
        var_7_170 : double
        var_9_17C : double
        stack_1C8_0 : double [generated]
        var_1_1C7 : int
        var_3_1C8 : double
        var_1_40F : int
        var_18_30D : float
        var_19_351 : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8
        var_20_365 : double
        var_22_378 : double
        var_24_38C : double
        var_26_398 : double
        var_28_3A7 : double
        var_30_3B3 : double
        var_1_3C3 : int
        var_32_3DC : \u3a62\u4f4a\ub19c\u6198\ud158
        
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
        var_1_FA = and:int(ldc:int(2035426107), ldc:int(1038574418))
        
        if (cmpeq:boolean(getfield:\ube23\u67d0\u64f2\u839e\u76bc(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc7fe\u4daf\u64f2\u52d3\u47c2\u8cae), loadelement:String(getstatic:String[](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4cd9\ua562\u67e9\u9255\ube23\u5d20), and:int(ldc:int(3819), ldc:int(-3820))))
            invokevirtual:void(\u0b8e\u6198\u40a9\uafe7\u6b5f::\u4d85\u8bb0\u8389\u3d4b\ub32d\u3e75, invokevirtual:\u0b8e\u6198\u40a9\uafe7\u6b5f(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u5654\u72f1\u7043\u718f\ubded\u3dd3, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u6bb9\uc29a\u3a62\u8cae\u61a4>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\uae87\u3dd3\u8308\u6c52\ubcb0\u6d69))
            goto(Label_0558)
        }
        
        Label_0103:
        
        if (cmpeq:boolean(and:int(var_1_FA:int, ldc:int(2)), ldc:int(0))) {
            var_1_FA = and:int(var_1_FA:int, ldc:int(-885798160))
            goto(Label_0558)
        }
        
        if (cmpne:boolean(and:int(var_1_FA:int, ldc:int(524288)), ldc:int(0))) {
            var_1_FA = and:int(var_1_FA:int, ldc:int(1293797344))
            goto(Label_0217)
        }
        
        if (cmpeq:boolean(and:int(var_1_FA:int, ldc:int(2147483647)), ldc:int(0))) {
            var_1_90 = and:int(var_1_FA:int, ldc:int(517743420))
        }
        else {
            var_1_90 = and:int(var_1_FA:int, ldc:int(1312796511))
            
            if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                if (invokevirtual:boolean(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\uf9c5\u8aa5\u97b7\u64f2\ucb79\u3bd6, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))) {
                    var_3_15D = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
                    var_5_165 = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
                    var_7_170 = sub:double(var_3_15D:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
                    var_9_17C = sub:double(var_5_165:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
                    putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ubf56\u4e72\ucb79\u0800\u385b\u5654, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, var_3_15D:double, add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokestatic:double(Math::min, sub:double(add:double(ldc:double(0.4000000059604645), div:double(f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_7_170:double, var_7_170:double), mul:double(var_9_17C:double, var_9_17C:double)))), ldc:double(80.0))), ldc:double(1.0)), ldc:double(10.0))), var_5_165:double))
                }
            }
        }
        
        Label_0160:
        
        if (cmpne:boolean(and:int(var_1_90:int, ldc:int(16384)), ldc:int(0))) {
            var_1_FA = and:int(var_1_90:int, ldc:int(-217649341))
            goto(Label_0558)
        }
        
        if (cmpne:boolean(and:int(var_1_90:int, ldc:int(2048)), ldc:int(0))) {
            var_1_FA = and:int(var_1_90:int, ldc:int(789679088))
        }
        else {
            if (cmpeq:boolean(and:int(var_1_90:int, ldc:int(2147483647)), ldc:int(0))) {
                var_1_FA = and:int(var_1_90:int, ldc:int(2071167020))
                goto(Label_0103)
            }
            
            var_1_FA = and:int(var_1_90:int, ldc:int(1876069307))
            
            if (cmpeq:boolean(getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ubf56\u4e72\ucb79\u0800\u385b\u5654, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())) {
                stack_1C8_0 = ldc:double(0.0)
                goto(Label_0451)
            }
        }
        
        Label_0217:
        
        if (cmpne:boolean(and:int(var_1_FA:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0558)
        }
        
        if (cmpeq:boolean(and:int(var_1_FA:int, ldc:int(256)), ldc:int(0))) {
            var_1_90 = and:int(var_1_FA:int, ldc:int(1678927916))
            goto(Label_0160)
        }
        
        if (cmpeq:boolean(and:int(var_1_FA:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0103)
        }
        
        var_1_FA = and:int(var_1_FA:int, ldc:int(-1659192326))
        stack_1C8_0 = invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\uc87f\uc2e8\u7af6\u64ab\u718f\u6435, getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ubf56\u4e72\ucb79\u0800\u385b\u5654, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
        Label_0451:
        var_1_1C7 = and:int(var_1_FA:int, ldc:int(1281814387))
        var_3_1C8 = stack_1C8_0:double
        
        if (cmpge:boolean(var_3_1C8:double, ldc:double(100.0))) {
            if (cmple:boolean(var_3_1C8:double, ldc:double(22500.0))) {
                goto(Label_0496)
            }
        }
        
        Label_0465:
        
        if (cmpeq:boolean(and:int(var_1_1C7:int, ldc:int(524288)), ldc:int(0))) {
            var_1_1C7 = and:int(var_1_1C7:int, ldc:int(-273682438))
            invokespecial:void(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ucfaf\uc246\u960f\u6b0d\u6bb9\u6d99, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)
        }
        
        Label_0496:
        
        if (cmpne:boolean(and:int(var_1_1C7:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0465)
        }
        
        var_1_40F = and:int(var_1_1C7:int, ldc:int(-1727593638))
        
        if (cmplt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), ldc:double(4096.0))) {
            if (logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u759a\u61a4\ub171\uae87\uc2bd\u34df, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\ube23\u67d0\u64f2\u839e\u76bc](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))) {
                goto(Label_0626)
            }
            
            putfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, add:int(getfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), and:int(ldc:int(16409), ldc:int(13441))))
            var_18_30D = add:float(d2f:float(mul:double(invokestatic:double(Math::acos, f2d:double(d2f:float(invokevirtual:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u59ec\uae87\u97e6\ua3b4\u156b\ufcaf, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, mul:float(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), ldc:float(0.017453292f)))), ldc:double(0.0), f2d:double(neg:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, mul:float(getfield:float(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), ldc:float(0.017453292f))))))), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))), ldc:double(0.0), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))))))))), ldc:double(57.2957763671875))), ldc:float(0.5f))
            
            if (cmpge:boolean(getfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), and:int(ldc:int(3605), ldc:int(15)))) {
                if (cmpge:boolean(var_18_30D:float, ldc:float(0.0f))) {
                    if (cmplt:boolean(var_18_30D:float, ldc:float(10.0f))) {
                        var_19_351 = invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u8cae\u7af6\u4492\u836c\ubb2b\uc246, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), ldc:float(1.0f))
                        var_20_365 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u8640\u6d99\u7330\ua61f\u7e3f\u4d85, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))), mul:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, var_19_351:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(1.0)))
                        var_22_378 = add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ufcaf\u6b0d\u4179\u7bad\ub19c\u718f, getfield:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u8640\u6d99\u7330\ua61f\u7e3f\u4d85, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), ldc:double(0.5)), ldc:double(0.5))
                        var_24_38C = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u8640\u6d99\u7330\ua61f\u7e3f\u4d85, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))), mul:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, var_19_351:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), ldc:double(1.0)))
                        var_26_398 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), var_20_365:double)
                        var_28_3A7 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ufcaf\u6b0d\u4179\u7bad\ub19c\u718f, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), ldc:double(0.5)), var_22_378:double)
                        var_30_3B3 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), var_24_38C:double)
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ub19c\uc29a\u5db4\u52d3\u3e2a\u8413, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))) {
                            invokevirtual:void(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d()), and:int(ldc:int(1017), ldc:int(2045)), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), and:int(ldc:int(-9218), ldc:int(9217)))
                        }
                        
                        var_1_3C3 = and:int(var_1_40F:int, ldc:int(487802655))
                        var_32_3DC = initobject:\u3a62\u4f4a\ub19c\u6198\ud158(\u3a62\u4f4a\ub19c\u6198\ud158::<init>, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\ube23\u67d0\u64f2\u839e\u76bc](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), var_26_398:double, var_28_3A7:double, var_30_3B3:double)
                        invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u392e\u4179\ud51e\u12b2\ub83f\u960f, var_32_3DC:\u3a62\u4f4a\ub19c\u6198\ud158[expected:\u7d52\u718f\u3776\u6fb0\ub83f], var_20_365:double, var_22_378:double, var_24_38C:double, ldc:float(0.0f), ldc:float(0.0f))
                        invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u72f1\u7ce1\ucef1\ub83f\u516c](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u12cb\ubf56\u647c\u7330\u446c\u836c, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), var_32_3DC:\u3a62\u4f4a\ub19c\u6198\ud158[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                        putfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, and:int(ldc:int(5635), ldc:int(-5636)))
                        
                        if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                            loop {
                                var_1_3C3 = and:int(var_1_3C3:int, ldc:int(2025836339))
                                
                                if (invokevirtual:boolean(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\uf9c5\u8aa5\u97b7\u64f2\ucb79\u3bd6, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))) {
                                    looporswitchbreak()
                                }
                                
                                invokevirtual:void(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u6cfe\u36d3\u9255\ub171\u4bc8\u5140, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
                            }
                        }
                        
                        var_1_40F = and:int(var_1_3C3:int, ldc:int(993253274))
                        invokevirtual:void(\u0b8e\u6198\u40a9\uafe7\u6b5f::\u4d85\u8bb0\u8389\u3d4b\ub32d\u3e75, invokevirtual:\u0b8e\u6198\u40a9\uafe7\u6b5f(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u5654\u72f1\u7043\u718f\ubded\u3dd3, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\u6bb9\uc29a\u3a62\u8cae\u61a4>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\uae87\u3dd3\u8308\u6c52\ubcb0\u6d69))
                    }
                }
            }
            
            var_1_FA = and:int(var_1_40F:int, ldc:int(-591971453))
            goto(Label_0558)
        }
        
        Label_0531:
        
        if (cmpeq:boolean(and:int(var_1_40F:int, ldc:int(134217728)), ldc:int(0))) {
            var_1_40F = and:int(var_1_40F:int, ldc:int(1338040035))
        }
        else {
            var_1_FA = and:int(var_1_40F:int, ldc:int(-614844621))
            
            if (cmple:boolean(getfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), ldc:int(0))) {
                goto(Label_0558)
            }
            
            putfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, sub:int(getfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), xor:int(ldc:int(4177), ldc:int(4176))))
            goto(Label_0558)
        }
        
        Label_0626:
        
        if (cmpeq:boolean(and:int(var_1_40F:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0531)
        }
        
        var_1_FA = and:int(var_1_40F:int, ldc:int(-1375511786))
        
        if (cmpgt:boolean(getfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), ldc:int(0))) {
            putfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, sub:int(getfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), and:int(ldc:int(769), ldc:int(33))))
        }
        
        Label_0558:
        
        if (cmpne:boolean(and:int(var_1_FA:int, ldc:int(4)), ldc:int(0))) {
            var_1_FA = and:int(var_1_FA:int, ldc:int(-1597716171))
            goto(Label_0217)
        }
        
        if (cmpne:boolean(and:int(var_1_FA:int, ldc:int(16384)), ldc:int(0))) {
            var_1_90 = and:int(var_1_FA:int, ldc:int(-1007830439))
            goto(Label_0160)
        }
        
        if (cmpeq:boolean(and:int(var_1_FA:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0103)
    }
    
    private void \ucfaf\uc246\u960f\u6b0d\u6bb9\u6d99() {
        var_1_61 : int
        var_1_1D3 : int
        var_3_86 : int
        var_4_88 : int
        stack_15A_1 : int [generated]
        var_4_1E7 : int
        
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
        var_1_61 = and:int(ldc:int(1415479010), ldc:int(2146597614))
        
        if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
            if (logicalnot:boolean(invokevirtual:boolean(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\uf9c5\u8aa5\u97b7\u64f2\ucb79\u3bd6, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))) {
                goto(Label_0275)
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_1_61 = and:int(var_1_61:int, ldc:int(-1176662384))
        }
        else {
            var_1_1D3 = and:int(var_1_61:int, ldc:int(1593015921))
            var_3_86 = var_4_88 = invokevirtual(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u0b8e\u51fa\u5db4\uf94d\u88c5\uc229, getfield(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this))
            
            if (cmpeq:boolean(invokevirtual:int(Random::nextInt, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\ube23\u67d0\u64f2\u839e\u76bc](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), ldc:int(8)), ldc:int(0))) {
                if (getfield:boolean(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u5245\u93a2\u5d20\u6435\ubefe\u7c6b, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)) {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-1871560966))
                    stack_15A_1 = and:int[expected:boolean](ldc:int(16949), ldc:int(-17014))
                }
                else {
                    stack_15A_1 = and:int[expected:boolean](ldc:int(1033), ldc:int(129))
                }
                
                var_1_1D3 = and:int(var_1_1D3:int, ldc:int(1280490474))
                putfield:boolean(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u5245\u93a2\u5d20\u6435\ubefe\u7c6b, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, stack_15A_1:boolean)
                var_4_88 = add:int(var_3_86:int, ldc:int(6))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0421)
                }
                
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(16777216)), ldc:int(0))) {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(13837139))
                    goto(Label_0365)
                }
                
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(16)), ldc:int(0))) {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-276124695))
                }
                else {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-1552188801))
                    
                    if (getfield:boolean(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u5245\u93a2\u5d20\u6435\ubefe\u7c6b, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)) {
                        inc:int(var_4_88, ldc:int(1))
                        goto(Label_0365)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0421)
                }
                
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(1)), ldc:int(0))) {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(1742440403))
                }
                else {
                    if (cmpeq:boolean(and:int(var_1_1D3:int, ldc:int(8192)), ldc:int(0))) {
                        var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-612959929))
                        loopcontinue()
                    }
                    
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(1868512230))
                    inc:int(var_4_88, ldc:int(-1))
                }
                
                Label_0365:
                
                if (cmpeq:boolean(and:int(var_1_1D3:int, ldc:int(134217728)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_1D3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_1_1D3 = and:int(var_1_1D3:int, ldc:int(1790642377))
                        goto(Label_0208)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(256)), ldc:int(0))) {
                        var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-1295334169))
                        loopcontinue()
                    }
                    
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(8044404))
                    
                    if (cmpne:boolean(invokevirtual:\u4ab3\u839e\u0c95\u4c04\u64ab(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u6435\ua068\u3776\u4bc8\u52d3\u93a2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), aconstnull:\u4ab3\u839e\u0c95\u4c04\u64ab())) {
                        if (cmpgt:boolean(invokevirtual:int(\u4ab3\u839e\u0c95\u4c04\u64ab::\u9a18\u3dd3\ua3b4\u6d69\u7d52\u5fe1, invokevirtual:\u4ab3\u839e\u0c95\u4c04\u64ab(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u6435\ua068\u3776\u4bc8\u52d3\u93a2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))), ldc:int(0))) {
                            var_4_1E7 = rem:int(var_4_88:int, ldc:int(12))
                            
                            if (cmpge:boolean(var_4_1E7:int, ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            inc:int(var_4_1E7, ldc:int(12))
                            looporswitchbreak()
                        }
                    }
                }
                
                Label_0421:
                
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0365)
                }
                
                if (cmpeq:boolean(and:int(var_1_1D3:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-1364957468))
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_1_1D3:int, ldc:int(2048)), ldc:int(0))) {
                    var_1_1D3 = and:int(var_1_1D3:int, ldc:int(-1470922908))
                    var_4_1E7 = add:int(and:int(sub:int(var_4_88:int, ldc:int(12)), ldc:int(7)), ldc:int(12))
                    looporswitchbreak()
                }
                
                var_1_1D3 = and:int(var_1_1D3:int, ldc:int(1290221485))
            }
            
            var_1_61 = and:int(var_1_1D3:int, ldc:int(-654935300))
            putfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, invokevirtual:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u6fb0\uf9c5\u527a\u600f\uae87\u8cae, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), var_3_86:int, var_4_1E7:int, checkcast:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e(\u3504\ufe34\u600f\u6b0d\u69d9.\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e.class, aconstnull:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e())))
            
            if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                invokevirtual:void(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u6cfe\u36d3\u9255\ub171\u4bc8\u5140, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_1_61:int, ldc:int(131072)), ldc:int(0))) {
            invokespecial:void(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u8308\u3bd6\uc2bd\u67d0\u40a9\u3a62, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)
            return:void()
        }
        
        goto(Label_0105)
    }
    
    private void \u8308\u3bd6\uc2bd\u67d0\u40a9\u3a62() {
        var_1_61 : int
        var_3_8C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_4_99 : double
        var_6_A0 : double
        var_8_BD : double
        
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
            var_1_61 = and:int(ldc:int(689950363), ldc:int(-820020005))
            
            if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                if (logicalnot:boolean(invokevirtual:boolean(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\uf9c5\u8aa5\u97b7\u64f2\ucb79\u3bd6, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))) {
                    var_3_8C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u74b1\u7d52\u6b0d\u8709\u2dcc\u88c5, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
                    invokevirtual:void(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u6cfe\u36d3\u9255\ub171\u4bc8\u5140, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
                    var_4_99 = i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_3_8C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                    var_6_A0 = i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_3_8C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                    
                    loop {
                        var_1_61 = and:int(var_1_61:int, ldc:int(204958867))
                        var_8_BD = f2d:double(add:float(i2f:float(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_3_8C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), mul:float(invokevirtual:float(Random::nextFloat, invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\ube23\u67d0\u64f2\u839e\u76bc](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))), ldc:float(20.0f))))
                        
                        if (cmplt:boolean(var_8_BD:double, i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_3_8C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))) {
                            loopcontinue()
                        }
                        
                        looporswitchbreak()
                    }
                    
                    putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ubf56\u4e72\ucb79\u0800\u385b\u5654, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, var_4_99:double, var_8_BD:double, var_6_A0:double))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\u64f2\u52d3\ud523\u1187\u8bb0() {
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
            putfield:int(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4492\u7af6\u7ce1\u3c25\u527a\u965f, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, and:int(ldc:int(29113), ldc:int(-29114)))
            putfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ubf56\u4e72\ucb79\u0800\u385b\u5654, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())
            putfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())
            putfield:\ube23\u67d0\u64f2\u839e\u76bc(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\uc4d2\ub70c\ubf56\u12cb\u97b7(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_4_6E : int
        var_5_8C : int
        var_6_98 : int
        var_7_A4 : int
        var_8_B1 : double
        var_10_BE : double
        
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
            putfield:\ube23\u67d0\u64f2\u839e\u76bc(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, p0:\ube23\u67d0\u64f2\u839e\u76bc)
            var_4_6E = invokevirtual:int(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u0b8e\u51fa\u5db4\uf94d\u88c5\uc229, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
            var_5_8C = invokevirtual:int(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\ua61f\u965f\ua068\u946b\ub113\uc31c, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
            var_6_98 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
            var_7_A4 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
            var_8_B1 = sub:double(i2d:double(var_6_98:int), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
            var_10_BE = sub:double(i2d:double(var_7_A4:int), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)))
            putfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa, invokevirtual:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u6fb0\uf9c5\u527a\u600f\uae87\u8cae, getfield:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc2e8\u88c5\ua562\u8d98\u7049\u76bc, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), var_4_6E:int, var_5_8C:int, initobject:\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e(\u6b5f\u4daf\uafe7\u93a2\u718f\uc84e::<init>, var_6_98:int, invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u47c2\u8640\u52d3\u3d64\u5654\u0b8e, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)), invokestatic:double(Math::min, sub:double(add:double(ldc:double(0.4000000059604645), div:double(f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_8_B1:double, var_8_B1:double), mul:double(var_10_BE:double, var_10_BE:double)))), ldc:double(80.0))), ldc:double(1.0)), ldc:double(10.0)))), var_7_A4:int)))
            
            if (cmpne:boolean(getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa), aconstnull:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0())) {
                invokevirtual:void(\u6c52\u647c\u3a62\u7af6\u62da\u8bb0::\u6cfe\u36d3\u9255\ub171\u4bc8\u5140, getfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ufe34\u51b2\u4c2b\u8413\u8d98\uc29a, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
                invokespecial:void(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u8308\u3bd6\uc2bd\u67d0\u40a9\u3a62, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 \ubefe\u5bc4\u16f6\u92ee\u1187\u0b8e() {
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
            return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(getfield:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\ubf56\u4e72\ucb79\u0800\u385b\u5654, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa))
        }
        
        goto(Label_0006)
    }
    
    public \u56bd\u8413\u647c\u5bc4\ud158.\uc9f6\ud523\u0b8e\u74b1\ubff1<\u12b2\u9a18\uc7fe\u4c2b\u6c52.\uc87f\ua6bd\ub19c\uc2bd\u51fa> \u873d\u624e\ud171\ub83f\ub83f\u3bc9() {
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
            return:\uc9f6\ud523\u0b8e\u74b1\ubff1<\uc87f\ua6bd\ub19c\uc2bd\u51fa>(getstatic:\uc9f6\ud523\u0b8e\u74b1\ubff1<\uc87f\ua6bd\ub19c\uc2bd\u51fa>(\uc9f6\ud523\u0b8e\u74b1\ubff1::\u6c56\u4f4a\u7049\u759a\ub19c\u99f7))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9F_0 : byte[] [generated]
        stack_A1_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_19A_0 : byte[] [generated]
        stack_221_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_132 : byte[]
        var_4_133 : int
        expr_A1 : int [generated]
        var_5_183 : int
        var_3_188 : byte[]
        var_4_189 : int
        var_0_1B4 : int
        expr_19A : byte [generated]
        stack_1EC_2 : byte [generated]
        stack_1C0_0 : byte [generated]
        expr_C9 : int [generated]
        var_3_20F : byte[]
        var_4_210 : int
        expr_224 : byte [generated]
        var_3_F0 : String
        stack_123_0 : String[] [generated]
        expr_102 : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-686229315), ldc:int(-564274753))
            expr_68 = var_2_6C = stack_9F_0 = stack_A1_0 = stack_C7_0 = stack_C9_0 = stack_E4_0 = stack_19A_0 = stack_221_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("A0lEAX+90oVAMkJARc2GgHd8fr/QhsAwwUPTvACzwAQHAMy+gAKHQDJCQEXMh7y0T0D/NgFBy44M"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_132 = newarray:byte[](byte.class, expr_70:int)
                var_4_133 = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(2130685693))
                    var_4_133 = add:int(var_4_133:int, ldc:int(-1))
                    storeelement:byte(var_3_132:byte[], var_4_133:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_133:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_133:int, and:int(ldc:int(16385), ldc:int(8371)))), ldc:int(2)), xor:int(ldc:int(5149), ldc:int(5154)))))
                    
                    if (cmpne:boolean(var_4_133:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A1_0 = stack_9F_0 = stack_C7_0 = stack_C9_0 = stack_E4_0 = stack_19A_0 = stack_221_0 = var_3_132:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-40497522))
                    goto(Label_0206)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1196603816))
                }
                else {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-75517187))
                    expr_A1 = arraylength:int(stack_A1_0:byte[])
                    
                    if (cmpne:boolean(expr_A1:int, ldc:int(0))) {
                        var_5_183 = expr_A1:int
                        var_3_188 = newarray:byte[](byte.class, expr_A1:int)
                        var_4_189 = expr_A1:int
                        
                        loop {
                            var_0_1B4 = and:int(var_0_61:int, ldc:int(-753364995))
                            var_4_189 = add:int(var_4_189:int, ldc:int(-1))
                            expr_19A = stack_1EC_2 = loadelement(stack_19A_0, var_4_189)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_189:int, ldc:int(3)), neg:int(var_5_183:int)), ldc:int(0))) {
                                stack_1EC_2 = stack_1C0_0 = add:byte(expr_19A:byte, loadelement:byte(var_3_188:byte[], add:int(var_4_189:int, ldc:int(3))))
                                goto(Label_0464)
                            }
                            
                            Label_0423:
                            
                            if (cmpeq:boolean(and:int(var_0_1B4:int, ldc:int(268435456)), ldc:int(0))) {
                                var_0_1B4 = and:int(var_0_1B4:int, ldc:int(-1393960915))
                            }
                            else {
                                var_0_1B4 = and:int(var_0_1B4:int, ldc:int(-220464193))
                                stack_1EC_2 = stack_1C0_0 = add:byte(expr_19A:byte, ldc:byte(3))
                            }
                            
                            Label_0464:
                            
                            if (cmpne:boolean(and:int(var_0_1B4:int, ldc:int(536870912)), ldc:int(0))) {
                                var_0_1B4 = and:int(var_0_1B4:int, ldc:int(-1861597271))
                                goto(Label_0423)
                            }
                            
                            var_0_61 = and:int(var_0_1B4:int, ldc:int(1922672639))
                            storeelement:byte(var_3_188:byte[], var_4_189:int, stack_1EC_2:byte)
                            
                            if (cmpne:boolean(var_4_189:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A1_0 = stack_9F_0 = stack_C7_0 = stack_C9_0 = stack_E4_0 = stack_19A_0 = stack_221_0 = var_3_188:byte[]
                    }
                }
                
                Label_0166:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(33554432)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(33554432)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_61:int, ldc:int(1487384169))
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(1541056239))
                    expr_C9 = arraylength:int(stack_C9_0:byte[])
                    
                    if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                        var_3_20F = newarray:byte[](byte.class, expr_C9:int)
                        var_4_210 = expr_C9:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(-73882115))
                            var_4_210 = add:int(var_4_210:int, ldc:int(-1))
                            expr_224 = add:byte(loadelement:byte(stack_221_0:byte[], var_4_210:int), ldc:byte(111))
                            storeelement:byte(var_3_20F:byte[], var_4_210:int, xor:int(or:int(and:int(shl:int(expr_224:byte, and:int(ldc:int(1094), ldc:int(548))), ldc:int(-16)), and:int(shr:int(expr_224:byte[expected:int], and:int(ldc:int(17668), ldc:int(8260))), ldc:int(15))), ldc:int(59)))
                            
                            if (cmpne:boolean(var_4_210:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A1_0 = stack_9F_0 = stack_C7_0 = stack_C9_0 = stack_E4_0 = stack_19A_0 = stack_221_0 = var_3_20F:byte[]
                    }
                }
                
                Label_0206:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0166)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_F0 = initobject:String(String::<init>, stack_E4_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_123_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(529), ldc:int(20619)))
            expr_102 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3), ldc:int(2)))
            storeelement:String(expr_102:String[], and:int(ldc:int(-7790), ldc:int(7205)), invokevirtual:String[expected:String](String::substring, var_3_F0:String, and:int(ldc:int(17956), ldc:int(-17957)), and:int(ldc:int(16767), ldc:int(56))))
            putstatic:String[](\uc87f\ua6bd\ub19c\uc2bd\u51fa::\u4cd9\ua562\u67e9\u9255\ube23\u5d20, expr_102:String[])
            putstatic:Logger(\uc87f\ua6bd\ub19c\uc2bd\u51fa::\uc7fe\u4daf\u64f2\u52d3\u47c2\u8cae, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc246\ucfaf\u416d\u3504\u4d85\u7330(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_640 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_64B : int
        
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
        var_3_640 = and:int(ldc:int(1233646621), ldc:int(2125953657))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\ua6bd\ub19c\uc2bd\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_640 = and:int(var_3_640:int, ldc:int(2062547854))
            var_5_81 = and:int(ldc:int(22180), ldc:int(-22181))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16703), ldc:int(-19456)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_640:int, ldc:int(-173573715))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, xor:int(ldc:int(3082), ldc:int(3083)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(-28669), ldc:int(-28670)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_640 = and:int(var_3_D0:int, ldc:int(-424415092))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32352), ldc:int(-32351)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1280565384))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(150354005))
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-621026086))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(489945829))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(2127787066))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(470403088))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(349335691))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(96337238))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-185302125))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(256)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1712402658))
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(1991241263))
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(-845188216))
                        var_11_E1 = and:int(ldc:int(21123), ldc:int(-21124))
                        goto(Label_1478)
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-190721715))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-633779137))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(2088992126))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(211087742))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1221282202))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-447500504))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(-1630408736))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(-1894476004))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(-378324511))
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(1862269498))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1708790651))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-858663013))
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(6059498))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-614196599))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(-429441537))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(-726699384))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = and:int(ldc:int(83), ldc:int(4225))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0957:
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1484351108))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(440543842))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(302627874))
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(-2025226205))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(-897319047))
                        var_11_E1 = and:int(ldc:int(7556), ldc:int(-8071))
                    }
                    
                    Label_1114:
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-936472000))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(-1054536021))
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(-443288212))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1354)
                            }
                        }
                    }
                    
                    Label_1219:
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-1622838566))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(1951537691))
                            goto(Label_1114)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0957)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(1925207800))
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_640:int, ldc:int(256)), ldc:int(0))) {
                            var_3_640 = and:int(var_3_640:int, ldc:int(1654852660))
                            loopcontinue()
                        }
                        
                        var_3_640 = and:int(var_3_640:int, ldc:int(-994575031))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1478)
                    }
                    
                    Label_1354:
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1538530051))
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0957)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(2085577886))
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-1318252133))
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_640 = and:int(var_3_640:int, ldc:int(-1058046545))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1478:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1489:
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1219)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(943091317))
                        goto(Label_0957)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(183438425))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(-1113774363))
                        goto(Label_0396)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_640:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_640 = and:int(var_3_640:int, ldc:int(1253046047))
                        var_17_64B = add:int(var_16_10F:int, and:int(ldc:int(2849), ldc:int(4165)))
                        looporswitchbreak()
                    }
                    
                    var_3_640 = and:int(var_3_640:int, ldc:int(-220289215))
                }
                
                var_3_640 = and:int(var_3_640:int, ldc:int(-940050371))
                
                if (cmple:boolean(var_5_81 = var_17_64B:int, sub:int(var_6_88:int, and:int(ldc:int(9), ldc:int(85))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_640:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
