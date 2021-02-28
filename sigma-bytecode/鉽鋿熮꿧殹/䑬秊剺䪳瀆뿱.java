public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u446c\uf995\u527a\u4ab3\u7006\ubff1 {
    public void \u446c\uf995\u527a\u4ab3\u7006\ubff1(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u446c\uf995\u527a\u4ab3\u7006\ubff1, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic<?> \u5fe1\u36d3\u67e9\u5d20\uf94d\u6d99(com.mojang.serialization.Dynamic<?> p0) {
        var_4_72 : Optional
        var_5_8F : Dynamic
        var_6_A7 : Optional
        
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
        var_4_72 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), and:int(ldc:int(-7809), ldc:int(7808)))))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_4_72:Optional))) {
            return:Dynamic<?>(p0:Dynamic<?>)
        }
        
        var_5_8F = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_4_72:Optional<Dynamic>))
        var_6_A7 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, var_5_8F:Dynamic, loadelement:String(getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), and:int(ldc:int(18437), ldc:int(4353))))))
        
        if (invokevirtual:boolean(Optional::isPresent, var_6_A7:Optional)) {
            var_5_8F = invokevirtual:Dynamic(Dynamic::set, var_5_8F:Dynamic, loadelement:String(getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), xor:int(ldc:int(2112), ldc:int(2113))), invokevirtual:Dynamic(Dynamic::createString, var_5_8F:Dynamic, invokevirtual:String(String::replace, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_6_A7:Optional<String>)), loadelement:String[expected:CharSequence](getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), xor:int(ldc:int(-32127), ldc:int(-32125))), loadelement:String[expected:CharSequence](getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), and:int(ldc:int(4227), ldc:int(26143))))))
        }
        
        return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), and:int(ldc:int(25298), ldc:int(-25307))), var_5_8F:Dynamic))
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
    
    private com.mojang.datafixers.Typed lambda$\u3c25\ucef1\u3504\u8350\u6ec6\u61a4$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
        var_6_68 : Optional
        var_7_A7 : Optional
        var_8_C0 : Typed
        
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
            var_6_68 = invokevirtual:Optional(Typed::getOptional, p2:Typed, p0:OpticFinder)
            
            if (invokevirtual:boolean(Optional::isPresent, var_6_68:Optional)) {
                if (invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_6_68:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c), xor:int(ldc:int(16), ldc:int(23))))) {
                    var_7_A7 = invokevirtual:Optional(Typed::getOptionalTyped, p2:Typed, p1:OpticFinder)
                    
                    if (invokevirtual:boolean(Optional::isPresent, var_7_A7:Optional)) {
                        var_8_C0 = checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_7_A7:Optional<Typed>))
                        return:Typed(invokevirtual:Typed(Typed::set, p2:Typed, p1:OpticFinder, invokevirtual:Typed(Typed::set, var_8_C0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokespecial:Dynamic<?>(\u446c\uf995\u527a\u4ab3\u7006\ubff1::\u5fe1\u36d3\u67e9\u5d20\uf94d\u6d99, this:\u446c\uf995\u527a\u4ab3\u7006\ubff1, checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object(Typed::get, var_8_C0:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))))))
                    }
                }
            }
            
            return:Typed(p2:Typed)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E4 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_1F7_0 : byte[] [generated]
        stack_28F_0 : byte[] [generated]
        stack_2E6_0 : byte[] [generated]
        var_4_1D1 : int
        var_3_1D6 : byte[]
        var_5_1D7 : int
        var_0_211 : int
        expr_1F7 : byte [generated]
        stack_249_2 : byte [generated]
        stack_21D_0 : byte [generated]
        expr_28F : byte [generated]
        expr_8F : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_2D4 : byte[]
        var_5_2D5 : int
        var_3_DA : String
        stack_1CA_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
        var_0_1E4 = and:int(ldc:int(1951947894), ldc:int(1039514994))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_1F7_0 = stack_28F_0 = stack_2E6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("SmAYIJ4/thC4UAKJWFDoCAjAIqDwKF4o0GDImKpYiLgAQEiIqAYeKCDg4HJKYBggnj+2ELhQAolYUOgICMAioPAoXljQSEDQKiiQ0IgIyIigBm+I+AjfStl4CIAhr7gAAHgAeCAAkEiQqCBRINhwUSA3qQiQ2Oh4V9BwoPAor5iwQHCAKWi4OMgAoIgAwJWYIBi4gLM=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D1 = expr_6B:int
        var_3_1D6 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1D7 = expr_6B:int
        Label_0473:
        
        while (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_211 = and:int(var_0_1E4:int, ldc:int(-151421441))
            var_5_1D7 = add:int(var_5_1D7:int, ldc:int(-1))
            expr_1F7 = stack_249_2 = loadelement(stack_1F7_0, var_5_1D7)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D7:int, ldc:int(6)), neg:int(var_4_1D1:int)), ldc:int(0))) {
                stack_249_2 = stack_21D_0 = add:byte(expr_1F7:byte, loadelement:byte(var_3_1D6:byte[], add:int(var_5_1D7:int, ldc:int(6))))
                goto(Label_0557)
            }
            
            Label_0516:
            
            if (cmpne:boolean(and:int(var_0_211:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_211 = and:int(var_0_211:int, ldc:int(581356273))
            }
            else {
                var_0_211 = and:int(var_0_211:int, ldc:int(1040097151))
                stack_249_2 = stack_21D_0 = add:byte(expr_1F7:byte, ldc:byte(6))
            }
            
            Label_0557:
            
            if (cmpne:boolean(and:int(var_0_211:int, ldc:int(131072)), ldc:int(0))) {
                var_0_211 = and:int(var_0_211:int, ldc:int(-337200573))
                goto(Label_0516)
            }
            
            var_0_1E4 = and:int(var_0_211:int, ldc:int(-1313440262))
            storeelement:byte(var_3_1D6:byte[], var_5_1D7:int, stack_249_2:byte)
            
            if (cmpne:boolean(var_5_1D7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_1F7_0 = stack_28F_0 = stack_2E6_0 = var_3_1D6:byte[]
            goto(Label_0112)
        }
        
        var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-879886895))
        Label_0623:
        
        while (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(16)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1134813445))
            var_5_1D7 = add:int(var_5_1D7:int, ldc:int(-1))
            expr_28F = loadelement:byte(stack_28F_0:byte[], var_5_1D7:int)
            storeelement:byte(var_3_1D6:byte[], var_5_1D7:int, xor:int(add:int(or:int(and:int(shl:int(expr_28F:byte, and:int(ldc:int(8838), ldc:int(1365))), ldc:int(-16)), and:int(shr:int(expr_28F:byte[expected:int], xor:int(ldc:int(2096), ldc:int(2100))), ldc:int(15))), ldc:int(36)), ldc:int(63)))
            
            if (cmpne:boolean(var_5_1D7:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_1F7_0 = stack_28F_0 = stack_2E6_0 = var_3_1D6:byte[]
            goto(Label_0148)
        }
        
        var_0_1E4 = and:int(var_0_1E4:int, ldc:int(66271139))
        goto(Label_0473)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1874832043))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(953728507))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_1D1 = expr_8F:int
                var_3_1D6 = newarray:byte[](byte.class, expr_8F:int)
                var_5_1D7 = expr_8F:int
                goto(Label_0623)
            }
        }
        
        Label_0148:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-453732923))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1962515579))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_2D4 = newarray:byte[](byte.class, expr_B5:int)
                var_5_2D5 = expr_B5:int
                
                loop {
                    var_0_1E4 = and:int(var_0_1E4:int, ldc:int(2029018495))
                    var_5_2D5 = add:int(var_5_2D5:int, ldc:int(-1))
                    storeelement:byte(var_3_2D4:byte[], var_5_2D5:int, add:int(shl:int(loadelement:byte(stack_2E6_0:byte[], var_5_2D5:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_2D5:int, and:int(ldc:int(32513), ldc:int(41)))), ldc:int(7)), and:int(ldc:int(597), ldc:int(8227)))))
                    
                    if (cmpne:boolean(var_5_2D5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B1_0 = stack_B3_0 = stack_CE_0 = stack_1F7_0 = stack_28F_0 = stack_2E6_0 = var_3_2D4:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1CA_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10506), ldc:int(17036)))
            expr_EC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20869), ldc:int(20877)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(26674), ldc:int(4162)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(4832), ldc:int(-5858)), and:int(ldc:int(46), ldc:int(573))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(1547), ldc:int(18611)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(46), ldc:int(188)), and:int(ldc:int(88), ldc:int(636))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(6513), ldc:int(16391)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(8296), ldc:int(8240)), xor:int(ldc:int(24596), ldc:int(24648))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(39), ldc:int(33)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(8317), ldc:int(8225)), and:int(ldc:int(2430), ldc:int(4850))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(-26784), ldc:int(26650)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(4210), ldc:int(17138)), xor:int(ldc:int(69), ldc:int(60))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(-16359), ldc:int(-16355)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(268), ldc:int(373)), xor:int(ldc:int(16525), ldc:int(16630))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(9479), ldc:int(519)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(8222), ldc:int(8293)), and:int(ldc:int(4765), ldc:int(25809))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(3597), ldc:int(8327)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(18), ldc:int(131)), xor:int(ldc:int(17019), ldc:int(17135))))
            putstatic:String[](\u446c\uf995\u527a\u4ab3\u7006\ubff1::\uc238\ud523\u61a4\u71f1\u624e\u760c, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u7c6b\u7d52\u8753\u624e\u3c25\u4179(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_657 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_662 : int
        
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
        var_3_657 = and:int(ldc:int(-104583047), ldc:int(-214109573))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u446c\uf995\u527a\u4ab3\u7006\ubff1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(-1534709156))
            var_5_81 = and:int(ldc:int(6018), ldc:int(-6019))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5081), ldc:int(-15324)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_657:int, ldc:int(-756138032))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, and:int(ldc:int(18595), ldc:int(8261)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(1553), ldc:int(3)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_657 = and:int(var_3_D0:int, ldc:int(-617137543))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16512), ldc:int(16513)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(553839435))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-299137822))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-5856234))
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(709485084))
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(161464069))
                    }
                    else {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-67633837))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0564)
                            }
                            
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1780477299))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-662949457))
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1874992790))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1274167297))
                            var_11_E1 = and:int(ldc:int(-3055), ldc:int(2798))
                            goto(Label_1483)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0564:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-525260928))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2018061950))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1479366211))
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1360056231))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1847210107))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1762759667))
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-148933539))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0792:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2135028243))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1322405719))
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1157563005))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-743786818))
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1174809965))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1586138260))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1035995434))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = xor:int(ldc:int(8528), ldc:int(8529))
                                goto(Label_1071)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(53159380))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1795978278))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1452871586))
                        var_11_E1 = and:int(ldc:int(17099), ldc:int(-21196))
                    }
                    
                    Label_1071:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-660537473))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1209715252))
                            goto(Label_0932)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-981075978))
                            goto(Label_0792)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(586490877))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(633339417))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-152568079))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1346)
                            }
                        }
                    }
                    
                    Label_1203:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1157659391))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(63319595))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1071)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1661310237))
                            goto(Label_0932)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-968893321))
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0564)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(698389007))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-2082032516))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1483)
                    }
                    
                    Label_1346:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(256)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-88046636))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1461827709))
                        goto(Label_0564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2087938011))
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(364910352))
                        loopcontinue()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-41566858))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1483:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_662 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1494:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1187172919))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1262934866))
                        goto(Label_1203)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1071)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1321676569))
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-638735748))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(595807000))
                        goto(Label_0564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-856611042))
                        goto(Label_0407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-626592265))
                        var_17_662 = add:int(var_16_10F:int, xor:int(ldc:int(768), ldc:int(769)))
                        looporswitchbreak()
                    }
                }
                
                var_3_657 = and:int(var_3_657:int, ldc:int(-294192803))
                
                if (cmple:boolean(var_5_81 = var_17_662:int, sub:int(var_6_88:int, xor:int(ldc:int(2052), ldc:int(2053))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
