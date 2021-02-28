public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ua3b4\u88c5\u8308\uff55\ub102\u4cd9 {
    public void \ua3b4\u88c5\u8308\uff55\ub102\u4cd9(com.mojang.datafixers.schemas.Schema p0, boolean p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9, p0:Schema, p1:boolean)
            putfield:String(\ua3b4\u88c5\u8308\uff55\ub102\u4cd9::\u67d0\u8753\u4c04\uae5d\u6c52\u718f, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9, p2:String)
            putfield:String(\ua3b4\u88c5\u8308\uff55\ub102\u4cd9::\u4975\uff55\ub83f\u4cd9\ub6ab\u8cae, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9, p3:String)
            putfield:String(\ua3b4\u88c5\u8308\uff55\ub102\u4cd9::\ufe34\ufcaf\u6bb9\u983f\ub6ab\ub102, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9, p4:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
    
    private com.mojang.datafixers.Typed lambda$\u6fb0\u9a18\u5db4\u8cae\u98a4\ud4fe$2(com.mojang.datafixers.Typed p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$null$1(com.mojang.serialization.Dynamic p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\u51fa\u8bb0\u624e\ubefe\u6d69\u836c$0(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, getfield:String(\ua3b4\u88c5\u8308\uff55\ub102\u4cd9::\ufe34\ufcaf\u6bb9\u983f\ub6ab\ub102, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9), p1:Dynamic), getfield:String(\ua3b4\u88c5\u8308\uff55\ub102\u4cd9::\u4975\uff55\ub83f\u4cd9\ub6ab\u8cae, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9)))
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
    
    public void \u7c6b\u12cb\u6d69\u3711\uc9f6\u5140(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_656 : int
        
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
        var_3_64B = and:int(ldc:int(-390213731), ldc:int(-828518563))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua3b4\u88c5\u8308\uff55\ub102\u4cd9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(-1354849311))
        }
        else {
            var_3_64B = and:int(var_3_64B:int, ldc:int(-84549859))
            var_5_85 = and:int(ldc:int(-15766), ldc:int(13329))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11030), ldc:int(11029)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_64B:int, ldc:int(1455292382))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(11529), ldc:int(4293)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-31708), ldc:int(-31707)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_64B = and:int(var_3_DA:int, ldc:int(1455288222))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(96), ldc:int(97)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(673639889))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(965484045))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-233304985))
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1570990811))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-42635865))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-722088003))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(890105728))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1083476372))
                        goto(Label_0688)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1467247776))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-928963815))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1056977122))
                        var_11_EB = and:int(ldc:int(-13176), ldc:int(4967))
                        goto(Label_1486)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1897752198))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1233979547))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1694375127))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(100003715))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-35791021))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-194234806))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-621285569))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0688:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(752520359))
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1020358912))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1848403218))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-924983489))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0804:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(223681053))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-63998071))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1002237932))
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(793728027))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1301788033))
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1289991271))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1485295836))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1742069662))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(10), ldc:int(11))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0948:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1261514606))
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1066973675))
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-2083127628))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-784285433))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-402653379))
                        var_11_EB = and:int(ldc:int(10178), ldc:int(-12231))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1792076880))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1880232044))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-474624034))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1357)
                            }
                        }
                    }
                    
                    Label_1200:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1404175819))
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(45482813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(442076648))
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(2063182478))
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-297442841))
                            goto(Label_0688)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1288304911))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(292088971))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1522003900))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1486)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1357:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1497)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1233228661))
                        goto(Label_1200)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-534966729))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1617852414))
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(86511934))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(1373634397))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1486:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_656 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1497:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1200)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1874021312))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1349425974))
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-58681239))
                        goto(Label_0688)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-65147992))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1184358204))
                        var_17_656 = add:int(var_16_119:int, and:int(ldc:int(20795), ldc:int(193)))
                        looporswitchbreak()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(-1070524475))
                }
                
                var_3_64B = and:int(var_3_64B:int, ldc:int(1402462046))
                
                if (cmple:boolean(var_5_85 = var_17_656:int, sub:int(var_6_8C:int, xor:int(ldc:int(17952), ldc:int(17953))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(16384)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(1781209388))
            goto(Label_0106)
        }
    }
}
