public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ufe34\uc246\u7ce1\uc9f6\uc229\ub113 {
    public void \ufe34\uc246\u7ce1\uc9f6\uc229\ub113(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ufe34\uc246\u7ce1\uc9f6\uc229\ub113, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
            return:TypeRewriteRule(invokevirtual:TypeRewriteRule(\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::writeFixAndRead, this:\ufe34\uc246\u7ce1\uc9f6\uc229\ub113, loadelement:String(getstatic:String[](\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::\u59ec\u7d52\u74b1\ub113\u6fb0\u3bc9), and:int(ldc:int(-9059), ldc:int(8802))), invokevirtual:Type(Schema::getType, invokevirtual:Schema(\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::getInputSchema, this:\ufe34\uc246\u7ce1\uc9f6\uc229\ub113), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4f52\u5140\u71ae\ud158\u385b\ua61f)), invokevirtual:Type(Schema::getType, invokevirtual:Schema(\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::getOutputSchema, this:\ufe34\uc246\u7ce1\uc9f6\uc229\ub113), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4f52\u5140\u71ae\ud158\u385b\ua61f)), invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<T> \u071d\u7049\u92ff\ub6ab\ud523\u67d0(com.mojang.serialization.Dynamic<T> p0) {
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
    
    private static com.mojang.serialization.Dynamic<T> \u7049\u7006\ubff1\u6d69\u67d0\u7d52(com.mojang.serialization.Dynamic<T> p0) {
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
    
    private static boolean \u6ec6\u36d3\ubded\u52d3\u72f1\u8aa5(com.mojang.serialization.Dynamic<?> p0) {
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
            return:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::\u59ec\u7d52\u74b1\ub113\u6fb0\u3bc9), xor:int(ldc:int(18453), ldc:int(18455)))), loadelement:String(getstatic:String[](\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::\u59ec\u7d52\u74b1\ub113\u6fb0\u3bc9), xor:int(ldc:int(8195), ldc:int(8199)))), loadelement:String[expected:Object](getstatic:String[](\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::\u59ec\u7d52\u74b1\ub113\u6fb0\u3bc9), xor:int(ldc:int(14372), ldc:int(14369)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\uc31c\u1833\u9a18\ubded\u8413\u4ab3$2(java.util.stream.Stream p0) {
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
    
    private static boolean lambda$null$1(com.mojang.serialization.Dynamic p0) {
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
            var_1_5F = and:int(ldc:int(538137302), ldc:int(-1661524362))
            
            if (invokestatic:boolean(\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::\u6ec6\u36d3\ubded\u52d3\u72f1\u8aa5, p0:Dynamic)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1810127489))
                stack_86_0 = and:int(ldc:int(-8403), ldc:int(8402))
            }
            else {
                stack_86_0 = and:int(ldc:int(6465), ldc:int(9217))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Boolean lambda$\u494c\u3711\u97e6\ubefe\u6cfe\u4c04$0(java.util.stream.Stream p0) {
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
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, invokeinterface:boolean(Stream::allMatch, p0:Stream, invokedynamic:Predicate<Dynamic>(test:()Ljava/util/function/Predicate;))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_21E : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_91_0 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_C2_0 : byte[] [generated]
        stack_C4_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_231_0 : byte[] [generated]
        stack_293_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1B8 : byte[]
        var_4_1B9 : int
        expr_93 : int [generated]
        var_5_209 : int
        var_3_20E : byte[]
        var_4_20F : int
        expr_237 : byte [generated]
        var_0_289 : int
        expr_293 : byte [generated]
        stack_2C3_2 : byte [generated]
        expr_C4 : int [generated]
        var_3_F5 : String
        stack_1AF_0 : String[] [generated]
        expr_107 : String[] [generated]
        
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
            var_0_21E = and:int(ldc:int(1742892555), ldc:int(1676861181))
            expr_65 = var_2_69 = stack_91_0 = stack_93_0 = stack_C2_0 = stack_C4_0 = stack_E9_0 = stack_231_0 = stack_293_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BxC/Jz+iS6W5kqVKvTmSozG5JK49NC07OzilKyy9PsKgpCW8uJOivefuaA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1B8 = newarray:byte[](byte.class, expr_6D:int)
                var_4_1B9 = expr_6D:int
                
                loop {
                    var_0_21E = and:int(var_0_21E:int, ldc:int(-228630702))
                    var_4_1B9 = add:int(var_4_1B9:int, ldc:int(-1))
                    storeelement:byte(var_3_1B8:byte[], var_4_1B9:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1B9:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1B9:int, xor:int(ldc:int(3208), ldc:int(3209)))), ldc:int(3)), and:int(ldc:int(17439), ldc:int(4255)))))
                    
                    if (cmpne:boolean(var_4_1B9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_93_0 = stack_91_0 = stack_C2_0 = stack_C4_0 = stack_E9_0 = stack_231_0 = stack_293_0 = var_3_1B8:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_21E:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0201)
                }
                
                if (cmpne:boolean(and:int(var_0_21E:int, ldc:int(128)), ldc:int(0))) {
                    var_0_21E = and:int(var_0_21E:int, ldc:int(-738401519))
                    goto(Label_0152)
                }
                
                var_0_21E = and:int(var_0_21E:int, ldc:int(2146623279))
                expr_93 = arraylength:int(stack_93_0:byte[])
                
                if (cmpeq:boolean(expr_93:int, ldc:int(0))) {
                    goto(Label_0152)
                }
                
                var_5_209 = expr_93:int
                var_3_20E = newarray:byte[](byte.class, expr_93:int)
                var_4_20F = expr_93:int
                Label_0529:
                
                while (cmpne:boolean(and:int(var_0_21E:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_21E = and:int(var_0_21E:int, ldc:int(1793545943))
                    var_4_20F = add:int(var_4_20F:int, ldc:int(-1))
                    expr_237 = xor:byte(add:byte(loadelement:byte(stack_231_0:byte[], var_4_20F:int), ldc:byte(98)), ldc:byte(57))
                    storeelement:byte(var_3_20E:byte[], var_4_20F:int, or:int(and:int(shl:int(expr_237:byte, and:int(ldc:int(16396), ldc:int(13318))), ldc:int(-16)), and:int(shr:int(expr_237:byte[expected:int], xor:int(ldc:int(8719), ldc:int(8715))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_20F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_93_0 = stack_91_0 = stack_C2_0 = stack_C4_0 = stack_E9_0 = stack_231_0 = stack_293_0 = var_3_20E:byte[]
                    goto(Label_0152)
                }
                
                var_0_21E = and:int(var_0_21E:int, ldc:int(-295822172))
                Label_0636:
                
                while (cmpeq:boolean(and:int(var_0_21E:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_289 = and:int(var_0_21E:int, ldc:int(-9709524))
                    var_4_20F = add:int(var_4_20F:int, ldc:int(-1))
                    expr_293 = loadelement:byte(stack_293_0:byte[], var_4_20F:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_20F:int, ldc:int(3)), neg:int(var_5_209:int)), ldc:int(0))) {
                        var_0_289 = and:int(var_0_289:int, ldc:int(-280308153))
                        stack_2C3_2 = add:byte(expr_293:byte, ldc:byte(3))
                    }
                    else {
                        stack_2C3_2 = add:byte(expr_293:byte, loadelement:byte(var_3_20E:byte[], add:int(var_4_20F:int, ldc:int(3))))
                    }
                    
                    var_0_21E = and:int(var_0_289:int, ldc:int(2138828597))
                    storeelement:byte(var_3_20E:byte[], var_4_20F:int, stack_2C3_2:byte)
                    
                    if (cmpne:boolean(var_4_20F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_93_0 = stack_91_0 = stack_C2_0 = stack_C4_0 = stack_E9_0 = stack_231_0 = stack_293_0 = var_3_20E:byte[]
                    goto(Label_0201)
                }
                
                goto(Label_0529)
                Label_0152:
                
                if (cmpne:boolean(and:int(var_0_21E:int, ldc:int(4)), ldc:int(0))) {
                    var_0_21E = and:int(var_0_21E:int, ldc:int(1141635612))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_21E:int, ldc:int(4)), ldc:int(0))) {
                        var_0_21E = and:int(var_0_21E:int, ldc:int(216438643))
                        loopcontinue()
                    }
                    
                    var_0_21E = and:int(var_0_21E:int, ldc:int(-162104688))
                    expr_C4 = arraylength:int(stack_C4_0:byte[])
                    
                    if (cmpne:boolean(expr_C4:int, ldc:int(0))) {
                        var_5_209 = expr_C4:int
                        var_3_20E = newarray:byte[](byte.class, expr_C4:int)
                        var_4_20F = expr_C4:int
                        goto(Label_0636)
                    }
                }
                
                Label_0201:
                
                if (cmpne:boolean(and:int(var_0_21E:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0152)
                }
                
                if (cmpeq:boolean(and:int(var_0_21E:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_21E = and:int(var_0_21E:int, ldc:int(1468617064))
            }
            
            var_3_F5 = initobject:String(String::<init>, stack_E9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1AF_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1072), ldc:int(1078)))
            expr_107 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(776), ldc:int(782)))
            storeelement:String(expr_107:String[], and:int(ldc:int(20614), ldc:int(533)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, and:int(ldc:int(-23283), ldc:int(19186)), and:int(ldc:int(19725), ldc:int(-27918))))
            storeelement:String(expr_107:String[], xor:int(ldc:int(16524), ldc:int(16525)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, and:int(ldc:int(8821), ldc:int(-12918)), xor:int(ldc:int(583), ldc:int(591))))
            storeelement:String(expr_107:String[], xor:int(ldc:int(270), ldc:int(269)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, xor:int(ldc:int(558), ldc:int(550)), xor:int(ldc:int(2307), ldc:int(2318))))
            storeelement:String(expr_107:String[], and:int(ldc:int(10744), ldc:int(-11258)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, xor:int(ldc:int(4391), ldc:int(4394)), and:int(ldc:int(4901), ldc:int(174))))
            storeelement:String(expr_107:String[], xor:int(ldc:int(24610), ldc:int(24615)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, and:int(ldc:int(1076), ldc:int(102)), xor:int(ldc:int(1411), ldc:int(1451))))
            storeelement:String(expr_107:String[], and:int(ldc:int(802), ldc:int(7306)), invokevirtual:String[expected:String](String::substring, var_3_F5:String, xor:int(ldc:int(4182), ldc:int(4222)), and:int(ldc:int(18478), ldc:int(8955))))
            putstatic:String[](\ufe34\uc246\u7ce1\uc9f6\uc229\ub113::\u59ec\u7d52\u74b1\ub113\u6fb0\u3bc9, expr_107:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3d4b\u516c\uc229\ufcaf\u4975\uc31c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AA : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_6B5 : int
        
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
        var_3_6AA = and:int(ldc:int(-11564854), ldc:int(-414724263))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufe34\uc246\u7ce1\uc9f6\uc229\ub113[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6AA = and:int(var_3_6AA:int, ldc:int(1719656393))
            var_5_80 = and:int(ldc:int(18479), ldc:int(-26672))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3264), ldc:int(-3265)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_6AA:int, ldc:int(-2639800))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(3137), ldc:int(3136)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(1), ldc:int(18443)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_6AA = and:int(var_3_D0:int, ldc:int(-143132293))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(1554), ldc:int(1555)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(241359498))
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-724995368))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1294227817))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-39172786))
                    }
                    else {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1984424047))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1144302420))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(989409643))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1666426376))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1603209370))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(1743755483))
                            var_11_E1 = and:int(ldc:int(7436), ldc:int(-7437))
                            goto(Label_1555)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-931940907))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1653868678))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(150231263))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(2074718684))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(157046623))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(2024723605))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-278414471))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1468745703))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-264139900))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1161634327))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1354959221))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-413693496))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-85247912))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1815536474))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(365411821))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(102153459))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-19927937))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(10947), ldc:int(1289))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1321905847))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-744388299))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(364326311))
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-2094972963))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-2076149458))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-19420933))
                        var_11_E1 = and:int(ldc:int(17566), ldc:int(-20127))
                    }
                    
                    Label_1132:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(711754907))
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1843573888))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(2069885418))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-182526312))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(-414558275))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(769897249))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-421556274))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1410)
                            }
                        }
                    }
                    
                    Label_1275:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1263851443))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1132)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(56007584))
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(1941352466))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6AA = and:int(var_3_6AA:int, ldc:int(1964462031))
                            loopcontinue()
                        }
                        
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-414712247))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1555)
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-394456170))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1979273014))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(50599062))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1132509729))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1264714461))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AA = and:int(var_3_6AA:int, ldc:int(-134226853))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1555:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B5 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1566:
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-346427302))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1578350000))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1333066308))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(1107654887))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(-891813945))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(169861829))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AA = and:int(var_3_6AA:int, ldc:int(2003799036))
                        var_17_6B5 = add:int(var_16_10F:int, and:int(ldc:int(24583), ldc:int(5513)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AA = and:int(var_3_6AA:int, ldc:int(-1320232889))
                }
                
                var_3_6AA = and:int(var_3_6AA:int, ldc:int(1719663449))
                
                if (cmple:boolean(var_5_80 = var_17_6B5:int, sub:int(var_6_87:int, xor:int(ldc:int(16578), ldc:int(16579))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_6AA:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
