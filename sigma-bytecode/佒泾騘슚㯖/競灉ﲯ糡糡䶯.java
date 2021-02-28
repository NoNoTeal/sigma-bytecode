public final class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf {
    public void \u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf(int p0) {
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
    
    public boolean equals(java.lang.Object p0) {
        var_2_C4 : int
        stack_DF_0 : int [generated]
        
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
        var_2_C4 = and:int(ldc:int(317489005), ldc:int(2128657501))
        
        if (cmpeq:boolean(this:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(2499), ldc:int(1)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_C4 = and:int(var_2_C4:int, ldc:int(-771973))
                
                if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                    if (cmpeq:boolean(invokevirtual:Class<? extends \u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf>(\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf::getClass, this:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                        if (cmpne:boolean(getfield:int(\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf::\uc31c\u9af2\u156b\ubff1\u71ae\uc3e3, this:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf), getfield:int(\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf::\uc31c\u9af2\u156b\ubff1\u71ae\uc3e3, checkcast:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf.class, p0:Object[expected:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf])))) {
                            var_2_C4 = and:int(var_2_C4:int, ldc:int(1391279565))
                            stack_DF_0 = and:int(ldc:int(17187), ldc:int(-22436))
                        }
                        else {
                            stack_DF_0 = xor:int(ldc:int(-31996), ldc:int(-31995))
                        }
                        
                        return:boolean(stack_DF_0:int)
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_C4:int, ldc:int(8)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(-14046), ldc:int(12505)))
            }
        }
    }
    
    public int hashCode() {
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
            return:int(invokestatic:int(Integer::hashCode, getfield:int(\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf::\uc31c\u9af2\u156b\ubff1\u71ae\uc3e3, this:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u760c\u3d64\ub18d\u416d\ucef1\u3d4b$1() {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, and:int(ldc:int(16250), ldc:int(5890)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uae87\ua3b4\u88c5\u8413\u7d52\u647c)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, xor:int(ldc:int(3108), ldc:int(6948)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ua068\u4cd9\u9255\u56bd\u62da\u67d0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6fb0\u3a62\ud4fe\u9255\u965f\ubcb0$0(int p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, xor:int(ldc:int(-28427), ldc:int(-30729)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u6c52\u416d\u385b\ud7e8\ufcaf\u9937)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u5654\u3e75\u92ff\u97e6\u8c8a\uf995)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\ube23\u624e\u6fb0\u4daf\u92ee, ldc:float(0.5f), ldc:float(0.5f), ldc:float(0.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, ldc:float(0.5f), ldc:float(0.5f), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u93a2\ube23\u624e\u6fb0\u4daf\u92ee, div:float(ldc:float(17.0f), i2f:float(p0:int)), mul:float(add:float(ldc:float(2.0f), div:float(i2f:float(p0:int), ldc:float(1.5f))), div:float(l2f:float(rem:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), ldc:long(800000L))), ldc:float(800000.0f))), ldc:float(0.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ub32d\u8bb0\u5bc4\u67d0\u8350\u3bd6, mul:float(add:float(mul:float(i2f:float(mul:int(p0:int, p0:int)), ldc:float(4321.0f)), mul:float(i2f:float(p0:int), ldc:float(9.0f))), ldc:float(2.0f)), ldc:float(0.0f), ldc:float(0.0f), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u4975\u836c\u7ce1\u36d3\ucb79, sub:float(ldc:float(4.5f), div:float(i2f:float(p0:int), ldc:float(4.0f))), sub:float(ldc:float(4.5f), div:float(i2f:float(p0:int), ldc:float(4.0f))), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ub1b9\u4492\u76bc\u64ab\u3504\u4ab3)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u64f2\u6c52\uc246\u76bc\ub1b9\ua6bd, xor:int(ldc:int(-29613), ldc:int(-25773)))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ud158\u56bd\uafe7\u7043\u965f\u8389)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_127 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_139_0 : byte[] [generated]
        stack_18F_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        var_4_114 : int
        var_3_119 : byte[]
        var_5_11A : int
        expr_13C : byte [generated]
        var_0_1E9 : int
        expr_1F3 : byte [generated]
        stack_221_2 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_17E : byte[]
        var_5_17F : int
        expr_B5 : int [generated]
        var_3_DA : String
        stack_10D_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
        var_0_127 = and:int(ldc:int(-1686965118), ldc:int(-1678512645))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("9/DDdwOJxXpA9nKi66roqXg=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_114 = expr_6B:int
        var_3_119 = newarray:byte[](byte.class, expr_6B:int)
        var_5_11A = expr_6B:int
        Label_0284:
        
        while (cmpeq:boolean(and:int(var_0_127:int, ldc:int(262144)), ldc:int(0))) {
            var_0_127 = and:int(var_0_127:int, ldc:int(-541362021))
            var_5_11A = add:int(var_5_11A:int, ldc:int(-1))
            expr_13C = xor:byte(loadelement:byte(stack_139_0:byte[], var_5_11A:int), ldc:byte(124))
            storeelement:byte(var_3_119:byte[], var_5_11A:int, add:int(or:int(and:int(shl:int(expr_13C:byte, xor:int(ldc:int(48), ldc:int(52))), ldc:int(-16)), and:int(shr:int(expr_13C:byte[expected:int], and:int(ldc:int(18437), ldc:int(132))), ldc:int(15))), ldc:int(72)))
            
            if (cmpne:boolean(var_5_11A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = var_3_119:byte[]
            goto(Label_0112)
        }
        
        var_0_127 = and:int(var_0_127:int, ldc:int(-2031230275))
        Label_0470:
        
        while (cmpeq:boolean(and:int(var_0_127:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1E9 = and:int(var_0_127:int, ldc:int(-549764793))
            var_5_11A = add:int(var_5_11A:int, ldc:int(-1))
            expr_1F3 = loadelement:byte(stack_1F3_0:byte[], var_5_11A:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_11A:int, ldc:int(5)), neg:int(var_4_114:int)), ldc:int(0))) {
                var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-1749138561))
                stack_221_2 = add:byte(expr_1F3:byte, ldc:byte(5))
            }
            else {
                stack_221_2 = add:byte(expr_1F3:byte, loadelement:byte(var_3_119:byte[], add:int(var_5_11A:int, ldc:int(5))))
            }
            
            var_0_127 = and:int(var_0_1E9:int, ldc:int(-1212481886))
            storeelement:byte(var_3_119:byte[], var_5_11A:int, stack_221_2:byte)
            
            if (cmpne:boolean(var_5_11A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = var_3_119:byte[]
            goto(Label_0186)
        }
        
        var_0_127 = and:int(var_0_127:int, ldc:int(-735656794))
        goto(Label_0284)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_127:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        if (cmpeq:boolean(and:int(var_0_127:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_127 = and:int(var_0_127:int, ldc:int(-2061092337))
        }
        else {
            var_0_127 = and:int(var_0_127:int, ldc:int(-549524333))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_17E = newarray:byte[](byte.class, expr_91:int)
                var_5_17F = expr_91:int
                
                loop {
                    var_0_127 = and:int(var_0_127:int, ldc:int(-1220883121))
                    var_5_17F = add:int(var_5_17F:int, ldc:int(-1))
                    storeelement:byte(var_3_17E:byte[], var_5_17F:int, add:int(shl:int(loadelement:byte(stack_18F_0:byte[], var_5_17F:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_17F:int, xor:int(ldc:int(-32512), ldc:int(-32511)))), ldc:int(2)), and:int(ldc:int(18687), ldc:int(12863)))))
                    
                    if (cmpne:boolean(var_5_17F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B3_0 = stack_B5_0 = stack_CE_0 = stack_139_0 = stack_18F_0 = stack_1F3_0 = var_3_17E:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpne:boolean(and:int(var_0_127:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_127:int, ldc:int(16384)), ldc:int(0))) {
                var_0_127 = and:int(var_0_127:int, ldc:int(1752255759))
                goto(Label_0112)
            }
            
            var_0_127 = and:int(var_0_127:int, ldc:int(-1284357821))
            expr_B5 = arraylength:int(stack_B5_0:byte[])
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_4_114 = expr_B5:int
                var_3_119 = newarray:byte[](byte.class, expr_B5:int)
                var_5_11A = expr_B5:int
                goto(Label_0470)
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_127:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0150)
        }
        
        if (cmpne:boolean(and:int(var_0_127:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_10D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-27904), ldc:int(-27903)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16915), ldc:int(4169)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(-7433), ldc:int(7432)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(-20142), ldc:int(19588)), and:int(ldc:int(4113), ldc:int(2394))))
            putstatic:String[](\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf::\u7c6b\u16f6\uc246\u4f52\u47c2\u5fe1, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_677 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_682 : int
        
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
        var_3_677 = and:int(ldc:int(-578576331), ldc:int(2108404661))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7af6\u7049\ufcaf\u7ce1\u7ce1\u4daf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
            var_3_677 = and:int(var_3_677:int, ldc:int(-734311246))
        }
        else {
            var_3_677 = and:int(var_3_677:int, ldc:int(1805840169))
            var_5_85 = and:int(ldc:int(-31061), ldc:int(24916))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17164), ldc:int(-17165)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_677:int, ldc:int(1506257655))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(18432), ldc:int(18433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(27329), ldc:int(21)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_677 = and:int(var_3_D2:int, ldc:int(-338429263))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(72), ldc:int(73)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-791031064))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(779606341))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1069437349))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1996251876))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(2140908451))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1097069717))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1908357315))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-484746623))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(2053027443))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-443095679))
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1491769071))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(1778040061))
                            var_11_E3 = and:int(ldc:int(27138), ldc:int(-32643))
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0580:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(199002100))
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-201478832))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-542398037))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0682:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-741664727))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1075990620))
                        goto(Label_1355)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1638503337))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1884197786))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(983863038))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-2073377128))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(1201731796))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-304944843))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0836:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(296149027))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-893543029))
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-537203999))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(10305), ldc:int(17841))
                                goto(Label_1098)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-309377719))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(288554178))
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-487120476))
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-2046618370))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(1571006305))
                        var_11_E3 = and:int(ldc:int(-23570), ldc:int(23569))
                    }
                    
                    Label_1098:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-640895795))
                        goto(Label_1518)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1573687052))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1720625473))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(873755635))
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1235313852))
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_677 = and:int(var_3_677:int, ldc:int(-38030927))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1355)
                            }
                        }
                    }
                    
                    Label_1229:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-87399498))
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1098)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(-1021640188))
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0682)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(221045053))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_677 = and:int(var_3_677:int, ldc:int(2043606125))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1507)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1355:
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1518)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1671723215))
                        goto(Label_1229)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(239111960))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1240492987))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-33746767))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1811582585))
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1083715338))
                        loopcontinue()
                    }
                    
                    var_3_677 = and:int(var_3_677:int, ldc:int(-2179357))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1507:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_682 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1518:
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-807679200))
                        goto(Label_1355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1229)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(616688209))
                        goto(Label_1098)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1196917327))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_677:int, ldc:int(1)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(-1759946569))
                        goto(Label_0682)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(512)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1819310731))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1891518356))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_677:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_677 = and:int(var_3_677:int, ldc:int(1872689761))
                        var_17_682 = add:int(var_16_111:int, and:int(ldc:int(9), ldc:int(19493)))
                        looporswitchbreak()
                    }
                    
                    var_3_677 = and:int(var_3_677:int, ldc:int(-50993122))
                }
                
                var_3_677 = and:int(var_3_677:int, ldc:int(-4999689))
                
                if (cmple:boolean(var_5_85 = var_17_682:int, sub:int(var_6_8C:int, and:int(ldc:int(197), ldc:int(16905))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_677:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
