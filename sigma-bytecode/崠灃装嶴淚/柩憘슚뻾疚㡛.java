public class \u5d20\u7043\u88c5\u5db4\uf94d.\u67e9\u6198\uc29a\ubefe\u759a\u385b {
    public void \u67e9\u6198\uc29a\ubefe\u759a\u385b(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u67e9\u6198\uc29a\ubefe\u759a\u385b, p0:Schema, p1:boolean)
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
    
    private double \u3776\u760c\u7049\u4c2b\u7bad\u718f(java.lang.String p0) {
        var_2_5F : int
        var_4_71 : double
        expr_7D : double [generated]
        
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
        var_2_5F = and:int(ldc:int(1484756267), ldc:int(1723784491))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(1144247739))
            var_4_71 = add:double(mul:double(ldc:double(0.9), invokestatic:double(Double::parseDouble, p0:String)), ldc:double(0.1))
            var_2_5F = and:int(var_2_5F:int, ldc:int(1592447339))
            expr_7D = div:double(var_4_71:double, ldc:double(2.0))
            var_2_5F = and:int(var_2_5F:int, ldc:int(1642503023))
            return:double(expr_7D:double)
        }
        catch (java.lang.NumberFormatException var_6_88) {
            return:double(ldc:double(0.5))
        }
    }
    
    private com.mojang.datafixers.Typed lambda$\ub83f\u72f1\u3d64\u600f\u946b\u385b$2(com.mojang.datafixers.Typed p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\u16f6\ub83f\u8709\ud171\u7ce1\u8753$0(com.mojang.serialization.Dynamic p0, java.lang.String p1) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, loadelement:String(getstatic:String[](\u67e9\u6198\uc29a\ubefe\u759a\u385b::\u9937\u67d0\u7006\u946b\u62da\u392e), and:int(ldc:int(578), ldc:int(2062))), invokevirtual:Dynamic(Dynamic::createDouble, p0:Dynamic, invokespecial:double(\u67e9\u6198\uc29a\ubefe\u759a\u385b::\u3776\u760c\u7049\u4c2b\u7bad\u718f, this:\u67e9\u6198\uc29a\ubefe\u759a\u385b, p1:String))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_99 : int
        expr_65 : byte[] [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1E5_0 : byte[] [generated]
        stack_23A_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_15A : int
        var_3_15F : byte[]
        var_5_160 : int
        var_0_188 : int
        expr_170 : byte [generated]
        stack_1B4_2 : byte [generated]
        stack_18B_0 : byte [generated]
        var_2_85 : byte[]
        expr_89 : int [generated]
        var_3_1D4 : byte[]
        var_5_1D5 : int
        expr_B5 : int [generated]
        var_3_229 : byte[]
        var_5_22A : int
        expr_23D : byte [generated]
        var_3_EA : String
        stack_153_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_99 = and:int(ldc:int(975495039), ldc:int(-82404357))
            expr_65 = stack_85_0 = stack_87_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1E5_0 = stack_23A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Pg94C4RqhH+D8XqXAoMBjvuCgXKKcwkBfwfsB/x8AAEO/gR7c/wChwKDAY77gnzvBfsIgPkPwkE+O8ZC"))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_15A = expr_6B:int
                var_3_15F = newarray:byte[](byte.class, expr_6B:int)
                var_5_160 = expr_6B:int
                
                loop {
                    var_0_188 = and:int(var_0_99:int, ldc:int(-1093738629))
                    var_5_160 = add:int(var_5_160:int, ldc:int(-1))
                    expr_170 = stack_1B4_2 = loadelement(expr_65, var_5_160)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_160:int, ldc:int(6)), neg:int(var_4_15A:int)), ldc:int(0))) {
                        stack_1B4_2 = stack_18B_0 = add:byte(expr_170:byte, loadelement:byte(var_3_15F:byte[], add:int(var_5_160:int, ldc:int(6))))
                        goto(Label_0411)
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(1067974627))
                        stack_1B4_2 = stack_18B_0 = add:byte(expr_170:byte, ldc:byte(6))
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_0_188:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_188 = and:int(var_0_188:int, ldc:int(1148821243))
                        goto(Label_0381)
                    }
                    
                    var_0_99 = and:int(var_0_188:int, ldc:int(1055316819))
                    storeelement:byte(var_3_15F:byte[], var_5_160:int, stack_1B4_2:byte)
                    
                    if (cmpne:boolean(var_5_160:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1E5_0 = stack_23A_0 = var_3_15F:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_99 = and:int(var_0_99:int, ldc:int(989675419))
                    var_2_85 = stack_85_0:byte[]
                    expr_89 = add:int(arraylength:int(stack_87_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_89:int, ldc:int(0))) {
                        var_3_1D4 = newarray:byte[](byte.class, expr_89:int)
                        var_5_1D5 = expr_89:int
                        
                        loop {
                            var_0_99 = and:int(var_0_99:int, ldc:int(-91440161))
                            var_5_1D5 = add:int(var_5_1D5:int, ldc:int(-1))
                            storeelement:byte(var_3_1D4:byte[], var_5_1D5:int, add:int(shl:int(loadelement:byte(stack_1E5_0:byte[], var_5_1D5:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_85:byte[], add:int(var_5_1D5:int, and:int(ldc:int(2179), ldc:int(29773)))), ldc:int(3)), and:int(ldc:int(1567), ldc:int(16767)))))
                            
                            if (cmpne:boolean(var_5_1D5:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_87_0 = stack_85_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1E5_0 = stack_23A_0 = var_3_1D4:byte[]
                    }
                }
                
                Label_0142:
                
                if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_99 = and:int(var_0_99:int, ldc:int(595018891))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_99 = and:int(var_0_99:int, ldc:int(-1302595019))
                        loopcontinue()
                    }
                    
                    var_0_99 = and:int(var_0_99:int, ldc:int(1044660223))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_3_229 = newarray:byte[](byte.class, expr_B5:int)
                        var_5_22A = expr_B5:int
                        
                        loop {
                            var_0_99 = and:int(var_0_99:int, ldc:int(-1084900445))
                            var_5_22A = add:int(var_5_22A:int, ldc:int(-1))
                            expr_23D = add:byte(loadelement:byte(stack_23A_0:byte[], var_5_22A:int), ldc:byte(40))
                            storeelement:byte(var_3_229:byte[], var_5_22A:int, xor:int(or:int(and:int(shl:int(expr_23D:byte, xor:int(ldc:int(2112), ldc:int(2116))), ldc:int(-16)), and:int(shr:int(expr_23D:byte[expected:int], and:int(ldc:int(2340), ldc:int(4172))), ldc:int(15))), ldc:int(98)))
                            
                            if (cmpne:boolean(var_5_22A:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_87_0 = stack_85_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1E5_0 = stack_23A_0 = var_3_229:byte[]
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_99:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_99 = and:int(var_0_99:int, ldc:int(-1486772563))
                    goto(Label_0142)
                }
                
                if (cmpne:boolean(and:int(var_0_99:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_99 = and:int(var_0_99:int, ldc:int(-585462415))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_153_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(867), ldc:int(19)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(399), ldc:int(3651)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(8342), ldc:int(-14487)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(21664), ldc:int(-21667)), and:int(ldc:int(1051), ldc:int(10523))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(11601), ldc:int(16897)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(10523), ldc:int(607)), xor:int(ldc:int(16389), ldc:int(16419))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(34), ldc:int(29447)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(44), ldc:int(10)), and:int(ldc:int(12347), ldc:int(2363))))
            putstatic:String[](\u67e9\u6198\uc29a\ubefe\u759a\u385b::\u9937\u67d0\u7006\u946b\u62da\u392e, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\ud158\uc2bd\u624e\ud12e\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_6A5 : int
        
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
        var_3_69A = and:int(ldc:int(1640899462), ldc:int(1508864934))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67e9\u6198\uc29a\ubefe\u759a\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(1428578275))
        }
        else {
            var_3_69A = and:int(var_3_69A:int, ldc:int(2008475546))
            var_5_85 = and:int(ldc:int(550), ldc:int(-551))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13296), ldc:int(-29681)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_69A:int, ldc:int(-743556165))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, and:int(ldc:int(193), ldc:int(19213)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, and:int(ldc:int(3489), ldc:int(8721)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_69A = and:int(var_3_DE:int, ldc:int(1118776559))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(5), ldc:int(3585)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(19079813))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1315243700))
                        goto(Label_1413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(616817152))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2072833397))
                    }
                    else {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1998530814))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(495260181))
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(915905315))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(626558262))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1838162791))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-769131269))
                            var_11_EF = and:int(ldc:int(22057), ldc:int(-22074))
                            goto(Label_1568)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2001257344))
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1049122545))
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2117783318))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(944433778))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-2095294526))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-536972125))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0705:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1951852360))
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1286170152))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-759697476))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1826998663))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1368880127))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(349320487))
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1839241334))
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-94063817))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1852376730))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1304188430))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1741447674))
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-934854976))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1768745178))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1356028499))
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1062243666))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = xor:int(ldc:int(8528), ldc:int(8529))
                                goto(Label_1152)
                            }
                        }
                    }
                    
                    Label_1003:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1943491272))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-2059645072))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1424051202))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-674338818))
                        var_11_EF = and:int(ldc:int(-16448), ldc:int(16447))
                    }
                    
                    Label_1152:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-473001725))
                            goto(Label_1003)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1658644223))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-851006702))
                            goto(Label_0705)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-1326746731))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(441892531))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2030511286))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1413)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1152)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(994660474))
                            goto(Label_1003)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1917619684))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(541670852))
                            goto(Label_0705)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(1100363977))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69A = and:int(var_3_69A:int, ldc:int(-891919109))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                            goto(Label_1568)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1413:
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(959874951))
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1472435079))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(686253733))
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1617952878))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1865558729))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(-1097804903))
                        loopcontinue()
                    }
                    
                    var_3_69A = and:int(var_3_69A:int, ldc:int(-197760270))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1568:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A5 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1579:
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(703865385))
                        goto(Label_1413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1541800080))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(2015934703))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0705)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1885844010))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69A = and:int(var_3_69A:int, ldc:int(1525069707))
                        var_17_6A5 = add:int(var_16_11D:int, and:int(ldc:int(4131), ldc:int(2625)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69A = and:int(var_3_69A:int, ldc:int(-199280962))
                
                if (cmple:boolean(var_5_85 = var_17_6A5:int, sub:int(var_6_8C:int, xor:int(ldc:int(513), ldc:int(512))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_69A:int, ldc:int(16)), ldc:int(0))) {
            var_3_69A = and:int(var_3_69A:int, ldc:int(-525967258))
            goto(Label_0106)
        }
    }
}
