public class \u12b2\u7049\u8df4\uc9f6\uae87.\u6cfe\u9a18\ud171\u416d\u3776 {
    public void \u6cfe\u9a18\ud171\u416d\u3776(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p0) {
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
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
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
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, this:\u6cfe\u9a18\ud171\u416d\u3776[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ternaryop:String(cmpne:boolean(invokestatic:int(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u4cd9\u7bad\ud36e\u40a9\u3e75\u760c, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6cfe\u9a18\ud171\u416d\u3776::\uc9f6\u7ce1\u8389\u8c8a\u8413, this:\u6cfe\u9a18\ud171\u416d\u3776)), ldc:int(0)), loadelement:String(getstatic:String[](\u6cfe\u9a18\ud171\u416d\u3776::\u718f\u7bad\u5140\u4975\u8753), xor:int(ldc:int(312), ldc:int(313))), loadelement:String(getstatic:String[](\u6cfe\u9a18\ud171\u416d\u3776::\u718f\u7bad\u5140\u4975\u8753), and:int(ldc:int(-5855), ldc:int(5834))))))
            return:void()
        }
        
        goto(Label_0006)
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
            invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\ud217\u718f\ucef1\ua6bd\uff55\u6b0d, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6cfe\u9a18\ud171\u416d\u3776::\uc9f6\u7ce1\u8389\u8c8a\u8413, this:\u6cfe\u9a18\ud171\u416d\u3776), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, getfield:int(\u6cfe\u9a18\ud171\u416d\u3776::\u3dd3\u4975\u6cfe\u51fa\ua562\u5db4, this:\u6cfe\u9a18\ud171\u416d\u3776), getfield:int(\u6cfe\u9a18\ud171\u416d\u3776::\uae87\u5f50\u3bd6\u6c56\ud51e\u1833, this:\u6cfe\u9a18\ud171\u416d\u3776), invokevirtual:boolean(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u99f7\u12cb\u0800\u4bc8\u52d3\u8cae, this:\u6cfe\u9a18\ud171\u416d\u3776[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995]), getfield:boolean(\u6cfe\u9a18\ud171\u416d\u3776::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, this:\u6cfe\u9a18\ud171\u416d\u3776))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5f50\u8d98\u8753\uc3e3\u12b2\u9937$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokestatic:void(\u3d4b\u9af2\u71f1\u67d0\u99f7::\u2dcc\u4d85\u62da\ub8be\u120d\ucef1, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u6cfe\u9a18\ud171\u416d\u3776::\uc9f6\u7ce1\u8389\u8c8a\u8413, this:\u6cfe\u9a18\ud171\u416d\u3776), p0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_204 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_1AE_0 : byte[] [generated]
        stack_216_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_141 : byte[]
        var_4_142 : int
        expr_91 : int [generated]
        var_5_191 : int
        var_3_196 : byte[]
        var_4_197 : int
        expr_1B1 : byte [generated]
        var_0_20C : int
        expr_216 : byte [generated]
        stack_244_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_EA : String
        stack_138_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
            var_0_204 = and:int(ldc:int(-308498594), ldc:int(-351499458))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("PTTZSBFNAk0VVTlgCVlpOSUlCSI5PTTZSBFNAkU9XT1UaTkG/pLG6oA="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_141 = newarray:byte[](byte.class, expr_6D:int)
                var_4_142 = expr_6D:int
                
                loop {
                    var_0_204 = and:int(var_0_204:int, ldc:int(-836009198))
                    var_4_142 = add:int(var_4_142:int, ldc:int(-1))
                    storeelement:byte(var_3_141:byte[], var_4_142:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_142:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_142:int, and:int(ldc:int(6171), ldc:int(8577)))), ldc:int(6)), xor:int(ldc:int(2432), ldc:int(2435)))))
                    
                    if (cmpne:boolean(var_4_142:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = var_3_141:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_204 = and:int(var_0_204:int, ldc:int(473551269))
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_0_204 = and:int(var_0_204:int, ldc:int(272356127))
                expr_91 = arraylength:int(stack_91_0:byte[])
                
                if (cmpeq:boolean(expr_91:int, ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_5_191 = expr_91:int
                var_3_196 = newarray:byte[](byte.class, expr_91:int)
                var_4_197 = expr_91:int
                Label_0409:
                
                while (cmpeq:boolean(and:int(var_0_204:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_204 = and:int(var_0_204:int, ldc:int(-1910572033))
                    var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                    expr_1B1 = xor:byte(loadelement:byte(stack_1AE_0:byte[], var_4_197:int), ldc:byte(72))
                    storeelement:byte(var_3_196:byte[], var_4_197:int, add:int(or:int(and:int(shl:int(expr_1B1:byte, xor:int(ldc:int(161), ldc:int(165))), ldc:int(-16)), and:int(shr:int(expr_1B1:byte[expected:int], xor:int(ldc:int(8194), ldc:int(8198))), ldc:int(15))), ldc:int(52)))
                    
                    if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = var_3_196:byte[]
                    goto(Label_0150)
                }
                
                Label_0505:
                
                while (cmpeq:boolean(and:int(var_0_204:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_20C = and:int(var_0_204:int, ldc:int(314411003))
                    var_4_197 = add:int(var_4_197:int, ldc:int(-1))
                    expr_216 = loadelement:byte(stack_216_0:byte[], var_4_197:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_197:int, ldc:int(5)), neg:int(var_5_191:int)), ldc:int(0))) {
                        var_0_20C = and:int(var_0_20C:int, ldc:int(535738142))
                        stack_244_2 = add:byte(expr_216:byte, ldc:byte(5))
                    }
                    else {
                        stack_244_2 = add:byte(expr_216:byte, loadelement:byte(var_3_196:byte[], add:int(var_4_197:int, ldc:int(5))))
                    }
                    
                    var_0_204 = and:int(var_0_20C:int, ldc:int(-2050106374))
                    storeelement:byte(var_3_196:byte[], var_4_197:int, stack_244_2:byte)
                    
                    if (cmpne:boolean(var_4_197:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_DE_0 = stack_1AE_0 = stack_216_0 = var_3_196:byte[]
                    goto(Label_0186)
                }
                
                var_0_204 = and:int(var_0_204:int, ldc:int(-372732883))
                goto(Label_0409)
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_204 = and:int(var_0_204:int, ldc:int(-806645004))
                        loopcontinue()
                    }
                    
                    var_0_204 = and:int(var_0_204:int, ldc:int(-262215822))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_191 = expr_B5:int
                        var_3_196 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_197 = expr_B5:int
                        goto(Label_0505)
                    }
                }
                
                Label_0186:
                
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_204 = and:int(var_0_204:int, ldc:int(198102098))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_204:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_204 = and:int(var_0_204:int, ldc:int(1395714024))
            }
            
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_138_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(75), ldc:int(17810)))
            expr_FC = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-15232), ldc:int(-15230)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(-9197), ldc:int(9132)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(-5158), ldc:int(5157)), and:int(ldc:int(5301), ldc:int(789))))
            storeelement:String(expr_FC:String[], xor:int(ldc:int(-15104), ldc:int(-15103)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(16664), ldc:int(16653)), and:int(ldc:int(17448), ldc:int(685))))
            putstatic:String[](\u6cfe\u9a18\ud171\u416d\u3776::\u718f\u7bad\u5140\u4975\u8753, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_620 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_62B : int
        
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
        var_3_620 = and:int(ldc:int(688986886), ldc:int(485707665))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6cfe\u9a18\ud171\u416d\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
            var_3_620 = and:int(var_3_620:int, ldc:int(-1512072427))
            var_5_7D = and:int(ldc:int(5457), ldc:int(-13782))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21736), ldc:int(-21737)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_620:int, ldc:int(-1341428933))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(12545)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(8488), ldc:int(8489)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_620 = and:int(var_3_CA:int, ldc:int(-524985476))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32512), ldc:int(-32511)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(380754143))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-685204635))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1167651636))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-60759892))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0659)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1552266285))
                    }
                    else {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1987145639))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(540507520))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1884186657))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-835858081))
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(397139158))
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-407557300))
                            var_11_DB = and:int(ldc:int(723), ldc:int(-724))
                            goto(Label_1441)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1347017831))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-246785356))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-364974985))
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(512)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1755670054))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(-686465076))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0659:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1270555906))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1596671489))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1614863149))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(932469477))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-69508994))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(446954309))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0791:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1256126662))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1222873923))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-101298685))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1725251972))
                            goto(Label_0659)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1420673780))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(991673861))
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(823914486))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(4875), ldc:int(17441))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1189056649))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1689434253))
                        goto(Label_1313)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1394204581))
                        goto(Label_1185)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(-2128928940))
                        var_11_DB = and:int(ldc:int(-2268), ldc:int(2267))
                    }
                    
                    Label_1068:
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-2014073737))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1147895016))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1441710603))
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-458101270))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1614602391))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1313)
                            }
                        }
                    }
                    
                    Label_1185:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-149887565))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1068)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1781373510))
                            goto(Label_0791)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-560426131))
                            goto(Label_0659)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(-1524123336))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_620:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                            var_3_620 = and:int(var_3_620:int, ldc:int(810650538))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1441)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1313:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-191713593))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-463347432))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-300128543))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1304015131))
                        loopcontinue()
                    }
                    
                    var_3_620 = and:int(var_3_620:int, ldc:int(1607297988))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1441:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62B = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1452:
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-417809062))
                        goto(Label_1313)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1971778253))
                        goto(Label_1185)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(-1091840157))
                        goto(Label_0659)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(1)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1787515098))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_620:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(1730321648))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_620 = and:int(var_3_620:int, ldc:int(2047324156))
                        var_17_62B = add:int(var_16_109:int, and:int(ldc:int(17), ldc:int(4105)))
                        looporswitchbreak()
                    }
                }
                
                var_3_620 = and:int(var_3_620:int, ldc:int(-1448227054))
                
                if (cmple:boolean(var_5_7D = var_17_62B:int, sub:int(var_6_84:int, xor:int(ldc:int(24593), ldc:int(24592))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_620:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
