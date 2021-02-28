public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u071d\ubff1\u446c\u4975\u7ce1 {
    public void \u071d\ubff1\u446c\u4975\u7ce1() {
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
            invokespecial:Object(Object::<init>, this:\u071d\ubff1\u446c\u4975\u7ce1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc238\u4cd9\u7bad\ud7e8\u92ff\ub83f(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int lambda$\u1833\u6cfe\u3c25\u624e\u3504\uc2bd$1(com.mojang.brigadier.context.CommandContext p0) {
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
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u071d\ubff1\u446c\u4975\u7ce1::\u67e9\u4492\u6198\u67e9\u4f52\u4f4a), xor:int(ldc:int(-28672), ldc:int(-28671)))), xor:int[expected:boolean](ldc:int(8484), ldc:int(8485)))
            invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u4f52\u5fe1\u7c6b\u92ee\u7d52\u6c56, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))), and:int[expected:boolean](ldc:int(5204), ldc:int(-5205)))
            return:int(xor:int(ldc:int(8713), ldc:int(8712)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u183a\uc3e3\ud217\u8640\ub102\u7ce1$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(2116), ldc:int(5124))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1AA : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1BC_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        stack_25A_0 : byte[] [generated]
        stack_2DA_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        var_0_272 : int
        expr_25A : byte [generated]
        stack_2A6_2 : byte [generated]
        stack_27D_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1E5 : byte[]
        var_5_1E6 : int
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_2C9 : byte[]
        var_5_2CA : int
        expr_2DD : byte [generated]
        var_3_142 : String
        stack_190_0 : String[] [generated]
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
        var_0_1AA = and:int(ldc:int(1638678002), ldc:int(1924970483))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_25A_0 = stack_2DA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("z9PTUFLLrEtTbU65ytNtTs/N2FbIyM1OA3T8")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_197 = expr_6B:int
        var_3_19C = newarray:byte[](byte.class, expr_6B:int)
        var_5_19D = expr_6B:int
        Label_0415:
        
        while (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(256)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-52513293))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, add:byte(loadelement:byte(stack_1BC_0:byte[], var_5_19D:int), ldc:byte(52)))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_25A_0 = stack_2DA_0 = var_3_19C:byte[]
            goto(Label_0112)
        }
        
        var_0_1AA = and:int(var_0_1AA:int, ldc:int(1539952173))
        Label_0573:
        
        while (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(8192)), ldc:int(0))) {
            var_0_272 = and:int(var_0_1AA:int, ldc:int(1991194615))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_25A = stack_2A6_2 = loadelement(stack_25A_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(3)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_2A6_2 = stack_27D_0 = add:byte(expr_25A:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(3))))
                goto(Label_0653)
            }
            
            Label_0615:
            
            if (cmpne:boolean(and:int(var_0_272:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_272 = and:int(var_0_272:int, ldc:int(-2021070454))
            }
            else {
                var_0_272 = and:int(var_0_272:int, ldc:int(635354111))
                stack_2A6_2 = stack_27D_0 = add:byte(expr_25A:byte, ldc:byte(3))
            }
            
            Label_0653:
            
            if (cmpne:boolean(and:int(var_0_272:int, ldc:int(131072)), ldc:int(0))) {
                var_0_272 = and:int(var_0_272:int, ldc:int(-1545085543))
                goto(Label_0615)
            }
            
            var_0_1AA = and:int(var_0_272:int, ldc:int(937260978))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_2A6_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_25A_0 = stack_2DA_0 = var_3_19C:byte[]
            goto(Label_0216)
        }
        
        var_0_1AA = and:int(var_0_1AA:int, ldc:int(603478481))
        goto(Label_0415)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(32)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-678833084))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(128)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(1111522675))
        }
        else {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-70290945))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1E5 = newarray:byte[](byte.class, expr_A0:int)
                var_5_1E6 = expr_A0:int
                
                loop {
                    var_0_1AA = and:int(var_0_1AA:int, ldc:int(-175293510))
                    var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
                    storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, add:int(shl:int(loadelement:byte(stack_1F6_0:byte[], var_5_1E6:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1E6:int, xor:int(ldc:int(768), ldc:int(769)))), ldc:int(3)), xor:int(ldc:int(-28657), ldc:int(-28656)))))
                    
                    if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_25A_0 = stack_2DA_0 = var_3_1E5:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1364123224))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(131072)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(-127832957))
                goto(Label_0112)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1246776906))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_197 = expr_D3:int
                var_3_19C = newarray:byte[](byte.class, expr_D3:int)
                var_5_19D = expr_D3:int
                goto(Label_0573)
            }
        }
        
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(262144)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(-209620185))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1727928758))
                goto(Label_0112)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(881737722))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2C9 = newarray:byte[](byte.class, expr_106:int)
                var_5_2CA = expr_106:int
                
                loop {
                    var_0_1AA = and:int(var_0_1AA:int, ldc:int(-523255878))
                    var_5_2CA = add:int(var_5_2CA:int, ldc:int(-1))
                    expr_2DD = xor:byte(loadelement:byte(stack_2DA_0:byte[], var_5_2CA:int), ldc:byte(14))
                    storeelement:byte(var_3_2C9:byte[], var_5_2CA:int, or:int(and:int(shl:int(expr_2DD:byte, and:int(ldc:int(26628), ldc:int(261))), ldc:int(-16)), and:int(shr:int(expr_2DD:byte[expected:int], xor:int(ldc:int(16389), ldc:int(16385))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2CA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_25A_0 = stack_2DA_0 = var_3_2C9:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(562728332))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(65536)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1476516459))
            goto(Label_0112)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_190_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16394), ldc:int(259)))
        expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4168), ldc:int(4170)))
        storeelement:String(expr_154:String[], and:int(ldc:int(24921), ldc:int(5281)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-7411), ldc:int(5360)), xor:int(ldc:int(1597), ldc:int(1579))))
        storeelement:String(expr_154:String[], and:int(ldc:int(-13155), ldc:int(13154)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(4414), ldc:int(726)), xor:int(ldc:int(13), ldc:int(23))))
        putstatic:String[](\u071d\ubff1\u446c\u4975\u7ce1::\u67e9\u4492\u6198\u67e9\u4f52\u4f4a, expr_154:String[])
    }
    
    public void \u93a2\u40a9\u6ec6\u52d3\u600f\ub1b9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_674 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_67F : int
        
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
        var_3_674 = and:int(ldc:int(-652936656), ldc:int(-107479813))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\ubff1\u446c\u4975\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_674 = and:int(var_3_674:int, ldc:int(-82381706))
            var_5_7D = and:int(ldc:int(8826), ldc:int(-15232))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22955), ldc:int(22690)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_674:int, ldc:int(-648088147))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-32472), ldc:int(-32471)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(2117), ldc:int(4395)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_674 = and:int(var_3_CA:int, ldc:int(-83952007))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(18763), ldc:int(529)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(651914929))
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-647727106))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1900865938))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-452808301))
                    }
                    else {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-31655069))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-595865955))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1243135759))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1635693449))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(568304468))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-730481587))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1834265752))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-90835674))
                        var_11_DB = and:int(ldc:int(-16532), ldc:int(16531))
                        goto(Label_1531)
                    }
                    
                    Label_0567:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-861821992))
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1884185353))
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1437425951))
                        goto(Label_0935)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(31329330))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1104119167))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-549587398))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2028815069))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1268843838))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-282671235))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1642851657))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-99156696))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(595811843))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-260387480))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1761115994))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-39977812))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(3072), ldc:int(3073))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0935:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2001590560))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-380795619))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1836842199))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1791286816))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(601938528))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1392695931))
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-69207070))
                        var_11_DB = and:int(ldc:int(22789), ldc:int(-31494))
                    }
                    
                    Label_1108:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-577118667))
                        goto(Label_1542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1081867103))
                        goto(Label_1388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1084921211))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0935)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(1985443918))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1886923949))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1564655577))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_674 = and:int(var_3_674:int, ldc:int(-617219977))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1388)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(602393226))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(996092684))
                            goto(Label_1108)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1533970749))
                            goto(Label_0935)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-1777973970))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-15646562))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_674 = and:int(var_3_674:int, ldc:int(-631377805))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1531)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1388:
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-204018930))
                        goto(Label_1542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1510630107))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1170184209))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1491145944))
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(2117615170))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_674 = and:int(var_3_674:int, ldc:int(-18941533))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1531:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67F = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1542:
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-2038654812))
                        goto(Label_0935)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-923027068))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-1900063062))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(1826091651))
                        goto(Label_0390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_674:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_674 = and:int(var_3_674:int, ldc:int(-608832008))
                        var_17_67F = add:int(var_16_109:int, xor:int(ldc:int(4481), ldc:int(4480)))
                        looporswitchbreak()
                    }
                }
                
                var_3_674 = and:int(var_3_674:int, ldc:int(-75566103))
                
                if (cmple:boolean(var_5_7D = var_17_67F:int, sub:int(var_6_84:int, and:int(ldc:int(4353), ldc:int(16457))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_674:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
