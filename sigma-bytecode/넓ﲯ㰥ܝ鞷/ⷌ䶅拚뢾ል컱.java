public class \ub113\ufcaf\u3c25\u071d\u97b7.\u2dcc\u4d85\u62da\ub8be\u120d\ucef1 {
    public void \u2dcc\u4d85\u62da\ub8be\u120d\ucef1(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:\ub18d\u6d99\uc4d2\u5db4\u960f\u8413(\ub18d\u6d99\uc4d2\u5db4\u960f\u8413::<init>, this:\u2dcc\u4d85\u62da\ub8be\u120d\ucef1, p0:Schema, p1:boolean, loadelement:String(getstatic:String[](\u2dcc\u4d85\u62da\ub8be\u120d\ucef1::\u6b5f\ud158\ub113\u8389\u72f1\u93a2), and:int(ldc:int(-31128), ldc:int(20882))), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7), loadelement:String(getstatic:String[](\u2dcc\u4d85\u62da\ub8be\u120d\ucef1::\u6b5f\ud158\ub113\u8389\u72f1\u93a2), xor:int(ldc:int(282), ldc:int(283))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.Typed<?> \ufe34\u5f50\uf94d\ubff1\ua068\u7873(com.mojang.datafixers.Typed<?> p0) {
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
            return:Typed<?>(invokevirtual:Typed(Typed::update, p0:Typed<?>, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<?> \uceb8\ub32d\u3504\ubded\ud36e\u3a62(com.mojang.serialization.Dynamic<?> p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u7d52\ub7dc\u7bad\u4daf\ud217\u93a2$1(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
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
    
    private static boolean lambda$\ubded\u3776\ub83f\ubded\u72f1\u836c$0(com.mojang.serialization.Dynamic p0) {
        var_1_5F : int
        stack_AD_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(615543495), ldc:int(314403583))
            
            if (invokevirtual:boolean(String::equals, invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u2dcc\u4d85\u62da\ub8be\u120d\ucef1::\u6b5f\ud158\ub113\u8389\u72f1\u93a2), and:int(ldc:int(29915), ldc:int(515)))), loadelement:String(getstatic:String[](\u2dcc\u4d85\u62da\ub8be\u120d\ucef1::\u6b5f\ud158\ub113\u8389\u72f1\u93a2), and:int(ldc:int(14404), ldc:int(1813)))), loadelement:String[expected:Object](getstatic:String[](\u2dcc\u4d85\u62da\ub8be\u120d\ucef1::\u6b5f\ud158\ub113\u8389\u72f1\u93a2), and:int(ldc:int(6549), ldc:int(16485))))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1433376057))
                stack_AD_0 = and:int(ldc:int(-11690), ldc:int(11657))
            }
            else {
                stack_AD_0 = and:int(ldc:int(483), ldc:int(11777))
            }
            
            return:boolean(stack_AD_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_250 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_262_0 : byte[] [generated]
        stack_2C7_0 : byte[] [generated]
        stack_33F_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_1ED : byte[]
        var_4_1EE : int
        expr_A0 : int [generated]
        var_5_23D : int
        var_3_242 : byte[]
        var_4_243 : int
        expr_262 : byte [generated]
        var_0_2DF : int
        expr_2C7 : byte [generated]
        stack_30B_2 : byte [generated]
        stack_2E2_0 : byte [generated]
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_32E : byte[]
        var_4_32F : int
        var_3_12A : String
        stack_1E4_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
            var_0_250 = and:int(ldc:int(-629458604), ldc:int(485716759))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_262_0 = stack_2C7_0 = stack_33F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("EVT++PbO9P8nKOZmtRGdPOBkxQOxVP7+XrbpvRkI5zza6xz85wEHCPThEOMFFrkO5Wzo8vbnOqbAoA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_1ED = newarray:byte[](byte.class, expr_6D:int)
                var_4_1EE = expr_6D:int
                
                loop {
                    var_0_250 = and:int(var_0_250:int, ldc:int(-1082153696))
                    var_4_1EE = add:int(var_4_1EE:int, ldc:int(-1))
                    storeelement:byte(var_3_1ED:byte[], var_4_1EE:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_1EE:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_1EE:int, xor:int(ldc:int(-32630), ldc:int(-32629)))), ldc:int(5)), xor:int(ldc:int(1796), ldc:int(1795)))))
                    
                    if (cmpne:boolean(var_4_1EE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_262_0 = stack_2C7_0 = stack_33F_0 = var_3_1ED:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpne:boolean(and:int(var_0_250:int, ldc:int(2)), ldc:int(0))) {
                    var_0_250 = and:int(var_0_250:int, ldc:int(588645908))
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_0_250:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_250 = and:int(var_0_250:int, ldc:int(934149788))
                    goto(Label_0165)
                }
                
                var_0_250 = and:int(var_0_250:int, ldc:int(-1640257857))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_23D = expr_A0:int
                var_3_242 = newarray:byte[](byte.class, expr_A0:int)
                var_4_243 = expr_A0:int
                Label_0581:
                
                while (cmpne:boolean(and:int(var_0_250:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_250 = and:int(var_0_250:int, ldc:int(1593820801))
                    var_4_243 = add:int(var_4_243:int, ldc:int(-1))
                    expr_262 = loadelement:byte(stack_262_0:byte[], var_4_243:int)
                    storeelement:byte(var_3_242:byte[], var_4_243:int, xor:int(or:int(and:int(shl:int(expr_262:byte, and:int(ldc:int(16388), ldc:int(8324))), ldc:int(-16)), and:int(shr:int(expr_262:byte[expected:int], and:int(ldc:int(4719), ldc:int(24580))), ldc:int(15))), ldc:int(124)))
                    
                    if (cmpne:boolean(var_4_243:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_262_0 = stack_2C7_0 = stack_33F_0 = var_3_242:byte[]
                    goto(Label_0165)
                }
                
                var_0_250 = and:int(var_0_250:int, ldc:int(1913217180))
                Label_0682:
                
                while (cmpeq:boolean(and:int(var_0_250:int, ldc:int(1)), ldc:int(0))) {
                    var_0_2DF = and:int(var_0_250:int, ldc:int(1530613297))
                    var_4_243 = add:int(var_4_243:int, ldc:int(-1))
                    expr_2C7 = stack_30B_2 = loadelement(stack_2C7_0, var_4_243)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_243:int, ldc:int(3)), neg:int(var_5_23D:int)), ldc:int(0))) {
                        stack_30B_2 = stack_2E2_0 = add:byte(expr_2C7:byte, loadelement:byte(var_3_242:byte[], add:int(var_4_243:int, ldc:int(3))))
                        goto(Label_0754)
                    }
                    
                    Label_0724:
                    
                    if (cmpne:boolean(and:int(var_0_2DF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_2DF = and:int(var_0_2DF:int, ldc:int(1593249579))
                        stack_30B_2 = stack_2E2_0 = add:byte(expr_2C7:byte, ldc:byte(3))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_0_2DF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_2DF = and:int(var_0_2DF:int, ldc:int(-408508540))
                        goto(Label_0724)
                    }
                    
                    var_0_250 = and:int(var_0_2DF:int, ldc:int(-76285761))
                    storeelement:byte(var_3_242:byte[], var_4_243:int, stack_30B_2:byte)
                    
                    if (cmpne:boolean(var_4_243:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_262_0 = stack_2C7_0 = stack_33F_0 = var_3_242:byte[]
                    goto(Label_0200)
                }
                
                var_0_250 = and:int(var_0_250:int, ldc:int(-41482931))
                goto(Label_0581)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_250:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(32768)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_250 = and:int(var_0_250:int, ldc:int(-50356484))
                    expr_C3 = arraylength:int(stack_C3_0:byte[])
                    
                    if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                        var_5_23D = expr_C3:int
                        var_3_242 = newarray:byte[](byte.class, expr_C3:int)
                        var_4_243 = expr_C3:int
                        goto(Label_0682)
                    }
                }
                
                Label_0200:
                
                if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_250 = and:int(var_0_250:int, ldc:int(-640835975))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_250:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_250 = and:int(var_0_250:int, ldc:int(-67899017))
                    expr_EE = arraylength:int(stack_EE_0:byte[])
                    
                    if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                        var_3_32E = newarray:byte[](byte.class, expr_EE:int)
                        var_4_32F = expr_EE:int
                        
                        loop {
                            var_0_250 = and:int(var_0_250:int, ldc:int(1555773375))
                            var_4_32F = add:int(var_4_32F:int, ldc:int(-1))
                            storeelement:byte(var_3_32E:byte[], var_4_32F:int, add:byte(loadelement:byte(stack_33F_0:byte[], var_4_32F:int), ldc:byte(67)))
                            
                            if (cmpne:boolean(var_4_32F:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_262_0 = stack_2C7_0 = stack_33F_0 = var_3_32E:byte[]
                    }
                }
                
                Label_0243:
                
                if (cmpne:boolean(and:int(var_0_250:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_250 = and:int(var_0_250:int, ldc:int(-1556158523))
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_250:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_250 = and:int(var_0_250:int, ldc:int(-330721762))
            }
            
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1E4_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24782), ldc:int(1062)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(582), ldc:int(142)))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(240), ldc:int(244)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(185), ldc:int(-186)), and:int(ldc:int(-5797), ldc:int(5764))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(18947), ldc:int(4378)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-2729), ldc:int(2728)), xor:int(ldc:int(24647), ldc:int(24640))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-16334), ldc:int(15172)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(519), ldc:int(21679)), and:int(ldc:int(158), ldc:int(10558))))
            storeelement:String(expr_13C:String[], xor:int(ldc:int(-28668), ldc:int(-28665)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(4511), ldc:int(8286)), xor:int(ldc:int(3594), ldc:int(3624))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(5189), ldc:int(16389)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(16526), ldc:int(16556)), xor:int(ldc:int(2567), ldc:int(2592))))
            storeelement:String(expr_13C:String[], and:int(ldc:int(8225), ldc:int(3473)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(24789), ldc:int(24818)), and:int(ldc:int(2747), ldc:int(24633))))
            putstatic:String[](\u2dcc\u4d85\u62da\ub8be\u120d\ucef1::\u6b5f\ud158\ub113\u8389\u72f1\u93a2, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u67d0\uc31c\u494c\uc84e\u3bc9\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CB : int
        var_11_DC : int
        var_14_106 : double
        var_16_10A : int
        var_12_102 : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(-1134438451), ldc:int(-1884815538))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u2dcc\u4d85\u62da\ub8be\u120d\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-1397951124))
            var_5_7D = and:int(ldc:int(24882), ldc:int(-32051))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1049), ldc:int(-1050)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CB = and:int(var_3_694:int, ldc:int(-2454145))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DC = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DC:int, sub:int(var_6_84:int, and:int(ldc:int(12609), ldc:int(16421)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DC:int, and:int(ldc:int(15), ldc:int(10817)))), var_7_93:double))) {
                        inc:int(var_11_DC, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_CB:int, ldc:int(-1385380356))
                    var_14_106 = var_7_93:double
                    var_16_10A = var_11_DC:int
                }
                else {
                    var_11_DC = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4165), ldc:int(385)))
                    var_12_102 = var_14_106 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10A = var_11_DC:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DC:int)
                        var_16_10A = var_11_DC:int
                        var_14_106 = var_12_102:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(18465886))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-682321287))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-384548767))
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(487662019))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1831392284))
                    }
                    else {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1123496019))
                        
                        if (cmplt:boolean(var_16_10A:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0838)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(981318984))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-534780898))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1033124694))
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1187664982))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1086889140))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1235899253))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1119103138))
                        var_11_DC = and:int(ldc:int(-25676), ldc:int(25667))
                        goto(Label_1564)
                    }
                    
                    Label_0580:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1020763721))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-2107459677))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(755040793))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1336641571))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-3959012))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_106 = var_9_B9:double
                            goto(Label_0838)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(692637074))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1372108514))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(82819574))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-104486662))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-994565891))
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1084494452))
                        var_14_106 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_106:double))
                    }
                    
                    Label_0838:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(700097447))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-542984599))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1381351173))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1534511983))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1160598257))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-498165556))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1381984900))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DC = and:int(ldc:int(19641), ldc:int(321))
                                goto(Label_1152)
                            }
                        }
                    }
                    
                    Label_0976:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(537650724))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1796294749))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-2123720436))
                            goto(Label_0838)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(153330423))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-345975354))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(889025295))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1405960755))
                        var_11_DC = and:int(ldc:int(24912), ldc:int(-29523))
                    }
                    
                    Label_1152:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(885446691))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-374225151))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-2066686816))
                            goto(Label_0976)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(260832111))
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-621655468))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1136468643))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                                goto(Label_1412)
                            }
                        }
                    }
                    
                    Label_1282:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-280631205))
                            goto(Label_1152)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(446114884))
                            goto(Label_0976)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0838)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1191075549))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1799398211))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1091180786))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_106:double, var_5_7D:int, var_16_10A:int)
                        goto(Label_1564)
                    }
                    
                    Label_1412:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1137958142))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1144356221))
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1916365359))
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1769045314))
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1515234147))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1210442992))
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-541864579))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_106:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DC:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1282)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-899785932))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0976)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0838)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1229147612))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-933804633))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1743984272))
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-549542084))
                        var_17_69F = add:int(var_16_10A:int, xor:int(ldc:int(8640), ldc:int(8641)))
                        looporswitchbreak()
                    }
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(-1344680498))
                
                if (cmple:boolean(var_5_7D = var_17_69F:int, sub:int(var_6_84:int, and:int(ldc:int(10499), ldc:int(1545))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
