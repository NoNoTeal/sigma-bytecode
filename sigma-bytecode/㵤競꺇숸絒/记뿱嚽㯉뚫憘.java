public class \u3d64\u7af6\uae87\uc238\u7d52.\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198 {
    private void \u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18 p0) {
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
            putfield:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u69d9\uc4d2\u67e9\ub18d\u76bc\ub8be, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198, p0:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18)
            invokespecial:Object(Object::<init>, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.awt.Shape createStrokedShape(java.awt.Shape p0) {
        var_2_64 : int
        var_4_6C : GeneralPath
        var_2_AE : int
        var_5_BE : FlatteningPathIterator
        var_2_C4 : int
        var_6_C9 : float[]
        var_2_CF : int
        var_7_D1 : float
        var_8_D4 : float
        var_2_DA : int
        var_9_DC : float
        var_10_DF : float
        var_2_E5 : int
        var_11_E7 : float
        var_12_EA : float
        var_2_F0 : int
        var_13_F8 : int
        var_2_559 : int
        var_14_94D : float
        var_2_7B0 : int
        var_15_7B6 : float
        var_2_7BC : int
        var_16_7C2 : float
        var_2_8C5 : int
        var_17_7D9 : float
        var_18_872 : float
        var_2_87F : int
        var_2_8DC : int
        var_19_8E8 : float
        var_2_92B : int
        var_20_8FA : float
        
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
            var_2_64 = and:int(and:int(ldc:int(-1851194950), ldc:int(-542961186)), ldc:int(-570998853))
            var_4_6C = initobject:GeneralPath(GeneralPath::<init>)
            
            do {
                if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(2)), ldc:int(0))) {
                    var_2_64 = and:int(var_2_64:int, ldc:int(50818956))
                }
                else {
                    var_2_64 = and:int(var_2_64:int, ldc:int(-1875283661))
                    p0 = invokevirtual:Shape(BasicStroke::createStrokedShape, initobject:BasicStroke(BasicStroke::<init>, invokevirtual:float(\u071d\ube23\ud171\u624e\uae87\u385b::\u4daf\u92ee\u8389\u836c\u88c5\u7d52, getfield:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18[expected:\u071d\ube23\ud171\u624e\uae87\u385b](\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u69d9\uc4d2\u67e9\ub18d\u76bc\ub8be, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198)), and:int(ldc:int(28675), ldc:int(2)), invokevirtual:int(\u071d\ube23\ud171\u624e\uae87\u385b::\ub1b9\u51b2\u1833\uae5d\u59ec\u8308, getfield:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18[expected:\u071d\ube23\ud171\u624e\uae87\u385b](\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u69d9\uc4d2\u67e9\ub18d\u76bc\ub8be, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198))), p0:Shape)
                }
            } while (cmpne:boolean(and:int(var_2_64:int, ldc:int(4)), ldc:int(0)))
            
            var_2_AE = and:int(var_2_64:int, ldc:int(-1289507337))
            var_5_BE = initobject:FlatteningPathIterator(FlatteningPathIterator::<init>, invokeinterface:PathIterator(Shape::getPathIterator, p0:Shape, aconstnull:AffineTransform()), ldc:double(1.0))
            var_2_C4 = and:int(var_2_AE:int, ldc:int(-151050381))
            var_6_C9 = newarray:float[](float.class, ldc:int(6))
            var_2_CF = and:int(var_2_C4:int, ldc:int(-1117278438))
            var_7_D1 = ldc:float(0.0f)
            var_8_D4 = ldc:float(0.0f)
            var_2_DA = and:int(var_2_CF:int, ldc:int(-222748718))
            var_9_DC = ldc:float(0.0f)
            var_10_DF = ldc:float(0.0f)
            var_2_E5 = and:int(var_2_DA:int, ldc:int(-1250569761))
            var_11_E7 = ldc:float(0.0f)
            var_12_EA = ldc:float(0.0f)
            var_2_F0 = and:int(var_2_E5:int, ldc:int(-190080681))
            var_13_F8 = and:int(ldc:int(-13471), ldc:int(13470))
            var_2_559 = and:int(var_2_F0:int, ldc:int(-1213882917))
            var_14_94D = ldc:float(0.0f)
            
            loop {
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(573836512))
                    goto(Label_1685)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(653679259))
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1899661136))
                    goto(Label_1389)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1272)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(2145968205))
                    goto(Label_1131)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-157974952))
                    goto(Label_0984)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0835)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0653)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(177833382))
                    goto(Label_0528)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-642675269))
                    
                    if (invokeinterface:boolean(PathIterator::isDone, var_5_BE:FlatteningPathIterator)) {
                        looporswitchbreak()
                    }
                }
                
                Label_0398:
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-960330386))
                    goto(Label_1685)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1986371318))
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-80445963))
                    goto(Label_1389)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1272)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(281857530))
                    goto(Label_1131)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0984)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0835)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(95605194))
                    goto(Label_0653)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(997367088))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-760388130))
                }
                
                Label_0528:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1340467381))
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1907654887))
                    goto(Label_1389)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1272)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1131)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0984)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(569300160))
                    goto(Label_0835)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-575415242))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-735243781))
                    var_13_F8 = invokeinterface:int(PathIterator::currentSegment, var_5_BE:FlatteningPathIterator[expected:PathIterator], var_6_C9:float[])
                }
                
                Label_0653:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(2045230971))
                    goto(Label_1389)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_1272)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1131)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(824072274))
                    goto(Label_0984)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-3967653))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1960539524))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(256)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-644314910))
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1187549761))
                    
                    switch (var_13_F8:int) {
                        case 0:
                            var_9_DC = var_7_D1 = invokespecial(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u74b1\ucfaf\u8640\uf995\ub171\u9033, this, loadelement(var_6_C9, and(ldc(-22141), ldc(1644))))
                            looporswitchbreak()
                        
                        case 4:
                            storeelement:float(var_6_C9:float[], and:int(ldc:int(-28294), ldc:int(26244)), var_7_D1:float)
                            goto(Label_1389)
                        
                        case 1:
                            goto(Label_1531)
                        
                        default:
                            goto(Label_2536)
                    }
                }
                
                Label_0835:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(1359968798))
                    goto(Label_1389)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_1272)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-644355755))
                    goto(Label_1131)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-137865931))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-44305665))
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(1089442164))
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1114257932))
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-592354029))
                    var_10_DF = var_8_D4 = invokespecial(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u74b1\ucfaf\u8640\uf995\ub171\u9033, this, loadelement(var_6_C9, xor(ldc(1065), ldc(1064))))
                }
                
                Label_0984:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(341923432))
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(1513959582))
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1389)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(256)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(1396263755))
                    goto(Label_1272)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-601794655))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1137891311))
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(1264620944))
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-516523031))
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-134791726))
                    invokevirtual:void(Float::moveTo, var_4_6C:GeneralPath[expected:Float], var_7_D1:float, var_8_D4:float)
                }
                
                Label_1131:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(1210495679))
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1297474068))
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(1632560474))
                    goto(Label_1389)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(970430010))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-2082232423))
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(4)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1562720307))
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(342867946))
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1074985478))
                    var_14_94D = ldc:float(0.0f)
                }
                
                Label_1272:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1831)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(950464875))
                    goto(Label_1531)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(147071062))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1204166310))
                        goto(Label_2536)
                    }
                    
                    loopcontinue()
                }
                
                Label_1389:
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1520476429))
                    goto(Label_1831)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(84910079))
                    goto(Label_1685)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(1443933222))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-930787269))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(1166293032))
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1598051643))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-56534094))
                    storeelement:float(var_6_C9:float[], and:int(ldc:int(131), ldc:int(9221)), var_8_D4:float)
                }
                
                Label_1531:
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1181634310))
                    goto(Label_1831)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(934709044))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1054310071))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1008494655))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(421391183))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(788018340))
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(4)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1675960229))
                        goto(Label_0528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-80926277))
                    var_11_E7 = invokespecial:float(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u74b1\ucfaf\u8640\uf995\ub171\u9033, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198, loadelement:float(var_6_C9:float[], and:int(ldc:int(-29068), ldc:int(29065))))
                }
                
                Label_1685:
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(1024)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(422769690))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1024)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(1908026287))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(4)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-498114730))
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(503091769))
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(647848486))
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_559 = and:int(var_2_559:int, ldc:int(-1483006076))
                        goto(Label_0528)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_559:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_559 = and:int(var_2_559:int, ldc:int(-563359241))
                    var_12_EA = invokespecial:float(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u74b1\ucfaf\u8640\uf995\ub171\u9033, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198, loadelement:float(var_6_C9:float[], xor:int(ldc:int(10252), ldc:int(10253))))
                }
                
                Label_1831:
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1685)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(16)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1194760003))
                    goto(Label_1531)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(1024)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-591338136))
                    goto(Label_1389)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1216665038))
                    goto(Label_1272)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(8192)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-1109752208))
                    goto(Label_1131)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(415672173))
                    goto(Label_0984)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0835)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-823170871))
                    goto(Label_0653)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0528)
                }
                
                if (cmpeq:boolean(and:int(var_2_559:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_559 = and:int(var_2_559:int, ldc:int(-121613586))
                    goto(Label_0398)
                }
                
                if (cmpne:boolean(and:int(var_2_559:int, ldc:int(32768)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_7B0 = and:int(var_2_559:int, ldc:int(-68713190))
                var_15_7B6 = sub:float(var_11_E7:float, var_9_DC:float)
                var_2_7BC = and:int(var_2_7B0:int, ldc:int(-616980481))
                var_16_7C2 = sub:float(var_12_EA:float, var_10_DF:float)
                var_2_8C5 = and:int(var_2_7BC:int, ldc:int(-59047650))
                var_17_7D9 = d2f:float(invokestatic:double(Math::sqrt, f2d:double(add:float(mul:float(var_15_7B6:float, var_15_7B6:float), mul:float(var_16_7C2:float, var_16_7C2:float)))))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_2489)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_2433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(2)), ldc:int(0))) {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-596735463))
                        goto(Label_2101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(16)), ldc:int(0))) {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(1405624142))
                    }
                    else {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-1132769354))
                        
                        if (cmplt:boolean(var_17_7D9:float, var_14_94D:float)) {
                            goto(Label_2426)
                        }
                    }
                    
                    Label_2068:
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_2489)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_2433)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-181150889))
                    }
                    
                    Label_2101:
                    
                    if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(2)), ldc:int(0))) {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-1461437421))
                        goto(Label_2489)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_2433)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(1864473784))
                        goto(Label_2068)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(467185323))
                        loopcontinue()
                    }
                    
                    var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-626024102))
                    var_18_872 = div:float(ldc:float(1.0f), var_17_7D9:float)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(2048)), ldc:int(0))) {
                            var_2_87F = and:int(var_2_8C5:int, ldc:int(-1628572291))
                            goto(Label_2234)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-115246246))
                            
                            if (cmplt:boolean(var_17_7D9:float, var_14_94D:float)) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_2199:
                        
                        if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(16)), ldc:int(0))) {
                            var_2_87F = and:int(var_2_8C5:int, ldc:int(-966764551))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(256)), ldc:int(0))) {
                                var_2_8C5 = and:int(var_2_8C5:int, ldc:int(694157309))
                                loopcontinue()
                            }
                            
                            var_2_87F = and:int(var_2_8C5:int, ldc:int(-185628233))
                        }
                        
                        Label_2234:
                        
                        if (cmpeq:boolean(and:int(var_2_87F:int, ldc:int(16)), ldc:int(0))) {
                            var_2_8C5 = and:int(var_2_87F:int, ldc:int(398378956))
                            goto(Label_2199)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_87F:int, ldc:int(4)), ldc:int(0))) {
                            var_2_8C5 = and:int(var_2_87F:int, ldc:int(735704574))
                        }
                        else {
                            var_2_8DC = and:int(var_2_87F:int, ldc:int(-718681794))
                            var_19_8E8 = add:float(var_9_DC:float, mul:float(mul:float(var_14_94D:float, var_15_7B6:float), var_18_872:float))
                            var_2_92B = and:int(var_2_8DC:int, ldc:int(-1221110381))
                            var_20_8FA = add:float(var_10_DF:float, mul:float(mul:float(var_14_94D:float, var_16_7C2:float), var_18_872:float))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_2_92B:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_2383)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_92B:int, ldc:int(65536)), ldc:int(0))) {
                                    var_2_92B = and:int(var_2_92B:int, ldc:int(-1850801253))
                                    invokevirtual:void(Float::lineTo, var_4_6C:GeneralPath[expected:Float], invokespecial:float(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u74b1\ucfaf\u8640\uf995\ub171\u9033, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198, var_19_8E8:float), invokespecial:float(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u74b1\ucfaf\u8640\uf995\ub171\u9033, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198, var_20_8FA:float))
                                }
                                
                                Label_2336:
                                
                                if (cmpne:boolean(and:int(var_2_92B:int, ldc:int(2048)), ldc:int(0))) {
                                    var_2_92B = and:int(var_2_92B:int, ldc:int(1174817334))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_92B:int, ldc:int(65536)), ldc:int(0))) {
                                        var_2_92B = and:int(var_2_92B:int, ldc:int(642643739))
                                        loopcontinue()
                                    }
                                    
                                    var_2_92B = and:int(var_2_92B:int, ldc:int(-789600962))
                                    var_14_94D = add:float(var_14_94D:float, invokestatic:float(\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18::\ub19c\ufcaf\ud4fe\u97b7\u7049\ubcb0, getfield:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u69d9\uc4d2\u67e9\ub18d\u76bc\ub8be, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198)))
                                }
                                
                                Label_2383:
                                
                                if (cmpne:boolean(and:int(var_2_92B:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_92B = and:int(var_2_92B:int, ldc:int(-1067276952))
                                    goto(Label_2336)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_92B:int, ldc:int(1)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_2_92B = and:int(var_2_92B:int, ldc:int(-1476581919))
                            }
                            
                            var_2_8C5 = and:int(var_2_92B:int, ldc:int(-1775796965))
                        }
                    }
                    
                    Label_2426:
                    var_14_94D = sub:float(var_14_94D:float, var_17_7D9:float)
                    Label_2433:
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-89698805))
                            goto(Label_2101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(256)), ldc:int(0))) {
                            var_2_8C5 = and:int(var_2_8C5:int, ldc:int(1756653163))
                            goto(Label_2068)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-151317546))
                        var_9_DC = var_11_E7:float
                    }
                    
                    Label_2489:
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_8C5 = and:int(var_2_8C5:int, ldc:int(-1079335983))
                        goto(Label_2433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2101)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8C5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_2068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8C5:int, ldc:int(1)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_559 = and:int(var_2_8C5:int, ldc:int(-159812833))
                var_10_DF = var_12_EA:float
                Label_2536:
                var_2_559 = and:int(var_2_559:int, ldc:int(-1092498661))
                invokeinterface:void(PathIterator::next, var_5_BE:FlatteningPathIterator)
            }
            
            return:Shape(var_4_6C:GeneralPath[expected:Shape])
        }
        
        goto(Label_0006)
    }
    
    private float \u74b1\ucfaf\u8640\uf995\ub171\u9033(float p0) {
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
            return:float(sub:float(add:float(p0:float, mul:float(mul:float(d2f:float(invokestatic:double(Math::random)), invokestatic:float(\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18::\u5fe1\u983f\ufcaf\ubefe\u67e9\u0800, getfield:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::\u69d9\uc4d2\u67e9\ub18d\u76bc\ub8be, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198))), ldc:float(2.0f))), ldc:float(1.0f)))
        }
        
        goto(Label_0006)
    }
    
    public void \u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u516c\uae5d\uc9f6\u67d0\u72f1\u72f1 p1) {
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
            invokespecial:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198(\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198::<init>, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198, p0:\ufcaf\u3504\u74b1\u47c2\u67d0\u9a18)
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
    
    public void \u527a\u4ab3\u97b7\ud4fe\u72f1\uae87(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_688 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_693 : int
        
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
        var_3_688 = and:int(ldc:int(-1090297833), ldc:int(-4842761))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\ubff1\u56bd\u3bc9\ub6ab\u6198[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(-1797181618))
        }
        else {
            var_3_688 = and:int(var_3_688:int, ldc:int(-575646665))
            var_5_89 = and:int(ldc:int(4465), ldc:int(-4470))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13676), ldc:int(12585)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_688:int, ldc:int(-684348425))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(3586), ldc:int(3587)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(4110), ldc:int(4111)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_688 = and:int(var_3_E2:int, ldc:int(-1073762689))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(4105), ldc:int(25105)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1472094067))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(777417864))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1985078807))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1131507921))
                        goto(Label_0875)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(830778309))
                        goto(Label_0736)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0598)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1498753685))
                    }
                    else {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1084839177))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0598)
                            }
                            
                            goto(Label_0875)
                        }
                    }
                    
                    Label_0435:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-404694898))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1904129386))
                        goto(Label_1403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2053854915))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0875)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1930093490))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1645318793))
                            var_11_F3 = and:int(ldc:int(22162), ldc:int(-22167))
                            goto(Label_1533)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0598:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-434771575))
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(216417787))
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-2135360423))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1042746637))
                        goto(Label_0875)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1893096023))
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1471061539))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1626407169))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0875)
                        }
                    }
                    
                    Label_0736:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1367539689))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-707106883))
                        goto(Label_1403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-2084009577))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1833792434))
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1722671343))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-546985377))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0875:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(279645713))
                        goto(Label_1403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-171531060))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(424844574))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(2016202381))
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1752110689))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:boolean(0), ldc:boolean(1))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0994:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(594293473))
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(89040869))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0875)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(636500762))
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1868232650))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1264022039))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1209295169))
                        var_11_F3 = and:int(ldc:int(25256), ldc:int(-29355))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-875481466))
                        goto(Label_1403)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2056191141))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-971878072))
                            goto(Label_0994)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(238069659))
                            goto(Label_0875)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1010837143))
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-2108704852))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-149183913))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1403)
                            }
                        }
                    }
                    
                    Label_1291:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1544)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0994)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1740711277))
                            goto(Label_0875)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(390172899))
                            goto(Label_0736)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0598)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1224727329))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1533)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1403:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1999327747))
                        goto(Label_1544)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1956940278))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-604738756))
                        goto(Label_0875)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1973096311))
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_688 = and:int(var_3_688:int, ldc:int(-175188193))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1533:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_693 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1544:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1403)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1387660431))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-717708506))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1902005505))
                        goto(Label_0875)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2143114722))
                        goto(Label_0736)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2067045311))
                        goto(Label_0598)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(967645589))
                        goto(Label_0435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1076783393))
                        var_17_693 = add:int(var_16_121:int, and:int(ldc:int(2851), ldc:int(12369)))
                        looporswitchbreak()
                    }
                }
                
                var_3_688 = and:int(var_3_688:int, ldc:int(-1785837441))
                
                if (cmple:boolean(var_5_89 = var_17_693:int, sub:int(var_6_90:int, and:int(ldc:int(21601), ldc:int(8339))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(1849674116))
            goto(Label_0108)
        }
    }
}
