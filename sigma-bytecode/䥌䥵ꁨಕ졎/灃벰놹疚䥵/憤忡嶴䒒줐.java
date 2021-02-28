public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u61a4\u5fe1\u5db4\u4492\uc910 {
    public void \u61a4\u5fe1\u5db4\u4492\uc910() {
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
            invokespecial:Object(Object::<init>, this:\u61a4\u5fe1\u5db4\u4492\uc910)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u624e\uceb8\u760c\u5654\u4f4a\u3e75(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int lambda$\u965f\uc87f\u97b7\u071d\u64f2\ub113$1(com.mojang.brigadier.context.CommandContext p0) {
        var_1_5F : int
        var_3_67 : int
        var_4_7C : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_5_A2 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_1_5F = and:int(ldc:int(721454248), ldc:int(767682383))
            var_3_67 = and:int(ldc:int(4400), ldc:int(-4401))
            var_4_7C = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Collection<\u51fa\u6c52\u7330\u7330\u960f>::iterator, invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u61a4\u5fe1\u5db4\u4492\uc910::\u516c\ubefe\u7ce1\u99f7\u5245\uae5d), and:int(ldc:int(1041), ldc:int(4169)))))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(261758487))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7C:Iterator))) {
                    looporswitchbreak()
                }
                
                var_5_A2 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_4_7C:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\u5db4\u0c95\u960f\u3776\ud217\u647c, var_5_A2:\u51fa\u6c52\u7330\u7330\u960f, invokestatic:IFormattableTextComponent(TextComponentUtils::func_240645_a_, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:ITextComponent(\u6d69\ub83f\u7e3f\ud51e\uafe7::\u5fe1\u3e2a\ub83f\u759a\u647c\u0b8e, p0:CommandContext, loadelement:String(getstatic:String[](\u61a4\u5fe1\u5db4\u4492\uc910::\u516c\ubefe\u7ce1\u99f7\u5245\uae5d), and:int(ldc:int(12427), ldc:int(19510)))), var_5_A2:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], and:int(ldc:int(-19898), ldc:int(19889))), getstatic:UUID(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u3d4b\uc910\ua61f\u5fe1\ub7dc\u62da))
                inc:int(var_3_67, ldc:int(1))
            }
            
            return:int(var_3_67:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4daf\uc7fe\u3dd3\u6bb9\uf9c5\uc4d2$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(12802), ldc:int(19746))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1D4 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_13E_0 : byte[] [generated]
        stack_1E6_0 : byte[] [generated]
        stack_223_0 : byte[] [generated]
        stack_28E_0 : byte[] [generated]
        stack_2F7_0 : byte[] [generated]
        var_4_1BA : int
        var_3_1BF : byte[]
        var_5_1C0 : int
        expr_28E : byte [generated]
        var_0_2ED : int
        expr_2F7 : byte [generated]
        stack_325_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_212 : byte[]
        var_5_213 : int
        expr_DB : int [generated]
        expr_116 : int [generated]
        var_3_14A : String
        stack_1B3_0 : String[] [generated]
        expr_15C : String[] [generated]
        
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
        var_0_1D4 = and:int(ldc:int(-240036531), ldc:int(-1871357953))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1E6_0 = stack_223_0 = stack_28E_0 = stack_2F7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("9vYydvH0cjI2fvHx9/Q1dPRznh5Z0Q==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BA = expr_6B:int
        var_3_1BF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C0 = expr_6B:int
        Label_0450:
        
        while (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(1)), ldc:int(0))) {
                var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1057812972))
                goto(Label_0618)
            }
            
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1568935969))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, add:byte(xor:byte(loadelement:byte(stack_1E6_0:byte[], var_5_1C0:int), ldc:byte(73)), ldc:byte(68)))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1E6_0 = stack_223_0 = stack_28E_0 = stack_2F7_0 = var_3_1BF:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0723)
        Label_0618:
        
        while (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0450)
            }
            
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-25860643))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_28E = loadelement:byte(stack_28E_0:byte[], var_5_1C0:int)
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, or:int(and:int(shl:int(expr_28E:byte, xor:int(ldc:int(-30461), ldc:int(-30457))), ldc:int(-16)), and:int(shr:int(expr_28E:byte[expected:int], xor:int(ldc:int(2659), ldc:int(2663))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1E6_0 = stack_223_0 = stack_28E_0 = stack_2F7_0 = var_3_1BF:byte[]
            goto(Label_0224)
        }
        
        var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1325159856))
        Label_0723:
        
        while (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(64)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(4)), ldc:int(0))) {
                var_0_1D4 = and:int(var_0_1D4:int, ldc:int(805404469))
                goto(Label_0450)
            }
            
            var_0_2ED = and:int(var_0_1D4:int, ldc:int(-29753507))
            var_5_1C0 = add:int(var_5_1C0:int, ldc:int(-1))
            expr_2F7 = loadelement:byte(stack_2F7_0:byte[], var_5_1C0:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1C0:int, ldc:int(4)), neg:int(var_4_1BA:int)), ldc:int(0))) {
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(-2131272203))
                stack_325_2 = add:byte(expr_2F7:byte, ldc:byte(4))
            }
            else {
                stack_325_2 = add:byte(expr_2F7:byte, loadelement:byte(var_3_1BF:byte[], add:int(var_5_1C0:int, ldc:int(4))))
            }
            
            var_0_1D4 = and:int(var_0_2ED:int, ldc:int(-1200534145))
            storeelement:byte(var_3_1BF:byte[], var_5_1C0:int, stack_325_2:byte)
            
            if (cmpne:boolean(var_5_1C0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1E6_0 = stack_223_0 = stack_28E_0 = stack_2F7_0 = var_3_1BF:byte[]
            goto(Label_0283)
        }
        
        goto(Label_0618)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0283)
        }
        
        if (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-341557380))
            goto(Label_0224)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-395543897))
        }
        else {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1011517625))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_212 = newarray:byte[](byte.class, expr_A0:int)
                var_5_213 = expr_A0:int
                
                loop {
                    var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-701278257))
                    var_5_213 = add:int(var_5_213:int, ldc:int(-1))
                    storeelement:byte(var_3_212:byte[], var_5_213:int, add:int(shl:int(loadelement:byte(stack_223_0:byte[], var_5_213:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_213:int, xor:int(ldc:int(13320), ldc:int(13321)))), ldc:int(2)), and:int(ldc:int(14015), ldc:int(63)))))
                    
                    if (cmpne:boolean(var_5_213:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_13E_0 = stack_1E6_0 = stack_223_0 = stack_28E_0 = stack_2F7_0 = var_3_212:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(64)), ldc:int(0))) {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1084305084))
            goto(Label_0283)
        }
        
        if (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(32)), ldc:int(0))) {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-289361069))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1D4 = and:int(var_0_1D4:int, ldc:int(1633680657))
                goto(Label_0112)
            }
            
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-688818737))
            expr_DB = arraylength:int(stack_DB_0:byte[])
            
            if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                var_4_1BA = expr_DB:int
                var_3_1BF = newarray:byte[](byte.class, expr_DB:int)
                var_5_1C0 = expr_DB:int
                goto(Label_0618)
            }
        }
        
        Label_0224:
        
        if (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(32)), ldc:int(0))) {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1743882134))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_1D4 = and:int(var_0_1D4:int, ldc:int(891210678))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_0_1D4:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1181927519))
                goto(Label_0112)
            }
            
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(-1208130059))
            expr_116 = arraylength:int(stack_116_0:byte[])
            
            if (cmpne:boolean(expr_116:int, ldc:int(0))) {
                var_4_1BA = expr_116:int
                var_3_1BF = newarray:byte[](byte.class, expr_116:int)
                var_5_1C0 = expr_116:int
                goto(Label_0723)
            }
        }
        
        Label_0283:
        
        if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0224)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_1D4:int, ldc:int(256)), ldc:int(0))) {
            var_0_1D4 = and:int(var_0_1D4:int, ldc:int(1420720331))
            goto(Label_0112)
        }
        
        var_3_14A = initobject:String(String::<init>, stack_13E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1B3_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(23), ldc:int(3)))
        expr_15C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17667), ldc:int(8751)))
        storeelement:String(expr_15C:String[], xor:int(ldc:int(-23488), ldc:int(-23486)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(-17401), ldc:int(1016)), xor:int(ldc:int(2108), ldc:int(2107))))
        storeelement:String(expr_15C:String[], and:int(ldc:int(453), ldc:int(1537)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(6407), ldc:int(7)), xor:int(ldc:int(21003), ldc:int(20997))))
        storeelement:String(expr_15C:String[], and:int(ldc:int(-26287), ldc:int(26150)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, xor:int(ldc:int(-30578), ldc:int(-30592)), xor:int(ldc:int(280), ldc:int(269))))
        putstatic:String[](\u61a4\u5fe1\u5db4\u4492\uc910::\u516c\ubefe\u7ce1\u99f7\u5245\uae5d, expr_15C:String[])
    }
    
    public void \u647c\u8308\ubb2b\u8640\ud158\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A1 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_6AC : int
        
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
        var_3_6A1 = and:int(ldc:int(1801390303), ldc:int(1645871307))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u61a4\u5fe1\u5db4\u4492\uc910[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(933192300))
            var_5_81 = and:int(ldc:int(-646), ldc:int(645))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16842), ldc:int(-17391)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_6A1:int, ldc:int(2142804424))
                    var_9_BE = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_88:int, xor:int(ldc:int(-22512), ldc:int(-22511)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(16517), ldc:int(11073)))), var_7_97:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_6A1 = and:int(var_3_D0:int, ldc:int(-157603528))
                    var_14_10B = var_7_97:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(18498), ldc:int(18499)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_88:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1303738708))
                        goto(Label_1585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1356615625))
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1760926639))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1116)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1830067311))
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1857702186))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-2007062042))
                        goto(Label_1585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1696995405))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1886481936))
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1116)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-252652858))
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1807496508))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1798838072))
                        var_11_E1 = and:int(ldc:int(5638), ldc:int(-5639))
                        goto(Label_1574)
                    }
                    
                    Label_0572:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-66444622))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1589514956))
                        goto(Label_1116)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1089465684))
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-602436604))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1449780957))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(985351130))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0703:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1154665957))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-15589526))
                        goto(Label_1116)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0965)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(915314598))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-128681820))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1424178197))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(666551458))
                        goto(Label_1585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1404931927))
                        goto(Label_1411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(166486983))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-115997219))
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1418207110))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-415712600))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E1 = and:int(ldc:int(25601), ldc:int(2101))
                                goto(Label_1116)
                            }
                        }
                    }
                    
                    Label_0965:
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1590209322))
                        goto(Label_1585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1958550722))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-180209536))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(2079992697))
                        var_11_E1 = and:int(ldc:int(-21504), ldc:int(20893))
                    }
                    
                    Label_1116:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1021350070))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1644946035))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0965)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-588285850))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(2100872236))
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-431179293))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-399648340))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1491314119))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1411)
                            }
                        }
                    }
                    
                    Label_1258:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(378977331))
                        goto(Label_1585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1929425761))
                            goto(Label_1116)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1416055598))
                            goto(Label_0965)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-2017354862))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0703)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(32445169))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-694577472))
                            loopcontinue()
                        }
                        
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1556234999))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_81:int, var_16_10F:int)
                        goto(Label_1574)
                    }
                    
                    Label_1411:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(602802399))
                        goto(Label_1585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(672564857))
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-741903638))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1057557003))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(782410700))
                        goto(Label_0703)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1486293689))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-146007742))
                        loopcontinue()
                    }
                    
                    var_3_6A1 = and:int(var_3_6A1:int, ldc:int(1048214795))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1574:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AC = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1585:
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1915305749))
                        goto(Label_1411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1258)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(2108265218))
                        goto(Label_1116)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1504426900))
                        goto(Label_0965)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(425030324))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0703)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A1:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-1413723606))
                        var_17_6AC = add:int(var_16_10F:int, and:int(ldc:int(13473), ldc:int(93)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A1 = and:int(var_3_6A1:int, ldc:int(-149360292))
                
                if (cmple:boolean(var_5_81 = var_17_6AC:int, sub:int(var_6_88:int, xor:int(ldc:int(17928), ldc:int(17929))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6A1:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
