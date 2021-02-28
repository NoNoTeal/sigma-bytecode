public final class \u5245\u8aa5\u61a4\u7049\u4cd9.\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711 {
    public void \u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            putfield:\u6c52\u52d3\u516c\uae87\uae5d(\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::\u36d3\uc3e3\u97e6\u927d\u4daf\u836c, this:\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711, p0:\u6c52\u52d3\u516c\uae87\uae5d)
            invokespecial:Object(Object::<init>, this:\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \uceb8\u120d\u6b0d\ud523\u71ae\ub18d(\u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<?>> p0) {
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
    
    public com.mojang.serialization.DataResult<com.mojang.datafixers.util.Pair<E, java.util.OptionalInt>> \uc84e\u6bb9\u64f2\u97e6\ub18d\u69d9(com.mojang.serialization.DynamicOps<com.google.gson.JsonElement> p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ud12e\ub8be\u69d9\uc246\uc84e\u9255<E>> p1, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<E> p2, com.mojang.serialization.Decoder<E> p3) {
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
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::\u8bb0\u9033\u3d4b\u59ec\u8258\u3d64), xor:int(ldc:int(8516), ldc:int(8512)))), getfield:\u6c52\u52d3\u516c\uae87\uae5d[expected:Object](\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::\u36d3\uc3e3\u97e6\u927d\u4daf\u836c, this:\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711)), loadelement:String(getstatic:String[](\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::\u8bb0\u9033\u3d4b\u59ec\u8258\u3d64), xor:int(ldc:int(194), ldc:int(199))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Pair lambda$\ucb79\u4cd9\u8cae\u385b\u0c95\uceb8$1(java.lang.Object p0) {
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
            return:Pair(invokestatic:Pair(Pair::of, p0:Object, invokestatic:OptionalInt[expected:Object](OptionalInt::empty)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4d85\uc29a\uafe7\u6fb0\uc229\uc9f6$0(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(String::endsWith, p0:String, loadelement:String(getstatic:String[](\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::\u8bb0\u9033\u3d4b\u59ec\u8258\u3d64), xor:int(ldc:int(288), ldc:int(289)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_281 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_1FE_0 : byte[] [generated]
        stack_294_0 : byte[] [generated]
        stack_2E5_0 : byte[] [generated]
        stack_33B_0 : byte[] [generated]
        var_4_1DF : int
        var_3_1E4 : byte[]
        var_5_1E5 : int
        var_0_217 : int
        expr_1FE : byte [generated]
        stack_24E_2 : byte [generated]
        stack_223_0 : byte [generated]
        expr_294 : byte [generated]
        expr_8E : int [generated]
        var_2_B7 : byte[]
        expr_BB : int [generated]
        var_3_2D3 : byte[]
        var_5_2D4 : int
        expr_E6 : int [generated]
        var_3_329 : byte[]
        var_5_32A : int
        var_3_11E : String
        stack_1D8_0 : String[] [generated]
        expr_130 : String[] [generated]
        
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
        var_0_281 = and:int(ldc:int(830452238), ldc:int(389961407))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_1FE_0 = stack_294_0 = stack_2E5_0 = stack_33B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("6MEZSoDFqjcQwUV5L8A4UTr+lu8Euy1EzUAIfXNHOcP8egO8AAB8BAIy9/f5SA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1DF = expr_6B:int
        var_3_1E4 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1E5 = expr_6B:int
        Label_0487:
        
        while (cmpeq:boolean(and:int(var_0_281:int, ldc:int(16384)), ldc:int(0))) {
            var_0_217 = and:int(var_0_281:int, ldc:int(368926527))
            var_5_1E5 = add:int(var_5_1E5:int, ldc:int(-1))
            expr_1FE = stack_24E_2 = loadelement(stack_1FE_0, var_5_1E5)
            
            if (cmplt:boolean(add:int(add:int(var_5_1E5:int, ldc:int(4)), neg:int(var_4_1DF:int)), ldc:int(0))) {
                stack_24E_2 = stack_223_0 = add:byte(expr_1FE:byte, loadelement:byte(var_3_1E4:byte[], add:int(var_5_1E5:int, ldc:int(4))))
                goto(Label_0563)
            }
            
            Label_0523:
            
            if (cmpne:boolean(and:int(var_0_217:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_217 = and:int(var_0_217:int, ldc:int(-628364928))
            }
            else {
                var_0_217 = and:int(var_0_217:int, ldc:int(834664046))
                stack_24E_2 = stack_223_0 = add:byte(expr_1FE:byte, ldc:byte(4))
            }
            
            Label_0563:
            
            if (cmpne:boolean(and:int(var_0_217:int, ldc:int(128)), ldc:int(0))) {
                var_0_217 = and:int(var_0_217:int, ldc:int(1901664493))
                goto(Label_0523)
            }
            
            var_0_281 = and:int(var_0_217:int, ldc:int(-583393330))
            storeelement:byte(var_3_1E4:byte[], var_5_1E5:int, stack_24E_2:byte)
            
            if (cmpne:boolean(var_5_1E5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_1FE_0 = stack_294_0 = stack_2E5_0 = stack_33B_0 = var_3_1E4:byte[]
            goto(Label_0112)
        }
        
        Label_0628:
        
        while (cmpeq:boolean(and:int(var_0_281:int, ldc:int(16384)), ldc:int(0))) {
            var_0_281 = and:int(var_0_281:int, ldc:int(1442373182))
            var_5_1E5 = add:int(var_5_1E5:int, ldc:int(-1))
            expr_294 = loadelement:byte(stack_294_0:byte[], var_5_1E5:int)
            storeelement:byte(var_3_1E4:byte[], var_5_1E5:int, or:int(and:int(shl:int(expr_294:byte, and:int(ldc:int(2444), ldc:int(12358))), ldc:int(-16)), and:int(shr:int(expr_294:byte[expected:int], xor:int(ldc:int(205), ldc:int(201))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1E5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_1FE_0 = stack_294_0 = stack_2E5_0 = stack_33B_0 = var_3_1E4:byte[]
            goto(Label_0147)
        }
        
        var_0_281 = and:int(var_0_281:int, ldc:int(89290793))
        goto(Label_0487)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_281:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_281 = and:int(var_0_281:int, ldc:int(2134446815))
            expr_8E = arraylength:int(stack_8E_0:byte[])
            
            if (cmpne:boolean(expr_8E:int, ldc:int(0))) {
                var_4_1DF = expr_8E:int
                var_3_1E4 = newarray:byte[](byte.class, expr_8E:int)
                var_5_1E5 = expr_8E:int
                goto(Label_0628)
            }
        }
        
        Label_0147:
        
        if (cmpeq:boolean(and:int(var_0_281:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpeq:boolean(and:int(var_0_281:int, ldc:int(16)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_281:int, ldc:int(16)), ldc:int(0))) {
                var_0_281 = and:int(var_0_281:int, ldc:int(2033357039))
                goto(Label_0112)
            }
            
            var_0_281 = and:int(var_0_281:int, ldc:int(960058991))
            var_2_B7 = stack_B7_0:byte[]
            expr_BB = add:int(arraylength:int(stack_B9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_3_2D3 = newarray:byte[](byte.class, expr_BB:int)
                var_5_2D4 = expr_BB:int
                
                loop {
                    var_0_281 = and:int(var_0_281:int, ldc:int(1006277550))
                    var_5_2D4 = add:int(var_5_2D4:int, ldc:int(-1))
                    storeelement:byte(var_3_2D3:byte[], var_5_2D4:int, add:int(shl:int(loadelement:byte(stack_2E5_0:byte[], var_5_2D4:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_B7:byte[], add:int(var_5_2D4:int, and:int(ldc:int(5153), ldc:int(8341)))), ldc:int(2)), and:int(ldc:int(319), ldc:int(17983)))))
                    
                    if (cmpne:boolean(var_5_2D4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_1FE_0 = stack_294_0 = stack_2E5_0 = stack_33B_0 = var_3_2D3:byte[]
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_281 = and:int(var_0_281:int, ldc:int(96670791))
        }
        else {
            if (cmpne:boolean(and:int(var_0_281:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0147)
            }
            
            if (cmpne:boolean(and:int(var_0_281:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_281 = and:int(var_0_281:int, ldc:int(523769678))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_3_329 = newarray:byte[](byte.class, expr_E6:int)
                var_5_32A = expr_E6:int
                
                loop {
                    var_0_281 = and:int(var_0_281:int, ldc:int(1434124062))
                    var_5_32A = add:int(var_5_32A:int, ldc:int(-1))
                    storeelement:byte(var_3_329:byte[], var_5_32A:int, add:byte(xor:byte(loadelement:byte(stack_33B_0:byte[], var_5_32A:int), ldc:byte(20)), ldc:byte(120)))
                    
                    if (cmpne:boolean(var_5_32A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B7_0 = stack_B9_0 = stack_E4_0 = stack_E6_0 = stack_112_0 = stack_1FE_0 = stack_294_0 = stack_2E5_0 = stack_33B_0 = var_3_329:byte[]
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_281 = and:int(var_0_281:int, ldc:int(757734307))
            goto(Label_0147)
        }
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(4096)), ldc:int(0))) {
            var_3_11E = initobject:String(String::<init>, stack_112_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1D8_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9379), ldc:int(9381)))
            expr_130 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2198), ldc:int(78)))
            storeelement:String(expr_130:String[], and:int(ldc:int(24599), ldc:int(6659)), invokevirtual:String[expected:String](String::substring, var_3_11E:String, and:int(ldc:int(-20564), ldc:int(20563)), and:int(ldc:int(12551), ldc:int(16575))))
            storeelement:String(expr_130:String[], xor:int(ldc:int(4097), ldc:int(4096)), invokevirtual:String[expected:String](String::substring, var_3_11E:String, xor:int(ldc:int(42), ldc:int(45)), and:int(ldc:int(5230), ldc:int(16396))))
            storeelement:String(expr_130:String[], and:int(ldc:int(8601), ldc:int(-24986)), invokevirtual:String[expected:String](String::substring, var_3_11E:String, and:int(ldc:int(13070), ldc:int(1084)), and:int(ldc:int(15), ldc:int(23901))))
            storeelement:String(expr_130:String[], xor:int(ldc:int(22592), ldc:int(22594)), invokevirtual:String[expected:String](String::substring, var_3_11E:String, xor:int(ldc:int(1), ldc:int(12)), and:int(ldc:int(2237), ldc:int(22045))))
            storeelement:String(expr_130:String[], and:int(ldc:int(5798), ldc:int(24596)), invokevirtual:String[expected:String](String::substring, var_3_11E:String, and:int(ldc:int(93), ldc:int(5407)), xor:int(ldc:int(279), ldc:int(315))))
            storeelement:String(expr_130:String[], and:int(ldc:int(4133), ldc:int(16397)), invokevirtual:String[expected:String](String::substring, var_3_11E:String, xor:int(ldc:int(-30663), ldc:int(-30699)), and:int(ldc:int(8493), ldc:int(639))))
            putstatic:String[](\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711::\u8bb0\u9033\u3d4b\u59ec\u8258\u3d64, expr_130:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4c04\u34df\u61a4\u527a\u5f50\ubded(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_663 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_66E : int
        
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
        var_3_663 = and:int(ldc:int(1392485860), ldc:int(-764240701))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\uc2bd\u0a06\uc3e3\ub6ab\u3711[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(-577596308))
        }
        else {
            var_3_663 = and:int(var_3_663:int, ldc:int(-25954853))
            var_5_8A = and:int(ldc:int(-32601), ldc:int(19544))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5518), ldc:int(-13711)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_663:int, ldc:int(1884734666))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(3075), ldc:int(8849)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(16916), ldc:int(16917)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_663 = and:int(var_3_E3:int, ldc:int(-663042620))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1920), ldc:int(1921)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1231113342))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1788143868))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(2061484450))
                        goto(Label_0994)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1055618813))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(381977757))
                    }
                    else {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1839487273))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1570226684))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1751587334))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1695131779))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1964482165))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(433845746))
                        var_11_F4 = and:int(ldc:int(-17892), ldc:int(16866))
                        goto(Label_1542)
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1061711821))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1932933240))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1763741438))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1067499517))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1163783907))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-134745915))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0862)
                        }
                    }
                    
                    Label_0723:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(767795669))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1626360482))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1467388671))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-920637524))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1825553360))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-120411410))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0862:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1715688826))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1350924112))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1770618171))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(564616784))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(255063007))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1218460446))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(1073), ldc:int(4865))
                                goto(Label_1140)
                            }
                        }
                    }
                    
                    Label_0994:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(99711968))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1532688710))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(795094942))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(2029191151))
                        var_11_F4 = and:int(ldc:int(-22824), ldc:int(22787))
                    }
                    
                    Label_1140:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1396872219))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1940059358))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0994)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1013574987))
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1325146030))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1132740392))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1263:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-85720061))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1140)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0994)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-2132035274))
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(108624159))
                            goto(Label_0723)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1355700862))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-460433915))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(516679307))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(2004254929))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1542)
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-885015536))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1528500586))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1289885752))
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(-1795238720))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1542:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66E = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1553:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1943253909))
                        goto(Label_0994)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0723)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1392165078))
                        var_17_66E = add:int(var_16_122:int, and:int(ldc:int(16561), ldc:int(8197)))
                        looporswitchbreak()
                    }
                }
                
                var_3_663 = and:int(var_3_663:int, ldc:int(-51208485))
                
                if (cmple:boolean(var_5_8A = var_17_66E:int, sub:int(var_6_91:int, xor:int(ldc:int(66), ldc:int(67))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(-230200893))
            goto(Label_0108)
        }
    }
}
