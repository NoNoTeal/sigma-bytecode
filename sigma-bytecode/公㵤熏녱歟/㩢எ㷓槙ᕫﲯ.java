public class \u516c\u3d64\u718f\ub171\u6b5f.\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf {
    public void \u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf, p0:Schema, p1:boolean)
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
    
    private com.mojang.serialization.Dynamic<?> \uafe7\u5245\ubb2b\u1833\u965f\u873d(com.mojang.serialization.Dynamic<?> p0) {
        var_4_72 : Optional
        var_5_229 : Dynamic
        var_6_9E : Optional
        var_7_C0 : Optional
        var_8_E2 : Optional
        var_9_104 : Optional
        
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
        var_4_72 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(779), ldc:int(777)))))
        
        if (invokevirtual:boolean(Optional::isPresent, var_4_72:Optional)) {
            var_5_229 = checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_4_72:Optional<Dynamic>))
            var_6_9E = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(1222), ldc:int(1221)))))
            
            if (invokevirtual:boolean(Optional::isPresent, var_6_9E:Optional)) {
                var_5_229 = invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(1291), ldc:int(15079)))), loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(6660), ldc:int(16783))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_6_9E:Optional<Dynamic>)))
            }
            
            var_7_C0 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(8335), ldc:int(5173)))))
            
            if (invokevirtual:boolean(Optional::isPresent, var_7_C0:Optional)) {
                var_5_229 = invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(12231), ldc:int(4149)))), loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(36), ldc:int(34))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_7_C0:Optional<Dynamic>))), loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(-32755), ldc:int(-32758))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_7_C0:Optional<Dynamic>)))
            }
            
            var_8_E2 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(643), ldc:int(651)))))
            
            if (invokevirtual:boolean(Optional::isPresent, var_8_E2:Optional)) {
                var_5_229 = invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(43), ldc:int(19544)))), loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(15643), ldc:int(557))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_8_E2:Optional<Dynamic>)))
            }
            
            var_9_104 = invokevirtual:Optional(OptionalDynamic::result, invokevirtual:OptionalDynamic(Dynamic::get, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(25114), ldc:int(139)))))
            
            if (invokevirtual:boolean(Optional::isPresent, var_9_104:Optional)) {
                var_5_229 = invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, var_5_229:Dynamic, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(11782), ldc:int(11788)))), loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), and:int(ldc:int(12427), ldc:int(17231))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_9_104:Optional<Dynamic>))), loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(152), ldc:int(148))), checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokevirtual:Dynamic(Optional<Dynamic>::get, var_9_104:Optional<Dynamic>)))
            }
            
            return:Dynamic<?>(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic<?>, loadelement:String(getstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c), xor:int(ldc:int(1349), ldc:int(1351))), var_5_229:Dynamic))
        }
        
        return:Dynamic<?>(p0:Dynamic<?>)
    }
    
    private com.mojang.datafixers.Typed lambda$\u3d64\u516c\u7873\u7006\u4ab3\u600f$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private com.mojang.datafixers.Typed lambda$\ub1b9\u7049\ubded\u6b5f\u97b7\ucef1$0(com.mojang.datafixers.Typed p0) {
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
            return:Typed(invokevirtual:Typed(Typed::update, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:(L\u516c\u3d64\u718f\ub171\u6b5f/\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf;)Ljava/util/function/Function;, this:\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2CB : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_2E4_0 : byte[] [generated]
        stack_31E_0 : byte[] [generated]
        stack_391_0 : byte[] [generated]
        stack_3FD_0 : byte[] [generated]
        var_4_2B8 : int
        var_3_2BD : byte[]
        var_5_2BE : int
        expr_394 : byte [generated]
        var_0_3F3 : int
        expr_3FD : byte [generated]
        stack_42B_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_30D : byte[]
        var_5_30E : int
        expr_CB : int [generated]
        expr_FE : int [generated]
        var_3_13A : String
        stack_2B1_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_2CB = and:int(ldc:int(1628246790), ldc:int(1991622598))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_2E4_0 = stack_31E_0 = stack_391_0 = stack_3FD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BkCEvo6YwoCovH6ktIaatuCAJPjGQIS+jpjCgH7q/KS+jIi8pL6KetjelL6ogpq6oI6clqTChlBGqrbMypK8roSOuN6UvqiCmqS0ipK8roSOuN6UvqiCmqZqhsZ4qsimbJiwhsq6tph2uNaCgoagqrq2mHa41oKChI6W3LK0vpCGkLK2uJKcuKKieoqkoKTYrJxgdt1dOg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_2B8 = expr_6B:int
        var_3_2BD = newarray:byte[](byte.class, expr_6B:int)
        var_5_2BE = expr_6B:int
        Label_0704:
        
        while (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0869)
            }
            
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-1657850196))
            var_5_2BE = add:int(var_5_2BE:int, ldc:int(-1))
            storeelement:byte(var_3_2BD:byte[], var_5_2BE:int, xor:byte(loadelement:byte(stack_2E4_0:byte[], var_5_2BE:int), ldc:byte(26)))
            
            if (cmpne:boolean(var_5_2BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_2E4_0 = stack_31E_0 = stack_391_0 = stack_3FD_0 = var_3_2BD:byte[]
            goto(Label_0112)
        }
        
        var_0_2CB = and:int(var_0_2CB:int, ldc:int(-2068883006))
        goto(Label_0985)
        Label_0869:
        
        while (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(32)), ldc:int(0))) {
                var_0_2CB = and:int(var_0_2CB:int, ldc:int(1992798892))
                goto(Label_0704)
            }
            
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-1164460266))
            var_5_2BE = add:int(var_5_2BE:int, ldc:int(-1))
            expr_394 = add:byte(loadelement:byte(stack_391_0:byte[], var_5_2BE:int), ldc:byte(27))
            storeelement:byte(var_3_2BD:byte[], var_5_2BE:int, or:int(and:int(shl:int(expr_394:byte, and:int(ldc:int(18436), ldc:int(341))), ldc:int(-16)), and:int(shr:int(expr_394:byte[expected:int], and:int(ldc:int(4133), ldc:int(26766))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_2E4_0 = stack_31E_0 = stack_391_0 = stack_3FD_0 = var_3_2BD:byte[]
            goto(Label_0208)
        }
        
        var_0_2CB = and:int(var_0_2CB:int, ldc:int(-1759222414))
        Label_0985:
        
        while (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(64)), ldc:int(0))) {
                var_0_2CB = and:int(var_0_2CB:int, ldc:int(1959835309))
                goto(Label_0704)
            }
            
            var_0_3F3 = and:int(var_0_2CB:int, ldc:int(-1764385977))
            var_5_2BE = add:int(var_5_2BE:int, ldc:int(-1))
            expr_3FD = loadelement:byte(stack_3FD_0:byte[], var_5_2BE:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_2BE:int, ldc:int(2)), neg:int(var_4_2B8:int)), ldc:int(0))) {
                var_0_3F3 = and:int(var_0_3F3:int, ldc:int(-1035517985))
                stack_42B_2 = add:byte(expr_3FD:byte, ldc:byte(2))
            }
            else {
                stack_42B_2 = add:byte(expr_3FD:byte, loadelement:byte(var_3_2BD:byte[], add:int(var_5_2BE:int, ldc:int(2))))
            }
            
            var_0_2CB = and:int(var_0_3F3:int, ldc:int(-834331787))
            storeelement:byte(var_3_2BD:byte[], var_5_2BE:int, stack_42B_2:byte)
            
            if (cmpne:boolean(var_5_2BE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_2E4_0 = stack_31E_0 = stack_391_0 = stack_3FD_0 = var_3_2BD:byte[]
            goto(Label_0259)
        }
        
        goto(Label_0869)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(1612362703))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(4)), ldc:int(0))) {
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-7990145))
        }
        else {
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(79680359))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_30D = newarray:byte[](byte.class, expr_A0:int)
                var_5_30E = expr_A0:int
                
                loop {
                    var_0_2CB = and:int(var_0_2CB:int, ldc:int(343773877))
                    var_5_30E = add:int(var_5_30E:int, ldc:int(-1))
                    storeelement:byte(var_3_30D:byte[], var_5_30E:int, add:int(shl:int(loadelement:byte(stack_31E_0:byte[], var_5_30E:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_30E:int, xor:int(ldc:int(8704), ldc:int(8705)))), ldc:int(5)), xor:int(ldc:int(4610), ldc:int(4613)))))
                    
                    if (cmpne:boolean(var_5_30E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_2E4_0 = stack_31E_0 = stack_391_0 = stack_3FD_0 = var_3_30D:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_2CB = and:int(var_0_2CB:int, ldc:int(698464329))
                goto(Label_0112)
            }
            
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-1986169337))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_2B8 = expr_CB:int
                var_3_2BD = newarray:byte[](byte.class, expr_CB:int)
                var_5_2BE = expr_CB:int
                goto(Label_0869)
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(64)), ldc:int(0))) {
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(547941724))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(512)), ldc:int(0))) {
                var_0_2CB = and:int(var_0_2CB:int, ldc:int(260569830))
                goto(Label_0112)
            }
            
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-978362716))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_4_2B8 = expr_FE:int
                var_3_2BD = newarray:byte[](byte.class, expr_FE:int)
                var_5_2BE = expr_FE:int
                goto(Label_0985)
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_2CB:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-152054092))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_2CB:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_2CB = and:int(var_0_2CB:int, ldc:int(-2059146875))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2B1_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10243), ldc:int(10254)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5258), ldc:int(5255)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(9157), ldc:int(6161)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-30070), ldc:int(21845)), xor:int(ldc:int(-28652), ldc:int(-28672))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(8723), ldc:int(1062)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-16368), ldc:int(-16380)), xor:int(ldc:int(213), ldc:int(203))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(107), ldc:int(8)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(5150), ldc:int(16574)), xor:int(ldc:int(-26480), ldc:int(-26445))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(649), ldc:int(25)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(1699), ldc:int(43)), and:int(ldc:int(435), ldc:int(8753))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(5507), ldc:int(2135)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(5109), ldc:int(18489)), and:int(ldc:int(18175), ldc:int(8247))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(31596), ldc:int(-31597)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(2743), ldc:int(9279)), xor:int(ldc:int(1160), ldc:int(1204))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(1161), ldc:int(1154)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(3132), ldc:int(21501)), and:int(ldc:int(29259), ldc:int(207))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(10285), ldc:int(10273)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-20440), ldc:int(-20381)), and:int(ldc:int(2150), ldc:int(17524))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(29319), ldc:int(295)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(18548), ldc:int(869)), xor:int(ldc:int(24901), ldc:int(24874))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(8261), ldc:int(8259)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(367), ldc:int(8815)), and:int(ldc:int(8829), ldc:int(1277))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(4623), ldc:int(90)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(12669), ldc:int(125)), xor:int(ldc:int(-24482), ldc:int(-24353))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(28973), ldc:int(69)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-32067), ldc:int(-32196)), xor:int(ldc:int(12895), ldc:int(13017))))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(4613), ldc:int(4609)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-32459), ldc:int(-32333)), xor:int(ldc:int(26768), ldc:int(26630))))
        putstatic:String[](\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf::\u8709\u8389\u6fb0\u3c25\u836c\u647c, expr_14C:String[])
    }
    
    public void \u839e\u416d\u5245\u759a\u6bb9\ub171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_659 : int
        
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
        var_3_64E = and:int(ldc:int(1798687903), ldc:int(1802487375))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u0b8e\u3dd3\u69d9\u156b\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(2133970527))
            var_5_7D = and:int(ldc:int(4299), ldc:int(-4588))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1247), ldc:int(-9952)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_64E:int, ldc:int(-21495810))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, and:int(ldc:int(8207), ldc:int(23121)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(72), ldc:int(73)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_64E = and:int(var_3_D6:int, ldc:int(-343935506))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(8200), ldc:int(8201)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1969596992))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-422517173))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2056467641))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1110399684))
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1444892446))
                    }
                    else {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2066207855))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0558)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-894797517))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1873456841))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-340144162))
                        var_11_E7 = and:int(ldc:int(7568), ldc:int(-7569))
                        goto(Label_1483)
                    }
                    
                    Label_0558:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2131042719))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(433611037))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(296198359))
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(864244337))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-356792706))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0677:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(507989375))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1547268801))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1450409509))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1333685748))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-84028289))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1341352957))
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(446182300))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1922016717))
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1847906))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = xor:int(ldc:int(-30528), ldc:int(-30527))
                                goto(Label_1088)
                            }
                        }
                    }
                    
                    Label_0916:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1500179241))
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1227409813))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1373704554))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1405498753))
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-979360678))
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(149552536))
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2075655518))
                        var_11_E7 = and:int(ldc:int(-11029), ldc:int(11028))
                    }
                    
                    Label_1088:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1560817008))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1424225010))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(831200729))
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1301238232))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-26346338))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1352)
                            }
                        }
                    }
                    
                    Label_1211:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-621433116))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1088)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(254139205))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-199457571))
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(113241026))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(223897512))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1853220015))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1483)
                    }
                    
                    Label_1352:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1494)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1879945649))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(175503386))
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1383477042))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1196309824))
                        loopcontinue()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(2059257166))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1483:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_659 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1494:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1639067051))
                        goto(Label_1352)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(479627329))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1911237390))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-2022887887))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-21379138))
                        var_17_659 = add:int(var_16_115:int, and:int(ldc:int(19073), ldc:int(8493)))
                        looporswitchbreak()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(1832488294))
                }
                
                var_3_64E = and:int(var_3_64E:int, ldc:int(1869345983))
                
                if (cmple:boolean(var_5_7D = var_17_659:int, sub:int(var_6_84:int, xor:int(ldc:int(7184), ldc:int(7185))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(65536)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(-1765274931))
            goto(Label_0106)
        }
    }
}
