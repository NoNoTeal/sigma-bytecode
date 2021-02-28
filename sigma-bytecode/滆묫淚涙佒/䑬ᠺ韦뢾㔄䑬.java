public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u446c\u183a\u97e6\ub8be\u3504\u446c {
    public void \u446c\u183a\u97e6\ub8be\u3504\u446c(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::<init>, this:\u446c\u183a\u97e6\ub8be\u3504\u446c, p0:Schema, p1:boolean, loadelement:String(getstatic:String[](\u446c\u183a\u97e6\ub8be\u3504\u446c::\u9255\u0b8e\u7330\uc31c\u4daf\ub6ab), and:int(ldc:int(-14440), ldc:int(12391))), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7), loadelement:String(getstatic:String[](\u446c\u183a\u97e6\ub8be\u3504\u446c::\u9255\u0b8e\u7330\uc31c\u4daf\ub6ab), xor:int(ldc:int(7184), ldc:int(7185))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.Typed<?> \ufe34\u5f50\uf94d\ubff1\ua068\u7873(com.mojang.datafixers.Typed<?> p0) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.BasicBlock
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
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
    
    private com.mojang.datafixers.Typed<?> \ub1b9\u97b7\u965f\u6c56\u8cae\u839e(com.mojang.datafixers.OpticFinder<com.mojang.datafixers.util.Pair<java.lang.String, java.lang.String>> p0, com.mojang.datafixers.Typed<?> p1) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\u946b\u2dcc\u16f6\u6c52\u5db4\u3e2a$5(com.mojang.datafixers.util.Pair p0) {
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
    
    private static java.lang.String lambda$\ud171\ud36e\ud158\uf9c5\u9255\u9a18$4(java.lang.String p0) {
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
            return:String(ternaryop:String(invokestatic:boolean(Objects::equals, p0:String[expected:Object], loadelement:String[expected:Object](getstatic:String[](\u446c\u183a\u97e6\ub8be\u3504\u446c::\u9255\u0b8e\u7330\uc31c\u4daf\ub6ab), and:int(ldc:int(8303), ldc:int(2073)))), loadelement:String(getstatic:String[](\u446c\u183a\u97e6\ub8be\u3504\u446c::\u9255\u0b8e\u7330\uc31c\u4daf\ub6ab), xor:int(ldc:int(4137), ldc:int(4131))), p0:String))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\uf9c5\u446c\u836c\uc29a\uc229\ub83f$3(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, java.util.function.Function p3, com.mojang.datafixers.OpticFinder p4, com.mojang.datafixers.OpticFinder p5, com.mojang.datafixers.Typed p6) {
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
    
    private static com.mojang.datafixers.Typed lambda$\uc2bd\ucb79\u7e3f\u494c\u64f2\u56bd$2(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, java.util.function.Function p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.OpticFinder p4, com.mojang.datafixers.Typed p5) {
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
    
    private static com.mojang.datafixers.Typed lambda$null$1(com.mojang.datafixers.OpticFinder p0, java.util.function.Function p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.Typed p4) {
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
            return:Typed(invokevirtual:Typed(Typed::updateTyped, invokevirtual:Typed(Typed::updateTyped, invokevirtual:Typed(Typed::updateTyped, p4:Typed, p0:OpticFinder, p1:Function), p2:OpticFinder, p1:Function), p3:OpticFinder, p1:Function))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\u8d90\u8d90\u0b8e\u62da\uc246\u8413$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
            return:Typed(invokespecial:Typed<?>(\u446c\u183a\u97e6\ub8be\u3504\u446c::\ub1b9\u97b7\u965f\u6c56\u8cae\u839e, this:\u446c\u183a\u97e6\ub8be\u3504\u446c, p0:OpticFinder, p1:Typed))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3A2 : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_153_0 : byte[] [generated]
        stack_155_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_2FD_0 : byte[] [generated]
        stack_34E_0 : byte[] [generated]
        stack_3C6_0 : byte[] [generated]
        stack_413_0 : byte[] [generated]
        stack_487_0 : byte[] [generated]
        var_4_2D8 : int
        var_3_2DD : byte[]
        var_5_2DE : int
        expr_2FD : byte [generated]
        var_0_409 : int
        expr_413 : byte [generated]
        stack_452_2 : byte [generated]
        stack_42F_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_33C : byte[]
        var_5_33D : int
        expr_E1 : int [generated]
        expr_11B : int [generated]
        expr_155 : int [generated]
        var_3_475 : byte[]
        var_5_476 : int
        var_3_190 : String
        stack_2D1_0 : String[] [generated]
        expr_1A2 : String[] [generated]
        
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
        var_0_3A2 = and:int(ldc:int(-864033109), ldc:int(1550834879))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_DF_0 = stack_E1_0 = stack_119_0 = stack_11B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_2FD_0 = stack_34E_0 = stack_3C6_0 = stack_413_0 = stack_487_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MDg3tnj287+y9/W1OvOPNva5hDbjfTs05nx3QnM7SnK2t3eCo3o56kyq9LY4taK1O4l0ebv1NzR38zU99mu9dnqnf3QyOnSEMPX6dLbIvHczu3uj8XY7ODU6Ofn2dXb29fV4dLbIvLo4evklM/Z1dvb19Xh0tsi8PDU6+KKyM7k5tTqITAnITIqK")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2D8 = expr_6B:int
        var_3_2DD = newarray:byte[](byte.class, expr_6B:int)
        var_5_2DE = expr_6B:int
        Label_0736:
        
        while (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0917)
            }
            
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1584000400))
            var_5_2DE = add:int(var_5_2DE:int, ldc:int(-1))
            expr_2FD = loadelement:byte(stack_2FD_0:byte[], var_5_2DE:int)
            storeelement:byte(var_3_2DD:byte[], var_5_2DE:int, or:int(and:int(shl:int(expr_2FD:byte, xor:int(ldc:int(288), ldc:int(292))), ldc:int(-16)), and:int(shr:int(expr_2FD:byte[expected:int], xor:int(ldc:int(8704), ldc:int(8708))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_119_0 = stack_11B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_2FD_0 = stack_34E_0 = stack_3C6_0 = stack_413_0 = stack_487_0 = var_3_2DD:byte[]
            goto(Label_0112)
        }
        
        goto(Label_1013)
        Label_0917:
        
        while (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(128)), ldc:int(0))) {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-868287281))
                goto(Label_0736)
            }
            
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(2129520052))
            var_5_2DE = add:int(var_5_2DE:int, ldc:int(-1))
            storeelement:byte(var_3_2DD:byte[], var_5_2DE:int, add:byte(loadelement:byte(stack_3C6_0:byte[], var_5_2DE:int), ldc:byte(35)))
            
            if (cmpne:boolean(var_5_2DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_119_0 = stack_11B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_2FD_0 = stack_34E_0 = stack_3C6_0 = stack_413_0 = stack_487_0 = var_3_2DD:byte[]
            goto(Label_0230)
        }
        
        var_0_3A2 = and:int(var_0_3A2:int, ldc:int(782182913))
        Label_1013:
        
        while (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0736)
            }
            
            var_0_409 = and:int(var_0_3A2:int, ldc:int(-51517771))
            var_5_2DE = add:int(var_5_2DE:int, ldc:int(-1))
            expr_413 = stack_452_2 = loadelement(stack_413_0, var_5_2DE)
            
            if (cmplt:boolean(add:int(add:int(var_5_2DE:int, ldc:int(6)), neg:int(var_4_2D8:int)), ldc:int(0))) {
                stack_452_2 = stack_42F_0 = add:byte(expr_413:byte, loadelement:byte(var_3_2DD:byte[], add:int(var_5_2DE:int, ldc:int(6))))
                goto(Label_1087)
            }
            
            Label_1056:
            
            if (cmpne:boolean(and:int(var_0_409:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_409 = and:int(var_0_409:int, ldc:int(-562445155))
                stack_452_2 = stack_42F_0 = add:byte(expr_413:byte, ldc:byte(6))
            }
            
            Label_1087:
            
            if (cmpne:boolean(and:int(var_0_409:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_1056)
            }
            
            var_0_3A2 = and:int(var_0_409:int, ldc:int(-823142523))
            storeelement:byte(var_3_2DD:byte[], var_5_2DE:int, stack_452_2:byte)
            
            if (cmpne:boolean(var_5_2DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_119_0 = stack_11B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_2FD_0 = stack_34E_0 = stack_3C6_0 = stack_413_0 = stack_487_0 = var_3_2DD:byte[]
            goto(Label_0288)
        }
        
        goto(Label_0917)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0346)
        }
        
        if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(256)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(2060604674))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(1024)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-826240158))
        }
        else {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-1054795))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_33C = newarray:byte[](byte.class, expr_A7:int)
                var_5_33D = expr_A7:int
                
                loop {
                    var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1601173185))
                    var_5_33D = add:int(var_5_33D:int, ldc:int(-1))
                    storeelement:byte(var_3_33C:byte[], var_5_33D:int, add:int(shl:int(loadelement:byte(stack_34E_0:byte[], var_5_33D:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_33D:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), ldc:int(2)), xor:int(ldc:int(-27640), ldc:int(-27593)))))
                    
                    if (cmpne:boolean(var_5_33D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_119_0 = stack_11B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_2FD_0 = stack_34E_0 = stack_3C6_0 = stack_413_0 = stack_487_0 = var_3_33C:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-463825148))
            goto(Label_0346)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(65536)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-1969862848))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1316746678))
            expr_E1 = arraylength:int(stack_E1_0:byte[])
            
            if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                var_4_2D8 = expr_E1:int
                var_3_2DD = newarray:byte[](byte.class, expr_E1:int)
                var_5_2DE = expr_E1:int
                goto(Label_0917)
            }
        }
        
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(16384)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1324893490))
            goto(Label_0346)
        }
        
        if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(316659656))
                goto(Label_0112)
            }
            
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-814099230))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_4_2D8 = expr_11B:int
                var_3_2DD = newarray:byte[](byte.class, expr_11B:int)
                var_5_2DE = expr_11B:int
                goto(Label_1013)
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0230)
            }
            
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-1813351268))
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-1255798454))
                goto(Label_0112)
            }
            
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-839920253))
            expr_155 = arraylength:int(stack_155_0:byte[])
            
            if (cmpne:boolean(expr_155:int, ldc:int(0))) {
                var_3_475 = newarray:byte[](byte.class, expr_155:int)
                var_5_476 = expr_155:int
                
                loop {
                    var_0_3A2 = and:int(var_0_3A2:int, ldc:int(-805575525))
                    var_5_476 = add:int(var_5_476:int, ldc:int(-1))
                    storeelement:byte(var_3_475:byte[], var_5_476:int, xor:byte(loadelement:byte(stack_487_0:byte[], var_5_476:int), ldc:byte(63)))
                    
                    if (cmpne:boolean(var_5_476:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_119_0 = stack_11B_0 = stack_153_0 = stack_155_0 = stack_184_0 = stack_2FD_0 = stack_34E_0 = stack_3C6_0 = stack_413_0 = stack_487_0 = var_3_475:byte[]
            }
        }
        
        Label_0346:
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_3A2 = and:int(var_0_3A2:int, ldc:int(1417767222))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A2:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_3A2:int, ldc:int(524288)), ldc:int(0))) {
            var_3_190 = initobject:String(String::<init>, stack_184_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_2D1_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16401), ldc:int(16410)))
            expr_1A2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9035), ldc:int(2059)))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(8626), ldc:int(4166)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(22912), ldc:int(-23425)), xor:int(ldc:int(1285), ldc:int(1283))))
            storeelement:String(expr_1A2:String[], xor:int(ldc:int(10262), ldc:int(10261)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(62), ldc:int(1222)), and:int(ldc:int(93), ldc:int(6159))))
            storeelement:String(expr_1A2:String[], xor:int(ldc:int(140), ldc:int(136)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(259), ldc:int(270)), and:int(ldc:int(20783), ldc:int(47))))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(-24768), ldc:int(8222)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(4141), ldc:int(4098)), xor:int(ldc:int(3119), ldc:int(3182))))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(8205), ldc:int(6405)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(2131), ldc:int(21733)), xor:int(ldc:int(4608), ldc:int(4676))))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(46), ldc:int(22)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(6213), ldc:int(9444)), and:int(ldc:int(89), ldc:int(18538))))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(6380), ldc:int(9)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(1081), ldc:int(1137)), and:int(ldc:int(12490), ldc:int(95))))
            storeelement:String(expr_1A2:String[], xor:int(ldc:int(-16368), ldc:int(-16359)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(16638), ldc:int(10314)), xor:int(ldc:int(-4058), ldc:int(-4028))))
            storeelement:String(expr_1A2:String[], and:int(ldc:int(1146), ldc:int(26890)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(4624), ldc:int(4722)), and:int(ldc:int(115), ldc:int(16887))))
            storeelement:String(expr_1A2:String[], xor:int(ldc:int(43), ldc:int(42)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(115), ldc:int(16499)), xor:int(ldc:int(2416), ldc:int(2549))))
            storeelement:String(expr_1A2:String[], xor:int(ldc:int(8518), ldc:int(8513)), invokevirtual:String[expected:String](String::substring, var_3_190:String, xor:int(ldc:int(5730), ldc:int(5863)), xor:int(ldc:int(-29542), ldc:int(-29677))))
            putstatic:String[](\u446c\u183a\u97e6\ub8be\u3504\u446c::\u9255\u0b8e\u7330\uc31c\u4daf\ub6ab, expr_1A2:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u67d0\uc31c\u494c\uc84e\u3bc9\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_683 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_68E : int
        
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
        var_3_683 = and:int(ldc:int(-1145458063), ldc:int(793892733))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u446c\u183a\u97e6\ub8be\u3504\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
            var_3_683 = and:int(var_3_683:int, ldc:int(1712411377))
            var_5_81 = and:int(ldc:int(-25851), ldc:int(17594))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19001), ldc:int(19000)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_683:int, ldc:int(735138423))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, xor:int(ldc:int(12328), ldc:int(12329)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(17289), ldc:int(9233)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_683 = and:int(var_3_D0:int, ldc:int(-426149895))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(9729), ldc:int(2273)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1027179751))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1155908481))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1010570382))
                        goto(Label_0560)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1650408187))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0560)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1319497710))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1298634853))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1538283300))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2142417486))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2011956074))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1497950209))
                            var_11_E1 = and:int(ldc:int(20120), ldc:int(-20122))
                            goto(Label_1518)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0560:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-382253866))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-649289046))
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1768607462))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-582274473))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1731509384))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1221278492))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(1712919545))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-21259318))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2073244770))
                        goto(Label_1401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-851241921))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1919830180))
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1435017613))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-10891557))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-684379402))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1015354621))
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(673922190))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1837384723))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1147315215))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(1796), ldc:int(1797))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0962:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(24438548))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1739301599))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1516522403))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-969899977))
                            goto(Label_0560)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1815983045))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(863990515))
                        var_11_E1 = and:int(ldc:int(-17678), ldc:int(17677))
                    }
                    
                    Label_1128:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1520494714))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1928420139))
                            goto(Label_0962)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(950778448))
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(792294265))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1401)
                            }
                        }
                    }
                    
                    Label_1239:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-311912453))
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(9395658))
                            goto(Label_0962)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1897404651))
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1770899380))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-583858259))
                            goto(Label_0560)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1520416720))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1060442743))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-495902725))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1518)
                    }
                    
                    Label_1401:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1439331738))
                        goto(Label_1239)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0962)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1913136400))
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_683 = and:int(var_3_683:int, ldc:int(670258163))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1518:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68E = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1529:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1905538318))
                        goto(Label_1401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(32)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1011031757))
                        goto(Label_1239)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1036712197))
                        goto(Label_0962)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-801816168))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(682861447))
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-981273082))
                        goto(Label_0560)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(568134880))
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-411213827))
                        var_17_68E = add:int(var_16_10F:int, and:int(ldc:int(2177), ldc:int(1285)))
                        looporswitchbreak()
                    }
                }
                
                var_3_683 = and:int(var_3_683:int, ldc:int(1861320435))
                
                if (cmple:boolean(var_5_81 = var_17_68E:int, sub:int(var_6_88:int, and:int(ldc:int(4169), ldc:int(17457))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
