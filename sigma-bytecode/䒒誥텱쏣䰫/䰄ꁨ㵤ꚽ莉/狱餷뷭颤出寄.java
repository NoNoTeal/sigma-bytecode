public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u72f1\u9937\ubded\u98a4\u51fa\u5bc4 {
    public void \u72f1\u9937\ubded\u98a4\u51fa\u5bc4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[] p0) {
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
            putfield:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[](\u72f1\u9937\ubded\u98a4\u51fa\u5bc4::\ud12e\u7e3f\u5bc4\uc246\ufe34\u74b1, this:\u72f1\u9937\ubded\u98a4\u51fa\u5bc4, p0:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[])
            invokespecial:Object(Object::<init>, this:\u72f1\u9937\ubded\u98a4\u51fa\u5bc4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<T> keys(com.mojang.serialization.DynamicOps<T> p0) {
        var_2_5F : int
        stack_BA_0 : Stream<T> [generated]
        
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
            var_2_5F = and:int(ldc:int(578522430), ldc:int(-1460158613))
            
            if (logicalnot:boolean(invokeinterface:boolean(DynamicOps::compressMaps, p0:DynamicOps<T>))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1211646577))
                stack_BA_0 = invokeinterface:Stream<T>(Stream<Object>::map, invokeinterface:Stream<Object>(Stream<\u8cae\u392e\u5fe1\u5140\u3dd3\u7006>::map, invokestatic:Stream<\u8cae\u392e\u5fe1\u5140\u3dd3\u7006>(Arrays::stream, getfield:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[](\u72f1\u9937\ubded\u98a4\u51fa\u5bc4::\ud12e\u7e3f\u5bc4\uc246\ufe34\u74b1, this:\u72f1\u9937\ubded\u98a4\u51fa\u5bc4)), invokedynamic:Function<? super \u8cae\u392e\u5fe1\u5140\u3dd3\u7006, String>(apply:()Ljava/util/function/Function;)), invokedynamic:Function<String, Object>(apply:(Lcom/mojang/serialization/DynamicOps;)Ljava/util/function/Function;, p0:DynamicOps<T>))
            }
            else {
                stack_BA_0 = invokeinterface:Stream<T>(IntStream::mapToObj, invokestatic:IntStream(IntStream::range, and:int(ldc:int(-11194), ldc:int(10553)), arraylength:int(getfield:\u8cae\u392e\u5fe1\u5140\u3dd3\u7006[](\u72f1\u9937\ubded\u98a4\u51fa\u5bc4::\ud12e\u7e3f\u5bc4\uc246\ufe34\u74b1, this:\u72f1\u9937\ubded\u98a4\u51fa\u5bc4))), invokedynamic:IntFunction<Object>(apply:(Lcom/mojang/serialization/DynamicOps;)Ljava/util/function/IntFunction;, p0:DynamicOps<T>))
            }
            
            return:Stream<T>(stack_BA_0:Stream<T>)
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
    
    public void \u8aa5\u0b8e\ube23\ub18d\u6b5f\ub6ab(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FE : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_609 : int
        
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
        var_3_5FE = and:int(ldc:int(-1805682154), ldc:int(-1895850206))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u72f1\u9937\ubded\u98a4\u51fa\u5bc4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(111678709))
        }
        else {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-826471862))
            var_5_85 = and:int(ldc:int(1258), ldc:int(-9467))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21994), ldc:int(17641)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FE:int, ldc:int(-1998832924))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(16515), ldc:int(16514)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(517), ldc:int(4113)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FE = and:int(var_3_D2:int, ldc:int(-505976187))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(525), ldc:int(524)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-337971477))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1171894208))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-55050747))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-178404463))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1617577567))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1016284198))
                    }
                    else {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2114572322))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(869772159))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1012933810))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-816633889))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-948867230))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-26968745))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-700171757))
                            var_11_E3 = and:int(ldc:int(29584), ldc:int(-30612))
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1701370423))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-35422031))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1651699743))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(55747225))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-732729956))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-653767707))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(2075499093))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(166265216))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1377738473))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1729570045))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1779669763))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1865540617))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-88069079))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(2136170046))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(769022027))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-441456066))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1384665808))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1151029317))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(18952), ldc:int(18953))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(365530162))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1355734364))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(130732672))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-590497026))
                        var_11_E3 = and:int(ldc:int(855), ldc:int(-856))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2055168143))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(838073445))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(692453709))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-755438302))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1136905320))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1181390250))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(313560915))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1754087284))
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1140568197))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1692979271))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1080581050))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1163064569))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-773861576))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(-897610833))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1419:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_609 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1430:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1303619644))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-376107804))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(989530797))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-290116701))
                        var_17_609 = add:int(var_16_111:int, and:int(ldc:int(12293), ldc:int(1609)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(241859020))
                }
                
                var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1609737437))
                
                if (cmple:boolean(var_5_85 = var_17_609:int, sub:int(var_6_8C:int, and:int(ldc:int(1767), ldc:int(12313))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
