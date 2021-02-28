public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e {
    private void \ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7043\u960f\u98a4\ubded\ub18d\ub83f p0) {
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
            putfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e, p0:\u7043\u960f\u98a4\ubded\ub18d\ub83f)
            invokespecial:Object(Object::<init>, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.awt.Shape createStrokedShape(java.awt.Shape p0) {
        var_2_64 : int
        var_4_6C : GeneralPath
        var_2_72 : int
        var_5_82 : FlatteningPathIterator
        var_2_88 : int
        var_6_8D : float[]
        var_2_93 : int
        var_7_95 : float
        var_8_98 : float
        var_2_9E : int
        var_9_A0 : float
        var_10_A3 : float
        var_2_A9 : int
        var_11_AB : float
        var_12_AE : float
        var_2_B4 : int
        var_13_BC : int
        var_2_C2 : int
        var_14_9D6 : float
        var_2_4F1 : int
        var_15_D2 : int
        var_2_728 : int
        var_16_72E : float
        var_2_734 : int
        var_17_73A : float
        var_18_751 : float
        var_19_82C : float
        var_2_876 : int
        var_20_882 : float
        var_2_888 : int
        var_21_894 : float
        
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
            var_2_64 = and:int(and:int(ldc:int(-2136190381), ldc:int(-1360855429)), ldc:int(1135468410))
            var_4_6C = initobject:GeneralPath(GeneralPath::<init>)
            var_2_72 = and:int(var_2_64:int, ldc:int(162780667))
            var_5_82 = initobject:FlatteningPathIterator(FlatteningPathIterator::<init>, invokeinterface:PathIterator(Shape::getPathIterator, p0:Shape, aconstnull:AffineTransform()), ldc:double(1.0))
            var_2_88 = and:int(var_2_72:int, ldc:int(-122661633))
            var_6_8D = newarray:float[](float.class, ldc:int(6))
            var_2_93 = and:int(var_2_88:int, ldc:int(1269456210))
            var_7_95 = ldc:float(0.0f)
            var_8_98 = ldc:float(0.0f)
            var_2_9E = and:int(var_2_93:int, ldc:int(-1847208361))
            var_9_A0 = ldc:float(0.0f)
            var_10_A3 = ldc:float(0.0f)
            var_2_A9 = and:int(var_2_9E:int, ldc:int(280482551))
            var_11_AB = ldc:float(0.0f)
            var_12_AE = ldc:float(0.0f)
            var_2_B4 = and:int(var_2_A9:int, ldc:int(2143213559))
            var_13_BC = and:int(ldc:int(-30832), ldc:int(16493))
            var_2_C2 = and:int(var_2_B4:int, ldc:int(-2115338250))
            var_14_9D6 = ldc:float(0.0f)
            var_2_4F1 = and:int(var_2_C2:int, ldc:int(1023401687))
            var_15_D2 = and:int(ldc:int(22224), ldc:int(-24305))
            
            loop {
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1008583313))
                    goto(Label_1695)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1152335256))
                    goto(Label_1435)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(726673476))
                    goto(Label_1144)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1403902979))
                    goto(Label_1027)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0896)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-923135516))
                    goto(Label_0767)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(967427070))
                    goto(Label_0615)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0466)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-802162293))
                }
                else {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-843653794))
                    
                    if (invokeinterface:boolean(PathIterator::isDone, var_5_82:FlatteningPathIterator[expected:PathIterator])) {
                        looporswitchbreak()
                    }
                }
                
                Label_0360:
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1863536278))
                    goto(Label_1695)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1144)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1027)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1174568200))
                    goto(Label_0896)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(300860581))
                    goto(Label_0767)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0615)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1179126797))
                }
                
                Label_0466:
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1360278425))
                    goto(Label_1695)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(54855997))
                    goto(Label_1561)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1471082970))
                    goto(Label_1285)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1144)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(899706763))
                    goto(Label_1027)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0896)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1751107114))
                    goto(Label_0767)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1669529238))
                        goto(Label_0360)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-2137422468))
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-878323725))
                    var_13_BC = invokeinterface:int(PathIterator::currentSegment, var_5_82:FlatteningPathIterator[expected:PathIterator], var_6_8D:float[])
                }
                
                Label_0615:
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1695)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_1144)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1027)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0896)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(674819464))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1544231261))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1810620023))
                    
                    switch (var_13_BC:int) {
                        case 0:
                            var_9_A0 = var_7_95 = loadelement(var_6_8D, and(ldc(-9860), ldc(9859)))
                            looporswitchbreak()
                        
                        case 4:
                            storeelement:float(var_6_8D:float[], and:int(ldc:int(-22156), ldc:int(21641)), var_7_95:float)
                            goto(Label_1285)
                        
                        case 1:
                            goto(Label_1435)
                        
                        default:
                            goto(Label_2958)
                    }
                }
                
                Label_0767:
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1695)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1144)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-2006223224))
                    goto(Label_1027)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1739775077))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(497678833))
                        goto(Label_0615)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(69903512))
                        goto(Label_0360)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1998229390))
                    var_10_A3 = var_8_98 = loadelement(var_6_8D, and(ldc(27), ldc(9317)))
                }
                
                Label_0896:
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1287652058))
                    goto(Label_1695)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-832023050))
                    goto(Label_1144)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1630462337))
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(476560269))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(62846200))
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-68986286))
                    invokevirtual:void(Float::moveTo, var_4_6C:GeneralPath[expected:Float], var_7_95:float, var_8_98:float)
                }
                
                Label_1027:
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1695)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1869307327))
                    goto(Label_1435)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-705319228))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1491624079))
                        goto(Label_0615)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0360)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1440938975))
                    var_14_9D6 = div:float(invokestatic:float(\u7043\u960f\u98a4\ubded\ub18d\ub83f::\u7873\u6435\ud12e\u3dd3\u7af6\u3a62, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)), ldc:float(2.0f))
                }
                
                Label_1144:
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1695)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_1561)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(543188779))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1285292209))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(696220621))
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0615)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-132946603))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1919856572))
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-168504361))
                    goto(Label_2958)
                }
                
                Label_1285:
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(649740868))
                    goto(Label_1695)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-954240379))
                    goto(Label_1561)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1742052252))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-49774400))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1915388869))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(389148468))
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0615)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1838262539))
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1072789243))
                    storeelement:float(var_6_8D:float[], and:int(ldc:int(16905), ldc:int(8259)), var_8_98:float)
                }
                
                Label_1435:
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1695)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1329732005))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1806858235))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-2005390439))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0615)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1536871406))
                        goto(Label_0466)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1839783126))
                    var_11_AB = loadelement:float(var_6_8D:float[], and:int(ldc:int(23633), ldc:int(-23646)))
                }
                
                Label_1561:
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1423669296))
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1745698219))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(47746270))
                        goto(Label_1144)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-214981993))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-99769767))
                        goto(Label_0896)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0767)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0615)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0466)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0360)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1743158363))
                    var_12_AE = loadelement:float(var_6_8D:float[], and:int(ldc:int(453), ldc:int(26161)))
                }
                
                Label_1695:
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-654437757))
                    goto(Label_1561)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-548553701))
                    goto(Label_1435)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_1285)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-2144987563))
                    goto(Label_1144)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1473920544))
                    goto(Label_1027)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0896)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-103450279))
                    goto(Label_0767)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0615)
                }
                
                if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(256)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1980196939))
                    goto(Label_0466)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0360)
                }
                
                if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-12715010))
                    loopcontinue()
                }
                
                var_2_728 = and:int(var_2_4F1:int, ldc:int(-218999462))
                var_16_72E = sub:float(var_11_AB:float, var_9_A0:float)
                var_2_734 = and:int(var_2_728:int, ldc:int(1606114042))
                var_17_73A = sub:float(var_12_AE:float, var_10_A3:float)
                var_2_4F1 = and:int(var_2_734:int, ldc:int(820369618))
                var_18_751 = d2f:float(invokestatic:double(Math::sqrt, f2d:double(add:float(mul:float(var_16_72E:float, var_16_72E:float), mul:float(var_17_73A:float, var_17_73A:float)))))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_2882)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(260651500))
                        goto(Label_2815)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2724)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1254700821))
                        goto(Label_2657)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(567224933))
                        goto(Label_2033)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(28113503))
                        
                        if (cmplt:boolean(var_18_751:float, var_14_9D6:float)) {
                            goto(Label_2650)
                        }
                    }
                    
                    Label_1954:
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_2882)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1821987260))
                        goto(Label_2815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_2724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(785758606))
                        goto(Label_2657)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1283369931))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-965174492))
                            loopcontinue()
                        }
                        
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1723420887))
                    }
                    
                    Label_2033:
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1407356818))
                        goto(Label_2882)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_2815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2724)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_2657)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1954)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-286665998))
                    var_19_82C = div:float(ldc:float(1.0f), var_18_751:float)
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_2140)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-806166701))
                            
                            if (cmplt:boolean(var_18_751:float, var_14_9D6:float)) {
                                looporswitchbreak()
                            }
                        }
                        
                        Label_2121:
                        
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1011646766))
                        }
                        
                        Label_2140:
                        
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_2121)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(953290529))
                        }
                        else {
                            var_2_876 = and:int(var_2_4F1:int, ldc:int(-1494427013))
                            var_20_882 = add:float(var_9_A0:float, mul:float(mul:float(var_14_9D6:float, var_16_72E:float), var_19_82C:float))
                            var_2_888 = and:int(var_2_876:int, ldc:int(-1296534437))
                            var_21_894 = add:float(var_10_A3:float, mul:float(mul:float(var_14_9D6:float, var_17_73A:float), var_19_82C:float))
                            
                            loop {
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_2579)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(2097152)), ldc:int(0))) {
                                    goto(Label_2520)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(386142897))
                                    goto(Label_2460)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(2045474977))
                                    goto(Label_2315)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-1493872270))
                                    
                                    if (cmpne:boolean(and:int(var_15_D2:int, and:int(ldc:int(16513), ldc:int(12303))), ldc:int(0))) {
                                        invokevirtual:void(Float::lineTo, var_4_6C:GeneralPath[expected:Float], sub:float(var_20_882:float, mul:float(mul:float(invokestatic:float(\u7043\u960f\u98a4\ubded\ub18d\ub83f::\u9033\u5fe1\ua068\u9a18\u927d\ub171, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)), var_17_73A:float), var_19_82C:float)), add:float(var_21_894:float, mul:float(mul:float(invokestatic:float(\u7043\u960f\u98a4\ubded\ub18d\ub83f::\u9033\u5fe1\ua068\u9a18\u927d\ub171, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)), var_16_72E:float), var_19_82C:float)))
                                        goto(Label_2460)
                                    }
                                }
                                
                                Label_2267:
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_2579)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_2520)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-2125389080))
                                    goto(Label_2460)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(128)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_2_888:int, ldc:int(1073741824)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_888 = and:int(var_2_888:int, ldc:int(195983743))
                                }
                                
                                Label_2315:
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(4194304)), ldc:int(0))) {
                                    goto(Label_2579)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(128)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-1237208865))
                                    goto(Label_2520)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(268435456)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_2_888:int, ldc:int(268435456)), ldc:int(0))) {
                                        var_2_888 = and:int(var_2_888:int, ldc:int(1392510188))
                                        goto(Label_2267)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_2_888 = and:int(var_2_888:int, ldc:int(-1579043496))
                                        loopcontinue()
                                    }
                                    
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-454730925))
                                    invokevirtual:void(Float::lineTo, var_4_6C:GeneralPath[expected:Float], add:float(var_20_882:float, mul:float(mul:float(invokestatic:float(\u7043\u960f\u98a4\ubded\ub18d\ub83f::\u9033\u5fe1\ua068\u9a18\u927d\ub171, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)), var_17_73A:float), var_19_82C:float)), sub:float(var_21_894:float, mul:float(mul:float(invokestatic:float(\u7043\u960f\u98a4\ubded\ub18d\ub83f::\u9033\u5fe1\ua068\u9a18\u927d\ub171, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)), var_16_72E:float), var_19_82C:float)))
                                }
                                
                                Label_2460:
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(256)), ldc:int(0))) {
                                    goto(Label_2579)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(2)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(2)), ldc:int(0))) {
                                        goto(Label_2315)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_888:int, ldc:int(1048576)), ldc:int(0))) {
                                        var_2_888 = and:int(var_2_888:int, ldc:int(-196591331))
                                        goto(Label_2267)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(16384)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-369495333))
                                    var_14_9D6 = add:float(var_14_9D6:float, invokestatic:float(\u7043\u960f\u98a4\ubded\ub18d\ub83f::\u7873\u6435\ud12e\u3dd3\u7af6\u3a62, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)))
                                }
                                
                                Label_2520:
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(64)), ldc:int(0))) {
                                    if (cmpne:boolean(and:int(var_2_888:int, ldc:int(134217728)), ldc:int(0))) {
                                        goto(Label_2460)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_888:int, ldc:int(1073741824)), ldc:int(0))) {
                                        goto(Label_2315)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(16384)), ldc:int(0))) {
                                        var_2_888 = and:int(var_2_888:int, ldc:int(919446721))
                                        goto(Label_2267)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(2147483647)), ldc:int(0))) {
                                        var_2_888 = and:int(var_2_888:int, ldc:int(1557367794))
                                        loopcontinue()
                                    }
                                    
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-352684930))
                                    inc:int(var_15_D2, ldc:int(1))
                                }
                                
                                Label_2579:
                                
                                if (cmpeq:boolean(and:int(var_2_888:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(-705928354))
                                    goto(Label_2520)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(511724144))
                                    goto(Label_2460)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(128)), ldc:int(0))) {
                                    var_2_888 = and:int(var_2_888:int, ldc:int(332460217))
                                    goto(Label_2315)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_2267)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_888:int, ldc:int(2)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                            }
                            
                            var_2_4F1 = and:int(var_2_888:int, ldc:int(-1817477933))
                        }
                    }
                    
                    Label_2650:
                    var_14_9D6 = sub:float(var_14_9D6:float, var_18_751:float)
                    Label_2657:
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_2882)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1323494894))
                        goto(Label_2815)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1542743885))
                            goto(Label_2033)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(384456822))
                        var_9_A0 = var_11_AB:float
                    }
                    
                    Label_2724:
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(794826003))
                        goto(Label_2882)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1280182489))
                            goto(Label_2657)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(16)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(507208948))
                            goto(Label_2033)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-751465105))
                            goto(Label_1954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1610505576))
                            loopcontinue()
                        }
                        
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-1851008813))
                        var_10_A3 = var_12_AE:float
                    }
                    
                    Label_2815:
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-266396956))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_2724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_2657)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_2033)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-189179818))
                        
                        if (cmpne:boolean(var_13_BC:int, and:int(ldc:int(11428), ldc:int(16396)))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_2882:
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_2815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(64)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-2101241902))
                        goto(Label_2724)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_2657)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_2033)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_4F1:int, ldc:int(128)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(262644438))
                        goto(Label_1954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_4F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-508307209))
                        invokevirtual:void(Path2D::closePath, var_4_6C:GeneralPath[expected:Path2D])
                        looporswitchbreak()
                    }
                    
                    var_2_4F1 = and:int(var_2_4F1:int, ldc:int(1410174287))
                }
                
                Label_2958:
                var_2_4F1 = and:int(var_2_4F1:int, ldc:int(-169846666))
                invokeinterface:void(PathIterator::next, var_5_82:FlatteningPathIterator[expected:PathIterator])
            }
            
            return:Shape(invokevirtual:Shape(BasicStroke::createStrokedShape, initobject:BasicStroke(BasicStroke::<init>, invokevirtual:float(\u071d\ube23\ud171\u624e\uae87\u385b::\u4daf\u92ee\u8389\u836c\u88c5\u7d52, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f[expected:\u071d\ube23\ud171\u624e\uae87\u385b](\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e)), and:int(ldc:int(8359), ldc:int(18450)), invokevirtual:int(\u071d\ube23\ud171\u624e\uae87\u385b::\ub1b9\u51b2\u1833\uae5d\u59ec\u8308, getfield:\u7043\u960f\u98a4\ubded\ub18d\ub83f[expected:\u071d\ube23\ud171\u624e\uae87\u385b](\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::\u5654\u983f\ua068\u92ee\u7af6\ucfaf, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e))), var_4_6C:GeneralPath[expected:Shape]))
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u7043\u960f\u98a4\ubded\ub18d\ub83f p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5f50\uc2bd\uc238\u8350\u4179\ube23 p1) {
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
            invokespecial:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e(\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e::<init>, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e, p0:\u7043\u960f\u98a4\ubded\ub18d\ub83f)
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
    
    public void \ub19c\u72f1\u61a4\u3d64\u9255\u8cae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(961098789), ldc:int(1809564581))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\u7049\u4d85\ua3b4\ub7dc\u624e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(1192331176))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1518637773))
            var_5_8A = and:int(ldc:int(-20986), ldc:int(20953))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15202), ldc:int(15201)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_696:int, ldc:int(-481741210))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(3073), ldc:int(17181)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(-16351), ldc:int(-16352)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_E3:int, ldc:int(-381037896))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8224), ldc:int(8225)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(968669999))
                        goto(Label_1568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(774979606))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1540514968))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-831829709))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2005660408))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0865)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1998512543))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-947854520))
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(823904800))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-747080077))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(816164882))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1768645099))
                        var_11_F4 = and:int(ldc:int(20916), ldc:int(-20926))
                        goto(Label_1557)
                    }
                    
                    Label_0589:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(434194297))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1144780694))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-41245280))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(937909891))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1044098277))
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1424890992))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-553079256))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1362344569))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(658488812))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0865)
                        }
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(278030406))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(836866183))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-586654030))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-77631236))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0865:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2053846187))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(753981323))
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-22583790))
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-687953128))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1577107080))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(18472), ldc:int(18473))
                                goto(Label_1151)
                            }
                        }
                    }
                    
                    Label_0985:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2033681635))
                        goto(Label_1568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(13795596))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1473737717))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1031848216))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(731226814))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-5562464))
                        var_11_F4 = and:int(ldc:int(-30017), ldc:int(29760))
                    }
                    
                    Label_1151:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1324727283))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0985)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1837819321))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-151378196))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(137356374))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1323363552))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1415)
                            }
                        }
                    }
                    
                    Label_1274:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2084241030))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1569656714))
                            goto(Label_1151)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0985)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1511557621))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-307588147))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(17899179))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2103389495))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1557)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1415:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1628114539))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1385184699))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1677679150))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-737541588))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1904944451))
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(632897979))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1557:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1568:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1784718110))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-618051249))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1656132449))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(505577893))
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1944271408))
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1078394826))
                        var_17_6A1 = add:int(var_16_122:int, and:int(ldc:int(12433), ldc:int(2637)))
                        looporswitchbreak()
                    }
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(-1453489622))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, xor:int(ldc:int(16419), ldc:int(16418))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-492370211))
            goto(Label_0108)
        }
    }
}
