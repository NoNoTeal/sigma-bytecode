public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6 {
    public void \ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6, p0:Schema, p1:boolean)
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
            return:TypeRewriteRule(invokespecial:TypeRewriteRule(\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6::\u5245\ucef1\ubefe\u8389\ud36e\u9255, this:\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6, invokevirtual:Type(Schema::getTypeRaw, invokevirtual:Schema(\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6::getInputSchema, this:\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d))))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.TypeRewriteRule \u5245\ucef1\ubefe\u8389\ud36e\u9255(com.mojang.datafixers.types.Type<IS> p0) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u446c\u156b\u8753\u836c\u6bb9\u7bad$2(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.types.Type p3, com.mojang.datafixers.Typed p4) {
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
    
    private static com.mojang.serialization.Dynamic lambda$null$1(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::createInt, p0:Dynamic, and:int(ldc:int(-20288), ldc:int(827))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.IllegalStateException lambda$\uc2e8\u1833\uc4d2\u16f6\u61a4\u4cd9$0() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6::\u156b\uc9f6\u92ee\u7330\u4179\u3dd3), xor:int(ldc:int(1025), ldc:int(1030)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2E7 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_2AB_0 : byte[] [generated]
        stack_2FA_0 : byte[] [generated]
        stack_378_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_23B : byte[]
        var_4_23C : int
        expr_97 : int [generated]
        var_5_28C : int
        var_3_291 : byte[]
        var_4_292 : int
        var_0_314 : int
        expr_2FA : byte [generated]
        stack_343_2 : byte [generated]
        stack_317_0 : byte [generated]
        expr_D0 : int [generated]
        expr_100 : int [generated]
        var_3_366 : byte[]
        var_4_367 : int
        expr_37B : byte [generated]
        var_3_142 : String
        stack_232_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
            var_0_2E7 = and:int(ldc:int(1264179249), ldc:int(-1419153505))
            expr_68 = var_2_6C = stack_95_0 = stack_97_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_2AB_0 = stack_2FA_0 = stack_378_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AuoejGOT9YGdkGicH2MLYRLqGA9kl+qbDR0Zb5i1GJ/FPWOUxJwbMJIeQx/htpmfex0aHJgyGZ3CY+I3kJ98GppkGhaTvY5le/WBnZBonB9lCZ2f7ueYC5gf6p4QGxZilZuC6xrqHAqdFpyZG++In+KZ45/qnhAbFmSMmRPsj+Cb9YGdkGicH2eIGJPuDuWf6p2JjIA="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_23B = newarray:byte[](byte.class, expr_70:int)
                var_4_23C = expr_70:int
                
                loop {
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(242122067))
                    var_4_23C = add:int(var_4_23C:int, ldc:int(-1))
                    storeelement:byte(var_3_23B:byte[], var_4_23C:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_23C:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_23C:int, xor:int(ldc:int(581), ldc:int(580)))), ldc:int(3)), and:int(ldc:int(5663), ldc:int(8607)))))
                    
                    if (cmpne:boolean(var_4_23C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_2AB_0 = stack_2FA_0 = stack_378_0 = var_3_23B:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_2E7:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_0_2E7 = and:int(var_0_2E7:int, ldc:int(-565392801))
                expr_97 = arraylength:int(stack_97_0:byte[])
                
                if (cmpeq:boolean(expr_97:int, ldc:int(0))) {
                    goto(Label_0156)
                }
                
                var_5_28C = expr_97:int
                var_3_291 = newarray:byte[](byte.class, expr_97:int)
                var_4_292 = expr_97:int
                Label_0660:
                
                while (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(583846713))
                    var_4_292 = add:int(var_4_292:int, ldc:int(-1))
                    storeelement:byte(var_3_291:byte[], var_4_292:int, xor:byte(loadelement:byte(stack_2AB_0:byte[], var_4_292:int), ldc:byte(67)))
                    
                    if (cmpne:boolean(var_4_292:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_2AB_0 = stack_2FA_0 = stack_378_0 = var_3_291:byte[]
                    goto(Label_0156)
                }
                
                Label_0730:
                
                while (cmpeq:boolean(and:int(var_0_2E7:int, ldc:int(8)), ldc:int(0))) {
                    var_0_314 = and:int(var_0_2E7:int, ldc:int(-361005067))
                    var_4_292 = add:int(var_4_292:int, ldc:int(-1))
                    expr_2FA = stack_343_2 = loadelement(stack_2FA_0, var_4_292)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_292:int, ldc:int(3)), neg:int(var_5_28C:int)), ldc:int(0))) {
                        stack_343_2 = stack_317_0 = add:byte(expr_2FA:byte, loadelement:byte(var_3_291:byte[], add:int(var_4_292:int, ldc:int(3))))
                        goto(Label_0807)
                    }
                    
                    Label_0775:
                    
                    if (cmpne:boolean(and:int(var_0_314:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_314 = and:int(var_0_314:int, ldc:int(1249803799))
                        stack_343_2 = stack_317_0 = add:byte(expr_2FA:byte, ldc:byte(3))
                    }
                    
                    Label_0807:
                    
                    if (cmpne:boolean(and:int(var_0_314:int, ldc:int(536870912)), ldc:int(0))) {
                        var_0_314 = and:int(var_0_314:int, ldc:int(1511850314))
                        goto(Label_0775)
                    }
                    
                    var_0_2E7 = and:int(var_0_314:int, ldc:int(131877373))
                    storeelement:byte(var_3_291:byte[], var_4_292:int, stack_343_2:byte)
                    
                    if (cmpne:boolean(var_4_292:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_97_0 = stack_95_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_2AB_0 = stack_2FA_0 = stack_378_0 = var_3_291:byte[]
                    goto(Label_0213)
                }
                
                var_0_2E7 = and:int(var_0_2E7:int, ldc:int(-104211530))
                goto(Label_0660)
                Label_0156:
                
                if (cmpeq:boolean(and:int(var_0_2E7:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0261)
                }
                
                if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(-1275179454))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(256)), ldc:int(0))) {
                        var_0_2E7 = and:int(var_0_2E7:int, ldc:int(1626551961))
                        loopcontinue()
                    }
                    
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(1599032209))
                    expr_D0 = arraylength:int(stack_D0_0:byte[])
                    
                    if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                        var_5_28C = expr_D0:int
                        var_3_291 = newarray:byte[](byte.class, expr_D0:int)
                        var_4_292 = expr_D0:int
                        goto(Label_0730)
                    }
                }
                
                Label_0213:
                
                if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(524288)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0156)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(262144)), ldc:int(0))) {
                        var_0_2E7 = and:int(var_0_2E7:int, ldc:int(-1898396604))
                        loopcontinue()
                    }
                    
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(1465416339))
                    expr_100 = arraylength:int(stack_100_0:byte[])
                    
                    if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                        var_3_366 = newarray:byte[](byte.class, expr_100:int)
                        var_4_367 = expr_100:int
                        
                        loop {
                            var_0_2E7 = and:int(var_0_2E7:int, ldc:int(463362653))
                            var_4_367 = add:int(var_4_367:int, ldc:int(-1))
                            expr_37B = add:byte(loadelement:byte(stack_378_0:byte[], var_4_367:int), ldc:byte(97))
                            storeelement:byte(var_3_366:byte[], var_4_367:int, or:int(and:int(shl:int(expr_37B:byte, xor:int(ldc:int(18440), ldc:int(18444))), ldc:int(-16)), and:int(shr:int(expr_37B:byte[expected:int], xor:int(ldc:int(26627), ldc:int(26631))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_367:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_97_0 = stack_95_0 = stack_CE_0 = stack_D0_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_2AB_0 = stack_2FA_0 = stack_378_0 = var_3_366:byte[]
                    }
                }
                
                Label_0261:
                
                if (cmpne:boolean(and:int(var_0_2E7:int, ldc:int(8)), ldc:int(0))) {
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(-1822037680))
                    goto(Label_0213)
                }
                
                if (cmpeq:boolean(and:int(var_0_2E7:int, ldc:int(16)), ldc:int(0))) {
                    var_0_2E7 = and:int(var_0_2E7:int, ldc:int(1831686147))
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_0_2E7:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_232_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16965), ldc:int(16973)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(606), ldc:int(8233)))
            storeelement:String(expr_154:String[], xor:int(ldc:int(4102), ldc:int(4096)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-3886), ldc:int(3373)), xor:int(ldc:int(2049), ldc:int(2065))))
            storeelement:String(expr_154:String[], and:int(ldc:int(5261), ldc:int(16385)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32606), ldc:int(-32590)), and:int(ldc:int(21946), ldc:int(538))))
            storeelement:String(expr_154:String[], and:int(ldc:int(8711), ldc:int(6471)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(6742), ldc:int(6732)), and:int(ldc:int(216), ldc:int(17514))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(18564), ldc:int(18560)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2843), ldc:int(2899)), xor:int(ldc:int(-31686), ldc:int(-31639))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(2572), ldc:int(2575)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(2143), ldc:int(21747)), xor:int(ldc:int(83), ldc:int(32))))
            storeelement:String(expr_154:String[], and:int(ldc:int(15493), ldc:int(-16262)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(16710), ldc:int(16693)), and:int(ldc:int(9724), ldc:int(4223))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(16480), ldc:int(16485)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(6268), ldc:int(8828)), xor:int(ldc:int(570), ldc:int(689))))
            storeelement:String(expr_154:String[], and:int(ldc:int(542), ldc:int(16642)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(1179), ldc:int(907)), and:int(ldc:int(3477), ldc:int(8852))))
            putstatic:String[](\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6::\u156b\uc9f6\u92ee\u7330\u4179\u3dd3, expr_154:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u416d\u7873\u494c\ub6ab\uc7fe\uae87(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A8 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6B3 : int
        
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
        var_3_6A8 = and:int(ldc:int(-833339028), ldc:int(-212479795))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\u4daf\u56bd\uc3e3\u8c8a\u7af6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-93197590))
            var_5_81 = and:int(ldc:int(-27045), ldc:int(2468))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14539), ldc:int(14410)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6A8:int, ldc:int(-765926838))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(12832), ldc:int(12833)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(12309), ldc:int(2313)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6A8 = and:int(var_3_DA:int, ldc:int(-201357827))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(5), ldc:int(20993)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1276511991))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-918050071))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(597778827))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-160202120))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1520918519))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(915134987))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1983551441))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-807636357))
                        var_11_EB = and:int(ldc:int(-25592), ldc:int(16855))
                        goto(Label_1589)
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-58475538))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1623643367))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1945407596))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1291310256))
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(333597593))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1342600918))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-430005895))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1002691354))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-484209029))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-531844176))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1346099087))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1035134437))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-495658021))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-519929935))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1149230813))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(221524129))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-805656863))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-466236333))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1201846901))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-898086162))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-29695), ldc:int(-29696))
                                goto(Label_1173)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(806449219))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(850254970))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1759594210))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1182758452))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-371256036))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(409765202))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1406056203))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-153666948))
                        var_11_EB = and:int(ldc:int(26451), ldc:int(-28500))
                    }
                    
                    Label_1173:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1140424544))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1069971573))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1939091026))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1287224397))
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1513324577))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-727458822))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-220616194))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-542355795))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1009886452))
                            goto(Label_1173)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-3724220))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1829167141))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-480644002))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1452:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(568789069))
                        goto(Label_1173)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(450396915))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1344327835))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1783850504))
                        loopcontinue()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1034382993))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B3 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1201518119))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(859157709))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-545835683))
                        var_17_6B3 = add:int(var_16_119:int, and:int(ldc:int(27911), ldc:int(65)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1839605644))
                }
                
                var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-285957299))
                
                if (cmple:boolean(var_5_81 = var_17_6B3:int, sub:int(var_6_88:int, xor:int(ldc:int(528), ldc:int(529))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(16)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1407847597))
            goto(Label_0108)
        }
    }
}
