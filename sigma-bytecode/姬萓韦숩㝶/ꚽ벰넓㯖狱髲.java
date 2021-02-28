public class \u59ec\u8413\u97e6\uc229\u3776.\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2 {
    public void \ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::<init>, this:\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerBlockEntities(com.mojang.datafixers.schemas.Schema p0) {
        var_4_65 : Map
        
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
            var_4_65 = invokespecial:Map(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::registerBlockEntities, this:\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2[expected:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8], p0:Schema)
            invokevirtual:void(Schema::registerSimple, p0:Schema, var_4_65:Map, loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), and:int(ldc:int(214), ldc:int(-215))))
            return:Map<String, Supplier<TypeTemplate>>(var_4_65:Map)
        }
        
        goto(Label_0006)
    }
    
    public void registerTypes(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p2) {
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
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u120d\uc87f\u385b\ubcb0\u6bb9\ua068$2() {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::constType, invokestatic:Type<String>(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ub113\u3c25\u9a18\uc7fe\u8640\ud523)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u8cae\ufcaf\u4f52\u600f\u9937\u3e2a$1() {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::constType, invokestatic:Type<String>(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ub113\u3c25\u9a18\uc7fe\u8640\ud523)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u2dcc\u98a4\u59ec\u927d\u71ae\u5f50$0(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), and:int(ldc:int(8705), ldc:int(4107))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), and:int(ldc:int(26), ldc:int(28166))), invokestatic:TypeTemplate(DSL::compoundList, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8350\u5654\u93a2\u9af2\u5140\u0a06), p0:Schema), invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::string)))), loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), and:int(ldc:int(16403), ldc:int(779))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), xor:int(ldc:int(20484), ldc:int(20486))), invokestatic:TypeTemplate(DSL::compoundList, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u3e75\u8df4\u446c\uc31c\uc31c\u3a62), p0:Schema), invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::string)))), loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), xor:int(ldc:int(-7167), ldc:int(-7163))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), and:int(ldc:int(8195), ldc:int(210))), invokestatic:TypeTemplate(DSL::compoundList, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u3e75\u8df4\u446c\uc31c\uc31c\u3a62), p0:Schema), invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::string)))), loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), xor:int(ldc:int(4623), ldc:int(4618))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3), and:int(ldc:int(8466), ldc:int(138))), invokestatic:TypeTemplate(DSL::compoundList, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u3e75\u8df4\u446c\uc31c\uc31c\u3a62), p0:Schema), invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::string))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_226_0 : byte[] [generated]
        stack_27B_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_19B : int
        var_3_1A0 : byte[]
        var_5_1A1 : int
        var_0_1A7 : int
        expr_1B1 : byte [generated]
        stack_1F5_2 : byte [generated]
        stack_1D4_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_215 : byte[]
        var_5_216 : int
        expr_AD : int [generated]
        var_3_26A : byte[]
        var_5_26B : int
        expr_281 : byte [generated]
        var_3_DA : String
        stack_194_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-663986937), ldc:int(-613550209))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_226_0 = stack_27B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("/WvNQ4VroBAQ5CzI/UvkCSfs7PlLlClExDuX+Sz5S5QpRMQrpCTg5XOwIOAQ5CzI/UvkCSfs7PlLlClExDuXEQjsAPy4SMg4LNwQ5CzI/UvkCSfs7PlLlClExDuXEQjsAPy4TAD8yDgsxVfQ5CzI/UvkCScgvPzkEOQsyP1L5AknCNUIO4wEKMls5u3Be7zcuEwA/LhEHPDwDO17vw=="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_19B = expr_6B:int
                var_3_1A0 = newarray:byte[](byte.class, expr_6B:int)
                var_5_1A1 = expr_6B:int
                
                loop {
                    var_0_1A7 = and:int(var_0_5F:int, ldc:int(2137384311))
                    var_5_1A1 = add:int(var_5_1A1:int, ldc:int(-1))
                    expr_1B1 = stack_1F5_2 = loadelement(expr_65, var_5_1A1)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_1A1:int, ldc:int(1)), neg:int(var_4_19B:int)), ldc:int(0))) {
                        stack_1F5_2 = stack_1D4_0 = add:byte(expr_1B1:byte, loadelement:byte(var_3_1A0:byte[], add:int(var_5_1A1:int, ldc:int(1))))
                        goto(Label_0484)
                    }
                    
                    Label_0446:
                    
                    if (cmpne:boolean(and:int(var_0_1A7:int, ldc:int(32768)), ldc:int(0))) {
                        var_0_1A7 = and:int(var_0_1A7:int, ldc:int(-20755418))
                    }
                    else {
                        var_0_1A7 = and:int(var_0_1A7:int, ldc:int(2010244871))
                        stack_1F5_2 = stack_1D4_0 = add:byte(expr_1B1:byte, ldc:byte(1))
                    }
                    
                    Label_0484:
                    
                    if (cmpeq:boolean(and:int(var_0_1A7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0446)
                    }
                    
                    var_0_5F = and:int(var_0_1A7:int, ldc:int(1576455535))
                    storeelement:byte(var_3_1A0:byte[], var_5_1A1:int, stack_1F5_2:byte)
                    
                    if (cmpne:boolean(var_5_1A1:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_226_0 = stack_27B_0 = var_3_1A0:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0178)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(581059754))
                }
                else {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(2010512855))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_215 = newarray:byte[](byte.class, expr_91:int)
                        var_5_216 = expr_91:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(1542520319))
                            var_5_216 = add:int(var_5_216:int, ldc:int(-1))
                            storeelement:byte(var_3_215:byte[], var_5_216:int, add:int(shl:int(loadelement:byte(stack_226_0:byte[], var_5_216:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_216:int, xor:int(ldc:int(-15356), ldc:int(-15355)))), ldc:int(6)), and:int(ldc:int(18079), ldc:int(2147)))))
                            
                            if (cmpne:boolean(var_5_216:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_226_0 = stack_27B_0 = var_3_215:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-800528537))
                    expr_AD = arraylength:int(stack_AD_0:byte[])
                    
                    if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                        var_3_26A = newarray:byte[](byte.class, expr_AD:int)
                        var_5_26B = expr_AD:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-698847361))
                            var_5_26B = add:int(var_5_26B:int, ldc:int(-1))
                            expr_281 = xor:byte(add:byte(loadelement:byte(stack_27B_0:byte[], var_5_26B:int), ldc:byte(49)), ldc:byte(23))
                            storeelement:byte(var_3_26A:byte[], var_5_26B:int, or:int(and:int(shl:int(expr_281:byte, and:int(ldc:int(4252), ldc:int(2567))), ldc:int(-16)), and:int(shr:int(expr_281:byte[expected:int], xor:int(ldc:int(544), ldc:int(548))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_5_26B:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_226_0 = stack_27B_0 = var_3_26A:byte[]
                    }
                }
                
                Label_0178:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(2099029145))
            }
            
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_194_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2086), ldc:int(206)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5382), ldc:int(582)))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(4371), ldc:int(4369)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(3626), ldc:int(-20459)), xor:int(ldc:int(2050), ldc:int(2058))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(1056), ldc:int(1057)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(16540), ldc:int(4394)), xor:int(ldc:int(-22512), ldc:int(-22468))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(11), ldc:int(8)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(1551), ldc:int(1571)), and:int(ldc:int(24655), ldc:int(1354))))
            storeelement:String(expr_EC:String[], xor:int(ldc:int(1088), ldc:int(1092)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(-24510), ldc:int(-24568)), and:int(ldc:int(31467), ldc:int(363))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(21570), ldc:int(-21571)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(8463), ldc:int(8548)), xor:int(ldc:int(4160), ldc:int(4152))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(69), ldc:int(3903)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, xor:int(ldc:int(8531), ldc:int(8491)), xor:int(ldc:int(4290), ldc:int(4190))))
            putstatic:String[](\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2::\u93a2\u3a62\u0a06\ub1b9\u7873\uc3e3, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u624e\u67d0\uc87f\ub18d\uc2e8\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_625 : int
        
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
        var_3_61A = and:int(ldc:int(428499067), ldc:int(-1343361306))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua6bd\ubcb0\ub113\u3bd6\u72f1\u9af2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_61A = and:int(var_3_61A:int, ldc:int(736339457))
        }
        else {
            var_3_61A = and:int(var_3_61A:int, ldc:int(-1884753457))
            var_5_85 = and:int(ldc:int(14984), ldc:int(-14985))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22614), ldc:int(-30807)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_61A:int, ldc:int(-1111921981))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(-28288), ldc:int(-28287)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(5640), ldc:int(5641)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_61A = and:int(var_3_D2:int, ldc:int(1073463630))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4311), ldc:int(2849)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1294392080))
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1807844687))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0645)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(537207372))
                    }
                    else {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1883582646))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0540)
                            }
                            
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0387:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1194871448))
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1337403184))
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-920892023))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1344443025))
                            var_11_E3 = and:int(ldc:int(29989), ldc:int(-32038))
                            goto(Label_1449)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0540:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-941820203))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-230230840))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-302091522))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0645:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2106689345))
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-2021951225))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(30675723))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-516045838))
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(542348008))
                            goto(Label_0387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-771085402))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1808300998))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0792:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0645)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1838284845))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2076992475))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(2074), ldc:int(2075))
                                goto(Label_1053)
                            }
                        }
                    }
                    
                    Label_0888:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-276498475))
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1929558704))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1217973456))
                            goto(Label_0792)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0645)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1146315929))
                            goto(Label_0540)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1691260517))
                            goto(Label_0387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(2106377310))
                        var_11_E3 = and:int(ldc:int(-24181), ldc:int(22132))
                    }
                    
                    Label_1053:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1319144317))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1346414935))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(1538908147))
                            goto(Label_0645)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-784331945))
                            loopcontinue()
                        }
                        
                        var_3_61A = and:int(var_3_61A:int, ldc:int(434786287))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1299)
                            }
                        }
                    }
                    
                    Label_1174:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_1053)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(623131475))
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(328354163))
                            goto(Label_0645)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0540)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1252736464))
                            goto(Label_0387)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61A = and:int(var_3_61A:int, ldc:int(-1415843462))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1449)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1299:
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1460)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-110768522))
                        goto(Label_1174)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(720009312))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1268357404))
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1533178804))
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1020532027))
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-858089611))
                        loopcontinue()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(1607097086))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1449:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_625 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1460:
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1174)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1053)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0645)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-1494063810))
                        goto(Label_0540)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(-338081512))
                        goto(Label_0387)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61A = and:int(var_3_61A:int, ldc:int(1502471250))
                        var_17_625 = add:int(var_16_111:int, and:int(ldc:int(10497), ldc:int(197)))
                        looporswitchbreak()
                    }
                    
                    var_3_61A = and:int(var_3_61A:int, ldc:int(1112838042))
                }
                
                var_3_61A = and:int(var_3_61A:int, ldc:int(-844413110))
                
                if (cmple:boolean(var_5_85 = var_17_625:int, sub:int(var_6_8C:int, and:int(ldc:int(1489), ldc:int(8231))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61A:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
