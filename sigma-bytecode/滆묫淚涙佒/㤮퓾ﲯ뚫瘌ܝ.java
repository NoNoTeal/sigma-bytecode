public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d {
    public void \u392e\ud4fe\ufcaf\ub6ab\u760c\u071d(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:Schema(Schema::<init>, this:\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerEntities(com.mojang.datafixers.schemas.Schema p0) {
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
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u9033\u7af6\u8d90\u0800\u946b\u72f1$4(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(5633), ldc:int(5639))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u3504\uc31c\ub113\u97b7\u7043\uc910$3(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(8325), ldc:int(8323))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u494c\uf995\u8d90\u12b2\ud171\u4d85$2(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(16416), ldc:int(16423))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(16422), ldc:int(16416))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u960f\u93a2\u8cae\u7d52\ua6bd\ub83f$1(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), and:int(ldc:int(4391), ldc:int(1111))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(-30624), ldc:int(-30618))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\ud36e\u5654\u6198\u36d3\u52d3\u6198$0(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(12838), ldc:int(12846))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2), xor:int(ldc:int(-24540), ldc:int(-24542))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_207 : int
        expr_6B : int [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_219_0 : byte[] [generated]
        stack_26F_0 : byte[] [generated]
        stack_2CB_0 : byte[] [generated]
        var_4_1F4 : int
        var_3_1F9 : byte[]
        var_5_1FA : int
        expr_21F : byte [generated]
        var_0_2C1 : int
        expr_2CB : byte [generated]
        stack_2F9_2 : byte [generated]
        var_2_95 : byte[]
        expr_99 : int [generated]
        var_3_25E : byte[]
        var_5_25F : int
        expr_B5 : int [generated]
        var_3_E2 : String
        stack_1ED_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_207 = and:int(ldc:int(-2014374927), ldc:int(-414716046))
        expr_6B = arraylength:int(stack_95_0 = stack_97_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_219_0 = stack_26F_0 = stack_2CB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("iQDwyvxrDPgZIfQn/h34KR/0HQaUZycfBOZRAv7w6lkC+ureTdj4+gpNHxPkJz0C+ik3IeAfD/wI3mH43gr+2v4pS/RidE5IQmD0")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F4 = expr_6B:int
        var_3_1F9 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FA = expr_6B:int
        Label_0508:
        
        while (cmpne:boolean(and:int(var_0_207:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_207 = and:int(var_0_207:int, ldc:int(402520441))
            var_5_1FA = add:int(var_5_1FA:int, ldc:int(-1))
            expr_21F = xor:byte(add:byte(loadelement:byte(stack_219_0:byte[], var_5_1FA:int), ldc:byte(113)), ldc:byte(107))
            storeelement:byte(var_3_1F9:byte[], var_5_1FA:int, or:int(and:int(shl:int(expr_21F:byte, xor:int(ldc:int(18562), ldc:int(18566))), ldc:int(-16)), and:int(shr:int(expr_21F:byte[expected:int], xor:int(ldc:int(179), ldc:int(183))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_219_0 = stack_26F_0 = stack_2CB_0 = var_3_1F9:byte[]
            goto(Label_0112)
        }
        
        var_0_207 = and:int(var_0_207:int, ldc:int(-2081300619))
        Label_0694:
        
        while (cmpeq:boolean(and:int(var_0_207:int, ldc:int(1024)), ldc:int(0))) {
            var_0_2C1 = and:int(var_0_207:int, ldc:int(1742728567))
            var_5_1FA = add:int(var_5_1FA:int, ldc:int(-1))
            expr_2CB = loadelement:byte(stack_2CB_0:byte[], var_5_1FA:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1FA:int, ldc:int(6)), neg:int(var_4_1F4:int)), ldc:int(0))) {
                var_0_2C1 = and:int(var_0_2C1:int, ldc:int(-1614318738))
                stack_2F9_2 = add:byte(expr_2CB:byte, ldc:byte(6))
            }
            else {
                stack_2F9_2 = add:byte(expr_2CB:byte, loadelement:byte(var_3_1F9:byte[], add:int(var_5_1FA:int, ldc:int(6))))
            }
            
            var_0_207 = and:int(var_0_2C1:int, ldc:int(668434408))
            storeelement:byte(var_3_1F9:byte[], var_5_1FA:int, stack_2F9_2:byte)
            
            if (cmpne:boolean(var_5_1FA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_219_0 = stack_26F_0 = stack_2CB_0 = var_3_1F9:byte[]
            goto(Label_0186)
        }
        
        goto(Label_0508)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_207:int, ldc:int(256)), ldc:int(0))) {
            var_0_207 = and:int(var_0_207:int, ldc:int(-131391794))
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_207:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_207 = and:int(var_0_207:int, ldc:int(486249206))
        }
        else {
            var_0_207 = and:int(var_0_207:int, ldc:int(-1476546569))
            var_2_95 = stack_95_0:byte[]
            expr_99 = add:int(arraylength:int(stack_97_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                var_3_25E = newarray:byte[](byte.class, expr_99:int)
                var_5_25F = expr_99:int
                
                loop {
                    var_0_207 = and:int(var_0_207:int, ldc:int(793148768))
                    var_5_25F = add:int(var_5_25F:int, ldc:int(-1))
                    storeelement:byte(var_3_25E:byte[], var_5_25F:int, add:int(shl:int(loadelement:byte(stack_26F_0:byte[], var_5_25F:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_95:byte[], add:int(var_5_25F:int, xor:int(ldc:int(136), ldc:int(137)))), ldc:int(5)), xor:int(ldc:int(-16285), ldc:int(-16284)))))
                    
                    if (cmpne:boolean(var_5_25F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_219_0 = stack_26F_0 = stack_2CB_0 = var_3_25E:byte[]
            }
        }
        
        Label_0158:
        
        if (cmpne:boolean(and:int(var_0_207:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_207:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_207 = and:int(var_0_207:int, ldc:int(-143150240))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_1F4 = expr_B5:int
                var_3_1F9 = newarray:byte[](byte.class, expr_B5:int)
                var_5_1FA = expr_B5:int
                goto(Label_0694)
            }
        }
        
        Label_0186:
        
        if (cmpeq:boolean(and:int(var_0_207:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_207 = and:int(var_0_207:int, ldc:int(327939968))
            goto(Label_0158)
        }
        
        if (cmpne:boolean(and:int(var_0_207:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1ED_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(69), ldc:int(76)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32625), ldc:int(-32634)))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(16519), ldc:int(16527)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(815), ldc:int(-2864)), and:int(ldc:int(2061), ldc:int(29225))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(321), ldc:int(323)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(10443), ldc:int(4617)), xor:int(ldc:int(408), ldc:int(407))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-25223), ldc:int(25094)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(527), ldc:int(10511)), xor:int(ldc:int(8273), ldc:int(8267))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(5633), ldc:int(269)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(16410), ldc:int(9306)), xor:int(ldc:int(1545), ldc:int(1558))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(2223), ldc:int(4631)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(4223), ldc:int(25119)), xor:int(ldc:int(142), ldc:int(170))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(4355), ldc:int(1187)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(18604), ldc:int(4660)), and:int(ldc:int(18472), ldc:int(63))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(27750), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(18985), ldc:int(248)), and:int(ldc:int(20538), ldc:int(10418))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(1857), ldc:int(1860)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(8192), ldc:int(8242)), and:int(ldc:int(575), ldc:int(15551))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(28), ldc:int(24711)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(63), ldc:int(575)), and:int(ldc:int(78), ldc:int(12123))))
            putstatic:String[](\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d::\u69d9\ub7dc\u8640\u6ec6\u983f\uc4d2, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ud158\u97e6\u6ec6\u4179\u156b\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_652 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_65D : int
        
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
        var_3_652 = and:int(ldc:int(-1288541957), ldc:int(-29491973))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\ud4fe\ufcaf\ub6ab\u760c\u071d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_652 = and:int(var_3_652:int, ldc:int(-369133313))
            var_5_7D = and:int(ldc:int(-13702), ldc:int(13445))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-338), ldc:int(337)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_652:int, ldc:int(-1410209549))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(4097), ldc:int(3335)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(513), ldc:int(8225)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_652 = and:int(var_3_CA:int, ldc:int(-491259393))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18720), ldc:int(18721)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(2117172423))
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1297921907))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1746175801))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1418658317))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0374:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(80059753))
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(2026901097))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(2135863538))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-891545070))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1414501121))
                            var_11_DB = and:int(ldc:int(-1696), ldc:int(1678))
                            goto(Label_1470)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1261888571))
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-631898803))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-781097115))
                        goto(Label_0922)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-853133071))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1844052550))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1037050995))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-353305601))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-546850124))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1027091036))
                        goto(Label_1206)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(669290655))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1739114553))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-717409782))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0374)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1831289963))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-130122753))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1408440962))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1469415146))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1763396782))
                            goto(Label_0374)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-92308489))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(712), ldc:int(713))
                                goto(Label_1096)
                            }
                        }
                    }
                    
                    Label_0922:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(21763579))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1937317753))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1294713068))
                        goto(Label_1206)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1959483736))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(931519530))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1941417592))
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1087116289))
                        var_11_DB = and:int(ldc:int(1209), ldc:int(-30458))
                    }
                    
                    Label_1096:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1246418185))
                        goto(Label_1337)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0922)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-64684748))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0374)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-112867323))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-214107905))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1337)
                            }
                        }
                    }
                    
                    Label_1206:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(774378620))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1418532018))
                            goto(Label_1096)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0922)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(869508308))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1213289122))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0374)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-268867333))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1470)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1337:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1206)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1501563313))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(66347977))
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(128)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(399908732))
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(2102253589))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_652 = and:int(var_3_652:int, ldc:int(-134578433))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1470:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1481:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-169950012))
                        goto(Label_1337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-62973048))
                        goto(Label_1206)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1965326271))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-316718480))
                        goto(Label_0922)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1693455110))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1279055759))
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-293930253))
                        var_17_65D = add:int(var_16_109:int, xor:int(ldc:int(-31711), ldc:int(-31712)))
                        looporswitchbreak()
                    }
                    
                    var_3_652 = and:int(var_3_652:int, ldc:int(240651076))
                }
                
                var_3_652 = and:int(var_3_652:int, ldc:int(-193925893))
                
                if (cmple:boolean(var_5_7D = var_17_65D:int, sub:int(var_6_84:int, xor:int(ldc:int(-32251), ldc:int(-32252))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
