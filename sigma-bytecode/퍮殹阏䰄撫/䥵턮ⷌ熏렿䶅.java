public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u4975\ud12e\u2dcc\u718f\ub83f\u4d85 {
    public void \u4975\ud12e\u2dcc\u718f\ub83f\u4d85() {
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
            invokespecial:Object(Object::<init>, this:\u4975\ud12e\u2dcc\u718f\ub83f\u4d85)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\u4975\ud12e\u2dcc\u718f\ub83f\u4d85 lambda$\u8df4\u5db4\u4975\ua068\u56bd\u62da$0() {
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
            return:\u4975\ud12e\u2dcc\u718f\ub83f\u4d85(getstatic:\u4975\ud12e\u2dcc\u718f\ub83f\u4d85(\u4975\ud12e\u2dcc\u718f\ub83f\u4d85::\u4179\u8308\u3776\u74b1\u6d69\ucb79))
        }
        
        goto(Label_0006)
    }
    
    static {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \u1187\u12b2\u4bc8\u9255\u92ee\ud158(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5C5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5D0 : int
        
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
        var_3_5C5 = and:int(ldc:int(1995941730), ldc:int(-141656287))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\ud12e\u2dcc\u718f\ub83f\u4d85[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1871060991))
            var_5_7D = and:int(ldc:int(-3759), ldc:int(3722))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11315), ldc:int(11282)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5C5:int, ldc:int(2046168362))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(18452), ldc:int(18453)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(16393), ldc:int(8391)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5C5 = and:int(var_3_CA:int, ldc:int(-521175579))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(561), ldc:int(560)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1723938723))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1683105643))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(395748906))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(407621125))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-935554839))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1672472369))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1459012005))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1840587868))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1995700824))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-2128010514))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1547913654))
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(2043573556))
                        var_11_DB = and:int(ldc:int(10890), ldc:int(-11979))
                        goto(Label_1359)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(2074826960))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(2127167709))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(44376762))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1145580823))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(924722248))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(254903137))
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-320422416))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1464473702))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1508917591))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-474573408))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1775502459))
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1692232321))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1392896795))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1115432171))
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-372856858))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(26752), ldc:int(26753))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-949789675))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(2090109862))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-376992334))
                        var_11_DB = and:int(ldc:int(8873), ldc:int(-8878))
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(603505845))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1311819740))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1824855081))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-226097674))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1236)
                            }
                        }
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-440120531))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-2042799054))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1961615009))
                            loopcontinue()
                        }
                        
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1958145834))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1359)
                    }
                    
                    Label_1236:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1293208667))
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-588234981))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1995372402))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1226595235))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-460894926))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1359:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5D0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1370:
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1017641280))
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1907923323))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(1663246022))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(504973921))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-23169672))
                        var_17_5D0 = add:int(var_16_109:int, and:int(ldc:int(1041), ldc:int(4675)))
                        looporswitchbreak()
                    }
                    
                    var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-1068852090))
                }
                
                var_3_5C5 = and:int(var_3_5C5:int, ldc:int(-292567264))
                
                if (cmple:boolean(var_5_7D = var_17_5D0:int, sub:int(var_6_84:int, xor:int(ldc:int(8208), ldc:int(8209))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5C5:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
