public class \u516c\u3d64\u718f\ub171\u6b5f.\u9255\u3e2a\ua068\u7bad\u8308\u40a9 {
    public void \u9255\u3e2a\ua068\u7bad\u8308\u40a9(\u3504\ufe34\u600f\u6b0d\u69d9.\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975 p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p2) {
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
            putfield:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975(\u9255\u3e2a\ua068\u7bad\u8308\u40a9::\u8d98\u3a62\u0a06\u071d\ua562\u4e72, this:\u9255\u3e2a\ua068\u7bad\u8308\u40a9, p0:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u9255\u3e2a\ua068\u7bad\u8308\u40a9::\u8d90\u5d20\u516c\u71f1\u3dd3\u67d0, this:\u9255\u3e2a\ua068\u7bad\u8308\u40a9, p1:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u9255\u3e2a\ua068\u7bad\u8308\u40a9::\u8d90\u3e75\uf94d\u9255\ua562\ua562, this:\u9255\u3e2a\ua068\u7bad\u8308\u40a9, p2:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u9255\u3e2a\ua068\u7bad\u8308\u40a9)
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
    
    private void lambda$\u7d52\u494c\ud217\u64ab\u4ab3\uc4d2$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
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
            invokevirtual:void(\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975::\u600f\u12cb\u3711\uc84e\ud523\u67e9, getfield:\ub18d\u56bd\u8d98\u5bc4\u4f52\u4975(\u9255\u3e2a\ua068\u7bad\u8308\u40a9::\u8d98\u3a62\u0a06\u071d\ua562\u4e72, this:\u9255\u3e2a\ua068\u7bad\u8308\u40a9), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1), and:int(ldc:int(8215), ldc:int(-10392))))), checkcast:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(java.util.List<\u51b2\u6fb0\ufcaf\u61a4\u0800.\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>.class, invokevirtual:List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<List<\u5245\u3504\uc31c\ubefe\u4f4a\u6c56>>, and:int(ldc:int(-29020), ldc:int(29001)))), invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4))
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
        var_3_610 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_61B : int
        
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
        var_3_610 = and:int(ldc:int(1676121809), ldc:int(-303046982))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9255\u3e2a\ua068\u7bad\u8308\u40a9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
            var_3_610 = and:int(var_3_610:int, ldc:int(2113914555))
            var_5_7D = and:int(ldc:int(16582), ldc:int(-16591))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25684), ldc:int(-27767)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_610:int, ldc:int(728614623))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(1545), ldc:int(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(28709), ldc:int(2067)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_610 = and:int(var_3_CA:int, ldc:int(368957077))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(17668), ldc:int(17669)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(2089216459))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(690236427))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1764457431))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1650683280))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(969401789))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1729552050))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(674985425))
                    }
                    else {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1352290663))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-717444078))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-261253548))
                        goto(Label_0818)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-771680553))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-400119888))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-771893285))
                        var_11_DB = and:int(ldc:int(28834), ldc:int(-28835))
                        goto(Label_1437)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-197313278))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(621744228))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(187716882))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1754430839))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1959276515))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-18691561))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1917161527))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-845803962))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(1165862620))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0818)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(915192985))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(32)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(455520820))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1706122349))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-357450668))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1913667851))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0818:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-642640723))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(1744160754))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(1921), ldc:int(24627))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(512)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1374783620))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1931533489))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-1116661093))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(569896078))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1452727688))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-538585417))
                        var_11_DB = and:int(ldc:int(15618), ldc:int(-15851))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1793465569))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1055391977))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(639938983))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-1576439103))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1074710149))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-411719719))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-526014312))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(164172751))
                            goto(Label_0818)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(-628853825))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_610 = and:int(var_3_610:int, ldc:int(1552894826))
                            loopcontinue()
                        }
                        
                        var_3_610 = and:int(var_3_610:int, ldc:int(-680681803))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1437)
                    }
                    
                    Label_1300:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-157337777))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1846009220))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(692407101))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(256)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(2062215794))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-2107794492))
                        loopcontinue()
                    }
                    
                    var_3_610 = and:int(var_3_610:int, ldc:int(938319582))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-532948348))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(128)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(50678822))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(1789585210))
                        goto(Label_0818)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(-672301270))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_610:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_610 = and:int(var_3_610:int, ldc:int(562018259))
                        var_17_61B = add:int(var_16_109:int, xor:int(ldc:int(2176), ldc:int(2177)))
                        looporswitchbreak()
                    }
                }
                
                var_3_610 = and:int(var_3_610:int, ldc:int(-1921658987))
                
                if (cmple:boolean(var_5_7D = var_17_61B:int, sub:int(var_6_84:int, and:int(ldc:int(513), ldc:int(9477))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_610:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
