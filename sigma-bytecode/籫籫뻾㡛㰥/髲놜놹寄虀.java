public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u9af2\ub19c\ub1b9\u5bc4\u8640 {
    public void \u9af2\ub19c\ub1b9\u5bc4\u8640() {
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
            invokespecial:Object(Object::<init>, this:\u9af2\ub19c\ub1b9\u5bc4\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7043\u98a4\u600f\u7049\ubb2b\u8df4(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int lambda$\u7049\ucb79\u4bc8\u600f\u4c04\u9255$1(com.mojang.brigadier.context.CommandContext p0) {
        var_1_5F : int
        var_3_67 : \u8413\u5140\u64f2\uc9f6\u9937
        var_4_6F : int
        var_5_7D : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_1_8A : int
        var_6_11A : \ube23\uc238\u5140\u4cd9\u8aa5
        
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
        var_1_5F = and:int(ldc:int(-858234709), ldc:int(-305646321))
        var_3_67 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))
        var_4_6F = and:int(ldc:int(-9400), ldc:int(183))
        var_5_7D = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937)))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_1_8A = and:int(var_1_5F:int, ldc:int(65155801))
                goto(Label_0196)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-553964453))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_5_7D:Iterator)) {
                    var_6_11A = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_5_7D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                    
                    if (cmpne:boolean(var_6_11A:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                        if (getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, var_6_11A:\ube23\uc238\u5140\u4cd9\u8aa5)) {
                            putfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, var_6_11A:\ube23\uc238\u5140\u4cd9\u8aa5, and:int[expected:boolean](ldc:int(13346), ldc:int(-13351)))
                            var_4_6F = and:int(ldc:int(409), ldc:int(10243))
                        }
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-491854497))
                    loopcontinue()
                }
            }
            
            Label_0164:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8)), ldc:int(0))) {
                var_1_8A = and:int(var_1_5F:int, ldc:int(-410344364))
            }
            else {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(131072)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_8A = and:int(var_1_5F:int, ldc:int(-1030867269))
                
                if (cmpeq:boolean(var_4_6F:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u9af2\ub19c\ub1b9\u5bc4\u8640::\u1833\u8aa5\ub102\ube23\ud158\u8308)))
                }
            }
            
            Label_0196:
            
            if (cmpeq:boolean(and:int(var_1_8A:int, ldc:int(524288)), ldc:int(0))) {
                var_1_5F = and:int(var_1_8A:int, ldc:int(1775259342))
                goto(Label_0164)
            }
            
            if (cmpeq:boolean(and:int(var_1_8A:int, ldc:int(32768)), ldc:int(0))) {
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u9af2\ub19c\ub1b9\u5bc4\u8640::\ub19c\u4bc8\uff55\u7bad\ubefe\u6d99), xor:int(ldc:int(4169), ldc:int(4168)))), xor:int[expected:boolean](ldc:int(2310), ldc:int(2311)))
                return:int(xor:int(ldc:int(9282), ldc:int(9283)))
            }
            
            var_1_5F = and:int(var_1_8A:int, ldc:int(488309591))
        }
    }
    
    private static boolean lambda$\ud12e\uc31c\u72f1\u494c\ud12e\ub83f$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(4524), ldc:int(70))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1C9 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1E2_0 : byte[] [generated]
        stack_235_0 : byte[] [generated]
        stack_2A0_0 : byte[] [generated]
        stack_2FB_0 : byte[] [generated]
        var_4_1B6 : int
        var_3_1BB : byte[]
        var_5_1BC : int
        expr_1E2 : byte [generated]
        var_0_2F1 : int
        expr_2FB : byte [generated]
        stack_329_2 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_224 : byte[]
        var_5_225 : int
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_12A : String
        expr_132 : String[] [generated]
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
        var_0_1C9 = and:int(ldc:int(1541208620), ldc:int(-1694513552))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1E2_0 = stack_235_0 = stack_2A0_0 = stack_2FB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FF7TRluABPbBXv0ny+njPlZj/hQfg44cXtNGW4AE9sFe/QccbHZ249PDplNeLp4cNW8/NQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1B6 = expr_6B:int
        var_3_1BB = newarray:byte[](byte.class, expr_6B:int)
        var_5_1BC = expr_6B:int
        Label_0446:
        
        while (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0636)
            }
            
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(436076504))
            var_5_1BC = add:int(var_5_1BC:int, ldc:int(-1))
            expr_1E2 = loadelement:byte(stack_1E2_0:byte[], var_5_1BC:int)
            storeelement:byte(var_3_1BB:byte[], var_5_1BC:int, add:int(or:int(and:int(shl:int(expr_1E2:byte, xor:int(ldc:int(720), ldc:int(724))), ldc:int(-16)), and:int(shr:int(expr_1E2:byte[expected:int], xor:int(ldc:int(2944), ldc:int(2948))), ldc:int(15))), ldc:int(45)))
            
            if (cmpne:boolean(var_5_1BC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1E2_0 = stack_235_0 = stack_2A0_0 = stack_2FB_0 = var_3_1BB:byte[]
            goto(Label_0112)
        }
        
        var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-2045354578))
        goto(Label_0719)
        Label_0636:
        
        while (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1379203584))
                goto(Label_0446)
            }
            
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1574819508))
            var_5_1BC = add:int(var_5_1BC:int, ldc:int(-1))
            storeelement:byte(var_3_1BB:byte[], var_5_1BC:int, xor:byte(loadelement:byte(stack_2A0_0:byte[], var_5_1BC:int), ldc:byte(42)))
            
            if (cmpne:boolean(var_5_1BC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1E2_0 = stack_235_0 = stack_2A0_0 = stack_2FB_0 = var_3_1BB:byte[]
            goto(Label_0200)
        }
        
        Label_0719:
        
        while (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(16)), ldc:int(0))) {
                var_0_1C9 = and:int(var_0_1C9:int, ldc:int(601320950))
                goto(Label_0446)
            }
            
            var_0_2F1 = and:int(var_0_1C9:int, ldc:int(1071482434))
            var_5_1BC = add:int(var_5_1BC:int, ldc:int(-1))
            expr_2FB = loadelement:byte(stack_2FB_0:byte[], var_5_1BC:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1BC:int, ldc:int(3)), neg:int(var_4_1B6:int)), ldc:int(0))) {
                var_0_2F1 = and:int(var_0_2F1:int, ldc:int(-1629585690))
                stack_329_2 = add:byte(expr_2FB:byte, ldc:byte(3))
            }
            else {
                stack_329_2 = add:byte(expr_2FB:byte, loadelement:byte(var_3_1BB:byte[], add:int(var_5_1BC:int, ldc:int(3))))
            }
            
            var_0_1C9 = and:int(var_0_2F1:int, ldc:int(-84070477))
            storeelement:byte(var_3_1BB:byte[], var_5_1BC:int, stack_329_2:byte)
            
            if (cmpne:boolean(var_5_1BC:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1E2_0 = stack_235_0 = stack_2A0_0 = stack_2FB_0 = var_3_1BB:byte[]
            goto(Label_0243)
        }
        
        var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-585118531))
        goto(Label_0636)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(469604333))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_224 = newarray:byte[](byte.class, expr_90:int)
                var_5_225 = expr_90:int
                
                loop {
                    var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-620809261))
                    var_5_225 = add:int(var_5_225:int, ldc:int(-1))
                    storeelement:byte(var_3_224:byte[], var_5_225:int, add:int(shl:int(loadelement:byte(stack_235_0:byte[], var_5_225:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_225:int, and:int(ldc:int(257), ldc:int(673)))), ldc:int(7)), and:int(ldc:int(673), ldc:int(1283)))))
                    
                    if (cmpne:boolean(var_5_225:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1E2_0 = stack_235_0 = stack_2A0_0 = stack_2FB_0 = var_3_224:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(1015176164))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(97103522))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-100769150))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_1B6 = expr_C3:int
                var_3_1BB = newarray:byte[](byte.class, expr_C3:int)
                var_5_1BC = expr_C3:int
                goto(Label_0636)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(65536)), ldc:int(0))) {
                var_0_1C9 = and:int(var_0_1C9:int, ldc:int(2134087883))
                goto(Label_0112)
            }
            
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(2111587310))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_4_1B6 = expr_EE:int
                var_3_1BB = newarray:byte[](byte.class, expr_EE:int)
                var_5_1BC = expr_EE:int
                goto(Label_0719)
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(-174777238))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_1C9:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C9:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_1C9 = and:int(var_0_1C9:int, ldc:int(204833082))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_132 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(20), ldc:int(23)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8267), ldc:int(8264)))
        storeelement:String(expr_132:String[], and:int(ldc:int(25882), ldc:int(6278)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(7448), ldc:int(-7481)), xor:int(ldc:int(16467), ldc:int(16452))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(92), ldc:int(93)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(8226), ldc:int(8245)), and:int(ldc:int(1150), ldc:int(428))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(-10795), ldc:int(10794)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(10620), ldc:int(45)), xor:int(ldc:int(16577), ldc:int(16626))))
        putstatic:String[](\u9af2\ub19c\ub1b9\u5bc4\u8640::\ub19c\u4bc8\uff55\u7bad\ubefe\u6d99, expr_13C:String[])
        putstatic:SimpleCommandExceptionType(\u9af2\ub19c\ub1b9\u5bc4\u8640::\u1833\u8aa5\ub102\ube23\ud158\u8308, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_132:String[], and:int(ldc:int(16495), ldc:int(6162))))))
    }
    
    public void \ud7e8\u72f1\u6c56\u0b8e\u71f1\u0800(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67D : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_CE : double
        var_3_E0 : int
        var_11_F1 : int
        var_14_11B : double
        var_16_11F : int
        var_12_117 : double
        var_17_688 : int
        
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
        var_3_67D = and:int(ldc:int(-1780081332), ldc:int(-155542032))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9af2\ub19c\ub1b9\u5bc4\u8640[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(1600178177))
        }
        else {
            var_3_67D = and:int(var_3_67D:int, ldc:int(-709624015))
            var_5_88 = and:int(ldc:int(23681), ldc:int(-24194))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4014), ldc:int(2860)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E0 = and:int(var_3_67D:int, ldc:int(-960242325))
                    var_9_CE = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F1 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F1:int, sub:int(var_6_8F:int, xor:int(ldc:int(28674), ldc:int(28675)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F1:int, xor:int(ldc:int(4097), ldc:int(4096)))), var_7_9E:double))) {
                        inc:int(var_11_F1, ldc:int(1))
                    }
                    
                    var_3_67D = and:int(var_3_E0:int, ldc:int(-862527539))
                    var_14_11B = var_7_9E:double
                    var_16_11F = var_11_F1:int
                }
                else {
                    var_11_F1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), xor:int(ldc:int(4100), ldc:int(4101)))
                    var_12_117 = var_14_11B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_11F = var_11_F1:int, var_6_8F:int)) {
                        var_9_CE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F1:int)
                        var_16_11F = var_11_F1:int
                        var_14_11B = var_12_117:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(2000570011))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1133700702))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-157372898))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(966498723))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(222438262))
                    }
                    else {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1245799077))
                        
                        if (cmplt:boolean(var_16_11F:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1545)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(108543769))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(517469092))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(2076562088))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-454386238))
                            var_11_F1 = and:int(ldc:int(-23473), ldc:int(23088))
                            goto(Label_1534)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0574:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1545)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1427701132))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-204666613))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1733024273))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-808034308))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11B = var_9_CE:double
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1539740197))
                        goto(Label_1545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1933829329))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1771502837))
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1048897363))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1047096660))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1093771823))
                        var_14_11B = mul:double(ldc:double(0.5), add:double(var_9_CE:double, var_14_11B:double))
                    }
                    
                    Label_0819:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(111929173))
                        goto(Label_1545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(764795110))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-519964141))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-304349758))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_F1 = and:int(ldc:int(6185), ldc:int(1285))
                                goto(Label_1111)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1545)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1130522043))
                        goto(Label_1386)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(2044184547))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-94356652))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(845320093))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(709318531))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1334929122))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(2067474920))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-174358575))
                        var_11_F1 = and:int(ldc:int(29064), ldc:int(-31629))
                    }
                    
                    Label_1111:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1545)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(791744035))
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-1353691151))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1012435779))
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(316142493))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-288137907))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F1:int, ldc:int(0))) {
                                goto(Label_1386)
                            }
                        }
                    }
                    
                    Label_1229:
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1154813915))
                        goto(Label_1545)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1187809685))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(117608299))
                            goto(Label_1111)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(695653452))
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-2008458472))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(1613444208))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_67D = and:int(var_3_67D:int, ldc:int(-204745756))
                            loopcontinue()
                        }
                        
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1393057870))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11B:double, var_5_88:int, var_16_11F:int)
                        goto(Label_1534)
                    }
                    
                    Label_1386:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1072223109))
                        goto(Label_1545)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1070897507))
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(315032687))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1279744935))
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1685151532))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(940303707))
                        loopcontinue()
                    }
                    
                    var_3_67D = and:int(var_3_67D:int, ldc:int(-1230029447))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11B:double, ldc:double(0.0))
                    Label_1534:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_688 = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_F1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1545:
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1386)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1111)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-1042367420))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1004179876))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(532466834))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(1379885652))
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67D = and:int(var_3_67D:int, ldc:int(-594313848))
                        var_17_688 = add:int(var_16_11F:int, and:int(ldc:int(3329), ldc:int(28753)))
                        looporswitchbreak()
                    }
                    
                    var_3_67D = and:int(var_3_67D:int, ldc:int(-1938606764))
                }
                
                var_3_67D = and:int(var_3_67D:int, ldc:int(-1766645870))
                
                if (cmple:boolean(var_5_88 = var_17_688:int, sub:int(var_6_8F:int, and:int(ldc:int(1039), ldc:int(4897))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_67D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_67D = and:int(var_3_67D:int, ldc:int(392312676))
            goto(Label_0106)
        }
    }
}
