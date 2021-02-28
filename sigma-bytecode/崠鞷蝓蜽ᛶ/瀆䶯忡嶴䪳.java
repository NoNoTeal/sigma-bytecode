public class \u5d20\u97b7\u8753\u873d\u16f6.\u7006\u4daf\u5fe1\u5db4\u4ab3 {
    public void \u7006\u4daf\u5fe1\u5db4\u4ab3(\u59ec\u8413\u97e6\uc229\u3776.\uc84e\u3dd3\u98a4\u52d3\u4daf p0, java.lang.String p1) {
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
            putfield:\uc84e\u3dd3\u98a4\u52d3\u4daf(\u7006\u4daf\u5fe1\u5db4\u4ab3::\uc2bd\uc4d2\ua3b4\ubf56\u8cae\u839e, this:\u7006\u4daf\u5fe1\u5db4\u4ab3, p0:\uc84e\u3dd3\u98a4\u52d3\u4daf)
            invokespecial:Thread(Thread::<init>, this:\u7006\u4daf\u5fe1\u5db4\u4ab3, p1:String)
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
    
    private void lambda$\uc238\ub83f\uc229\u93a2\ub19c\u7e3f$1(java.util.List p0) {
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
            invokevirtual:void(\u873d\u6d99\u983f\u6198\u8d90\u416d<\u839e\u97e6\u4d85\u392e\ubff1>::\u6435\u6c56\ud171\u4f4a\u392e\u3d4b, invokestatic:\u0a06\u8df4\ua068\u62da\u69d9[expected:\u873d\u6d99\u983f\u6198\u8d90\u416d<\u839e\u97e6\u4d85\u392e\ubff1>](\uc84e\u3dd3\u98a4\u52d3\u4daf::\u983f\u3bd6\u647c\ub171\u4f4a\ub19c, getfield:\uc84e\u3dd3\u98a4\u52d3\u4daf(\u7006\u4daf\u5fe1\u5db4\u4ab3::\uc2bd\uc4d2\ua3b4\ubf56\u8cae\u839e, this:\u7006\u4daf\u5fe1\u5db4\u4ab3)), p0:List<\u839e\u97e6\u4d85\u392e\ubff1>[expected:Collection<\u839e\u97e6\u4d85\u392e\ubff1>])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u839e\u97e6\u4d85\u392e\ubff1 lambda$\uc31c\u6bb9\ub83f\ud7e8\uafe7\u51b2$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua068\ua562\u64f2\u5db4\u494c p0) {
        expr_65 : \uc84e\u3dd3\u98a4\u52d3\u4daf [generated]
        
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
            expr_65 = getfield:\uc84e\u3dd3\u98a4\u52d3\u4daf(\u7006\u4daf\u5fe1\u5db4\u4ab3::\uc2bd\uc4d2\ua3b4\ubf56\u8cae\u839e, this:\u7006\u4daf\u5fe1\u5db4\u4ab3)
            invokevirtual:Class<? extends \uc84e\u3dd3\u98a4\u52d3\u4daf>(\uc84e\u3dd3\u98a4\u52d3\u4daf::getClass, expr_65:\uc84e\u3dd3\u98a4\u52d3\u4daf)
            return:\u839e\u97e6\u4d85\u392e\ubff1(initobject:\u839e\u97e6\u4d85\u392e\ubff1(\u839e\u97e6\u4d85\u392e\ubff1::<init>, expr_65:\uc84e\u3dd3\u98a4\u52d3\u4daf, p0:\ua068\ua562\u64f2\u5db4\u494c))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_226 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1D3_0 : byte[] [generated]
        stack_238_0 : byte[] [generated]
        stack_2B3_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_166 : byte[]
        var_4_167 : int
        expr_98 : int [generated]
        var_5_1B6 : int
        var_3_1BB : byte[]
        var_4_1BC : int
        expr_1D3 : byte [generated]
        var_0_250 : int
        expr_238 : byte [generated]
        stack_27E_2 : byte [generated]
        stack_253_0 : byte [generated]
        expr_CB : int [generated]
        expr_F6 : int [generated]
        var_3_2A1 : byte[]
        var_4_2A2 : int
        var_3_12A : String
        stack_15D_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
            var_0_226 = and:int(ldc:int(109134335), ldc:int(1285347454))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1D3_0 = stack_238_0 = stack_2B3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("NlCwoo961VDlz0LYuN2I3wA/ODCgAA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_166 = newarray:byte[](byte.class, expr_6D:int)
                var_4_167 = expr_6D:int
                
                loop {
                    var_0_226 = and:int(var_0_226:int, ldc:int(-1795668995))
                    var_4_167 = add:int(var_4_167:int, ldc:int(-1))
                    storeelement:byte(var_3_166:byte[], var_4_167:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_167:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_167:int, xor:int(ldc:int(33), ldc:int(32)))), ldc:int(7)), and:int(ldc:int(4225), ldc:int(16395)))))
                    
                    if (cmpne:boolean(var_4_167:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1D3_0 = stack_238_0 = stack_2B3_0 = var_3_166:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_226 = and:int(var_0_226:int, ldc:int(-1991353065))
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_226:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_226 = and:int(var_0_226:int, ldc:int(-392634499))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1B6 = expr_98:int
                var_3_1BB = newarray:byte[](byte.class, expr_98:int)
                var_4_1BC = expr_98:int
                Label_0446:
                
                while (cmpne:boolean(and:int(var_0_226:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_226 = and:int(var_0_226:int, ldc:int(1787755480))
                    var_4_1BC = add:int(var_4_1BC:int, ldc:int(-1))
                    expr_1D3 = loadelement:byte(stack_1D3_0:byte[], var_4_1BC:int)
                    storeelement:byte(var_3_1BB:byte[], var_4_1BC:int, xor:int(or:int(and:int(shl:int(expr_1D3:byte, and:int(ldc:int(6), ldc:int(3109))), ldc:int(-16)), and:int(shr:int(expr_1D3:byte[expected:int], xor:int(ldc:int(4117), ldc:int(4113))), ldc:int(15))), ldc:int(17)))
                    
                    if (cmpne:boolean(var_4_1BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1D3_0 = stack_238_0 = stack_2B3_0 = var_3_1BB:byte[]
                    goto(Label_0157)
                }
                
                Label_0539:
                
                while (cmpeq:boolean(and:int(var_0_226:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_250 = and:int(var_0_226:int, ldc:int(-1464672260))
                    var_4_1BC = add:int(var_4_1BC:int, ldc:int(-1))
                    expr_238 = stack_27E_2 = loadelement(stack_238_0, var_4_1BC)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1BC:int, ldc:int(3)), neg:int(var_5_1B6:int)), ldc:int(0))) {
                        stack_27E_2 = stack_253_0 = add:byte(expr_238:byte, loadelement:byte(var_3_1BB:byte[], add:int(var_4_1BC:int, ldc:int(3))))
                        goto(Label_0611)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_0_250:int, ldc:int(64)), ldc:int(0))) {
                        var_0_250 = and:int(var_0_250:int, ldc:int(663081305))
                        stack_27E_2 = stack_253_0 = add:byte(expr_238:byte, ldc:byte(3))
                    }
                    
                    Label_0611:
                    
                    if (cmpeq:boolean(and:int(var_0_250:int, ldc:int(64)), ldc:int(0))) {
                        var_0_250 = and:int(var_0_250:int, ldc:int(-1087431373))
                        goto(Label_0581)
                    }
                    
                    var_0_226 = and:int(var_0_250:int, ldc:int(-997177634))
                    storeelement:byte(var_3_1BB:byte[], var_4_1BC:int, stack_27E_2:byte)
                    
                    if (cmpne:boolean(var_4_1BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1D3_0 = stack_238_0 = stack_2B3_0 = var_3_1BB:byte[]
                    goto(Label_0208)
                }
                
                var_0_226 = and:int(var_0_226:int, ldc:int(1860966790))
                goto(Label_0446)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_226:int, ldc:int(512)), ldc:int(0))) {
                    var_0_226 = and:int(var_0_226:int, ldc:int(1041546990))
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_226:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(8)), ldc:int(0))) {
                        var_0_226 = and:int(var_0_226:int, ldc:int(2145720538))
                        loopcontinue()
                    }
                    
                    var_0_226 = and:int(var_0_226:int, ldc:int(1876583897))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_1B6 = expr_CB:int
                        var_3_1BB = newarray:byte[](byte.class, expr_CB:int)
                        var_4_1BC = expr_CB:int
                        goto(Label_0539)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_0_226:int, ldc:int(512)), ldc:int(0))) {
                    var_0_226 = and:int(var_0_226:int, ldc:int(-1991600426))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_226:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_226:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_226 = and:int(var_0_226:int, ldc:int(-460851873))
                    expr_F6 = arraylength:int(stack_F6_0:byte[])
                    
                    if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                        var_3_2A1 = newarray:byte[](byte.class, expr_F6:int)
                        var_4_2A2 = expr_F6:int
                        
                        loop {
                            var_0_226 = and:int(var_0_226:int, ldc:int(1122425592))
                            var_4_2A2 = add:int(var_4_2A2:int, ldc:int(-1))
                            storeelement:byte(var_3_2A1:byte[], var_4_2A2:int, add:byte(loadelement:byte(stack_2B3_0:byte[], var_4_2A2:int), ldc:byte(91)))
                            
                            if (cmpne:boolean(var_4_2A2:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_11E_0 = stack_1D3_0 = stack_238_0 = stack_2B3_0 = var_3_2A1:byte[]
                    }
                }
                
                Label_0251:
                
                if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(8)), ldc:int(0))) {
                    var_0_226 = and:int(var_0_226:int, ldc:int(2083837596))
                    goto(Label_0208)
                }
                
                if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_226:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_15D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(177), ldc:int(176)))
            expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5763), ldc:int(361)))
            storeelement:String(expr_13C:String[], and:int(ldc:int(-15380), ldc:int(15363)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(29769), ldc:int(-29770)), and:int(ldc:int(277), ldc:int(16535))))
            putstatic:String[](\u7006\u4daf\u5fe1\u5db4\u4ab3::\u7006\ube23\ucef1\u61a4\u600f\u4bc8, expr_13C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubded\ub32d\u416d\ud12e\ub6ab\uc84e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69B : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6A6 : int
        
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
        var_3_69B = and:int(ldc:int(-1789399020), ldc:int(-1731758314))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7006\u4daf\u5fe1\u5db4\u4ab3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_69B = and:int(var_3_69B:int, ldc:int(-641469028))
            var_5_81 = and:int(ldc:int(-3492), ldc:int(3363))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9600), ldc:int(-9601)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_69B:int, ldc:int(-614501480))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(5659), ldc:int(2049)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(144), ldc:int(145)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_69B = and:int(var_3_D1:int, ldc:int(-1219004422))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8292), ldc:int(8293)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(324311878))
                        goto(Label_1565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(508267938))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(623525838))
                    }
                    else {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1740111917))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0551)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-2017412254))
                        goto(Label_1247)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-690608500))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1150842348))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-856141403))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1814826854))
                        var_11_E2 = and:int(ldc:int(-16113), ldc:int(11504))
                        goto(Label_1554)
                    }
                    
                    Label_0551:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1255762642))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-651248707))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-522590270))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-938716104))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1074269031))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-581796348))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1230187417))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1818861570))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-22888668))
                            goto(Label_0551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-898138043))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-630457286))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-231972505))
                        goto(Label_1565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(818904249))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1434610764))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1503278501))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1754532943))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4609), ldc:int(1053))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1467692952))
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(2080183395))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1061659914))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1825397795))
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1138829450))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-2120273721))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1261208520))
                        var_11_E2 = and:int(ldc:int(-1481), ldc:int(1480))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(43972852))
                        goto(Label_1565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-820605834))
                        goto(Label_1395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1227262023))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(976840521))
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(22226642))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1577624787))
                            goto(Label_0551)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(-388394573))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-78645186))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1395)
                            }
                        }
                    }
                    
                    Label_1247:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1770049890))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1594873186))
                            goto(Label_1100)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0926)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(760205668))
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(1991169784))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0551)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(933545209))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_69B = and:int(var_3_69B:int, ldc:int(48339893))
                            loopcontinue()
                        }
                        
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1227358953))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1554)
                    }
                    
                    Label_1395:
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1943687700))
                        goto(Label_1565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1147743834))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1013820438))
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1589584514))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(476873205))
                        goto(Label_0551)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-1276512333))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-760748810))
                        loopcontinue()
                    }
                    
                    var_3_69B = and:int(var_3_69B:int, ldc:int(-1168903329))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1554:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A6 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1565:
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1396968557))
                        goto(Label_1395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1930564222))
                        goto(Label_1247)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-362264130))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1472043621))
                        goto(Label_0551)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(1191512248))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69B = and:int(var_3_69B:int, ldc:int(-146017379))
                        var_17_6A6 = add:int(var_16_110:int, and:int(ldc:int(8579), ldc:int(18537)))
                        looporswitchbreak()
                    }
                    
                    var_3_69B = and:int(var_3_69B:int, ldc:int(1068655158))
                }
                
                var_3_69B = and:int(var_3_69B:int, ldc:int(-629935298))
                
                if (cmple:boolean(var_5_81 = var_17_6A6:int, sub:int(var_6_88:int, xor:int(ldc:int(-32767), ldc:int(-32768))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69B:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
