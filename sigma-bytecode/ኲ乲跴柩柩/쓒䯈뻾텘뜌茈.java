public class \u12b2\u4e72\u8df4\u67e9\u67e9.\uc4d2\u4bc8\ubefe\ud158\ub70c\u8308 {
    public void \uc4d2\u4bc8\ubefe\ud158\ub70c\u8308(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\uc4d2\u4bc8\ubefe\ud158\ub70c\u8308, p0:Schema, p1:boolean)
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
    
    private static com.mojang.serialization.Dynamic<T> \ucef1\u8d90\ud4fe\ub8be\u3c25\ub8be(com.mojang.serialization.Dynamic<T> p0) {
        var_1_5F : int
        var_3_63 : HashMap
        var_4_6B : int
        var_1_78 : int
        var_5_BA : String
        var_6_C5 : Optional
        
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
            var_1_5F = and:int(ldc:int(-295610506), ldc:int(-959717387))
            var_3_63 = invokestatic:HashMap(Maps::newHashMap)
            var_4_6B = and:int(ldc:int(14729), ldc:int(-14766))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16)), ldc:int(0))) {
                    var_1_78 = and:int(var_1_5F:int, ldc:int(1959914361))
                }
                else {
                    var_1_78 = and:int(var_1_5F:int, ldc:int(-274694152))
                    
                    if (cmplt:boolean(var_4_6B:int, ldc:int(16))) {
                        var_5_BA = invokestatic:String(String::valueOf, var_4_6B:int)
                        var_6_C5 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_0_117:Dynamic, var_5_BA:String))
                        
                        if (invokevirtual:boolean(Optional::isPresent, var_6_C5:Optional)) {
                            invokeinterface:Dynamic(Map<Dynamic, Dynamic>::put, var_3_63:HashMap<Dynamic, Dynamic>[expected:Map<Dynamic, Dynamic>], invokevirtual:Dynamic(Dynamic::createInt, var_0_117:Dynamic, var_4_6B:int), invokevirtual:Dynamic(Dynamic::createMap, var_0_117:Dynamic, invokestatic:ImmutableMap(ImmutableMap::of, invokevirtual:Dynamic[expected:Object](Dynamic::createString, var_0_117:Dynamic, loadelement:String(getstatic:String[](\uc4d2\u4bc8\ubefe\ud158\ub70c\u8308::\u72f1\uafe7\u0c95\u2dcc\ubded\u67d0), xor:int(ldc:int(16912), ldc:int(16914)))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_6_C5:Optional<Dynamic>)))))
                            var_0_117 = invokevirtual:Dynamic(Dynamic::remove, var_0_117:Dynamic, var_5_BA:String)
                        }
                        
                        var_1_5F = and:int(var_1_78:int, ldc:int(-163490344))
                        inc:int(var_4_6B, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_78:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_78:int, ldc:int(-237872385))
            }
            
            return:Dynamic<T>(invokevirtual:Dynamic(Dynamic::set, var_0_117:Dynamic, loadelement:String(getstatic:String[](\uc4d2\u4bc8\ubefe\ud158\ub70c\u8308::\u72f1\uafe7\u0c95\u2dcc\ubded\u67d0), xor:int(ldc:int(16514), ldc:int(16513))), invokevirtual:Dynamic(Dynamic::createMap, var_0_117:Dynamic, var_3_63:HashMap<Dynamic, Dynamic>[expected:Map])))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Function lambda$\u8cae\u67d0\u647c\u494c\u873d\ud523$1(com.mojang.serialization.DynamicOps p0) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\uc246\u61a4\uc31c\u873d\ucb79\uc4d2$0(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(invokevirtual:Pair(Pair::mapSecond, p0:Pair, invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_97_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1DF_0 : byte[] [generated]
        stack_253_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_177 : byte[]
        var_4_178 : int
        var_0_7D : int
        expr_99 : int [generated]
        var_5_1C8 : int
        var_3_1CD : byte[]
        var_4_1CE : int
        var_0_1D5 : int
        expr_1DF : byte [generated]
        stack_21E_2 : byte [generated]
        stack_1FC_0 : byte [generated]
        expr_BD : int [generated]
        var_3_241 : byte[]
        var_4_242 : int
        expr_253 : byte [generated]
        var_3_EA : String
        stack_16E_0 : String[] [generated]
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
            var_0_5F = and:int(ldc:int(788970369), ldc:int(-893649933))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1DF_0 = stack_253_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AvAnUUDXDggOBT0CA9EU0AbKNyc8AALWD5cJTTKRfgYAAAAHDjuTRwE13UE609bBHtoFBHX6MBoO0Dnb9wAwHUtKRxA="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_177 = newarray:byte[](byte.class, expr_6D:int)
                var_4_178 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-363528792))
                    var_4_178 = add:int(var_4_178:int, ldc:int(-1))
                    storeelement:byte(var_3_177:byte[], var_4_178:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_178:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_178:int, xor:int(ldc:int(65), ldc:int(64)))), ldc:int(4)), xor:int(ldc:int(-14327), ldc:int(-14330)))))
                    
                    if (cmpne:boolean(var_4_178:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1DF_0 = stack_253_0 = var_3_177:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-1010272391))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-423139310))
                }
                else {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(1510391733))
                    expr_99 = arraylength:int(stack_99_0:byte[])
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_5_1C8 = expr_99:int
                        var_3_1CD = newarray:byte[](byte.class, expr_99:int)
                        var_4_1CE = expr_99:int
                        
                        loop {
                            var_0_1D5 = and:int(var_0_7D:int, ldc:int(-18781771))
                            var_4_1CE = add:int(var_4_1CE:int, ldc:int(-1))
                            expr_1DF = stack_21E_2 = loadelement(stack_1DF_0, var_4_1CE)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_1CE:int, ldc:int(5)), neg:int(var_5_1C8:int)), ldc:int(0))) {
                                stack_21E_2 = stack_1FC_0 = add:byte(expr_1DF:byte, loadelement:byte(var_3_1CD:byte[], add:int(var_4_1CE:int, ldc:int(5))))
                                goto(Label_0524)
                            }
                            
                            Label_0492:
                            
                            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(4)), ldc:int(0))) {
                                var_0_1D5 = and:int(var_0_1D5:int, ldc:int(513486512))
                                stack_21E_2 = stack_1FC_0 = add:byte(expr_1DF:byte, ldc:byte(5))
                            }
                            
                            Label_0524:
                            
                            if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(1073741824)), ldc:int(0))) {
                                goto(Label_0492)
                            }
                            
                            var_0_7D = and:int(var_0_1D5:int, ldc:int(-1968363111))
                            storeelement:byte(var_3_1CD:byte[], var_4_1CE:int, stack_21E_2:byte)
                            
                            if (cmpne:boolean(var_4_1CE:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1DF_0 = stack_253_0 = var_3_1CD:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(2097152)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(8192)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_7D:int, ldc:int(811165869))
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_7D:int, ldc:int(180594835))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_3_241 = newarray:byte[](byte.class, expr_BD:int)
                        var_4_242 = expr_BD:int
                        
                        loop {
                            var_0_7D = and:int(var_0_7D:int, ldc:int(2117380738))
                            var_4_242 = add:int(var_4_242:int, ldc:int(-1))
                            expr_253 = loadelement:byte(stack_253_0:byte[], var_4_242:int)
                            storeelement:byte(var_3_241:byte[], var_4_242:int, add:int(xor:int(or:int(and:int(shl:int(expr_253:byte, and:int(ldc:int(284), ldc:int(2726))), ldc:int(-16)), and:int(shr:int(expr_253:byte[expected:int], and:int(ldc:int(2062), ldc:int(4613))), ldc:int(15))), ldc:int(100)), ldc:int(112)))
                            
                            if (cmpne:boolean(var_4_242:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_1DF_0 = stack_253_0 = var_3_241:byte[]
                    }
                }
                
                Label_0194:
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7D:int, ldc:int(-1359270153))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_16E_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8532), ldc:int(16908)))
            expr_FC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9216), ldc:int(9220)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(2065), ldc:int(25899)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(1707), ldc:int(-10220)), xor:int(ldc:int(20484), ldc:int(20502))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(-305), ldc:int(304)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(20509), ldc:int(20495)), xor:int(ldc:int(14), ldc:int(58))))
            storeelement:String(expr_FC:String[], xor:int(ldc:int(-23544), ldc:int(-23542)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(565), ldc:int(26684)), xor:int(ldc:int(171), ldc:int(144))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(2259), ldc:int(5159)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(18478), ldc:int(18453)), and:int(ldc:int(231), ldc:int(13131))))
            putstatic:String[](\uc4d2\u4bc8\ubefe\ud158\ub70c\u8308::\u72f1\uafe7\u0c95\u2dcc\ubded\u67d0, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubefe\u6c52\u6fb0\u071d\uc29a\u7006(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(-2136550758), ldc:int(741836470))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc4d2\u4bc8\ubefe\ud158\ub70c\u8308[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-205542817))
            var_5_81 = and:int(ldc:int(-3223), ldc:int(3222))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3228), ldc:int(-3231)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_60D:int, ldc:int(-2105575726))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(1304), ldc:int(1305)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(-32701), ldc:int(-32702)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_D1:int, ldc:int(1497282102))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:boolean(0), ldc:boolean(1)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-954324825))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(603562761))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1307699220))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2045179580))
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1630741307))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(157492174))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1755713127))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-325255383))
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(406723535))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(537725202))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1719420429))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1421896710))
                        var_11_E2 = and:int(ldc:int(-3767), ldc:int(3766))
                        goto(Label_1437)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-62181869))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1190555603))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1818275978))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-142933502))
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1620312294))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(715524983))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1823468600))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1260294438))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(333878263))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2142249730))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1670564921))
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-478750224))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1623589595))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-206113062))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(4196), ldc:int(4197))
                                goto(Label_1107)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-118480570))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-518590462))
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-883299586))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1067773381))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2025920961))
                        var_11_E2 = and:int(ldc:int(29747), ldc:int(-31796))
                    }
                    
                    Label_1107:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1726236098))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1181356161))
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1711629514))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1328)
                            }
                        }
                    }
                    
                    Label_1211:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2056808396))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1107)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1380152376))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1340261370))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1437)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1328:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1637579963))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(447396563))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1437:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1328)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2022705615))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1107)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1718312304))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(131327811))
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1263664361))
                        var_17_618 = add:int(var_16_110:int, and:int(ldc:int(1065), ldc:int(12947)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-2139187233))
                
                if (cmple:boolean(var_5_81 = var_17_618:int, sub:int(var_6_88:int, xor:int(ldc:int(-30624), ldc:int(-30623))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
