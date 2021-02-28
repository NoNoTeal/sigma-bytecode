public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u839e\u983f\u4f4a\u3504\u6ec6\u8753 {
    public void \u839e\u983f\u4f4a\u3504\u6ec6\u8753(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u839e\u983f\u4f4a\u3504\u6ec6\u8753, p0:Schema, p1:boolean)
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
    
    public static com.mojang.serialization.Dynamic<?> \u3bd6\uc31c\u5654\u36d3\u7873\u8308(com.mojang.serialization.Dynamic<?> p0) {
        var_1_5F : int
        var_3_7D : String
        stack_C3_0 : Dynamic [generated]
        
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
            var_1_5F = and:int(ldc:int(-454832223), ldc:int(-492056657))
            var_3_7D = invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\ub32d\ua562\ub18d\u071d\uc238\ub6ab), and:int(ldc:int(4491), ldc:int(8198)))), loadelement:String(getstatic:String[](\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\ub32d\ua562\ub18d\u071d\uc238\ub6ab), and:int(ldc:int(107), ldc:int(2051))))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_3_7D:String))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1024459360))
                stack_C3_0 = invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\ub32d\ua562\ub18d\u071d\uc238\ub6ab), and:int(ldc:int(103), ldc:int(2058))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic<?>, invokestatic:String(ITextComponent$Serializer::toJson, initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, var_3_7D:String))))
            }
            else {
                stack_C3_0 = invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\ub32d\ua562\ub18d\u071d\uc238\ub6ab), and:int(ldc:int(12290), ldc:int(34))))
            }
            
            return:Dynamic<?>(stack_C3_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\u3e75\ud36e\u52d3\u9033\uafe7\u3711$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\uc246\u67e9\u1187\uc7fe\uc2e8\u34df$0(com.mojang.datafixers.Typed p0, com.mojang.datafixers.OpticFinder p1, com.mojang.serialization.Dynamic p2) {
        var_3_5F : int
        var_5_65 : Optional
        stack_A2_0 : Dynamic [generated]
        
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
            var_3_5F = and:int(ldc:int(-629082016), ldc:int(-630194776))
            var_5_65 = invokevirtual:Optional(Typed::getOptional, p0:Typed, p1:OpticFinder)
            
            if (logicaland:boolean(invokevirtual:boolean(Optional<T>::isPresent, var_5_65:Optional<Object>), invokestatic:boolean(Objects::equals, invokevirtual:Object(Optional<Object>::get, var_5_65:Optional<Object>), loadelement:String[expected:Object](getstatic:String[](\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\ub32d\ua562\ub18d\u071d\uc238\ub6ab), and:int(ldc:int(4740), ldc:int(24838)))))) {
                stack_A2_0 = p2:Dynamic
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-293082376))
                stack_A2_0 = invokestatic:Dynamic<?>(\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\u3bd6\uc31c\u5654\u36d3\u7873\u8308, p2:Dynamic)
            }
            
            return:Dynamic(stack_A2_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A8 : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_213_0 : byte[] [generated]
        stack_268_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_188 : int
        var_3_18D : byte[]
        var_5_18E : int
        var_0_1B6 : int
        expr_19E : byte [generated]
        stack_1E2_2 : byte [generated]
        stack_1B9_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_202 : byte[]
        var_5_203 : int
        expr_AD : int [generated]
        var_3_257 : byte[]
        var_5_258 : int
        expr_26E : byte [generated]
        var_3_E2 : String
        stack_181_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
            var_0_A8 = and:int(ldc:int(844232549), ldc:int(335260437))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_213_0 = stack_268_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("LiwcLOwA8ii+Aug05gy+DO4sHCzsAPIpnBTLZAYg/uYi9P66COo6BiAM8AwI+Ars7lYKKpwM/vL+BAr+8v+cBANQDAoWzuem2r0="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_188 = expr_6B:int
                var_3_18D = newarray:byte[](byte.class, expr_6B:int)
                var_5_18E = expr_6B:int
                
                loop {
                    var_0_1B6 = and:int(var_0_A8:int, ldc:int(95747940))
                    var_5_18E = add:int(var_5_18E:int, ldc:int(-1))
                    expr_19E = stack_1E2_2 = loadelement(expr_65, var_5_18E)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_18E:int, ldc:int(3)), neg:int(var_4_188:int)), ldc:int(0))) {
                        stack_1E2_2 = stack_1B9_0 = add:byte(expr_19E:byte, loadelement:byte(var_3_18D:byte[], add:int(var_5_18E:int, ldc:int(3))))
                        goto(Label_0457)
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_0_1B6:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_1B6 = and:int(var_0_1B6:int, ldc:int(1863640772))
                        stack_1E2_2 = stack_1B9_0 = add:byte(expr_19E:byte, ldc:byte(3))
                    }
                    
                    Label_0457:
                    
                    if (cmpne:boolean(and:int(var_0_1B6:int, ldc:int(16)), ldc:int(0))) {
                        var_0_1B6 = and:int(var_0_1B6:int, ldc:int(-711239487))
                        goto(Label_0427)
                    }
                    
                    var_0_A8 = and:int(var_0_1B6:int, ldc:int(-996236500))
                    storeelement:byte(var_3_18D:byte[], var_5_18E:int, stack_1E2_2:byte)
                    
                    if (cmpne:boolean(var_5_18E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_213_0 = stack_268_0 = var_3_18D:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(512)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-97032773))
                }
                else {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-1741489651))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_202 = newarray:byte[](byte.class, expr_91:int)
                        var_5_203 = expr_91:int
                        
                        loop {
                            var_0_A8 = and:int(var_0_A8:int, ldc:int(1683864079))
                            var_5_203 = add:int(var_5_203:int, ldc:int(-1))
                            storeelement:byte(var_3_202:byte[], var_5_203:int, add:int(shl:int(loadelement:byte(stack_213_0:byte[], var_5_203:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_203:int, xor:int(ldc:int(1290), ldc:int(1291)))), ldc:int(5)), xor:int(ldc:int(3113), ldc:int(3118)))))
                            
                            if (cmpne:boolean(var_5_203:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_213_0 = stack_268_0 = var_3_202:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(8)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(14630885))
                    expr_AD = arraylength:int(stack_AD_0:byte[])
                    
                    if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                        var_3_257 = newarray:byte[](byte.class, expr_AD:int)
                        var_5_258 = expr_AD:int
                        
                        loop {
                            var_0_A8 = and:int(var_0_A8:int, ldc:int(-2093456826))
                            var_5_258 = add:int(var_5_258:int, ldc:int(-1))
                            expr_26E = xor:byte(add:byte(loadelement:byte(stack_268_0:byte[], var_5_258:int), ldc:byte(23)), ldc:byte(66))
                            storeelement:byte(var_3_257:byte[], var_5_258:int, or:int(and:int(shl:int(expr_26E:byte, and:int(ldc:int(2197), ldc:int(29220))), ldc:int(-16)), and:int(shr:int(expr_26E:byte[expected:int], and:int(ldc:int(1084), ldc:int(4100))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_258:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_213_0 = stack_268_0 = var_3_257:byte[]
                    }
                }
                
                Label_0178:
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(16)), ldc:int(0))) {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-2110945626))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_A8 = and:int(var_0_A8:int, ldc:int(1920035866))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_181_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(6154), ldc:int(6159)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(277), ldc:int(27653)))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(4865), ldc:int(4866)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-31494), ldc:int(23301)), and:int(ldc:int(-2108), ldc:int(2107))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(12357), ldc:int(12359)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-5260), ldc:int(5259)), xor:int(ldc:int(-23933), ldc:int(-23927))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(2309), ldc:int(2308)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(16651), ldc:int(670)), xor:int(ldc:int(-24059), ldc:int(-24019))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(8210), ldc:int(-8211)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(40), ldc:int(4268)), and:int(ldc:int(16490), ldc:int(431))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(53), ldc:int(1094)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(2106), ldc:int(8362)), xor:int(ldc:int(8219), ldc:int(8274))))
            putstatic:String[](\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\ub32d\ua562\ub18d\u071d\uc238\ub6ab, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u51b2\u7e3f\uff55\u4c04\ubb2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68E : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_699 : int
        
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
        var_3_68E = and:int(ldc:int(1769859794), ldc:int(-42011922))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\u983f\u4f4a\u3504\u6ec6\u8753[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_68E = and:int(var_3_68E:int, ldc:int(-119674193))
            var_5_7F = and:int(ldc:int(-22623), ldc:int(22622))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2362), ldc:int(2361)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_68E:int, ldc:int(2078073851))
                    var_9_BD = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_86:int, xor:int(ldc:int(2193), ldc:int(2192)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(-30720), ldc:int(-30719)))), var_7_95:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_68E = and:int(var_3_CF:int, ldc:int(1826549635))
                    var_14_10A = var_7_95:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), xor:int(ldc:int(3072), ldc:int(3073)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_86:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-922518828))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1810949373))
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1935624460))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1462048236))
                    }
                    else {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2078276075))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-876410021))
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1000845737))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-42632584))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-594237831))
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1622639881))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1778315431))
                        var_11_E0 = and:int(ldc:int(-11350), ldc:int(11344))
                        goto(Label_1555)
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1980540866))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1101381230))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(2097560034))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2038231742))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0687:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1561484798))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1856737024))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1455183739))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-478672330))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1422083687))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(2053110730))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-1994783831))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(155018284))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(625618508))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-570762009))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-109190521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E0 = xor:int(ldc:int(-30687), ldc:int(-30688))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-781890529))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-682520617))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(514521164))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(2067031148))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-4153))
                        var_11_E0 = and:int(ldc:int(21815), ldc:int(-21944))
                    }
                    
                    Label_1109:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-705201561))
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-2030445762))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1299113660))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(966747174))
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1278833818))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(-1892817080))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-371196421))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1392)
                            }
                        }
                    }
                    
                    Label_1250:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(1319233577))
                            goto(Label_1109)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(2093590166))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(250643550))
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(414715763))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68E = and:int(var_3_68E:int, ldc:int(565001888))
                            loopcontinue()
                        }
                        
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-18941265))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_7F:int, var_16_10E:int)
                        goto(Label_1555)
                    }
                    
                    Label_1392:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1566)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1407947562))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-404753843))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-466546780))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2012819090))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-2086547062))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-635553850))
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(250699385))
                        loopcontinue()
                    }
                    
                    var_3_68E = and:int(var_3_68E:int, ldc:int(1809838523))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1555:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_699 = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1566:
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-523412839))
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1311702838))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(1272779634))
                        goto(Label_0687)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-725318753))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68E = and:int(var_3_68E:int, ldc:int(-279125314))
                        var_17_699 = add:int(var_16_10E:int, xor:int(ldc:int(10), ldc:int(11)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68E = and:int(var_3_68E:int, ldc:int(-94569746))
                
                if (cmple:boolean(var_5_7F = var_17_699:int, sub:int(var_6_86:int, xor:int(ldc:int(16385), ldc:int(16384))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_68E:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
