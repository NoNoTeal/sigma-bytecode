public class \u71f1\uc910\u3bc9\u516c\u93a2.\u3776\ud158\u51fa\u7ce1\u12b2\u071d {
    public void \u3776\ud158\u51fa\u7ce1\u12b2\u071d(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p0) {
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
            invokespecial:Object(Object::<init>, this:\u3776\ud158\u51fa\u7ce1\u12b2\u071d)
            putfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\u3776\ud158\u51fa\u7ce1\u12b2\u071d::\u9033\u718f\u071d\u4e72\u3bd6\u5140, this:\u3776\ud158\u51fa\u7ce1\u12b2\u071d, p0:\u873d\ube23\uc84e\u9033\u494c\uff55)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\uff55\u97b7\u6fb0\u8308\u183a\u183a \u7873\u12b2\u8bb0\ud7e8\u5245\u8389(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\uc910\u8d98\u8aa5\u3d4b\u6435\u5140 p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p1, double p2, double p3, double p4, double p5, double p6, double p7) {
        var_17_67 : Random
        
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
            var_17_67 = getfield:Random(\u16f6\u61a4\u5db4\u4c04\u64ab\u9255::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255)
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(initobject:\u8bb0\u6d69\ud36e\ub7dc\u624e\u446c(\u8bb0\u6d69\ud36e\ub7dc\u624e\u446c::<init>, p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p2:double, p3:double, p4:double, mul:double(mul:double(mul:double(f2d:double(invokevirtual:float(Random::nextFloat, var_17_67:Random)), ldc:double(-1.9)), f2d:double(invokevirtual:float(Random::nextFloat, var_17_67:Random))), ldc:double(0.1)), mul:double(mul:double(mul:double(mul:double(f2d:double(invokevirtual:float(Random::nextFloat, var_17_67:Random)), ldc:double(-0.5)), f2d:double(invokevirtual:float(Random::nextFloat, var_17_67:Random))), ldc:double(0.1)), ldc:double(5.0)), mul:double(mul:double(mul:double(f2d:double(invokevirtual:float(Random::nextFloat, var_17_67:Random)), ldc:double(-1.9)), f2d:double(invokevirtual:float(Random::nextFloat, var_17_67:Random))), ldc:double(0.1)), ldc:float(1.0f), getfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\u3776\ud158\u51fa\u7ce1\u12b2\u071d::\u9033\u718f\u071d\u4e72\u3bd6\u5140, this:\u3776\ud158\u51fa\u7ce1\u12b2\u071d)))
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\uff55\u97b7\u6fb0\u8308\u183a\u183a \u7873\u12b2\u8bb0\ud7e8\u5245\u8389(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p1, double p2, double p3, double p4, double p5, double p6, double p7) {
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
            return:\uff55\u97b7\u6fb0\u8308\u183a\u183a(invokevirtual:\uff55\u97b7\u6fb0\u8308\u183a\u183a(\u3776\ud158\u51fa\u7ce1\u12b2\u071d::\u7873\u12b2\u8bb0\ud7e8\u5245\u8389, this:\u3776\ud158\u51fa\u7ce1\u12b2\u071d, checkcast:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\uc910\u8d98\u8aa5\u3d4b\u6435\u5140.class, p0:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a[expected:\uc910\u8d98\u8aa5\u3d4b\u6435\u5140]), p1:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p2:double, p3:double, p4:double, p5:double, p6:double, p7:double))
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
    
    public void \u8bb0\u3bd6\u8c8a\u7bad\u51fa\ub102(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5AD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5B8 : int
        
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
        var_3_5AD = and:int(ldc:int(-1764829151), ldc:int(-1023481157))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3776\ud158\u51fa\u7ce1\u12b2\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_5AD = and:int(var_3_5AD:int, ldc:int(635428583))
        }
        else {
            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-1578144272))
            var_5_85 = and:int(ldc:int(-17280), ldc:int(17263))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5175), ldc:int(-13880)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5AD:int, ldc:int(-1124152454))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(10306), ldc:int(10307)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1569), ldc:int(1568)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5AD = and:int(var_3_DA:int, ldc:int(-1144096209))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(4134), ldc:int(4135)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-588748699))
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(551677442))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-1026864551))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-370451716))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(1459559550))
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-261009259))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-221525587))
                            var_11_EB = and:int(ldc:int(8553), ldc:int(-10602))
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(799085191))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(379574236))
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(805100960))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-53187449))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-2114989833))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(1185159717))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(1808723735))
                            loopcontinue()
                        }
                        
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-1511361927))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(335496167))
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-63952300))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-596911707))
                            loopcontinue()
                        }
                        
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-487925322))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(6353), ldc:int(1025))
                                goto(Label_0979)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(732819405))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(524836534))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(1715811417))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-2033298098))
                        var_11_EB = and:int(ldc:int(9586), ldc:int(-9587))
                    }
                    
                    Label_0979:
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(779950388))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-737455837))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(993651329))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-234590980))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(913707466))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-788870057))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1220)
                            }
                        }
                    }
                    
                    Label_1098:
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-793609331))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-2020039995))
                            goto(Label_0979)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(2014844064))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(1200424024))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-353680217))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1220:
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(929103293))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(814047330))
                        goto(Label_0979)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-1326347971))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-97673742))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-1187298333))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5AD = and:int(var_3_5AD:int, ldc:int(-2047978301))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1351:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5B8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0979)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(812147070))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(1342413636))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(1536215155))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5AD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5AD = and:int(var_3_5AD:int, ldc:int(-673559921))
                        var_17_5B8 = add:int(var_16_119:int, xor:int(ldc:int(2322), ldc:int(2323)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5AD = and:int(var_3_5AD:int, ldc:int(-958441051))
                
                if (cmple:boolean(var_5_85 = var_17_5B8:int, sub:int(var_6_8C:int, and:int(ldc:int(1345), ldc:int(4101))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5AD:int, ldc:int(4)), ldc:int(0))) {
            var_3_5AD = and:int(var_3_5AD:int, ldc:int(-1608874783))
            goto(Label_0106)
        }
    }
}
