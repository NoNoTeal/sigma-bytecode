public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1 {
    public void \u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::<init>, this:\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.datafixers.types.templates.TypeTemplate \uf94d\u5bc4\u5245\u97b7\u4f52\uc229(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\u5f50\u7af6\ud7e8\u7d52\u8350\u6b5f), and:int(ldc:int(28064), ldc:int(-32161))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\u5f50\u7af6\ud7e8\u7d52\u8350\u6b5f), xor:int(ldc:int(-24576), ldc:int(-24575))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    public static void \ud171\ub7dc\u4c2b\u12cb\ubded\uc229(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerEntities(com.mojang.datafixers.schemas.Schema p0) {
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
            var_4_65 = invokespecial:Map(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::registerEntities, this:\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1[expected:\uae87\u927d\u4179\u6bb9\ufcaf\uceb8], p0:Schema)
            invokeinterface:Supplier<TypeTemplate>(Map<String, Supplier<TypeTemplate>>::remove, var_4_65:Map<String, Supplier<TypeTemplate>>, loadelement:String[expected:Object](getstatic:String[](\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\u5f50\u7af6\ud7e8\u7d52\u8350\u6b5f), xor:int(ldc:int(-27583), ldc:int(-27581))))
            invokestatic:void(\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\ud171\ub7dc\u4c2b\u12cb\ubded\uc229, p0:Schema, var_4_65:Map<String, Supplier<TypeTemplate>>, loadelement:String(getstatic:String[](\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\u5f50\u7af6\ud7e8\u7d52\u8350\u6b5f), and:int(ldc:int(10771), ldc:int(463))))
            return:Map<String, Supplier<TypeTemplate>>(var_4_65:Map<String, Supplier<TypeTemplate>>)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u72f1\u718f\ub1b9\u5db4\u8640\u5140$0(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\uf94d\u5bc4\u5245\u97b7\u4f52\uc229, p0:Schema))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_A6_0 : byte[] [generated]
        stack_A8_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_23C_0 : byte[] [generated]
        stack_283_0 : byte[] [generated]
        stack_2FB_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1CF : byte[]
        var_4_1D0 : int
        var_0_7D : int
        expr_A8 : int [generated]
        var_5_21F : int
        var_3_224 : byte[]
        var_4_225 : int
        var_0_279 : int
        expr_283 : byte [generated]
        stack_2C7_2 : byte [generated]
        stack_2A6_0 : byte [generated]
        expr_DB : int [generated]
        expr_10E : int [generated]
        var_3_2EA : byte[]
        var_4_2EB : int
        expr_2FB : byte [generated]
        var_3_142 : String
        stack_1C6_0 : String[] [generated]
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
            var_0_5F = and:int(ldc:int(842276629), ldc:int(-1709490307))
            expr_65 = var_2_69 = stack_A6_0 = stack_A8_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_23C_0 = stack_283_0 = stack_2FB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("KOH2DU59vfIGmjGGEXodvfYOMiYqFUpOPcICIcjBYc4mPjVeNVI6JjXuJioVSnlx0UIhyPYyPfI6Ai3A"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1CF = newarray:byte[](byte.class, expr_6D:int)
                var_4_1D0 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1218569291))
                    var_4_1D0 = add:int(var_4_1D0:int, ldc:int(-1))
                    storeelement:byte(var_3_1CF:byte[], var_4_1D0:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1D0:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1D0:int, and:int(ldc:int(25095), ldc:int(2193)))), ldc:int(6)), and:int(ldc:int(9491), ldc:int(16391)))))
                    
                    if (cmpne:boolean(var_4_1D0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_23C_0 = stack_283_0 = stack_2FB_0 = var_3_1CF:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(783734171))
                    goto(Label_0275)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(375432863))
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(1469052072))
                    goto(Label_0173)
                }
                
                var_0_7D = and:int(var_0_5F:int, ldc:int(-1487742051))
                expr_A8 = arraylength:int(stack_A8_0:byte[])
                
                if (cmpeq:boolean(expr_A8:int, ldc:int(0))) {
                    goto(Label_0173)
                }
                
                var_5_21F = expr_A8:int
                var_3_224 = newarray:byte[](byte.class, expr_A8:int)
                var_4_225 = expr_A8:int
                Label_0551:
                
                while (cmpne:boolean(and:int(var_0_7D:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_7D:int, ldc:int(1603772277))
                    var_4_225 = add:int(var_4_225:int, ldc:int(-1))
                    storeelement:byte(var_3_224:byte[], var_4_225:int, xor:byte(add:byte(loadelement:byte(stack_23C_0:byte[], var_4_225:int), ldc:byte(89)), ldc:byte(49)))
                    
                    if (cmpne:boolean(var_4_225:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_23C_0 = stack_283_0 = stack_2FB_0 = var_3_224:byte[]
                    goto(Label_0173)
                }
                
                Label_0622:
                
                while (cmpne:boolean(and:int(var_0_7D:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_279 = and:int(var_0_7D:int, ldc:int(2080095135))
                    var_4_225 = add:int(var_4_225:int, ldc:int(-1))
                    expr_283 = stack_2C7_2 = loadelement(stack_283_0, var_4_225)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_225:int, ldc:int(6)), neg:int(var_5_21F:int)), ldc:int(0))) {
                        stack_2C7_2 = stack_2A6_0 = add:byte(expr_283:byte, loadelement:byte(var_3_224:byte[], add:int(var_4_225:int, ldc:int(6))))
                        goto(Label_0694)
                    }
                    
                    Label_0656:
                    
                    if (cmpne:boolean(and:int(var_0_279:int, ldc:int(131072)), ldc:int(0))) {
                        var_0_279 = and:int(var_0_279:int, ldc:int(542716742))
                    }
                    else {
                        var_0_279 = and:int(var_0_279:int, ldc:int(-1238344931))
                        stack_2C7_2 = stack_2A6_0 = add:byte(expr_283:byte, ldc:byte(6))
                    }
                    
                    Label_0694:
                    
                    if (cmpeq:boolean(and:int(var_0_279:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0656)
                    }
                    
                    var_0_7D = and:int(var_0_279:int, ldc:int(-897720417))
                    storeelement:byte(var_3_224:byte[], var_4_225:int, stack_2C7_2:byte)
                    
                    if (cmpne:boolean(var_4_225:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_23C_0 = stack_283_0 = stack_2FB_0 = var_3_224:byte[]
                    goto(Label_0224)
                }
                
                goto(Label_0551)
                Label_0173:
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0275)
                }
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_7D:int, ldc:int(1956057947))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(256)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_7D:int, ldc:int(-1640304277))
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_7D:int, ldc:int(999374813))
                    expr_DB = arraylength:int(stack_DB_0:byte[])
                    
                    if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                        var_5_21F = expr_DB:int
                        var_3_224 = newarray:byte[](byte.class, expr_DB:int)
                        var_4_225 = expr_DB:int
                        goto(Label_0622)
                    }
                }
                
                Label_0224:
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_7D = and:int(var_0_7D:int, ldc:int(-657705437))
                        goto(Label_0173)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(16)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_7D:int, ldc:int(-1761722025))
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_7D:int, ldc:int(1607597943))
                    expr_10E = arraylength:int(stack_10E_0:byte[])
                    
                    if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                        var_3_2EA = newarray:byte[](byte.class, expr_10E:int)
                        var_4_2EB = expr_10E:int
                        
                        loop {
                            var_0_7D = and:int(var_0_7D:int, ldc:int(1782053661))
                            var_4_2EB = add:int(var_4_2EB:int, ldc:int(-1))
                            expr_2FB = loadelement:byte(stack_2FB_0:byte[], var_4_2EB:int)
                            storeelement:byte(var_3_2EA:byte[], var_4_2EB:int, or:int(and:int(shl:int(expr_2FB:byte, and:int(ldc:int(16612), ldc:int(1551))), ldc:int(-16)), and:int(shr:int(expr_2FB:byte[expected:int], and:int(ldc:int(549), ldc:int(3142))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_2EB:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A8_0 = stack_A6_0 = stack_D9_0 = stack_DB_0 = stack_10C_0 = stack_10E_0 = stack_136_0 = stack_23C_0 = stack_283_0 = stack_2FB_0 = var_3_2EA:byte[]
                    }
                }
                
                Label_0275:
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0224)
                }
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0173)
                }
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7D:int, ldc:int(-1191597656))
            }
            
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1C6_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2108), ldc:int(17796)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(7670), ldc:int(516)))
            storeelement:String(expr_154:String[], and:int(ldc:int(9043), ldc:int(-9044)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-24174), ldc:int(22633)), xor:int(ldc:int(276), ldc:int(286))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(129), ldc:int(128)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(16643), ldc:int(16649)), xor:int(ldc:int(17543), ldc:int(17556))))
            storeelement:String(expr_154:String[], xor:int(ldc:int(21), ldc:int(23)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(6223), ldc:int(6236)), xor:int(ldc:int(3587), ldc:int(3625))))
            storeelement:String(expr_154:String[], and:int(ldc:int(1063), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(17786), ldc:int(8234)), xor:int(ldc:int(-28605), ldc:int(-28552))))
            putstatic:String[](\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1::\u5f50\u7af6\ud7e8\u7d52\u8350\u6b5f, expr_154:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u624e\u67d0\uc87f\ub18d\uc2e8\u4ab3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_607 : int
        
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
        var_3_5FC = and:int(ldc:int(1999211713), ldc:int(-202186973))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\u4bc8\uc29a\u6bb9\u8350\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(234606514))
        }
        else {
            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-274153510))
            var_5_85 = and:int(ldc:int(2349), ldc:int(-2350))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5859), ldc:int(5826)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FC:int, ldc:int(2133575376))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(2337), ldc:int(24643)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8200), ldc:int(8201)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FC = and:int(var_3_D2:int, ldc:int(1869327299))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8291), ldc:int(18945)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(640471105))
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1292806404))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-636030728))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-190491677))
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(849726276))
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2022021125))
                    }
                    else {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-10184329))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0771)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1833684327))
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1335466132))
                        goto(Label_0771)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(588591241))
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(288083640))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(422803699))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-480126332))
                        var_11_E3 = and:int(ldc:int(17582), ldc:int(-18351))
                        goto(Label_1424)
                    }
                    
                    Label_0567:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1977260868))
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1406193006))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1932242102))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0771)
                        }
                    }
                    
                    Label_0666:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1760963085))
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1986007902))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1768788969))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0771:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1724115592))
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1829583703))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1301244520))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(628950157))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1324141709))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(228073701))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1663230269))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(17349), ldc:int(7211))
                                goto(Label_1058)
                            }
                        }
                    }
                    
                    Label_0906:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1790139860))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-792869993))
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(2024099908))
                            goto(Label_0771)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1905077736))
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1705937738))
                        var_11_E3 = and:int(ldc:int(-9932), ldc:int(9931))
                    }
                    
                    Label_1058:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(149069090))
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1381044019))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1547256587))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0906)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0771)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-509502513))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1295)
                            }
                        }
                    }
                    
                    Label_1168:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1058)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(103040871))
                            goto(Label_0906)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(986504915))
                            goto(Label_0771)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(1150752323))
                            goto(Label_0666)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FC = and:int(var_3_5FC:int, ldc:int(550569895))
                            loopcontinue()
                        }
                        
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-105339047))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1424)
                    }
                    
                    Label_1295:
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(731259107))
                        goto(Label_1168)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(2085739802))
                        goto(Label_1058)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(163512364))
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1277488216))
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FC = and:int(var_3_5FC:int, ldc:int(-135470375))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1424:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_607 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1435:
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1601087616))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1168)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1058)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(-1647810196))
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0771)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1523103284))
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FC = and:int(var_3_5FC:int, ldc:int(1731234178))
                        var_17_607 = add:int(var_16_111:int, and:int(ldc:int(65), ldc:int(26379)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FC = and:int(var_3_5FC:int, ldc:int(-202642315))
                
                if (cmple:boolean(var_5_85 = var_17_607:int, sub:int(var_6_8C:int, xor:int(ldc:int(8354), ldc:int(8355))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5FC:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
