public class \u71f1\uc910\u3bc9\u516c\u93a2.\u600f\u527a\u7c6b\u8308\u120d {
    public void \u600f\u527a\u7c6b\u8308\u120d(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p0) {
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
    
    public void \u9033\u156b\u1187\u7c6b\u61a4\ua6bd(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_61 : int
        stack_99_0 : float [generated]
        stack_E4_0 : \u3d4b\u9af2\u71f1\u67d0\u99f7 [generated]
        expr_D4 : ITextComponent[] [generated]
        
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
            var_5_61 = and:int(ldc:int(-1026918463), ldc:int(-1711374337))
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, invokestatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u67e9\u6198\uc29a\ubefe\u759a\u385b, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u600f\u527a\u7c6b\u8308\u120d::\u8df4\u9255\u8c8a\u2dcc\u5db4, this:\u600f\u527a\u7c6b\u8308\u120d))), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u5f50\u7e3f\ufcaf\u98a4\uc29a\uc9f6))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u99f7\u12cb\u0800\u4bc8\u52d3\u8cae, this:\u600f\u527a\u7c6b\u8308\u120d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995]))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-1343225871))
                stack_99_0 = ldc:float(0.0f)
            }
            else {
                stack_99_0 = ldc:float(12.0f)
            }
            
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:int(\u600f\u527a\u7c6b\u8308\u120d::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, this:\u600f\u527a\u7c6b\u8308\u120d), getfield:int(\u600f\u527a\u7c6b\u8308\u120d::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, this:\u600f\u527a\u7c6b\u8308\u120d), ldc:float(0.0f), stack_99_0:float, ldc:int(12), ldc:int(12), ldc:int(12), ldc:int(24))
            
            if (invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\ucfaf\ud51e\u7e3f\u4ab3\u12b2\u4c2b, this:\u600f\u527a\u7c6b\u8308\u120d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], i2d:double(p1:int), i2d:double(p2:int))) {
                stack_E4_0 = getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u600f\u527a\u7c6b\u8308\u120d::\u8df4\u9255\u8c8a\u2dcc\u5db4, this:\u600f\u527a\u7c6b\u8308\u120d)
                expr_D4 = newarray:ITextComponent[](net.minecraft.util.text.ITextComponent.class, and:int(ldc:int(33), ldc:int(14345)))
                storeelement:ITextComponent(expr_D4:ITextComponent[], and:int(ldc:int(-10193), ldc:int(10128)), invokevirtual:ITextComponent(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\ufcaf\u927d\u6c52\u97b7\uc2e8\ud217, this:\u600f\u527a\u7c6b\u8308\u120d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995]))
                invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\ub1b9\u836c\uafe7\u0a06\ubcb0\u97b7, stack_E4_0:\u3d4b\u9af2\u71f1\u67d0\u99f7, expr_D4:ITextComponent[])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3e2a\u0a06\u3d4b\u8640\ub19c\u67e9$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\ud171\u416d\u67d0\uff55\u52d3\ub113, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u600f\u527a\u7c6b\u8308\u120d::\u8df4\u9255\u8c8a\u2dcc\u5db4, this:\u600f\u527a\u7c6b\u8308\u120d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_16F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_190_0 : byte[] [generated]
        stack_1CA_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2B1_0 : byte[] [generated]
        var_4_15C : int
        var_3_161 : byte[]
        var_5_162 : int
        expr_240 : byte [generated]
        var_0_2A7 : int
        expr_2B1 : byte [generated]
        stack_2DF_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1B9 : byte[]
        var_5_1BA : int
        expr_C3 : int [generated]
        expr_F6 : int [generated]
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_16F = and:int(ldc:int(122144806), ldc:int(728223463))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_190_0 = stack_1CA_0 = stack_23D_0 = stack_2B1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("0DtkAxQEG0TTRAe8/B0E9A47MA19RWY=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15C = expr_6B:int
        var_3_161 = newarray:byte[](byte.class, expr_6B:int)
        var_5_162 = expr_6B:int
        Label_0356:
        
        while (cmpne:boolean(and:int(var_0_16F:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(8192)), ldc:int(0))) {
                var_0_16F = and:int(var_0_16F:int, ldc:int(1825457503))
                goto(Label_0529)
            }
            
            var_0_16F = and:int(var_0_16F:int, ldc:int(-1048621906))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            storeelement:byte(var_3_161:byte[], var_5_162:int, add:byte(loadelement:byte(stack_190_0:byte[], var_5_162:int), ldc:byte(90)))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_190_0 = stack_1CA_0 = stack_23D_0 = stack_2B1_0 = var_3_161:byte[]
            goto(Label_0112)
        }
        
        var_0_16F = and:int(var_0_16F:int, ldc:int(-620200609))
        goto(Label_0645)
        Label_0529:
        
        while (cmpne:boolean(and:int(var_0_16F:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(8192)), ldc:int(0))) {
                var_0_16F = and:int(var_0_16F:int, ldc:int(738566487))
                goto(Label_0356)
            }
            
            var_0_16F = and:int(var_0_16F:int, ldc:int(-1854964490))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_240 = xor:byte(loadelement:byte(stack_23D_0:byte[], var_5_162:int), ldc:byte(89))
            storeelement:byte(var_3_161:byte[], var_5_162:int, or:int(and:int(shl:int(expr_240:byte, and:int(ldc:int(9604), ldc:int(18455))), ldc:int(-16)), and:int(shr:int(expr_240:byte[expected:int], and:int(ldc:int(4100), ldc:int(310))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_190_0 = stack_1CA_0 = stack_23D_0 = stack_2B1_0 = var_3_161:byte[]
            goto(Label_0200)
        }
        
        var_0_16F = and:int(var_0_16F:int, ldc:int(-385958482))
        Label_0645:
        
        while (cmpne:boolean(and:int(var_0_16F:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(65536)), ldc:int(0))) {
                var_0_16F = and:int(var_0_16F:int, ldc:int(-23338749))
                goto(Label_0356)
            }
            
            var_0_2A7 = and:int(var_0_16F:int, ldc:int(192400895))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_2B1 = loadelement:byte(stack_2B1_0:byte[], var_5_162:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_162:int, ldc:int(3)), neg:int(var_4_15C:int)), ldc:int(0))) {
                var_0_2A7 = and:int(var_0_2A7:int, ldc:int(834886318))
                stack_2DF_2 = add:byte(expr_2B1:byte, ldc:byte(3))
            }
            else {
                stack_2DF_2 = add:byte(expr_2B1:byte, loadelement:byte(var_3_161:byte[], add:int(var_5_162:int, ldc:int(3))))
            }
            
            var_0_16F = and:int(var_0_2A7:int, ldc:int(-649901402))
            storeelement:byte(var_3_161:byte[], var_5_162:int, stack_2DF_2:byte)
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_190_0 = stack_1CA_0 = stack_23D_0 = stack_2B1_0 = var_3_161:byte[]
            goto(Label_0251)
        }
        
        var_0_16F = and:int(var_0_16F:int, ldc:int(-1874785170))
        goto(Label_0529)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(2048)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(-142768304))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(769875647))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1B9 = newarray:byte[](byte.class, expr_98:int)
                var_5_1BA = expr_98:int
                
                loop {
                    var_0_16F = and:int(var_0_16F:int, ldc:int(401342246))
                    var_5_1BA = add:int(var_5_1BA:int, ldc:int(-1))
                    storeelement:byte(var_3_1B9:byte[], var_5_1BA:int, add:int(shl:int(loadelement:byte(stack_1CA_0:byte[], var_5_1BA:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1BA:int, xor:int(ldc:int(16512), ldc:int(16513)))), ldc:int(6)), xor:int(ldc:int(3090), ldc:int(3089)))))
                    
                    if (cmpne:boolean(var_5_1BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_190_0 = stack_1CA_0 = stack_23D_0 = stack_2B1_0 = var_3_1B9:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(8192)), ldc:int(0))) {
                var_0_16F = and:int(var_0_16F:int, ldc:int(968048307))
                goto(Label_0112)
            }
            
            var_0_16F = and:int(var_0_16F:int, ldc:int(197880807))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_15C = expr_C3:int
                var_3_161 = newarray:byte[](byte.class, expr_C3:int)
                var_5_162 = expr_C3:int
                goto(Label_0529)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(-945616104))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(512)), ldc:int(0))) {
                var_0_16F = and:int(var_0_16F:int, ldc:int(1941935037))
                goto(Label_0112)
            }
            
            var_0_16F = and:int(var_0_16F:int, ldc:int(-1622937858))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_4_15C = expr_F6:int
                var_3_161 = newarray:byte[](byte.class, expr_F6:int)
                var_5_162 = expr_F6:int
                goto(Label_0645)
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_155_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32684), ldc:int(-32683)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4101), ldc:int(257)))
            storeelement:String(expr_134:String[], and:int(ldc:int(9268), ldc:int(-9277)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(13059), ldc:int(-13060)), xor:int(ldc:int(2081), ldc:int(2103))))
            putstatic:String[](\u600f\u527a\u7c6b\u8308\u120d::\u3a62\ubefe\u71ae\u7bad\ua562, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(-614493267), ldc:int(-141564020))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\u527a\u7c6b\u8308\u120d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(-674291729))
            var_5_7D = and:int(ldc:int(8725), ldc:int(-8726))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10806), ldc:int(10805)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_660:int, ldc:int(-815814164))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, and:int(ldc:int(4113), ldc:int(18057)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, and:int(ldc:int(18441), ldc:int(1665)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_CD:int, ldc:int(-206629490))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(272), ldc:int(273)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(440026533))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1808134077))
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-72614913))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0579)
                            }
                            
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0379:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(610724064))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-463810270))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1526770283))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(577870189))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1488592022))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2091410782))
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1010396134))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1662168350))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-873766930))
                            var_11_DE = and:int(ldc:int(-20676), ldc:int(20675))
                            goto(Label_1522)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0579:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(162752015))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1215883868))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1795542535))
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1964439422))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-338962962))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-153318038))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2063138061))
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(782965046))
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1115988891))
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1404309563))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-677404195))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0836:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1764284951))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1068536690))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1895567390))
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(213393639))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(2085568004))
                            goto(Label_0579)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-339832516))
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1009049668))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = and:int(ldc:int(8225), ldc:int(2259))
                                goto(Label_1131)
                            }
                        }
                    }
                    
                    Label_0975:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(995309129))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1667914270))
                            goto(Label_0836)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(185793339))
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(283549554))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-546610179))
                        var_11_DE = and:int(ldc:int(-12273), ldc:int(11936))
                    }
                    
                    Label_1131:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1002366171))
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1181710345))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2018859195))
                            goto(Label_0975)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-315259414))
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0379)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-792789573))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-873774609))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1399)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1525653861))
                            goto(Label_1131)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0975)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(204795345))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1207214670))
                            goto(Label_0579)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(215880163))
                            goto(Label_0379)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(876058767))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-947177569))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                        goto(Label_1522)
                    }
                    
                    Label_1399:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-806936223))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-219951013))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1385057028))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0379)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-808768580))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1522:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1533:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1093380754))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1361105398))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2043942843))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0379)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-883984450))
                        var_17_66B = add:int(var_16_10C:int, xor:int(ldc:int(-32320), ldc:int(-32319)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-67371602))
                
                if (cmple:boolean(var_5_7D = var_17_66B:int, sub:int(var_6_84:int, and:int(ldc:int(8961), ldc:int(2051))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
