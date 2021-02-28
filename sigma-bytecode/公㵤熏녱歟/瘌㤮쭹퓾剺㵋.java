public class \u516c\u3d64\u718f\ub171\u6b5f.\u760c\u392e\ucb79\ud4fe\u527a\u3d4b {
    public void \u760c\u392e\ucb79\ud4fe\u527a\u3d4b(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u760c\u392e\ucb79\ud4fe\u527a\u3d4b, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u6b0d\u7c6b\u56bd\uc238\u494c\u67e9$2(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static com.mojang.datafixers.Typed lambda$null$1(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\uc84e\u9af2\u4e72\u836c\ucfaf\u927d$0(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic, loadelement:String(getstatic:String[](\u760c\u392e\ucb79\ud4fe\u527a\u3d4b::\u839e\u1833\u47c2\u97b7\u8389\u7043), xor:int(ldc:int(4100), ldc:int(4102)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_20B : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_17C_0 : byte[] [generated]
        stack_22C_0 : byte[] [generated]
        stack_266_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        stack_332_0 : byte[] [generated]
        stack_3AA_0 : byte[] [generated]
        var_4_1F8 : int
        var_3_1FD : byte[]
        var_5_1FE : int
        expr_2D1 : byte [generated]
        var_0_34A : int
        expr_332 : byte [generated]
        stack_376_2 : byte [generated]
        stack_34D_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_255 : byte[]
        var_5_256 : int
        expr_D9 : int [generated]
        expr_10B : int [generated]
        expr_14D : int [generated]
        var_3_399 : byte[]
        var_5_39A : int
        var_3_188 : String
        stack_1F1_0 : String[] [generated]
        expr_19A : String[] [generated]
        
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
        var_0_20B = and:int(ldc:int(-2095509219), ldc:int(-1422274113))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_22C_0 = stack_266_0 = stack_2D1_0 = stack_332_0 = stack_3AA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("iEmCDER/QcMHxgYCUcR/Eoa9w4x9PxOIAsZGx0ee3+WUWg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F8 = expr_6B:int
        var_3_1FD = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FE = expr_6B:int
        Label_0512:
        
        while (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(32)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-469412392))
                goto(Label_0685)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(-1713408197))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, add:byte(loadelement:byte(stack_22C_0:byte[], var_5_1FE:int), ldc:byte(122)))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_22C_0 = stack_266_0 = stack_2D1_0 = stack_332_0 = stack_3AA_0 = var_3_1FD:byte[]
            goto(Label_0112)
        }
        
        var_0_20B = and:int(var_0_20B:int, ldc:int(-1176972495))
        goto(Label_0790)
        Label_0685:
        
        while (cmpne:boolean(and:int(var_0_20B:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-2143992182))
                goto(Label_0512)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(2034227485))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_2D1 = loadelement:byte(stack_2D1_0:byte[], var_5_1FE:int)
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, or:int(and:int(shl:int(expr_2D1:byte, and:int(ldc:int(25093), ldc:int(4100))), ldc:int(-16)), and:int(shr:int(expr_2D1:byte[expected:int], and:int(ldc:int(16804), ldc:int(14341))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_22C_0 = stack_266_0 = stack_2D1_0 = stack_332_0 = stack_3AA_0 = var_3_1FD:byte[]
            goto(Label_0222)
        }
        
        Label_0790:
        
        while (cmpne:boolean(and:int(var_0_20B:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_34A = and:int(var_0_20B:int, ldc:int(1163786685))
            var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
            expr_332 = stack_376_2 = loadelement(stack_332_0, var_5_1FE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FE:int, ldc:int(5)), neg:int(var_4_1F8:int)), ldc:int(0))) {
                stack_376_2 = stack_34D_0 = add:byte(expr_332:byte, loadelement:byte(var_3_1FD:byte[], add:int(var_5_1FE:int, ldc:int(5))))
                goto(Label_0861)
            }
            
            Label_0831:
            
            if (cmpne:boolean(and:int(var_0_34A:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_34A = and:int(var_0_34A:int, ldc:int(-503343205))
                stack_376_2 = stack_34D_0 = add:byte(expr_332:byte, ldc:byte(5))
            }
            
            Label_0861:
            
            if (cmpeq:boolean(and:int(var_0_34A:int, ldc:int(4096)), ldc:int(0))) {
                var_0_34A = and:int(var_0_34A:int, ldc:int(2051971425))
                goto(Label_0831)
            }
            
            var_0_20B = and:int(var_0_34A:int, ldc:int(-1889946657))
            storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, stack_376_2:byte)
            
            if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_22C_0 = stack_266_0 = stack_2D1_0 = stack_332_0 = stack_3AA_0 = var_3_1FD:byte[]
            goto(Label_0272)
        }
        
        goto(Label_0685)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(8)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-1825500400))
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(256)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-343877710))
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(128)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(-642009125))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_255 = newarray:byte[](byte.class, expr_A7:int)
                var_5_256 = expr_A7:int
                
                loop {
                    var_0_20B = and:int(var_0_20B:int, ldc:int(-1679985379))
                    var_5_256 = add:int(var_5_256:int, ldc:int(-1))
                    storeelement:byte(var_3_255:byte[], var_5_256:int, add:int(shl:int(loadelement:byte(stack_266_0:byte[], var_5_256:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_256:int, xor:int(ldc:int(8261), ldc:int(8260)))), ldc:int(2)), xor:int(ldc:int(460), ldc:int(499)))))
                    
                    if (cmpne:boolean(var_5_256:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_22C_0 = stack_266_0 = stack_2D1_0 = stack_332_0 = stack_3AA_0 = var_3_255:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(262144)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-1048912667))
                goto(Label_0112)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(962287515))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_1F8 = expr_D9:int
                var_3_1FD = newarray:byte[](byte.class, expr_D9:int)
                var_5_1FE = expr_D9:int
                goto(Label_0685)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(951194821))
                goto(Label_0112)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(-1923524259))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_4_1F8 = expr_10B:int
                var_3_1FD = newarray:byte[](byte.class, expr_10B:int)
                var_5_1FE = expr_10B:int
                goto(Label_0790)
            }
        }
        
        Label_0272:
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(1051300433))
                goto(Label_0222)
            }
            
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(-911429928))
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_20B = and:int(var_0_20B:int, ldc:int(1389771565))
                goto(Label_0112)
            }
            
            var_0_20B = and:int(var_0_20B:int, ldc:int(1566276379))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_399 = newarray:byte[](byte.class, expr_14D:int)
                var_5_39A = expr_14D:int
                
                loop {
                    var_0_20B = and:int(var_0_20B:int, ldc:int(22803325))
                    var_5_39A = add:int(var_5_39A:int, ldc:int(-1))
                    storeelement:byte(var_3_399:byte[], var_5_39A:int, xor:byte(loadelement:byte(stack_3AA_0:byte[], var_5_39A:int), ldc:byte(14)))
                    
                    if (cmpne:boolean(var_5_39A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_D7_0 = stack_D9_0 = stack_109_0 = stack_10B_0 = stack_14B_0 = stack_14D_0 = stack_17C_0 = stack_22C_0 = stack_266_0 = stack_2D1_0 = stack_332_0 = stack_3AA_0 = var_3_399:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0272)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_20B:int, ldc:int(2)), ldc:int(0))) {
            var_0_20B = and:int(var_0_20B:int, ldc:int(868443250))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_20B:int, ldc:int(64)), ldc:int(0))) {
            var_3_188 = initobject:String(String::<init>, stack_17C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1F1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(27), ldc:int(9095)))
            expr_19A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(35), ldc:int(24595)))
            storeelement:String(expr_19A:String[], and:int(ldc:int(10497), ldc:int(17539)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(-15894), ldc:int(15893)), and:int(ldc:int(9015), ldc:int(2259))))
            storeelement:String(expr_19A:String[], and:int(ldc:int(-4629), ldc:int(4628)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(539), ldc:int(8211)), xor:int(ldc:int(4246), ldc:int(4238))))
            storeelement:String(expr_19A:String[], xor:int(ldc:int(20546), ldc:int(20544)), invokevirtual:String[expected:String](String::substring, var_3_188:String, and:int(ldc:int(280), ldc:int(24604)), and:int(ldc:int(16417), ldc:int(10529))))
            putstatic:String[](\u760c\u392e\ucb79\ud4fe\u527a\u3d4b::\u839e\u1833\u47c2\u97b7\u8389\u7043, expr_19A:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u93a2\u4bc8\u527a\u7d52\u3bd6\u61a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CB : double
        var_3_DD : int
        var_11_EE : int
        var_14_118 : double
        var_16_11C : int
        var_12_114 : double
        var_17_67A : int
        
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
        var_3_66F = and:int(ldc:int(2129102808), ldc:int(1013355313))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u760c\u392e\ucb79\ud4fe\u527a\u3d4b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(-693873713))
        }
        else {
            var_3_66F = and:int(var_3_66F:int, ldc:int(-42214535))
            var_5_85 = and:int(ldc:int(12532), ldc:int(-15869))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14976), ldc:int(-16113)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DD = and:int(var_3_66F:int, ldc:int(-244390478))
                    var_9_CB = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EE = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EE:int, sub:int(var_6_8C:int, xor:int(ldc:int(525), ldc:int(524)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EE:int, and:int(ldc:int(717), ldc:int(18433)))), var_7_9B:double))) {
                        inc:int(var_11_EE, ldc:int(1))
                    }
                    
                    var_3_66F = and:int(var_3_DD:int, ldc:int(1937762809))
                    var_14_118 = var_7_9B:double
                    var_16_11C = var_11_EE:int
                }
                else {
                    var_11_EE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32184), ldc:int(-32183)))
                    var_12_114 = var_14_118 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11C = var_11_EE:int, var_6_8C:int)) {
                        var_9_CB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EE:int)
                        var_16_11C = var_11_EE:int
                        var_14_118 = var_12_114:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-111780221))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1818642622))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1117119524))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1538887625))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2088315244))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(854558079))
                        
                        if (cmplt:boolean(var_16_11C:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1108100995))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1735039243))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-274112901))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-500399552))
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-840455127))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2020323665))
                        var_11_EE = and:int(ldc:int(-30842), ldc:int(10361))
                        goto(Label_1507)
                    }
                    
                    Label_0588:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1223113065))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1979823545))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-864582139))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-926718402))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(530939284))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1191789665))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_118 = var_9_CB:double
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1640606168))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(474413336))
                        goto(Label_1231)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-421007949))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1978636728))
                        var_14_118 = mul:double(ldc:double(0.5), add:double(var_9_CB:double, var_14_118:double))
                    }
                    
                    Label_0832:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-186959173))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1078849865))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(947054975))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EE = and:int(ldc:int(129), ldc:int(1105))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1644066835))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(290068769))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-240042028))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1185292432))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(606638421))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-92548264))
                        var_11_EE = and:int(ldc:int(-12696), ldc:int(8469))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1119735783))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1830741315))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-220088797))
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1913428740))
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(943841532))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(821015504))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                                goto(Label_1355)
                            }
                        }
                    }
                    
                    Label_1231:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-325943161))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-2058476279))
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(657501069))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(838592894))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_118:double, var_5_85:int, var_16_11C:int)
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1355:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1637598425))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-350255369))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2014639921))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(237833834))
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(130294511))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1713281560))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(-1091647719))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_118:double, ldc:double(0.0))
                    Label_1507:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67A = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1001639113))
                        goto(Label_1231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(97438662))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-277367892))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-785585832))
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1243967091))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(888584122))
                        var_17_67A = add:int(var_16_11C:int, xor:int(ldc:int(4992), ldc:int(4993)))
                        looporswitchbreak()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(-239777991))
                }
                
                var_3_66F = and:int(var_3_66F:int, ldc:int(-1292113001))
                
                if (cmple:boolean(var_5_85 = var_17_67A:int, sub:int(var_6_8C:int, xor:int(ldc:int(-23550), ldc:int(-23549))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(256)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(2110824630))
            goto(Label_0106)
        }
    }
}
