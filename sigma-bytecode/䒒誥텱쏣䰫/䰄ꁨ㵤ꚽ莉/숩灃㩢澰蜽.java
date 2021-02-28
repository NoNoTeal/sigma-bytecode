public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\uc229\u7043\u3a62\u6fb0\u873d {
    public void \uc229\u7043\u3a62\u6fb0\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6d99\u5245\ubefe\u3dd3\u97e6 p0, java.lang.String p1) {
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
            putfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d, p0:\u6d99\u5245\ubefe\u3dd3\u97e6)
            invokespecial:Thread(Thread::<init>, this:\uc229\u7043\u3a62\u6fb0\u873d, p1:String)
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
    
    private void lambda$\u16f6\ub8be\u760c\u9a18\ud158\u16f6$0(java.util.List p0) {
        var_2_5F : int
        var_4_96 : Iterator<\u3dd3\u76bc\u8753\u071d\u56bd>
        
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
            var_2_5F = and:int(ldc:int(-419693018), ldc:int(-1246183645))
            invokestatic:List(\u6d99\u5245\ubefe\u3dd3\u97e6::\ufcaf\u4492\u67d0\u6b0d\ub8be\u965f, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d), p0:List)
            invokestatic:Boolean(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3e75\u4492\u4f4a\uc7fe\u4cd9\uc238, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d), invokestatic:Boolean(Boolean::valueOf, invokeinterface:boolean(List::isEmpty, invokestatic:List(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubefe\u5654\u47c2\u34df\u6b0d\u385b, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d)))))
            invokevirtual:void(\u873d\u6d99\u983f\u6198\u8d90\u416d<E>::\u6b5f\u69d9\u183a\uc910\u7bad\u718f, invokestatic:\u5245\u67d0\u4f52\u760c\u56bd[expected:\u873d\u6d99\u983f\u6198\u8d90\u416d<\u8bb0\u9a18\u759a\u4f4a\u494c>](\u6d99\u5245\ubefe\u3dd3\u97e6::\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d)))
            var_4_96 = invokeinterface:Iterator(List::iterator, invokestatic:List(\u6d99\u5245\ubefe\u3dd3\u97e6::\ubefe\u5654\u47c2\u34df\u6b0d\u385b, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d)))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1512071630))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_96:Iterator<\u3dd3\u76bc\u8753\u071d\u56bd>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u5245\u67d0\u4f52\u760c\u56bd::\u74b1\u7bad\u52d3\u97b7\ud12e\u0c95, invokestatic:\u5245\u67d0\u4f52\u760c\u56bd(\u6d99\u5245\ubefe\u3dd3\u97e6::\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d)), checkcast:\u3dd3\u76bc\u8753\u071d\u56bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd.class, invokeinterface:\u3dd3\u76bc\u8753\u071d\u56bd(Iterator<\u3dd3\u76bc\u8753\u071d\u56bd>::next, var_4_96:Iterator<\u3dd3\u76bc\u8753\u071d\u56bd>)))
            }
            
            invokestatic:void(\u6d99\u5245\ubefe\u3dd3\u97e6::\u3c25\ub7dc\uf9c5\u8aa5\u64ab\u9033, getfield:\u6d99\u5245\ubefe\u3dd3\u97e6(\uc229\u7043\u3a62\u6fb0\u873d::\ub1b9\ub32d\u3bd6\ud158\ua068\uc229, this:\uc229\u7043\u3a62\u6fb0\u873d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_22E : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1DC_0 : byte[] [generated]
        stack_240_0 : byte[] [generated]
        stack_2C0_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_189 : byte [generated]
        var_0_258 : int
        expr_240 : byte [generated]
        stack_28C_2 : byte [generated]
        stack_263_0 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1CB : byte[]
        var_5_1CC : int
        expr_CB : int [generated]
        expr_F6 : int [generated]
        var_3_2AF : byte[]
        var_5_2B0 : int
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
        var_0_22E = and:int(ldc:int(689112074), ldc:int(-1389947269))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1DC_0 = stack_240_0 = stack_2C0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DaKIujLSuL4pqNqOtMgMmDm+oMDQtriguA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(1)), ldc:int(0))) {
            var_0_22E = and:int(var_0_22E:int, ldc:int(2108065207))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_189 = loadelement:byte(stack_189_0:byte[], var_5_172:int)
            storeelement:byte(var_3_171:byte[], var_5_172:int, add:int(or:int(and:int(shl:int(expr_189:byte, and:int(ldc:int(2676), ldc:int(1036))), ldc:int(-16)), and:int(shr:int(expr_189:byte[expected:int], xor:int(ldc:int(24850), ldc:int(24854))), ldc:int(15))), ldc:int(53)))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1DC_0 = stack_240_0 = stack_2C0_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        Label_0547:
        
        while (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(1)), ldc:int(0))) {
            var_0_258 = and:int(var_0_22E:int, ldc:int(167744919))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_240 = stack_28C_2 = loadelement(stack_240_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(2)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_28C_2 = stack_263_0 = add:byte(expr_240:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(2))))
                goto(Label_0627)
            }
            
            Label_0589:
            
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(1)), ldc:int(0))) {
                var_0_258 = and:int(var_0_258:int, ldc:int(81242076))
            }
            else {
                var_0_258 = and:int(var_0_258:int, ldc:int(730589104))
                stack_28C_2 = stack_263_0 = add:byte(expr_240:byte, ldc:byte(2))
            }
            
            Label_0627:
            
            if (cmpne:boolean(and:int(var_0_258:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_258 = and:int(var_0_258:int, ldc:int(1750594075))
                goto(Label_0589)
            }
            
            var_0_22E = and:int(var_0_258:int, ldc:int(261588669))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_28C_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1DC_0 = stack_240_0 = stack_2C0_0 = var_3_171:byte[]
            goto(Label_0208)
        }
        
        var_0_22E = and:int(var_0_22E:int, ldc:int(-1048210102))
        goto(Label_0372)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_22E = and:int(var_0_22E:int, ldc:int(1503023100))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1CB = newarray:byte[](byte.class, expr_90:int)
                var_5_1CC = expr_90:int
                
                loop {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(-1623775337))
                    var_5_1CC = add:int(var_5_1CC:int, ldc:int(-1))
                    storeelement:byte(var_3_1CB:byte[], var_5_1CC:int, add:int(shl:int(loadelement:byte(stack_1DC_0:byte[], var_5_1CC:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1CC:int, xor:int(ldc:int(-22496), ldc:int(-22495)))), ldc:int(5)), xor:int(ldc:int(8245), ldc:int(8242)))))
                    
                    if (cmpne:boolean(var_5_1CC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1DC_0 = stack_240_0 = stack_2C0_0 = var_3_1CB:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_22E = and:int(var_0_22E:int, ldc:int(1367405791))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(1024)), ldc:int(0))) {
            var_0_22E = and:int(var_0_22E:int, ldc:int(-91818948))
        }
        else {
            if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(32768)), ldc:int(0))) {
                var_0_22E = and:int(var_0_22E:int, ldc:int(630091498))
                goto(Label_0112)
            }
            
            var_0_22E = and:int(var_0_22E:int, ldc:int(195514199))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_16C = expr_CB:int
                var_3_171 = newarray:byte[](byte.class, expr_CB:int)
                var_5_172 = expr_CB:int
                goto(Label_0547)
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(1024)), ldc:int(0))) {
                var_0_22E = and:int(var_0_22E:int, ldc:int(-416210531))
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_22E = and:int(var_0_22E:int, ldc:int(1868776642))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2AF = newarray:byte[](byte.class, expr_F6:int)
                var_5_2B0 = expr_F6:int
                
                loop {
                    var_0_22E = and:int(var_0_22E:int, ldc:int(486759450))
                    var_5_2B0 = add:int(var_5_2B0:int, ldc:int(-1))
                    storeelement:byte(var_3_2AF:byte[], var_5_2B0:int, xor:byte(loadelement:byte(stack_2C0_0:byte[], var_5_2B0:int), ldc:byte(115)))
                    
                    if (cmpne:boolean(var_5_2B0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C9_0 = stack_CB_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_189_0 = stack_1DC_0 = stack_240_0 = stack_2C0_0 = var_3_2AF:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_22E:int, ldc:int(1024)), ldc:int(0))) {
            var_0_22E = and:int(var_0_22E:int, ldc:int(-742807572))
            goto(Label_0149)
        }
        
        if (cmpne:boolean(and:int(var_0_22E:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_22E = and:int(var_0_22E:int, ldc:int(-1766998878))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_165_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3586), ldc:int(3587)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(689), ldc:int(11267)))
        storeelement:String(expr_144:String[], and:int(ldc:int(4545), ldc:int(-4546)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(12362), ldc:int(-12364)), and:int(ldc:int(4664), ldc:int(16409))))
        putstatic:String[](\uc229\u7043\u3a62\u6fb0\u873d::\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79, expr_144:String[])
    }
    
    public void \u67e9\uc84e\ucef1\u6d99\ub32d\ud158(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63F : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_64A : int
        
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
        var_3_63F = and:int(ldc:int(-1291476207), ldc:int(-1257830449))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc229\u7043\u3a62\u6fb0\u873d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_63F = and:int(var_3_63F:int, ldc:int(574046533))
            var_5_7F = and:int(ldc:int(-30371), ldc:int(12960))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18001), ldc:int(-18004)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_63F:int, ldc:int(-1149284633))
                    var_9_BD = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_86:int, and:int(ldc:int(21249), ldc:int(47)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(28673), ldc:int(2353)))), var_7_95:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_63F = and:int(var_3_CF:int, ldc:int(-1386898333))
                    var_14_10A = var_7_95:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), and:int(ldc:int(1281), ldc:int(2129)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_86:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-587677990))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(896401001))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(186574824))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-155352013))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1703909733))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(810480293))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2010985896))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(423696156))
                        goto(Label_0958)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1463671595))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1903249936))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1550510155))
                            var_11_E0 = and:int(ldc:int(1225), ldc:int(-1226))
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(701434045))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1151166526))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(355514169))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1552664311))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-533285668))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2105893317))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1203817685))
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1529144637))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-913073710))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1381513089))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(899664354))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(2093426069))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1513950136))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1162030732))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1369328291))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1348525473))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E0 = and:int(ldc:int(1345), ldc:int(18433))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0958:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-140442659))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-782021161))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1310320679))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1792105827))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1322438647))
                        var_11_E0 = and:int(ldc:int(17457), ldc:int(-17972))
                    }
                    
                    Label_1117:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1883470699))
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1312164584))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(1416033137))
                            loopcontinue()
                        }
                        
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1567644479))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1350)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1117)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0958)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-144879456))
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(2024114057))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63F = and:int(var_3_63F:int, ldc:int(-1301942871))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_7F:int, var_16_10E:int)
                            goto(Label_1487)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1350:
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1348961753))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-1969227896))
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(1473659821))
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-619188858))
                        loopcontinue()
                    }
                    
                    var_3_63F = and:int(var_3_63F:int, ldc:int(1935010385))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64A = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1350)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-2105992191))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-856659569))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0958)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-977815635))
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_63F = and:int(var_3_63F:int, ldc:int(-108019645))
                        var_17_64A = add:int(var_16_10E:int, xor:int(ldc:int(-16252), ldc:int(-16251)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63F = and:int(var_3_63F:int, ldc:int(-1420956627))
                
                if (cmple:boolean(var_5_7F = var_17_64A:int, sub:int(var_6_86:int, xor:int(ldc:int(4224), ldc:int(4225))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpeq:boolean(and:int(var_3_63F:int, ldc:int(524288)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
