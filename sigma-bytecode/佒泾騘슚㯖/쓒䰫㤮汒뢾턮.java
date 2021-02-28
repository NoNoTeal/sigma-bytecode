public final class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\uc4d2\u4c2b\u392e\u6c52\ub8be\ud12e {
    public void \uc4d2\u4c2b\u392e\u6c52\ub8be\ud12e() {
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
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\uc4d2\u4c2b\u392e\u6c52\ub8be\ud12e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
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
    
    private static void lambda$\u6b5f\u718f\u97b7\u8aa5\ub102\u62da$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
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
            invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(12610), ldc:int(-12611))))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-12142), ldc:int(3884))))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(9417), ldc:int(-9422))))
            invokevirtual:void(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\ubff1\u7ce1\u446c\u071d\uc246\u4daf, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-1279), ldc:int(1150))))
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
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_615 = and:int(ldc:int(-1007115451), ldc:int(-976161588))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\u4c2b\u392e\u6c52\ub8be\ud12e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(1274147908))
            var_5_7D = and:int(ldc:int(-8391), ldc:int(8390))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29739), ldc:int(29738)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_615:int, ldc:int(-338233117))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(1124), ldc:int(1125)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(21125), ldc:int(2049)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_CA:int, ldc:int(-69359296))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16385), ldc:int(16384)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(626207212))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-941778863))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1361204587))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(119493787))
                    }
                    else {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-268456852))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1788983558))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-259031751))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(918465731))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1820937840))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1808838475))
                        var_11_DB = and:int(ldc:int(21161), ldc:int(-22186))
                        goto(Label_1447)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(673982471))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1914865810))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(918916532))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1204543572))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(770793927))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1945822054))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-467650553))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1186023507))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1968994431))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1621002696))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1984909456))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1303887915))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-847676748))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1943513199))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(849160200))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1623376126))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1100687166))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-868991795))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1979764498))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(6791920))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1576183543))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(1581), ldc:int(2321))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(952968563))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1594863054))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(394982513))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1333992306))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1703839253))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-975981967))
                        var_11_DB = and:int(ldc:int(-27733), ldc:int(19540))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2108055117))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1601594190))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1955037306))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1991269867))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1441855168))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(352494347))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1949170738))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(697319638))
                            goto(Label_1075)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1418481475))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-387958411))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(1945352257))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1447)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(68672046))
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(390102715))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1075207548))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1849621794))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(227254705))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-335937703))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1210232549))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-654386293))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1649180990))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-369756163))
                        var_17_620 = add:int(var_16_109:int, and:int(ldc:int(8529), ldc:int(19459)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-880002933))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(-604636943))
                
                if (cmple:boolean(var_5_7D = var_17_620:int, sub:int(var_6_84:int, and:int(ldc:int(20673), ldc:int(8511))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
