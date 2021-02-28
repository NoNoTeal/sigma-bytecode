public class \u71f1\uc910\u3bc9\u516c\u93a2.\u8bb0\u59ec\u446c\ub83f\u836c {
    public void \u8bb0\u59ec\u446c\ub83f\u836c() {
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
            invokespecial:Object(Object::<init>, this:\u8bb0\u59ec\u446c\ub83f\u836c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3d4b\uc29a\u62da\u4bc8\u527a\u446c(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u494c\ubff1\u9af2\u156b\u392e\u4cd9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p1, net.minecraft.util.text.ITextComponent p2) {
        var_3_5F : int
        var_5_66 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_6_91 : \u51fa\u6c52\u7330\u7330\u960f
        stack_CE_1 : String [generated]
        expr_B3 : Object[] [generated]
        
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
            var_3_5F = and:int(ldc:int(1600575899), ldc:int(-268705896))
            var_5_66 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Collection<\u51fa\u6c52\u7330\u7330\u960f>::iterator, p1:Collection<\u51fa\u6c52\u7330\u7330\u960f>)
            
            loop {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-7800808))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_66:Iterator))) {
                    looporswitchbreak()
                }
                
                var_6_91 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_5_66:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\uc246\u97b7\u6ec6\uc87f\uc238\u3e75, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_6_91:\u51fa\u6c52\u7330\u7330\u960f), p2:ITextComponent)
                stack_CE_1 = loadelement:String(getstatic:String[](\u8bb0\u59ec\u446c\ub83f\u836c::\u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b), and:int(ldc:int(21251), ldc:int(9223)))
                expr_B3 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(6688), ldc:int(6690)))
                storeelement:Object(expr_B3:Object[], and:int(ldc:int(-1977), ldc:int(1968)), invokevirtual:ITextComponent[expected:Object](\ua3b4\u8aa5\ub113\ubf56\u873d::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, var_6_91:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d]))
                storeelement:Object(expr_B3:Object[], and:int(ldc:int(8329), ldc:int(6673)), p2:ITextComponent[expected:Object])
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_CE_1:String, expr_B3:Object[]), and:int[expected:boolean](ldc:int(8323), ldc:int(5385)))
            }
            
            return:int(invokeinterface:int(Collection::size, p1:Collection))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u76bc\ube23\u416d\u56bd\ud4fe\u6b5f$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8bb0\u59ec\u446c\ub83f\u836c::\u494c\ubff1\u9af2\u156b\u392e\u4cd9, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u8bb0\u59ec\u446c\ub83f\u836c::\u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b), xor:int(ldc:int(452), ldc:int(453)))), invokestatic:ITextComponent(\u3c25\u5140\u7049\uae5d\ub32d::\u3e2a\u0c95\uc7fe\u74b1\u7043\u392e, p0:CommandContext, loadelement:String(getstatic:String[](\u8bb0\u59ec\u446c\ub83f\u836c::\u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b), and:int(ldc:int(21506), ldc:int(514))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u494c\u36d3\u8d98\u839e\u76bc\u9af2$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u8bb0\u59ec\u446c\ub83f\u836c::\u494c\ubff1\u9af2\u156b\u392e\u4cd9, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u8bb0\u59ec\u446c\ub83f\u836c::\u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b), and:int(ldc:int(3), ldc:int(11017)))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u8bb0\u59ec\u446c\ub83f\u836c::\u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b), and:int(ldc:int(70), ldc:int(11676))))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u446c\ud171\ub32d\u8aa5\uae87\ub6ab$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(2256), ldc:int(2259))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F4 : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_207_0 : byte[] [generated]
        stack_293_0 : byte[] [generated]
        stack_2E7_0 : byte[] [generated]
        stack_33D_0 : byte[] [generated]
        var_4_1E0 : int
        var_3_1E5 : byte[]
        var_5_1E6 : int
        var_0_220 : int
        expr_207 : byte [generated]
        stack_24E_2 : byte [generated]
        stack_223_0 : byte [generated]
        expr_296 : byte [generated]
        expr_A6 : int [generated]
        var_2_D7 : byte[]
        expr_DB : int [generated]
        var_3_2D5 : byte[]
        var_5_2D6 : int
        expr_106 : int [generated]
        var_3_32B : byte[]
        var_5_32C : int
        var_3_13A : String
        stack_1D9_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_1F4 = and:int(ldc:int(-271624182), ldc:int(-406487939))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_D7_0 = stack_D9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_207_0 = stack_293_0 = stack_2E7_0 = stack_33D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Evf1OhHu+/8IAAj88Kj3ABIIAgIIBgYX8foH+wEB/D7+5xDytRUW9f4ANQABBAC35wkJ7hISCwwDAPvo9xDmLTQqJzg=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1E0 = expr_6B:int
        var_3_1E5 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1E6 = expr_6B:int
        Label_0488:
        
        while (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_220 = and:int(var_0_1F4:int, ldc:int(-747108151))
            var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
            expr_207 = stack_24E_2 = loadelement(stack_207_0, var_5_1E6)
            
            if (cmplt:boolean(add:int(add:int(var_5_1E6:int, ldc:int(5)), neg:int(var_4_1E0:int)), ldc:int(0))) {
                stack_24E_2 = stack_223_0 = add:byte(expr_207:byte, loadelement:byte(var_3_1E5:byte[], add:int(var_5_1E6:int, ldc:int(5))))
                goto(Label_0563)
            }
            
            Label_0532:
            
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(1024)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(-748741385))
                stack_24E_2 = stack_223_0 = add:byte(expr_207:byte, ldc:byte(5))
            }
            
            Label_0563:
            
            if (cmpeq:boolean(and:int(var_0_220:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_220 = and:int(var_0_220:int, ldc:int(939549311))
                goto(Label_0532)
            }
            
            var_0_1F4 = and:int(var_0_220:int, ldc:int(-741954485))
            storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, stack_24E_2:byte)
            
            if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_207_0 = stack_293_0 = stack_2E7_0 = stack_33D_0 = var_3_1E5:byte[]
            goto(Label_0112)
        }
        
        var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-1247138364))
        Label_0628:
        
        while (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-363832510))
            var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
            expr_296 = xor:byte(loadelement:byte(stack_293_0:byte[], var_5_1E6:int), ldc:byte(53))
            storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, or:int(and:int(shl:int(expr_296:byte, xor:int(ldc:int(3334), ldc:int(3330))), ldc:int(-16)), and:int(shr:int(expr_296:byte[expected:int], xor:int(ldc:int(-32446), ldc:int(-32442))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_207_0 = stack_293_0 = stack_2E7_0 = stack_33D_0 = var_3_1E5:byte[]
            goto(Label_0171)
        }
        
        var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-1653362295))
        goto(Label_0488)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-967521853))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(1)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-172060306))
            goto(Label_0224)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(279138428))
        }
        else {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-344911910))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_1E0 = expr_A6:int
                var_3_1E5 = newarray:byte[](byte.class, expr_A6:int)
                var_5_1E6 = expr_A6:int
                goto(Label_0628)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(645323908))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(1024)), ldc:int(0))) {
                var_0_1F4 = and:int(var_0_1F4:int, ldc:int(1385833481))
                goto(Label_0112)
            }
            
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-8554146))
            var_2_D7 = stack_D7_0:byte[]
            expr_DB = add:int(arraylength:int(stack_D9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                var_3_2D5 = newarray:byte[](byte.class, expr_DB:int)
                var_5_2D6 = expr_DB:int
                
                loop {
                    var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-943498938))
                    var_5_2D6 = add:int(var_5_2D6:int, ldc:int(-1))
                    storeelement:byte(var_3_2D5:byte[], var_5_2D6:int, add:int(shl:int(loadelement:byte(stack_2E7_0:byte[], var_5_2D6:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_D7:byte[], add:int(var_5_2D6:int, xor:int(ldc:int(-32160), ldc:int(-32159)))), ldc:int(4)), xor:int(ldc:int(1179), ldc:int(1172)))))
                    
                    if (cmpne:boolean(var_5_2D6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_207_0 = stack_293_0 = stack_2E7_0 = stack_33D_0 = var_3_2D5:byte[]
            }
        }
        
        Label_0224:
        
        if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-1656257618))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-486703942))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_32B = newarray:byte[](byte.class, expr_106:int)
                var_5_32C = expr_106:int
                
                loop {
                    var_0_1F4 = and:int(var_0_1F4:int, ldc:int(-538559997))
                    var_5_32C = add:int(var_5_32C:int, ldc:int(-1))
                    storeelement:byte(var_3_32B:byte[], var_5_32C:int, add:byte(loadelement:byte(stack_33D_0:byte[], var_5_32C:int), ldc:byte(91)))
                    
                    if (cmpne:boolean(var_5_32C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_D7_0 = stack_D9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_207_0 = stack_293_0 = stack_2E7_0 = stack_33D_0 = var_3_32B:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0224)
        }
        
        if (cmpne:boolean(and:int(var_0_1F4:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_1F4:int, ldc:int(124139223))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1D9_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18567), ldc:int(1621)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4243), ldc:int(4246)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(8263), ldc:int(387)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(20633), ldc:int(-29082)), and:int(ldc:int(117), ldc:int(27029))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(-9403), ldc:int(9386)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(3605), ldc:int(3584)), and:int(ldc:int(10427), ldc:int(21277))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(3685), ldc:int(16782)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(27), ldc:int(28185)), xor:int(ldc:int(24588), ldc:int(24634))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(1090), ldc:int(294)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(16447), ldc:int(9270)), and:int(ldc:int(62), ldc:int(17533))))
        storeelement:String(expr_14C:String[], xor:int(ldc:boolean(0), ldc:boolean(1)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(12379), ldc:int(12391)), xor:int(ldc:int(-32535), ldc:int(-32598))))
        putstatic:String[](\u8bb0\u59ec\u446c\ub83f\u836c::\u4ab3\u8aa5\u97b7\u1833\u527a\u7c6b, expr_14C:String[])
    }
    
    public void \u92ee\uceb8\ub6ab\u8258\ud171\ua61f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(576706386), ldc:int(-1291851937))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\u59ec\u446c\ub83f\u836c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(788508507))
            var_5_81 = and:int(ldc:int(12040), ldc:int(-16137))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12192), ldc:int(11411)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_694:int, ldc:int(-226509058))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(646), ldc:int(647)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(9225), ldc:int(9224)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_D1:int, ldc:int(1784387575))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(129), ldc:int(128)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1966738482))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2034178207))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(676328141))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1665155334))
                        goto(Label_0864)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1042285700))
                        goto(Label_0580)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(587193977))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0580)
                            }
                            
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1591806780))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1883461625))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1763463755))
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1235155629))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-2108510605))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(727447122))
                        var_11_E2 = and:int(ldc:int(2664), ldc:int(-20073))
                        goto(Label_1564)
                    }
                    
                    Label_0580:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-782079547))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(705359956))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-496333738))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(554852849))
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1964826712))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1056946132))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0864)
                        }
                    }
                    
                    Label_0710:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-263692127))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(274304490))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(909075585))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(522073294))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-545666352))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1200584513))
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(722652666))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-295962757))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0864:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(785502291))
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1087998795))
                            goto(Label_0710)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-455862313))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1929099216))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(41), ldc:int(1043))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0978:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1922856851))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-216168967))
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-536882837))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1007324172))
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(855361404))
                        var_11_E2 = and:int(ldc:int(4255), ldc:int(-6304))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1824054885))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-279025534))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0978)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(2043711946))
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1265065055))
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0580)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-799315233))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(432572829))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(2136975186))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1429)
                            }
                        }
                    }
                    
                    Label_1279:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1305893145))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1763893755))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1570194242))
                            goto(Label_0978)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0864)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0710)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1884763022))
                            goto(Label_0580)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-907033836))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1523327238))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-150994978))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1564)
                    }
                    
                    Label_1429:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1844908703))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(693511112))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-450631271))
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-526286461))
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-2115623))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(737650036))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0978)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1879623541))
                        goto(Label_0864)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0710)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-721333430))
                        goto(Label_0580)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-295981218))
                        var_17_69F = add:int(var_16_110:int, and:int(ldc:int(26147), ldc:int(4165)))
                        looporswitchbreak()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(753987252))
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(-421540107))
                
                if (cmple:boolean(var_5_81 = var_17_69F:int, sub:int(var_6_88:int, xor:int(ldc:int(21120), ldc:int(21121))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
