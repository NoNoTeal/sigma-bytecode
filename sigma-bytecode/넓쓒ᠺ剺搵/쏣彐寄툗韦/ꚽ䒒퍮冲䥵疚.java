public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ua6bd\u4492\ud36e\u51b2\u4975\u759a {
    public void \ua6bd\u4492\ud36e\u51b2\u4975\u759a(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ua6bd\u4492\ud36e\u51b2\u4975\u759a, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic<?> \ua068\u927d\uafe7\u8cae\u5654\u8c8a(com.mojang.serialization.Dynamic<?> p0) {
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
    
    private com.mojang.datafixers.Typed lambda$\ub171\uc3e3\ubded\u8c8a\u74b1\uf9c5$1(com.mojang.datafixers.types.Type p0, com.mojang.datafixers.Typed p1) {
        var_3_5F : int
        var_5_6A : Dynamic
        var_6_98 : DataResult
        stack_C8_0 : Typed [generated]
        
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
            var_3_5F = and:int(ldc:int(1333231597), ldc:int(393663359))
            var_5_6A = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Object[expected:Dynamic](Typed::get, p1:Typed, invokestatic:OpticFinder(DSL::remainderFinder)))
            var_6_98 = invokevirtual:DataResult(Type::readTyped, p0:Type, invokespecial:Dynamic<?>(\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\ua068\u927d\uafe7\u8cae\u5654\u8c8a, this:\ua6bd\u4492\ud36e\u51b2\u4975\u759a, invokevirtual:Dynamic(Dynamic::set, var_5_6A:Dynamic, loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), and:int(ldc:int(9475), ldc:int(16581))), invokevirtual:Dynamic(Dynamic::createString, var_5_6A:Dynamic, loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), and:int(ldc:int(2434), ldc:int(-2435)))))))
            
            if (invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, var_6_98:DataResult))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-2014872015))
                stack_C8_0 = checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Object[expected:Typed](Pair::getFirst, checkcast:Pair(com.mojang.datafixers.util.Pair.class, invokevirtual:Pair(Optional<Pair>::get, invokevirtual:Optional(DataResult::result, var_6_98:DataResult)))))
            }
            else {
                stack_C8_0 = p1:Typed
            }
            
            return:Typed(stack_C8_0:Typed)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u8aa5\u3bd6\u7ce1\ud171\u6cfe\ub32d$0(com.mojang.serialization.Dynamic p0) {
        var_3_75 : Optional
        
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
        var_3_75 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), xor:int(ldc:int(8711), ldc:int(8719))))))
        
        if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_3_75:Optional))) {
            return:Dynamic(p0:Dynamic)
        }
        
        return:Dynamic(invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::remove, invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), and:int(ldc:int(590), ldc:int(31755))), invokevirtual:Dynamic(Dynamic::set, checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokestatic:Object[expected:Dynamic](DataFixUtils::orElse, invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), xor:int(ldc:int(9234), ldc:int(9243))))), invokevirtual:Dynamic[expected:Object](Dynamic::emptyMap, p0:Dynamic))), loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), and:int(ldc:int(20481), ldc:int(10913))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_3_75:Optional<String>))))), loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), xor:int(ldc:int(8192), ldc:int(8200)))), loadelement:String(getstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9), and:int(ldc:int(297), ldc:int(20509)))))
    }
    
    static {
        var_0_291 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_87_0 : byte[] [generated]
        stack_89_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_2A4_0 : byte[] [generated]
        stack_30E_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_22C : byte[]
        var_4_22D : int
        expr_89 : int [generated]
        var_5_27D : int
        var_3_282 : byte[]
        var_4_283 : int
        expr_2A7 : byte [generated]
        var_0_304 : int
        expr_30E : byte [generated]
        stack_33E_2 : byte [generated]
        expr_AD : int [generated]
        var_3_E2 : String
        stack_223_0 : String[] [generated]
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
            var_0_291 = and:int(ldc:int(-1362770167), ldc:int(-1244216164))
            expr_65 = var_2_69 = stack_87_0 = stack_89_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_2A4_0 = stack_30E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BM8LIQ0BhM8LIQ0ZgONWzzM88y7nJz0fds8zPPMu5yc9D2TPCyENGYD1BQ8LOzEBPRUPcNkJZP0jVts1Cz0XCyE/GXzzLuctfPD7VTzzLuc1WO0TJQ8LKSEJE0zHKzMfO+A="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_22C = newarray:byte[](byte.class, expr_6D:int)
                var_4_22D = expr_6D:int
                
                loop {
                    var_0_291 = and:int(var_0_291:int, ldc:int(-405945223))
                    var_4_22D = add:int(var_4_22D:int, ldc:int(-1))
                    storeelement:byte(var_3_22C:byte[], var_4_22D:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_22D:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_22D:int, xor:int(ldc:int(16400), ldc:int(16401)))), ldc:int(5)), xor:int(ldc:int(8208), ldc:int(8215)))))
                    
                    if (cmpne:boolean(var_4_22D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_89_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_2A4_0 = stack_30E_0 = var_3_22C:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_0_291 = and:int(var_0_291:int, ldc:int(-1398350341))
                expr_89 = arraylength:int(stack_89_0:byte[])
                
                if (cmpeq:boolean(expr_89:int, ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_5_27D = expr_89:int
                var_3_282 = newarray:byte[](byte.class, expr_89:int)
                var_4_283 = expr_89:int
                Label_0645:
                
                while (cmpne:boolean(and:int(var_0_291:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_291 = and:int(var_0_291:int, ldc:int(-825819906))
                    var_4_283 = add:int(var_4_283:int, ldc:int(-1))
                    expr_2A7 = add:byte(loadelement:byte(stack_2A4_0:byte[], var_4_283:int), ldc:byte(71))
                    storeelement:byte(var_3_282:byte[], var_4_283:int, xor:int(or:int(and:int(shl:int(expr_2A7:byte, and:int(ldc:int(9958), ldc:int(2060))), ldc:int(-16)), and:int(shr:int(expr_2A7:byte[expected:int], xor:int(ldc:int(-24568), ldc:int(-24564))), ldc:int(15))), ldc:int(1)))
                    
                    if (cmpne:boolean(var_4_283:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_2A4_0 = stack_30E_0 = var_3_282:byte[]
                    goto(Label_0142)
                }
                
                var_0_291 = and:int(var_0_291:int, ldc:int(-1831490151))
                Label_0751:
                
                while (cmpne:boolean(and:int(var_0_291:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_304 = and:int(var_0_291:int, ldc:int(-1796225426))
                    var_4_283 = add:int(var_4_283:int, ldc:int(-1))
                    expr_30E = loadelement:byte(stack_30E_0:byte[], var_4_283:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_283:int, ldc:int(1)), neg:int(var_5_27D:int)), ldc:int(0))) {
                        var_0_304 = and:int(var_0_304:int, ldc:int(-404226901))
                        stack_33E_2 = add:byte(expr_30E:byte, ldc:byte(1))
                    }
                    else {
                        stack_33E_2 = add:byte(expr_30E:byte, loadelement:byte(var_3_282:byte[], add:int(var_4_283:int, ldc:int(1))))
                    }
                    
                    var_0_291 = and:int(var_0_304:int, ldc:int(-1097868226))
                    storeelement:byte(var_3_282:byte[], var_4_283:int, stack_33E_2:byte)
                    
                    if (cmpne:boolean(var_4_283:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_2A4_0 = stack_30E_0 = var_3_282:byte[]
                    goto(Label_0178)
                }
                
                var_0_291 = and:int(var_0_291:int, ldc:int(11901536))
                goto(Label_0645)
                Label_0142:
                
                if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_291 = and:int(var_0_291:int, ldc:int(-1904796479))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_291:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_291 = and:int(var_0_291:int, ldc:int(-173685701))
                    expr_AD = arraylength:int(stack_AD_0:byte[])
                    
                    if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                        var_5_27D = expr_AD:int
                        var_3_282 = newarray:byte[](byte.class, expr_AD:int)
                        var_4_283 = expr_AD:int
                        goto(Label_0751)
                    }
                }
                
                Label_0178:
                
                if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_291 = and:int(var_0_291:int, ldc:int(-1464709239))
                    goto(Label_0142)
                }
                
                if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(64)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_291 = and:int(var_0_291:int, ldc:int(1132958384))
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_223_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(13312), ldc:int(13323)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6187), ldc:int(543)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(10630), ldc:int(5123)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(5261), ldc:int(-13966)), and:int(ldc:int(-9890), ldc:int(9889))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(8206), ldc:int(346)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-3433), ldc:int(3432)), xor:int(ldc:int(-24314), ldc:int(-24320))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(67), ldc:int(4611)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-32666), ldc:int(-32672)), and:int(ldc:int(78), ldc:int(6702))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-2051), ldc:int(2050)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(4097), ldc:int(4111)), xor:int(ldc:int(1092), ldc:int(1116))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(1031), ldc:int(17287)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(10649), ldc:int(1080)), and:int(ldc:int(20662), ldc:int(9014))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(4135), ldc:int(4130)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-32739), ldc:int(-32725)), and:int(ldc:int(1785), ldc:int(28987))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(575), ldc:int(2249)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(9913), ldc:int(2111)), and:int(ldc:int(8259), ldc:int(5099))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(516), ldc:int(18710)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(2343), ldc:int(2404)), and:int(ldc:int(223), ldc:int(18508))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(-28668), ldc:int(-28670)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(17359), ldc:int(2124)), xor:int(ldc:int(2235), ldc:int(2272))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(20603), ldc:int(8712)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(22623), ldc:int(635)), and:int(ldc:int(25183), ldc:int(2143))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(7687), ldc:int(209)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(-31533), ldc:int(-31604)), and:int(ldc:int(2165), ldc:int(353))))
            putstatic:String[](\ua6bd\u4492\ud36e\u51b2\u4975\u759a::\u4f52\u8753\u927d\u4ab3\u516c\u6bb9, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\ud217\u946b\u59ec\u7006\u6c56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_711 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_71C : int
        
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
        var_3_711 = and:int(ldc:int(-55831679), ldc:int(-944923787))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua6bd\u4492\ud36e\u51b2\u4975\u759a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2048)), ldc:int(0))) {
            var_3_711 = and:int(var_3_711:int, ldc:int(-829154661))
        }
        else {
            var_3_711 = and:int(var_3_711:int, ldc:int(-70495252))
            var_5_8A = and:int(ldc:int(31762), ldc:int(-32180))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3641), ldc:int(-20218)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_711:int, ldc:int(-827580722))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(22345), ldc:int(8195)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(16705), ldc:int(16704)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_711 = and:int(var_3_E3:int, ldc:int(-839065770))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(8225), ldc:int(7169)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(2130060964))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1779624695))
                        goto(Label_0752)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-349904461))
                        goto(Label_0610)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-56519167))
                    }
                    else {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-396584204))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0610)
                            }
                            
                            goto(Label_0883)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1442585645))
                        goto(Label_1673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(1963642268))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-2030574752))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1984672371))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(895995287))
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1055635149))
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0752)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-38652156))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-666492982))
                        var_11_F4 = and:int(ldc:int(21266), ldc:int(-22396))
                        goto(Label_1662)
                    }
                    
                    Label_0610:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(1309446459))
                        goto(Label_1673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(2144803679))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(925864181))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-998401394))
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(375786142))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-968603280))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-442756125))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0883)
                        }
                    }
                    
                    Label_0752:
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1577124724))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1949270931))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-427902023))
                            goto(Label_0610)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-233477549))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-497131909))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0883:
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(875491051))
                        goto(Label_1673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1690760089))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1450051756))
                        goto(Label_1195)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(1072560460))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(399860277))
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0610)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(526180884))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-791380104))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(6165), ldc:int(9505))
                                goto(Label_1195)
                            }
                        }
                    }
                    
                    Label_1026:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-7761216))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0883)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(353569161))
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(1214123660))
                            goto(Label_0610)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(1957162205))
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(40701804))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-638650474))
                        var_11_F4 = and:int(ldc:int(11601), ldc:int(-12114))
                    }
                    
                    Label_1195:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(914365554))
                        goto(Label_1673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1509103842))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1966484973))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-995163431))
                            goto(Label_1026)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(1141942671))
                            goto(Label_0883)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(1158650845))
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-590820050))
                            goto(Label_0610)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(1885529600))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-590539946))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1508)
                            }
                        }
                    }
                    
                    Label_1355:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1844669451))
                        goto(Label_1673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-5727734))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1195)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(793797512))
                            goto(Label_1026)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-849198562))
                            goto(Label_0883)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(1848720735))
                            goto(Label_0752)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0610)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                            var_3_711 = and:int(var_3_711:int, ldc:int(-1929302665))
                            loopcontinue()
                        }
                        
                        var_3_711 = and:int(var_3_711:int, ldc:int(-69263847))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1662)
                    }
                    
                    Label_1508:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(532058181))
                        goto(Label_1673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(2076901977))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(939203805))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1853956175))
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(32)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1478367437))
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1593658502))
                        goto(Label_0752)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_711 = and:int(var_3_711:int, ldc:int(-39529632))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1662:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_71C = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1673:
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-634455093))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-281712550))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(1697071826))
                        goto(Label_1195)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1348425611))
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0752)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(64)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(136225789))
                        goto(Label_0610)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-1596235618))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_711:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_711 = and:int(var_3_711:int, ldc:int(-345532630))
                        var_17_71C = add:int(var_16_122:int, xor:int(ldc:int(17), ldc:int(16)))
                        looporswitchbreak()
                    }
                    
                    var_3_711 = and:int(var_3_711:int, ldc:int(453953644))
                }
                
                var_3_711 = and:int(var_3_711:int, ldc:int(-296797371))
                
                if (cmple:boolean(var_5_8A = var_17_71C:int, sub:int(var_6_91:int, and:int(ldc:int(4259), ldc:int(261))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_711:int, ldc:int(4096)), ldc:int(0))) {
            var_3_711 = and:int(var_3_711:int, ldc:int(1674165454))
            goto(Label_0108)
        }
    }
}
