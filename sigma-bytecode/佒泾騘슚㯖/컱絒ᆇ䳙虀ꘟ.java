public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ucef1\u7d52\u1187\u4cd9\u8640\ua61f {
    public void \ucef1\u7d52\u1187\u4cd9\u8640\ua61f(\u5d20\u97b7\u8753\u873d\u16f6.\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d p0, net.minecraft.util.text.ITextComponent p2, java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> p3, java.lang.String p4, \u12b2\u7049\u8df4\uc9f6\uae87.\u7006\uc3e3\uc910\u9033\u8c8a p5) {
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
    
    public void \u8413\u4492\uc2e8\u946b\u1187\u516c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, float p9) {
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
            invokevirtual:void(\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee::\u392e\u7c6b\u36d3\u12cb\u9a18\u5f50, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f[expected:\u92ee\u6bb9\uc7fe\ub102\u52d3\u92ee], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p2:int, p3:int)
            putfield:int(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\u69d9\u7006\ubff1\u6c56\uff55\ua6bd, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), sub:int(add:int(p3:int, p4:int), ldc:int(44)))
            putfield:int(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\u69d9\u7006\ubff1\u6c56\uff55\ua6bd, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), p2:int)
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\u69d9\u7006\ubff1\u6c56\uff55\ua6bd, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p6:int, p7:int, p9:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u16f6\ud523\u5654\u0b8e\u4179\u527a$0(\u12b2\u7049\u8df4\uc9f6\uae87.\u7006\uc3e3\uc910\u9033\u8c8a p0, java.lang.String p1) {
        var_3_5F : int
        
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
            var_3_5F = and:int(ldc:int(-326673370), ldc:int(-1297649686))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7006\uc3e3\uc910\u9033\u8c8a::\u9937\uc84e\ubff1\u6ec6\ua3b4\u1187, p0:\u7006\uc3e3\uc910\u9033\u8c8a, p1:String))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-393326950))
                invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u7049\uae87\u3e2a\u839e\u3bc9\u3504, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\u69d9\u7006\ubff1\u6c56\uff55\ua6bd, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), ldc:int(16711680))
                invokestatic:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\ua61f\uc31c\ud158\u8389\u120d\u8c8a, getfield:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\ubcb0\u4bc8\u72f1\u47c2\ubb2b\u9255, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f[expected:\u8389\ub18d\u494c\u1833\ub8be\u6cfe])
            }
            else {
                invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u7049\uae87\u3e2a\u839e\u3bc9\u3504, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\u69d9\u7006\ubff1\u6c56\uff55\ua6bd, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), ldc:int(14737632))
                invokestatic:void(\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d::\u9033\u88c5\u67d0\u7006\u51fa\u51fa, getfield:\ub83f\u156b\ud7e8\u0c95\u47c2\ub32d(\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\ubcb0\u4bc8\u72f1\u47c2\ubb2b\u9255, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f), this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f[expected:\u8389\ub18d\u494c\u1833\ub8be\u6cfe])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E4 : int
        expr_6B : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_DF_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_111_0 : byte[] [generated]
        stack_113_0 : byte[] [generated]
        stack_14B_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_230_0 : byte[] [generated]
        stack_2A3_0 : byte[] [generated]
        stack_2F6_0 : byte[] [generated]
        stack_36E_0 : byte[] [generated]
        var_4_1CA : int
        var_3_1CF : byte[]
        var_5_1D0 : int
        var_0_2EC : int
        expr_2F6 : byte [generated]
        stack_33A_2 : byte [generated]
        stack_319_0 : byte [generated]
        var_2_A3 : byte[]
        expr_A7 : int [generated]
        var_3_21F : byte[]
        var_5_220 : int
        expr_E1 : int [generated]
        expr_113 : int [generated]
        expr_14D : int [generated]
        var_3_35D : byte[]
        var_5_35E : int
        expr_36E : byte [generated]
        var_3_190 : String
        stack_1C3_0 : String[] [generated]
        expr_1A2 : String[] [generated]
        
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
        var_0_1E4 = and:int(ldc:int(1312005514), ldc:int(-1975517893))
        expr_6B = arraylength:int(stack_A3_0 = stack_A5_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_1F6_0 = stack_230_0 = stack_2A3_0 = stack_2F6_0 = stack_36E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("/PE=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1CA = expr_6B:int
        var_3_1CF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1D0 = expr_6B:int
        Label_0466:
        
        while (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1E4 = and:int(var_0_1E4:int, ldc:int(78604357))
                goto(Label_0631)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1580700622))
            var_5_1D0 = add:int(var_5_1D0:int, ldc:int(-1))
            storeelement:byte(var_3_1CF:byte[], var_5_1D0:int, add:byte(loadelement:byte(stack_1F6_0:byte[], var_5_1D0:int), ldc:byte(15)))
            
            if (cmpne:boolean(var_5_1D0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_1F6_0 = stack_230_0 = stack_2A3_0 = stack_2F6_0 = stack_36E_0 = var_3_1CF:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0722)
        Label_0631:
        
        while (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(512)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(524288)), ldc:int(0))) {
                var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-2142316380))
                goto(Label_0466)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-336350929))
            var_5_1D0 = add:int(var_5_1D0:int, ldc:int(-1))
            storeelement:byte(var_3_1CF:byte[], var_5_1D0:int, xor:byte(loadelement:byte(stack_2A3_0:byte[], var_5_1D0:int), ldc:byte(45)))
            
            if (cmpne:boolean(var_5_1D0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_1F6_0 = stack_230_0 = stack_2A3_0 = stack_2F6_0 = stack_36E_0 = var_3_1CF:byte[]
            goto(Label_0230)
        }
        
        var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1521039176))
        Label_0722:
        
        while (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0466)
            }
            
            var_0_2EC = and:int(var_0_1E4:int, ldc:int(-609116353))
            var_5_1D0 = add:int(var_5_1D0:int, ldc:int(-1))
            expr_2F6 = stack_33A_2 = loadelement(stack_2F6_0, var_5_1D0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D0:int, ldc:int(3)), neg:int(var_4_1CA:int)), ldc:int(0))) {
                stack_33A_2 = stack_319_0 = add:byte(expr_2F6:byte, loadelement:byte(var_3_1CF:byte[], add:int(var_5_1D0:int, ldc:int(3))))
                goto(Label_0809)
            }
            
            Label_0771:
            
            if (cmpne:boolean(and:int(var_0_2EC:int, ldc:int(64)), ldc:int(0))) {
                var_0_2EC = and:int(var_0_2EC:int, ldc:int(336215383))
            }
            else {
                var_0_2EC = and:int(var_0_2EC:int, ldc:int(464900991))
                stack_33A_2 = stack_319_0 = add:byte(expr_2F6:byte, ldc:byte(3))
            }
            
            Label_0809:
            
            if (cmpne:boolean(and:int(var_0_2EC:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0771)
            }
            
            var_0_1E4 = and:int(var_0_2EC:int, ldc:int(-1372209297))
            storeelement:byte(var_3_1CF:byte[], var_5_1D0:int, stack_33A_2:byte)
            
            if (cmpne:boolean(var_5_1D0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_1F6_0 = stack_230_0 = stack_2A3_0 = stack_2F6_0 = stack_36E_0 = var_3_1CF:byte[]
            goto(Label_0280)
        }
        
        var_0_1E4 = and:int(var_0_1E4:int, ldc:int(337023150))
        goto(Label_0631)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-678663808))
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(16)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-114255607))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1810087870))
            var_2_A3 = stack_A3_0:byte[]
            expr_A7 = add:int(arraylength:int(stack_A5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_3_21F = newarray:byte[](byte.class, expr_A7:int)
                var_5_220 = expr_A7:int
                
                loop {
                    var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1073898230))
                    var_5_220 = add:int(var_5_220:int, ldc:int(-1))
                    storeelement:byte(var_3_21F:byte[], var_5_220:int, add:int(shl:int(loadelement:byte(stack_230_0:byte[], var_5_220:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A3:byte[], add:int(var_5_220:int, and:int(ldc:int(537), ldc:int(129)))), ldc:int(4)), xor:int(ldc:int(-16366), ldc:int(-16355)))))
                    
                    if (cmpne:boolean(var_5_220:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_1F6_0 = stack_230_0 = stack_2A3_0 = stack_2F6_0 = stack_36E_0 = var_3_21F:byte[]
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1158971006))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(4096)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(159845287))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1865267658))
            expr_E1 = arraylength:int(stack_E1_0:byte[])
            
            if (cmpne:boolean(expr_E1:int, ldc:int(0))) {
                var_4_1CA = expr_E1:int
                var_3_1CF = newarray:byte[](byte.class, expr_E1:int)
                var_5_1D0 = expr_E1:int
                goto(Label_0631)
            }
        }
        
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(8)), ldc:int(0))) {
            goto(Label_0338)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(866516403))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-885942849))
            expr_113 = arraylength:int(stack_113_0:byte[])
            
            if (cmpne:boolean(expr_113:int, ldc:int(0))) {
                var_4_1CA = expr_113:int
                var_3_1CF = newarray:byte[](byte.class, expr_113:int)
                var_5_1D0 = expr_113:int
                goto(Label_0722)
            }
        }
        
        Label_0280:
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-290604583))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0230)
            }
            
            if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1360334241))
                goto(Label_0112)
            }
            
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1068621146))
            expr_14D = arraylength:int(stack_14D_0:byte[])
            
            if (cmpne:boolean(expr_14D:int, ldc:int(0))) {
                var_3_35D = newarray:byte[](byte.class, expr_14D:int)
                var_5_35E = expr_14D:int
                
                loop {
                    var_0_1E4 = and:int(var_0_1E4:int, ldc:int(-1619159190))
                    var_5_35E = add:int(var_5_35E:int, ldc:int(-1))
                    expr_36E = loadelement:byte(stack_36E_0:byte[], var_5_35E:int)
                    storeelement:byte(var_3_35D:byte[], var_5_35E:int, or:int(and:int(shl:int(expr_36E:byte, xor:int(ldc:int(16643), ldc:int(16647))), ldc:int(-16)), and:int(shr:int(expr_36E:byte[expected:int], and:int(ldc:int(3629), ldc:int(406))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_35E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_DF_0 = stack_E1_0 = stack_111_0 = stack_113_0 = stack_14B_0 = stack_14D_0 = stack_184_0 = stack_1F6_0 = stack_230_0 = stack_2A3_0 = stack_2F6_0 = stack_36E_0 = var_3_35D:byte[]
            }
        }
        
        Label_0338:
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1217631683))
            goto(Label_0280)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        if (cmpne:boolean(and:int(var_0_1E4:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E4:int, ldc:int(4096)), ldc:int(0))) {
            var_0_1E4 = and:int(var_0_1E4:int, ldc:int(1369011209))
            goto(Label_0112)
        }
        
        var_3_190 = initobject:String(String::<init>, stack_184_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1C3_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32726), ldc:int(-32725)))
        expr_1A2 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4122), ldc:int(4123)))
        storeelement:String(expr_1A2:String[], and:int(ldc:int(10340), ldc:int(-10469)), invokevirtual:String[expected:String](String::substring, var_3_190:String, and:int(ldc:int(-18404), ldc:int(16771)), and:int(ldc:int(19973), ldc:int(8233))))
        putstatic:String[](\ucef1\u7d52\u1187\u4cd9\u8640\ua61f::\u52d3\u92ee\u3711\uceb8\u8640\u8d90, expr_1A2:String[])
    }
    
    public void \u0a06\u516c\u76bc\u5fe1\u61a4\u946b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_651 : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_65C : int
        
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
        var_3_651 = and:int(ldc:int(1973460171), ldc:int(2131360811))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\u7d52\u1187\u4cd9\u8640\ua61f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(1040318613))
        }
        else {
            var_3_651 = and:int(var_3_651:int, ldc:int(-142616118))
            var_5_88 = and:int(ldc:int(1924), ldc:int(-1959))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1394), ldc:int(-21879)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_651:int, ldc:int(2097978926))
                    var_9_C5 = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_8F:int, and:int(ldc:int(8193), ldc:int(297)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, xor:int(ldc:int(33), ldc:int(32)))), var_7_9E:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_D7:int, ldc:int(2098460346))
                    var_14_112 = var_7_9E:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), and:int(ldc:int(4097), ldc:int(617)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_8F:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1241771265))
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(940544695))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(882979495))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1700394091))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1746799457))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1995617467))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0412:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1771826087))
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1521042265))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1003647185))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-475928759))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1178747932))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-364949721))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-985218))
                        var_11_E8 = and:int(ldc:int(3008), ldc:int(-3009))
                        goto(Label_1488)
                    }
                    
                    Label_0589:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2122783243))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1026552866))
                        goto(Label_1086)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1002699934))
                        goto(Label_0817)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1621929468))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-12060581))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0817)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(551127476))
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-357807041))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-23135217))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0817:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(394474797))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(904569278))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-503261587))
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-908461184))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1577336627))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-2067906900))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-168504902))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_E8 = and:int(ldc:int(16469), ldc:int(257))
                                goto(Label_1086)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1297037322))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1385404621))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0412)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(2142894895))
                        var_11_E8 = and:int(ldc:int(-30510), ldc:int(22020))
                    }
                    
                    Label_1086:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(319324653))
                        goto(Label_1372)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(410737777))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1731635580))
                            goto(Label_0817)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(32)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(2110981750))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(849364016))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-880890566))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-154645739))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(2126428735))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1372)
                            }
                        }
                    }
                    
                    Label_1233:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1864591612))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1086)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-985418665))
                            goto(Label_0817)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(916811066))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(453469672))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1580021573))
                            goto(Label_0412)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1962589774))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_88:int, var_16_116:int)
                            goto(Label_1488)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1372:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1499)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-111526551))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(327321416))
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(2124676186))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1488:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1499:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1138027586))
                        goto(Label_1372)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1086)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1042916045))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1982225266))
                        goto(Label_0817)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2004179))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-789569892))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2128935471))
                        var_17_65C = add:int(var_16_116:int, and:int(ldc:int(24733), ldc:int(2337)))
                        looporswitchbreak()
                    }
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(-158469441))
                
                if (cmple:boolean(var_5_88 = var_17_65C:int, sub:int(var_6_8F:int, and:int(ldc:int(65), ldc:int(2305))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
