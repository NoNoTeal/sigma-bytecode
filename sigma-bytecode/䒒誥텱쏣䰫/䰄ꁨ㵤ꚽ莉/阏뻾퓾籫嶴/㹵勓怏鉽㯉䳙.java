public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9 {
    public void \u3e75\u52d3\u600f\u927d\u3bc9\u4cd9(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9, p0:Schema, and:int[expected:boolean](ldc:int(19788), ldc:int(-24030)))
            putfield:String(\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9::\u385b\u4c04\u74b1\u67e9\ua61f\u9033, this:\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9, p1:String)
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
    
    public abstract java.lang.String \ub83f\u97e6\u8df4\u3d4b\uc87f\u8308(java.lang.String p0);
    
    public static com.mojang.datafixers.DataFix \uc238\ub70c\uc3e3\ua6bd\u93a2\u416d(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1, java.util.function.Function<java.lang.String, java.lang.String> p2) {
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
            return:DataFix(initobject:\u12cb\ubb2b\u4179\uc2e8\u718f\u839e[expected:DataFix](\u12cb\ubb2b\u4179\uc2e8\u718f\u839e::<init>, p0:Schema, p1:String, p2:Function<String, String>))
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Function lambda$\u4c04\u72f1\u2dcc\ubcb0\uc910\ubf56$1(com.mojang.serialization.DynamicOps p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\u64ab\u527a\ud51e\uceb8\u8258\u5bc4$0(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(invokevirtual:Pair(Pair::mapSecond, p0:Pair, invokedynamic:Function<String, String>(apply:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u4c04\ua068\u3d64\ua6bd\u8389/\u960f\ubefe\ud4fe\u7c6b\u5db4/\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9;)Ljava/util/function/Function;, this:\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9)))
        }
        
        goto(Label_0006)
    }
    
    public void \u3711\ud36e\u873d\u4f4a\u4492\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F1 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FC : int
        
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
        var_3_5F1 = and:int(ldc:int(543724591), ldc:int(-181063234))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e75\u52d3\u600f\u927d\u3bc9\u4cd9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1563697653))
        }
        else {
            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1731933675))
            var_5_85 = and:int(ldc:int(-11430), ldc:int(3237))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12610), ldc:int(-15711)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F1:int, ldc:int(-1406052929))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(130), ldc:int(131)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(1737), ldc:int(20481)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F1 = and:int(var_3_D2:int, ldc:int(-1356393282))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-16384), ldc:int(-16383)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(920270391))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-551607293))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1008)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1824839142))
                    }
                    else {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-185419156))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-340880897))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1008)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-227689079))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-63877212))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1395002909))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1756329960))
                        var_11_E3 = and:int(ldc:int(15456), ldc:int(-15457))
                        goto(Label_1388)
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2062912704))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-397745951))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1008)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1244363763))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-138699273))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(553565932))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2113268682))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2102167243))
                        goto(Label_1008)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(64836456))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1870460123))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1680891196))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1008)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2025111086))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1074598352))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2038012970))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(1029), ldc:int(241))
                                goto(Label_1008)
                            }
                        }
                    }
                    
                    Label_0857:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2052371200))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1437816542))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1333866828))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1819093893))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1598457606))
                        var_11_E3 = and:int(ldc:int(2668), ldc:int(-2669))
                    }
                    
                    Label_1008:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(53709778))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(856238955))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1240123512))
                            goto(Label_0857)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1219527830))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(636034507))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1978673974))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1962863312))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1655648952))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1269)
                            }
                        }
                    }
                    
                    Label_1151:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1613623424))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-932647019))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1008)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0857)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(72899843))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1212802369))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1388)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1269:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1008)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(783128555))
                        goto(Label_0857)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1898054655))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1936993376))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F1 = and:int(var_3_5F1:int, ldc:int(556129213))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1388:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FC = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1399:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1756056676))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-907033228))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1008)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(255244255))
                        goto(Label_0857)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1798118499))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1452048259))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-227132370))
                        var_17_5FC = add:int(var_16_111:int, and:int(ldc:int(257), ldc:int(6685)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2077680967))
                }
                
                var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1727255531))
                
                if (cmple:boolean(var_5_85 = var_17_5FC:int, sub:int(var_6_8C:int, and:int(ldc:int(1109), ldc:int(41))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
