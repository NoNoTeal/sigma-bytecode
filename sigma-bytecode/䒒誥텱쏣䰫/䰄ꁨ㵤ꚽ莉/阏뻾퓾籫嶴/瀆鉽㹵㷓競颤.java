public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u7006\u927d\u3e75\u3dd3\u7af6\u98a4 {
    public void \u7006\u927d\u3e75\u3dd3\u7af6\u98a4() {
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
            invokespecial:Object(Object::<init>, this:\u7006\u927d\u3e75\u3dd3\u7af6\u98a4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.function.Predicate<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u5bc4\uc7fe\u3bc9\u2dcc\u4daf\u6bb9(double p0, double p1, double p2, double p3) {
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
    
    public static java.util.function.Predicate<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u4d85\u51fa\u8d98\u93a2\ubb2b\u527a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
    
    public static java.util.function.Predicate<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u120d\u718f\u1187\u71ae\u97e6\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
    
    private static boolean lambda$\u3a62\u7ce1\u69d9\uc246\u4f4a\u64ab$7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
        var_2_5F : int
        
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
        var_2_5F = and:int(ldc:int(-892807282), ldc:int(-490217697))
        
        loop {
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(131072)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1460545015))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-891137601))
                
                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u72f1\u8753\u8bb0\ub102\ua3b4\u3c25, p1:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    p1 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
                    
                    if (cmpeq:boolean(p1:\u7d52\u718f\u3776\u6fb0\ub83f, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        return:boolean(and:int[expected:boolean](ldc:int(4048), ldc:int(-4053)))
                    }
                    
                    loopcontinue()
                }
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8388608)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(2053), ldc:int(9249)))
            }
        }
    }
    
    private static boolean lambda$\uc29a\ub18d\u71f1\u5d20\u527a\u6b0d$6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u6435\ub8be\u718f\u6b0d\u67e9.\ub6ab\u4d85\u97e6\ud51e\u983f p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u2dcc\uceb8\u6bb9\uc9f6\u5140 p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p3) {
        var_4_61 : int
        var_4_B4 : int
        var_6_BA : \ub6ab\u4d85\u97e6\ud51e\u983f
        stack_139_0 : \u2dcc\uceb8\u6bb9\uc9f6\u5140 [generated]
        var_4_163 : int
        var_7_139 : \u2dcc\uceb8\u6bb9\uc9f6\u5140
        stack_1A0_0 : int [generated]
        var_4_19E : int
        var_8_1A0 : int
        stack_2D0_0 : int [generated]
        
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
        var_4_61 = and:int(ldc:int(417261722), ldc:int(870477247))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u3bd6\u760c\u6b0d\u3c25\u3bd6\u5245, p3:\u7d52\u718f\u3776\u6fb0\ub83f))) {
            return:boolean(and:int[expected:boolean](ldc:int(-32019), ldc:int(15378)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0234)
            }
            
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1024)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(363353728))
            }
            else {
                var_4_61 = and:int(var_4_61:int, ldc:int(2102880699))
                
                if (getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                    if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p3:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                        goto(Label_0234)
                    }
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\u93a2\u4ab3\u120d\u8cae\u4492\u6435, checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p3:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))) {
                        goto(Label_0234)
                    }
                }
            }
            
            Label_0149:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-199723444))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_B4 = and:int(var_4_61:int, ldc:int(-1663305315))
                var_6_BA = invokevirtual:\ub6ab\u4d85\u97e6\ud51e\u983f(\u7d52\u718f\u3776\u6fb0\ub83f::\u647c\ufcaf\ube23\u8bb0\u4c04\u8c8a, p3:\u7d52\u718f\u3776\u6fb0\ub83f)
                
                if (cmpne:boolean(var_6_BA:\ub6ab\u4d85\u97e6\ud51e\u983f, aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
                    var_4_B4 = and:int(var_4_B4:int, ldc:int(-748685095))
                    stack_139_0 = invokevirtual:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\ub6ab\u4d85\u97e6\ud51e\u983f::\u4975\u98a4\u1833\ub70c\ubff1\u7006, var_6_BA:\ub6ab\u4d85\u97e6\ud51e\u983f)
                }
                else {
                    stack_139_0 = getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\uc4d2\uc9f6\uc246\u1833\ucfaf\ufcaf)
                }
                
                var_4_163 = and:int(var_4_B4:int, ldc:int(458719231))
                var_7_139 = stack_139_0:\u2dcc\uceb8\u6bb9\uc9f6\u5140
                
                if (cmpne:boolean(var_7_139:\u2dcc\uceb8\u6bb9\uc9f6\u5140, getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u624e\uceb8\u760c\u5654\u4f4a\u3e75))) {
                    loop {
                        if (cmpne:boolean(and:int(var_4_163:int, ldc:int(4194304)), ldc:int(0))) {
                            var_4_163 = and:int(var_4_163:int, ldc:int(1517447387))
                            
                            if (cmpne:boolean(p1:\ub6ab\u4d85\u97e6\ud51e\u983f, aconstnull:\ub6ab\u4d85\u97e6\ud51e\u983f())) {
                                if (invokevirtual:boolean(\ub6ab\u4d85\u97e6\ud51e\u983f::\uf995\u4bc8\u97b7\u6198\u8753\ub19c, p1:\ub6ab\u4d85\u97e6\ud51e\u983f, var_6_BA:\ub6ab\u4d85\u97e6\ud51e\u983f)) {
                                    stack_1A0_0 = and:int(ldc:int(5127), ldc:int(17217))
                                    looporswitchbreak()
                                }
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_4_163:int, ldc:int(4194304)), ldc:int(0))) {
                            var_4_163 = and:int(var_4_163:int, ldc:int(-134583618))
                            stack_1A0_0 = and:int(ldc:int(23724), ldc:int(-32429))
                            looporswitchbreak()
                        }
                    }
                    
                    var_4_19E = and:int(var_4_163:int, ldc:int(-1620312066))
                    var_8_1A0 = stack_1A0_0:int
                    
                    if (cmpne:boolean(p2:\u2dcc\uceb8\u6bb9\uc9f6\u5140, getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u965f\uc87f\u97b7\u071d\u64f2\ub113))) {
                        if (cmpne:boolean(var_7_139:\u2dcc\uceb8\u6bb9\uc9f6\u5140, getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u965f\uc87f\u97b7\u071d\u64f2\ub113))) {
                            goto(Label_0481)
                        }
                    }
                    
                    Label_0425:
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(128)), ldc:int(0))) {
                        var_4_19E = and:int(var_4_19E:int, ldc:int(-2102389568))
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(128)), ldc:int(0))) {
                        var_4_19E = and:int(var_4_19E:int, ldc:int(-254322199))
                    }
                    else {
                        var_4_19E = and:int(var_4_19E:int, ldc:int(846981565))
                        
                        if (cmpne:boolean(var_8_1A0:int, ldc:int(0))) {
                            return:boolean(and:int[expected:boolean](ldc:int(23265), ldc:int(-24290)))
                        }
                    }
                    
                    Label_0481:
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(131072)), ldc:int(0))) {
                        var_4_19E = and:int(var_4_19E:int, ldc:int(1941877261))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_19E:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(131072)), ldc:int(0))) {
                            var_4_19E = and:int(var_4_19E:int, ldc:int(-1221527050))
                            goto(Label_0425)
                        }
                        
                        var_4_19E = and:int(var_4_19E:int, ldc:int(316303615))
                        
                        if (cmpne:boolean(p2:\u2dcc\uceb8\u6bb9\uc9f6\u5140, getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u8bb0\ub8be\u718f\u99f7\u4daf\uc2bd))) {
                            if (cmpne:boolean(var_7_139:\u2dcc\uceb8\u6bb9\uc9f6\u5140, getstatic:\u2dcc\uceb8\u6bb9\uc9f6\u5140(\u2dcc\uceb8\u6bb9\uc9f6\u5140::\u8bb0\ub8be\u718f\u99f7\u4daf\uc2bd))) {
                                return:boolean(and:int[expected:boolean](ldc:int(1073), ldc:int(24843)))
                            }
                        }
                    }
                    
                    Label_0539:
                    
                    if (cmpne:boolean(and:int(var_4_19E:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(8)), ldc:int(0))) {
                            var_4_19E = and:int(var_4_19E:int, ldc:int(-32910974))
                            goto(Label_0481)
                        }
                        
                        if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0425)
                        }
                        
                        var_4_19E = and:int(var_4_19E:int, ldc:int(2020338937))
                        
                        if (cmpne:boolean(var_8_1A0:int, ldc:int(0))) {
                            return:boolean(and:int[expected:boolean](ldc:int(1073), ldc:int(24843)))
                        }
                    }
                    
                    Label_0585:
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0539)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_19E:int, ldc:int(2048)), ldc:int(0))) {
                        var_4_19E = and:int(var_4_19E:int, ldc:int(-1784025063))
                        goto(Label_0425)
                    }
                    
                    stack_2D0_0 = and:int[expected:boolean](ldc:int(-13934), ldc:int(621))
                    return:boolean(stack_2D0_0:boolean)
                    stack_2D0_0 = and:int[expected:boolean](ldc:int(1073), ldc:int(24843))
                    return:boolean(stack_2D0_0:boolean[expected:int])
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(8507), ldc:int(-9148)))
            }
            
            Label_0234:
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8192)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(451443290))
                goto(Label_0149)
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(67108864)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(7457), ldc:int(-7466)))
            }
        }
    }
    
    private static boolean lambda$\uafe7\ud158\uc910\u9a18\u62da\ub18d$5(double p0, double p1, double p2, double p3, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p4) {
        var_9_61 : int
        stack_A1_0 : int [generated]
        
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
            var_9_61 = and:int(ldc:int(-1090515949), ldc:int(-1091506253))
            
            if (logicaland:boolean(cmpne:boolean(p4:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), cmple:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p4:\u7d52\u718f\u3776\u6fb0\ub83f, p0:double, p1:double, p2:double), p3:double))) {
                stack_A1_0 = xor:int(ldc:int(132), ldc:int(133))
            }
            else {
                var_9_61 = and:int(var_9_61:int, ldc:int(-1353978105))
                stack_A1_0 = and:int(ldc:int(8540), ldc:int(-8576))
            }
            
            return:boolean(stack_A1_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6bb9\u873d\u8640\ub83f\u0c95\u3bc9$4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1914336326), ldc:int(1938773318))
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1992006119))
                stack_86_0 = and:int(ldc:int(4491), ldc:int(-4492))
            }
            else {
                stack_86_0 = xor:int(ldc:int(610), ldc:int(611))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc3e3\ubded\u839e\uc229\u7049\u5245$3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        stack_C0_0 : int [generated]
        
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
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\u120d\u946b\uff55\u8389\u3e75\uff55, checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))) {
                        if (cmpne:boolean(invokevirtual:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3dd3\u4daf\ub32d\ubcb0\u7d52\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd](\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), getstatic:\u8753\u0800\u4f4a\u4975\u64ab\u4c04(\u8753\u0800\u4f4a\u4975\u64ab\u4c04::\u97b7\u98a4\u385b\u5140\u0c95\uc4d2))) {
                            return:boolean(xor:int[expected:boolean](ldc:int(5249), ldc:int(5248)))
                        }
                    }
                }
                
                stack_C0_0 = and:int[expected:boolean](ldc:int(1605), ldc:int(-22086))
                return:boolean(stack_C0_0:boolean)
            }
            
            stack_C0_0 = xor:int[expected:boolean](ldc:int(5249), ldc:int(5248))
            return:boolean(stack_C0_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4f4a\u516c\u5654\uc238\u6bb9\u527a$2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f), logicalor:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\u120d\u946b\uff55\u8389\u3e75\uff55, checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))), and:int(ldc:int(-6017), ldc:int(6016)), xor:int(ldc:int(-28288), ldc:int(-28287))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3bc9\u3e75\u71ae\u0c95\u76bc\ua6bd$1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_1_60 : int
        stack_97_0 : int [generated]
        
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
            var_1_60 = and:int(ldc:int(1894545163), ldc:int(1945073017))
            
            if (logicaland:boolean(instanceof:boolean(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                stack_97_0 = and:int(ldc:int(16403), ldc:int(6177))
            }
            else {
                var_1_60 = and:int(var_1_60:int, ldc:int(1567546095))
                stack_97_0 = and:int(ldc:int(28082), ldc:int(-28083))
            }
            
            return:boolean(stack_97_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6c56\u8389\u0a06\u3dd3\ud523\u99f7$0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_1_61 : int
        stack_A6_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-2116184797), ldc:int(-2119345236))
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8709\u9033\ubff1\u4ab3\u960f\u93a2, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u72f1\u8753\u8bb0\ub102\ua3b4\u3c25, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                        stack_A6_0 = xor:int[expected:boolean](ldc:int(18432), ldc:int(18433))
                        return:boolean(stack_A6_0:boolean)
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(-675965514))
            stack_A6_0 = and:int[expected:boolean](ldc:int(-11248), ldc:int(2830))
            return:boolean(stack_A6_0:boolean[expected:int])
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
    
    public void \u8640\u7e3f\ub7dc\ud158\u7d52\uc2bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-505132255), ldc:int(-273809751))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7006\u927d\u3e75\u3dd3\u7af6\u98a4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-1088900163))
        }
        else {
            var_3_684 = and:int(var_3_684:int, ldc:int(-1083716995))
            var_5_8A = and:int(ldc:int(18050), ldc:int(-18051))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3496), ldc:int(-3516)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_684:int, ldc:int(-1227294111))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(135), ldc:int(4097)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(16769), ldc:int(3155)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_D9:int, ldc:int(-1519957069))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(171), ldc:int(2049)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2064611503))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(359224392))
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1399416145))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0561)
                            }
                            
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1908880666))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(656997994))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1016229971))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1244889992))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(920915946))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1236103569))
                            var_11_EA = and:int(ldc:int(63), ldc:int(-17472))
                            goto(Label_1539)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0561:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1237079697))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1332834718))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1446325430))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1989048420))
                        goto(Label_0967)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1802986091))
                        goto(Label_0811)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1389183129))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(510552483))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-867447272))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1854860809))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1556160961))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0811:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-370815167))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-408333298))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(739283719))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-68349751))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(634712015))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1312961924))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-168924771))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1349573085))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-15835407))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = xor:int(ldc:int(-30714), ldc:int(-30713))
                                goto(Label_1150)
                            }
                        }
                    }
                    
                    Label_0967:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-653997522))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1014194913))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1964402936))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-477552123))
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1438708506))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1832193947))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-261570382))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-24483013))
                        var_11_EA = and:int(ldc:int(6560), ldc:int(-14755))
                    }
                    
                    Label_1150:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1280852224))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1252149265))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0967)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1967136392))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1743632698))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-77988099))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1275:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1042861745))
                            goto(Label_1150)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0967)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(554384320))
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-634101652))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-480342149))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                            goto(Label_1539)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1511850717))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1578591976))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1272524376))
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(245128987))
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-362082415))
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-342167837))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1539:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1550:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-260509313))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1204880895))
                        goto(Label_0967)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(77096988))
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1246290130))
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1273217235))
                        var_17_68F = add:int(var_16_118:int, xor:int(ldc:int(2314), ldc:int(2315)))
                        looporswitchbreak()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-27143422))
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(-60293271))
                
                if (cmple:boolean(var_5_8A = var_17_68F:int, sub:int(var_6_91:int, xor:int(ldc:int(-32695), ldc:int(-32696))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
