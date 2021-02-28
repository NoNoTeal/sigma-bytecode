public final class \u47c2\u2dcc\u12cb\ud171\u8c8a.\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c {
    private void \u99f7\uf9c5\u4cd9\u64f2\ube23\u446c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3c25\ub102\ubcb0\u4179\u51b2\u3a62 p0, \u12b2\u7049\u8df4\uc9f6\uae87.\uf995\u64f2\u3711\uc2e8\u927d p1, double p2, double p3) {
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
    
    private static java.util.Map lambda$\u8df4\u7ce1\ud4fe\uc2bd\u6b0d\uc7fe$0(\u12b2\u7049\u8df4\uc9f6\uae87.\uf995\u64f2\u3711\uc2e8\u927d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6 p1, int p2, int p3) {
        var_4_61 : int
        var_6_68 : \ube23\uc238\u5140\u4cd9\u8aa5
        var_4_BF : int
        var_7_79 : ImmutableMap$Builder
        var_8_80 : \u69d9\u759a\u64ab\ua3b4\u6b0d
        var_9_86 : int
        var_10_B8 : int
        var_11_E6 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        
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
        var_4_61 = and:int(ldc:int(-1140305518), ldc:int(-1714554394))
        var_6_68 = invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u760c\uc9f6\uff55\u3dd3\ubff1\u8cae, p0:\uf995\u64f2\u3711\uc2e8\u927d[expected:\u88c5\ud171\ub113\u6435\ud51e], p1:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>)
        
        if (cmpne:boolean(var_6_68:\ube23\uc238\u5140\u4cd9\u8aa5, aconstnull:\ube23\uc238\u5140\u4cd9\u8aa5())) {
            var_4_BF = and:int(var_4_61:int, ldc:int(-1743257764))
            var_7_79 = invokestatic:ImmutableMap$Builder(ImmutableMap::builder)
            var_8_80 = invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, var_6_68:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_9_86 = sub:int(p2:int, ldc:int(12))
            
            while (cmple:boolean(var_9_86:int, add:int(p2:int, ldc:int(12)))) {
                var_10_B8 = sub:int(p3:int, ldc:int(12))
                
                loop {
                    var_4_BF = and:int(var_4_BF:int, ldc:int(-667943802))
                    
                    if (cmpgt:boolean(var_10_B8:int, add:int(p3:int, ldc:int(12)))) {
                        looporswitchbreak()
                    }
                    
                    var_11_E6 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, var_9_86:int, var_10_B8:int)
                    invokevirtual:ImmutableMap$Builder(ImmutableMap$Builder::put, var_7_79:ImmutableMap$Builder, var_11_E6:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c::\u8d90\u8389\u3e75\u4492\u927d\u7049), xor:int(ldc:int(5128), ldc:int(5133)))), invokevirtual:String(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u67e9\u6c56\u67d0\ubb2b\uae87\uc246, var_8_80:\u69d9\u759a\u64ab\ua3b4\u6b0d, var_11_E6:\u120d\u2dcc\ubff1\uceb8\ube23\u647c))))
                    inc:int(var_10_B8, ldc:int(1))
                }
                
                var_4_BF = and:int(var_4_BF:int, ldc:int(-625938203))
                inc:int(var_9_86, ldc:int(1))
            }
            
            return:Map(invokevirtual:ImmutableMap(ImmutableMap$Builder::build, var_7_79:ImmutableMap$Builder))
        }
        
        return:Map(invokestatic:ImmutableMap[expected:Map](ImmutableMap::of))
    }
    
    public void \u99f7\uf9c5\u4cd9\u64f2\ube23\u446c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u3c25\ub102\ubcb0\u4179\u51b2\u3a62 p0, \u12b2\u7049\u8df4\uc9f6\uae87.\uf995\u64f2\u3711\uc2e8\u927d p1, double p2, double p3, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6fb0\u99f7\u6b5f\ub171\uc910\u6c52 p4) {
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
            invokespecial:\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c(\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c::<init>, this:\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c, p0:\u3c25\ub102\ubcb0\u4179\u51b2\u3a62, p1:\uf995\u64f2\u3711\uc2e8\u927d, p2:double, p3:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.concurrent.CompletableFuture \u0b8e\ud4fe\u5654\ua562\ubefe\u7c6b(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c p0) {
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
            return:CompletableFuture(getfield:CompletableFuture<Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, String>>(\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c::\u8350\u88c5\ufe34\ud523\u6c52\u839e, p0:\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \u8cae\u8d98\u12b2\uc910\u4c2b\u8df4(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c p0) {
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
            return:Map(getfield:Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, String>(\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c::\u3e2a\u718f\ubff1\u4ab3\u7e3f\ubff1, p0:\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1B6 : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_A9_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_1C8_0 : byte[] [generated]
        stack_228_0 : byte[] [generated]
        stack_2A5_0 : byte[] [generated]
        var_4_1A3 : int
        var_3_1A8 : byte[]
        var_5_1A9 : int
        expr_1C8 : byte [generated]
        var_0_240 : int
        expr_228 : byte [generated]
        stack_274_2 : byte [generated]
        stack_24B_0 : byte [generated]
        expr_87 : int [generated]
        var_2_A9 : byte[]
        expr_AD : int [generated]
        var_3_294 : byte[]
        var_5_295 : int
        var_3_E2 : String
        stack_19C_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_1B6 = and:int(ldc:int(1654108745), ldc:int(-812204312))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_1C8_0 = stack_228_0 = stack_2A5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ZsOZJJ0uBMKpI82ZCJ1MfskT+hF5G6HzOA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1A3 = expr_6B:int
        var_3_1A8 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1A9 = expr_6B:int
        Label_0427:
        
        while (cmpeq:boolean(and:int(var_0_1B6:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1B6 = and:int(var_0_1B6:int, ldc:int(1651785537))
            var_5_1A9 = add:int(var_5_1A9:int, ldc:int(-1))
            expr_1C8 = loadelement:byte(stack_1C8_0:byte[], var_5_1A9:int)
            storeelement:byte(var_3_1A8:byte[], var_5_1A9:int, xor:int(add:int(or:int(and:int(shl:int(expr_1C8:byte, xor:int(ldc:int(391), ldc:int(387))), ldc:int(-16)), and:int(shr:int(expr_1C8:byte[expected:int], xor:int(ldc:int(4149), ldc:int(4145))), ldc:int(15))), ldc:int(19)), ldc:int(108)))
            
            if (cmpne:boolean(var_5_1A9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_1C8_0 = stack_228_0 = stack_2A5_0 = var_3_1A8:byte[]
            goto(Label_0112)
        }
        
        var_0_1B6 = and:int(var_0_1B6:int, ldc:int(-1899888445))
        Label_0531:
        
        while (cmpeq:boolean(and:int(var_0_1B6:int, ldc:int(32)), ldc:int(0))) {
            var_0_240 = and:int(var_0_1B6:int, ldc:int(1985460817))
            var_5_1A9 = add:int(var_5_1A9:int, ldc:int(-1))
            expr_228 = stack_274_2 = loadelement(stack_228_0, var_5_1A9)
            
            if (cmplt:boolean(add:int(add:int(var_5_1A9:int, ldc:int(6)), neg:int(var_4_1A3:int)), ldc:int(0))) {
                stack_274_2 = stack_24B_0 = add:byte(expr_228:byte, loadelement:byte(var_3_1A8:byte[], add:int(var_5_1A9:int, ldc:int(6))))
                goto(Label_0603)
            }
            
            Label_0565:
            
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(4096)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(1055083508))
            }
            else {
                var_0_240 = and:int(var_0_240:int, ldc:int(1498576803))
                stack_274_2 = stack_24B_0 = add:byte(expr_228:byte, ldc:byte(6))
            }
            
            Label_0603:
            
            if (cmpeq:boolean(and:int(var_0_240:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_240 = and:int(var_0_240:int, ldc:int(1353245028))
                goto(Label_0565)
            }
            
            var_0_1B6 = and:int(var_0_240:int, ldc:int(1952300696))
            storeelement:byte(var_3_1A8:byte[], var_5_1A9:int, stack_274_2:byte)
            
            if (cmpne:boolean(var_5_1A9:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_1C8_0 = stack_228_0 = stack_2A5_0 = var_3_1A8:byte[]
            goto(Label_0140)
        }
        
        goto(Label_0427)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1B6:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_1B6:int, ldc:int(512)), ldc:int(0))) {
            var_0_1B6 = and:int(var_0_1B6:int, ldc:int(-174802214))
            expr_87 = arraylength:int(stack_87_0:byte[])
            
            if (cmpne:boolean(expr_87:int, ldc:int(0))) {
                var_4_1A3 = expr_87:int
                var_3_1A8 = newarray:byte[](byte.class, expr_87:int)
                var_5_1A9 = expr_87:int
                goto(Label_0531)
            }
        }
        
        Label_0140:
        
        if (cmpeq:boolean(and:int(var_0_1B6:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1B6:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1B6 = and:int(var_0_1B6:int, ldc:int(2074019829))
                goto(Label_0112)
            }
            
            var_0_1B6 = and:int(var_0_1B6:int, ldc:int(1238793183))
            var_2_A9 = stack_A9_0:byte[]
            expr_AD = add:int(arraylength:int(stack_AB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_3_294 = newarray:byte[](byte.class, expr_AD:int)
                var_5_295 = expr_AD:int
                
                loop {
                    var_0_1B6 = and:int(var_0_1B6:int, ldc:int(-824936592))
                    var_5_295 = add:int(var_5_295:int, ldc:int(-1))
                    storeelement:byte(var_3_294:byte[], var_5_295:int, add:int(shl:int(loadelement:byte(stack_2A5_0:byte[], var_5_295:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_A9:byte[], add:int(var_5_295:int, and:int(ldc:int(27801), ldc:int(357)))), ldc:int(5)), and:int(ldc:int(16839), ldc:int(8231)))))
                    
                    if (cmpne:boolean(var_5_295:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_A9_0 = stack_AB_0 = stack_D6_0 = stack_1C8_0 = stack_228_0 = stack_2A5_0 = var_3_294:byte[]
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_0_1B6:int, ldc:int(128)), ldc:int(0))) {
            var_0_1B6 = and:int(var_0_1B6:int, ldc:int(-234336674))
            goto(Label_0140)
        }
        
        if (cmpeq:boolean(and:int(var_0_1B6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1B6 = and:int(var_0_1B6:int, ldc:int(301128363))
            goto(Label_0112)
        }
        
        var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_19C_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32700), ldc:int(-32702)))
        expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(134), ldc:int(3398)))
        storeelement:String(expr_F4:String[], and:int(ldc:int(7650), ldc:int(-15843)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(22112), ldc:int(-30694)), and:int(ldc:int(28864), ldc:int(-28881))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(1060), ldc:int(6612)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-24287), ldc:int(24222)), and:int(ldc:int(8839), ldc:int(6441))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(8449), ldc:int(8450)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(6147), ldc:int(489)), xor:int(ldc:int(-32378), ldc:int(-32379))))
        storeelement:String(expr_F4:String[], xor:int(ldc:int(-31359), ldc:int(-31357)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(1027), ldc:int(535)), xor:int(ldc:int(-32762), ldc:int(-32754))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(69), ldc:int(2225)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, xor:int(ldc:int(35), ldc:int(43)), and:int(ldc:int(25113), ldc:int(3120))))
        storeelement:String(expr_F4:String[], and:int(ldc:int(8525), ldc:int(16901)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(2322), ldc:int(25652)), and:int(ldc:int(16408), ldc:int(2430))))
        putstatic:String[](\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c::\u8d90\u8389\u3e75\u4492\u927d\u7049, expr_F4:String[])
    }
    
    public void \u6d69\u3711\ub19c\u873d\u93a2\u92ee(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_649 : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_654 : int
        
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
        var_3_649 = and:int(ldc:int(1514674028), ldc:int(-71535012))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
            var_3_649 = and:int(var_3_649:int, ldc:int(-641861751))
        }
        else {
            var_3_649 = and:int(var_3_649:int, ldc:int(-545579108))
            var_5_88 = and:int(ldc:int(-28454), ldc:int(26404))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5148), ldc:int(-13341)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_649:int, ldc:int(1581080567))
                    var_9_C5 = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_8F:int, and:int(ldc:int(4677), ldc:int(25601)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, and:int(ldc:int(19169), ldc:int(4099)))), var_7_9E:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_649 = and:int(var_3_D7:int, ldc:int(-568418419))
                    var_14_112 = var_7_9E:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), and:int(ldc:int(9611), ldc:int(18529)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_8F:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(614985754))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1975288258))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0542)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1134866443))
                    }
                    else {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-22536633))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0542)
                            }
                            
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0396:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-354028853))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1223222902))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(1541234639))
                            var_11_E8 = and:int(ldc:int(29477), ldc:int(-31526))
                            goto(Label_1494)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0542:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1255604025))
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1725581778))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1097786024))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1353558220))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-93342979))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0797)
                        }
                    }
                    
                    Label_0665:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1125810611))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1105235388))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-162170474))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1973833779))
                            goto(Label_0542)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-549644499))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0797:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1108045747))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1243072762))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-31934148))
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(170894407))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-541584804))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_E8 = xor:int(ldc:int(2690), ldc:int(2691))
                                goto(Label_1096)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1223644945))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-770463543))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(912251634))
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1048560910))
                            goto(Label_0542)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-921538959))
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1790862864))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-23571532))
                        var_11_E8 = and:int(ldc:int(11686), ldc:int(-11688))
                    }
                    
                    Label_1096:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-403927889))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0665)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(1524340717))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1333)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-29090372))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(369352208))
                            goto(Label_1096)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1279521581))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0797)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-339118164))
                            goto(Label_0665)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0542)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0396)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_649 = and:int(var_3_649:int, ldc:int(-1731625326))
                            loopcontinue()
                        }
                        
                        var_3_649 = and:int(var_3_649:int, ldc:int(-561308089))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_88:int, var_16_116:int)
                        goto(Label_1494)
                    }
                    
                    Label_1333:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1505)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1564367086))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(512)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(653476872))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1827798712))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-950698313))
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0665)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-257061176))
                        goto(Label_0542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-565301321))
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1598145712))
                        loopcontinue()
                    }
                    
                    var_3_649 = and:int(var_3_649:int, ldc:int(-29649267))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1494:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_654 = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1505:
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-285963051))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(730923583))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0797)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_649:int, ldc:int(2)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(-1974892340))
                        goto(Label_0665)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0542)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0396)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_649:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_649 = and:int(var_3_649:int, ldc:int(1530581646))
                        var_17_654 = add:int(var_16_116:int, xor:int(ldc:int(26752), ldc:int(26753)))
                        looporswitchbreak()
                    }
                }
                
                var_3_649 = and:int(var_3_649:int, ldc:int(-94453857))
                
                if (cmple:boolean(var_5_88 = var_17_654:int, sub:int(var_6_8F:int, xor:int(ldc:int(16416), ldc:int(16417))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_649:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
