public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f {
    public void \u8df4\u6d99\u9033\u76bc\u76bc\u6b5f(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1, com.mojang.datafixers.DSL$TypeReference p2) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f, p0:Schema, xor:int[expected:boolean](ldc:int(16496), ldc:int(16497)))
            putfield:String(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\ud7e8\u8d98\u8df4\u5245\u61a4\uf9c5, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f, p1:String)
            putfield:DSL$TypeReference(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\u3776\u839e\u93a2\u8709\u5db4\u839e, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f, p2:DSL$TypeReference)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
            return:TypeRewriteRule(invokevirtual:TypeRewriteRule(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\ubff1\u6fb0\u2dcc\uc2bd\ub70c\u5db4, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f, getfield:String(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\ud7e8\u8d98\u8df4\u5245\u61a4\uf9c5, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f), invokevirtual:TaggedChoice$TaggedChoiceType(Schema::findChoiceType, invokevirtual:Schema(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::getInputSchema, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f), getfield:DSL$TypeReference(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\u3776\u839e\u93a2\u8709\u5db4\u839e, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f)), invokevirtual:TaggedChoice$TaggedChoiceType(Schema::findChoiceType, invokevirtual:Schema(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::getOutputSchema, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f), getfield:DSL$TypeReference(\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\u3776\u839e\u93a2\u8709\u5db4\u839e, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f))))
        }
        
        goto(Label_0006)
    }
    
    public final com.mojang.datafixers.TypeRewriteRule \ubff1\u6fb0\u2dcc\uc2bd\ub70c\u5db4(java.lang.String p0, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType<K> p1, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType<?> p2) {
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
    
    private java.util.function.Function lambda$\u3d4b\u3bd6\ub8be\u6d69\uc3e3\u6ec6$1(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.serialization.DynamicOps p1) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\u624e\u4179\u3bd6\ucfaf\u120d\u8258$0(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.datafixers.util.Pair p1) {
        stack_A9_0 : String [generated]
        expr_8C : Object[] [generated]
        
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
        
        if (invokevirtual:boolean(TaggedChoice$TaggedChoiceType::hasType, p0:TaggedChoice$TaggedChoiceType, invokevirtual:Object(Pair::getFirst, p1:Pair))) {
            return:Pair(p1:Pair)
        }
        
        stack_A9_0 = loadelement:String(getstatic:String[](\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\ud7e8\u120d\ud4fe\u927d\ua61f\u4c04), xor:int(ldc:int(4160), ldc:int(4161)))
        expr_8C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-16384), ldc:int(-16382)))
        storeelement:Object(expr_8C:Object[], and:int(ldc:int(1960), ldc:int(-2027)), invokevirtual:Object(Pair::getFirst, p1:Pair))
        storeelement:Object(expr_8C:Object[], and:int(ldc:int(5135), ldc:int(2209)), getfield:DSL$TypeReference[expected:Object](\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\u3776\u839e\u93a2\u8709\u5db4\u839e, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f))
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokestatic:String(String::format, stack_A9_0:String, expr_8C:Object[])))
    }
    
    static {
        var_0_219 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1A4_0 : byte[] [generated]
        stack_22B_0 : byte[] [generated]
        stack_265_0 : byte[] [generated]
        stack_2BA_0 : byte[] [generated]
        var_4_187 : int
        var_3_18C : byte[]
        var_5_18D : int
        var_0_19A : int
        expr_1A4 : byte [generated]
        stack_1E8_2 : byte [generated]
        stack_1C7_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_254 : byte[]
        var_5_255 : int
        expr_FE : int [generated]
        var_3_2A9 : byte[]
        var_5_2AA : int
        expr_2BD : byte [generated]
        var_3_132 : String
        stack_180_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_219 = and:int(ldc:int(1004874835), ldc:int(1971140343))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1A4_0 = stack_22B_0 = stack_265_0 = stack_2BA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("UJDcdoAIAoF9/SMFCGPc/3ggBIYFhRpY/nvhnQCABQx/eACDfAUf6oH8ewuHf2aH/w0aWl574xwa3YMHZ4YFY4Q=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_187 = expr_6B:int
        var_3_18C = newarray:byte[](byte.class, expr_6B:int)
        var_5_18D = expr_6B:int
        Label_0399:
        
        while (cmpeq:boolean(and:int(var_0_219:int, ldc:int(524288)), ldc:int(0))) {
            var_0_19A = and:int(var_0_219:int, ldc:int(-237526145))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_1A4 = stack_1E8_2 = loadelement(stack_1A4_0, var_5_18D)
            
            if (cmplt:boolean(add:int(add:int(var_5_18D:int, ldc:int(4)), neg:int(var_4_187:int)), ldc:int(0))) {
                stack_1E8_2 = stack_1C7_0 = add:byte(expr_1A4:byte, loadelement:byte(var_3_18C:byte[], add:int(var_5_18D:int, ldc:int(4))))
                goto(Label_0471)
            }
            
            Label_0433:
            
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(-661344001))
            }
            else {
                var_0_19A = and:int(var_0_19A:int, ldc:int(1970791319))
                stack_1E8_2 = stack_1C7_0 = add:byte(expr_1A4:byte, ldc:byte(4))
            }
            
            Label_0471:
            
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0433)
            }
            
            var_0_219 = and:int(var_0_19A:int, ldc:int(2077617303))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, stack_1E8_2:byte)
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1A4_0 = stack_22B_0 = stack_265_0 = stack_2BA_0 = var_3_18C:byte[]
            goto(Label_0112)
        }
        
        Label_0526:
        
        while (cmpne:boolean(and:int(var_0_219:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_219 = and:int(var_0_219:int, ldc:int(-209754217))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, xor:byte(loadelement:byte(stack_22B_0:byte[], var_5_18D:int), ldc:byte(56)))
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1A4_0 = stack_22B_0 = stack_265_0 = stack_2BA_0 = var_3_18C:byte[]
            goto(Label_0155)
        }
        
        var_0_219 = and:int(var_0_219:int, ldc:int(-582480816))
        goto(Label_0399)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(2)), ldc:int(0))) {
            var_0_219 = and:int(var_0_219:int, ldc:int(-2083629219))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(8)), ldc:int(0))) {
            var_0_219 = and:int(var_0_219:int, ldc:int(-1277825985))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_187 = expr_96:int
                var_3_18C = newarray:byte[](byte.class, expr_96:int)
                var_5_18D = expr_96:int
                goto(Label_0526)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_219:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_219:int, ldc:int(16384)), ldc:int(0))) {
            var_0_219 = and:int(var_0_219:int, ldc:int(1042444262))
        }
        else {
            if (cmpne:boolean(and:int(var_0_219:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_219 = and:int(var_0_219:int, ldc:int(2138384891))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_254 = newarray:byte[](byte.class, expr_C3:int)
                var_5_255 = expr_C3:int
                
                loop {
                    var_0_219 = and:int(var_0_219:int, ldc:int(961932147))
                    var_5_255 = add:int(var_5_255:int, ldc:int(-1))
                    storeelement:byte(var_3_254:byte[], var_5_255:int, add:int(shl:int(loadelement:byte(stack_265_0:byte[], var_5_255:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_255:int, xor:int(ldc:int(-32064), ldc:int(-32063)))), ldc:int(3)), xor:int(ldc:int(2371), ldc:int(2396)))))
                    
                    if (cmpne:boolean(var_5_255:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1A4_0 = stack_22B_0 = stack_265_0 = stack_2BA_0 = var_3_254:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(8192)), ldc:int(0))) {
            var_0_219 = and:int(var_0_219:int, ldc:int(356526769))
        }
        else {
            if (cmpne:boolean(and:int(var_0_219:int, ldc:int(32768)), ldc:int(0))) {
                var_0_219 = and:int(var_0_219:int, ldc:int(-1298082696))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_219 = and:int(var_0_219:int, ldc:int(1330027912))
                goto(Label_0112)
            }
            
            var_0_219 = and:int(var_0_219:int, ldc:int(2010115327))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2A9 = newarray:byte[](byte.class, expr_FE:int)
                var_5_2AA = expr_FE:int
                
                loop {
                    var_0_219 = and:int(var_0_219:int, ldc:int(-1109039241))
                    var_5_2AA = add:int(var_5_2AA:int, ldc:int(-1))
                    expr_2BD = add:byte(loadelement:byte(stack_2BA_0:byte[], var_5_2AA:int), ldc:byte(12))
                    storeelement:byte(var_3_2A9:byte[], var_5_2AA:int, or:int(and:int(shl:int(expr_2BD:byte, xor:int(ldc:int(16393), ldc:int(16397))), ldc:int(-16)), and:int(shr:int(expr_2BD:byte[expected:int], xor:int(ldc:int(1), ldc:int(5))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1A4_0 = stack_22B_0 = stack_265_0 = stack_2BA_0 = var_3_2A9:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_219:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_219 = and:int(var_0_219:int, ldc:int(-1132238457))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_180_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2101), ldc:int(2103)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(296), ldc:int(298)))
        storeelement:String(expr_144:String[], and:int(ldc:int(6996), ldc:int(-15191)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-32101), ldc:int(32068)), and:int(ldc:int(4666), ldc:int(170))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(1032), ldc:int(1033)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(42), ldc:int(22123)), and:int(ldc:int(1125), ldc:int(16464))))
        putstatic:String[](\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f::\ud7e8\u120d\ud4fe\u927d\ua61f\u4c04, expr_144:String[])
    }
    
    public void \u8df4\u5245\u7c6b\u62da\u3e75\u3dd3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_683 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_68E : int
        
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
        var_3_683 = and:int(ldc:int(-366187732), ldc:int(-1023826084))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8df4\u6d99\u9033\u76bc\u76bc\u6b5f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_683 = and:int(var_3_683:int, ldc:int(815784392))
        }
        else {
            var_3_683 = and:int(var_3_683:int, ldc:int(-471054532))
            var_5_85 = and:int(ldc:int(16658), ldc:int(-16659))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(15889), ldc:int(-16242)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_683:int, ldc:int(-886447201))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(20993), ldc:int(61)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2435), ldc:int(16385)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_683 = and:int(var_3_D2:int, ldc:int(-983271538))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2049), ldc:int(1169)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1616781330))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1756373928))
                    }
                    else {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-828321986))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0558)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0380:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-833223303))
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1900234725))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1698206096))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2039357625))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(2035414446))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-402255588))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-135217393))
                        var_11_E3 = and:int(ldc:int(-11737), ldc:int(11736))
                        goto(Label_1548)
                    }
                    
                    Label_0558:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-893214809))
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-834644233))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2037596824))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1123815828))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-196163470))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1373817151))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-681505905))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1970775982))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1297044845))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1362335408))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1335317175))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(373699985))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(2093923845))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-747646033))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-297167840))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1979939895))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1042252077))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1231723558))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-410246140))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-978926596))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(5025), ldc:int(81))
                                goto(Label_1154)
                            }
                        }
                    }
                    
                    Label_0973:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(116921759))
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1553263404))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1415766221))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1938307596))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1036761674))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1653489107))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-668475786))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-303681617))
                        var_11_E3 = and:int(ldc:int(25203), ldc:int(-25204))
                    }
                    
                    Label_1154:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(181864952))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(4)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(2014098215))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1416933014))
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(252775808))
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-353978643))
                            loopcontinue()
                        }
                        
                        var_3_683 = and:int(var_3_683:int, ldc:int(-424159443))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1285:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1568756171))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1154)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(1908681864))
                            goto(Label_0973)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-226963694))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(403436525))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                            var_3_683 = and:int(var_3_683:int, ldc:int(-1027866772))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1548)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-210793385))
                        goto(Label_1559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1340561674))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1835472557))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-689661263))
                        loopcontinue()
                    }
                    
                    var_3_683 = and:int(var_3_683:int, ldc:int(-572172498))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1548:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1559:
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-1891691001))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(256)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(1726642675))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(512)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-2071687364))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_683:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_683 = and:int(var_3_683:int, ldc:int(-903015585))
                        var_17_68E = add:int(var_16_111:int, and:int(ldc:int(2563), ldc:int(4105)))
                        looporswitchbreak()
                    }
                    
                    var_3_683 = and:int(var_3_683:int, ldc:int(59982848))
                }
                
                var_3_683 = and:int(var_3_683:int, ldc:int(-773092433))
                
                if (cmple:boolean(var_5_85 = var_17_68E:int, sub:int(var_6_8C:int, xor:int(ldc:int(17952), ldc:int(17953))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_683:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
