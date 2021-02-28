public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u3504\u4cd9\u36d3\uc229\ua3b4\u624e {
    public void \u3504\u4cd9\u36d3\uc229\ua3b4\u624e(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u3504\u4cd9\u36d3\uc229\ua3b4\u624e, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u392e\uae87\u7006\u72f1\uff55\ud217$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
        var_5_65 : Optional
        var_6_A7 : Dynamic
        var_7_AE : Typed
        var_8_BB : Dynamic
        
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
        var_5_65 = invokevirtual:Optional(Typed::getOptional, p2:Typed, p0:OpticFinder)
        
        if (logicaland:boolean(invokevirtual:boolean(Optional<T>::isPresent, var_5_65:Optional<Pair>), invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_5_65:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\u3504\u4cd9\u36d3\uc229\ua3b4\u624e::\ub1b9\u9255\u8c8a\u4975\u927d\ucef1), and:int(ldc:int(19), ldc:int(4611)))))) {
            var_6_A7 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p2:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
            var_7_AE = invokevirtual:Typed(Typed::getOrCreateTyped, p2:Typed, p1:OpticFinder)
            var_8_BB = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, var_7_AE:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
            return:Typed(invokevirtual:Typed(Typed::set, p2:Typed, p1:OpticFinder, invokevirtual:Typed(Typed::set, var_7_AE:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokevirtual:Dynamic(Dynamic::set, var_8_BB:Dynamic, loadelement:String(getstatic:String[](\u3504\u4cd9\u36d3\uc229\ua3b4\u624e::\ub1b9\u9255\u8c8a\u4975\u927d\ucef1), xor:int(ldc:int(-7680), ldc:int(-7676))), invokevirtual:Dynamic(Dynamic::createInt, var_8_BB:Dynamic, invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_6_A7:Dynamic, loadelement:String(getstatic:String[](\u3504\u4cd9\u36d3\uc229\ua3b4\u624e::\ub1b9\u9255\u8c8a\u4975\u927d\ucef1), and:int(ldc:int(20551), ldc:int(11317)))), and:int(ldc:int(24932), ldc:int(-29029))))))))
        }
        
        return:Typed(p2:Typed)
    }
    
    static {
        var_0_216 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_228_0 : byte[] [generated]
        stack_2B7_0 : byte[] [generated]
        stack_2F5_0 : byte[] [generated]
        stack_34B_0 : byte[] [generated]
        var_4_203 : int
        var_3_208 : byte[]
        var_5_209 : int
        var_0_240 : int
        expr_228 : byte [generated]
        stack_274_2 : byte [generated]
        stack_24B_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_2E3 : byte[]
        var_5_2E4 : int
        expr_FE : int [generated]
        var_3_339 : byte[]
        var_5_33A : int
        expr_34B : byte [generated]
        var_3_142 : String
        stack_1FC_0 : String[] [generated]
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
        var_0_216 = and:int(ldc:int(253874485), ldc:int(1136288117))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_228_0 = stack_2B7_0 = stack_2F5_0 = stack_34B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("dOzg0PhUGEAQ9Bis2NQ83HT0kFykTGQcnLRA2CD4+DAEKKOs7AzoBFkkMDQwvNQg62RouKR8aQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_203 = expr_6B:int
        var_3_208 = newarray:byte[](byte.class, expr_6B:int)
        var_5_209 = expr_6B:int
        Label_0523:
        
        while (cmpeq:boolean(and:int(var_0_216:int, ldc:int(512)), ldc:int(0))) {
            var_0_240 = and:int(var_0_216:int, ldc:int(-1952081797))
            var_5_209 = add:int(var_5_209:int, ldc:int(-1))
            expr_228 = stack_274_2 = loadelement(stack_228_0, var_5_209)
            
            if (cmplt:boolean(add:int(add:int(var_5_209:int, ldc:int(6)), neg:int(var_4_203:int)), ldc:int(0))) {
                stack_274_2 = stack_24B_0 = add:byte(expr_228:byte, loadelement:byte(var_3_208:byte[], add:int(var_5_209:int, ldc:int(6))))
                goto(Label_0603)
            }
            
            Label_0565:
            
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(131072)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(637711756))
            }
            else {
                var_0_240 = and:int(var_0_240:int, ldc:int(-1342967143))
                stack_274_2 = stack_24B_0 = add:byte(expr_228:byte, ldc:byte(6))
            }
            
            Label_0603:
            
            if (cmpne:boolean(and:int(var_0_240:int, ldc:int(2)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(-865854860))
                goto(Label_0565)
            }
            
            var_0_216 = and:int(var_0_240:int, ldc:int(-1414856065))
            storeelement:byte(var_3_208:byte[], var_5_209:int, stack_274_2:byte)
            
            if (cmpne:boolean(var_5_209:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_228_0 = stack_2B7_0 = stack_2F5_0 = stack_34B_0 = var_3_208:byte[]
            goto(Label_0112)
        }
        
        var_0_216 = and:int(var_0_216:int, ldc:int(-616391547))
        Label_0666:
        
        while (cmpeq:boolean(and:int(var_0_216:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(1403490453))
            var_5_209 = add:int(var_5_209:int, ldc:int(-1))
            storeelement:byte(var_3_208:byte[], var_5_209:int, add:byte(xor:byte(loadelement:byte(stack_2B7_0:byte[], var_5_209:int), ldc:byte(5)), ldc:byte(22)))
            
            if (cmpne:boolean(var_5_209:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_228_0 = stack_2B7_0 = stack_2F5_0 = stack_34B_0 = var_3_208:byte[]
            goto(Label_0163)
        }
        
        var_0_216 = and:int(var_0_216:int, ldc:int(256089317))
        goto(Label_0523)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(1958219550))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(524288)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(-714774302))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(-277484039))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_203 = expr_9E:int
                var_3_208 = newarray:byte[](byte.class, expr_9E:int)
                var_5_209 = expr_9E:int
                goto(Label_0666)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(676361826))
                goto(Label_0112)
            }
            
            var_0_216 = and:int(var_0_216:int, ldc:int(-1687581351))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_2E3 = newarray:byte[](byte.class, expr_CB:int)
                var_5_2E4 = expr_CB:int
                
                loop {
                    var_0_216 = and:int(var_0_216:int, ldc:int(-202392385))
                    var_5_2E4 = add:int(var_5_2E4:int, ldc:int(-1))
                    storeelement:byte(var_3_2E3:byte[], var_5_2E4:int, add:int(shl:int(loadelement:byte(stack_2F5_0:byte[], var_5_2E4:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_2E4:int, xor:int(ldc:int(92), ldc:int(93)))), ldc:int(6)), xor:int(ldc:int(88), ldc:int(91)))))
                    
                    if (cmpne:boolean(var_5_2E4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_228_0 = stack_2B7_0 = stack_2F5_0 = stack_34B_0 = var_3_2E3:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(1)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(-361222418))
        }
        else {
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(1024)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(-983110857))
                goto(Label_0112)
            }
            
            var_0_216 = and:int(var_0_216:int, ldc:int(-1141080449))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_339 = newarray:byte[](byte.class, expr_FE:int)
                var_5_33A = expr_FE:int
                
                loop {
                    var_0_216 = and:int(var_0_216:int, ldc:int(-1624534093))
                    var_5_33A = add:int(var_5_33A:int, ldc:int(-1))
                    expr_34B = loadelement:byte(stack_34B_0:byte[], var_5_33A:int)
                    storeelement:byte(var_3_339:byte[], var_5_33A:int, or:int(and:int(shl:int(expr_34B:byte, and:int(ldc:int(1092), ldc:int(2484))), ldc:int(-16)), and:int(shr:int(expr_34B:byte[expected:int], xor:int(ldc:int(16433), ldc:int(16437))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_33A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_FC_0 = stack_FE_0 = stack_136_0 = stack_228_0 = stack_2B7_0 = stack_2F5_0 = stack_34B_0 = var_3_339:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(512)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(-1594972296))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(64)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(-1120067268))
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_216:int, ldc:int(131072)), ldc:int(0))) {
            var_0_216 = and:int(var_0_216:int, ldc:int(1228969431))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1FC_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(134), ldc:int(12398)))
        expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2080), ldc:int(2086)))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-29694), ldc:int(-29689)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-14070), ldc:int(9953)), xor:int(ldc:int(24709), ldc:int(24707))))
        storeelement:String(expr_154:String[], and:int(ldc:int(3074), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(8460), ldc:int(8458)), and:int(ldc:int(6171), ldc:int(62))))
        storeelement:String(expr_154:String[], and:int(ldc:int(-19192), ldc:int(2673)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(218), ldc:int(6682)), and:int(ldc:int(18652), ldc:int(572))))
        storeelement:String(expr_154:String[], and:int(ldc:int(4260), ldc:int(5)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-31698), ldc:int(-31694)), and:int(ldc:int(8223), ldc:int(4319))))
        storeelement:String(expr_154:String[], and:int(ldc:int(16547), ldc:int(14675)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2049), ldc:int(2078)), and:int(ldc:int(371), ldc:int(12467))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(201), ldc:int(200)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(1033), ldc:int(1082)), and:int(ldc:int(1078), ldc:int(20991))))
        putstatic:String[](\u3504\u4cd9\u36d3\uc229\ua3b4\u624e::\ub1b9\u9255\u8c8a\u4975\u927d\ucef1, expr_154:String[])
    }
    
    public void \u4bc8\uc2bd\u8753\ua3b4\u927d\uceb8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_69A : int
        
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
        var_3_68F = and:int(ldc:int(1580514342), ldc:int(-88244430))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3504\u4cd9\u36d3\uc229\ua3b4\u624e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_68F = and:int(var_3_68F:int, ldc:int(-606160317))
            var_5_81 = and:int(ldc:int(25258), ldc:int(-32428))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18673), ldc:int(-19190)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68F:int, ldc:int(2141157460))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(11272), ldc:int(11273)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(777), ldc:int(776)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68F = and:int(var_3_DA:int, ldc:int(2069167437))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(17026), ldc:int(17027)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1487077549))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1833574604))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1492173905))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-547882148))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0602)
                            }
                            
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(330540221))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1078999006))
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1090224207))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-2107211690))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-420388825))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1972486625))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-2000023221))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-607689431))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1598028597))
                        var_11_EB = and:int(ldc:int(1134), ldc:int(-11375))
                        goto(Label_1564)
                    }
                    
                    Label_0602:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(190506301))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1457534650))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1812173509))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1617978551))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-72024429))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1032858863))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-580307471))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1953249501))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(190593138))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1109036247))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(2147269368))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0862:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-179225065))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-360201320))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1482402369))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1413494893))
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-2018056983))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-20989470))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(4369), ldc:int(1163))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1157352647))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-849670321))
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(296327947))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1739024938))
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1524586681))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-2179911))
                        var_11_EB = and:int(ldc:int(18616), ldc:int(-23484))
                    }
                    
                    Label_1163:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-508102399))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(188889548))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-1251311049))
                            loopcontinue()
                        }
                        
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1607743722))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1419)
                            }
                        }
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(2027831100))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1071583813))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1163)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1867516647))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(2035293531))
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0602)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(1077882188))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68F = and:int(var_3_68F:int, ldc:int(-90947657))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1564)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1419:
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(1445068055))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(718598326))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1833616297))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1639144063))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1139965442))
                        loopcontinue()
                    }
                    
                    var_3_68F = and:int(var_3_68F:int, ldc:int(-11174992))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69A = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1571143321))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(698390325))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0602)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(-1600300671))
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68F = and:int(var_3_68F:int, ldc:int(2062941890))
                        var_17_69A = add:int(var_16_119:int, xor:int(ldc:int(12804), ldc:int(12805)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68F = and:int(var_3_68F:int, ldc:int(1520353200))
                
                if (cmple:boolean(var_5_81 = var_17_69A:int, sub:int(var_6_88:int, and:int(ldc:int(6529), ldc:int(16403))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_68F:int, ldc:int(16384)), ldc:int(0))) {
            var_3_68F = and:int(var_3_68F:int, ldc:int(-1182811584))
            goto(Label_0108)
        }
    }
}
