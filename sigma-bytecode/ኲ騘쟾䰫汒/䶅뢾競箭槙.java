public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u4d85\ub8be\u7af6\u7bad\u69d9 {
    public void \u4d85\ub8be\u7af6\u7bad\u69d9() {
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
            invokespecial:Object(Object::<init>, this:\u4d85\ub8be\u7af6\u7bad\u69d9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u5db4\u3711\u3e2a\u69d9\uc31c\u12cb(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u8c8a\u56bd\u7d52\u1833\uc910\u647c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p3, float p4, int p5, boolean p6, java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p7) {
        var_8_94 : int
        var_10_6A : int
        var_11_73 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        stack_119_1 : String [generated]
        expr_FE : Object[] [generated]
        
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
        var_8_94 = and:int(ldc:int(1814832219), ldc:int(1194911583))
        var_10_6A = and:int(ldc:int(8719), ldc:int(-8720))
        var_11_73 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Collection<\u51fa\u6c52\u7330\u7330\u960f>::iterator, p7:Collection<\u51fa\u6c52\u7330\u7330\u960f>)
        
        loop {
            if (cmpeq:boolean(and:int(var_8_94:int, ldc:int(2097152)), ldc:int(0))) {
                var_8_94 = and:int(var_8_94:int, ldc:int(177735486))
                goto(Label_0208)
            }
            
            if (cmpeq:boolean(and:int(var_8_94:int, ldc:int(4194304)), ldc:int(0))) {
                var_8_94 = and:int(var_8_94:int, ldc:int(1056882559))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_11_73:Iterator)) {
                    if (invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\u392e\u6ec6\ua61f\u97b7\u1187, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937), checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_11_73:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)), p1:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, p6:boolean, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), p5:int, getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, p3:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, p3:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, p3:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), f2d:double(p4:float))) {
                        inc:int(var_10_6A, ldc:int(1))
                    }
                    
                    var_8_94 = and:int(var_8_94:int, ldc:int(1735319803))
                    loopcontinue()
                }
            }
            
            Label_0160:
            
            if (cmpne:boolean(and:int(var_8_94:int, ldc:int(256)), ldc:int(0))) {
                var_8_94 = and:int(var_8_94:int, ldc:int(1690773990))
            }
            else {
                if (cmpeq:boolean(and:int(var_8_94:int, ldc:int(8192)), ldc:int(0))) {
                    var_8_94 = and:int(var_8_94:int, ldc:int(-1336945096))
                    loopcontinue()
                }
                
                var_8_94 = and:int(var_8_94:int, ldc:int(-1258706977))
                
                if (cmpeq:boolean(var_10_6A:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u4d85\ub8be\u7af6\u7bad\u69d9::\uc9f6\u965f\u8709\u527a\u8d90\u5245)))
                }
            }
            
            Label_0208:
            
            if (cmpeq:boolean(and:int(var_8_94:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0160)
            }
            
            if (cmpne:boolean(and:int(var_8_94:int, ldc:int(2097152)), ldc:int(0))) {
                stack_119_1 = loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(16393), ldc:int(5151)))
                expr_FE = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2067), ldc:int(1417)))
                storeelement:Object(expr_FE:Object[], and:int(ldc:int(24448), ldc:int(-24449)), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u64f2\u3e2a\u71ae\ud171\ua068\u120d), invokeinterface:\ubff1\ud171\uceb8\u4492\u67d0\u8aa5<?>(\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a::\u8389\u516c\u6fb0\u52d3\ubb2b\uae5d, p1:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a))))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_119_1:String, expr_FE:Object[]), xor:int[expected:boolean](ldc:int(1304), ldc:int(1305)))
                return:int(var_10_6A:int)
            }
        }
    }
    
    private static int lambda$\u4daf\ua61f\u4bc8\u5654\u52d3\u36d3$7(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(555), ldc:int(16661)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(2090), ldc:int(1042)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(132), ldc:int(135)))), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(20754), ldc:int(20758)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(-28126), ldc:int(-28121)))), and:int[expected:boolean](ldc:int(-7269), ldc:int(7268)), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(4167), ldc:int(1831))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u071d\u4179\u8413\u6198\u51fa\u62da$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(6784), ldc:int(6785)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(18), ldc:int(1191)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(1032), ldc:int(1035)))), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(5), ldc:int(17828)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(8197), ldc:int(8192)))), and:int[expected:boolean](ldc:int(-24944), ldc:int(24907)), invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Collection<\u51fa\u6c52\u7330\u7330\u960f>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub32d\u0c95\u97e6\u51fa\u98a4\u3504$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(20485), ldc:int(8259)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(2593), ldc:int(2595)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(15027), ldc:int(17483)))), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(8470), ldc:int(8466)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(26639), ldc:int(4101)))), xor:int[expected:boolean](ldc:int(-8191), ldc:int(-8192)), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(135), ldc:int(21535))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5f50\u5245\u760c\uf94d\ua6bd\ubff1$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(25839), ldc:int(273)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(18434), ldc:int(8258)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(128), ldc:int(131)))), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(8249), ldc:int(8253)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(1920), ldc:int(1925)))), and:int[expected:boolean](ldc:int(4097), ldc:int(257)), invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Collection<\u51fa\u6c52\u7330\u7330\u960f>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4d85\u183a\u965f\u52d3\u6bb9\u71ae$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(17837), ldc:int(8721)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(-14331), ldc:int(-14329)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(2053), ldc:int(2054)))), invokestatic:float(FloatArgumentType::getFloat, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), xor:int(ldc:int(8194), ldc:int(8198)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(5751), ldc:int(24589)))), and:int[expected:boolean](ldc:int(-7832), ldc:int(6675)), invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Collection<\u51fa\u6c52\u7330\u7330\u960f>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub32d\u2dcc\u4ab3\u760c\u760c\u88c5$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(7201), ldc:int(13)))), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(578), ldc:int(11)))), getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd), ldc:float(0.0f), and:int(ldc:int(25760), ldc:int(-25841)), and:int[expected:boolean](ldc:int(17296), ldc:int(-17333)), invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Collection<\u51fa\u6c52\u7330\u7330\u960f>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u36d3\u1187\ub6ab\u6ec6\u47c2\u7006$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u4d85\ub8be\u7af6\u7bad\u69d9::\u8c8a\u56bd\u7d52\u1833\uc910\u647c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a(\ub19c\u51b2\ud12e\u0b8e\ua6bd::\u6c56\u0800\u7043\u52d3\u3776\u6c52, p0:CommandContext, loadelement:String(getstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04), and:int(ldc:int(12305), ldc:int(1423)))), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u8413\u5140\u64f2\uc9f6\u9937::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))), getstatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u52d3\ua6bd\ubefe\u836c\u6d99\uc2bd), ldc:float(0.0f), and:int(ldc:int(17113), ldc:int(-21210)), and:int[expected:boolean](ldc:int(-24734), ldc:int(24732)), invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>[expected:Collection<\u51fa\u6c52\u7330\u7330\u960f>](\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ucef1\u8413\u624e\ucef1\ub7dc\u3c25$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(10566), ldc:int(16386))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_268 : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_E3_0 : byte[] [generated]
        stack_27B_0 : byte[] [generated]
        stack_2DD_0 : byte[] [generated]
        stack_357_0 : byte[] [generated]
        var_4_253 : int
        var_3_258 : byte[]
        var_5_259 : int
        expr_27B : byte [generated]
        var_0_2D3 : int
        expr_2DD : byte [generated]
        stack_325_2 : byte [generated]
        stack_302_0 : byte [generated]
        expr_95 : int [generated]
        var_2_C3 : byte[]
        expr_C7 : int [generated]
        var_3_345 : byte[]
        var_5_346 : int
        var_3_EF : String
        expr_F7 : String[] [generated]
        expr_101 : String[] [generated]
        
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
        var_0_268 = and:int(ldc:int(-687591370), ldc:int(-809774297))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_C3_0 = stack_C5_0 = stack_E3_0 = stack_27B_0 = stack_2DD_0 = stack_357_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("LOLvbaAhseLfLeAlLiwh8ODQLSEjb27vI+LvbaAhseLfLeAlLiwh8OAUImzr4GTjbG/kICDtrGIkrezjY20tI28gYaDiYe8sICSt4CUuLCHgYeIhYa/srSCkoSzjYC/zFMM=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_253 = expr_6E:int
        var_3_258 = newarray:byte[](byte.class, expr_6E:int)
        var_5_259 = expr_6E:int
        Label_0603:
        
        while (cmpeq:boolean(and:int(var_0_268:int, ldc:int(16384)), ldc:int(0))) {
            var_0_268 = and:int(var_0_268:int, ldc:int(-2179790))
            var_5_259 = add:int(var_5_259:int, ldc:int(-1))
            expr_27B = loadelement:byte(stack_27B_0:byte[], var_5_259:int)
            storeelement:byte(var_3_258:byte[], var_5_259:int, xor:int(add:int(or:int(and:int(shl:int(expr_27B:byte, xor:int(ldc:int(-28149), ldc:int(-28145))), ldc:int(-16)), and:int(shr:int(expr_27B:byte[expected:int], and:int(ldc:int(10317), ldc:int(132))), ldc:int(15))), ldc:int(120)), ldc:int(126)))
            
            if (cmpne:boolean(var_5_259:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_E3_0 = stack_27B_0 = stack_2DD_0 = stack_357_0 = var_3_258:byte[]
            goto(Label_0115)
        }
        
        var_0_268 = and:int(var_0_268:int, ldc:int(855866744))
        Label_0710:
        
        while (cmpne:boolean(and:int(var_0_268:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_2D3 = and:int(var_0_268:int, ldc:int(1714812018))
            var_5_259 = add:int(var_5_259:int, ldc:int(-1))
            expr_2DD = stack_325_2 = loadelement(stack_2DD_0, var_5_259)
            
            if (cmplt:boolean(add:int(add:int(var_5_259:int, ldc:int(2)), neg:int(var_4_253:int)), ldc:int(0))) {
                stack_325_2 = stack_302_0 = add:byte(expr_2DD:byte, loadelement:byte(var_3_258:byte[], add:int(var_5_259:int, ldc:int(2))))
                goto(Label_0786)
            }
            
            Label_0746:
            
            if (cmpne:boolean(and:int(var_0_2D3:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_2D3 = and:int(var_0_2D3:int, ldc:int(-344170374))
            }
            else {
                var_0_2D3 = and:int(var_0_2D3:int, ldc:int(1727943798))
                stack_325_2 = stack_302_0 = add:byte(expr_2DD:byte, ldc:byte(2))
            }
            
            Label_0786:
            
            if (cmpne:boolean(and:int(var_0_2D3:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0746)
            }
            
            var_0_268 = and:int(var_0_2D3:int, ldc:int(1177378686))
            storeelement:byte(var_3_258:byte[], var_5_259:int, stack_325_2:byte)
            
            if (cmpne:boolean(var_5_259:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_E3_0 = stack_27B_0 = stack_2DD_0 = stack_357_0 = var_3_258:byte[]
            goto(Label_0154)
        }
        
        goto(Label_0603)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_268:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_268 = and:int(var_0_268:int, ldc:int(1454183366))
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_268:int, ldc:int(4096)), ldc:int(0))) {
            var_0_268 = and:int(var_0_268:int, ldc:int(-291350354))
            expr_95 = arraylength:int(stack_95_0:byte[])
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_4_253 = expr_95:int
                var_3_258 = newarray:byte[](byte.class, expr_95:int)
                var_5_259 = expr_95:int
                goto(Label_0710)
            }
        }
        
        Label_0154:
        
        if (cmpne:boolean(and:int(var_0_268:int, ldc:int(512)), ldc:int(0))) {
            var_0_268 = and:int(var_0_268:int, ldc:int(-1624486582))
        }
        else {
            if (cmpne:boolean(and:int(var_0_268:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_268 = and:int(var_0_268:int, ldc:int(-1099839447))
                goto(Label_0115)
            }
            
            var_0_268 = and:int(var_0_268:int, ldc:int(-681470746))
            var_2_C3 = stack_C3_0:byte[]
            expr_C7 = add:int(arraylength:int(stack_C5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_3_345 = newarray:byte[](byte.class, expr_C7:int)
                var_5_346 = expr_C7:int
                
                loop {
                    var_0_268 = and:int(var_0_268:int, ldc:int(-163236229))
                    var_5_346 = add:int(var_5_346:int, ldc:int(-1))
                    storeelement:byte(var_3_345:byte[], var_5_346:int, add:int(shl:int(loadelement:byte(stack_357_0:byte[], var_5_346:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_C3:byte[], add:int(var_5_346:int, xor:int(ldc:int(2584), ldc:int(2585)))), ldc:int(2)), xor:int(ldc:int(2052), ldc:int(2107)))))
                    
                    if (cmpne:boolean(var_5_346:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_C3_0 = stack_C5_0 = stack_E3_0 = stack_27B_0 = stack_2DD_0 = stack_357_0 = var_3_345:byte[]
            }
        }
        
        Label_0204:
        
        if (cmpne:boolean(and:int(var_0_268:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0154)
        }
        
        if (cmpeq:boolean(and:int(var_0_268:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_EF = initobject:String(String::<init>, stack_E3_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_F7 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16553), ldc:int(16546)))
            expr_101 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11), ldc:int(4107)))
            storeelement:String(expr_F7:String[], xor:int(ldc:int(-31992), ldc:int(-31998)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(-5502), ldc:int(4461)), and:int(ldc:int(56), ldc:int(21528))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(17422), ldc:int(17415)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(16665), ldc:int(568)), and:int(ldc:int(305), ldc:int(23097))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(26), ldc:int(31)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(16433), ldc:int(8241)), and:int(ldc:int(20542), ldc:int(10807))))
            storeelement:String(expr_101:String[], and:int(ldc:int(10115), ldc:int(6163)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(16820), ldc:int(16770)), and:int(ldc:int(187), ldc:int(15999))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(8708), ldc:int(8706)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(4155), ldc:int(1275)), and:int(ldc:int(20674), ldc:int(9537))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(-16374), ldc:int(-16373)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(16728), ldc:int(705)), and:int(ldc:int(20556), ldc:int(2134))))
            storeelement:String(expr_101:String[], and:int(ldc:int(572), ldc:int(9417)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(8261), ldc:int(2260)), xor:int(ldc:int(21588), ldc:int(21534))))
            storeelement:String(expr_101:String[], and:int(ldc:int(11526), ldc:int(-32615)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(16402), ldc:int(16472)), and:int(ldc:int(82), ldc:int(114))))
            storeelement:String(expr_101:String[], xor:int(ldc:int(8716), ldc:int(8718)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(6358), ldc:int(626)), and:int(ldc:int(17493), ldc:int(477))))
            storeelement:String(expr_101:String[], and:int(ldc:int(12581), ldc:int(1110)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, and:int(ldc:int(343), ldc:int(5245)), xor:int(ldc:int(17573), ldc:int(17663))))
            storeelement:String(expr_101:String[], and:int(ldc:int(16439), ldc:int(4303)), invokevirtual:String[expected:String](String::substring, var_3_EF:String, xor:int(ldc:int(1081), ldc:int(1123)), xor:int(ldc:int(2118), ldc:int(2087))))
            putstatic:String[](\u4d85\ub8be\u7af6\u7bad\u69d9::\u3711\u36d3\ua3b4\u5245\u600f\u4c04, expr_101:String[])
            putstatic:SimpleCommandExceptionType(\u4d85\ub8be\u7af6\u7bad\u69d9::\uc9f6\u965f\u8709\u527a\u8d90\u5245, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_F7:String[], xor:int(ldc:int(-16115), ldc:int(-16121))))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u71ae\ubded\u34df\u4975\u836c\uc84e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_692 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_692 = and:int(ldc:int(-924153407), ldc:int(-8655933))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4d85\ub8be\u7af6\u7bad\u69d9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_692 = and:int(var_3_692:int, ldc:int(-1136931764))
        }
        else {
            var_3_692 = and:int(var_3_692:int, ldc:int(-100755269))
            var_5_8A = and:int(ldc:int(12940), ldc:int(-12973))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-611), ldc:int(610)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_692:int, ldc:int(-378617933))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(26413), ldc:int(4099)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4160), ldc:int(4161)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_692 = and:int(var_3_DA:int, ldc:int(-303309581))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(16393), ldc:int(1729)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1635951799))
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1668402742))
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-640504051))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1051280081))
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1495998561))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-101754203))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0599)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1616186912))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(359446133))
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1464995470))
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(868437490))
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0982)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-914511684))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1408575195))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-328696163))
                            var_11_EB = and:int(ldc:int(9868), ldc:int(-9886))
                            goto(Label_1577)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0599:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1781222566))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-339670248))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(95709796))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-50819627))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1339584618))
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-261845889))
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1367666984))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(125027125))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1737491188))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-932197145))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1834644391))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(306266016))
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1132987261))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(2123589859))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1930256827))
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-638701829))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(7169), ldc:int(24713))
                                goto(Label_1159)
                            }
                        }
                    }
                    
                    Label_0982:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1624969170))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1820803112))
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-2022892906))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(626640191))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1291755353))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1175573435))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-353494087))
                        var_11_EB = and:int(ldc:int(18727), ldc:int(-18792))
                    }
                    
                    Label_1159:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(434190427))
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(352560346))
                        goto(Label_1435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0982)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1584073014))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_692 = and:int(var_3_692:int, ldc:int(-352588289))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1435)
                            }
                        }
                    }
                    
                    Label_1274:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-815448012))
                        goto(Label_1588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1741400691))
                            goto(Label_1159)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1870555886))
                            goto(Label_0982)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-1711917708))
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(881647136))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(1003406564))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(585817265))
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                            var_3_692 = and:int(var_3_692:int, ldc:int(-34805287))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1577)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1435:
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1159)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(747113961))
                        goto(Label_0982)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-721961660))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(2)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-917398957))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(1616139344))
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-1733032519))
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_692 = and:int(var_3_692:int, ldc:int(-923975993))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1577:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1588:
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-429110362))
                        goto(Label_1274)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-978866630))
                        goto(Label_1159)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0982)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0599)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_692:int, ldc:int(1)), ldc:int(0))) {
                        var_3_692 = and:int(var_3_692:int, ldc:int(-898970491))
                        var_17_69D = add:int(var_16_119:int, xor:int(ldc:int(4481), ldc:int(4480)))
                        looporswitchbreak()
                    }
                }
                
                var_3_692 = and:int(var_3_692:int, ldc:int(-865251965))
                
                if (cmple:boolean(var_5_8A = var_17_69D:int, sub:int(var_6_91:int, xor:int(ldc:int(-28648), ldc:int(-28647))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_692:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
