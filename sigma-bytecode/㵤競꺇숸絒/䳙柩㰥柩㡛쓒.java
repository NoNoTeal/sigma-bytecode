public class \u3d64\u7af6\uae87\uc238\u7d52.\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2 {
    public void \u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2(\u59ec\u8413\u97e6\uc229\u3776.\u34df\u7d52\u7049\u5140\ucfaf\ub70c p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\uff55\u873d\ubded\u759a\u9255\uc229 p1, \u6435\ub8be\u718f\u6b0d\u67e9.\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2 p2) {
        var_6_75 : float
        var_7_7B : float
        expr_84 : float[] [generated]
        var_8_9C : float[]
        expr_E2 : float[] [generated]
        var_9_FF : float[]
        
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
            invokespecial:Object(Object::<init>, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2)
            putfield:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u873d\u4f52\u3bc9\u4f52\ufe34\ua61f, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            putfield:float(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u3d64\u4c04\u8df4\u5245\u8413\u4e72, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2, invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u3c25\uc3e3\u8640\ub6ab\u760c\u3e75, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2))
            var_6_75 = invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\ube23\uf995\u92ee\u3e2a\uafe7\uf94d, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            var_7_7B = invokevirtual:float(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4f4a\u6d69\u760c\u5140\u3e75\u3a62, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2)
            expr_84 = newarray:float[](float.class, and:int(ldc:int(259), ldc:int(2754)))
            storeelement:float(expr_84:float[], and:int(ldc:int(2726), ldc:int(-2727)), var_6_75:float)
            storeelement:float(expr_84:float[], and:int(ldc:int(26945), ldc:int(17)), var_7_7B:float)
            var_8_9C = expr_84:float[]
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, invokevirtual:\uff55\u873d\ubded\u759a\u9255\uc229(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4492\u64ab\u839e\u4cd9\u12cb\u516c, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2), var_8_9C:float[], and:int(ldc:int(-3253), ldc:int(2228)), var_8_9C:float[], and:int(ldc:int(-8716), ldc:int(8715)), xor:int(ldc:int(-16384), ldc:int(-16383)))
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, p1:\uff55\u873d\ubded\u759a\u9255\uc229, var_8_9C:float[], and:int(ldc:int(-11532), ldc:int(11523)), var_8_9C:float[], and:int(ldc:int(1651), ldc:int(-1920)), xor:int(ldc:int(1025), ldc:int(1024)))
            expr_E2 = newarray:float[](float.class, xor:int(ldc:int(28688), ldc:int(28690)))
            storeelement:float(expr_E2:float[], and:int(ldc:int(2770), ldc:int(-3795)), var_6_75:float)
            storeelement:float(expr_E2:float[], and:int(ldc:int(8321), ldc:int(5479)), sub:float(var_7_7B:float, getfield:float(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u3d64\u4c04\u8df4\u5245\u8413\u4e72, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2)))
            var_9_FF = expr_E2:float[]
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, invokevirtual:\uff55\u873d\ubded\u759a\u9255\uc229(\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2::\u4492\u64ab\u839e\u4cd9\u12cb\u516c, p2:\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2), var_9_FF:float[], and:int(ldc:int(10760), ldc:int(-10761)), var_9_FF:float[], and:int(ldc:int(7706), ldc:int(-32319)), xor:int(ldc:int(8354), ldc:int(8355)))
            invokevirtual:void(\uff55\u873d\ubded\u759a\u9255\uc229::\u6c52\u3c25\ud12e\u3d4b\u8d90\uae5d, p1:\uff55\u873d\ubded\u759a\u9255\uc229, var_9_FF:float[], and:int(ldc:int(3462), ldc:int(-3551)), var_9_FF:float[], and:int(ldc:int(10390), ldc:int(-10455)), and:int(ldc:int(16387), ldc:int(4097)))
            putfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2, initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, loadelement:float(var_8_9C:float[], and:int(ldc:int(-5100), ldc:int(4331))), loadelement:float(var_8_9C:float[], and:int(ldc:int(65), ldc:int(23329)))))
            putfield:float(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u3d64\u4c04\u8df4\u5245\u8413\u4e72, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2, invokevirtual:float(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::\u61a4\uae87\u156b\ubb2b\ufe34\u3711, initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, loadelement:float(var_9_FF:float[], and:int(ldc:int(-25619), ldc:int(25618))), loadelement:float(var_9_FF:float[], xor:int(ldc:int(8448), ldc:int(8449)))), getfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u72f1\u8c8a\ua562\ub8be\u8258\u9033 \ucef1\ufcaf\u9af2\u4975\u6cfe\u4e72(float p0, float p1) {
        var_5_79 : float
        
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
            var_5_79 = div:float(invokevirtual:float(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::\u61a4\uae87\u156b\ubb2b\ufe34\u3711, getfield:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u0b8e\ub1b9\ub6ab\ub70c\uc4d2\u8c8a, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2), initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, p0:float, p1:float)), getfield:float(\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2::\u3d64\u4c04\u8df4\u5245\u8413\u4e72, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2))
            
            if (cmpgt:boolean(var_5_79:float, ldc:float(0.99f))) {
                var_5_79 = ldc:float(0.99f)
            }
            
            return:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(initobject:\u72f1\u8c8a\ua562\ub8be\u8258\u9033(\u72f1\u8c8a\ua562\ub8be\u8258\u9033::<init>, var_5_79:float, ldc:float(0.0f)))
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
    
    public void \ub83f\u7ce1\u4975\u4179\u516c\u839e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(483004043), ldc:int(-1804605891))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4cd9\u67e9\u3c25\u67e9\u385b\uc4d2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-1724928325))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(1987188122))
            var_5_85 = and:int(ldc:int(-6734), ldc:int(6732))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8754), ldc:int(-29303)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61D:int, ldc:int(-1681396546))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(6549), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(5121), ldc:int(16973)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_D2:int, ldc:int(-226789412))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2177), ldc:int(8215)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-548691279))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1215991856))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1911515265))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(484513400))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1527198413))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-590631028))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1792008970))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1812754945))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(427017246))
                            var_11_E3 = and:int(ldc:int(10050), ldc:int(-10068))
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-155898225))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1884406357))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1446121768))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-279832918))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-524693000))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1466799865))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1874170524))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1574612636))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1389530559))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(817200771))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(306850453))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1728982284))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1654395318))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-993630919))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(162530277))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1653454249))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-184654404))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2064), ldc:int(2065))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(397480404))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-729238344))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(62987109))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-933487870))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1094751954))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-764990085))
                        var_11_E3 = and:int(ldc:int(21184), ldc:int(-23489))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1024607910))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2040993506))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1937910211))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(890610623))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(324904063))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1487251343))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1276438627))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(540658433))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(844796994))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1552358522))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-587257553))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(113268783))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(2100604061))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(854518426))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1094974651))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(333331578))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1463)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1682926227))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-631822761))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-237929324))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(918662031))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-806706481))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2036068433))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(1550259336))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1898012333))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-613284549))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1573406730))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1144905990))
                        var_17_628 = add:int(var_16_111:int, and:int(ldc:int(129), ldc:int(17229)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-1698261777))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, xor:int(ldc:int(16386), ldc:int(16387))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
