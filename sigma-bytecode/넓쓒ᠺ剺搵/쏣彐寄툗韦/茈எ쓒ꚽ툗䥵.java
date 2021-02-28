public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u8308\u0b8e\uc4d2\ua6bd\ud217\u4975 {
    public void \u8308\u0b8e\uc4d2\ua6bd\ud217\u4975() {
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
            invokespecial:Object(Object::<init>, this:\u8308\u0b8e\uc4d2\ua6bd\ud217\u4975)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d \ufcaf\uc87f\u9033\u76bc\u8d98\ufcaf(net.minecraft.util.text.ITextProperties p0, boolean p1) {
        var_2_5F : int
        var_4_6E : \u7bad\ud217\uc7fe\u64ab\u120d\u8c8a
        var_5_93 : Bidi
        var_6_A4 : ArrayList
        var_7_AB : int
        var_8_B4 : int
        var_9_D8 : BidiRun
        
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
            var_2_5F = and:int(ldc:int(-1272606692), ldc:int(627358255))
            var_4_6E = invokestatic:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u760c\uae5d\ud7e8\u4c2b\u7873\u40a9, p0:ITextProperties, invokedynamic:Int2IntFunction(get:()Lit/unimi/dsi/fastutil/ints/Int2IntFunction;), invokedynamic:UnaryOperator<String>(apply:()Ljava/util/function/UnaryOperator;))
            var_5_93 = initobject:Bidi(Bidi::<init>, invokevirtual:String(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u873d\uc246\u9a18\u72f1\u61a4\ubf56, var_4_6E:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a), ternaryop:int(p1:boolean, ldc:int(127), ldc:int(126)))
            invokevirtual:void(Bidi::setReorderingMode, var_5_93:Bidi, and:int(ldc:int(-3060), ldc:int(2851)))
            var_6_A4 = invokestatic:ArrayList(Lists::newArrayList)
            var_7_AB = invokevirtual:int(Bidi::countRuns, var_5_93:Bidi)
            var_8_B4 = and:int(ldc:int(-3724), ldc:int(3723))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(625974841))
                
                if (cmpge:boolean(var_8_B4:int, var_7_AB:int)) {
                    looporswitchbreak()
                }
                
                var_9_D8 = invokevirtual:BidiRun(Bidi::getVisualRun, var_5_93:Bidi, var_8_B4:int)
                invokeinterface:boolean(List<Object>::addAll, var_6_A4:ArrayList<Object>[expected:List<Object>], invokevirtual:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a::\u7330\uff55\u527a\ub171\u93a2\u5654, var_4_6E:\u7bad\ud217\uc7fe\u64ab\u120d\u8c8a, invokevirtual:int(BidiRun::getStart, var_9_D8:BidiRun), invokevirtual:int(BidiRun::getLength, var_9_D8:BidiRun), invokevirtual:boolean(BidiRun::isOddRun, var_9_D8:BidiRun)))
                inc:int(var_8_B4, ldc:int(1))
            }
            
            return:\u718f\u8413\u1833\u72f1\u5fe1\u927d(invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u0c95\ua6bd\uf995\u6ec6\uf995\u4bc8, var_6_A4:ArrayList<\u718f\u8413\u1833\u72f1\u5fe1\u927d>))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \u3c25\u16f6\uc910\u647c\ub171\ub70c(java.lang.String p0) {
        var_1_5F : int
        stack_77_0 : String [generated]
        
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
        var_1_5F = and:int(ldc:int(1835777908), ldc:int(-1782581251))
        
        try {
            var_1_5F = and:int(var_1_5F:int, ldc:int(-709116945))
            stack_77_0 = invokevirtual:String(ArabicShaping::shape, initobject:ArabicShaping(ArabicShaping::<init>, ldc:int(8)), p0:String)
            var_1_5F = and:int(var_1_5F:int, ldc:int(-1489306634))
            return:String(stack_77_0:String)
        }
        catch (java.lang.Exception var_3_7C) {
            return:String(p0:String)
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
    
    public void \u52d3\u446c\uc2e8\ubf56\u5245\u3776(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D2 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5DD : int
        
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
        var_3_5D2 = and:int(ldc:int(775484777), ldc:int(1069217020))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8308\u0b8e\uc4d2\ua6bd\ud217\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1163760166))
        }
        else {
            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1413550367))
            var_5_85 = and:int(ldc:int(19883), ldc:int(-19904))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21331), ldc:int(21074)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D2:int, ldc:int(733557880))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(26757), ldc:int(4099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2411), ldc:int(9345)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D2 = and:int(var_3_D2:int, ldc:int(1794766830))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-30696), ldc:int(-30695)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1968638907))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-675555748))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1413683216))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0748)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1658039469))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1151858644))
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-479664484))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1587472216))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1006074739))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-703787529))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-339827083))
                            var_11_E3 = and:int(ldc:int(11824), ldc:int(-11954))
                            goto(Label_1366)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-30823712))
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1129125596))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1213063337))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(989345767))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0748)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1615833725))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(252954305))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1363286156))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0748:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1756863245))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1047520977))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-676479895))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(713795551))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(334875956))
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1056603629))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(12), ldc:int(13))
                                goto(Label_1020)
                            }
                        }
                    }
                    
                    Label_0876:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(430809508))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1881204465))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-669718707))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1153522328))
                        var_11_E3 = and:int(ldc:int(21660), ldc:int(-30173))
                    }
                    
                    Label_1020:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(318594415))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1077876251))
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1625035756))
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1166311691))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1256)
                            }
                        }
                    }
                    
                    Label_1127:
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1020)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(2013085907))
                            goto(Label_0876)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1742126651))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-412383067))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(446462272))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-361056643))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1366)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1256:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-2092498810))
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(6505595))
                        goto(Label_0748)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5D2 = and:int(var_3_5D2:int, ldc:int(721124580))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1366:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5DD = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1377:
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-740485252))
                        goto(Label_1256)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(222966408))
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0876)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(1566994801))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(576692616))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D2 = and:int(var_3_5D2:int, ldc:int(985542387))
                        var_17_5DD = add:int(var_16_111:int, xor:int(ldc:int(10280), ldc:int(10281)))
                        looporswitchbreak()
                    }
                    
                    var_3_5D2 = and:int(var_3_5D2:int, ldc:int(288970947))
                }
                
                var_3_5D2 = and:int(var_3_5D2:int, ldc:int(-1145344780))
                
                if (cmple:boolean(var_5_85 = var_17_5DD:int, sub:int(var_6_8C:int, and:int(ldc:int(165), ldc:int(12361))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5D2:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
