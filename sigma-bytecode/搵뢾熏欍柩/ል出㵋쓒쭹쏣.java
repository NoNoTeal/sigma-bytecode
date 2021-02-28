public class \u6435\ub8be\u718f\u6b0d\u67e9.\u120d\u51fa\u3d4b\uc4d2\ucb79\uc3e3 {
    public void \u120d\u51fa\u3d4b\uc4d2\ucb79\uc3e3(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u120d\u51fa\u3d4b\uc4d2\ucb79\uc3e3, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u5d20\u0c95\u7bad\uae87\u92ff\uc31c$1(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\uc4d2\u1833\ua61f\u8aa5\u600f\u5f50$0(com.mojang.datafixers.Typed p0, com.mojang.datafixers.OpticFinder p1, com.mojang.serialization.Dynamic p2) {
        var_3_5F : int
        var_5_65 : Optional
        stack_A2_0 : Dynamic [generated]
        
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
            var_3_5F = and:int(ldc:int(1790359156), ldc:int(718777143))
            var_5_65 = invokevirtual:Optional(Typed::getOptional, p0:Typed, p1:OpticFinder)
            
            if (logicaland:boolean(invokevirtual:boolean(Optional<T>::isPresent, var_5_65:Optional<Object>), invokestatic:boolean(Objects::equals, invokevirtual:Object(Optional<Object>::get, var_5_65:Optional<Object>), loadelement:String[expected:Object](getstatic:String[](\u120d\u51fa\u3d4b\uc4d2\ucb79\uc3e3::\ub32d\u40a9\ub102\ubf56\u67e9\uc84e), and:int(ldc:int(8218), ldc:int(1318)))))) {
                stack_A2_0 = p2:Dynamic
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-353104307))
                stack_A2_0 = invokestatic:Dynamic<?>(\u839e\u983f\u4f4a\u3504\u6ec6\u8753::\u3bd6\uc31c\u5654\u36d3\u7873\u8308, p2:Dynamic)
            }
            
            return:Dynamic(stack_A2_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1AD : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1CE_0 : byte[] [generated]
        stack_21E_0 : byte[] [generated]
        stack_289_0 : byte[] [generated]
        stack_2D7_0 : byte[] [generated]
        var_4_19A : int
        var_3_19F : byte[]
        var_5_1A0 : int
        expr_1CE : byte [generated]
        var_0_2CD : int
        expr_2D7 : byte [generated]
        stack_305_2 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_20D : byte[]
        var_5_20E : int
        expr_BB : int [generated]
        expr_EE : int [generated]
        var_3_12A : String
        stack_193_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_1AD = and:int(ldc:int(-1665230762), ldc:int(-1154023681))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CE_0 = stack_21E_0 = stack_289_0 = stack_2D7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("IHnzru5vObJyu3GjdbOzu7Uk/fSxrPqkeDRxdvOyefIh+PJ2JL82szEz8LF7dOLkv7Vx9bQ1MjBxww0MDg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_19A = expr_6B:int
        var_3_19F = newarray:byte[](byte.class, expr_6B:int)
        var_5_1A0 = expr_6B:int
        Label_0418:
        
        while (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(128)), ldc:int(0))) {
                var_0_1AD = and:int(var_0_1AD:int, ldc:int(2040000186))
                goto(Label_0613)
            }
            
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-1648558465))
            var_5_1A0 = add:int(var_5_1A0:int, ldc:int(-1))
            expr_1CE = loadelement:byte(stack_1CE_0:byte[], var_5_1A0:int)
            storeelement:byte(var_3_19F:byte[], var_5_1A0:int, or:int(and:int(shl:int(expr_1CE:byte, and:int(ldc:int(2660), ldc:int(21636))), ldc:int(-16)), and:int(shr:int(expr_1CE:byte[expected:int], and:int(ldc:int(19476), ldc:int(4230))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1A0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CE_0 = stack_21E_0 = stack_289_0 = stack_2D7_0 = var_3_19F:byte[]
            goto(Label_0112)
        }
        
        var_0_1AD = and:int(var_0_1AD:int, ldc:int(1521263020))
        goto(Label_0699)
        Label_0613:
        
        while (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0418)
            }
            
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-1120469122))
            var_5_1A0 = add:int(var_5_1A0:int, ldc:int(-1))
            storeelement:byte(var_3_19F:byte[], var_5_1A0:int, xor:byte(add:byte(loadelement:byte(stack_289_0:byte[], var_5_1A0:int), ldc:byte(53)), ldc:byte(5)))
            
            if (cmpne:boolean(var_5_1A0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CE_0 = stack_21E_0 = stack_289_0 = stack_2D7_0 = var_3_19F:byte[]
            goto(Label_0192)
        }
        
        var_0_1AD = and:int(var_0_1AD:int, ldc:int(274927791))
        Label_0699:
        
        while (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0418)
            }
            
            var_0_2CD = and:int(var_0_1AD:int, ldc:int(-666895107))
            var_5_1A0 = add:int(var_5_1A0:int, ldc:int(-1))
            expr_2D7 = loadelement:byte(stack_2D7_0:byte[], var_5_1A0:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1A0:int, ldc:int(3)), neg:int(var_4_19A:int)), ldc:int(0))) {
                var_0_2CD = and:int(var_0_2CD:int, ldc:int(-608921378))
                stack_305_2 = add:byte(expr_2D7:byte, ldc:byte(3))
            }
            else {
                stack_305_2 = add:byte(expr_2D7:byte, loadelement:byte(var_3_19F:byte[], add:int(var_5_1A0:int, ldc:int(3))))
            }
            
            var_0_1AD = and:int(var_0_2CD:int, ldc:int(-101327874))
            storeelement:byte(var_3_19F:byte[], var_5_1A0:int, stack_305_2:byte)
            
            if (cmpne:boolean(var_5_1A0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CE_0 = stack_21E_0 = stack_289_0 = stack_2D7_0 = var_3_19F:byte[]
            goto(Label_0243)
        }
        
        goto(Label_0613)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-587858210))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_20D = newarray:byte[](byte.class, expr_90:int)
                var_5_20E = expr_90:int
                
                loop {
                    var_0_1AD = and:int(var_0_1AD:int, ldc:int(-664364))
                    var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
                    storeelement:byte(var_3_20D:byte[], var_5_20E:int, add:int(shl:int(loadelement:byte(stack_21E_0:byte[], var_5_20E:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_20E:int, and:int(ldc:int(24601), ldc:int(67)))), ldc:int(2)), xor:int(ldc:int(-32640), ldc:int(-32577)))))
                    
                    if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1CE_0 = stack_21E_0 = stack_289_0 = stack_2D7_0 = var_3_20D:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1AD = and:int(var_0_1AD:int, ldc:int(1930252108))
                goto(Label_0112)
            }
            
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-109060652))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_19A = expr_BB:int
                var_3_19F = newarray:byte[](byte.class, expr_BB:int)
                var_5_1A0 = expr_BB:int
                goto(Label_0613)
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(128)), ldc:int(0))) {
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-73279504))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(16384)), ldc:int(0))) {
                var_0_1AD = and:int(var_0_1AD:int, ldc:int(-808140494))
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-1170744746))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_4_19A = expr_EE:int
                var_3_19F = newarray:byte[](byte.class, expr_EE:int)
                var_5_1A0 = expr_EE:int
                goto(Label_0699)
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_1AD:int, ldc:int(16)), ldc:int(0))) {
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-1624792724))
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpne:boolean(and:int(var_0_1AD:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1AD = and:int(var_0_1AD:int, ldc:int(-757606624))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_193_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10529), ldc:int(10530)))
        expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1095), ldc:int(12835)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(161), ldc:int(4099)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(17249), ldc:int(-17252)), xor:int(ldc:int(16665), ldc:int(16698))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(-20288), ldc:int(3387)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(3263), ldc:int(3228)), and:int(ldc:int(53), ldc:int(16935))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(10246), ldc:int(4282)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(4197), ldc:int(8509)), and:int(ldc:int(16572), ldc:int(14396))))
        putstatic:String[](\u120d\u51fa\u3d4b\uc4d2\ucb79\uc3e3::\ub32d\u40a9\ub102\ubf56\u67e9\uc84e, expr_13C:String[])
    }
    
    public void \u7006\u4d85\u7c6b\ufcaf\u9a18\ud36e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_6A6 : int
        
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
        var_3_69B = and:int(ldc:int(-1333326473), ldc:int(-1736180233))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u120d\u51fa\u3d4b\uc4d2\ucb79\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
            var_3_69B = and:int(var_3_69B:int, ldc:int(978867824))
        }
        else {
            var_3_69B = and:int(var_3_69B:int, ldc:int(-555586177))
            var_5_85 = and:int(ldc:int(12814), ldc:int(-29344))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15625), ldc:int(15624)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_69B:int, ldc:int(-257257481))
                    var_9_C3 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_8C:int, and:int(ldc:int(17), ldc:int(6149)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, and:int(ldc:int(4161), ldc:int(10677)))), var_7_9B:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_69B = and:int(var_3_D5:int, ldc:int(-792728193))
                    var_14_110 = var_7_9B:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(258), ldc:int(259)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_8C:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1959466502))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1475502289))
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-431348044))
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1118544273))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(506336789))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1663254551))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-772824411))
                    }
                    else {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-253052553))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0432:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1623229625))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1363831639))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-658268809))
                        var_11_E6 = and:int(ldc:int(-26841), ldc:int(26816))
                        goto(Label_1598)
                    }
                    
                    Label_0574:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1110237453))
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-989240892))
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-21641617))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(130247151))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-41004422))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(932626152))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1569428001))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1076938249))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0725:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(2019266818))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-959350014))
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-910827454))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1496946355))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(610660179))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1607919809))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1745093633))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1299933545))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1786563765))
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(381868384))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(318941245))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-106971777))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E6 = xor:int(ldc:int(1920), ldc:int(1921))
                                goto(Label_1153)
                            }
                        }
                    }
                    
                    Label_0994:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(113553217))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(13710929))
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(775696923))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1755334638))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-775184897))
                        var_11_E6 = and:int(ldc:int(28885), ldc:int(-29912))
                    }
                    
                    Label_1153:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1783692005))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-512348434))
                        goto(Label_1454)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0994)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1121744156))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(226322228))
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(341242538))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-470233423))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(922822357))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1299011201))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1454)
                            }
                        }
                    }
                    
                    Label_1303:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(2004677123))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1153)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-590885404))
                            goto(Label_0994)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(321684537))
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-1264345858))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1782262711))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(827154961))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1109709961))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_85:int, var_16_114:int)
                        goto(Label_1598)
                    }
                    
                    Label_1454:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(780573506))
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(91474878))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1072974632))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(80834616))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(35503708))
                        loopcontinue()
                    }
                    
                    var_3_69B = and:int(var_3_69B:int, ldc:int(-560051849))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1598:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A6 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1609:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1454)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(518987876))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0725)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1094255625))
                        var_17_6A6 = add:int(var_16_114:int, and:int(ldc:int(11557), ldc:int(667)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69B = and:int(var_3_69B:int, ldc:int(-1702642177))
                
                if (cmple:boolean(var_5_85 = var_17_6A6:int, sub:int(var_6_8C:int, and:int(ldc:int(20485), ldc:int(8257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
