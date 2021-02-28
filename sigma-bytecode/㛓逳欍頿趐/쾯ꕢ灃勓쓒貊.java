public class \u36d3\u9033\u6b0d\u983f\u8d90.\ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a {
    public void \ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u72f1\uc4d2\u64ab\u8350\u4975\u3c25$2(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u8413\ua61f\u494c\u76bc\u3a62\u983f$0(com.mojang.serialization.Dynamic p0) {
        var_1_5F : int
        var_3_75 : Optional
        var_1_15E : int
        var_4_8E : int[]
        var_5_99 : int[]
        var_6_A2 : int
        var_7_DC : int
        var_10_141 : int
        stack_171_0 : int[] [generated]
        stack_171_1 : int [generated]
        stack_171_2 : int [generated]
        var_6_CC : int
        
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
        var_1_5F = and:int(ldc:int(-1715737495), ldc:int(461307255))
        var_3_75 = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asIntStreamOpt, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a::\u8aa5\u759a\u88c5\u6d99\uf9c5\ub6ab), xor:int(ldc:int(1058), ldc:int(1056))))))
        
        if (invokevirtual:boolean(Optional::isPresent, var_3_75:Optional)) {
            var_1_15E = and:int(var_1_5F:int, ldc:int(481869299))
            var_4_8E = invokeinterface:int[](IntStream::toArray, checkcast:IntStream(java.util.stream.IntStream.class, invokevirtual:IntStream(Optional<IntStream>::get, var_3_75:Optional<IntStream>)))
            var_5_99 = newarray:int[](int.class, xor:int(ldc:int(221), ldc:int(1245)))
            var_6_A2 = and:int(ldc:int(19240), ldc:int(-27561))
            
            while (cmplt:boolean(var_6_A2:int, and:int(ldc:int(2052), ldc:int(974)))) {
                var_7_DC = and:int(ldc:int(18788), ldc:int(-19309))
                
                loop {
                    if (cmpeq:boolean(and:int(var_1_15E:int, ldc:int(262144)), ldc:int(0))) {
                        var_1_15E = and:int(var_1_15E:int, ldc:int(1576492272))
                        
                        if (cmplt:boolean(var_7_DC:int, xor:int(ldc:int(14339), ldc:int(14343)))) {
                            var_10_141 = or:int(shl:int(add:int(shl:int(var_6_A2:int, and:int(ldc:int(16390), ldc:int(8338))), and:int(ldc:int(1362), ldc:int(16395))), and:int(ldc:int(1148), ldc:int(4485))), add:int(shl:int(var_7_DC:int, xor:int(ldc:int(8322), ldc:int(8320))), xor:int(ldc:int(2704), ldc:int(2706))))
                            stack_171_0 = var_5_99:int[]
                            stack_171_1 = or:int(shl:int(var_6_A2:int, and:int(ldc:int(13570), ldc:int(514))), var_7_DC:int)
                            
                            if (cmpge:boolean(var_10_141:int, arraylength:int(var_4_8E:int[]))) {
                                var_1_15E = and:int(var_1_15E:int, ldc:int(951946623))
                                stack_171_2 = ldc:int(-1)
                            }
                            else {
                                stack_171_2 = loadelement:int(var_4_8E:int[], var_10_141:int)
                            }
                            
                            var_1_15E = and:int(var_1_15E:int, ldc:int(-29753744))
                            storeelement:int(stack_171_0:int[], stack_171_1:int, stack_171_2:int)
                            inc:int(var_7_DC, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_15E:int, ldc:int(33554432)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_15E = and:int(var_1_15E:int, ldc:int(456723835))
                inc:int(var_6_A2, ldc:int(1))
            }
            
            var_6_CC = and:int(ldc:int(2187), ldc:int(12597))
            
            while (cmplt:boolean(var_6_CC:int, ldc:int(64))) {
                invokestatic:void(System::arraycopy, var_5_99:int[][expected:Object], and:int(ldc:int(16699), ldc:int(-16700)), var_5_99:int[][expected:Object], mul:int(var_6_CC:int, ldc:int(16)), ldc:int(16))
                inc:int(var_6_CC, ldc:int(1))
            }
            
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, loadelement:String(getstatic:String[](\ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a::\u8aa5\u759a\u88c5\u6d99\uf9c5\ub6ab), and:int(ldc:int(18950), ldc:int(35))), invokevirtual:Dynamic(Dynamic::createIntList, p0:Dynamic, invokestatic:IntStream(Arrays::stream, var_5_99:int[]))))
        }
        
        return:Dynamic(p0:Dynamic)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_BD_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_1F5_0 : byte[] [generated]
        stack_24A_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_162 : int
        var_3_167 : byte[]
        var_5_168 : int
        var_0_190 : int
        expr_178 : byte [generated]
        stack_1C4_2 : byte [generated]
        stack_19B_0 : byte [generated]
        var_0_7B : int
        var_2_95 : byte[]
        expr_99 : int [generated]
        var_3_1E4 : byte[]
        var_5_1E5 : int
        expr_BD : int [generated]
        var_3_239 : byte[]
        var_5_23A : int
        expr_24D : byte [generated]
        var_3_F2 : String
        stack_15B_0 : String[] [generated]
        expr_104 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-1070089003), ldc:int(-115868707))
            expr_65 = stack_95_0 = stack_97_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1F5_0 = stack_24A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("6iICCPnv+BwC8gnz0zUA9Pge8gkH7w=="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_162 = expr_6B:int
                var_3_167 = newarray:byte[](byte.class, expr_6B:int)
                var_5_168 = expr_6B:int
                
                loop {
                    var_0_190 = and:int(var_0_5F:int, ldc:int(-748961833))
                    var_5_168 = add:int(var_5_168:int, ldc:int(-1))
                    expr_178 = stack_1C4_2 = loadelement(expr_65, var_5_168)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_168:int, ldc:int(1)), neg:int(var_4_162:int)), ldc:int(0))) {
                        stack_1C4_2 = stack_19B_0 = add:byte(expr_178:byte, loadelement:byte(var_3_167:byte[], add:int(var_5_168:int, ldc:int(1))))
                        goto(Label_0427)
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_0_190:int, ldc:int(536870912)), ldc:int(0))) {
                        var_0_190 = and:int(var_0_190:int, ldc:int(435824862))
                    }
                    else {
                        var_0_190 = and:int(var_0_190:int, ldc:int(-566887425))
                        stack_1C4_2 = stack_19B_0 = add:byte(expr_178:byte, ldc:byte(1))
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_0_190:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_190 = and:int(var_0_190:int, ldc:int(1293280684))
                        goto(Label_0389)
                    }
                    
                    var_0_5F = and:int(var_0_190:int, ldc:int(-312749841))
                    storeelement:byte(var_3_167:byte[], var_5_168:int, stack_1C4_2:byte)
                    
                    if (cmpne:boolean(var_5_168:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1F5_0 = stack_24A_0 = var_3_167:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_5F:int, ldc:int(394733202))
                    goto(Label_0194)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_5F:int, ldc:int(-1533941421))
                }
                else {
                    var_0_7B = and:int(var_0_5F:int, ldc:int(-841482257))
                    var_2_95 = stack_95_0:byte[]
                    expr_99 = add:int(arraylength:int(stack_97_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_3_1E4 = newarray:byte[](byte.class, expr_99:int)
                        var_5_1E5 = expr_99:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(-1051601195))
                            var_5_1E5 = add:int(var_5_1E5:int, ldc:int(-1))
                            storeelement:byte(var_3_1E4:byte[], var_5_1E5:int, add:int(shl:int(loadelement:byte(stack_1F5_0:byte[], var_5_1E5:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_95:byte[], add:int(var_5_1E5:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), ldc:int(4)), and:int(ldc:int(1247), ldc:int(14383)))))
                            
                            if (cmpne:boolean(var_5_1E5:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1F5_0 = stack_24A_0 = var_3_1E4:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(1)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_7B:int, ldc:int(-1759285030))
                        loopcontinue()
                    }
                    
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-921199643))
                    expr_BD = arraylength:int(stack_BD_0:byte[])
                    
                    if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                        var_3_239 = newarray:byte[](byte.class, expr_BD:int)
                        var_5_23A = expr_BD:int
                        
                        loop {
                            var_0_7B = and:int(var_0_7B:int, ldc:int(-906889777))
                            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
                            expr_24D = add:byte(loadelement:byte(stack_24A_0:byte[], var_5_23A:int), ldc:byte(1))
                            storeelement:byte(var_3_239:byte[], var_5_23A:int, xor:int(or:int(and:int(shl:int(expr_24D:byte, and:int(ldc:int(9316), ldc:int(20743))), ldc:int(-16)), and:int(shr:int(expr_24D:byte[expected:int], xor:int(ldc:int(2065), ldc:int(2069))), ldc:int(15))), ldc:int(100)))
                            
                            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_BB_0 = stack_BD_0 = stack_E6_0 = stack_1F5_0 = stack_24A_0 = var_3_239:byte[]
                    }
                }
                
                Label_0194:
                
                if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(64)), ldc:int(0))) {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-174251047))
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7B:int, ldc:int(-1606970892))
            }
            
            var_3_F2 = initobject:String(String::<init>, stack_E6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15B_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2818), ldc:int(2817)))
            expr_104 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16907), ldc:int(231)))
            storeelement:String(expr_104:String[], xor:int(ldc:int(5248), ldc:int(5250)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, and:int(ldc:int(-1660), ldc:int(1659)), xor:int(ldc:int(-30461), ldc:int(-30459))))
            storeelement:String(expr_104:String[], xor:int(ldc:int(20768), ldc:int(20769)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, xor:int(ldc:int(275), ldc:int(277)), and:int(ldc:int(5144), ldc:int(25106))))
            storeelement:String(expr_104:String[], and:int(ldc:int(10513), ldc:int(-10514)), invokevirtual:String[expected:String](String::substring, var_3_F2:String, xor:int(ldc:int(12426), ldc:int(12442)), and:int(ldc:int(341), ldc:int(18071))))
            putstatic:String[](\ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a::\u8aa5\u759a\u88c5\u6d99\uf9c5\ub6ab, expr_104:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud158\u9033\u0c95\u4bc8\u3e2a\u64f2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_633 : int
        var_5_7E : int
        var_6_85 : int
        var_7_94 : double
        var_9_BC : double
        var_3_CE : int
        var_11_DF : int
        var_14_109 : double
        var_16_10D : int
        var_12_105 : double
        var_17_63E : int
        
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
        var_3_633 = and:int(ldc:int(-1784274068), ldc:int(1996470116))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucfaf\ua562\u7043\u52d3\uc4d2\u8c8a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0168)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(301886124))
            var_5_7E = and:int(ldc:int(-10952), ldc:int(2627))
            var_6_85 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_94 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13656), ldc:int(-13689)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CE = and:int(var_3_633:int, ldc:int(482308079))
                    var_9_BC = sub:double(var_7_94:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DF = var_5_7E:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DF:int, sub:int(var_6_85:int, xor:int(ldc:int(-22496), ldc:int(-22495)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DF:int, and:int(ldc:int(2881), ldc:int(1)))), var_7_94:double))) {
                        inc:int(var_11_DF, ldc:int(1))
                    }
                    
                    var_3_633 = and:int(var_3_CE:int, ldc:int(-1610641428))
                    var_14_109 = var_7_94:double
                    var_16_10D = var_11_DF:int
                }
                else {
                    var_11_DF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7E:int), xor:int(ldc:int(13313), ldc:int(13312)))
                    var_12_105 = var_14_109 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E)
                    
                    if (cmplt:boolean(var_16_10D = var_11_DF:int, var_6_85:int)) {
                        var_9_BC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DF:int)
                        var_16_10D = var_11_DF:int
                        var_14_109 = var_12_105:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1030528191))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1564408774))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1772789138))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-874263449))
                    }
                    else {
                        var_3_633 = and:int(var_3_633:int, ldc:int(396847655))
                        
                        if (cmplt:boolean(var_16_10D:int, var_6_85:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0561)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-793914265))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-643035008))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1747618159))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-816742517))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-155209043))
                        var_11_DF = and:int(ldc:int(-9256), ldc:int(9255))
                        goto(Label_1474)
                    }
                    
                    Label_0561:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-440869365))
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-517832592))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-51623018))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-692826922))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1010566331))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(939513653))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_109 = var_9_BC:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1354503982))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-598743317))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-289534161))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1866968927))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-16825539))
                        var_14_109 = mul:double(ldc:double(0.5), add:double(var_9_BC:double, var_14_109:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1943483496))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(125174916))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-849515809))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1812556249))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7E:int), var_7_94:double)) {
                                var_11_DF = xor:int(ldc:int(2080), ldc:int(2081))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0940:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-14232686))
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-2083680757))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1729530930))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1768183489))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1312942363))
                        var_11_DF = and:int(ldc:int(-14626), ldc:int(14593))
                    }
                    
                    Label_1099:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(803333684))
                        goto(Label_1367)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0940)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(2060818093))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-883635622))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(482108193))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(297246718))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DF:int, ldc:int(0))) {
                                goto(Label_1367)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1752445022))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(180810910))
                            goto(Label_1099)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1171403417))
                            goto(Label_0940)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-261828632))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1654772055))
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1245726044))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_109:double, var_5_7E:int, var_16_10D:int)
                            goto(Label_1474)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1367:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(161523119))
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(-54616283))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_109:double, ldc:double(0.0))
                    Label_1474:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63E = var_5_7E:int
                        
                        if (cmpeq:boolean(var_11_DF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1485:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(2047870107))
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1295881784))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(32)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1911546476))
                        var_17_63E = add:int(var_16_10D:int, and:int(ldc:int(2563), ldc:int(16417)))
                        looporswitchbreak()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(280179542))
                }
                
                var_3_633 = and:int(var_3_633:int, ldc:int(-55137562))
                
                if (cmple:boolean(var_5_7E = var_17_63E:int, sub:int(var_6_85:int, xor:int(ldc:int(184), ldc:int(185))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0168:
        
        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
