public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711 {
    public void \ua61f\u3a62\u71f1\u4f4a\u3d64\u3711(com.mojang.datafixers.schemas.Schema p0) {
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
            invokespecial:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::<init>, this:\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711, p0:Schema, and:int[expected:boolean](ldc:int(10875), ldc:int(-14972)), loadelement:String(getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), and:int(ldc:int(3457), ldc:int(-3974))), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7), loadelement:String(getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), xor:int(ldc:int(-28536), ldc:int(-28535))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.Typed<?> \ufe34\u5f50\uf94d\ubff1\ua068\u7873(com.mojang.datafixers.Typed<?> p0) {
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
            return:Typed<?>(invokevirtual:Typed(Typed::update, p0:Typed<?>, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<?> \uafe7\ub171\u759a\u983f\ud171\u92ff(com.mojang.serialization.Dynamic<?> p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u4c2b\uc9f6\u5d20\u527a\uff55\u8bb0$1(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u600f\ubf56\u97e6\u836c\u3504\ua562$0(com.mojang.serialization.Dynamic p0) {
        var_1_5F : int
        stack_D7_0 : Dynamic [generated]
        
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
            var_1_5F = and:int(ldc:int(-1241194658), ldc:int(-1150370914))
            
            if (logicaland:boolean(invokevirtual:boolean(String::equals, invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), and:int(ldc:int(563), ldc:int(11587)))), loadelement:String(getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), xor:int(ldc:int(-11776), ldc:int(-11772)))), loadelement:String[expected:Object](getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), and:int(ldc:int(389), ldc:int(22055)))), cmpeq:boolean(invokevirtual:double(OptionalDynamic::asDouble, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), xor:int(ldc:int(-32637), ldc:int(-32635)))), ldc:double(0.0)), ldc:double(16.0)))) {
                stack_D7_0 = invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, loadelement:String(getstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258), xor:int(ldc:int(16513), ldc:int(16519))), invokevirtual:Dynamic(Dynamic::createDouble, p0:Dynamic, ldc:double(48.0)))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-277423138))
                stack_D7_0 = p0:Dynamic
            }
            
            return:Dynamic(stack_D7_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_26D_0 : byte[] [generated]
        stack_2C7_0 : byte[] [generated]
        stack_33F_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_200 : byte[]
        var_4_201 : int
        expr_98 : int [generated]
        var_5_250 : int
        var_3_255 : byte[]
        var_4_256 : int
        expr_26D : byte [generated]
        var_0_2DF : int
        expr_2C7 : byte [generated]
        stack_30B_2 : byte [generated]
        stack_2E2_0 : byte [generated]
        expr_C3 : int [generated]
        expr_E6 : int [generated]
        var_3_32E : byte[]
        var_4_32F : int
        var_3_122 : String
        stack_1F7_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(90193903), ldc:int(-707463505))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_26D_0 = stack_2C7_0 = stack_33F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AhgH9/32/3/173SKAvJ/DvoBBoWKZXd7/P3yrWr5gQQHcAJ8fQAABx6Nj/Z93AV9coZ7q/KJgQQHdwL3+oZ/ggeDC+KK9vt99Z71i8vKT0BIwA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_200 = newarray:byte[](byte.class, expr_6D:int)
                var_4_201 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1762413121))
                    var_4_201 = add:int(var_4_201:int, ldc:int(-1))
                    storeelement:byte(var_3_200:byte[], var_4_201:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_201:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_201:int, xor:int(ldc:int(2560), ldc:int(2561)))), ldc:int(3)), xor:int(ldc:int(2056), ldc:int(2071)))))
                    
                    if (cmpne:boolean(var_4_201:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_26D_0 = stack_2C7_0 = stack_33F_0 = var_3_200:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(731443201))
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(794830143))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_250 = expr_98:int
                var_3_255 = newarray:byte[](byte.class, expr_98:int)
                var_4_256 = expr_98:int
                Label_0600:
                
                while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1852830847))
                    var_4_256 = add:int(var_4_256:int, ldc:int(-1))
                    expr_26D = loadelement:byte(stack_26D_0:byte[], var_4_256:int)
                    storeelement:byte(var_3_255:byte[], var_4_256:int, or:int(and:int(shl:int(expr_26D:byte, xor:int(ldc:int(-30717), ldc:int(-30713))), ldc:int(-16)), and:int(shr:int(expr_26D:byte[expected:int], and:int(ldc:int(580), ldc:int(18868))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_256:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_26D_0 = stack_2C7_0 = stack_33F_0 = var_3_255:byte[]
                    goto(Label_0157)
                }
                
                Label_0690:
                
                while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_2DF = and:int(var_0_5F:int, ldc:int(668155519))
                    var_4_256 = add:int(var_4_256:int, ldc:int(-1))
                    expr_2C7 = stack_30B_2 = loadelement(stack_2C7_0, var_4_256)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_256:int, ldc:int(6)), neg:int(var_5_250:int)), ldc:int(0))) {
                        stack_30B_2 = stack_2E2_0 = add:byte(expr_2C7:byte, loadelement:byte(var_3_255:byte[], add:int(var_4_256:int, ldc:int(6))))
                        goto(Label_0754)
                    }
                    
                    Label_0724:
                    
                    if (cmpne:boolean(and:int(var_0_2DF:int, ldc:int(2)), ldc:int(0))) {
                        var_0_2DF = and:int(var_0_2DF:int, ldc:int(-327406161))
                        stack_30B_2 = stack_2E2_0 = add:byte(expr_2C7:byte, ldc:byte(6))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_0_2DF:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_2DF = and:int(var_0_2DF:int, ldc:int(-1793686812))
                        goto(Label_0724)
                    }
                    
                    var_0_5F = and:int(var_0_2DF:int, ldc:int(133572351))
                    storeelement:byte(var_3_255:byte[], var_4_256:int, stack_30B_2:byte)
                    
                    if (cmpne:boolean(var_4_256:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_26D_0 = stack_2C7_0 = stack_33F_0 = var_3_255:byte[]
                    goto(Label_0200)
                }
                
                goto(Label_0600)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(1660921258))
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1825816511))
                    expr_C3 = arraylength:int(stack_C3_0:byte[])
                    
                    if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                        var_5_250 = expr_C3:int
                        var_3_255 = newarray:byte[](byte.class, expr_C3:int)
                        var_4_256 = expr_C3:int
                        goto(Label_0690)
                    }
                }
                
                Label_0200:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-830756945))
                    expr_E6 = arraylength:int(stack_E6_0:byte[])
                    
                    if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                        var_3_32E = newarray:byte[](byte.class, expr_E6:int)
                        var_4_32F = expr_E6:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-1228177809))
                            var_4_32F = add:int(var_4_32F:int, ldc:int(-1))
                            storeelement:byte(var_3_32E:byte[], var_4_32F:int, xor:byte(add:byte(loadelement:byte(stack_33F_0:byte[], var_4_32F:int), ldc:byte(125)), ldc:byte(118)))
                            
                            if (cmpne:boolean(var_4_32F:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_26D_0 = stack_2C7_0 = stack_33F_0 = var_3_32E:byte[]
                    }
                }
                
                Label_0235:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1525386366))
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(2019397568))
            }
            
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1F7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8193), ldc:int(8198)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17359), ldc:int(3127)))
            storeelement:String(expr_134:String[], xor:int(ldc:int(25154), ldc:int(25158)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(9429), ldc:int(-9686)), and:int(ldc:int(2348), ldc:int(-10541))))
            storeelement:String(expr_134:String[], and:int(ldc:int(10498), ldc:int(17931)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(24727), ldc:int(-24728)), and:int(ldc:int(12474), ldc:int(330))))
            storeelement:String(expr_134:String[], and:int(ldc:int(14), ldc:int(1702)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(12443), ldc:int(2062)), and:int(ldc:int(24750), ldc:int(3150))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(97), ldc:int(98)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(10250), ldc:int(10244)), xor:int(ldc:int(2049), ldc:int(2067))))
            storeelement:String(expr_134:String[], and:int(ldc:int(-3634), ldc:int(1585)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(21), ldc:int(7)), and:int(ldc:int(17263), ldc:int(2091))))
            storeelement:String(expr_134:String[], and:int(ldc:int(5), ldc:int(263)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(5141), ldc:int(5182)), xor:int(ldc:int(4166), ldc:int(4217))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(2090), ldc:int(2091)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(829), ldc:int(770)), and:int(ldc:int(209), ldc:int(8273))))
            putstatic:String[](\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711::\u9255\ufe34\ub83f\u98a4\u624e\u8258, expr_134:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u67d0\uc31c\u494c\uc84e\u3bc9\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63C : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CB : int
        var_11_DC : int
        var_14_106 : double
        var_16_10A : int
        var_12_102 : double
        var_17_647 : int
        
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
        var_3_63C = and:int(ldc:int(-605942285), ldc:int(-335540425))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua61f\u3a62\u71f1\u4f4a\u3d64\u3711[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(1534447334))
            var_5_7D = and:int(ldc:int(-10381), ldc:int(10380))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-104), ldc:int(103)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CB = and:int(var_3_63C:int, ldc:int(772213351))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DC = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DC:int, sub:int(var_6_84:int, xor:int(ldc:int(6144), ldc:int(6145)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DC:int, and:int(ldc:int(4619), ldc:int(26817)))), var_7_93:double))) {
                        inc:int(var_11_DC, ldc:int(1))
                    }
                    
                    var_3_63C = and:int(var_3_CB:int, ldc:int(-2032009413))
                    var_14_106 = var_7_93:double
                    var_16_10A = var_11_DC:int
                }
                else {
                    var_11_DC = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(576), ldc:int(577)))
                    var_12_102 = var_14_106 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10A = var_11_DC:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DC:int)
                        var_16_10A = var_11_DC:int
                        var_14_106 = var_12_102:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-282756260))
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1267552286))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(672363482))
                        goto(Label_0537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(688176614))
                        
                        if (cmplt:boolean(var_16_10A:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0537)
                            }
                            
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0382:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1988728963))
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1004401781))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-298936945))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1919842058))
                        var_11_DC = and:int(ldc:int(-16269), ldc:int(9604))
                        goto(Label_1473)
                    }
                    
                    Label_0537:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(783577722))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1189422594))
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(462631386))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2113847366))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1214746369))
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-491112740))
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(33876218))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_106 = var_9_B9:double
                            goto(Label_0811)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1477425119))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1454088028))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(229267066))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(201269366))
                            goto(Label_0537)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-796969299))
                            goto(Label_0382)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1104451530))
                        var_14_106 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_106:double))
                    }
                    
                    Label_0811:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-355127305))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1159886427))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(339148526))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(162179562))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1676183055))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1071072816))
                            goto(Label_0537)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0382)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1759296127))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DC = xor:int(ldc:int(4128), ldc:int(4129))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1505063648))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(595014668))
                        goto(Label_1330)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-506155518))
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1603238546))
                            goto(Label_0537)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1690987485))
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1303365450))
                        var_11_DC = and:int(ldc:int(-7380), ldc:int(7379))
                    }
                    
                    Label_1115:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1565822490))
                            goto(Label_0811)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1884582080))
                            goto(Label_0537)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0382)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-227623813))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                                goto(Label_1330)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1484)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(12087668))
                            goto(Label_1115)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1205280334))
                            goto(Label_0811)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0537)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0382)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1713020454))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_106:double, var_5_7D:int, var_16_10A:int)
                            goto(Label_1473)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1330:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1932579793))
                        goto(Label_1484)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2014018431))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1003718515))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1262188959))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(95270447))
                        loopcontinue()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(-1616020298))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_106:double, ldc:double(0.0))
                    Label_1473:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_647 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1484:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1330)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1931574460))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0811)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-150757989))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(442196809))
                        goto(Label_0537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(540654450))
                        var_17_647 = add:int(var_16_10A:int, xor:int(ldc:int(-31480), ldc:int(-31479)))
                        looporswitchbreak()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(698931461))
                }
                
                var_3_63C = and:int(var_3_63C:int, ldc:int(-1878406658))
                
                if (cmple:boolean(var_5_7D = var_17_647:int, sub:int(var_6_84:int, xor:int(ldc:int(232), ldc:int(233))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
