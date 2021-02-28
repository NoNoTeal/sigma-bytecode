public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5d20\u7049\u61a4\uc2bd\u74b1 {
    public void \u5d20\u7049\u61a4\uc2bd\u74b1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p0) {
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
    
    public void \u9033\u156b\u1187\u7c6b\u61a4\ua6bd(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u69d9\u3776\u3dd3\u6198\u93a2\u0800, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u5d20\u7049\u61a4\uc2bd\u74b1::\u0c95\uae87\u47c2\u7043\uff55, this:\u5d20\u7049\u61a4\uc2bd\u74b1), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, getfield:int(\u5d20\u7049\u61a4\uc2bd\u74b1::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, this:\u5d20\u7049\u61a4\uc2bd\u74b1), getfield:int(\u5d20\u7049\u61a4\uc2bd\u74b1::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, this:\u5d20\u7049\u61a4\uc2bd\u74b1), invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u99f7\u12cb\u0800\u4bc8\u52d3\u8cae, this:\u5d20\u7049\u61a4\uc2bd\u74b1[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u494c\ud12e\u4c2b\u7bad\ud523\ubcb0$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_2_5F : int
        stack_8D_0 : \u3d4b\u9af2\u71f1\u67d0\u99f7 [generated]
        stack_8D_1 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(42546076), ldc:int(1605089276))
            stack_8D_0 = getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u5d20\u7049\u61a4\uc2bd\u74b1::\u0c95\uae87\u47c2\u7043\uff55, this:\u5d20\u7049\u61a4\uc2bd\u74b1)
            
            if (invokestatic:boolean(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u3c25\u61a4\u4bc8\u4f4a\u0c95\u67d0, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u5d20\u7049\u61a4\uc2bd\u74b1::\u0c95\uae87\u47c2\u7043\uff55, this:\u5d20\u7049\u61a4\uc2bd\u74b1))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1077053516))
                stack_8D_1 = and:int[expected:boolean](ldc:int(2800), ldc:int(-28402))
            }
            else {
                stack_8D_1 = and:int[expected:boolean](ldc:int(45), ldc:int(10257))
            }
            
            invokestatic:boolean(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u4daf\ubcb0\u3e75\u759a\u5654\u4f4a, stack_8D_0:\u3d4b\u9af2\u71f1\u67d0\u99f7, stack_8D_1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_1CB_0 : byte[] [generated]
        stack_228_0 : byte[] [generated]
        stack_298_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_15E : byte[]
        var_4_15F : int
        expr_98 : int [generated]
        var_5_1AE : int
        var_3_1B3 : byte[]
        var_4_1B4 : int
        expr_1CB : byte [generated]
        var_0_21E : int
        expr_228 : byte [generated]
        stack_264_2 : byte [generated]
        stack_243_0 : byte [generated]
        expr_BB : int [generated]
        expr_E6 : int [generated]
        var_3_287 : byte[]
        var_4_288 : int
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(-1527992686), ldc:int(1653060919))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_298_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DtGbo2+jqZO/k6xxoantlalrnQUMAA=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_15E = newarray:byte[](byte.class, expr_6D:int)
                var_4_15F = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(600100735))
                    var_4_15F = add:int(var_4_15F:int, ldc:int(-1))
                    storeelement:byte(var_3_15E:byte[], var_4_15F:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_15F:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_15F:int, xor:int(ldc:int(7169), ldc:int(7168)))), ldc:int(4)), xor:int(ldc:int(650), ldc:int(645)))))
                    
                    if (cmpne:boolean(var_4_15F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_298_0 = var_3_15E:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-971361549))
                    goto(Label_0157)
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(531316722))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1AE = expr_98:int
                var_3_1B3 = newarray:byte[](byte.class, expr_98:int)
                var_4_1B4 = expr_98:int
                Label_0438:
                
                while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1881205545))
                    var_4_1B4 = add:int(var_4_1B4:int, ldc:int(-1))
                    expr_1CB = loadelement:byte(stack_1CB_0:byte[], var_4_1B4:int)
                    storeelement:byte(var_3_1B3:byte[], var_4_1B4:int, add:int(or:int(and:int(shl:int(expr_1CB:byte, and:int(ldc:int(2076), ldc:int(1669))), ldc:int(-16)), and:int(shr:int(expr_1CB:byte[expected:int], xor:int(ldc:int(12302), ldc:int(12298))), ldc:int(15))), ldc:int(95)))
                    
                    if (cmpne:boolean(var_4_1B4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_298_0 = var_3_1B3:byte[]
                    goto(Label_0157)
                }
                
                Label_0531:
                
                while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_0_21E = and:int(var_0_5F:int, ldc:int(-607820577))
                    var_4_1B4 = add:int(var_4_1B4:int, ldc:int(-1))
                    expr_228 = stack_264_2 = loadelement(stack_228_0, var_4_1B4)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1B4:int, ldc:int(3)), neg:int(var_5_1AE:int)), ldc:int(0))) {
                        stack_264_2 = stack_243_0 = add:byte(expr_228:byte, loadelement:byte(var_3_1B3:byte[], add:int(var_4_1B4:int, ldc:int(3))))
                        goto(Label_0595)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_0_21E:int, ldc:int(4)), ldc:int(0))) {
                        var_0_21E = and:int(var_0_21E:int, ldc:int(261363646))
                        stack_264_2 = stack_243_0 = add:byte(expr_228:byte, ldc:byte(3))
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_0_21E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    var_0_5F = and:int(var_0_21E:int, ldc:int(-402709134))
                    storeelement:byte(var_3_1B3:byte[], var_4_1B4:int, stack_264_2:byte)
                    
                    if (cmpne:boolean(var_4_1B4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_298_0 = var_3_1B3:byte[]
                    goto(Label_0192)
                }
                
                goto(Label_0438)
                Label_0157:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(503308211))
                    expr_BB = arraylength:int(stack_BB_0:byte[])
                    
                    if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                        var_5_1AE = expr_BB:int
                        var_3_1B3 = newarray:byte[](byte.class, expr_BB:int)
                        var_4_1B4 = expr_BB:int
                        goto(Label_0531)
                    }
                }
                
                Label_0192:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(-362987031))
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1641680631))
                    expr_E6 = arraylength:int(stack_E6_0:byte[])
                    
                    if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                        var_3_287 = newarray:byte[](byte.class, expr_E6:int)
                        var_4_288 = expr_E6:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-1045594409))
                            var_4_288 = add:int(var_4_288:int, ldc:int(-1))
                            storeelement:byte(var_3_287:byte[], var_4_288:int, xor:byte(loadelement:byte(stack_298_0:byte[], var_4_288:int), ldc:byte(1)))
                            
                            if (cmpne:boolean(var_4_288:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_1CB_0 = stack_228_0 = stack_298_0 = var_3_287:byte[]
                    }
                }
                
                Label_0235:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1967566340))
                    goto(Label_0192)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(248990911))
                    goto(Label_0157)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4096)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_155_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-13312), ldc:int(-13311)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(23585), ldc:int(8517)))
            storeelement:String(expr_134:String[], and:int(ldc:int(-6461), ldc:int(2364)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(28784), ldc:int(-29041)), and:int(ldc:int(1879), ldc:int(6173))))
            putstatic:String[](\u5d20\u7049\u61a4\uc2bd\u74b1::\uc7fe\u927d\u2dcc\ubb2b\u5db4, expr_134:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_640 : int
        
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
        var_3_635 = and:int(ldc:int(-1505785164), ldc:int(-521197315))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5d20\u7049\u61a4\uc2bd\u74b1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(1869526086))
        }
        else {
            var_3_635 = and:int(var_3_635:int, ldc:int(-1440748114))
            var_5_85 = and:int(ldc:int(-744), ldc:int(741))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18453), ldc:int(-30870)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_635:int, ldc:int(-510666059))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(131), ldc:int(3449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1088), ldc:int(1089)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_DA:int, ldc:int(-291546395))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4721), ldc:int(24707)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(136459328))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1989998454))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1719137074))
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-802137112))
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2057230498))
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1302576211))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1789554579))
                    }
                    else {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1404053273))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0803)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-30759865))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1692753158))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-211845148))
                            var_11_EB = and:int(ldc:int(-9501), ldc:int(9244))
                            goto(Label_1462)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1759611420))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(667353042))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1847017909))
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-653374655))
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(239450281))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-427828499))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0803)
                        }
                    }
                    
                    Label_0679:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(660420501))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(352841160))
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1607022156))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1053456851))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1249902913))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0803:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1233179468))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(65), ldc:int(20751))
                                goto(Label_1044)
                            }
                        }
                    }
                    
                    Label_0883:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2072881987))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-603134599))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-766389481))
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1866771261))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(257366230))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-229688082))
                        var_11_EB = and:int(ldc:int(-16111), ldc:int(12008))
                    }
                    
                    Label_1044:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(197307009))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(953321816))
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(773930112))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(2029855381))
                            goto(Label_0883)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0803)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1760130927))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-363856131))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1307)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(40033918))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1347183626))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1044)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0883)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1053131103))
                            goto(Label_0803)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(2030379966))
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-328005614))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-247518217))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1462)
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2071366453))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1230353128))
                        goto(Label_1044)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1255184620))
                        goto(Label_0883)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1001072026))
                        goto(Label_0803)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(32)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1496915906))
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(385677750))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(615847562))
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(-324014857))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1462:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1473:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1988657024))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1044)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(145270223))
                        goto(Label_0883)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2120596731))
                        goto(Label_0803)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1292953060))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(110078822))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-217105435))
                        var_17_640 = add:int(var_16_119:int, xor:int(ldc:int(-32512), ldc:int(-32511)))
                        looporswitchbreak()
                    }
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(-1546670618))
                
                if (cmple:boolean(var_5_85 = var_17_640:int, sub:int(var_6_8C:int, xor:int(ldc:int(2316), ldc:int(2317))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(-822093379))
            goto(Label_0106)
        }
    }
}
