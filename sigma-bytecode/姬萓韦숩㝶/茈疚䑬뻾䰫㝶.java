public class \u59ec\u8413\u97e6\uc229\u3776.\u8308\u759a\u446c\ubefe\u4c2b\u3776 {
    public void \u8308\u759a\u446c\ubefe\u4c2b\u3776(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p0) {
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
            invokespecial:\u759a\ucfaf\u6b0d\u5fe1\u6cfe\ud36e(\u759a\ucfaf\u6b0d\u5fe1\u6cfe\ud36e::<init>, this:\u8308\u759a\u446c\ubefe\u4c2b\u3776, p0:\u47c2\ubded\u12cb\u3dd3\u12cb\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u51b2\u56bd\u69d9\u92ee\ud171 \u4daf\u3504\u34df\u8389\uafe7\u8389(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ucef1\ub102\u16f6\u61a4\ud523 \u6bb9\u6435\uc31c\u3bd6\u7043\u9255(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p4, \ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50 p5) {
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
        
        if (logicalnot:boolean(getfield:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uae5d\u494c\uc2e8\u6198\uff55\ua068, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c))) {
            invokevirtual:OptionalInt(\ua3b4\u8aa5\ub113\ubf56\u873d::\u760c\u6435\u1187\ub113\u8cae\uc87f, p3:\ua3b4\u8aa5\ub113\ubf56\u873d, invokevirtual:\u51b2\u56bd\u69d9\u92ee\ud171(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uae87\u8cae\ubff1\u8640\u392e\u4c04, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\uc3e3\u8cae\u4492\u92ee\ub70c\ub7dc, p3:\ua3b4\u8aa5\ub113\ubf56\u873d, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc910\u4179\u4daf\u3776\u7c6b\uf94d::\uc246\u7d52\ubefe\u3d64\u3504\u92ee))
            return:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(getstatic:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\uc29a\u416d\u3504\u7049\u183a\ub19c))
        }
        
        return:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(getstatic:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u9af2\ucef1\ub102\u16f6\u61a4\ud523::\u62da\ufe34\u4975\ub70c\u59ec\u3c25))
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub1b9\u62da\u9af2\u92ee\u64f2 lambda$\u3bd6\u7043\u4daf\uc3e3\u3776\uf9c5$0(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2, \ub113\ufcaf\u3c25\u071d\u97b7.\u0b8e\ud4fe\uc229\u92ee\ud4fe p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p4) {
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
            return:\ub1b9\u62da\u9af2\u92ee\u64f2(initobject:\u5654\u12b2\u3bd6\u64ab\u3504[expected:\ub1b9\u62da\u9af2\u92ee\u64f2](\u5654\u12b2\u3bd6\u64ab\u3504::<init>, p2:int, p3:\u0b8e\ud4fe\uc229\u92ee\ud4fe, invokestatic:\ufe34\u1187\u5fe1\ud217\ub1b9\u839e(\ufe34\u1187\u5fe1\ud217\ub1b9\u839e::\u4cd9\u5bc4\u3711\u3bd6\u4f4a\ud523, p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E6 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8E_0 : byte[] [generated]
        stack_90_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1F8_0 : byte[] [generated]
        stack_255_0 : byte[] [generated]
        stack_2D5_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_183 : byte[]
        var_4_184 : int
        expr_90 : int [generated]
        var_5_1D3 : int
        var_3_1D8 : byte[]
        var_4_1D9 : int
        expr_1FB : byte [generated]
        var_0_26D : int
        expr_255 : byte [generated]
        stack_2A1_2 : byte [generated]
        stack_278_0 : byte [generated]
        expr_CB : int [generated]
        expr_F6 : int [generated]
        var_3_2C4 : byte[]
        var_4_2C5 : int
        var_3_132 : String
        expr_13A : String[] [generated]
        expr_144 : String[] [generated]
        
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
            var_0_1E6 = and:int(ldc:int(2043299973), ldc:int(2086317899))
            expr_65 = var_2_69 = stack_8E_0 = stack_90_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F8_0 = stack_255_0 = stack_2D5_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("L4BfkM/XwBeqRaBAJ4Dn95EA"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_183 = newarray:byte[](byte.class, expr_6D:int)
                var_4_184 = expr_6D:int
                
                loop {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-992054825))
                    var_4_184 = add:int(var_4_184:int, ldc:int(-1))
                    storeelement:byte(var_3_183:byte[], var_4_184:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_184:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_184:int, xor:int(ldc:int(65), ldc:int(64)))), ldc:int(7)), and:int(ldc:int(23297), ldc:int(9)))))
                    
                    if (cmpne:boolean(var_4_184:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_90_0 = stack_8E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F8_0 = stack_255_0 = stack_2D5_0 = var_3_183:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1205761585))
                expr_90 = arraylength:int(stack_90_0:byte[])
                
                if (cmpeq:boolean(expr_90:int, ldc:int(0))) {
                    goto(Label_0149)
                }
                
                var_5_1D3 = expr_90:int
                var_3_1D8 = newarray:byte[](byte.class, expr_90:int)
                var_4_1D9 = expr_90:int
                Label_0475:
                
                while (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-285308057))
                    var_4_1D9 = add:int(var_4_1D9:int, ldc:int(-1))
                    expr_1FB = xor:byte(loadelement:byte(stack_1F8_0:byte[], var_4_1D9:int), ldc:byte(16))
                    storeelement:byte(var_3_1D8:byte[], var_4_1D9:int, or:int(and:int(shl:int(expr_1FB:byte, and:int(ldc:int(16422), ldc:int(1044))), ldc:int(-16)), and:int(shr:int(expr_1FB:byte[expected:int], xor:int(ldc:int(8295), ldc:int(8291))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_1D9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_90_0 = stack_8E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F8_0 = stack_255_0 = stack_2D5_0 = var_3_1D8:byte[]
                    goto(Label_0149)
                }
                
                var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1240073840))
                Label_0576:
                
                while (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_26D = and:int(var_0_1E6:int, ldc:int(1448851289))
                    var_4_1D9 = add:int(var_4_1D9:int, ldc:int(-1))
                    expr_255 = stack_2A1_2 = loadelement(stack_255_0, var_4_1D9)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1D9:int, ldc:int(1)), neg:int(var_5_1D3:int)), ldc:int(0))) {
                        stack_2A1_2 = stack_278_0 = add:byte(expr_255:byte, loadelement:byte(var_3_1D8:byte[], add:int(var_4_1D9:int, ldc:int(1))))
                        goto(Label_0648)
                    }
                    
                    Label_0610:
                    
                    if (cmpne:boolean(and:int(var_0_26D:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_26D = and:int(var_0_26D:int, ldc:int(2063950042))
                    }
                    else {
                        var_0_26D = and:int(var_0_26D:int, ldc:int(-1042324745))
                        stack_2A1_2 = stack_278_0 = add:byte(expr_255:byte, ldc:byte(1))
                    }
                    
                    Label_0648:
                    
                    if (cmpeq:boolean(and:int(var_0_26D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_26D = and:int(var_0_26D:int, ldc:int(1783410267))
                        goto(Label_0610)
                    }
                    
                    var_0_1E6 = and:int(var_0_26D:int, ldc:int(1652237629))
                    storeelement:byte(var_3_1D8:byte[], var_4_1D9:int, stack_2A1_2:byte)
                    
                    if (cmpne:boolean(var_4_1D9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_90_0 = stack_8E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F8_0 = stack_255_0 = stack_2D5_0 = var_3_1D8:byte[]
                    goto(Label_0208)
                }
                
                goto(Label_0475)
                Label_0149:
                
                if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(599183303))
                    goto(Label_0251)
                }
                
                if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(1)), ldc:int(0))) {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-690283444))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(16)), ldc:int(0))) {
                        var_0_1E6 = and:int(var_0_1E6:int, ldc:int(270288042))
                        loopcontinue()
                    }
                    
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-439670995))
                    expr_CB = arraylength:int(stack_CB_0:byte[])
                    
                    if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                        var_5_1D3 = expr_CB:int
                        var_3_1D8 = newarray:byte[](byte.class, expr_CB:int)
                        var_4_1D9 = expr_CB:int
                        goto(Label_0576)
                    }
                }
                
                Label_0208:
                
                if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(599693671))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0149)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(33554432)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1372226385))
                    expr_F6 = arraylength:int(stack_F6_0:byte[])
                    
                    if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                        var_3_2C4 = newarray:byte[](byte.class, expr_F6:int)
                        var_4_2C5 = expr_F6:int
                        
                        loop {
                            var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-187751567))
                            var_4_2C5 = add:int(var_4_2C5:int, ldc:int(-1))
                            storeelement:byte(var_3_2C4:byte[], var_4_2C5:int, add:byte(loadelement:byte(stack_2D5_0:byte[], var_4_2C5:int), ldc:byte(65)))
                            
                            if (cmpne:boolean(var_4_2C5:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_90_0 = stack_8E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F8_0 = stack_255_0 = stack_2D5_0 = var_3_2C4:byte[]
                    }
                }
                
                Label_0251:
                
                if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(256)), ldc:int(0))) {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(-2060159124))
                    goto(Label_0208)
                }
                
                if (cmpne:boolean(and:int(var_0_1E6:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_1E6 = and:int(var_0_1E6:int, ldc:int(1661962563))
                    goto(Label_0149)
                }
                
                if (cmpeq:boolean(and:int(var_0_1E6:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_13A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2193), ldc:int(4141)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(34), ldc:int(35)))
            storeelement:String(expr_13A:String[], and:int(ldc:int(-23252), ldc:int(22611)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(29874), ldc:int(-31923)), xor:int(ldc:int(26636), ldc:int(26653))))
            putstatic:String[](\u8308\u759a\u446c\ubefe\u4c2b\u3776::\ub83f\uc2e8\ua3b4\u5d20\u8753\u983f, expr_144:String[])
            putstatic:ITextComponent(\u8308\u759a\u446c\ubefe\u4c2b\u3776::\u3504\u64f2\u1833\u8640\u9a18\u7af6, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_13A:String[], and:int(ldc:int(19112), ldc:int(-24559)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_69D : int
        
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
        var_3_692 = and:int(ldc:int(-2018009412), ldc:int(-1313744964))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8308\u759a\u446c\ubefe\u4c2b\u3776[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(-777541969))
            var_5_7D = and:int(ldc:int(14379), ldc:int(-32192))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2791), ldc:int(2790)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_692:int, ldc:int(-353648658))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(4129), ldc:int(24775)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(18049), ldc:int(8257)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_D2:int, ldc:int(-1578377217))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32244), ldc:int(-32243)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1051702511))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-21935842))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(544671781))
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1728248709))
                    }
                    else {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1820606515))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0569)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1589978787))
                        goto(Label_1584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1873044604))
                        goto(Label_1431)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(2131551104))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-5051738))
                        goto(Label_0970)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1894351817))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1271009314))
                        var_11_E3 = and:int(ldc:int(-8178), ldc:int(3281))
                        goto(Label_1573)
                    }
                    
                    Label_0569:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(256326567))
                        goto(Label_1584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-474785747))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-382582985))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1693364758))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1722082537))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1461952084))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-407912771))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0710:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1836995346))
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1917411410))
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1722568857))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1577605475))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(290717598))
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1561965334))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(970376671))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1172189281))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1885236164))
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-2123081024))
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-483397921))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(8229), ldc:int(8228))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0970:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1339948422))
                        goto(Label_1584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-114605593))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(733525953))
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1975916252))
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1180711328))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1439314196))
                        var_11_E3 = and:int(ldc:int(9953), ldc:int(-14306))
                    }
                    
                    Label_1132:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1147084725))
                        goto(Label_1584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1514369506))
                            goto(Label_0970)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1512149775))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1394193404))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1720661699))
                            goto(Label_0569)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1787481224))
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-681187587))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1431)
                            }
                        }
                    }
                    
                    Label_1269:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(747663545))
                        goto(Label_1584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1906729947))
                            goto(Label_1132)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1643921100))
                            goto(Label_0970)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(960117675))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1313514332))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-489359441))
                            goto(Label_0569)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(8)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1538339880))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-194279713))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1573)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1431:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1829917880))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1526925353))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2039328499))
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(450909557))
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1448903829))
                        goto(Label_0569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(-164127011))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1573:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1584:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1431)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1183141202))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0970)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(256)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(363289612))
                        goto(Label_0569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(64)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-545665138))
                        var_17_69D = add:int(var_16_111:int, and:int(ldc:int(17), ldc:int(7011)))
                        looporswitchbreak()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(889600769))
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(-1171003426))
                
                if (cmple:boolean(var_5_7D = var_17_69D:int, sub:int(var_6_84:int, xor:int(ldc:int(4737), ldc:int(4736))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(-579875980))
            goto(Label_0106)
        }
    }
}
