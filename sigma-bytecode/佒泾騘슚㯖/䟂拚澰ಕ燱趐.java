public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u47c2\u62da\u6fb0\u0c95\u71f1\u8d90 {
    public void \u47c2\u62da\u6fb0\u0c95\u71f1\u8d90() {
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
            invokespecial:Object(Object::<init>, this:\u47c2\u62da\u6fb0\u0c95\u71f1\u8d90)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 \uc3e3\u4cd9\ub6ab\u64ab\u40a9\ub32d(\u3504\ufe34\u600f\u6b0d\u69d9.\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1, double p2) {
        var_6_74 : double
        var_8_83 : double
        var_10_92 : double
        
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
        var_6_74 = mul:double(p2:double, i2d:double(invokevirtual:int(\u4f52\u92ee\u6ec6\u927d\uc246\u59ec::\u5654\u4f52\u8df4\uc84e\uafe7\u59ec, invokevirtual:\u4f52\u92ee\u6ec6\u927d\uc246\u59ec(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u59ec\u93a2\u3bd6\u4e72\u3e75, p1:\u760c\u4975\u4179\uc246\u8640\u64f2))))
        var_8_83 = invokestatic:double(Math::min, var_6_74:double, ldc:double(0.0))
        var_10_92 = invokestatic:double(Math::max, var_6_74:double, ldc:double(0.0))
        
        switch (loadelement:int(getstatic:int[](\u0a06\u946b\ub1b9\ufcaf\ub83f\ua3b4::\uc229\u4f52\ub8be\uc87f\uf995\u3bc9), invokevirtual:int(Enum<E>::ordinal, p1:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]))) {
            case 1:
                return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_83:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_92:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))
            
            case 2:
                return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_83:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_92:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))
            
            case 3:
                return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_83:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_92:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))
            
            default:
                return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_83:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_92:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7)))
            
            case 5:
                return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_83:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u2dcc\u36d3\u6198\u5140\u97e6\u61a4, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_92:double)))
            
            case 6:
                return:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(initobject:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::<init>, getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u7006\uf94d\u6c56\uf94d\u9033\u7bad, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ube23\u1833\ufe34\u8c8a\ud217\ubb2b, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_8_83:double), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\ub6ab\u3c25\uae5d\u9af2\ufe34\u3504, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u52d3\u647c\ua3b4\u6435\u67e9\u3776, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), add:double(getfield:double(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u8350\u3504\ub6ab\u3e75\u760c\u4bc8, p0:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7), var_10_92:double)))
        }
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
    
    public void \uceb8\u0c95\ud158\u3bc9\u960f\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(1030434121), ldc:int(-1617056165))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u47c2\u62da\u6fb0\u0c95\u71f1\u8d90[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-606376895))
            var_5_7D = and:int(ldc:int(-12401), ldc:int(12400))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12087), ldc:int(10804)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_615:int, ldc:int(2072591663))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(4225), ldc:int(297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(8745), ldc:int(18437)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_D2:int, ldc:int(-1618245575))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-28662), ldc:int(-28661)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1475358009))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(436416427))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-141260599))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1452183854))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2067649363))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1370560414))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1370773007))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(378948047))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1396655965))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(65526237))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(593026557))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(148896795))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(977758414))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1293670439))
                        var_11_E3 = and:int(ldc:int(-22171), ldc:int(22160))
                        goto(Label_1423)
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1878978760))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(596145964))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2096226079))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2045601544))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1071376759))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-772043224))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-452073373))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(627942520))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-194668733))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-71474057))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-912614450))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(518344362))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1080155494))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1836345425))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1644603817))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8225), ldc:int(4993))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-943869894))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(534640638))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1378114933))
                        var_11_E3 = and:int(ldc:int(3363), ldc:int(-3496))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-678183788))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-72905964))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1136683040))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1001268053))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-282094529))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(264788531))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-841137439))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-426235123))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(192090991))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1788169108))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1021118342))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-281449191))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(369766709))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1140159568))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1974590899))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-252443829))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-473697270))
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-577915339))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(983678020))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1096508513))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(23711508))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1619215626))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1202726757))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1268627134))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(531484483))
                        var_17_620 = add:int(var_16_111:int, and:int(ldc:int(9), ldc:int(4225)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-489338335))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(-643183579))
                
                if (cmple:boolean(var_5_7D = var_17_620:int, sub:int(var_6_84:int, and:int(ldc:int(6161), ldc:int(9605))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(1045364015))
            goto(Label_0106)
        }
    }
}
