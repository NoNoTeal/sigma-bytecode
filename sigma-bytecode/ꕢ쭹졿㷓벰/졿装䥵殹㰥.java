public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\uc87f\u88c5\u4975\u6bb9\u3c25 {
    public void \uc87f\u88c5\u4975\u6bb9\u3c25(java.io.File p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\ud51e\u7ce1\ua61f\u183a\u1187 p1) {
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
            invokespecial:Object(Object::<init>, this:\uc87f\u88c5\u4975\u6bb9\u3c25)
            putfield:File(\uc87f\u88c5\u4975\u6bb9\u3c25::\uc31c\u392e\ub19c\uc9f6\u8709\u416d, this:\uc87f\u88c5\u4975\u6bb9\u3c25, p0:File)
            putfield:\ud51e\u7ce1\ua61f\u183a\u1187(\uc87f\u88c5\u4975\u6bb9\u3c25::\u4179\u8389\ua6bd\ub32d\uf94d\ud523, this:\uc87f\u88c5\u4975\u6bb9\u3c25, p1:\ud51e\u7ce1\ua61f\u183a\u1187)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\ubded\u6ec6\ub32d\u5db4\u64f2(java.util.function.Consumer<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64> p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u7ce1\ubb2b\uc31c\u6d69\u5654 p1) {
        var_3_5F : int
        var_3_6E : int
        var_5_79 : File[]
        var_6_9B : File[]
        var_7_A0 : int
        var_8_A9 : int
        var_9_C3 : File
        var_11_101 : \ua61f\uae87\u36d3\u647c\u3d64
        
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
            var_3_5F = and:int(ldc:int(-1282083637), ldc:int(1847049647))
            
            if (logicalnot:boolean(invokevirtual:boolean(File::isDirectory, getfield:File(\uc87f\u88c5\u4975\u6bb9\u3c25::\uc31c\u392e\ub19c\uc9f6\u8709\u416d, this:\uc87f\u88c5\u4975\u6bb9\u3c25)))) {
                invokevirtual:boolean(File::mkdirs, getfield:File(\uc87f\u88c5\u4975\u6bb9\u3c25::\uc31c\u392e\ub19c\uc9f6\u8709\u416d, this:\uc87f\u88c5\u4975\u6bb9\u3c25))
            }
            
            var_3_6E = and:int(var_3_5F:int, ldc:int(1935094927))
            var_5_79 = invokevirtual:File[](File::listFiles, getfield:File(\uc87f\u88c5\u4975\u6bb9\u3c25::\uc31c\u392e\ub19c\uc9f6\u8709\u416d, this:\uc87f\u88c5\u4975\u6bb9\u3c25), getstatic:FileFilter(\uc87f\u88c5\u4975\u6bb9\u3c25::\u7bad\u4d85\u7ce1\u071d\u873d\u92ee))
            
            if (cmpne:boolean(var_5_79:File[], aconstnull:File[]())) {
                var_6_9B = var_5_79:File[]
                var_7_A0 = arraylength:int(var_6_9B:File[])
                var_8_A9 = and:int(ldc:int(-4242), ldc:int(4241))
                
                loop {
                    var_3_6E = and:int(var_3_6E:int, ldc:int(-81341137))
                    
                    if (cmpge:boolean(var_8_A9:int, var_7_A0:int)) {
                        looporswitchbreak()
                    }
                    
                    var_9_C3 = loadelement:File(var_6_9B:File[], var_8_A9:int)
                    var_11_101 = invokestatic:\ua61f\uae87\u36d3\u647c\u3d64(\ua61f\uae87\u36d3\u647c\u3d64::\u873d\u7006\u3dd3\u6c52\u97b7\u946b, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uc87f\u88c5\u4975\u6bb9\u3c25::\u71f1\u0c95\u3776\ua562\u4492\u8753), and:int(ldc:int(66), ldc:int(-67)))), invokevirtual:String(File::getName, var_9_C3:File))), and:int[expected:boolean](ldc:int(21015), ldc:int(-21048)), invokespecial:Supplier<\u4f52\u7ce1\uc229\ucef1\ube23>(\uc87f\u88c5\u4975\u6bb9\u3c25::\u8389\u927d\u385b\ud7e8\ua068\u527a, this:\uc87f\u88c5\u4975\u6bb9\u3c25, var_9_C3:File), p1:\u7ce1\ubb2b\uc31c\u6d69\u5654, getstatic:\ub18d\ub171\u51fa\uafe7\u7049(\ub18d\ub171\u51fa\uafe7\u7049::\u99f7\u4cd9\u4d85\u3504\u34df\uae5d), getfield:\ud51e\u7ce1\ua61f\u183a\u1187(\uc87f\u88c5\u4975\u6bb9\u3c25::\u4179\u8389\ua6bd\ub32d\uf94d\ud523, this:\uc87f\u88c5\u4975\u6bb9\u3c25))
                    
                    if (cmpne:boolean(var_11_101:\ua61f\uae87\u36d3\u647c\u3d64, aconstnull:\ua61f\uae87\u36d3\u647c\u3d64())) {
                        invokeinterface:void(Consumer<\ua61f\uae87\u36d3\u647c\u3d64>::accept, p0:Consumer<\ua61f\uae87\u36d3\u647c\u3d64>, var_11_101:\ua61f\uae87\u36d3\u647c\u3d64)
                    }
                    
                    inc:int(var_8_A9, ldc:int(1))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23> \u8389\u927d\u385b\ud7e8\ua068\u527a(java.io.File p0) {
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
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\u6b0d\u8308\ube23\uc246\u64ab\u6b0d$2(java.io.File p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(initobject:\u983f\ucef1\ua3b4\ubf56\u4975[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u983f\ucef1\ua3b4\ubf56\u4975::<init>, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u4f52\u7ce1\uc229\ucef1\ube23 lambda$\u416d\u7873\u5f50\u8258\u8bb0\uf995$1(java.io.File p0) {
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
            return:\u4f52\u7ce1\uc229\ucef1\ube23(initobject:\u69d9\u9255\u6d99\ubff1\u0c95[expected:\u4f52\u7ce1\uc229\ucef1\ube23](\u69d9\u9255\u6d99\ubff1\u0c95::<init>, p0:File))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4975\u3776\u4ab3\uc2bd\u9af2\u9af2$0(java.io.File p0) {
        var_1_5F : int
        stack_A2_0 : int [generated]
        var_1_A1 : int
        var_3_A2 : int
        stack_E9_0 : int [generated]
        var_4_E9 : int
        
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
            var_1_5F = and:int(ldc:int(-1267440520), ldc:int(-1100611617))
            
            if (logicaland:boolean(invokevirtual:boolean(File::isFile, p0:File), invokevirtual:boolean(String::endsWith, invokevirtual:String(File::getName, p0:File), loadelement:String(getstatic:String[](\uc87f\u88c5\u4975\u6bb9\u3c25::\u71f1\u0c95\u3776\ua562\u4492\u8753), xor:int(ldc:int(2820), ldc:int(2821)))))) {
                stack_A2_0 = xor:int(ldc:int(-31872), ldc:int(-31871))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1770236546))
                stack_A2_0 = and:int(ldc:int(1843), ldc:int(-1976))
            }
            
            var_1_A1 = and:int(var_1_5F:int, ldc:int(-25266216))
            var_3_A2 = stack_A2_0:int
            
            if (logicaland:boolean(invokevirtual:boolean(File::isDirectory, p0:File), invokevirtual:boolean(File::isFile, initobject:File(File::<init>, p0:File, loadelement:String(getstatic:String[](\uc87f\u88c5\u4975\u6bb9\u3c25::\u71f1\u0c95\u3776\ua562\u4492\u8753), and:int(ldc:int(6538), ldc:int(24642))))))) {
                stack_E9_0 = and:int(ldc:int(17041), ldc:int(15621))
            }
            else {
                var_1_A1 = and:int(var_1_A1:int, ldc:int(-546841222))
                stack_E9_0 = and:int(ldc:int(-5491), ldc:int(5490))
            }
            
            var_4_E9 = stack_E9_0:int
            return:boolean(ternaryop:int(logicaland:boolean(cmpeq:boolean(var_3_A2:int, ldc:int(0)), cmpeq:boolean(var_4_E9:int, ldc:int(0))), and:int(ldc:int(14467), ldc:int(-14476)), xor:int(ldc:int(-28636), ldc:int(-28635))))
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
    
    public void \u873d\u4bc8\u8258\u16f6\ucb79\u5140(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_646 : int
        
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
        var_3_63B = and:int(ldc:int(-1945300434), ldc:int(-893685409))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc87f\u88c5\u4975\u6bb9\u3c25[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(65536)), ldc:int(0))) {
            var_3_63B = and:int(var_3_63B:int, ldc:int(-1890722857))
            var_5_80 = and:int(ldc:int(13601), ldc:int(-13618))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2395), ldc:int(2394)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_63B:int, ldc:int(-2137039938))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(2626), ldc:int(2627)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(9495), ldc:int(1)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_63B = and:int(var_3_CF:int, ldc:int(-992234785))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(20497), ldc:int(2797)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(113954770))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1045237558))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-40005586))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0379:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2123491923))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1088008857))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1483218551))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1321134895))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-414345329))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1732641286))
                        goto(Label_0681)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-505574981))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1318233521))
                            var_11_E0 = and:int(ldc:int(-24304), ldc:int(23750))
                            goto(Label_1484)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-801188169))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1864012200))
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(2143916287))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-107373193))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0809)
                        }
                    }
                    
                    Label_0681:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-293257441))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-359342224))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1640970315))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1040613381))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1184130785))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0809:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(689261168))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(959738748))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1321309741))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1110338400))
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-865389829))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1927474193))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = and:int(ldc:int(4257), ldc:int(8769))
                                goto(Label_1105)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1611156795))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1080747492))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1220671773))
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-434684452))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(2128951323))
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1536443130))
                        var_11_E0 = and:int(ldc:int(3158), ldc:int(-3191))
                    }
                    
                    Label_1105:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1463820377))
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1378296926))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(848268128))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1390597213))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-758287578))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1350)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1495)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(275226460))
                            goto(Label_1105)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0809)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0681)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1141633368))
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-509593742))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1741866881))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                        goto(Label_1484)
                    }
                    
                    Label_1350:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2041124361))
                        goto(Label_1495)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(299752668))
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1226639375))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1443734689))
                        loopcontinue()
                    }
                    
                    var_3_63B = and:int(var_3_63B:int, ldc:int(-898785786))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1484:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_646 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1495:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(663540025))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(762231745))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0809)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0681)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1576062836))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-269633337))
                        var_17_646 = add:int(var_16_10E:int, and:int(ldc:int(4869), ldc:int(83)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63B = and:int(var_3_63B:int, ldc:int(-250015321))
                
                if (cmple:boolean(var_5_80 = var_17_646:int, sub:int(var_6_87:int, xor:int(ldc:int(11520), ldc:int(11521))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
