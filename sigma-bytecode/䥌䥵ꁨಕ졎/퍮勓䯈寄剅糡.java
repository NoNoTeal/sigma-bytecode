public class \u494c\u4975\ua068\u0c95\uc84e.\ud36e\u52d3\u4bc8\u5bc4\u5245\u7ce1 {
    public void \ud36e\u52d3\u4bc8\u5bc4\u5245\u7ce1(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ud36e\u52d3\u4bc8\u5bc4\u5245\u7ce1, p0:Schema, p1:boolean)
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
    
    private static com.mojang.datafixers.Typed lambda$\u4975\u946b\uf995\ua562\uc238\u4f4a$0(com.mojang.datafixers.Typed p0) {
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
            return:Typed(invokevirtual:Typed(Typed::update, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_177 : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1D9_0 : byte[] [generated]
        stack_235_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        var_4_164 : int
        var_3_169 : byte[]
        var_5_16A : int
        expr_189 : byte [generated]
        var_0_24D : int
        expr_235 : byte [generated]
        stack_281_2 : byte [generated]
        stack_258_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1C8 : byte[]
        var_5_1C9 : int
        expr_BB : int [generated]
        expr_EE : int [generated]
        var_3_2A4 : byte[]
        var_5_2A5 : int
        var_3_12A : String
        stack_15D_0 : String[] [generated]
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
        var_0_177 = and:int(ldc:int(1583270271), ldc:int(-432091650))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_1D9_0 = stack_235_0 = stack_2B5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("pngogYB+AOcxeP4Ij/9YMIfQAEaY/4/I55DnV3D3CA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_164 = expr_6B:int
        var_3_169 = newarray:byte[](byte.class, expr_6B:int)
        var_5_16A = expr_6B:int
        Label_0364:
        
        while (cmpne:boolean(and:int(var_0_177:int, ldc:int(256)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-1166021281))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_189 = loadelement:byte(stack_189_0:byte[], var_5_16A:int)
            storeelement:byte(var_3_169:byte[], var_5_16A:int, or:int(and:int(shl:int(expr_189:byte, and:int(ldc:int(5), ldc:int(8212))), ldc:int(-16)), and:int(shr:int(expr_189:byte[expected:int], and:int(ldc:int(4119), ldc:int(3492))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_1D9_0 = stack_235_0 = stack_2B5_0 = var_3_169:byte[]
            goto(Label_0112)
        }
        
        var_0_177 = and:int(var_0_177:int, ldc:int(-238820856))
        Label_0544:
        
        while (cmpne:boolean(and:int(var_0_177:int, ldc:int(32768)), ldc:int(0))) {
            var_0_24D = and:int(var_0_177:int, ldc:int(-1282475748))
            var_5_16A = add:int(var_5_16A:int, ldc:int(-1))
            expr_235 = stack_281_2 = loadelement(stack_235_0, var_5_16A)
            
            if (cmplt:boolean(add:int(add:int(var_5_16A:int, ldc:int(2)), neg:int(var_4_164:int)), ldc:int(0))) {
                stack_281_2 = stack_258_0 = add:byte(expr_235:byte, loadelement:byte(var_3_169:byte[], add:int(var_5_16A:int, ldc:int(2))))
                goto(Label_0616)
            }
            
            Label_0578:
            
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(32768)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(-1419107762))
            }
            else {
                var_0_24D = and:int(var_0_24D:int, ldc:int(177139164))
                stack_281_2 = stack_258_0 = add:byte(expr_235:byte, ldc:byte(2))
            }
            
            Label_0616:
            
            if (cmpeq:boolean(and:int(var_0_24D:int, ldc:int(131072)), ldc:int(0))) {
                var_0_24D = and:int(var_0_24D:int, ldc:int(368009138))
                goto(Label_0578)
            }
            
            var_0_177 = and:int(var_0_24D:int, ldc:int(1199552348))
            storeelement:byte(var_3_169:byte[], var_5_16A:int, stack_281_2:byte)
            
            if (cmpne:boolean(var_5_16A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_1D9_0 = stack_235_0 = stack_2B5_0 = var_3_169:byte[]
            goto(Label_0192)
        }
        
        goto(Label_0364)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(8)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(454023004))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1C8 = newarray:byte[](byte.class, expr_90:int)
                var_5_1C9 = expr_90:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(1847575839))
                    var_5_1C9 = add:int(var_5_1C9:int, ldc:int(-1))
                    storeelement:byte(var_3_1C8:byte[], var_5_1C9:int, add:int(shl:int(loadelement:byte(stack_1D9_0:byte[], var_5_1C9:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1C9:int, xor:int(ldc:int(12384), ldc:int(12385)))), ldc:int(7)), xor:int(ldc:int(-32640), ldc:int(-32639)))))
                    
                    if (cmpne:boolean(var_5_1C9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_1D9_0 = stack_235_0 = stack_2B5_0 = var_3_1C8:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_177:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(256)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-473259356))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(-226585185))
            expr_BB = arraylength:int(stack_BB_0:byte[])
            
            if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                var_4_164 = expr_BB:int
                var_3_169 = newarray:byte[](byte.class, expr_BB:int)
                var_5_16A = expr_BB:int
                goto(Label_0544)
            }
        }
        
        Label_0192:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(262144)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-326882734))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_177:int, ldc:int(8192)), ldc:int(0))) {
                var_0_177 = and:int(var_0_177:int, ldc:int(-1609955671))
                goto(Label_0112)
            }
            
            var_0_177 = and:int(var_0_177:int, ldc:int(-269571746))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2A4 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2A5 = expr_EE:int
                
                loop {
                    var_0_177 = and:int(var_0_177:int, ldc:int(-366047906))
                    var_5_2A5 = add:int(var_5_2A5:int, ldc:int(-1))
                    storeelement:byte(var_3_2A4:byte[], var_5_2A5:int, xor:byte(add:byte(loadelement:byte(stack_2B5_0:byte[], var_5_2A5:int), ldc:byte(106)), ldc:byte(19)))
                    
                    if (cmpne:boolean(var_5_2A5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_B9_0 = stack_BB_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_189_0 = stack_1D9_0 = stack_235_0 = stack_2B5_0 = var_3_2A4:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0192)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(256)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(-1020778290))
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_177:int, ldc:int(32768)), ldc:int(0))) {
            var_0_177 = and:int(var_0_177:int, ldc:int(1202090721))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_15D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16533), ldc:int(9537)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16392), ldc:int(16393)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(-14823), ldc:int(14754)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(2983), ldc:int(-27560)), xor:int(ldc:int(-32726), ldc:int(-32716))))
        putstatic:String[](\ud36e\u52d3\u4bc8\u5bc4\u5245\u7ce1::\ud217\u8709\u446c\ubefe\u59ec\u99f7, expr_13C:String[])
    }
    
    public void \u5245\u2dcc\u12cb\ub19c\u3bd6\u8308(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_628 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_633 : int
        
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
        var_3_628 = and:int(ldc:int(-1119141511), ldc:int(-1376893090))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud36e\u52d3\u4bc8\u5bc4\u5245\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_628 = and:int(var_3_628:int, ldc:int(-1525687346))
            var_5_7D = and:int(ldc:int(10179), ldc:int(-10180))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22660), ldc:int(22659)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_628:int, ldc:int(-1256532118))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(8784), ldc:int(8785)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(7047), ldc:int(105)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_628 = and:int(var_3_CA:int, ldc:int(-305435270))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(20480), ldc:int(20481)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(121391576))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0869)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0743)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-716277937))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0509)
                            }
                            
                            goto(Label_0743)
                        }
                    }
                    
                    Label_0357:
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1996645919))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(447720783))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0869)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(38625013))
                        goto(Label_0743)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(323524523))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(-177581729))
                            var_11_DB = and:int(ldc:int(29636), ldc:int(-30669))
                            goto(Label_1442)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0509:
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-2137195166))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(473809687))
                        goto(Label_0869)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-327505846))
                        goto(Label_0743)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1398506104))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(-2084456163))
                            loopcontinue()
                        }
                        
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1352969779))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0743)
                        }
                    }
                    
                    Label_0628:
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-6347808))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(629612573))
                        goto(Label_0869)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(128)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(642491475))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_628 = and:int(var_3_628:int, ldc:int(-681675300))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0743:
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(64)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1676417129))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-460270400))
                        goto(Label_1304)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1331417840))
                        goto(Label_1040)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1956355131))
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1098593072))
                            loopcontinue()
                        }
                        
                        var_3_628 = and:int(var_3_628:int, ldc:int(-847253639))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(2825), ldc:int(20561))
                                goto(Label_1040)
                            }
                        }
                    }
                    
                    Label_0869:
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1805990364))
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-471015782))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1772343650))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0743)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1704808413))
                            goto(Label_0509)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1537530546))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(64)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1627759277))
                            loopcontinue()
                        }
                        
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1613010098))
                        var_11_DB = and:int(ldc:int(12534), ldc:int(-12543))
                    }
                    
                    Label_1040:
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1702643522))
                            goto(Label_0869)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1724034190))
                            goto(Label_0743)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(8)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1716072398))
                            goto(Label_0628)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(64)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(-106755013))
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(-763288362))
                            loopcontinue()
                        }
                        
                        var_3_628 = and:int(var_3_628:int, ldc:int(-584060471))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1304)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(128)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1938054121))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(572861913))
                            goto(Label_1040)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1649640237))
                            goto(Label_0869)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1668134255))
                            goto(Label_0743)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0628)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0509)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_628 = and:int(var_3_628:int, ldc:int(1705820866))
                            loopcontinue()
                        }
                        
                        var_3_628 = and:int(var_3_628:int, ldc:int(-843091457))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1442)
                    }
                    
                    Label_1304:
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1005827207))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-52361857))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1271016719))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0869)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0743)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-395045791))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1286923963))
                        loopcontinue()
                    }
                    
                    var_3_628 = and:int(var_3_628:int, ldc:int(-711275176))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1442:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_633 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1453:
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1304)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1553349566))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(512)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-172078147))
                        goto(Label_1040)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1603893627))
                        goto(Label_0869)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(1099588530))
                        goto(Label_0743)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-692449430))
                        goto(Label_0628)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0509)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1896350508))
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_628:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_628 = and:int(var_3_628:int, ldc:int(-1757459591))
                        var_17_633 = add:int(var_16_109:int, and:int(ldc:int(261), ldc:int(8267)))
                        looporswitchbreak()
                    }
                }
                
                var_3_628 = and:int(var_3_628:int, ldc:int(-816951460))
                
                if (cmple:boolean(var_5_7D = var_17_633:int, sub:int(var_6_84:int, and:int(ldc:int(2193), ldc:int(513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_628:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
