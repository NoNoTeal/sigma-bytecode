public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u120d\u4c2b\u7043\u99f7\u4daf\u4179 {
    public void \u120d\u4c2b\u7043\u99f7\u4daf\u4179(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u120d\u4c2b\u7043\u99f7\u4daf\u4179, p0:Schema, p1:boolean)
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
    
    private static java.util.function.Function lambda$\ub102\u839e\u9033\u3711\u93a2\u9255$3(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p1, com.mojang.serialization.DynamicOps p2) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\u8753\u8413\ua6bd\u494c\u385b\u64f2$2(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.serialization.DynamicOps p1, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p2, com.mojang.datafixers.util.Pair p3) {
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
    
    private static java.lang.IllegalStateException lambda$null$1() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u120d\u4c2b\u7043\u99f7\u4daf\u4179::\u7006\u8aa5\u62da\u4975\uc7fe\ubf56), xor:int(ldc:int(10377), ldc:int(10381)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.DataResult lambda$\u8aa5\u69d9\u8258\u6435\u5d20\uc3e3$0(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, java.lang.String p1, com.mojang.serialization.Dynamic p2) {
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
            return:DataResult(invokevirtual:DataResult(Type::read, checkcast:Type(com.mojang.datafixers.types.Type.class, invokeinterface:Type(Map<K, Type>::get, invokevirtual:Map(TaggedChoice$TaggedChoiceType::types, p0:TaggedChoice$TaggedChoiceType), p1:String[expected:Object])), p2:Dynamic))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_273 : int
        expr_6B : int [generated]
        stack_99_0 : byte[] [generated]
        stack_9B_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_FD_0 : byte[] [generated]
        stack_12A_0 : byte[] [generated]
        stack_286_0 : byte[] [generated]
        stack_315_0 : byte[] [generated]
        stack_369_0 : byte[] [generated]
        stack_3BF_0 : byte[] [generated]
        var_4_25E : int
        var_3_263 : byte[]
        var_5_264 : int
        var_0_2A0 : int
        expr_286 : byte [generated]
        stack_2D8_2 : byte [generated]
        stack_2AC_0 : byte [generated]
        expr_318 : byte [generated]
        expr_9B : int [generated]
        var_2_C9 : byte[]
        expr_CD : int [generated]
        var_3_357 : byte[]
        var_5_358 : int
        expr_FD : int [generated]
        var_3_3AD : byte[]
        var_5_3AE : int
        var_3_136 : String
        expr_13E : String[] [generated]
        expr_148 : String[] [generated]
        var_3_20F : String[]
        expr_217 : String[] [generated]
        
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
        var_0_273 = and:int(ldc:int(417892903), ldc:int(1872415925))
        expr_6B = arraylength:int(stack_99_0 = stack_9B_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_12A_0 = stack_286_0 = stack_315_0 = stack_369_0 = stack_3BF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("seBYrXB7CIUYS3jI3Yg7sL1AUyit2Gv46JDYkHjmr/pR6PiA73gB6JDYkHjHeOFwUOioAAA4WJ/QcR+w+eiQ2JB458j56JDYkHh3mDFgSPfQ+eiQ2JB4pzBZwIiIGG8gAeiQ2JB4B9Bp4BDYOCg3oOFgrkNt")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_25E = expr_6B:int
        var_3_263 = newarray:byte[](byte.class, expr_6B:int)
        var_5_264 = expr_6B:int
        Label_0614:
        
        while (cmpeq:boolean(and:int(var_0_273:int, ldc:int(8)), ldc:int(0))) {
            var_0_2A0 = and:int(var_0_273:int, ldc:int(-1917985053))
            var_5_264 = add:int(var_5_264:int, ldc:int(-1))
            expr_286 = stack_2D8_2 = loadelement(stack_286_0, var_5_264)
            
            if (cmplt:boolean(add:int(add:int(var_5_264:int, ldc:int(2)), neg:int(var_4_25E:int)), ldc:int(0))) {
                stack_2D8_2 = stack_2AC_0 = add:byte(expr_286:byte, loadelement:byte(var_3_263:byte[], add:int(var_5_264:int, ldc:int(2))))
                goto(Label_0700)
            }
            
            Label_0659:
            
            if (cmpeq:boolean(and:int(var_0_2A0:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_2A0 = and:int(var_0_2A0:int, ldc:int(324513522))
            }
            else {
                var_0_2A0 = and:int(var_0_2A0:int, ldc:int(-845304653))
                stack_2D8_2 = stack_2AC_0 = add:byte(expr_286:byte, ldc:byte(2))
            }
            
            Label_0700:
            
            if (cmpne:boolean(and:int(var_0_2A0:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_2A0 = and:int(var_0_2A0:int, ldc:int(1291081189))
                goto(Label_0659)
            }
            
            var_0_273 = and:int(var_0_2A0:int, ldc:int(749928175))
            storeelement:byte(var_3_263:byte[], var_5_264:int, stack_2D8_2:byte)
            
            if (cmpne:boolean(var_5_264:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_12A_0 = stack_286_0 = stack_315_0 = stack_369_0 = stack_3BF_0 = var_3_263:byte[]
            goto(Label_0112)
        }
        
        var_0_273 = and:int(var_0_273:int, ldc:int(-1965619184))
        Label_0766:
        
        while (cmpeq:boolean(and:int(var_0_273:int, ldc:int(16)), ldc:int(0))) {
            var_0_273 = and:int(var_0_273:int, ldc:int(246975601))
            var_5_264 = add:int(var_5_264:int, ldc:int(-1))
            expr_318 = xor:byte(loadelement:byte(stack_315_0:byte[], var_5_264:int), ldc:byte(111))
            storeelement:byte(var_3_263:byte[], var_5_264:int, or:int(and:int(shl:int(expr_318:byte, and:int(ldc:int(9422), ldc:int(16405))), ldc:int(-16)), and:int(shr:int(expr_318:byte[expected:int], xor:int(ldc:int(-31456), ldc:int(-31452))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_264:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_12A_0 = stack_286_0 = stack_315_0 = stack_369_0 = stack_3BF_0 = var_3_263:byte[]
            goto(Label_0160)
        }
        
        goto(Label_0614)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0210)
        }
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(1)), ldc:int(0))) {
            var_0_273 = and:int(var_0_273:int, ldc:int(317061951))
        }
        else {
            var_0_273 = and:int(var_0_273:int, ldc:int(-1415788053))
            expr_9B = arraylength:int(stack_9B_0:byte[])
            
            if (cmpne:boolean(expr_9B:int, ldc:int(0))) {
                var_4_25E = expr_9B:int
                var_3_263 = newarray:byte[](byte.class, expr_9B:int)
                var_5_264 = expr_9B:int
                goto(Label_0766)
            }
        }
        
        Label_0160:
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_273 = and:int(var_0_273:int, ldc:int(-1236462544))
            goto(Label_0258)
        }
        
        if (cmpne:boolean(and:int(var_0_273:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_273 = and:int(var_0_273:int, ldc:int(2056755241))
            var_2_C9 = stack_C9_0:byte[]
            expr_CD = add:int(arraylength:int(stack_CB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CD:int, ldc:int(0))) {
                var_3_357 = newarray:byte[](byte.class, expr_CD:int)
                var_5_358 = expr_CD:int
                
                loop {
                    var_0_273 = and:int(var_0_273:int, ldc:int(-1095775827))
                    var_5_358 = add:int(var_5_358:int, ldc:int(-1))
                    storeelement:byte(var_3_357:byte[], var_5_358:int, add:int(shl:int(loadelement:byte(stack_369_0:byte[], var_5_358:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_C9:byte[], add:int(var_5_358:int, and:int(ldc:int(1537), ldc:int(19)))), ldc:int(7)), xor:int(ldc:int(16416), ldc:int(16417)))))
                    
                    if (cmpne:boolean(var_5_358:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_12A_0 = stack_286_0 = stack_315_0 = stack_369_0 = stack_3BF_0 = var_3_357:byte[]
            }
        }
        
        Label_0210:
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0160)
            }
            
            if (cmpne:boolean(and:int(var_0_273:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_273 = and:int(var_0_273:int, ldc:int(1423802220))
                goto(Label_0112)
            }
            
            var_0_273 = and:int(var_0_273:int, ldc:int(-556619227))
            expr_FD = arraylength:int(stack_FD_0:byte[])
            
            if (cmpne:boolean(expr_FD:int, ldc:int(0))) {
                var_3_3AD = newarray:byte[](byte.class, expr_FD:int)
                var_5_3AE = expr_FD:int
                
                loop {
                    var_0_273 = and:int(var_0_273:int, ldc:int(-1915692931))
                    var_5_3AE = add:int(var_5_3AE:int, ldc:int(-1))
                    storeelement:byte(var_3_3AD:byte[], var_5_3AE:int, add:byte(loadelement:byte(stack_3BF_0:byte[], var_5_3AE:int), ldc:byte(33)))
                    
                    if (cmpne:boolean(var_5_3AE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9B_0 = stack_99_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_12A_0 = stack_286_0 = stack_315_0 = stack_369_0 = stack_3BF_0 = var_3_3AD:byte[]
            }
        }
        
        Label_0258:
        
        if (cmpne:boolean(and:int(var_0_273:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0210)
        }
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0160)
        }
        
        if (cmpeq:boolean(and:int(var_0_273:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_273 = and:int(var_0_273:int, ldc:int(1294969764))
            goto(Label_0112)
        }
        
        var_3_136 = initobject:String(String::<init>, stack_12A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_13E = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8311), ldc:int(17543)))
        expr_148 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(215), ldc:int(271)))
        storeelement:String(expr_148:String[], xor:int(ldc:int(2330), ldc:int(2334)), invokevirtual:String[expected:String](String::substring, var_3_136:String, and:int(ldc:int(-17647), ldc:int(16622)), xor:int(ldc:int(-32506), ldc:int(-32474))))
        storeelement:String(expr_148:String[], and:int(ldc:int(11400), ldc:int(-11417)), invokevirtual:String[expected:String](String::substring, var_3_136:String, and:int(ldc:int(19488), ldc:int(32)), and:int(ldc:int(8447), ldc:int(20540))))
        storeelement:String(expr_148:String[], and:int(ldc:int(25479), ldc:int(2097)), invokevirtual:String[expected:String](String::substring, var_3_136:String, xor:int(ldc:int(-20438), ldc:int(-20458)), and:int(ldc:int(6340), ldc:int(884))))
        storeelement:String(expr_13E:String[], and:int(ldc:int(8615), ldc:int(1093)), invokevirtual:String[expected:String](String::substring, var_3_136:String, xor:int(ldc:int(3104), ldc:int(3172)), xor:int(ldc:int(1310), ldc:int(1359))))
        storeelement:String(expr_13E:String[], xor:int(ldc:int(2), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_136:String, xor:int(ldc:int(-32541), ldc:int(-32590)), and:int(ldc:int(1146), ldc:int(2913))))
        storeelement:String(expr_148:String[], and:int(ldc:int(16471), ldc:int(4227)), invokevirtual:String[expected:String](String::substring, var_3_136:String, xor:int(ldc:int(10817), ldc:int(10785)), xor:int(ldc:int(17922), ldc:int(18034))))
        storeelement:String(expr_148:String[], and:int(ldc:int(4354), ldc:int(8195)), invokevirtual:String[expected:String](String::substring, var_3_136:String, and:int(ldc:int(10864), ldc:int(16503)), xor:int(ldc:int(85), ldc:int(33))))
        putstatic:String[](\u120d\u4c2b\u7043\u99f7\u4daf\u4179::\u7006\u8aa5\u62da\u4975\uc7fe\ubf56, expr_148:String[])
        var_3_20F = expr_13E:String[]
        expr_217 = newarray:String[](java.lang.String.class, and:int(ldc:int(23), ldc:int(21571)))
        storeelement:String(expr_217:String[], and:int(ldc:int(2532), ldc:int(-2549)), loadelement:String(getstatic:String[](\u120d\u4c2b\u7043\u99f7\u4daf\u4179::\u7006\u8aa5\u62da\u4975\uc7fe\ubf56), xor:int(ldc:int(641), ldc:int(642))))
        storeelement:String(expr_217:String[], and:int(ldc:int(4131), ldc:int(26637)), loadelement:String[expected:String](var_3_20F:String[], xor:int(ldc:int(-22495), ldc:int(-22492))))
        storeelement:String(expr_217:String[], and:int(ldc:int(3619), ldc:int(12426)), loadelement:String[expected:String](var_3_20F:String[], and:int(ldc:int(25750), ldc:int(838))))
        putstatic:List<String>(\u120d\u4c2b\u7043\u99f7\u4daf\u4179::\u52d3\u5245\u6198\u5db4\u93a2\u8709, invokestatic:ArrayList(Lists::newArrayList, expr_217:String[][expected:Object[]]))
    }
    
    public void \uc31c\u6198\u3dd3\u4975\ud36e\ud158(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(1156219466), ldc:int(-553745750))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u120d\u4c2b\u7043\u99f7\u4daf\u4179[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1155077397))
        }
        else {
            var_3_696 = and:int(var_3_696:int, ldc:int(-570470659))
            var_5_8A = and:int(ldc:int(5267), ldc:int(-13972))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28844), ldc:int(-28846)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_696:int, ldc:int(-989935618))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(8520), ldc:int(8521)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(538), ldc:int(539)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_DA:int, ldc:int(1157521965))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(12361), ldc:int(133)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-814431237))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1794819993))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-541259277))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1206560333))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1660578882))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(22289140))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-805139639))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(687133210))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1428443512))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(785494374))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-285319656))
                        var_11_EB = and:int(ldc:int(-5630), ldc:int(5453))
                        goto(Label_1580)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-60797149))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1304788176))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1613928313))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(76795793))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1584727672))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-49045490))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-588285379))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2146473777))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1759871454))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1145663266))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(745007054))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1677794234))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-420488195))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(145411235))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(274060753))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1419622326))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1571272370))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(438536420))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-37022901))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(258), ldc:int(259))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-187597968))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-330085686))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-974938722))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1656988170))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1042955240))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1626325712))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(2127297102))
                        var_11_EB = and:int(ldc:int(-17006), ldc:int(16997))
                    }
                    
                    Label_1182:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1331590152))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1988396452))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1648612881))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2133674323))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1306483228))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-113398547))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1979639404))
                            goto(Label_1182)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(487675464))
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1596540904))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(675135006))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-94516))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1580)
                    }
                    
                    Label_1452:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(190866865))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1577248168))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1927910278))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-554974472))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1069036219))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1191165627))
                        var_17_6A1 = add:int(var_16_119:int, xor:int(ldc:int(514), ldc:int(515)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-914249402))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(1307241003))
                
                if (cmple:boolean(var_5_8A = var_17_6A1:int, sub:int(var_6_91:int, xor:int(ldc:int(25089), ldc:int(25088))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
