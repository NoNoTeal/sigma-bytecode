public abstract class \u56bd\u8413\u647c\u5bc4\ud158.\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975 {
    public void \u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975(com.mojang.datafixers.schemas.Schema p0, com.mojang.datafixers.DSL$TypeReference p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975, p0:Schema, and:int[expected:boolean](ldc:int(1939), ldc:int(-1980)))
            putfield:DSL$TypeReference(\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975::\u4c04\u3d4b\u8d90\u6435\uc3e3\u3e2a, this:\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975, p1:DSL$TypeReference)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.Typed<?> \uc246\u8d98\u8bb0\ubb2b\u4f52\u47c2(com.mojang.datafixers.Typed<?> p0, java.lang.String p1, java.util.function.Function<com.mojang.serialization.Dynamic<?>, com.mojang.serialization.Dynamic<?>> p2) {
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
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \u8cae\ud12e\u3dd3\u7006\u8df4\u40a9(com.mojang.serialization.Dynamic<?> p0, java.lang.String p1, java.lang.String p2) {
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
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \uc3e3\ufe34\ub83f\ud7e8\u72f1\uceb8(com.mojang.serialization.Dynamic<?> p0, java.lang.String p1, java.lang.String p2) {
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
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \ub83f\u4bc8\ubff1\u946b\ud217\u0a06(com.mojang.serialization.Dynamic<?> p0, java.lang.String p1, java.lang.String p2) {
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
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \u3776\u8350\ufe34\uc4d2\uc4d2\u8709(com.mojang.serialization.Dynamic<?> p0, java.lang.String p1) {
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
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \u8709\uc9f6\u7ce1\ubb2b\u5db4\ub6ab(com.mojang.serialization.Dynamic<?> p0) {
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
            return:Optional<Dynamic<?>>(invokestatic:Optional<Dynamic<?>>(\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975::\ube23\u7e3f\u8d98\ubff1\u3a62\uc29a, p0:Dynamic<?>, ldc:String("M"), ldc:String("L")))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \ube23\u7e3f\u8d98\ubff1\u3a62\uc29a(com.mojang.serialization.Dynamic<?> p0, java.lang.String p1, java.lang.String p2) {
        var_3_5F : int
        var_5_69 : long
        var_7_74 : long
        stack_A7_0 : Optional<Dynamic<?>> [generated]
        
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
            var_3_5F = and:int(ldc:int(1297792765), ldc:int(1323089647))
            var_5_69 = invokevirtual:long(OptionalDynamic::asLong, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, p1:String), ldc:long(0L))
            var_7_74 = invokevirtual:long(OptionalDynamic::asLong, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, p2:String), ldc:long(0L))
            
            if (logicaland:boolean(cmpne:boolean(var_5_69:long, ldc:long(0L)), cmpne:boolean(var_7_74:long, ldc:long(0L)))) {
                stack_A7_0 = invokestatic:Optional<Dynamic<?>>(\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975::\ucfaf\u74b1\u64f2\u99f7\ucb79\u1187, p0:Dynamic<?>, var_5_69:long, var_7_74:long)
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-621728157))
                stack_A7_0 = invokestatic:Optional<Dynamic<?>>(Optional<T>::empty)
            }
            
            return:Optional<Dynamic<?>>(stack_A7_0:Optional<Dynamic<?>>)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Optional<com.mojang.serialization.Dynamic<?>> \ucfaf\u74b1\u64f2\u99f7\ucb79\u1187(com.mojang.serialization.Dynamic<?> p0, long p1, long p2) {
        expr_6B : int[] [generated]
        
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
            expr_6B = newarray:int[](int.class, and:int(ldc:int(166), ldc:int(8220)))
            storeelement:int(expr_6B:int[], and:int(ldc:int(16476), ldc:int(-16477)), l2i:int(shr:long(p1:long, ldc:int(32))))
            storeelement:int(expr_6B:int[], and:int(ldc:int(1505), ldc:int(18439)), l2i:int(p1:long))
            storeelement:int(expr_6B:int[], and:int(ldc:int(8282), ldc:int(1699)), l2i:int(shr:long(p2:long, ldc:int(32))))
            storeelement:int(expr_6B:int[], and:int(ldc:int(18467), ldc:int(8795)), l2i:int(p2:long))
            return:Optional<Dynamic<?>>(invokestatic:Optional<Dynamic<?>>(Optional<T>::of, invokevirtual:Dynamic(Dynamic::createIntList, p0:Dynamic<?>, invokestatic:IntStream(Arrays::stream, expr_6B:int[]))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Optional lambda$\uc87f\u527a\ubf56\ua068\u5140\ubb2b$4(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
        var_2_CF : int
        var_4_6D : String
        var_5_D5 : UUID
        stack_F1_0 : Optional<Dynamic<?>> [generated]
        
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
            var_2_CF = and:int(and:int(ldc:int(386763463), ldc:int(250587127)), ldc:int(1992738535))
            var_4_6D = invokevirtual:String(Dynamic::asString, p1:Dynamic, checkcast:String(java.lang.String.class, aconstnull:String()))
            
            loop {
                if (cmpne:boolean(and:int(var_2_CF:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0170)
                }
                
                if (cmpne:boolean(and:int(var_2_CF:int, ldc:int(2)), ldc:int(0))) {
                    var_2_CF = and:int(var_2_CF:int, ldc:int(-1616847113))
                    
                    if (cmpeq:boolean(var_4_6D:String, aconstnull:String())) {
                        looporswitchbreak()
                    }
                }
                
                Label_0135:
                
                if (cmpne:boolean(and:int(var_2_CF:int, ldc:int(4194304)), ldc:int(0))) {
                    var_2_CF = and:int(var_2_CF:int, ldc:int(1694119185))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_CF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_CF = and:int(var_2_CF:int, ldc:int(930628770))
                        loopcontinue()
                    }
                    
                    var_2_CF = and:int(var_2_CF:int, ldc:int(527481551))
                }
                
                try {
                    Label_0170:
                    
                    if (cmpeq:boolean(and:int(var_2_CF:int, ldc:int(4)), ldc:int(0))) {
                        var_2_CF = and:int(var_2_CF:int, ldc:int(2026899505))
                        goto(Label_0135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_CF:int, ldc:int(64)), ldc:int(0))) {
                        var_2_CF = and:int(var_2_CF:int, ldc:int(1425128594))
                        loopcontinue()
                    }
                    
                    var_2_CF = and:int(var_2_CF:int, ldc:int(-1615157561))
                    var_5_D5 = invokestatic:UUID(UUID::fromString, var_4_6D:String)
                    var_2_CF = and:int(var_2_CF:int, ldc:int(-1902989321))
                    stack_F1_0 = invokestatic:Optional<Dynamic<?>>(\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975::\ucfaf\u74b1\u64f2\u99f7\ucb79\u1187, p0:Dynamic, invokevirtual:long(UUID::getMostSignificantBits, var_5_D5:UUID), invokevirtual:long(UUID::getLeastSignificantBits, var_5_D5:UUID))
                    var_2_CF = and:int(var_2_CF:int, ldc:int(655685599))
                    return:Optional(stack_F1_0:Optional<Dynamic<?>>)
                }
                catch (java.lang.IllegalArgumentException stack_F6_0) {
                }
                
                looporswitchbreak()
            }
            
            return:Optional(invokestatic:Optional<Object>(Optional<Object>::empty))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u1187\u3bc9\u72f1\u4492\u3d4b\ud51e$3(com.mojang.serialization.Dynamic p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.mojang.serialization.Dynamic p4) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic, p1:String), p2:String), p3:String, p4:Dynamic))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u9af2\u156b\u97e6\uf94d\u6b0d\u8c8a$2(com.mojang.serialization.Dynamic p0, java.lang.String p1, java.lang.String p2, com.mojang.serialization.Dynamic p3) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic, p1:String), p2:String, p3:Dynamic))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u4975\uae87\ub102\ua6bd\u4e72\uae5d$1(com.mojang.serialization.Dynamic p0, java.lang.String p1, java.lang.String p2, com.mojang.serialization.Dynamic p3) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic, p1:String), p2:String, p3:Dynamic))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\u1833\u16f6\u873d\u3d64\u718f\ubf56$0(java.util.function.Function p0, com.mojang.datafixers.Typed p1) {
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
            return:Typed(invokevirtual:Typed(Typed::update, p1:Typed, invokestatic:OpticFinder(DSL::remainderFinder), p0:Function))
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
            putstatic:Logger(\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975::\ub6ab\u7330\ube23\u7bad\u759a\u0b8e, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u5654\u12cb\u4ab3\ud217\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66A : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_675 : int
        
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
        var_3_66A = and:int(ldc:int(-460269906), ldc:int(-706808071))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_66A = and:int(var_3_66A:int, ldc:int(1186723752))
            var_5_81 = and:int(ldc:int(-25329), ldc:int(25312))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29375), ldc:int(25274)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_66A:int, ldc:int(1977474814))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(11305), ldc:int(4163)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(1545), ldc:int(12289)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_66A = and:int(var_3_D1:int, ldc:int(-644620369))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-30207), ldc:int(-30208)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-254988716))
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1988556402))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1423781149))
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-944056664))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0548)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0391:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(486309313))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(2130020428))
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(976904010))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-990718211))
                            var_11_E2 = and:int(ldc:int(26817), ldc:int(-26834))
                            goto(Label_1529)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0548:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1296130179))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-2053940918))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1669378282))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-64060850))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-489234694))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0672:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1603113799))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1801682967))
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1799688655))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1514170930))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(703452983))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-2120688572))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-1437187817))
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1045235987))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(438510969))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1651925707))
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1669516229))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1976948463))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(4224), ldc:int(4225))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1506561861))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-388802344))
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1531128984))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-1828911345))
                            goto(Label_0672)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1529921906))
                            goto(Label_0391)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-419694616))
                        var_11_E2 = and:int(ldc:int(-31038), ldc:int(14629))
                    }
                    
                    Label_1114:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(614648856))
                        goto(Label_1540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-256328263))
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1815050675))
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1507067078))
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-2129414556))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1184626685))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1392)
                            }
                        }
                    }
                    
                    Label_1247:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1533815600))
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-952657286))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1042078176))
                            goto(Label_0945)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-1199202032))
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0672)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(1069045175))
                            goto(Label_0391)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66A = and:int(var_3_66A:int, ldc:int(-573319426))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1529)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1392:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1540)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-361348359))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1798928444))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-97314802))
                        goto(Label_0391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1432221605))
                        loopcontinue()
                    }
                    
                    var_3_66A = and:int(var_3_66A:int, ldc:int(1593638654))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1529:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_675 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1540:
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(214851593))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-667171229))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0672)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(-1180521175))
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66A = and:int(var_3_66A:int, ldc:int(1845092075))
                        var_17_675 = add:int(var_16_110:int, and:int(ldc:int(22053), ldc:int(465)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66A = and:int(var_3_66A:int, ldc:int(1236598764))
                
                if (cmple:boolean(var_5_81 = var_17_675:int, sub:int(var_6_88:int, xor:int(ldc:int(-31744), ldc:int(-31743))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_66A:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
