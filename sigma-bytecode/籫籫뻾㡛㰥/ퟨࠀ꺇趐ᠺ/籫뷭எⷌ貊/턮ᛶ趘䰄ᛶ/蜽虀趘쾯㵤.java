public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u873d\u8640\u8d98\ucfaf\u3d64 {
    public void \u873d\u8640\u8d98\ucfaf\u3d64(\ub113\ufcaf\u3c25\u071d\u97b7.\u8cae\u71ae\u2dcc\u5db4\u4f52 p0, java.lang.String p1) {
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
            putfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u873d\u8640\u8d98\ucfaf\u3d64::\u3a62\u3bd6\u3a62\ud4fe\u4e72\u3d4b, this:\u873d\u8640\u8d98\ucfaf\u3d64, p0:\u8cae\u71ae\u2dcc\u5db4\u4f52)
            invokespecial:Thread(Thread::<init>, this:\u873d\u8640\u8d98\ucfaf\u3d64, p1:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
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
    
    private void lambda$\u67e9\u965f\u3d64\u5140\u5db4\u4f52$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8cae\uc4d2\ub18d\u647c\u718f p3) {
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
            invokestatic:\u8cae\uc4d2\ub18d\u647c\u718f(\u8cae\u71ae\u2dcc\u5db4\u4f52::\ucb79\u12b2\uc84e\u965f\u927d\ufe34, getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u873d\u8640\u8d98\ucfaf\u3d64::\u3a62\u3bd6\u3a62\ud4fe\u4e72\u3d4b, this:\u873d\u8640\u8d98\ucfaf\u3d64), p0:\u8cae\uc4d2\ub18d\u647c\u718f)
            invokestatic:\u8cae\uc4d2\ub18d\u647c\u718f(\u8cae\u71ae\u2dcc\u5db4\u4f52::\uafe7\u7ce1\u385b\u3bc9\u416d\ubb2b, getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u873d\u8640\u8d98\ucfaf\u3d64::\u3a62\u3bd6\u3a62\ud4fe\u4e72\u3d4b, this:\u873d\u8640\u8d98\ucfaf\u3d64), p1:\u8cae\uc4d2\ub18d\u647c\u718f)
            invokestatic:\u8cae\uc4d2\ub18d\u647c\u718f(\u8cae\u71ae\u2dcc\u5db4\u4f52::\ubded\u385b\u3e75\u983f\u3e2a\uc3e3, getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u873d\u8640\u8d98\ucfaf\u3d64::\u3a62\u3bd6\u3a62\ud4fe\u4e72\u3d4b, this:\u873d\u8640\u8d98\ucfaf\u3d64), p2:\u8cae\uc4d2\ub18d\u647c\u718f)
            invokestatic:\u8cae\uc4d2\ub18d\u647c\u718f(\u8cae\u71ae\u2dcc\u5db4\u4f52::\u5d20\u34df\u8d90\u3e75\ud158\uc29a, getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u873d\u8640\u8d98\ucfaf\u3d64::\u3a62\u3bd6\u3a62\ud4fe\u4e72\u3d4b, this:\u873d\u8640\u8d98\ucfaf\u3d64), p3:\u8cae\uc4d2\ub18d\u647c\u718f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_218 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1C6_0 : byte[] [generated]
        stack_22A_0 : byte[] [generated]
        stack_2A2_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        var_0_242 : int
        expr_22A : byte [generated]
        stack_26E_2 : byte [generated]
        stack_245_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_1B5 : byte[]
        var_5_1B6 : int
        expr_C3 : int [generated]
        expr_F6 : int [generated]
        var_3_291 : byte[]
        var_5_292 : int
        expr_2A2 : byte [generated]
        var_3_132 : String
        stack_165_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_218 = and:int(ldc:int(-1055301036), ldc:int(1437986935))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1C6_0 = stack_22A_0 = stack_2A2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("LVspHi3xdy4iaXosG+uCZxR5Lxd8KSXyGXHzgm8oLyXtKGUrLhzk6A==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpne:boolean(and:int(var_0_218:int, ldc:int(4)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(-1814959499))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            storeelement:byte(var_3_171:byte[], var_5_172:int, xor:byte(add:byte(loadelement:byte(stack_189_0:byte[], var_5_172:int), ldc:byte(44)), ldc:byte(84)))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1C6_0 = stack_22A_0 = stack_2A2_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        Label_0525:
        
        while (cmpeq:boolean(and:int(var_0_218:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_242 = and:int(var_0_218:int, ldc:int(1228767101))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_22A = stack_26E_2 = loadelement(stack_22A_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(2)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_26E_2 = stack_245_0 = add:byte(expr_22A:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(2))))
                goto(Label_0597)
            }
            
            Label_0567:
            
            if (cmpeq:boolean(and:int(var_0_242:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_242 = and:int(var_0_242:int, ldc:int(1933568989))
                stack_26E_2 = stack_245_0 = add:byte(expr_22A:byte, ldc:byte(2))
            }
            
            Label_0597:
            
            if (cmpne:boolean(and:int(var_0_242:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_242 = and:int(var_0_242:int, ldc:int(-1259233324))
                goto(Label_0567)
            }
            
            var_0_218 = and:int(var_0_242:int, ldc:int(1696458716))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_26E_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1C6_0 = stack_22A_0 = stack_2A2_0 = var_3_171:byte[]
            goto(Label_0200)
        }
        
        var_0_218 = and:int(var_0_218:int, ldc:int(2132583889))
        goto(Label_0372)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(64)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(279480381))
        }
        else {
            var_0_218 = and:int(var_0_218:int, ldc:int(-1443140226))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_1B5 = newarray:byte[](byte.class, expr_98:int)
                var_5_1B6 = expr_98:int
                
                loop {
                    var_0_218 = and:int(var_0_218:int, ldc:int(-1686277385))
                    var_5_1B6 = add:int(var_5_1B6:int, ldc:int(-1))
                    storeelement:byte(var_3_1B5:byte[], var_5_1B6:int, add:int(shl:int(loadelement:byte(stack_1C6_0:byte[], var_5_1B6:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_1B6:int, and:int(ldc:int(12825), ldc:int(16449)))), ldc:int(4)), and:int(ldc:int(143), ldc:int(17743)))))
                    
                    if (cmpne:boolean(var_5_1B6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1C6_0 = stack_22A_0 = stack_2A2_0 = var_3_1B5:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_218:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(16384)), ldc:int(0))) {
                var_0_218 = and:int(var_0_218:int, ldc:int(-1242572264))
                goto(Label_0112)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(-1147149227))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_16C = expr_C3:int
                var_3_171 = newarray:byte[](byte.class, expr_C3:int)
                var_5_172 = expr_C3:int
                goto(Label_0525)
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(4)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(-788155636))
        }
        else {
            if (cmpne:boolean(and:int(var_0_218:int, ldc:int(131072)), ldc:int(0))) {
                var_0_218 = and:int(var_0_218:int, ldc:int(754365392))
                goto(Label_0157)
            }
            
            if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_218 = and:int(var_0_218:int, ldc:int(423486422))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_291 = newarray:byte[](byte.class, expr_F6:int)
                var_5_292 = expr_F6:int
                
                loop {
                    var_0_218 = and:int(var_0_218:int, ldc:int(-208439172))
                    var_5_292 = add:int(var_5_292:int, ldc:int(-1))
                    expr_2A2 = loadelement:byte(stack_2A2_0:byte[], var_5_292:int)
                    storeelement:byte(var_3_291:byte[], var_5_292:int, or:int(and:int(shl:int(expr_2A2:byte, xor:int(ldc:int(-20462), ldc:int(-20458))), ldc:int(-16)), and:int(shr:int(expr_2A2:byte[expected:int], and:int(ldc:int(26628), ldc:int(1174))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_292:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1C6_0 = stack_22A_0 = stack_2A2_0 = var_3_291:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(4)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(-2144326835))
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_218:int, ldc:int(8192)), ldc:int(0))) {
            var_0_218 = and:int(var_0_218:int, ldc:int(2090383857))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_165_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(68), ldc:int(69)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18633), ldc:int(7)))
        storeelement:String(expr_144:String[], and:int(ldc:int(10543), ldc:int(-11056)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(3241), ldc:int(-3242)), xor:int(ldc:int(8372), ldc:int(8339))))
        putstatic:String[](\u873d\u8640\u8d98\ucfaf\u3d64::\ucfaf\uf995\ub70c\u5bc4\u93a2\u4bc8, expr_144:String[])
    }
    
    public void \u8c8a\ud4fe\u9a18\uc3e3\u7006\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AF : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_6BA : int
        
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
        var_3_6AF = and:int(ldc:int(1030514465), ldc:int(805105579))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u873d\u8640\u8d98\ucfaf\u3d64[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(469392520))
        }
        else {
            var_3_6AF = and:int(var_3_6AF:int, ldc:int(2095999911))
            var_5_85 = and:int(ldc:int(-16179), ldc:int(12066))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3157), ldc:int(3156)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_6AF:int, ldc:int(-1343264901))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1201), ldc:int(77)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(4608), ldc:int(4609)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_6AF = and:int(var_3_D2:int, ldc:int(-17924191))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-31744), ldc:int(-31743)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-842477892))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1689884556))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-800788138))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(90276042))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-209684813))
                    }
                    else {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1014987567))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0590)
                            }
                            
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(912861284))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1320365120))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1749758042))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(58834884))
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1829292962))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-224983500))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1837098919))
                            var_11_E3 = and:int(ldc:int(2206), ldc:int(-2207))
                            goto(Label_1590)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0590:
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(698673586))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1468655434))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1354416370))
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1769976346))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-503409530))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(745371631))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-937036796))
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1810434518))
                        goto(Label_1448)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1344154438))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-842920139))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(436179122))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-242535659))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1918060790))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1088707))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0878:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-891817080))
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1281629634))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-380472051))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1079802910))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1254369620))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-129084416))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(2139089907))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(-31708), ldc:int(-31707))
                                goto(Label_1176)
                            }
                        }
                    }
                    
                    Label_1017:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2094698828))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-610866484))
                            goto(Label_0878)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1970857869))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1655352226))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-51511327))
                        var_11_E3 = and:int(ldc:int(13329), ldc:int(-13330))
                    }
                    
                    Label_1176:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(530542695))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1017)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2095471383))
                            goto(Label_0878)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-916900685))
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1032881342))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1091640521))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1448)
                            }
                        }
                    }
                    
                    Label_1297:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(626709309))
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-2020603577))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1176)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(2007339397))
                            goto(Label_1017)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(-383233901))
                            goto(Label_0878)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(1374462241))
                            goto(Label_0590)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6AF = and:int(var_3_6AF:int, ldc:int(903191731))
                            loopcontinue()
                        }
                        
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-303242319))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1590)
                    }
                    
                    Label_1448:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1382250320))
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-679397442))
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1687789113))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-1525204085))
                        goto(Label_0590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-403479546))
                        loopcontinue()
                    }
                    
                    var_3_6AF = and:int(var_3_6AF:int, ldc:int(1047360315))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1590:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BA = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1601:
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1234095297))
                        goto(Label_1448)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(1644975040))
                        goto(Label_1017)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(37529804))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(288534993))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6AF = and:int(var_3_6AF:int, ldc:int(-34641119))
                        var_17_6BA = add:int(var_16_111:int, xor:int(ldc:int(7680), ldc:int(7681)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6AF = and:int(var_3_6AF:int, ldc:int(1073674095))
                
                if (cmple:boolean(var_5_85 = var_17_6BA:int, sub:int(var_6_8C:int, and:int(ldc:int(2129), ldc:int(649))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_6AF:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
