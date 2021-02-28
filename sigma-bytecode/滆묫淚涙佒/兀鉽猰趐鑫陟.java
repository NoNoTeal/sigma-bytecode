public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u5140\u927d\u7330\u8d90\u946b\u965f {
    public void \u5140\u927d\u7330\u8d90\u946b\u965f() {
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
            invokespecial:Object(Object::<init>, this:\u5140\u927d\u7330\u8d90\u946b\u965f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Iterator<\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910> \ub32d\u7049\ub102\uc9f6\ub113\ub19c(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2, int p3, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140 p4) {
        var_6_61 : int
        var_8_66 : float
        var_9_B7 : int
        var_10_BF : float
        var_11_C8 : float
        stack_103_0 : float [generated]
        var_12_103 : float
        var_13_10B : float
        var_14_118 : float
        var_15_126 : float
        var_16_15C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_6_61 = and:int(ldc:int(1039155123), ldc:int(-587662917))
        var_8_66 = invokestatic:float(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u6d99\u67e9\u4bc8\u6c56\u3504\u3776)
        
        if (logicaland:boolean(cmpgt:boolean(var_8_66:float, ldc:float(0.0f)), cmplt:boolean(var_8_66:float, i2f:float(mul:int(sub:int(p3:int, xor:int(ldc:int(17568), ldc:int(17569))), ldc:int(16)))))) {
            var_9_B7 = add:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, div:float(var_8_66:float, ldc:float(16.0f))), and:int(ldc:int(8193), ldc:int(2305)))
            var_10_BF = invokevirtual:float(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u51fa\u8c8a\u4daf\u760c\uc229\u600f, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], d2f:float(p1:double))
            var_11_C8 = mul:float(getstatic:float(\uc238\u69d9\u92ff\ub83f\u5245\uc229::\u6ec6\u4e72\u98a4\uc246\u8aa5\uf995), getstatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u6c56\ube23\u6435\ub32d\u3a62\u8389))
            
            if (logicaland:boolean(cmpgt:boolean(var_10_BF:float, getstatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7af6\u6bb9\u4e72\u6b5f\u5d20\u7330)), cmplt:boolean(var_10_BF:float, mul:float(ldc:float(3.0f), getstatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7af6\u6bb9\u4e72\u6b5f\u5d20\u7330))))) {
                stack_103_0 = add:float(var_10_BF:float, getstatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u2dcc\u3e75\u36d3\u3bc9\ub8be\u5f50))
            }
            else {
                var_6_61 = and:int(var_6_61:int, ldc:int(936443363))
                stack_103_0 = var_10_BF:float
            }
            
            var_12_103 = stack_103_0:float
            var_13_10B = neg:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_12_103:float))
            var_14_118 = mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_12_103:float), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_11_C8:float))
            var_15_126 = mul:float(neg:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, var_12_103:float)), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, var_11_C8:float))
            var_16_15C = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), and:int(ldc:int(2116), ldc:int(29207))), shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), and:int(ldc:int(4204), ldc:int(17412))), shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p2:\u7d52\u718f\u3776\u6fb0\ub83f)), and:int(ldc:int(18436), ldc:int(8230))))
            return:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(initobject:\u9a18\ua3b4\ufcaf\ud12e\u3711\u446c(\u9a18\ua3b4\ufcaf\ud12e\u3711\u446c::<init>, p4:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_16_15C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, f2d:double(mul:float(neg:float(var_13_10B:float), i2f:float(var_9_B7:int))), f2d:double(mul:float(neg:float(var_14_118:float), i2f:float(var_9_B7:int))), f2d:double(mul:float(neg:float(var_15_126:float), i2f:float(var_9_B7:int)))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_16_15C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, f2d:double(mul:float(var_13_10B:float, i2f:float(p3:int))), f2d:double(mul:float(var_14_118:float, i2f:float(p3:int))), f2d:double(mul:float(var_15_126:float, i2f:float(p3:int)))), var_9_B7:int, var_9_B7:int))
        }
        
        return:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(invokeinterface:Iterator<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(List<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>::iterator, invokestatic:List<\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910>(Arrays::asList, getfield:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910[](\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140::\uf9c5\u62da\ub19c\u8753\u92ee\u8c8a, p4:\u61a4\u946b\u4daf\uc2e8\uc4d2\u5140))))
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
    
    public void \u5140\uc2bd\ud36e\u5140\u6b5f\u5654(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_631 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_63C : int
        
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
        var_3_631 = and:int(ldc:int(-850575123), ldc:int(-506301572))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u927d\u7330\u8d90\u946b\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
            var_3_631 = and:int(var_3_631:int, ldc:int(1971944693))
        }
        else {
            var_3_631 = and:int(var_3_631:int, ldc:int(-181543699))
            var_5_85 = and:int(ldc:int(-14012), ldc:int(13883))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29107), ldc:int(4530)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_631:int, ldc:int(-2120035969))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(-12032), ldc:int(-12031)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4872), ldc:int(4873)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_631 = and:int(var_3_DA:int, ldc:int(-1047072019))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(579), ldc:int(578)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-776956483))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1462943011))
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1415003239))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1200577853))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-911065793))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1172623144))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-687493494))
                    }
                    else {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1423553073))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1134209119))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1540246458))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-645299910))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1814165239))
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1590162356))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(866388544))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-2011869341))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1894387330))
                            var_11_EB = and:int(ldc:int(16684), ldc:int(-26413))
                            goto(Label_1470)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0597:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(91714014))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1623689905))
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(2065985866))
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(263913194))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-421193046))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-859806314))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1854336968))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1325516532))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1692612018))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0740:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1316417363))
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-84221311))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1983846456))
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(313938666))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-247217329))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(451926939))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(728186249))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(1317063345))
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(926767578))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-517351768))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1476792228))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(1541), ldc:int(10273))
                                goto(Label_1126)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1080936227))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(986499711))
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-66777670))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0740)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1754529738))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1081784756))
                        var_11_EB = and:int(ldc:int(-23640), ldc:int(23619))
                    }
                    
                    Label_1126:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-481215779))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-1350633283))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(954330737))
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-654329802))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-135721401))
                            loopcontinue()
                        }
                        
                        var_3_631 = and:int(var_3_631:int, ldc:int(-549684227))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1360)
                            }
                        }
                    }
                    
                    Label_1251:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-551420934))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1126)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(64)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-538760119))
                            goto(Label_0740)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                            var_3_631 = and:int(var_3_631:int, ldc:int(-581284530))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1470)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1360:
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(146272526))
                        goto(Label_0740)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1351040578))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_631 = and:int(var_3_631:int, ldc:int(-479370660))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1470:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63C = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1481:
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-168530292))
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1251)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1126)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1476593152))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(1920378073))
                        goto(Label_0740)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_631 = and:int(var_3_631:int, ldc:int(-1477313585))
                        var_17_63C = add:int(var_16_119:int, xor:int(ldc:int(8208), ldc:int(8209)))
                        looporswitchbreak()
                    }
                    
                    var_3_631 = and:int(var_3_631:int, ldc:int(341520197))
                }
                
                var_3_631 = and:int(var_3_631:int, ldc:int(-113117825))
                
                if (cmple:boolean(var_5_85 = var_17_63C:int, sub:int(var_6_8C:int, and:int(ldc:int(7169), ldc:int(293))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_631:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_631 = and:int(var_3_631:int, ldc:int(2112760806))
            goto(Label_0106)
        }
    }
}
