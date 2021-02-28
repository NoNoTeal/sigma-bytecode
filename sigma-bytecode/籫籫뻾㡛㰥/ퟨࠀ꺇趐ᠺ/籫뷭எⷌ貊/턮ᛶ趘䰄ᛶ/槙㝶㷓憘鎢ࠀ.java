public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u69d9\u3776\u3dd3\u6198\u93a2\u0800 {
    public void \u69d9\u3776\u3dd3\u6198\u93a2\u0800(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u69d9\u3776\u3dd3\u6198\u93a2\u0800, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u8258\ub32d\u8389\ubb2b\ud12e\uc910$1(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\ub171\u1187\u98a4\ubcb0\ufe34\u7049$0(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, loadelement:String(getstatic:String[](\u69d9\u3776\u3dd3\u6198\u93a2\u0800::\u9033\u5140\uae87\ud523\u61a4\u4ab3), and:int(ldc:int(281), ldc:int(1025))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, loadelement:String(getstatic:String[](\u69d9\u3776\u3dd3\u6198\u93a2\u0800::\u9033\u5140\uae87\ud523\u61a4\u4ab3), xor:int(ldc:int(-8128), ldc:int(-8126))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19D : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_1BE_0 : byte[] [generated]
        stack_1FB_0 : byte[] [generated]
        stack_25E_0 : byte[] [generated]
        stack_2C7_0 : byte[] [generated]
        var_4_18A : int
        var_3_18F : byte[]
        var_5_190 : int
        expr_25E : byte [generated]
        var_0_2BD : int
        expr_2C7 : byte [generated]
        stack_2F5_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1EA : byte[]
        var_5_1EB : int
        expr_C3 : int [generated]
        expr_E6 : int [generated]
        var_3_11A : String
        stack_183_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
        var_0_19D = and:int(ldc:int(-1406547918), ldc:int(-1107568781))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1BE_0 = stack_1FB_0 = stack_25E_0 = stack_2C7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3mfL3rjBCch529vPB9iklEql1rvRzLH778aRm5E=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_18A = expr_6B:int
        var_3_18F = newarray:byte[](byte.class, expr_6B:int)
        var_5_190 = expr_6B:int
        Label_0402:
        
        while (cmpne:boolean(and:int(var_0_19D:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(65536)), ldc:int(0))) {
                var_0_19D = and:int(var_0_19D:int, ldc:int(1943039915))
                goto(Label_0578)
            }
            
            var_0_19D = and:int(var_0_19D:int, ldc:int(-289800778))
            var_5_190 = add:int(var_5_190:int, ldc:int(-1))
            storeelement:byte(var_3_18F:byte[], var_5_190:int, xor:byte(add:byte(loadelement:byte(stack_1BE_0:byte[], var_5_190:int), ldc:byte(60)), ldc:byte(13)))
            
            if (cmpne:boolean(var_5_190:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1BE_0 = stack_1FB_0 = stack_25E_0 = stack_2C7_0 = var_3_18F:byte[]
            goto(Label_0112)
        }
        
        var_0_19D = and:int(var_0_19D:int, ldc:int(-422040403))
        goto(Label_0675)
        Label_0578:
        
        while (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0402)
            }
            
            var_0_19D = and:int(var_0_19D:int, ldc:int(-868382465))
            var_5_190 = add:int(var_5_190:int, ldc:int(-1))
            expr_25E = loadelement:byte(stack_25E_0:byte[], var_5_190:int)
            storeelement:byte(var_3_18F:byte[], var_5_190:int, or:int(and:int(shl:int(expr_25E:byte, xor:int(ldc:int(4451), ldc:int(4455))), ldc:int(-16)), and:int(shr:int(expr_25E:byte[expected:int], and:int(ldc:int(17444), ldc:int(76))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_190:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1BE_0 = stack_1FB_0 = stack_25E_0 = stack_2C7_0 = var_3_18F:byte[]
            goto(Label_0200)
        }
        
        Label_0675:
        
        while (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0402)
            }
            
            var_0_2BD = and:int(var_0_19D:int, ldc:int(-1375881293))
            var_5_190 = add:int(var_5_190:int, ldc:int(-1))
            expr_2C7 = loadelement:byte(stack_2C7_0:byte[], var_5_190:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_190:int, ldc:int(2)), neg:int(var_4_18A:int)), ldc:int(0))) {
                var_0_2BD = and:int(var_0_2BD:int, ldc:int(-1924280333))
                stack_2F5_2 = add:byte(expr_2C7:byte, ldc:byte(2))
            }
            else {
                stack_2F5_2 = add:byte(expr_2C7:byte, loadelement:byte(var_3_18F:byte[], add:int(var_5_190:int, ldc:int(2))))
            }
            
            var_0_19D = and:int(var_0_2BD:int, ldc:int(-872429770))
            storeelement:byte(var_3_18F:byte[], var_5_190:int, stack_2F5_2:byte)
            
            if (cmpne:boolean(var_5_190:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1BE_0 = stack_1FB_0 = stack_25E_0 = stack_2C7_0 = var_3_18F:byte[]
            goto(Label_0235)
        }
        
        var_0_19D = and:int(var_0_19D:int, ldc:int(-1242874399))
        goto(Label_0578)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_19D = and:int(var_0_19D:int, ldc:int(1508377536))
        }
        else {
            var_0_19D = and:int(var_0_19D:int, ldc:int(-369250050))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1EA = newarray:byte[](byte.class, expr_98:int)
                var_5_1EB = expr_98:int
                
                loop {
                    var_0_19D = and:int(var_0_19D:int, ldc:int(-1899368449))
                    var_5_1EB = add:int(var_5_1EB:int, ldc:int(-1))
                    storeelement:byte(var_3_1EA:byte[], var_5_1EB:int, add:int(shl:int(loadelement:byte(stack_1FB_0:byte[], var_5_1EB:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1EB:int, xor:int(ldc:int(-32064), ldc:int(-32063)))), ldc:int(5)), xor:int(ldc:int(25637), ldc:int(25634)))))
                    
                    if (cmpne:boolean(var_5_1EB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_E4_0 = stack_E6_0 = stack_10E_0 = stack_1BE_0 = stack_1FB_0 = stack_25E_0 = stack_2C7_0 = var_3_1EA:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_19D = and:int(var_0_19D:int, ldc:int(1270683382))
        }
        else {
            if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_19D = and:int(var_0_19D:int, ldc:int(-99763394))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_18A = expr_C3:int
                var_3_18F = newarray:byte[](byte.class, expr_C3:int)
                var_5_190 = expr_C3:int
                goto(Label_0578)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_19D = and:int(var_0_19D:int, ldc:int(-1423071298))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_4_18A = expr_E6:int
                var_3_18F = newarray:byte[](byte.class, expr_E6:int)
                var_5_190 = expr_E6:int
                goto(Label_0675)
            }
        }
        
        Label_0235:
        
        if (cmpeq:boolean(and:int(var_0_19D:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_19D = and:int(var_0_19D:int, ldc:int(1203861198))
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_19D:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_183_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(22883), ldc:int(19)))
            expr_12C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(7), ldc:int(4)))
            storeelement:String(expr_12C:String[], and:int(ldc:int(6198), ldc:int(-6263)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(4356), ldc:int(-4357)), and:int(ldc:int(10778), ldc:int(17426))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(5395), ldc:int(16578)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(17046), ldc:int(17028)), and:int(ldc:int(790), ldc:int(16630))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(16548), ldc:int(16549)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(3081), ldc:int(3103)), and:int(ldc:int(4124), ldc:int(17533))))
            putstatic:String[](\u69d9\u3776\u3dd3\u6198\u93a2\u0800::\u9033\u5140\uae87\ud523\u61a4\u4ab3, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u8c8a\u4c04\ua562\u2dcc\u92ff\u5d20(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A7 : int
        
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
        var_3_69C = and:int(ldc:int(1478428764), ldc:int(-61604546))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u69d9\u3776\u3dd3\u6198\u93a2\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_69C = and:int(var_3_69C:int, ldc:int(-198171951))
        }
        else {
            var_3_69C = and:int(var_3_69C:int, ldc:int(-623043602))
            var_5_85 = and:int(ldc:int(31304), ldc:int(-31307))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4574), ldc:int(4569)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69C:int, ldc:int(-608998934))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(14465), ldc:int(17985)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-31456), ldc:int(-31455)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69C = and:int(var_3_DA:int, ldc:int(2037066009))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(7619), ldc:int(5)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(319561318))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1874171235))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-242975341))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1704176626))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-375887448))
                    }
                    else {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1495128699))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1638559296))
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1187373764))
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1714730111))
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1205937651))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-654375707))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(656734138))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-670745688))
                            var_11_EB = and:int(ldc:int(4489), ldc:int(-4558))
                            goto(Label_1567)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(578556108))
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1477094850))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1473506997))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1927994984))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-1205833796))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1548078968))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-762059307))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1288791243))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1965155530))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(293986629))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-457199870))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-605578067))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1988116050))
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-981400855))
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1280729020))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-536282417))
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1250498829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-566574849))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1555669569))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1011420422))
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(2052667823))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(21089), ldc:int(11283))
                                goto(Label_1127)
                            }
                        }
                    }
                    
                    Label_0991:
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(390258248))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-1610799370))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-557064660))
                        var_11_EB = and:int(ldc:int(-15149), ldc:int(13100))
                    }
                    
                    Label_1127:
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-849708412))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(973668086))
                            goto(Label_0991)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1468258060))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1228654093))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-1842427617))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(49517377))
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-658022579))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1417)
                            }
                        }
                    }
                    
                    Label_1263:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1805955601))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(577601533))
                            goto(Label_1127)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(884595686))
                            goto(Label_0991)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-1393765833))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-1093767855))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(1048758389))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69C = and:int(var_3_69C:int, ldc:int(-681300564))
                            loopcontinue()
                        }
                        
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1513728158))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1567)
                    }
                    
                    Label_1417:
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-441529809))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(893813633))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(719490224))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-29310515))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1984696101))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-2079661434))
                        loopcontinue()
                    }
                    
                    var_3_69C = and:int(var_3_69C:int, ldc:int(1533669160))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1567:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A7 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1578:
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-483536355))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1127)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1551599640))
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(1977310230))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(-1457904468))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(258998135))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69C = and:int(var_3_69C:int, ldc:int(2055821768))
                        var_17_6A7 = add:int(var_16_119:int, xor:int(ldc:int(-28639), ldc:int(-28640)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69C = and:int(var_3_69C:int, ldc:int(-545829924))
                
                if (cmple:boolean(var_5_85 = var_17_6A7:int, sub:int(var_6_8C:int, and:int(ldc:int(2465), ldc:int(5121))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_69C:int, ldc:int(1)), ldc:int(0))) {
            var_3_69C = and:int(var_3_69C:int, ldc:int(91820248))
            goto(Label_0106)
        }
    }
}
