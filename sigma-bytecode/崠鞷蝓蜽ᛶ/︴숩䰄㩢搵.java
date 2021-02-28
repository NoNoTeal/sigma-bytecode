public class \u5d20\u97b7\u8753\u873d\u16f6.\ufe34\uc229\u4c04\u3a62\u6435 {
    public void \ufe34\uc229\u4c04\u3a62\u6435() {
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
            invokespecial:Object(Object::<init>, this:\ufe34\uc229\u4c04\u3a62\u6435)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u4179\u647c\ubefe\u7af6\u9937\u446c(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u3504\u3504\u7330\u3dd3\u5f50\uf94d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1) {
        var_5_80 : \u3d4b\uc4d2\u9937\u98a4\u6198
        stack_BA_1 : String [generated]
        expr_AD : Object[] [generated]
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u1833\uff55\u7c6b\u4bc8\u8640::\ub18d\u8413\u6c56\u8258\u51fa\u61a4), p1:String[expected:CharSequence])))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ufe34\uc229\u4c04\u3a62\u6435::\ud51e\u34df\u12b2\ud217\u3504\u5654)))
        }
        
        var_5_80 = invokevirtual:\u3d4b\uc4d2\u9937\u98a4\u6198(\ucb79\u8350\u7bad\u392e\u51fa::\u6c52\u8308\u4c2b\u120d\u0a06\u4179, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
        
        if (invokevirtual:boolean(\u3d4b\uc4d2\u9937\u98a4\u6198::\ub8be\uc246\u47c2\u3776\u6c52\ud51e, var_5_80:\u3d4b\uc4d2\u9937\u98a4\u6198, p1:String)) {
            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<String, V>::\u12b2\u1833\ub83f\u4492\u494c\ua068, var_5_80:\u9937\u7049\ubefe\u3bc9\u446c<String, V>, p1:String)
            stack_BA_1 = loadelement:String(getstatic:String[](\ufe34\uc229\u4c04\u3a62\u6435::\u416d\ucfaf\u6c56\u5d20\u8d98\u600f), and:int(ldc:int(1347), ldc:int(2082)))
            expr_AD = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(18465), ldc:int(18464)))
            storeelement:Object(expr_AD:Object[], and:int(ldc:int(18213), ldc:int(-18214)), p1:String[expected:Object])
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_BA_1:String, expr_AD:Object[]), xor:int[expected:boolean](ldc:int(25089), ldc:int(25088)))
            return:int(xor:int(ldc:int(24642), ldc:int(24643)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ufe34\uc229\u4c04\u3a62\u6435::\u67e9\u92ee\u72f1\u392e\u3c25\ucef1)))
    }
    
    private static int lambda$\u927d\u92ff\uceb8\u8d90\ufcaf\uc7fe$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ufe34\uc229\u4c04\u3a62\u6435::\u3504\u3504\u7330\u3dd3\u5f50\uf94d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\ufe34\uc229\u4c04\u3a62\u6435::\u416d\ucfaf\u6c56\u5d20\u8d98\u600f), and:int(ldc:int(8869), ldc:int(3137))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u983f\uafe7\ufe34\u4975\ua6bd\uc31c$1(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokevirtual:String[](\u9937\u7049\ubefe\u3bc9\u446c<K, V>::\u120d\u6d99\u99f7\u946b\ub113\u2dcc, invokevirtual:\u3d4b\uc4d2\u9937\u98a4\u6198[expected:\u9937\u7049\ubefe\u3bc9\u446c<String, \ud51e\u494c\uc910\u3e75\u34df>](\ucb79\u8350\u7bad\u392e\u51fa::\u6c52\u8308\u4c2b\u120d\u0a06\u4179, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u74b1\u6c56\u3d64\ubf56\u3e75\u3bd6$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(17445), ldc:int(17446))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2BE : int
        expr_6B : int [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_11F_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_157_0 : byte[] [generated]
        stack_269_0 : byte[] [generated]
        stack_2D1_0 : byte[] [generated]
        stack_34C_0 : byte[] [generated]
        stack_3A2_0 : byte[] [generated]
        var_4_241 : int
        var_3_246 : byte[]
        var_5_247 : int
        expr_26C : byte [generated]
        var_0_256 : int
        var_0_2C7 : int
        expr_2D1 : byte [generated]
        stack_31A_2 : byte [generated]
        stack_2F7_0 : byte [generated]
        expr_AD : int [generated]
        var_2_E4 : byte[]
        expr_E8 : int [generated]
        var_3_33A : byte[]
        var_5_33B : int
        expr_121 : int [generated]
        var_3_390 : byte[]
        var_5_391 : int
        var_3_163 : String
        expr_16B : String[] [generated]
        expr_175 : String[] [generated]
        var_3_206 : String[]
        
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
        var_0_2BE = and:int(ldc:int(-834651441), ldc:int(-1973689641))
        expr_6B = arraylength:int(stack_AB_0 = stack_AD_0 = stack_E4_0 = stack_E6_0 = stack_11F_0 = stack_121_0 = stack_157_0 = stack_269_0 = stack_2D1_0 = stack_34C_0 = stack_3A2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("m5mXlaGWr0fokqaRo5ykrEvXnZydoJ6kmJmXlaGWr0fokqaRo5ykrEvXnK6MnJiamJiZl5Whlq9H6JKmkaOcpKxL56KSl5Wzl5WFppGjnGPYqZyQqpGip6SR")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_241 = expr_6B:int
        var_3_246 = newarray:byte[](byte.class, expr_6B:int)
        var_5_247 = expr_6B:int
        Label_0585:
        
        while (cmpne:boolean(and:int(var_0_2BE:int, ldc:int(2)), ldc:int(0))) {
            var_0_2BE = and:int(var_0_2BE:int, ldc:int(-1083788034))
            var_5_247 = add:int(var_5_247:int, ldc:int(-1))
            expr_26C = add:byte(loadelement:byte(stack_269_0:byte[], var_5_247:int), ldc:byte(107))
            storeelement:byte(var_3_246:byte[], var_5_247:int, or:int(and:int(shl:int(expr_26C:byte, xor:int(ldc:int(1572), ldc:int(1568))), ldc:int(-16)), and:int(shr:int(expr_26C:byte[expected:int], and:int(ldc:int(198), ldc:int(12820))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_247:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_11F_0 = stack_121_0 = stack_157_0 = stack_269_0 = stack_2D1_0 = stack_34C_0 = stack_3A2_0 = var_3_246:byte[]
            goto(Label_0112)
        }
        
        var_0_256 = and:int(var_0_2BE:int, ldc:int(-1379447534))
        Label_0689:
        
        while (cmpne:boolean(and:int(var_0_256:int, ldc:int(2)), ldc:int(0))) {
            var_0_2C7 = and:int(var_0_256:int, ldc:int(1854373059))
            var_5_247 = add:int(var_5_247:int, ldc:int(-1))
            expr_2D1 = stack_31A_2 = loadelement(stack_2D1_0, var_5_247)
            
            if (cmplt:boolean(add:int(add:int(var_5_247:int, ldc:int(1)), neg:int(var_4_241:int)), ldc:int(0))) {
                stack_31A_2 = stack_2F7_0 = add:byte(expr_2D1:byte, loadelement:byte(var_3_246:byte[], add:int(var_5_247:int, ldc:int(1))))
                goto(Label_0775)
            }
            
            Label_0734:
            
            if (cmpne:boolean(and:int(var_0_2C7:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_2C7 = and:int(var_0_2C7:int, ldc:int(-330599151))
            }
            else {
                var_0_2C7 = and:int(var_0_2C7:int, ldc:int(1322335199))
                stack_31A_2 = stack_2F7_0 = add:byte(expr_2D1:byte, ldc:byte(1))
            }
            
            Label_0775:
            
            if (cmpeq:boolean(and:int(var_0_2C7:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0734)
            }
            
            var_0_256 = and:int(var_0_2C7:int, ldc:int(-805931278))
            storeelement:byte(var_3_246:byte[], var_5_247:int, stack_31A_2:byte)
            
            if (cmpne:boolean(var_5_247:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_11F_0 = stack_121_0 = stack_157_0 = stack_269_0 = stack_2D1_0 = stack_34C_0 = stack_3A2_0 = var_3_246:byte[]
            goto(Label_0178)
        }
        
        var_0_2BE = and:int(var_0_256:int, ldc:int(1557912040))
        goto(Label_0585)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_2BE:int, ldc:int(64)), ldc:int(0))) {
            var_0_2BE = and:int(var_0_2BE:int, ldc:int(-2000753094))
            goto(Label_0294)
        }
        
        if (cmpne:boolean(and:int(var_0_2BE:int, ldc:int(16384)), ldc:int(0))) {
            var_0_256 = and:int(var_0_2BE:int, ldc:int(1936581049))
            goto(Label_0237)
        }
        
        if (cmpeq:boolean(and:int(var_0_2BE:int, ldc:int(128)), ldc:int(0))) {
            var_0_256 = and:int(var_0_2BE:int, ldc:int(-692789528))
        }
        else {
            var_0_256 = and:int(var_0_2BE:int, ldc:int(-1074601518))
            expr_AD = arraylength:int(stack_AD_0:byte[])
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_4_241 = expr_AD:int
                var_3_246 = newarray:byte[](byte.class, expr_AD:int)
                var_5_247 = expr_AD:int
                goto(Label_0689)
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_0_256:int, ldc:int(64)), ldc:int(0))) {
            var_0_2BE = and:int(var_0_256:int, ldc:int(-2087687361))
            goto(Label_0294)
        }
        
        if (cmpeq:boolean(and:int(var_0_256:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_256:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2BE = and:int(var_0_256:int, ldc:int(449045822))
                goto(Label_0112)
            }
            
            var_0_256 = and:int(var_0_256:int, ldc:int(-614062854))
            var_2_E4 = stack_E4_0:byte[]
            expr_E8 = add:int(arraylength:int(stack_E6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_E8:int, ldc:int(0))) {
                var_3_33A = newarray:byte[](byte.class, expr_E8:int)
                var_5_33B = expr_E8:int
                
                loop {
                    var_0_256 = and:int(var_0_256:int, ldc:int(1865262283))
                    var_5_33B = add:int(var_5_33B:int, ldc:int(-1))
                    storeelement:byte(var_3_33A:byte[], var_5_33B:int, add:int(shl:int(loadelement:byte(stack_34C_0:byte[], var_5_33B:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_E4:byte[], add:int(var_5_33B:int, xor:int(ldc:int(5126), ldc:int(5127)))), ldc:int(4)), and:int(ldc:int(47), ldc:int(18063)))))
                    
                    if (cmpne:boolean(var_5_33B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_11F_0 = stack_121_0 = stack_157_0 = stack_269_0 = stack_2D1_0 = stack_34C_0 = stack_3A2_0 = var_3_33A:byte[]
            }
        }
        
        Label_0237:
        
        if (cmpne:boolean(and:int(var_0_256:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_2BE = and:int(var_0_256:int, ldc:int(-608338864))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_256:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0178)
            }
            
            if (cmpeq:boolean(and:int(var_0_256:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_2BE = and:int(var_0_256:int, ldc:int(1377824561))
                goto(Label_0112)
            }
            
            var_0_2BE = and:int(var_0_256:int, ldc:int(1250500802))
            expr_121 = arraylength:int(stack_121_0:byte[])
            
            if (cmpne:boolean(expr_121:int, ldc:int(0))) {
                var_3_390 = newarray:byte[](byte.class, expr_121:int)
                var_5_391 = expr_121:int
                
                loop {
                    var_0_2BE = and:int(var_0_2BE:int, ldc:int(-1361548810))
                    var_5_391 = add:int(var_5_391:int, ldc:int(-1))
                    storeelement:byte(var_3_390:byte[], var_5_391:int, xor:byte(loadelement:byte(stack_3A2_0:byte[], var_5_391:int), ldc:byte(121)))
                    
                    if (cmpne:boolean(var_5_391:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_E4_0 = stack_E6_0 = stack_11F_0 = stack_121_0 = stack_157_0 = stack_269_0 = stack_2D1_0 = stack_34C_0 = stack_3A2_0 = var_3_390:byte[]
            }
        }
        
        Label_0294:
        
        if (cmpeq:boolean(and:int(var_0_2BE:int, ldc:int(8192)), ldc:int(0))) {
            var_0_256 = and:int(var_0_2BE:int, ldc:int(-727461442))
            goto(Label_0237)
        }
        
        if (cmpeq:boolean(and:int(var_0_2BE:int, ldc:int(64)), ldc:int(0))) {
            var_0_256 = and:int(var_0_2BE:int, ldc:int(-2093542316))
            goto(Label_0178)
        }
        
        if (cmpeq:boolean(and:int(var_0_2BE:int, ldc:int(16384)), ldc:int(0))) {
            var_3_163 = initobject:String(String::<init>, stack_157_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_16B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2053), ldc:int(533)))
            expr_175 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(20591), ldc:int(5)))
            storeelement:String(expr_16B:String[], and:int(ldc:int(8532), ldc:int(6)), invokevirtual:String[expected:String](String::substring, var_3_163:String, and:int(ldc:int(-30873), ldc:int(26648)), and:int(ldc:int(3100), ldc:int(16923))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(2704), ldc:int(2707)), invokevirtual:String[expected:String](String::substring, var_3_163:String, and:int(ldc:int(30), ldc:int(1112)), xor:int(ldc:int(7206), ldc:int(7191))))
            storeelement:String(expr_175:String[], and:int(ldc:int(3111), ldc:int(4554)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(-28361), ldc:int(-28410)), xor:int(ldc:int(6169), ldc:int(6227))))
            storeelement:String(expr_175:String[], and:int(ldc:int(-27579), ldc:int(27546)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(-16197), ldc:int(-16143)), and:int(ldc:int(25171), ldc:int(4219))))
            storeelement:String(expr_175:String[], xor:int(ldc:int(7176), ldc:int(7177)), invokevirtual:String[expected:String](String::substring, var_3_163:String, xor:int(ldc:int(24882), ldc:int(24929)), xor:int(ldc:int(518), ldc:int(607))))
            putstatic:String[](\ufe34\uc229\u4c04\u3a62\u6435::\u416d\ucfaf\u6c56\u5d20\u8d98\u600f, expr_175:String[])
            var_3_206 = expr_16B:String[]
            putstatic:SimpleCommandExceptionType(\ufe34\uc229\u4c04\u3a62\u6435::\ud51e\u34df\u12b2\ud217\u3504\u5654, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_206:String[], xor:int(ldc:int(18434), ldc:int(18433))))))
            putstatic:SimpleCommandExceptionType(\ufe34\uc229\u4c04\u3a62\u6435::\u67e9\u92ee\u72f1\u392e\u3c25\ucef1, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_206:String[], xor:int(ldc:int(35), ldc:int(39))))))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u67e9\u0b8e\u52d3\ub8be\u836c\ud171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(1208868976), ldc:int(1538127955))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufe34\uc229\u4c04\u3a62\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1472664853))
            var_5_81 = and:int(ldc:int(3196), ldc:int(-11518))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28968), ldc:int(-28970)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6C3:int, ldc:int(-1391599414))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(-14272), ldc:int(-14271)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(34), ldc:int(35)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_D1:int, ldc:int(1819933760))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4128), ldc:int(4129)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(408666893))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1494008285))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1377339989))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1511357643))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1292197325))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(982427858))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-140469897))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(72941581))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-517794715))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1003462392))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-915872953))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1293170604))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1729322812))
                            var_11_E2 = and:int(ldc:int(24599), ldc:int(-25944))
                            goto(Label_1580)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-11682193))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1441903079))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(151670995))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1686439692))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1201068440))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1338718312))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1688653732))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-459617571))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1226456410))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-819337664))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-881828253))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-72878360))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1507215989))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2084123764))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1665223834))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(897), ldc:int(896))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(221319542))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1030423512))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-761201014))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(295171086))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1745725170))
                        var_11_E2 = and:int(ldc:int(-16682), ldc:int(16681))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(666363))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-871094320))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2134095500))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1869228494))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1014353200))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1197737556))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-871713674))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-23406669))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(542410130))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(208756753))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1559940214))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-606276488))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1956715052))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1580)
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1769813591))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1718251804))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1704195850))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1240732799))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-355153669))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1484074897))
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2013968253))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1091628825))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1437014334))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1427511169))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1456684351))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1875705123))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2446145))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(286004707))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1052748117))
                        var_17_6CE = add:int(var_16_110:int, xor:int(ldc:int(20560), ldc:int(20561)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1558111078))
                
                if (cmple:boolean(var_5_81 = var_17_6CE:int, sub:int(var_6_88:int, xor:int(ldc:int(-32191), ldc:int(-32192))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
