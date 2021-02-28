public class \u494c\u4975\ua068\u0c95\uc84e.\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a {
    public void \u718f\ube23\ufe34\u8bb0\ua61f\u8c8a(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic<?> \ubf56\u3711\u74b1\u3d4b\u93a2\u7043(com.mojang.serialization.Dynamic<?> p0) {
        var_2_5F : int
        var_4_72 : Optional
        var_5_8F : Dynamic
        var_6_A7 : Optional
        var_7_CC : Optional
        
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
        var_2_5F = and:int(ldc:int(-1551543734), ldc:int(-58901526))
        var_4_72 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), and:int(ldc:int(-2560), ldc:int(117)))))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_4_72:Optional))) {
            return:Dynamic<?>(p0:Dynamic<?>)
        }
        
        var_5_8F = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_4_72:Optional<Dynamic>))
        var_6_A7 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_5_8F:Dynamic, loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), xor:int(ldc:int(-22526), ldc:int(-22525))))))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_6_A7:Optional))) {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1133134217))
            var_7_CC = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_5_8F:Dynamic, loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), and:int(ldc:int(2), ldc:int(11811))))))
            
            if (invokevirtual:boolean(Optional::isPresent, var_7_CC:Optional)) {
                var_5_8F = invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::set, var_5_8F:Dynamic, loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), and:int(ldc:int(24721), ldc:int(4935))), invokevirtual:Dynamic(Dynamic::createString, var_5_8F:Dynamic, invokestatic:String(ITextComponent$Serializer::toJson, initobject:TranslationTextComponent(TranslationTextComponent::<init>, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_7_CC:Optional<String>)))))), loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), xor:int(ldc:int(5121), ldc:int(5123))))
            }
        }
        else {
            var_5_8F = invokevirtual:Dynamic(Dynamic::set, var_5_8F:Dynamic, loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), and:int(ldc:int(5125), ldc:int(273))), invokevirtual:Dynamic(Dynamic::createString, var_5_8F:Dynamic, invokestatic:String(ITextComponent$Serializer::toJson, initobject:StringTextComponent(StringTextComponent::<init>, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_6_A7:Optional<String>))))))
        }
        
        return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f), and:int(ldc:int(-29638), ldc:int(25537))), var_5_8F:Dynamic))
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
    
    private com.mojang.datafixers.Typed lambda$\u960f\u8753\u40a9\u416d\u6d99\u16f6$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private com.mojang.datafixers.Typed lambda$\u5fe1\u51fa\u52d3\uc2bd\ud171\u446c$0(com.mojang.datafixers.Typed p0) {
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
            return:Typed(invokevirtual:Typed(Typed::update, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:(L\u494c\u4975\ua068\u0c95\uc84e/\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a;)Ljava/util/function/Function;, this:\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19B : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_1AD_0 : byte[] [generated]
        stack_215_0 : byte[] [generated]
        stack_292_0 : byte[] [generated]
        var_4_188 : int
        var_3_18D : byte[]
        var_5_18E : int
        expr_1B0 : byte [generated]
        var_0_22D : int
        expr_215 : byte [generated]
        stack_261_2 : byte [generated]
        stack_238_0 : byte [generated]
        expr_8F : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_281 : byte[]
        var_5_282 : int
        var_3_E2 : String
        stack_181_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_19B = and:int(ldc:int(-630850671), ldc:int(-5991550))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_1AD_0 = stack_215_0 = stack_292_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ATf6/sG3g7Z7vPh5ucFAQzr3vIFBBPsFwvuCeHd5vPcFPzz6A8UBAHo+gX0LQkB+QjM=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_188 = expr_6B:int
        var_3_18D = newarray:byte[](byte.class, expr_6B:int)
        var_5_18E = expr_6B:int
        Label_0400:
        
        while (cmpne:boolean(and:int(var_0_19B:int, ldc:int(262144)), ldc:int(0))) {
            var_0_19B = and:int(var_0_19B:int, ldc:int(2114296805))
            var_5_18E = add:int(var_5_18E:int, ldc:int(-1))
            expr_1B0 = add:byte(loadelement:byte(stack_1AD_0:byte[], var_5_18E:int), ldc:byte(10))
            storeelement:byte(var_3_18D:byte[], var_5_18E:int, xor:int(or:int(and:int(shl:int(expr_1B0:byte, and:int(ldc:int(4100), ldc:int(68))), ldc:int(-16)), and:int(shr:int(expr_1B0:byte[expected:int], and:int(ldc:int(2692), ldc:int(8276))), ldc:int(15))), ldc:int(68)))
            
            if (cmpne:boolean(var_5_18E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_1AD_0 = stack_215_0 = stack_292_0 = var_3_18D:byte[]
            goto(Label_0112)
        }
        
        var_0_19B = and:int(var_0_19B:int, ldc:int(-1049415506))
        Label_0504:
        
        while (cmpeq:boolean(and:int(var_0_19B:int, ldc:int(131072)), ldc:int(0))) {
            var_0_22D = and:int(var_0_19B:int, ldc:int(1492957480))
            var_5_18E = add:int(var_5_18E:int, ldc:int(-1))
            expr_215 = stack_261_2 = loadelement(stack_215_0, var_5_18E)
            
            if (cmplt:boolean(add:int(add:int(var_5_18E:int, ldc:int(5)), neg:int(var_4_188:int)), ldc:int(0))) {
                stack_261_2 = stack_238_0 = add:byte(expr_215:byte, loadelement:byte(var_3_18D:byte[], add:int(var_5_18E:int, ldc:int(5))))
                goto(Label_0584)
            }
            
            Label_0546:
            
            if (cmpeq:boolean(and:int(var_0_22D:int, ldc:int(262144)), ldc:int(0))) {
                var_0_22D = and:int(var_0_22D:int, ldc:int(598190742))
            }
            else {
                var_0_22D = and:int(var_0_22D:int, ldc:int(-583151001))
                stack_261_2 = stack_238_0 = add:byte(expr_215:byte, ldc:byte(5))
            }
            
            Label_0584:
            
            if (cmpeq:boolean(and:int(var_0_22D:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_22D = and:int(var_0_22D:int, ldc:int(-1424250743))
                goto(Label_0546)
            }
            
            var_0_19B = and:int(var_0_22D:int, ldc:int(-632972193))
            storeelement:byte(var_3_18D:byte[], var_5_18E:int, stack_261_2:byte)
            
            if (cmpne:boolean(var_5_18E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_1AD_0 = stack_215_0 = stack_292_0 = var_3_18D:byte[]
            goto(Label_0148)
        }
        
        var_0_19B = and:int(var_0_19B:int, ldc:int(1012576189))
        goto(Label_0400)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_19B:int, ldc:int(4)), ldc:int(0))) {
            var_0_19B = and:int(var_0_19B:int, ldc:int(1018358378))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_19B:int, ldc:int(64)), ldc:int(0))) {
            var_0_19B = and:int(var_0_19B:int, ldc:int(1565523367))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_188 = expr_8F:int
                var_3_18D = newarray:byte[](byte.class, expr_8F:int)
                var_5_18E = expr_8F:int
                goto(Label_0504)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_19B:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_19B:int, ldc:int(2)), ldc:int(0))) {
                var_0_19B = and:int(var_0_19B:int, ldc:int(-190513454))
                goto(Label_0112)
            }
            
            var_0_19B = and:int(var_0_19B:int, ldc:int(2023612064))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_281 = newarray:byte[](byte.class, expr_B5:int)
                var_5_282 = expr_B5:int
                
                loop {
                    var_0_19B = and:int(var_0_19B:int, ldc:int(-628780523))
                    var_5_282 = add:int(var_5_282:int, ldc:int(-1))
                    storeelement:byte(var_3_281:byte[], var_5_282:int, add:int(shl:int(loadelement:byte(stack_292_0:byte[], var_5_282:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_282:int, xor:int(ldc:int(16416), ldc:int(16417)))), ldc:int(2)), xor:int(ldc:int(8452), ldc:int(8507)))))
                    
                    if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_D6_0 = stack_1AD_0 = stack_215_0 = stack_292_0 = var_3_281:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_19B:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_19B = and:int(var_0_19B:int, ldc:int(-859818753))
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_19B:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_181_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8281), ldc:int(8284)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8965), ldc:int(1199)))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(4227), ldc:int(4231)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-29493), ldc:int(29492)), and:int(ldc:int(4478), ldc:int(2716))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(5377), ldc:int(5379)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(1214), ldc:int(2588)), xor:int(ldc:int(277), ldc:int(310))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(6660), ldc:int(6661)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(22055), ldc:int(2347)), xor:int(ldc:int(738), ldc:int(709))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-19265), ldc:int(19264)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(2151), ldc:int(12583)), xor:int(ldc:int(-20206), ldc:int(-20164))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(1287), ldc:int(6195)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-31703), ldc:int(-31737)), xor:int(ldc:int(25741), ldc:int(25788))))
            putstatic:String[](\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a::\ud12e\uc29a\u385b\ud171\u4179\uc87f, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u392e\u69d9\u8389\ucb79\u64f2\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_7E : int
        var_6_85 : int
        var_7_94 : double
        var_9_BC : double
        var_3_CE : int
        var_11_DF : int
        var_14_109 : double
        var_16_10D : int
        var_12_105 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(-70554325), ldc:int(1399812030))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\ube23\ufe34\u8bb0\ua61f\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0168)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1815118578))
            var_5_7E = and:int(ldc:int(24857), ldc:int(-24858))
            var_6_85 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_94 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26116), ldc:int(-26117)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CE = and:int(var_3_67B:int, ldc:int(904900375))
                    var_9_BC = sub:double(var_7_94:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DF = var_5_7E:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DF:int, sub:int(var_6_85:int, xor:int(ldc:int(-15616), ldc:int(-15615)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DF:int, xor:int(ldc:int(80), ldc:int(81)))), var_7_94:double))) {
                        inc:int(var_11_DF, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_CE:int, ldc:int(503021506))
                    var_14_109 = var_7_94:double
                    var_16_10D = var_11_DF:int
                }
                else {
                    var_11_DF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7E:int), xor:int(ldc:int(-32686), ldc:int(-32685)))
                    var_12_105 = var_14_109 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E)
                    
                    if (cmplt:boolean(var_16_10D = var_11_DF:int, var_6_85:int)) {
                        var_9_BC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DF:int)
                        var_16_10D = var_11_DF:int
                        var_14_109 = var_12_105:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(863887029))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1286723044))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(934902314))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-735337811))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1671397732))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1214127295))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1076134021))
                        
                        if (cmplt:boolean(var_16_10D:int, var_6_85:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1943764503))
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1402369714))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1721820730))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(835448586))
                        var_11_DF = and:int(ldc:int(-22951), ldc:int(22946))
                        goto(Label_1539)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-635268841))
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1631544944))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1567576046))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1070575594))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_109 = var_9_BC:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(688646840))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-504494298))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1391756020))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-167581249))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(113924329))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1936403894))
                        var_14_109 = mul:double(ldc:double(0.5), add:double(var_9_BC:double, var_14_109:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1543454366))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(356919785))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1755349714))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E:int), var_7_94:double)) {
                                var_11_DF = xor:int(ldc:int(-32572), ldc:int(-32571))
                                goto(Label_1105)
                            }
                        }
                    }
                    
                    Label_0920:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1143322625))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2021116121))
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1095286066))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(837952873))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1628160192))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(606602569))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1488877937))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(461061502))
                        var_11_DF = and:int(ldc:int(1641), ldc:int(-24172))
                    }
                    
                    Label_1105:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1945835468))
                        goto(Label_1550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-721202373))
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1766972015))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1152493288))
                            goto(Label_0920)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2015771743))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-373762368))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-77598721))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DF:int, ldc:int(0))) {
                                goto(Label_1379)
                            }
                        }
                    }
                    
                    Label_1245:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1105)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(78251740))
                            goto(Label_0920)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(843818019))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1975846732))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1076541368))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1039891871))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_109:double, var_5_7E:int, var_16_10D:int)
                            goto(Label_1539)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1379:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(277697032))
                        goto(Label_1550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(516460893))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(573321509))
                        goto(Label_1105)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(487450326))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(693291145))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1374696775))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-828120600))
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-1243611665))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_109:double, ldc:double(0.0))
                    Label_1539:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_7E:int
                        
                        if (cmpeq:boolean(var_11_DF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1550:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-19717844))
                        goto(Label_1379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1924340472))
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-598061868))
                        goto(Label_1105)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(358313811))
                        var_17_686 = add:int(var_16_10D:int, and:int(ldc:int(109), ldc:int(16385)))
                        looporswitchbreak()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-990724970))
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(1979395962))
                
                if (cmple:boolean(var_5_7E = var_17_686:int, sub:int(var_6_85:int, and:int(ldc:int(17), ldc:int(5345))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0168:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
