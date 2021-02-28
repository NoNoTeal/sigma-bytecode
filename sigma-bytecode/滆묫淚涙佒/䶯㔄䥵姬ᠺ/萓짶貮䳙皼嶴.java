public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4 {
    public void \u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\u5d20\uceb8\u64f2\u6c56\u4d85 \u8df4\u4d85\u8aa5\u56bd\u6ec6\u3d4b(java.lang.String p0) {
        var_1_5F : int
        stack_89_0 : \u5d20\uceb8\u64f2\u6c56\u4d85 [generated]
        
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
            var_1_5F = and:int(ldc:int(680594576), ldc:int(733396466))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\uc31c\u8308\ube23\u071d\u071d\u47c2), and:int(ldc:int(30726), ldc:int(-30855)))))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(817100690))
                stack_89_0 = getstatic:\u5d20\uceb8\u64f2\u6c56\u4d85(\u5d20\uceb8\u64f2\u6c56\u4d85::\u93a2\uc246\uae87\u5654\ua6bd\u51fa)
            }
            else {
                stack_89_0 = getstatic:\u5d20\uceb8\u64f2\u6c56\u4d85(\u5d20\uceb8\u64f2\u6c56\u4d85::\ucfaf\u9af2\u51b2\ud7e8\ub32d\u760c)
            }
            
            return:\u5d20\uceb8\u64f2\u6c56\u4d85(stack_89_0:\u5d20\uceb8\u64f2\u6c56\u4d85)
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
    
    private static java.util.function.Function lambda$\u8aa5\u873d\ub32d\ub8be\uc2e8\u6d99$2(com.mojang.serialization.DynamicOps p0) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$null$1(com.mojang.datafixers.util.Pair p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u6cfe\uf94d\u8308\uc84e\u6c52\u72f1$0(com.mojang.serialization.Dynamic p0) {
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
        
        if (invokevirtual:boolean(Optional::isPresent, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\uc31c\u8308\ube23\u071d\u071d\u47c2), xor:int(ldc:int(-32463), ldc:int(-32462)))))))) {
            return:Dynamic(p0:Dynamic)
        }
        
        return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, loadelement:String(getstatic:String[](\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\uc31c\u8308\ube23\u071d\u071d\u47c2), and:int(ldc:int(2059), ldc:int(1671))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, invokevirtual:String(\u5d20\uceb8\u64f2\u6c56\u4d85::\ub8be\uc2bd\u4d85\u51b2\u4f4a\u3d4b, invokestatic:\u5d20\uceb8\u64f2\u6c56\u4d85(\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\u8df4\u4d85\u8aa5\u56bd\u6ec6\u3d4b, invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\uc31c\u8308\ube23\u071d\u071d\u47c2), and:int(ldc:int(10116), ldc:int(4101)))), loadelement:String(getstatic:String[](\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\uc31c\u8308\ube23\u071d\u071d\u47c2), and:int(ldc:int(16389), ldc:int(6533)))))))))
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
        stack_222_0 : byte[] [generated]
        stack_282_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1AD : byte[]
        var_4_1AE : int
        var_0_210 : int
        expr_99 : int [generated]
        var_5_1FD : int
        var_3_202 : byte[]
        var_4_203 : int
        expr_228 : byte [generated]
        var_0_278 : int
        expr_282 : byte [generated]
        stack_2B1_2 : byte [generated]
        expr_BD : int [generated]
        var_3_EA : String
        stack_1A4_0 : String[] [generated]
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
            var_0_5F = and:int(ldc:int(-1439094176), ldc:int(166500973))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_222_0 = stack_282_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ON+IZ7Bfg7foDEOL6BxPu6AXsH/OrRBfl46BRHb1YFBy2SeHqDLZC+Q20WgDl7ugJ7+LYOgcT7ugF7B/9+gAW6Bwa9Dfl6fo+EsoAFugcGvQ35eod7OIXFOGAA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1AD = newarray:byte[](byte.class, expr_6D:int)
                var_4_1AE = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1144598977))
                    var_4_1AE = add:int(var_4_1AE:int, ldc:int(-1))
                    storeelement:byte(var_3_1AD:byte[], var_4_1AE:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1AE:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1AE:int, and:int(ldc:int(29), ldc:int(11969)))), ldc:int(6)), and:int(ldc:int(10243), ldc:int(1111)))))
                    
                    if (cmpne:boolean(var_4_1AE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_222_0 = stack_282_0 = var_3_1AD:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_210 = and:int(var_0_5F:int, ldc:int(2146348315))
                    goto(Label_0194)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_210 = and:int(var_0_5F:int, ldc:int(1214381360))
                    goto(Label_0158)
                }
                
                var_0_210 = and:int(var_0_5F:int, ldc:int(-1964848300))
                expr_99 = arraylength:int(stack_99_0:byte[])
                
                if (cmpeq:boolean(expr_99:int, ldc:int(0))) {
                    goto(Label_0158)
                }
                
                var_5_1FD = expr_99:int
                var_3_202 = newarray:byte[](byte.class, expr_99:int)
                var_4_203 = expr_99:int
                Label_0517:
                
                while (cmpeq:boolean(and:int(var_0_210:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_210 = and:int(var_0_210:int, ldc:int(489619139))
                    var_4_203 = add:int(var_4_203:int, ldc:int(-1))
                    expr_228 = add:byte(xor:byte(loadelement:byte(stack_222_0:byte[], var_4_203:int), ldc:byte(54)), ldc:byte(72))
                    storeelement:byte(var_3_202:byte[], var_4_203:int, or:int(and:int(shl:int(expr_228:byte, xor:int(ldc:int(35), ldc:int(39))), ldc:int(-16)), and:int(shr:int(expr_228:byte[expected:int], xor:int(ldc:int(544), ldc:int(548))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_203:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_222_0 = stack_282_0 = var_3_202:byte[]
                    goto(Label_0158)
                }
                
                var_0_210 = and:int(var_0_210:int, ldc:int(1433860162))
                Label_0621:
                
                while (cmpeq:boolean(and:int(var_0_210:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_278 = and:int(var_0_210:int, ldc:int(-1117304125))
                    var_4_203 = add:int(var_4_203:int, ldc:int(-1))
                    expr_282 = loadelement:byte(stack_282_0:byte[], var_4_203:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_203:int, ldc:int(1)), neg:int(var_5_1FD:int)), ldc:int(0))) {
                        var_0_278 = and:int(var_0_278:int, ldc:int(-1405878498))
                        stack_2B1_2 = add:byte(expr_282:byte, ldc:byte(1))
                    }
                    else {
                        stack_2B1_2 = add:byte(expr_282:byte, loadelement:byte(var_3_202:byte[], add:int(var_4_203:int, ldc:int(1))))
                    }
                    
                    var_0_210 = and:int(var_0_278:int, ldc:int(-391438435))
                    storeelement:byte(var_3_202:byte[], var_4_203:int, stack_2B1_2:byte)
                    
                    if (cmpne:boolean(var_4_203:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_99_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_DE_0 = stack_222_0 = stack_282_0 = var_3_202:byte[]
                    goto(Label_0194)
                }
                
                goto(Label_0517)
                Label_0158:
                
                if (cmpeq:boolean(and:int(var_0_210:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_210:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_210:int, ldc:int(2028778341))
                        loopcontinue()
                    }
                    
                    var_0_210 = and:int(var_0_210:int, ldc:int(-2013205516))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_5_1FD = expr_BD:int
                        var_3_202 = newarray:byte[](byte.class, expr_BD:int)
                        var_4_203 = expr_BD:int
                        goto(Label_0621)
                    }
                }
                
                Label_0194:
                
                if (cmpne:boolean(and:int(var_0_210:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0158)
                }
                
                if (cmpeq:boolean(and:int(var_0_210:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_210:int, ldc:int(963229109))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1A4_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5), ldc:int(3)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8486), ldc:int(17542)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(6151), ldc:int(5)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(16740), ldc:int(-16749)), and:int(ldc:int(-15170), ldc:int(14657))))
            storeelement:String(expr_FC:String[], xor:int(ldc:int(-16381), ldc:int(-16377)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(23072), ldc:int(-23141)), and:int(ldc:int(5421), ldc:int(204))))
            storeelement:String(expr_FC:String[], xor:int(ldc:int(2145), ldc:int(2144)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(161), ldc:int(173)), xor:int(ldc:int(-30162), ldc:int(-30182))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(14467), ldc:int(26)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(3252), ldc:int(20532)), and:int(ldc:int(122), ldc:int(1099))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(19), ldc:int(1483)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(106), ldc:int(19786)), and:int(ldc:int(20596), ldc:int(86))))
            storeelement:String(expr_FC:String[], and:int(ldc:int(2992), ldc:int(-2993)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(91), ldc:int(15)), xor:int(ldc:int(47), ldc:int(117))))
            putstatic:String[](\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4::\uc31c\u8308\ube23\u071d\u071d\u47c2, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\ub171\u47c2\u8258\uc2bd\u8753(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AF : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BA : int
        
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
        var_3_6AF = and:int(ldc:int(-1674454415), ldc:int(-12779915))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8413\uc9f6\u8cae\u4cd9\u76bc\u5db4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1407878311))
            var_5_81 = and:int(ldc:int(1701), ldc:int(-9894))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-11923), ldc:int(11922)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6AF:int, ldc:int(-812352779))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(-16364), ldc:int(-16363)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(14848), ldc:int(14849)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6AF = and:int(var_3_DA:int, ldc:int(-822738953))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(769), ldc:int(2131)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1862846672))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2098889171))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(335770385))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(117988097))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0603)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1014344618))
                    }
                    else {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-850101669))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0603)
                            }
                            
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0419:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-486139979))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-818359315))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(542629542))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1382871619))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2114531829))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2025257078))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-811926533))
                        var_11_EB = and:int(ldc:int(4180), ldc:int(-4181))
                        goto(Label_1578)
                    }
                    
                    Label_0603:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1978127657))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(460775882))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1942234505))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0832)
                        }
                    }
                    
                    Label_0710:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1299467939))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(522304067))
                            goto(Label_0603)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(121088627))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1933903235))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0832:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(803893666))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(985751240))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1559257638))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-353763406))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0603)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1672842655))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1925292429))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(257), ldc:int(256))
                                goto(Label_1160)
                            }
                        }
                    }
                    
                    Label_0965:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1620738516))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1695093655))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(867662583))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1103878523))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1958751706))
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1514620735))
                            goto(Label_0603)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1157483585))
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(933844579))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1621468421))
                        var_11_EB = and:int(ldc:int(31760), ldc:int(-32147))
                    }
                    
                    Label_1160:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1874708555))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2101421627))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1964853256))
                            goto(Label_0603)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(94887362))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1914873089))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1418)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1692864892))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1438094750))
                            goto(Label_1160)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1062898578))
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0832)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0603)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0419)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1643761731))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-37748901))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1578)
                    }
                    
                    Label_1418:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1118933064))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1689906364))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(744673305))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0832)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-962346183))
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2081900533))
                        goto(Label_0603)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(291063669))
                        goto(Label_0419)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1156539640))
                        loopcontinue()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1345193103))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1578:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1589:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(359023154))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1414495350))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1195444064))
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1076697555))
                        goto(Label_0832)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0603)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2025598169))
                        goto(Label_0419)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-329327759))
                        var_17_6BA = add:int(var_16_119:int, xor:int(ldc:int(1040), ldc:int(1041)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1126704517))
                
                if (cmple:boolean(var_5_81 = var_17_6BA:int, sub:int(var_6_88:int, xor:int(ldc:int(21008), ldc:int(21009))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1891782786))
            goto(Label_0108)
        }
    }
}
