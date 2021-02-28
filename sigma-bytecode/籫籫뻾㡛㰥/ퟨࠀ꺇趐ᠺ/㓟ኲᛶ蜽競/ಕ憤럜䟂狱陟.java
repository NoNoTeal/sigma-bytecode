public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f {
    public void \u0c95\u61a4\ub7dc\u47c2\u72f1\u965f(com.mojang.datafixers.schemas.Schema p0, boolean p1, java.lang.String p2, java.util.function.Function<java.lang.String, java.lang.String> p3) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f, p0:Schema, p1:boolean)
            putfield:String(\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f::\u3a62\u416d\u4d85\u0b8e\ud217\u92ee, this:\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f, p2:String)
            putfield:Function<String, String>(\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f::\ud12e\ub171\ubefe\u4179\u6d99\u1187, this:\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f, p3:Function<String, String>)
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
    
    private java.util.function.Function lambda$\u71f1\u8753\u8d90\u7330\u8389\uc2bd$1(com.mojang.serialization.DynamicOps p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\uff55\ube23\ud171\ub8be\u34df\u61a4$0(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(invokevirtual:Pair(Pair::mapSecond, p0:Pair, getfield:Function<String, String>(\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f::\ud12e\ub171\ubefe\u4179\u6d99\u1187, this:\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_18F : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1A8_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        stack_281_0 : byte[] [generated]
        stack_2D4_0 : byte[] [generated]
        var_4_17C : int
        var_3_181 : byte[]
        var_5_182 : int
        var_0_1E9 : int
        expr_1F3 : byte [generated]
        stack_22F_2 : byte [generated]
        stack_20E_0 : byte [generated]
        expr_284 : byte [generated]
        expr_A6 : int [generated]
        expr_E1 : int [generated]
        var_2_10A : byte[]
        expr_10E : int [generated]
        var_3_2C3 : byte[]
        var_5_2C4 : int
        var_3_142 : String
        stack_175_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_18F = and:int(ldc:int(2123054325), ldc:int(-275811099))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_DF_0 = stack_E1_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1A8_0 = stack_1F3_0 = stack_281_0 = stack_2D4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("QPVm4WpYjGpNevULyHIQ6m9JFGnzS26W4mvwFuju3OV5egF5GQw=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17C = expr_6B:int
        var_3_181 = newarray:byte[](byte.class, expr_6B:int)
        var_5_182 = expr_6B:int
        Label_0388:
        
        while (cmpne:boolean(and:int(var_0_18F:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0471)
            }
            
            var_0_18F = and:int(var_0_18F:int, ldc:int(1565152742))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            storeelement:byte(var_3_181:byte[], var_5_182:int, add:byte(loadelement:byte(stack_1A8_0:byte[], var_5_182:int), ldc:byte(18)))
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DF_0 = stack_E1_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1A8_0 = stack_1F3_0 = stack_281_0 = stack_2D4_0 = var_3_181:byte[]
            goto(Label_0112)
        }
        
        var_0_18F = and:int(var_0_18F:int, ldc:int(-1726172078))
        goto(Label_0597)
        Label_0471:
        
        while (cmpne:boolean(and:int(var_0_18F:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0388)
            }
            
            var_0_1E9 = and:int(var_0_18F:int, ldc:int(1577656044))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_1F3 = stack_22F_2 = loadelement(stack_1F3_0, var_5_182)
            
            if (cmplt:boolean(add:int(add:int(var_5_182:int, ldc:int(6)), neg:int(var_4_17C:int)), ldc:int(0))) {
                stack_22F_2 = stack_20E_0 = add:byte(expr_1F3:byte, loadelement:byte(var_3_181:byte[], add:int(var_5_182:int, ldc:int(6))))
                goto(Label_0542)
            }
            
            Label_0512:
            
            if (cmpne:boolean(and:int(var_0_1E9:int, ldc:int(4096)), ldc:int(0))) {
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-279094529))
                stack_22F_2 = stack_20E_0 = add:byte(expr_1F3:byte, ldc:byte(6))
            }
            
            Label_0542:
            
            if (cmpeq:boolean(and:int(var_0_1E9:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0512)
            }
            
            var_0_18F = and:int(var_0_1E9:int, ldc:int(1559837174))
            storeelement:byte(var_3_181:byte[], var_5_182:int, stack_22F_2:byte)
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DF_0 = stack_E1_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1A8_0 = stack_1F3_0 = stack_281_0 = stack_2D4_0 = var_3_181:byte[]
            goto(Label_0171)
        }
        
        Label_0597:
        
        while (cmpne:boolean(and:int(var_0_18F:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_18F = and:int(var_0_18F:int, ldc:int(1198105005))
                goto(Label_0388)
            }
            
            var_0_18F = and:int(var_0_18F:int, ldc:int(2124240622))
            var_5_182 = add:int(var_5_182:int, ldc:int(-1))
            expr_284 = xor:byte(loadelement:byte(stack_281_0:byte[], var_5_182:int), ldc:byte(35))
            storeelement:byte(var_3_181:byte[], var_5_182:int, or:int(and:int(shl:int(expr_284:byte, and:int(ldc:int(292), ldc:int(6284))), ldc:int(-16)), and:int(shr:int(expr_284:byte[expected:int], xor:int(ldc:int(418), ldc:int(422))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_182:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_DF_0 = stack_E1_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1A8_0 = stack_1F3_0 = stack_281_0 = stack_2D4_0 = var_3_181:byte[]
            goto(Label_0230)
        }
        
        var_0_18F = and:int(var_0_18F:int, ldc:int(-1023706739))
        goto(Label_0471)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-1257949728))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(128)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(1290564415))
            goto(Label_0230)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(128)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-258831202))
        }
        else {
            var_0_18F = and:int(var_0_18F:int, ldc:int(1291482351))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_17C = expr_A6:int
                var_3_181 = newarray:byte[](byte.class, expr_A6:int)
                var_5_182 = expr_A6:int
                goto(Label_0471)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(848798736))
            goto(Label_0275)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(-882943470))
        }
        else {
            if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(2)), ldc:int(0))) {
                var_0_18F = and:int(var_0_18F:int, ldc:int(1612350557))
                goto(Label_0112)
            }
            
            var_0_18F = and:int(var_0_18F:int, ldc:int(1585001463))
            expr_E1 = arraylength:int(stack_E1_0:byte[])
            
            if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                var_4_17C = expr_E1:int
                var_3_181 = newarray:byte[](byte.class, expr_E1:int)
                var_5_182 = expr_E1:int
                goto(Label_0597)
            }
        }
        
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(4)), ldc:int(0))) {
                var_0_18F = and:int(var_0_18F:int, ldc:int(-985009439))
                goto(Label_0112)
            }
            
            var_0_18F = and:int(var_0_18F:int, ldc:int(-296979714))
            var_2_10A = stack_10A_0:byte[]
            expr_10E = add:int(arraylength:int(stack_10C_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_10E:int, ldc:int(0))) {
                var_3_2C3 = newarray:byte[](byte.class, expr_10E:int)
                var_5_2C4 = expr_10E:int
                
                loop {
                    var_0_18F = and:int(var_0_18F:int, ldc:int(-540305940))
                    var_5_2C4 = add:int(var_5_2C4:int, ldc:int(-1))
                    storeelement:byte(var_3_2C3:byte[], var_5_2C4:int, add:int(shl:int(loadelement:byte(stack_2D4_0:byte[], var_5_2C4:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_10A:byte[], add:int(var_5_2C4:int, xor:int(ldc:int(20546), ldc:int(20547)))), ldc:int(3)), and:int(ldc:int(9791), ldc:int(20767)))))
                    
                    if (cmpne:boolean(var_5_2C4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_DF_0 = stack_E1_0 = stack_10A_0 = stack_10C_0 = stack_136_0 = stack_1A8_0 = stack_1F3_0 = stack_281_0 = stack_2D4_0 = var_3_2C3:byte[]
            }
        }
        
        Label_0275:
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(64)), ldc:int(0))) {
            var_0_18F = and:int(var_0_18F:int, ldc:int(1303695796))
            goto(Label_0230)
        }
        
        if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(2)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_175_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17540), ldc:int(17541)))
            expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17), ldc:int(16)))
            storeelement:String(expr_154:String[], and:int(ldc:int(-9682), ldc:int(9681)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(17030), ldc:int(-17031)), and:int(ldc:int(18301), ldc:int(8229))))
            putstatic:String[](\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f::\u0c95\u4179\u7043\u6cfe\u71ae\uc238, expr_154:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u8308\u8258\u7006\ub32d\u446c\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_686 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DB : int
        var_11_EC : int
        var_14_116 : double
        var_16_11A : int
        var_12_112 : double
        var_17_691 : int
        
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
        var_3_686 = and:int(ldc:int(-1666218833), ldc:int(-1623203777))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0c95\u61a4\ub7dc\u47c2\u72f1\u965f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(262144)), ldc:int(0))) {
            var_3_686 = and:int(var_3_686:int, ldc:int(2056938375))
        }
        else {
            var_3_686 = and:int(var_3_686:int, ldc:int(-62933841))
            var_5_85 = and:int(ldc:int(-29498), ldc:int(29481))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17610), ldc:int(-21707)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DB = and:int(var_3_686:int, ldc:int(-587739345))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EC = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EC:int, sub:int(var_6_8C:int, xor:int(ldc:int(17792), ldc:int(17793)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EC:int, xor:int(ldc:int(384), ldc:int(385)))), var_7_9B:double))) {
                        inc:int(var_11_EC, ldc:int(1))
                    }
                    
                    var_3_686 = and:int(var_3_DB:int, ldc:int(-1670409217))
                    var_14_116 = var_7_9B:double
                    var_16_11A = var_11_EC:int
                }
                else {
                    var_11_EC = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16725), ldc:int(5673)))
                    var_12_112 = var_14_116 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11A = var_11_EC:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EC:int)
                        var_16_11A = var_11_EC:int
                        var_14_116 = var_12_112:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-2093880149))
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1186983310))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-783218126))
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1773896482))
                    }
                    else {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1079512005))
                        
                        if (cmplt:boolean(var_16_11A:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(269580468))
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-2140656764))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(86400862))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-596117573))
                        var_11_EC = and:int(ldc:int(19337), ldc:int(-19338))
                        goto(Label_1559)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1599926661))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-402834592))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(470831620))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-558906193))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_116 = var_9_C9:double
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1307538949))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-657149148))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(250697467))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(105170376))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1128645046))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1516293671))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1156491746))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1641025153))
                        var_14_116 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_116:double))
                    }
                    
                    Label_0828:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(2074025661))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1615854266))
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1372874865))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1566399271))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-376874231))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1249334200))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-42481281))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EC = and:int(ldc:int(79), ldc:int(2049))
                                goto(Label_1135)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-306262569))
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1836763710))
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1369681754))
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1756396634))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-171715338))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1013218467))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1648914321))
                        var_11_EC = and:int(ldc:int(-28057), ldc:int(27928))
                    }
                    
                    Label_1135:
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1485933714))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1097354408))
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1330379467))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-7770058))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1101217980))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1098929173))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EC:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1265:
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1570)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1135)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1894908131))
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-180936368))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(987328268))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1079006341))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_116:double, var_5_85:int, var_16_11A:int)
                        goto(Label_1559)
                    }
                    
                    Label_1389:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1574067167))
                        goto(Label_1570)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(308027725))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1883438745))
                        goto(Label_1135)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-212726633))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1859467932))
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-523634969))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1777202127))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(991080922))
                        loopcontinue()
                    }
                    
                    var_3_686 = and:int(var_3_686:int, ldc:int(-601379157))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_116:double, ldc:double(0.0))
                    Label_1559:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_691 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EC:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1570:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(432297853))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1135)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1697863863))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-596138309))
                        var_17_691 = add:int(var_16_11A:int, xor:int(ldc:int(16896), ldc:int(16897)))
                        looporswitchbreak()
                    }
                    
                    var_3_686 = and:int(var_3_686:int, ldc:int(-538173777))
                }
                
                var_3_686 = and:int(var_3_686:int, ldc:int(-46687057))
                
                if (cmple:boolean(var_5_85 = var_17_691:int, sub:int(var_6_8C:int, and:int(ldc:int(18571), ldc:int(4097))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
            var_3_686 = and:int(var_3_686:int, ldc:int(778188666))
            goto(Label_0106)
        }
    }
}
