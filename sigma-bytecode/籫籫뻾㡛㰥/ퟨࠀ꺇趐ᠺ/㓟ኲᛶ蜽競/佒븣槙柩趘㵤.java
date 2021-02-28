public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u4f52\ube23\u69d9\u67e9\u8d98\u3d64 {
    public void \u4f52\ube23\u69d9\u67e9\u8d98\u3d64(com.mojang.datafixers.schemas.Schema p0, boolean p1, java.lang.String p2, java.util.Map<java.lang.String, java.lang.String> p3) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u4f52\ube23\u69d9\u67e9\u8d98\u3d64, p0:Schema, p1:boolean)
            putfield:Map<String, String>(\u4f52\ube23\u69d9\u67e9\u8d98\u3d64::\u59ec\ubcb0\ua3b4\uf995\u64f2\ud171, this:\u4f52\ube23\u69d9\u67e9\u8d98\u3d64, p3:Map<String, String>)
            putfield:String(\u4f52\ube23\u69d9\u67e9\u8d98\u3d64::\u9af2\u9a18\u4c04\u0a06\u960f\u600f, this:\u4f52\ube23\u69d9\u67e9\u8d98\u3d64, p2:String)
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
    
    private java.util.function.Function lambda$\uc4d2\u7af6\u3504\u51fa\u183a\ufe34$2(com.mojang.serialization.DynamicOps p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$null$1(com.mojang.datafixers.util.Pair p0) {
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
    
    private java.lang.String lambda$\u51b2\u7af6\u9255\ubb2b\u51b2\ub6ab$0(java.lang.String p0) {
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
            return:String(checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::getOrDefault, getfield:Map<String, String>(\u4f52\ube23\u69d9\u67e9\u8d98\u3d64::\u59ec\ubcb0\ua3b4\uf995\u64f2\ud171, this:\u4f52\ube23\u69d9\u67e9\u8d98\u3d64), p0:String[expected:Object], p0:String)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_22B : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1D9_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2BD_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_189 : byte [generated]
        var_0_255 : int
        expr_23D : byte [generated]
        stack_289_2 : byte [generated]
        stack_260_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1C8 : byte[]
        var_5_1C9 : int
        expr_BB : int [generated]
        expr_EE : int [generated]
        var_3_2AC : byte[]
        var_5_2AD : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_22B = and:int(ldc:int(2132407278), ldc:int(2128082510))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2BD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("UIZyG4nn/H4WCGKZ++2HE4jhdAUWj+HwHv9pDPX2iYdxKKSOiQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpne:boolean(and:int(var_0_22B:int, ldc:int(2)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-11145093))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_189 = loadelement:byte(stack_189_0:byte[], var_5_172:int)
            storeelement:byte(var_3_171:byte[], var_5_172:int, or:int(and:int(shl:int(expr_189:byte, and:int(ldc:int(3756), ldc:int(263))), ldc:int(-16)), and:int(shr:int(expr_189:byte[expected:int], and:int(ldc:int(14405), ldc:int(17940))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2BD_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        Label_0544:
        
        while (cmpne:boolean(and:int(var_0_22B:int, ldc:int(4096)), ldc:int(0))) {
            var_0_255 = and:int(var_0_22B:int, ldc:int(1715075307))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_23D = stack_289_2 = loadelement(stack_23D_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(2)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_289_2 = stack_260_0 = add:byte(expr_23D:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(2))))
                goto(Label_0624)
            }
            
            Label_0586:
            
            if (cmpeq:boolean(and:int(var_0_255:int, ldc:int(32768)), ldc:int(0))) {
                var_0_255 = and:int(var_0_255:int, ldc:int(1465193368))
            }
            else {
                var_0_255 = and:int(var_0_255:int, ldc:int(-155453862))
                stack_289_2 = stack_260_0 = add:byte(expr_23D:byte, ldc:byte(2))
            }
            
            Label_0624:
            
            if (cmpeq:boolean(and:int(var_0_255:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_255 = and:int(var_0_255:int, ldc:int(-2032634425))
                goto(Label_0586)
            }
            
            var_0_22B = and:int(var_0_255:int, ldc:int(1719008098))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_289_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2BD_0 = var_3_171:byte[]
            goto(Label_0192)
        }
        
        var_0_22B = and:int(var_0_22B:int, ldc:int(522987824))
        goto(Label_0372)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-287311629))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1C8 = newarray:byte[](byte.class, expr_90:int)
                var_5_1C9 = expr_90:int
                
                loop {
                    var_0_22B = and:int(var_0_22B:int, ldc:int(-2491826))
                    var_5_1C9 = add:int(var_5_1C9:int, ldc:int(-1))
                    storeelement:byte(var_3_1C8:byte[], var_5_1C9:int, add:int(shl:int(loadelement:byte(stack_1D9_0:byte[], var_5_1C9:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1C9:int, xor:int(ldc:int(2080), ldc:int(2081)))), ldc:int(3)), and:int(ldc:int(19487), ldc:int(351)))))
                    
                    if (cmpne:boolean(var_5_1C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2BD_0 = var_3_1C8:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(1747599625))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_22B = and:int(var_0_22B:int, ldc:int(-432277505))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_16C = expr_BB:int
                var_3_171 = newarray:byte[](byte.class, expr_BB:int)
                var_5_172 = expr_BB:int
                goto(Label_0544)
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(4096)), ldc:int(0))) {
                var_0_22B = and:int(var_0_22B:int, ldc:int(-1499428873))
                goto(Label_0149)
            }
            
            if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(65536)), ldc:int(0))) {
                var_0_22B = and:int(var_0_22B:int, ldc:int(998858561))
                goto(Label_0112)
            }
            
            var_0_22B = and:int(var_0_22B:int, ldc:int(-285213058))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2AC = newarray:byte[](byte.class, expr_EE:int)
                var_5_2AD = expr_EE:int
                
                loop {
                    var_0_22B = and:int(var_0_22B:int, ldc:int(-418253098))
                    var_5_2AD = add:int(var_5_2AD:int, ldc:int(-1))
                    storeelement:byte(var_3_2AC:byte[], var_5_2AD:int, add:byte(xor:byte(loadelement:byte(stack_2BD_0:byte[], var_5_2AD:int), ldc:byte(63)), ldc:byte(4)))
                    
                    if (cmpne:boolean(var_5_2AD:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_189_0 = stack_1D9_0 = stack_23D_0 = stack_2BD_0 = var_3_2AC:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_22B:int, ldc:int(131072)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-669839895))
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(-314339823))
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_22B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_22B = and:int(var_0_22B:int, ldc:int(1999786135))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_165_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5250), ldc:int(5251)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(132), ldc:int(133)))
        storeelement:String(expr_144:String[], and:int(ldc:int(-10256), ldc:int(10255)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-24927), ldc:int(24922)), and:int(ldc:int(24612), ldc:int(1063))))
        putstatic:String[](\u4f52\ube23\u69d9\u67e9\u8d98\u3d64::\u516c\u960f\ua562\ua3b4\u8413\ubf56, expr_144:String[])
    }
    
    public void \ub102\ubcb0\u3776\ua6bd\uc7fe\u4e72(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(-1179621022), ldc:int(-572695044))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\ube23\u69d9\u67e9\u8d98\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(1701913647))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1688375966))
            var_5_85 = and:int(ldc:int(-8032), ldc:int(6478))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23776), ldc:int(22623)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_672:int, ldc:int(1056504288))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, and:int(ldc:int(10241), ldc:int(1235)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, xor:int(ldc:int(-11264), ldc:int(-11263)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DE:int, ldc:int(412535739))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17153), ldc:int(14401)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-927901725))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1252786778))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-787924698))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1859200382))
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(181097111))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1479921584))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0600)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-707876726))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1301335914))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-194664074))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1628443124))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1673772697))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1644271461))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-46444683))
                        var_11_EF = and:int(ldc:int(1945), ldc:int(-1948))
                        goto(Label_1557)
                    }
                    
                    Label_0600:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1227769132))
                        goto(Label_1568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1378836117))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-796458405))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1411884636))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-527970960))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1138927302))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0730:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-76309530))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2117244997))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1846754229))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(682931676))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(2071746937))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1992225616))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-617847083))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1685555683))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1276418399))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(2136563181))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = and:int(ldc:int(289), ldc:int(9235))
                                goto(Label_1168)
                            }
                        }
                    }
                    
                    Label_0983:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1677192570))
                        goto(Label_1568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-625953659))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-689470961))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(203071501))
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1070920653))
                            goto(Label_0730)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1607574160))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1708660709))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1623790107))
                        var_11_EF = and:int(ldc:int(2621), ldc:int(-2622))
                    }
                    
                    Label_1168:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-499803935))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(454546335))
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-136263666))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1402826737))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1568902589))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(2136698167))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1414)
                            }
                        }
                    }
                    
                    Label_1299:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1168)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1849080999))
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0730)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1809375140))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1170743824))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                            goto(Label_1557)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1414:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-428431647))
                        goto(Label_1568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(993916130))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2136779655))
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1137252138))
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-561953785))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-613064862))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1557:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1568:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1288011366))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0730)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-77927567))
                        var_17_67D = add:int(var_16_11D:int, and:int(ldc:int(18977), ldc:int(1425)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(2146619242))
                
                if (cmple:boolean(var_5_85 = var_17_67D:int, sub:int(var_6_8C:int, xor:int(ldc:int(13313), ldc:int(13312))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(293237505))
            goto(Label_0106)
        }
    }
}
