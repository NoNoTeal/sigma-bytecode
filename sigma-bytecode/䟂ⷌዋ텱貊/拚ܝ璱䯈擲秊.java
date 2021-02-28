public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u62da\u071d\u74b1\u4bc8\u64f2\uf995 {
    public void \u62da\u071d\u74b1\u4bc8\u64f2\uf995(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u62da\u071d\u74b1\u4bc8\u64f2\uf995, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\uc29a\u494c\ubb2b\u3a62\u0c95\ub1b9$0(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
        var_6_68 : Optional
        var_7_AC : Dynamic
        var_8_B3 : Optional
        var_9_DA : Typed
        var_10_E2 : Optional
        var_11_FB : Typed
        var_12_108 : Dynamic
        var_13_115 : Dynamic
        var_7_16D : Dynamic
        var_14_182 : Optional
        var_15_1D1 : Dynamic
        
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
        var_6_68 = invokevirtual:Optional(Typed::getOptional, p3:Typed, p0:OpticFinder)
        
        if (logicaland:boolean(invokevirtual:boolean(Optional<T>::isPresent, var_6_68:Optional<Pair>), invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getSecond, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, var_6_68:Optional<Pair>))), loadelement:String[expected:Object](getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), xor:int(ldc:int(7185), ldc:int(7189)))))) {
            var_7_AC = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p3:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
            var_8_B3 = invokevirtual:Optional(Typed::getOptionalTyped, p3:Typed, p1:OpticFinder)
            
            if (invokevirtual:boolean(Optional::isPresent, var_8_B3:Optional)) {
                var_9_DA = checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_8_B3:Optional<Typed>))
                var_10_E2 = invokevirtual:Optional(Typed::getOptionalTyped, var_9_DA:Typed, p2:OpticFinder)
                
                if (invokevirtual:boolean(Optional::isPresent, var_10_E2:Optional)) {
                    var_11_FB = checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Typed(Optional<Typed>::get, var_10_E2:Optional<Typed>))
                    var_12_108 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, var_9_DA:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
                    var_13_115 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::getOrCreate, var_11_FB:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
                    
                    if (invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asNumber, invokevirtual:OptionalDynamic(Dynamic::get, var_13_115:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), and:int(ldc:int(4111), ldc:int(9285)))))))) {
                        var_7_16D = invokevirtual:Dynamic(Dynamic::set, var_7_AC:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), xor:int(ldc:int(-24574), ldc:int(-24572))), invokevirtual:Dynamic(Dynamic::createShort, var_7_AC:Dynamic, i2s:short(and:int(invokevirtual:int(OptionalDynamic::asInt, invokevirtual:OptionalDynamic(Dynamic::get, var_13_115:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), xor:int(ldc:int(321), ldc:int(324)))), and:int(ldc:int(-10182), ldc:int(10052))), ldc:int(15)))))
                        var_14_182 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_12_108:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), and:int(ldc:int(5679), ldc:int(2199)))))
                        
                        if (invokevirtual:boolean(Optional::isPresent, var_14_182:Optional)) {
                            var_15_1D1 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_14_182:Optional<Dynamic>))
                            
                            if (invokestatic:boolean(Objects::equals, var_15_1D1:Dynamic[expected:Object], invokevirtual:Dynamic(Dynamic::createMap, var_15_1D1:Dynamic, invokestatic:ImmutableMap(ImmutableMap::of, invokevirtual:Dynamic(Dynamic::createString, var_15_1D1:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), and:int(ldc:int(12574), ldc:int(520)))), invokevirtual:Dynamic(Dynamic::createList, var_15_1D1:Dynamic, invokestatic:Stream<Dynamic>(Stream<T>::of, invokevirtual:Dynamic(Dynamic::createString, var_15_1D1:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), and:int(ldc:int(2057), ldc:int(13)))))))))) {
                                return:Typed(invokevirtual:Typed(Typed::set, p3:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_7_16D:Dynamic[expected:Object]))
                            }
                        }
                        
                        invokevirtual:Dynamic(Dynamic::remove, var_13_115:Dynamic, loadelement:String(getstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85), and:int(ldc:int(11023), ldc:int(229))))
                        return:Typed(invokevirtual:Typed(Typed::set, invokevirtual:Typed(Typed::set, p3:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_7_16D:Dynamic[expected:Object]), p1:OpticFinder, invokevirtual:Typed(Typed::set, var_9_DA:Typed, p2:OpticFinder, invokevirtual:Typed(Typed::set, var_11_FB:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_13_115:Dynamic[expected:Object]))))
                    }
                }
            }
            
            return:Typed(invokevirtual:Typed(Typed::set, p3:Typed, invokestatic:OpticFinder(DSL::remainderFinder), var_7_AC:Dynamic[expected:Object]))
        }
        
        return:Typed(p3:Typed)
    }
    
    static {
        var_0_300 : int
        expr_6B : int [generated]
        stack_A6_0 : byte[] [generated]
        stack_A8_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_11F_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_173_0 : byte[] [generated]
        stack_175_0 : byte[] [generated]
        stack_1B3_0 : byte[] [generated]
        stack_324_0 : byte[] [generated]
        stack_391_0 : byte[] [generated]
        stack_41F_0 : byte[] [generated]
        stack_45A_0 : byte[] [generated]
        stack_4B0_0 : byte[] [generated]
        var_4_2EC : int
        var_3_2F1 : byte[]
        var_5_2F2 : int
        expr_324 : byte [generated]
        var_0_387 : int
        expr_391 : byte [generated]
        stack_3D1_2 : byte [generated]
        stack_3AE_0 : byte [generated]
        expr_A8 : int [generated]
        expr_E9 : int [generated]
        var_2_11F : byte[]
        expr_123 : int [generated]
        var_3_448 : byte[]
        var_5_449 : int
        expr_175 : int [generated]
        var_3_49E : byte[]
        var_5_49F : int
        var_3_1BF : String
        stack_2E5_0 : String[] [generated]
        expr_1D1 : String[] [generated]
        
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
        var_0_300 = and:int(ldc:int(-1461618845), ldc:int(-1193148445))
        expr_6B = arraylength:int(stack_A6_0 = stack_A8_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_173_0 = stack_175_0 = stack_1B3_0 = stack_324_0 = stack_391_0 = stack_41F_0 = stack_45A_0 = stack_4B0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HGB8TMQEEFwQqGMEuwRI24vvQJvcFBCI+5+/DCjvVCQEdMtzBCRcRGsc09OooxRkEAjTLO8gaOMQQP8E86fzDLMjABRsOf/Lo/cMaDDn88s=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2EC = expr_6B:int
        var_3_2F1 = newarray:byte[](byte.class, expr_6B:int)
        var_5_2F2 = expr_6B:int
        Label_0756:
        
        while (cmpne:boolean(and:int(var_0_300:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(-485900134))
                goto(Label_0873)
            }
            
            var_0_300 = and:int(var_0_300:int, ldc:int(-1359808586))
            var_5_2F2 = add:int(var_5_2F2:int, ldc:int(-1))
            expr_324 = loadelement:byte(stack_324_0:byte[], var_5_2F2:int)
            storeelement:byte(var_3_2F1:byte[], var_5_2F2:int, or:int(and:int(shl:int(expr_324:byte, xor:int(ldc:int(22593), ldc:int(22597))), ldc:int(-16)), and:int(shr:int(expr_324:byte[expected:int], and:int(ldc:int(1070), ldc:int(276))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2F2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A8_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_173_0 = stack_175_0 = stack_1B3_0 = stack_324_0 = stack_391_0 = stack_41F_0 = stack_45A_0 = stack_4B0_0 = var_3_2F1:byte[]
            goto(Label_0112)
        }
        
        var_0_300 = and:int(var_0_300:int, ldc:int(-1552055296))
        goto(Label_1015)
        Label_0873:
        
        while (cmpeq:boolean(and:int(var_0_300:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0756)
            }
            
            var_0_387 = and:int(var_0_300:int, ldc:int(-269060177))
            var_5_2F2 = add:int(var_5_2F2:int, ldc:int(-1))
            expr_391 = stack_3D1_2 = loadelement(stack_391_0, var_5_2F2)
            
            if (cmplt:boolean(add:int(add:int(var_5_2F2:int, ldc:int(4)), neg:int(var_4_2EC:int)), ldc:int(0))) {
                stack_3D1_2 = stack_3AE_0 = add:byte(expr_391:byte, loadelement:byte(var_3_2F1:byte[], add:int(var_5_2F2:int, ldc:int(4))))
                goto(Label_0958)
            }
            
            Label_0926:
            
            if (cmpne:boolean(and:int(var_0_387:int, ldc:int(2)), ldc:int(0))) {
                var_0_387 = and:int(var_0_387:int, ldc:int(-353304706))
                stack_3D1_2 = stack_3AE_0 = add:byte(expr_391:byte, ldc:byte(4))
            }
            
            Label_0958:
            
            if (cmpne:boolean(and:int(var_0_387:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0926)
            }
            
            var_0_300 = and:int(var_0_387:int, ldc:int(-1083869270))
            storeelement:byte(var_3_2F1:byte[], var_5_2F2:int, stack_3D1_2:byte)
            
            if (cmpne:boolean(var_5_2F2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A8_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_173_0 = stack_175_0 = stack_1B3_0 = stack_324_0 = stack_391_0 = stack_41F_0 = stack_45A_0 = stack_4B0_0 = var_3_2F1:byte[]
            goto(Label_0173)
        }
        
        var_0_300 = and:int(var_0_300:int, ldc:int(-159332160))
        Label_1015:
        
        while (cmpeq:boolean(and:int(var_0_300:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0756)
            }
            
            var_0_300 = and:int(var_0_300:int, ldc:int(-8618186))
            var_5_2F2 = add:int(var_5_2F2:int, ldc:int(-1))
            storeelement:byte(var_3_2F1:byte[], var_5_2F2:int, add:byte(loadelement:byte(stack_41F_0:byte[], var_5_2F2:int), ldc:byte(64)))
            
            if (cmpne:boolean(var_5_2F2:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A8_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_173_0 = stack_175_0 = stack_1B3_0 = stack_324_0 = stack_391_0 = stack_41F_0 = stack_45A_0 = stack_4B0_0 = var_3_2F1:byte[]
            goto(Label_0238)
        }
        
        var_0_300 = and:int(var_0_300:int, ldc:int(-1338190745))
        goto(Label_0873)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_300:int, ldc:int(128)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(571012344))
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_300:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(-198596969))
        }
        else {
            var_0_300 = and:int(var_0_300:int, ldc:int(-1200324625))
            expr_A8 = arraylength:int(stack_A8_0:byte[])
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_4_2EC = expr_A8:int
                var_3_2F1 = newarray:byte[](byte.class, expr_A8:int)
                var_5_2F2 = expr_A8:int
                goto(Label_0873)
            }
        }
        
        Label_0173:
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpne:boolean(and:int(var_0_300:int, ldc:int(16)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(1489896509))
            goto(Label_0296)
        }
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(8192)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(-1407325986))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_300 = and:int(var_0_300:int, ldc:int(-1461321869))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_2EC = expr_E9:int
                var_3_2F1 = newarray:byte[](byte.class, expr_E9:int)
                var_5_2F2 = expr_E9:int
                goto(Label_1015)
            }
        }
        
        Label_0238:
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0378)
        }
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_300:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(999788256))
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_300:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_300 = and:int(var_0_300:int, ldc:int(-1109198941))
            var_2_11F = stack_11F_0:byte[]
            expr_123 = add:int(arraylength:int(stack_121_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_123:int, ldc:int(0))) {
                var_3_448 = newarray:byte[](byte.class, expr_123:int)
                var_5_449 = expr_123:int
                
                loop {
                    var_0_300 = and:int(var_0_300:int, ldc:int(-67731661))
                    var_5_449 = add:int(var_5_449:int, ldc:int(-1))
                    storeelement:byte(var_3_448:byte[], var_5_449:int, add:int(shl:int(loadelement:byte(stack_45A_0:byte[], var_5_449:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_11F:byte[], add:int(var_5_449:int, xor:int(ldc:int(4137), ldc:int(4136)))), ldc:int(6)), xor:int(ldc:int(-32542), ldc:int(-32543)))))
                    
                    if (cmpne:boolean(var_5_449:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A8_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_173_0 = stack_175_0 = stack_1B3_0 = stack_324_0 = stack_391_0 = stack_41F_0 = stack_45A_0 = stack_4B0_0 = var_3_448:byte[]
            }
        }
        
        Label_0296:
        
        if (cmpne:boolean(and:int(var_0_300:int, ldc:int(4)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(1563479208))
        }
        else {
            if (cmpne:boolean(and:int(var_0_300:int, ldc:int(8)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(40122229))
                goto(Label_0238)
            }
            
            if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(-1563629584))
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_300:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_300 = and:int(var_0_300:int, ldc:int(1556765901))
                goto(Label_0112)
            }
            
            var_0_300 = and:int(var_0_300:int, ldc:int(-118786113))
            expr_175 = arraylength:int(stack_175_0:byte[])
            
            if (cmpne:boolean(expr_175:int, ldc:int(0))) {
                var_3_49E = newarray:byte[](byte.class, expr_175:int)
                var_5_49F = expr_175:int
                
                loop {
                    var_0_300 = and:int(var_0_300:int, ldc:int(-1460666501))
                    var_5_49F = add:int(var_5_49F:int, ldc:int(-1))
                    storeelement:byte(var_3_49E:byte[], var_5_49F:int, xor:byte(loadelement:byte(stack_4B0_0:byte[], var_5_49F:int), ldc:byte(107)))
                    
                    if (cmpne:boolean(var_5_49F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A8_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_11F_0 = stack_121_0 = stack_173_0 = stack_175_0 = stack_1B3_0 = stack_324_0 = stack_391_0 = stack_41F_0 = stack_45A_0 = stack_4B0_0 = var_3_49E:byte[]
            }
        }
        
        Label_0378:
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(-835317878))
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_300:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0173)
        }
        
        if (cmpeq:boolean(and:int(var_0_300:int, ldc:int(1024)), ldc:int(0))) {
            var_0_300 = and:int(var_0_300:int, ldc:int(118813230))
            goto(Label_0112)
        }
        
        var_3_1BF = initobject:String(String::<init>, stack_1B3_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2E5_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20558), ldc:int(2218)))
        expr_1D1 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5763), ldc:int(5769)))
        storeelement:String(expr_1D1:String[], and:int(ldc:int(9), ldc:int(5403)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, and:int(ldc:int(693), ldc:int(-17078)), and:int(ldc:int(8591), ldc:int(2645))))
        storeelement:String(expr_1D1:String[], xor:int(ldc:int(8704), ldc:int(8709)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, and:int(ldc:int(28677), ldc:int(333)), xor:int(ldc:int(10284), ldc:int(10277))))
        storeelement:String(expr_1D1:String[], and:int(ldc:int(19778), ldc:int(4618)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, xor:int(ldc:int(9217), ldc:int(9224)), and:int(ldc:int(1047), ldc:int(9183))))
        storeelement:String(expr_1D1:String[], and:int(ldc:int(20510), ldc:int(10246)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, xor:int(ldc:int(-32678), ldc:int(-32691)), xor:int(ldc:int(1946), ldc:int(1927))))
        storeelement:String(expr_1D1:String[], and:int(ldc:int(4155), ldc:int(515)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, xor:int(ldc:int(-28516), ldc:int(-28543)), and:int(ldc:int(11567), ldc:int(47))))
        storeelement:String(expr_1D1:String[], xor:int(ldc:int(9229), ldc:int(9221)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, and:int(ldc:int(20543), ldc:int(815)), and:int(ldc:int(23611), ldc:int(115))))
        storeelement:String(expr_1D1:String[], xor:int(ldc:int(277), ldc:int(274)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, xor:int(ldc:int(5528), ldc:int(5547)), and:int(ldc:int(702), ldc:int(2362))))
        storeelement:String(expr_1D1:String[], and:int(ldc:int(17923), ldc:int(-17956)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, and:int(ldc:int(1082), ldc:int(6267)), and:int(ldc:int(30783), ldc:int(316))))
        storeelement:String(expr_1D1:String[], xor:int(ldc:int(-32761), ldc:int(-32765)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, xor:int(ldc:int(2219), ldc:int(2199)), xor:int(ldc:int(28695), ldc:int(28763))))
        storeelement:String(expr_1D1:String[], xor:int(ldc:int(-24508), ldc:int(-24507)), invokevirtual:String[expected:String](String::substring, var_3_1BF:String, and:int(ldc:int(2125), ldc:int(4302)), xor:int(ldc:int(8247), ldc:int(8312))))
        putstatic:String[](\u62da\u071d\u74b1\u4bc8\u64f2\uf995::\ucb79\u88c5\u946b\u88c5\u34df\u4d85, expr_1D1:String[])
    }
    
    public void \uff55\u8413\u4f4a\ufcaf\u8389\u120d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BB : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6C6 : int
        
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
        var_3_6BB = and:int(ldc:int(-1507727753), ldc:int(628192859))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u62da\u071d\u74b1\u4bc8\u64f2\uf995[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1610432852))
        }
        else {
            var_3_6BB = and:int(var_3_6BB:int, ldc:int(670590303))
            var_5_8A = and:int(ldc:int(11668), ldc:int(-11669))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(566), ldc:int(-1591)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6BB:int, ldc:int(-1359089929))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-32704), ldc:int(-32703)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(2051), ldc:int(4385)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6BB = and:int(var_3_E3:int, ldc:int(2095707379))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(73), ldc:int(5763)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1973804796))
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(100037702))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-674687614))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-971179144))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1578537613))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(962068749))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(221914498))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0715)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1417878448))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(812115315))
                        var_11_F4 = and:int(ldc:int(-22874), ldc:int(22873))
                        goto(Label_1617)
                    }
                    
                    Label_0575:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1688039591))
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-391816007))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-492902037))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(883496856))
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(44044457))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(843756731))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1660484951))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0715:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1628)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1715868414))
                        goto(Label_1463)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(588059742))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(717605446))
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-634472943))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1141216462))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1895657299))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0856:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1438898121))
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-676445850))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-108612538))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-75485960))
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(374901364))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-883978914))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1732719249))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(829844947))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(225), ldc:int(2051))
                                goto(Label_1185)
                            }
                        }
                    }
                    
                    Label_1007:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-752378817))
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-747017457))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1040128856))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(62603296))
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1581693257))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-337246426))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-264800641))
                        var_11_F4 = and:int(ldc:int(-23141), ldc:int(21088))
                    }
                    
                    Label_1185:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-633978293))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1007)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-718766043))
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(1805884942))
                            goto(Label_0715)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(356950215))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(715316927))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1264392741))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1463)
                            }
                        }
                    }
                    
                    Label_1319:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-2125605161))
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1791020780))
                            goto(Label_1185)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1007)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1161187651))
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0715)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(-378980753))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BB = and:int(var_3_6BB:int, ldc:int(631461276))
                            loopcontinue()
                        }
                        
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(547448799))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1617)
                    }
                    
                    Label_1463:
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(450193096))
                        goto(Label_1628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(951674743))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1046148282))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-712372399))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(776300222))
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(1903893054))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BB = and:int(var_3_6BB:int, ldc:int(-494965537))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1617:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C6 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1628:
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-815028344))
                        goto(Label_1463)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1007)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-619102601))
                        goto(Label_0715)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BB:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BB = and:int(var_3_6BB:int, ldc:int(-1581844645))
                        var_17_6C6 = add:int(var_16_122:int, xor:int(ldc:int(132), ldc:int(133)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6BB = and:int(var_3_6BB:int, ldc:int(1673262299))
                
                if (cmple:boolean(var_5_8A = var_17_6C6:int, sub:int(var_6_91:int, and:int(ldc:int(4097), ldc:int(10305))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6BB:int, ldc:int(8)), ldc:int(0))) {
            var_3_6BB = and:int(var_3_6BB:int, ldc:int(157685370))
            goto(Label_0108)
        }
    }
}
