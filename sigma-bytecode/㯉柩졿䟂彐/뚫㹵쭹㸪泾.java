public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\ub6ab\u3e75\ucb79\u3e2a\u6cfe {
    public void \ub6ab\u3e75\ucb79\u3e2a\u6cfe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u4e72\ua6bd\u927d\uc238\ub8be p0) {
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
            putfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ub6ab\u3e75\ucb79\u3e2a\u6cfe::\uf995\u64f2\u3711\uc2e8\u927d, this:\ub6ab\u3e75\ucb79\u3e2a\u6cfe, p0:\u4e72\ua6bd\u927d\uc238\ub8be)
            invokespecial:Object(Object::<init>, this:\ub6ab\u3e75\ucb79\u3e2a\u6cfe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a p1) {
        var_5_64 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_6A : \u7d52\u718f\u3776\u6fb0\ub83f
        var_7_9E : \u7d52\u718f\u3776\u6fb0\ub83f
        var_8_A7 : float
        var_9_B0 : float
        
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
        var_5_64 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, p0:\u8640\ud7e8\u8308\u4bc8\uc29a)
        var_6_6A = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, p1:\u8640\ud7e8\u8308\u4bc8\uc29a)
        var_7_9E = ternaryop:\u7d52\u718f\u3776\u6fb0\ub83f(logicaland:boolean(cmpne:boolean(getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776), aconstnull:\u8640\ud7e8\u8308\u4bc8\uc29a()), cmpne:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776)), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8640\ud7e8\u8308\u4bc8\uc29a::\u51b2\u6fb0\ub102\u7006\u873d, getstatic:\u8640\ud7e8\u8308\u4bc8\uc29a(\ube23\uf9c5\u8350\u62da\ub32d::\ub83f\u6c52\u12cb\u3c25\u3776)), getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u4e72\ua6bd\u927d\uc238\ub8be::\uc9f6\ud158\u1187\u16f6\u3bd6, getfield:\u4e72\ua6bd\u927d\uc238\ub8be(\ub6ab\u3e75\ucb79\u3e2a\u6cfe::\uf995\u64f2\u3711\uc2e8\u927d, this:\ub6ab\u3e75\ucb79\u3e2a\u6cfe))))
        var_8_A7 = invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, var_7_9E:\u7d52\u718f\u3776\u6fb0\ub83f, var_5_64:\u7d52\u718f\u3776\u6fb0\ub83f)
        var_9_B0 = invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, var_7_9E:\u7d52\u718f\u3776\u6fb0\ub83f, var_6_6A:\u7d52\u718f\u3776\u6fb0\ub83f)
        
        if (cmplt:boolean(sub:float(var_8_A7:float, var_9_B0:float), ldc:float(0.0f))) {
            return:int(ldc:int(-1))
        }
        
        if (cmpne:boolean(sub:float(var_8_A7:float, var_9_B0:float), ldc:float(0.0f))) {
            return:int(and:int(ldc:int(21569), ldc:int(2051)))
        }
        
        return:int(and:int(ldc:int(-20127), ldc:int(3742)))
    }
    
    public int compare(java.lang.Object p0, java.lang.Object p1) {
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
            return:int(invokevirtual:int(\ub6ab\u3e75\ucb79\u3e2a\u6cfe::compare, this:\ub6ab\u3e75\ucb79\u3e2a\u6cfe, checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, p0:Object[expected:\u8640\ud7e8\u8308\u4bc8\uc29a]), checkcast:\u8640\ud7e8\u8308\u4bc8\uc29a(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u8640\ud7e8\u8308\u4bc8\uc29a.class, p1:Object[expected:\u8640\ud7e8\u8308\u4bc8\uc29a])))
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
    
    public void \u8413\u92ff\u8cae\u392e\u51fa(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5CD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5D8 : int
        
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
        var_3_5CD = and:int(ldc:int(1703076455), ldc:int(1703069951))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\u3e75\ucb79\u3e2a\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1439147746))
        }
        else {
            var_3_5CD = and:int(var_3_5CD:int, ldc:int(2009592820))
            var_5_85 = and:int(ldc:int(15256), ldc:int(-15258))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22820), ldc:int(-23525)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5CD:int, ldc:int(-179179139))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1179), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(3840), ldc:int(3841)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5CD = and:int(var_3_D2:int, ldc:int(-135728395))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(2256), ldc:int(2257)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-492788546))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-406262283))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1590236528))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1415306658))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1430680353))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1147670858))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-460753381))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1195950842))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-235551983))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-171903635))
                        var_11_E3 = and:int(ldc:int(-32098), ldc:int(28001))
                        goto(Label_1375)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(664037726))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-97425248))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-496551221))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-20487995))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1234416788))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2075876919))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(613283599))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2132658156))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-65064177))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(320933049))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1394424054))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-181928095))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1168799341))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(445733404))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1187603672))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1868751974))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(77), ldc:int(76))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(545819171))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1131314906))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(1530531466))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(658434736))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(2007991469))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(1871441778))
                        var_11_E3 = and:int(ldc:int(16918), ldc:int(-16919))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-749620430))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(657923521))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(799455410))
                            loopcontinue()
                        }
                        
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2111697767))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-997678167))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1261394672))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(178711139))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-279266619))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5CD = and:int(var_3_5CD:int, ldc:int(-449786634))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1375)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1431795011))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-1047440739))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(-140320150))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1375:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1386:
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(514017604))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(747577707))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(-157521280))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5CD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5CD = and:int(var_3_5CD:int, ldc:int(2102782949))
                        var_17_5D8 = add:int(var_16_111:int, xor:int(ldc:int(16481), ldc:int(16480)))
                        looporswitchbreak()
                    }
                    
                    var_3_5CD = and:int(var_3_5CD:int, ldc:int(-906964854))
                }
                
                var_3_5CD = and:int(var_3_5CD:int, ldc:int(-14692499))
                
                if (cmple:boolean(var_5_85 = var_17_5D8:int, sub:int(var_6_8C:int, and:int(ldc:int(12721), ldc:int(2573))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5CD:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
