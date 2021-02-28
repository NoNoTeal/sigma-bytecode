public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102 {
    public void \u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102(com.mojang.datafixers.schemas.Schema p0, boolean p1, java.lang.String p2, java.util.function.Function<java.lang.String, java.lang.String> p3) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102, p0:Schema, p1:boolean)
            putfield:String(\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102::\u8cae\u647c\u7ce1\u5d20\u647c\uc9f6, this:\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102, p2:String)
            putfield:Function<String, String>(\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102::\ub102\ube23\u4daf\u12b2\u9255\u8df4, this:\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102, p3:Function<String, String>)
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
    
    private com.mojang.datafixers.Typed lambda$\u4179\u8308\u183a\u3504\u8350\u5f50$3(com.mojang.datafixers.Typed p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\ud7e8\u71f1\uf9c5\u6b0d\ua3b4\u3a62$2(com.mojang.serialization.Dynamic p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$null$1(com.mojang.serialization.Dynamic p0, com.mojang.datafixers.util.Pair p1) {
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
    
    private com.mojang.serialization.Dynamic lambda$\u12b2\u6435\u6d69\u836c\ub18d\u927d$0(com.mojang.serialization.Dynamic p0, java.lang.String p1, com.mojang.serialization.Dynamic p2) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, checkcast:String(java.lang.String.class, invokeinterface:String(Function<String, String>::apply, getfield:Function<String, String>(\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102::\ub102\ube23\u4daf\u12b2\u9255\u8df4, this:\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102), p1:String))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_18F : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1A1_0 : byte[] [generated]
        stack_1FE_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        var_4_17C : int
        var_3_181 : byte[]
        var_5_182 : int
        expr_1A1 : byte [generated]
        var_0_1F4 : int
        expr_1FE : byte [generated]
        stack_23A_2 : byte [generated]
        stack_219_0 : byte [generated]
        expr_9E : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_25A : byte[]
        var_5_25B : int
        expr_10E : int [generated]
        var_3_2AF : byte[]
        var_5_2B0 : int
        var_3_142 : String
        stack_175_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_18F = and:int(ldc:int(-2005390578), ldc:int(-1552024739))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A1_0 = stack_1FE_0 = stack_26B_0 = stack_2C0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Kg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17C = expr_6B:int
        var_3_181 = newarray:byte[](byte.class, expr_6B:int)
        var_5_182 = expr_6B:int
        Label_0388:
        
        while (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(16)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-444860572))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_1A1 = loadelement:byte(stack_1A1_0:byte[], var_5_182:int)
            storeelement:byte(var_3_181:byte[], var_5_182:int, xor:int(or:int(and:int(shl:int(expr_1A1:byte, xor:int(ldc:int(3096), ldc:int(3100))), ldc:int(-16)), and:int(shr:int(expr_1A1:byte[expected:int], and:int(ldc:int(4101), ldc:int(526))), ldc:int(15))), ldc:int(92)))
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A1_0 = stack_1FE_0 = stack_26B_0 = stack_2C0_0 = var_3_181:byte[]
            goto(Label_0112)
        }
        
        var_0_18F = and:int(var_0_18F:int, ldc:int(2085989725))
        Label_0489:
        
        while (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_18F:int, ldc:int(-346151944))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_1FE = stack_23A_2 = loadelement(stack_1FE_0, var_5_182)
            
            if (cmplt:boolean(add:int(add:int(var_5_182:int, ldc:int(2)), neg:int(var_4_17C:int)), ldc:int(0))) {
                stack_23A_2 = stack_219_0 = add:byte(expr_1FE:byte, loadelement:byte(var_3_181:byte[], add:int(var_5_182:int, ldc:int(2))))
                goto(Label_0553)
            }
            
            Label_0523:
            
            if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(1024)), ldc:int(0))) {
                var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-1118832786))
                stack_23A_2 = stack_219_0 = add:byte(expr_1FE:byte, ldc:byte(2))
            }
            
            Label_0553:
            
            if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0523)
            }
            
            var_0_18F = and:int(var_0_1F4:int, ldc:int(-1367394332))
            storeelement:byte(var_3_181:byte[], var_5_182:int, stack_23A_2:byte)
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A1_0 = stack_1FE_0 = stack_26B_0 = stack_2C0_0 = var_3_181:byte[]
            goto(Label_0163)
        }
        
        goto(Label_0388)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(1519033070))
            goto(Label_0275)
        }
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(128)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(1271097115))
        }
        else {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-1242602533))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_17C = expr_9E:int
                var_3_181 = newarray:byte[](byte.class, expr_9E:int)
                var_5_182 = expr_9E:int
                goto(Label_0489)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(16)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(1343096651))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-1636603862))
        }
        else {
            if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_18F = and:int(var_0_18F:int, ldc:int(-1603292345))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_25A = newarray:byte[](byte.class, expr_D3:int)
                var_5_25B = expr_D3:int
                
                loop {
                    var_0_18F = and:int(var_0_18F:int, ldc:int(-562351124))
                    var_5_25B = add:int(var_5_25B:int, ldc:int(-1))
                    storeelement:byte(var_3_25A:byte[], var_5_25B:int, add:int(shl:int(loadelement:byte(stack_26B_0:byte[], var_5_25B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_25B:int, and:int(ldc:int(23667), ldc:int(9101)))), ldc:int(4)), and:int(ldc:int(15), ldc:int(15)))))
                    
                    if (cmpne:boolean(var_5_25B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A1_0 = stack_1FE_0 = stack_26B_0 = stack_2C0_0 = var_3_25A:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(179767848))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(512)), ldc:int(0))) {
                var_0_18F = and:int(var_0_18F:int, ldc:int(-781094106))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(65536)), ldc:int(0))) {
                var_0_18F = and:int(var_0_18F:int, ldc:int(-1804438698))
                goto(Label_0112)
            }
            
            var_0_18F = and:int(var_0_18F:int, ldc:int(-28613873))
            expr_10E = arraylength:int(stack_10E_0:byte[])
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_2AF = newarray:byte[](byte.class, expr_10E:int)
                var_5_2B0 = expr_10E:int
                
                loop {
                    var_0_18F = and:int(var_0_18F:int, ldc:int(-523682911))
                    var_5_2B0 = add:int(var_5_2B0:int, ldc:int(-1))
                    storeelement:byte(var_3_2AF:byte[], var_5_2B0:int, add:byte(loadelement:byte(stack_2C0_0:byte[], var_5_2B0:int), ldc:byte(20)))
                    
                    if (cmpne:boolean(var_5_2B0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_1A1_0 = stack_1FE_0 = stack_26B_0 = stack_2C0_0 = var_3_2AF:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(16)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-1443473400))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(16)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_175_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(337), ldc:int(33)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4145), ldc:int(3841)))
            storeelement:String(expr_154:String[], and:int(ldc:int(5400), ldc:int(-13593)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-13885), ldc:int(13864)), and:int(ldc:int(-20639), ldc:int(20626))))
            putstatic:String[](\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102::\ucef1\u8413\u494c\u4179\u9af2\u392e, expr_154:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6435\u4c2b\u600f\u4179\u8308\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_682 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C2 : double
        var_3_D4 : int
        var_11_E5 : int
        var_14_10F : double
        var_16_113 : int
        var_12_10B : double
        var_17_68D : int
        
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
        var_3_682 = and:int(ldc:int(1134920756), ldc:int(1224573293))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3d4b\u6b5f\u2dcc\u8258\ubff1\ub102[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
            var_3_682 = and:int(var_3_682:int, ldc:int(1428115190))
        }
        else {
            var_3_682 = and:int(var_3_682:int, ldc:int(-151686084))
            var_5_85 = and:int(ldc:int(25876), ldc:int(-25878))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11477), ldc:int(-11512)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C2 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D4 = and:int(var_3_682:int, ldc:int(-797742931))
                    var_9_C2 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E5 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E5:int, sub:int(var_6_8C:int, and:int(ldc:int(12481), ldc:int(53)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E5:int, xor:int(ldc:int(528), ldc:int(529)))), var_7_9B:double))) {
                        inc:int(var_11_E5, ldc:int(1))
                    }
                    
                    var_3_682 = and:int(var_3_D4:int, ldc:int(338647019))
                    var_14_10F = var_7_9B:double
                    var_16_113 = var_11_E5:int
                }
                else {
                    var_11_E5 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(4233), ldc:int(4232)))
                    var_12_10B = var_14_10F = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_113 = var_11_E5:int, var_6_8C:int)) {
                        var_9_C2 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E5:int)
                        var_16_113 = var_11_E5:int
                        var_14_10F = var_12_10B:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1252648664))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1301551557))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(602691963))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-724877331))
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(418069243))
                    }
                    else {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1649181279))
                        
                        if (cmplt:boolean(var_16_113:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0600)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(966147882))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1896225457))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1277423750))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-2099995878))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1152684407))
                        goto(Label_0731)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1204844456))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(-236994579))
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(1559881204))
                        var_11_E5 = and:int(ldc:int(25830), ldc:int(-28151))
                        goto(Label_1538)
                    }
                    
                    Label_0600:
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1361386733))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1770723814))
                        goto(Label_1404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1780321597))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1992716154))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(-221807918))
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(-587515153))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10F = var_9_C2:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0731:
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1899588660))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(62226895))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(921259201))
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(1672831935))
                        var_14_10F = mul:double(ldc:double(0.5), add:double(var_9_C2:double, var_14_10F:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1501812580))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-114762958))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0731)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(1211242335))
                            goto(Label_0600)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1394123479))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E5 = and:int(ldc:int(2049), ldc:int(21249))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1757993358))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(159564970))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(-823546627))
                        var_11_E5 = and:int(ldc:int(2236), ldc:int(-2237))
                    }
                    
                    Label_1104:
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1500086078))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1120713177))
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(1360050688))
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(634811433))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(-86167915))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(534197791))
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(1210553532))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                                goto(Label_1404)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1907007073))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1652165180))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(1480689328))
                            goto(Label_1104)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(-1300860589))
                            goto(Label_0964)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(-99512954))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(-497871361))
                            goto(Label_0731)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                            var_3_682 = and:int(var_3_682:int, ldc:int(1473551535))
                            loopcontinue()
                        }
                        
                        var_3_682 = and:int(var_3_682:int, ldc:int(703946347))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10F:double, var_5_85:int, var_16_113:int)
                        goto(Label_1538)
                    }
                    
                    Label_1404:
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(417948585))
                        goto(Label_1549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1388421633))
                        goto(Label_0731)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(1273484639))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-2075174726))
                        loopcontinue()
                    }
                    
                    var_3_682 = and:int(var_3_682:int, ldc:int(2108772387))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10F:double, ldc:double(0.0))
                    Label_1538:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1549:
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1404)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-2053400828))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(32)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(183304479))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1285105512))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-132051300))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0731)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(8)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(881879850))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_682:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_682 = and:int(var_3_682:int, ldc:int(-1900042904))
                        var_17_68D = add:int(var_16_113:int, and:int(ldc:int(16401), ldc:int(8199)))
                        looporswitchbreak()
                    }
                }
                
                var_3_682 = and:int(var_3_682:int, ldc:int(1268974944))
                
                if (cmple:boolean(var_5_85 = var_17_68D:int, sub:int(var_6_8C:int, and:int(ldc:int(9649), ldc:int(2573))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_682:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
