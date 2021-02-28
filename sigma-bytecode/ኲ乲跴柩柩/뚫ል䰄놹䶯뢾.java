public class \u12b2\u4e72\u8df4\u67e9\u67e9.\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be {
    private void \ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be(java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0) {
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
            invokespecial:Object(Object::<init>, this:\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be)
            putfield:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be::\uc2bd\u6c56\uc4d2\u6c56\uc246\u61a4, this:\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be, p0:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \ucb79\u494c\uc3e3\u92ff\u71f1\u3bc9() {
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
            return:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(getfield:List<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be::\uc2bd\u6c56\uc4d2\u6c56\uc246\u61a4, this:\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be))
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u4e72\u8df4\u67e9\u67e9.\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be \ubf56\u92ee\u960f\u6b0d\u3a62\ud4fe(com.google.gson.JsonObject p0) {
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
    
    private static java.lang.String lambda$\u12cb\u8308\u4ab3\u4ab3\u6d69\u6cfe$0(com.google.gson.JsonElement p0) {
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
            return:String(invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, p0:JsonElement, loadelement:String(getstatic:String[](\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be::\ub19c\u4c04\uc9f6\u3776\u0800\u3dd3), and:int(ldc:int(16965), ldc:int(8337)))))
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
        stack_252_0 : byte[] [generated]
        stack_2CA_0 : byte[] [generated]
        var_4_197 : int
        var_3_19C : byte[]
        var_5_19D : int
        var_0_26A : int
        expr_252 : byte [generated]
        stack_296_2 : byte [generated]
        stack_26D_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1E5 : byte[]
        var_5_1E6 : int
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_2B9 : byte[]
        var_5_2BA : int
        expr_2CD : byte [generated]
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
        var_0_1AA = and:int(ldc:int(1287990721), ldc:int(-322423439))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_252_0 = stack_2CA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("lIM0bAQEkxQbVzcvJy+fDA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_197 = expr_6B:int
        var_3_19C = newarray:byte[](byte.class, expr_6B:int)
        var_5_19D = expr_6B:int
        Label_0415:
        
        while (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(2130084823))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, add:byte(loadelement:byte(stack_1BC_0:byte[], var_5_19D:int), ldc:byte(116)))
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_252_0 = stack_2CA_0 = var_3_19C:byte[]
            goto(Label_0112)
        }
        
        var_0_1AA = and:int(var_0_1AA:int, ldc:int(-851850809))
        Label_0573:
        
        while (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(256)), ldc:int(0))) {
            var_0_26A = and:int(var_0_1AA:int, ldc:int(-1379610119))
            var_5_19D = add:int(var_5_19D:int, ldc:int(-1))
            expr_252 = stack_296_2 = loadelement(stack_252_0, var_5_19D)
            
            if (cmplt:boolean(add:int(add:int(var_5_19D:int, ldc:int(6)), neg:int(var_4_197:int)), ldc:int(0))) {
                stack_296_2 = stack_26D_0 = add:byte(expr_252:byte, loadelement:byte(var_3_19C:byte[], add:int(var_5_19D:int, ldc:int(6))))
                goto(Label_0637)
            }
            
            Label_0607:
            
            if (cmpne:boolean(and:int(var_0_26A:int, ldc:int(256)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(-1113976985))
                stack_296_2 = stack_26D_0 = add:byte(expr_252:byte, ldc:byte(6))
            }
            
            Label_0637:
            
            if (cmpeq:boolean(and:int(var_0_26A:int, ldc:int(1)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(-407127421))
                goto(Label_0607)
            }
            
            var_0_1AA = and:int(var_0_26A:int, ldc:int(-570886799))
            storeelement:byte(var_3_19C:byte[], var_5_19D:int, stack_296_2:byte)
            
            if (cmpne:boolean(var_5_19D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_252_0 = stack_2CA_0 = var_3_19C:byte[]
            goto(Label_0216)
        }
        
        goto(Label_0415)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-155548586))
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(1360815023))
        }
        else {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1158822049))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1E5 = newarray:byte[](byte.class, expr_A0:int)
                var_5_1E6 = expr_A0:int
                
                loop {
                    var_0_1AA = and:int(var_0_1AA:int, ldc:int(-292173501))
                    var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
                    storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, add:int(shl:int(loadelement:byte(stack_1F6_0:byte[], var_5_1E6:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1E6:int, xor:int(ldc:int(-32742), ldc:int(-32741)))), ldc:int(7)), xor:int(ldc:int(8224), ldc:int(8225)))))
                    
                    if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_252_0 = stack_2CA_0 = var_3_1E5:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(1965358116))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1976908472))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(968198527))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_197 = expr_D3:int
                var_3_19C = newarray:byte[](byte.class, expr_D3:int)
                var_5_19D = expr_D3:int
                goto(Label_0573)
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(649844411))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(-951726757))
                goto(Label_0112)
            }
            
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-823788559))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2B9 = newarray:byte[](byte.class, expr_106:int)
                var_5_2BA = expr_106:int
                
                loop {
                    var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1969957025))
                    var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
                    expr_2CD = xor:byte(loadelement:byte(stack_2CA_0:byte[], var_5_2BA:int), ldc:byte(26))
                    storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, or:int(and:int(shl:int(expr_2CD:byte, xor:int(ldc:int(25096), ldc:int(25100))), ldc:int(-16)), and:int(shr:int(expr_2CD:byte[expected:int], xor:int(ldc:int(-15862), ldc:int(-15858))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_136_0 = stack_1BC_0 = stack_1F6_0 = stack_252_0 = stack_2CA_0 = var_3_2B9:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(64)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-597774841))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(64)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_1AA:int, ldc:int(-1689332858))
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(512)), ldc:int(0))) {
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_190_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-30683), ldc:int(-30681)))
            expr_154 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3078), ldc:int(66)))
            storeelement:String(expr_154:String[], and:int(ldc:int(257), ldc:int(21065)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(17186), ldc:int(-17195)), and:int(ldc:int(19551), ldc:int(4871))))
            storeelement:String(expr_154:String[], and:int(ldc:int(5260), ldc:int(-15501)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(99), ldc:int(100)), xor:int(ldc:int(9602), ldc:int(9613))))
            putstatic:String[](\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be::\ub19c\u4c04\uc9f6\u3776\u0800\u3dd3, expr_154:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u624e\ubded\u3bc9\u40a9\u760c\uc4d2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_652 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_65D : int
        
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
        var_3_652 = and:int(ldc:int(209061475), ldc:int(1982299755))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\u120d\u4c04\ub1b9\u4daf\ub8be[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
            var_3_652 = and:int(var_3_652:int, ldc:int(969739043))
        }
        else {
            var_3_652 = and:int(var_3_652:int, ldc:int(249966311))
            var_5_85 = and:int(ldc:int(-10492), ldc:int(2234))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17177), ldc:int(-17182)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_652:int, ldc:int(-1108922521))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(329), ldc:int(6197)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(9121), ldc:int(21517)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_652 = and:int(var_3_D2:int, ldc:int(-1355911193))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(6464), ldc:int(6465)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-2117283063))
                        goto(Label_1526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1102802700))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(863329671))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1058217173))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-488407758))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(928415490))
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1471733919))
                    }
                    else {
                        var_3_652 = and:int(var_3_652:int, ldc:int(510031723))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0578)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1676224979))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1764854942))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1614498557))
                        goto(Label_0706)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-11818106))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-675375113))
                        var_11_E3 = and:int(ldc:int(11809), ldc:int(-11810))
                        goto(Label_1515)
                    }
                    
                    Label_0578:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1055153809))
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-577582721))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-453733280))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(29473274))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1256694510))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(1295394431))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0706:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1554770948))
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1360799576))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-697887701))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1088256389))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-274305648))
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-555904470))
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(483391394))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(693502673))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-582733435))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(1152308975))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4248), ldc:int(4249))
                                goto(Label_1115)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-750667815))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-967507071))
                            goto(Label_0706)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-50061931))
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(220095184))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1848607529))
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1355561217))
                        var_11_E3 = and:int(ldc:int(-21399), ldc:int(4630))
                    }
                    
                    Label_1115:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1534403913))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(125741515))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1998602075))
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(2135489995))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1984492631))
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-672206340))
                            goto(Label_0578)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_652 = and:int(var_3_652:int, ldc:int(-580243609))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1374)
                            }
                        }
                    }
                    
                    Label_1254:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1306212342))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(64)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(-1755467489))
                            goto(Label_1115)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0706)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0578)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(2138808290))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_652:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_652 = and:int(var_3_652:int, ldc:int(1593556975))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1515)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1374:
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(2038062995))
                        goto(Label_1526)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1254)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-731053095))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-482759674))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-379762470))
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1913967595))
                        goto(Label_0578)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_652 = and:int(var_3_652:int, ldc:int(631703531))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1515:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65D = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1526:
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(1074010665))
                        goto(Label_1254)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1115)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0706)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0578)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_652:int, ldc:int(32)), ldc:int(0))) {
                        var_3_652 = and:int(var_3_652:int, ldc:int(-1658398865))
                        var_17_65D = add:int(var_16_111:int, and:int(ldc:int(8337), ldc:int(3915)))
                        looporswitchbreak()
                    }
                    
                    var_3_652 = and:int(var_3_652:int, ldc:int(623199558))
                }
                
                var_3_652 = and:int(var_3_652:int, ldc:int(904321011))
                
                if (cmple:boolean(var_5_85 = var_17_65D:int, sub:int(var_6_8C:int, xor:int(ldc:int(1345), ldc:int(1344))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_652:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
