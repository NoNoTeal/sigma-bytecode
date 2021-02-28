public class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u0a06\uc4d2\u64ab\ufcaf\u99f7 {
    public void \u0a06\uc4d2\u64ab\ufcaf\u99f7() {
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
            invokespecial:Object(Object::<init>, this:\u0a06\uc4d2\u64ab\ufcaf\u99f7)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3bc9\u8258\u97b7\ud158\u6d99\u3504(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int lambda$\uf995\ub113\u7873\u071d\u836c\u3e2a$1(com.mojang.brigadier.context.CommandContext p0) {
        var_1_5F : int
        var_3_67 : \u8413\u5140\u64f2\uc9f6\u9937
        var_4_6F : int
        var_5_7D : Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>
        var_6_112 : \ube23\uc238\u5140\u4cd9\u8aa5
        
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
        var_1_5F = and:int(ldc:int(-242150148), ldc:int(-206264579))
        var_3_67 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))
        var_4_6F = and:int(ldc:int(-22884), ldc:int(22880))
        var_5_7D = invokeinterface:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>(Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>::iterator, invokevirtual:Iterable<\ube23\uc238\u5140\u4cd9\u8aa5>(\u88c5\ud171\ub113\u6435\ud51e::\u983f\ubefe\ua562\u9a18\uae87\u34df, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937)))
        
        loop {
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1713424443))
                goto(Label_0196)
            }
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(256)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-136420097))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_5_7D:Iterator)) {
                    var_6_112 = checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, invokeinterface:\ube23\uc238\u5140\u4cd9\u8aa5(Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>::next, var_5_7D:Iterator<\ube23\uc238\u5140\u4cd9\u8aa5>))
                    
                    if (cmpne:boolean(var_6_112:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
                        if (logicalnot:boolean(getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, var_6_112:\ube23\uc238\u5140\u4cd9\u8aa5))) {
                            putfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, var_6_112:\ube23\uc238\u5140\u4cd9\u8aa5, xor:int[expected:boolean](ldc:int(3392), ldc:int(3393)))
                            var_4_6F = and:int(ldc:int(1281), ldc:int(26777))
                        }
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1938901374))
                    loopcontinue()
                }
            }
            
            Label_0164:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(64)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(108276430))
                    loopcontinue()
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(2008789215))
                
                if (cmpeq:boolean(var_4_6F:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u0a06\uc4d2\u64ab\ufcaf\u99f7::\ubb2b\ub70c\u12b2\uc229\u9937\u600f)))
                }
            }
            
            Label_0196:
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(32768)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-780917195))
                goto(Label_0164)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u0a06\uc4d2\u64ab\ufcaf\u99f7::\u9af2\u1833\u156b\u12cb\u7d52\u6c52), and:int(ldc:int(24633), ldc:int(1477)))), and:int[expected:boolean](ldc:int(16399), ldc:int(6225)))
                return:int(and:int(ldc:int(21025), ldc:int(395)))
            }
        }
    }
    
    private static boolean lambda$\u4daf\u6c56\uc3e3\ud36e\u9033\uc87f$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(19502), ldc:int(4356))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_248 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1CB_0 : byte[] [generated]
        stack_25A_0 : byte[] [generated]
        stack_2AD_0 : byte[] [generated]
        stack_302_0 : byte[] [generated]
        var_4_1AE : int
        var_3_1B3 : byte[]
        var_5_1B4 : int
        var_0_1E3 : int
        expr_1CB : byte [generated]
        stack_217_2 : byte [generated]
        stack_1EE_0 : byte [generated]
        expr_25A : byte [generated]
        expr_96 : int [generated]
        var_2_B7 : byte[]
        expr_BB : int [generated]
        var_3_29C : byte[]
        var_5_29D : int
        expr_EE : int [generated]
        var_3_2F1 : byte[]
        var_5_2F2 : int
        var_3_122 : String
        expr_12A : String[] [generated]
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
        var_0_248 = and:int(ldc:int(236927441), ldc:int(-25429008))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_B7_0 = stack_B9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_25A_0 = stack_2AD_0 = stack_302_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("TLgI3ET5ELQq8FmJJPMwsOw70PjFLCAcVLgI3ET5ELQq8Fm5+O/M3Aw8MPjEQ+hZ3fzbH6yoZQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1AE = expr_6B:int
        var_3_1B3 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1B4 = expr_6B:int
        Label_0438:
        
        while (cmpeq:boolean(and:int(var_0_248:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1E3 = and:int(var_0_248:int, ldc:int(-1892171783))
            var_5_1B4 = add:int(var_5_1B4:int, ldc:int(-1))
            expr_1CB = stack_217_2 = loadelement(stack_1CB_0, var_5_1B4)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B4:int, ldc:int(3)), neg:int(var_4_1AE:int)), ldc:int(0))) {
                stack_217_2 = stack_1EE_0 = add:byte(expr_1CB:byte, loadelement:byte(var_3_1B3:byte[], add:int(var_5_1B4:int, ldc:int(3))))
                goto(Label_0510)
            }
            
            Label_0472:
            
            if (cmpne:boolean(and:int(var_0_1E3:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_1E3 = and:int(var_0_1E3:int, ldc:int(723058355))
            }
            else {
                var_0_1E3 = and:int(var_0_1E3:int, ldc:int(1591719378))
                stack_217_2 = stack_1EE_0 = add:byte(expr_1CB:byte, ldc:byte(3))
            }
            
            Label_0510:
            
            if (cmpeq:boolean(and:int(var_0_1E3:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_1E3 = and:int(var_0_1E3:int, ldc:int(457881074))
                goto(Label_0472)
            }
            
            var_0_248 = and:int(var_0_1E3:int, ldc:int(1606368735))
            storeelement:byte(var_3_1B3:byte[], var_5_1B4:int, stack_217_2:byte)
            
            if (cmpne:boolean(var_5_1B4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_25A_0 = stack_2AD_0 = stack_302_0 = var_3_1B3:byte[]
            goto(Label_0112)
        }
        
        Label_0573:
        
        while (cmpne:boolean(and:int(var_0_248:int, ldc:int(8192)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(794506721))
            var_5_1B4 = add:int(var_5_1B4:int, ldc:int(-1))
            expr_25A = loadelement:byte(stack_25A_0:byte[], var_5_1B4:int)
            storeelement:byte(var_3_1B3:byte[], var_5_1B4:int, xor:int(or:int(and:int(shl:int(expr_25A:byte, and:int(ldc:int(12), ldc:int(119))), ldc:int(-16)), and:int(shr:int(expr_25A:byte[expected:int], and:int(ldc:int(16388), ldc:int(1222))), ldc:int(15))), ldc:int(6)))
            
            if (cmpne:boolean(var_5_1B4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_25A_0 = stack_2AD_0 = stack_302_0 = var_3_1B3:byte[]
            goto(Label_0155)
        }
        
        var_0_248 = and:int(var_0_248:int, ldc:int(-1641194649))
        goto(Label_0438)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(32)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-402761009))
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(-807961104))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1AE = expr_96:int
                var_3_1B3 = newarray:byte[](byte.class, expr_96:int)
                var_5_1B4 = expr_96:int
                goto(Label_0573)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(1593572837))
            var_2_B7 = stack_B7_0:byte[]
            expr_BB = add:int(arraylength:int(stack_B9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_3_29C = newarray:byte[](byte.class, expr_BB:int)
                var_5_29D = expr_BB:int
                
                loop {
                    var_0_248 = and:int(var_0_248:int, ldc:int(-1363971092))
                    var_5_29D = add:int(var_5_29D:int, ldc:int(-1))
                    storeelement:byte(var_3_29C:byte[], var_5_29D:int, add:int(shl:int(loadelement:byte(stack_2AD_0:byte[], var_5_29D:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_B7:byte[], add:int(var_5_29D:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), ldc:int(6)), and:int(ldc:int(8847), ldc:int(22611)))))
                    
                    if (cmpne:boolean(var_5_29D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_25A_0 = stack_2AD_0 = stack_302_0 = var_3_29C:byte[]
            }
        }
        
        Label_0192:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(131072)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-1793648468))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(131072)), ldc:int(0))) {
                var_0_248 = and:int(var_0_248:int, ldc:int(-1967818765))
                goto(Label_0112)
            }
            
            var_0_248 = and:int(var_0_248:int, ldc:int(1312767945))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2F1 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2F2 = expr_EE:int
                
                loop {
                    var_0_248 = and:int(var_0_248:int, ldc:int(-1093143555))
                    var_5_2F2 = add:int(var_5_2F2:int, ldc:int(-1))
                    storeelement:byte(var_3_2F1:byte[], var_5_2F2:int, add:byte(loadelement:byte(stack_302_0:byte[], var_5_2F2:int), ldc:byte(116)))
                    
                    if (cmpne:boolean(var_5_2F2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_B7_0 = stack_B9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_1CB_0 = stack_25A_0 = stack_2AD_0 = stack_302_0 = var_3_2F1:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_248:int, ldc:int(64)), ldc:int(0))) {
            var_0_248 = and:int(var_0_248:int, ldc:int(1473198485))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_248:int, ldc:int(64)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_12A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9491), ldc:int(111)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19), ldc:int(3331)))
            storeelement:String(expr_12A:String[], and:int(ldc:int(18946), ldc:int(8202)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-12506), ldc:int(12377)), xor:int(ldc:int(2591), ldc:int(2567))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(1346), ldc:int(1347)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(2109), ldc:int(4376)), xor:int(ldc:int(-32715), ldc:int(-32741))))
            storeelement:String(expr_134:String[], and:int(ldc:int(-6724), ldc:int(6723)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(8245), ldc:int(8219)), and:int(ldc:int(10294), ldc:int(17078))))
            putstatic:String[](\u0a06\uc4d2\u64ab\ufcaf\u99f7::\u9af2\u1833\u156b\u12cb\u7d52\u6c52, expr_134:String[])
            putstatic:SimpleCommandExceptionType(\u0a06\uc4d2\u64ab\ufcaf\u99f7::\ubb2b\ub70c\u12b2\uc229\u9937\u600f, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_12A:String[], xor:int(ldc:int(257), ldc:int(259))))))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u6ec6\u9af2\uf9c5\u6bb9\u392e\u92ff(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_630 : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_63B : int
        
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
        var_3_630 = and:int(ldc:int(428497466), ldc:int(-1140925338))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0a06\uc4d2\u64ab\ufcaf\u99f7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_630 = and:int(var_3_630:int, ldc:int(-760979842))
            var_5_7F = and:int(ldc:int(-19684), ldc:int(17539))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3771), ldc:int(3642)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_630:int, ldc:int(-712195230))
                    var_9_C6 = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_86:int, and:int(ldc:int(9281), ldc:int(17)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(16517), ldc:int(4881)))), var_7_95:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_630 = and:int(var_3_D8:int, ldc:int(2093835055))
                    var_14_113 = var_7_95:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), and:int(ldc:int(18437), ldc:int(865)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_86:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1664449784))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1001481833))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-238005942))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-692819614))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(32)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(665099915))
                    }
                    else {
                        var_3_630 = and:int(var_3_630:int, ldc:int(821460394))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1217236798))
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1793944353))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1096144656))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1715518277))
                        var_11_E9 = and:int(ldc:int(-15720), ldc:int(15714))
                        goto(Label_1454)
                    }
                    
                    Label_0568:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(2108345882))
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1635621161))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1613538580))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-138149063))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(2010114919))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0691:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-648573789))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1003276802))
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-466426171))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(314401507))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-2007242250))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-106670246))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(2116536330))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-221647178))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E9 = xor:int(ldc:int(-23936), ldc:int(-23935))
                                goto(Label_1069)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1062828562))
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1278969183))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1476155371))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-726638666))
                        var_11_E9 = and:int(ldc:int(21146), ldc:int(-21148))
                    }
                    
                    Label_1069:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(342835269))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-708581067))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1125805588))
                            goto(Label_0691)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-307708669))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1276810509))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1313)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-637402326))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1069)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(32)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-906436389))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0691)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-842696726))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(919863150))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_7F:int, var_16_117:int)
                            goto(Label_1454)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1313:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1465)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1917962565))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(32)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1875565405))
                        goto(Label_1069)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(784276200))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0691)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1045819161))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-167492935))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_630 = and:int(var_3_630:int, ldc:int(972442730))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1454:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63B = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1465:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1069)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1581239236))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1131152466))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(64)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1200353529))
                        goto(Label_0691)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-260551148))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(282320187))
                        var_17_63B = add:int(var_16_117:int, and:int(ldc:int(8707), ldc:int(3121)))
                        looporswitchbreak()
                    }
                    
                    var_3_630 = and:int(var_3_630:int, ldc:int(1206293740))
                }
                
                var_3_630 = and:int(var_3_630:int, ldc:int(835046818))
                
                if (cmple:boolean(var_5_7F = var_17_63B:int, sub:int(var_6_86:int, and:int(ldc:int(257), ldc:int(4611))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_630 = and:int(var_3_630:int, ldc:int(-1395336330))
            goto(Label_0106)
        }
    }
}
