public class \u5d20\u7043\u88c5\u5db4\uf94d.\u960f\u3bc9\u74b1\uc238\ua562\uae5d {
    public void \u960f\u3bc9\u74b1\uc238\ua562\uae5d(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u960f\u3bc9\u74b1\uc238\ua562\uae5d, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u62da\u7c6b\u93a2\ub32d\ufcaf\u8cae$3(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u67e9\u4bc8\u69d9\u92ff\u8bb0\ucfaf$2(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$null$1(com.mojang.serialization.Dynamic p0, java.util.Map p1) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\u2dcc\u3dd3\ub113\u69d9\uc2bd\ua3b4$0(com.mojang.serialization.Dynamic p0, java.util.Map.Entry p1) {
        var_4_B8 : String
        
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
            
            if (invokevirtual:boolean(String::startsWith, invokevirtual:String(Dynamic::asString, checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokeinterface:Dynamic(Entry<Dynamic, V>::getKey, p1:Entry<Dynamic, V>)), loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), and:int(ldc:int(14465), ldc:int(17153)))), loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), and:int(ldc:int(8466), ldc:int(18470))))) {
                var_4_B8 = invokevirtual:String(Dynamic::asString, checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokeinterface:V[expected:Dynamic](Entry<K, V>::getValue, p1:Entry<Dynamic, V>)), loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), and:int(ldc:int(195), ldc:int(1025))))
                
                if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_4_B8:String, loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), and:int(ldc:int(3075), ldc:int(16783)))))) {
                    if (logicalnot:boolean(invokevirtual:boolean(String::startsWith, var_4_B8:String, loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), and:int(ldc:int(21508), ldc:int(284)))))) {
                        return:Pair(invokestatic:Pair(Pair::of, invokeinterface:Dynamic[expected:Object](Entry<Dynamic, V>::getKey, p1:Entry<Dynamic, V>), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), xor:int(ldc:int(24600), ldc:int(24605)))), invokevirtual:String(String::substring, var_4_B8:String, invokevirtual:int(String::length, loadelement:String(getstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa), xor:int(ldc:int(2114), ldc:int(2116))))))))))
                    }
                }
            }
            
            return:Pair(invokestatic:Pair(Pair::of, invokeinterface:Dynamic[expected:Object](Entry<Dynamic, V>::getKey, p1:Entry<Dynamic, V>), invokeinterface:V[expected:Object](Entry<K, V>::getValue, p1:Entry<Dynamic, V>)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2AD : int
        expr_6C : int [generated]
        stack_A2_0 : byte[] [generated]
        stack_A4_0 : byte[] [generated]
        stack_E5_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_11D_0 : byte[] [generated]
        stack_11F_0 : byte[] [generated]
        stack_167_0 : byte[] [generated]
        stack_169_0 : byte[] [generated]
        stack_1B0_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        stack_30C_0 : byte[] [generated]
        stack_37B_0 : byte[] [generated]
        stack_3D2_0 : byte[] [generated]
        stack_450_0 : byte[] [generated]
        var_4_298 : int
        var_3_29D : byte[]
        var_5_29E : int
        var_0_3EC : int
        expr_3D2 : byte [generated]
        stack_41B_2 : byte [generated]
        stack_3EF_0 : byte [generated]
        var_2_A2 : byte[]
        expr_A6 : int [generated]
        var_3_2FA : byte[]
        var_5_2FB : int
        expr_E7 : int [generated]
        expr_11F : int [generated]
        expr_169 : int [generated]
        var_3_43E : byte[]
        var_5_43F : int
        expr_450 : byte [generated]
        var_3_1BC : String
        stack_291_0 : String[] [generated]
        expr_1CE : String[] [generated]
        
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
        var_0_2AD = and:int(ldc:int(-776209926), ldc:int(-349831212))
        expr_6C = arraylength:int(stack_A2_0 = stack_A4_0 = stack_E5_0 = stack_E7_0 = stack_11D_0 = stack_11F_0 = stack_167_0 = stack_169_0 = stack_1B0_0 = stack_2D1_0 = stack_30C_0 = stack_37B_0 = stack_3D2_0 = stack_450_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("7H3BLZ0YaajVGciNxSRd8fktRRA5CKxexQUFBQUFBRw1FQktAg0x4EUtDRUfZRUF3Q3MPSXIRdUxIRIplZG0eQ==")))
        
        if (cmpeq:boolean(expr_6C:int, ldc:int(0))) {
            goto(Label_0113)
        }
        
        var_4_298 = expr_6C:int
        var_3_29D = newarray:byte[](byte.class, expr_6C:int)
        var_5_29E = expr_6C:int
        Label_0672:
        
        while (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(4096)), ldc:int(0))) {
                var_0_2AD = and:int(var_0_2AD:int, ldc:int(2119906738))
                goto(Label_0851)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-785334789))
            var_5_29E = add:int(var_5_29E:int, ldc:int(-1))
            storeelement:byte(var_3_29D:byte[], var_5_29E:int, add:byte(loadelement:byte(stack_2D1_0:byte[], var_5_29E:int), ldc:byte(71)))
            
            if (cmpne:boolean(var_5_29E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_E5_0 = stack_E7_0 = stack_11D_0 = stack_11F_0 = stack_167_0 = stack_169_0 = stack_1B0_0 = stack_2D1_0 = stack_30C_0 = stack_37B_0 = stack_3D2_0 = stack_450_0 = var_3_29D:byte[]
            goto(Label_0113)
        }
        
        var_0_2AD = and:int(var_0_2AD:int, ldc:int(-940246275))
        goto(Label_0938)
        Label_0851:
        
        while (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(128)), ldc:int(0))) {
                var_0_2AD = and:int(var_0_2AD:int, ldc:int(245121022))
                goto(Label_0672)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-681313040))
            var_5_29E = add:int(var_5_29E:int, ldc:int(-1))
            storeelement:byte(var_3_29D:byte[], var_5_29E:int, xor:byte(loadelement:byte(stack_37B_0:byte[], var_5_29E:int), ldc:byte(49)))
            
            if (cmpne:boolean(var_5_29E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_E5_0 = stack_E7_0 = stack_11D_0 = stack_11F_0 = stack_167_0 = stack_169_0 = stack_1B0_0 = stack_2D1_0 = stack_30C_0 = stack_37B_0 = stack_3D2_0 = stack_450_0 = var_3_29D:byte[]
            goto(Label_0236)
        }
        
        Label_0938:
        
        while (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0672)
            }
            
            var_0_3EC = and:int(var_0_2AD:int, ldc:int(-886784808))
            var_5_29E = add:int(var_5_29E:int, ldc:int(-1))
            expr_3D2 = stack_41B_2 = loadelement(stack_3D2_0, var_5_29E)
            
            if (cmplt:boolean(add:int(add:int(var_5_29E:int, ldc:int(4)), neg:int(var_4_298:int)), ldc:int(0))) {
                stack_41B_2 = stack_3EF_0 = add:byte(expr_3D2:byte, loadelement:byte(var_3_29D:byte[], add:int(var_5_29E:int, ldc:int(4))))
                goto(Label_1023)
            }
            
            Label_0991:
            
            if (cmpne:boolean(and:int(var_0_3EC:int, ldc:int(32768)), ldc:int(0))) {
                var_0_3EC = and:int(var_0_3EC:int, ldc:int(-538315791))
                stack_41B_2 = stack_3EF_0 = add:byte(expr_3D2:byte, ldc:byte(4))
            }
            
            Label_1023:
            
            if (cmpeq:boolean(and:int(var_0_3EC:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_3EC = and:int(var_0_3EC:int, ldc:int(-1193605765))
                goto(Label_0991)
            }
            
            var_0_2AD = and:int(var_0_3EC:int, ldc:int(-1020609064))
            storeelement:byte(var_3_29D:byte[], var_5_29E:int, stack_41B_2:byte)
            
            if (cmpne:boolean(var_5_29E:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A4_0 = stack_A2_0 = stack_E5_0 = stack_E7_0 = stack_11D_0 = stack_11F_0 = stack_167_0 = stack_169_0 = stack_1B0_0 = stack_2D1_0 = stack_30C_0 = stack_37B_0 = stack_3D2_0 = stack_450_0 = var_3_29D:byte[]
            goto(Label_0292)
        }
        
        var_0_2AD = and:int(var_0_2AD:int, ldc:int(1102990298))
        goto(Label_0851)
        Label_0113:
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0366)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(2109603612))
            goto(Label_0292)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0236)
        }
        
        if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-311430145))
            var_2_A2 = stack_A2_0:byte[]
            expr_A6 = add:int(arraylength:int(stack_A4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_3_2FA = newarray:byte[](byte.class, expr_A6:int)
                var_5_2FB = expr_A6:int
                
                loop {
                    var_0_2AD = and:int(var_0_2AD:int, ldc:int(-407717157))
                    var_5_2FB = add:int(var_5_2FB:int, ldc:int(-1))
                    storeelement:byte(var_3_2FA:byte[], var_5_2FB:int, add:int(shl:int(loadelement:byte(stack_30C_0:byte[], var_5_2FB:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_A2:byte[], add:int(var_5_2FB:int, xor:int(ldc:int(2340), ldc:int(2341)))), ldc:int(6)), and:int(ldc:int(26179), ldc:int(6411)))))
                    
                    if (cmpne:boolean(var_5_2FB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A4_0 = stack_A2_0 = stack_E5_0 = stack_E7_0 = stack_11D_0 = stack_11F_0 = stack_167_0 = stack_169_0 = stack_1B0_0 = stack_2D1_0 = stack_30C_0 = stack_37B_0 = stack_3D2_0 = stack_450_0 = var_3_2FA:byte[]
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(4)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-575023165))
            goto(Label_0366)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-696818556))
            goto(Label_0292)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0113)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-72550692))
            expr_E7 = arraylength:int(stack_E7_0:byte[])
            
            if (cmpne:boolean(expr_E7:int, ldc:int(0))) {
                var_4_298 = expr_E7:int
                var_3_29D = newarray:byte[](byte.class, expr_E7:int)
                var_5_29E = expr_E7:int
                goto(Label_0851)
            }
        }
        
        Label_0236:
        
        if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0366)
        }
        
        if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(262144)), ldc:int(0))) {
                var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1415835936))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0113)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-844497959))
            expr_11F = arraylength:int(stack_11F_0:byte[])
            
            if (cmpne:boolean(expr_11F:int, ldc:int(0))) {
                var_4_298 = expr_11F:int
                var_3_29D = newarray:byte[](byte.class, expr_11F:int)
                var_5_29E = expr_11F:int
                goto(Label_0938)
            }
        }
        
        Label_0292:
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(128)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1230312957))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(8192)), ldc:int(0))) {
                var_0_2AD = and:int(var_0_2AD:int, ldc:int(1510583043))
                goto(Label_0236)
            }
            
            if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_2AD:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_2AD = and:int(var_0_2AD:int, ldc:int(-708516654))
                goto(Label_0113)
            }
            
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-315033899))
            expr_169 = arraylength:int(stack_169_0:byte[])
            
            if (cmpne:boolean(expr_169:int, ldc:int(0))) {
                var_3_43E = newarray:byte[](byte.class, expr_169:int)
                var_5_43F = expr_169:int
                
                loop {
                    var_0_2AD = and:int(var_0_2AD:int, ldc:int(-181225997))
                    var_5_43F = add:int(var_5_43F:int, ldc:int(-1))
                    expr_450 = loadelement:byte(stack_450_0:byte[], var_5_43F:int)
                    storeelement:byte(var_3_43E:byte[], var_5_43F:int, or:int(and:int(shl:int(expr_450:byte, xor:int(ldc:int(1108), ldc:int(1104))), ldc:int(-16)), and:int(shr:int(expr_450:byte[expected:int], and:int(ldc:int(398), ldc:int(10292))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_43F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A4_0 = stack_A2_0 = stack_E5_0 = stack_E7_0 = stack_11D_0 = stack_11F_0 = stack_167_0 = stack_169_0 = stack_1B0_0 = stack_2D1_0 = stack_30C_0 = stack_37B_0 = stack_3D2_0 = stack_450_0 = var_3_43E:byte[]
            }
        }
        
        Label_0366:
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(8192)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-1969527418))
            goto(Label_0292)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0236)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(16)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-388360428))
            goto(Label_0171)
        }
        
        if (cmpeq:boolean(and:int(var_0_2AD:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_2AD = and:int(var_0_2AD:int, ldc:int(-747970255))
            goto(Label_0113)
        }
        
        var_3_1BC = initobject:String(String::<init>, stack_1B0_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_291_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24053), ldc:int(-24052)))
        expr_1CE = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3), ldc:int(4)))
        storeelement:String(expr_1CE:String[], xor:int(ldc:int(297), ldc:int(296)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, and:int(ldc:int(4244), ldc:int(-4245)), and:int(ldc:int(-3007), ldc:int(2734))))
        storeelement:String(expr_1CE:String[], and:int(ldc:int(-10043), ldc:int(1850)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, and:int(ldc:int(-6477), ldc:int(6412)), and:int(ldc:int(27164), ldc:int(1432))))
        storeelement:String(expr_1CE:String[], and:int(ldc:int(4263), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, and:int(ldc:int(9272), ldc:int(157)), xor:int(ldc:int(8218), ldc:int(8198))))
        storeelement:String(expr_1CE:String[], and:int(ldc:int(869), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, xor:int(ldc:int(-31599), ldc:int(-31603)), xor:int(ldc:int(11537), ldc:int(11576))))
        storeelement:String(expr_1CE:String[], and:int(ldc:int(12691), ldc:int(18443)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, xor:int(ldc:int(18510), ldc:int(18535)), xor:int(ldc:int(3126), ldc:int(3076))))
        storeelement:String(expr_1CE:String[], xor:int(ldc:int(2213), ldc:int(2215)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, xor:int(ldc:int(-31647), ldc:int(-31661)), and:int(ldc:int(10550), ldc:int(4342))))
        storeelement:String(expr_1CE:String[], xor:int(ldc:int(16405), ldc:int(16401)), invokevirtual:String[expected:String](String::substring, var_3_1BC:String, xor:int(ldc:int(1518), ldc:int(1496)), and:int(ldc:int(2239), ldc:int(13119))))
        putstatic:String[](\u960f\u3bc9\u74b1\uc238\ua562\uae5d::\u3504\ud7e8\u3e2a\uc84e\u4f4a\u51fa, expr_1CE:String[])
    }
    
    public void \u8bb0\u494c\u4f52\u5bc4\u7bad\u5fe1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(758526247), ldc:int(1730620343))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u960f\u3bc9\u74b1\uc238\ua562\uae5d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1477002938))
            var_5_81 = and:int(ldc:int(-2236), ldc:int(2107))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17793), ldc:int(-17794)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_672:int, ldc:int(-274220273))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(80), ldc:int(81)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(8261), ldc:int(16433)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D1:int, ldc:int(-1082671826))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1), ldc:int(2561)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(691217650))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-657057806))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-537638370))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1227053497))
                        goto(Label_0807)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(142055643))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-5888089))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-803568011))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1151634471))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1744058327))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1416629198))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2089317628))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1524158065))
                            var_11_E2 = and:int(ldc:int(13504), ldc:int(-13529))
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1340866248))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1347467500))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(929524004))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0807)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(720334620))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2136155381))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-277453915))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0807:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(157097577))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1251535710))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1078463737))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4227), ldc:int(24577))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1853872073))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1520587490))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1234328564))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-777668960))
                            goto(Label_0807)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(717000037))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1265787039))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(17078328))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1697556927))
                        var_11_E2 = and:int(ldc:int(4826), ldc:int(-4831))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(825631954))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1607954917))
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-603778363))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-773273075))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1082183203))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1104526153))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-899002258))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1913655228))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1160612574))
                            goto(Label_0807)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1055316690))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-496318587))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1072146917))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1231439417))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(888597468))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1894073786))
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1347489993))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-503053883))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1642446940))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1319391561))
                        goto(Label_0807)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-88057663))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1601224138))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(792126221))
                        var_17_67D = add:int(var_16_110:int, xor:int(ldc:int(19472), ldc:int(19473)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(39171230))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(1039543678))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, xor:int(ldc:int(192), ldc:int(193))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
