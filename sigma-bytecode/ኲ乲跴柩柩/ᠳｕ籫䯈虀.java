public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u1833\uff55\u7c6b\u4bc8\u8640 {
    public void \u1833\uff55\u7c6b\u4bc8\u8640() {
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
            invokespecial:Object(Object::<init>, this:\u1833\uff55\u7c6b\u4bc8\u8640)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u98a4\ud51e\u416d\u5fe1\uc4d2\u416d(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \ubefe\uf995\u527a\uafe7\uae5d\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1, net.minecraft.util.text.ITextComponent p2) {
        var_6_81 : \u51fa\u6c52\u7330\u7330\u960f
        
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
        
        if (invokevirtual:boolean(Matcher::matches, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\u1833\uff55\u7c6b\u4bc8\u8640::\ub18d\u8413\u6c56\u8258\u51fa\u61a4), p1:String[expected:CharSequence]))) {
            return:int(invokestatic:int(\u1833\uff55\u7c6b\u4bc8\u8640::\u120d\ub113\ua562\uae5d\u946b\uc3e3, p0:\u8413\u5140\u64f2\uc9f6\u9937, p1:String, p2:ITextComponent))
        }
        
        var_6_81 = invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\u8aa5\u67d0\u56bd\u6435\u3776\u4f52, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)), p1:String)
        
        if (cmpeq:boolean(var_6_81:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u1833\uff55\u7c6b\u4bc8\u8640::\u4c04\ud12e\u3504\u92ff\u392e\uf9c5)))
        }
        
        return:int(invokestatic:int(\u1833\uff55\u7c6b\u4bc8\u8640::\u120d\ub113\ua562\uae5d\u946b\uc3e3, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokevirtual:String(\u51fa\u6c52\u7330\u7330\u960f::\u8258\u4c04\u3711\u5db4\u0800\uc3e3, var_6_81:\u51fa\u6c52\u7330\u7330\u960f), p2:ITextComponent))
    }
    
    private static int \u120d\ub113\ua562\uae5d\u946b\uc3e3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1, net.minecraft.util.text.ITextComponent p2) {
        var_5_6A : \u3d4b\uc4d2\u9937\u98a4\u6198
        var_6_85 : List<\u51fa\u6c52\u7330\u7330\u960f>
        var_7_C3 : \ud51e\u494c\uc910\u3e75\u34df
        stack_FE_1 : String [generated]
        expr_E3 : Object[] [generated]
        stack_165_1 : String [generated]
        expr_141 : Object[] [generated]
        var_8_121 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        
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
        var_5_6A = invokevirtual:\u3d4b\uc4d2\u9937\u98a4\u6198(\ucb79\u8350\u7bad\u392e\u51fa::\u6c52\u8308\u4c2b\u120d\u0a06\u4179, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u3d4b\uc4d2\u9937\u98a4\u6198::\ub8be\uc246\u47c2\u3776\u6c52\ud51e, var_5_6A:\u3d4b\uc4d2\u9937\u98a4\u6198, p1:String))) {
            var_6_85 = invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\uc2e8\u8709\u8d98\uc2e8\u76bc\ud51e, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)), p1:String)
            var_7_C3 = initobject:\ud51e\u494c\uc910\u3e75\u34df(\ud51e\u494c\uc910\u3e75\u34df::<init>, p1:String, checkcast:Date(java.util.Date.class, aconstnull:Date()), invokevirtual:String(\u8413\u5140\u64f2\uc9f6\u9937::\ucfaf\u0a06\u64ab\u7d52\u527a\u3711, p0:\u8413\u5140\u64f2\uc9f6\u9937), checkcast:Date(java.util.Date.class, aconstnull:Date()), ternaryop:String(cmpne:boolean(p2:ITextComponent, aconstnull:ITextComponent()), invokeinterface:String(ITextComponent::getString, p2:ITextComponent), aconstnull:String()))
            invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, \ud51e\u494c\uc910\u3e75\u34df>::\ud36e\u7330\u67d0\u8389\ub171\u647c, var_5_6A:\u9937\u7049\ubefe\u3bc9\u446c<K, \ud51e\u494c\uc910\u3e75\u34df>, var_7_C3:\ud51e\u494c\uc910\u3e75\u34df)
            stack_FE_1 = loadelement:String(getstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975), xor:int(ldc:int(16387), ldc:int(16384)))
            expr_E3 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4162), ldc:int(1410)))
            storeelement:Object(expr_E3:Object[], and:int(ldc:int(-28910), ldc:int(16620)), p1:String[expected:Object])
            storeelement:Object(expr_E3:Object[], and:int(ldc:int(10899), ldc:int(5185)), invokevirtual:String[expected:Object](\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u7bad\uc229\uc31c\u5f50\u120d\u62da, var_7_C3:\ud51e\u494c\uc910\u3e75\u34df[expected:\u51b2\u156b\ub19c\u8640\ud4fe<String>]))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_FE_1:String, expr_E3:Object[]), xor:int[expected:boolean](ldc:int(20480), ldc:int(20481)))
            
            if (logicalnot:boolean(invokeinterface:boolean(List::isEmpty, var_6_85:List))) {
                stack_165_1 = loadelement:String(getstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975), xor:int(ldc:int(3075), ldc:int(3079)))
                expr_141 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16482), ldc:int(8594)))
                storeelement:Object(expr_141:Object[], and:int(ldc:int(-29052), ldc:int(16755)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(List<E>::size, var_6_85:List<\u51fa\u6c52\u7330\u7330\u960f>)))
                storeelement:Object(expr_141:Object[], xor:int(ldc:int(1576), ldc:int(1577)), invokestatic:IFormattableTextComponent[expected:Object](\u7bad\u71ae\ua61f\ub102\u8413::\u6198\ub1b9\uc7fe\ub32d\uff55\u416d, var_6_85:List<\u51fa\u6c52\u7330\u7330\u960f>))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_165_1:String, expr_141:Object[]), xor:int[expected:boolean](ldc:int(5140), ldc:int(5141)))
            }
            
            var_8_121 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, var_6_85:List<\u51fa\u6c52\u7330\u7330\u960f>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_8_121:Iterator)) {
                invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\uc246\u97b7\u6ec6\uc87f\uc238\u3e75, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_8_121:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975), xor:int(ldc:int(-31676), ldc:int(-31679)))))
            }
            
            return:int(invokeinterface:int(List<E>::size, var_6_85:List<\u51fa\u6c52\u7330\u7330\u960f>))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u1833\uff55\u7c6b\u4bc8\u8640::\u47c2\ud171\u9937\uf94d\uae87\u34df)))
    }
    
    private static int lambda$\u47c2\u62da\u92ff\u7d52\u965f\u4ab3$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u1833\uff55\u7c6b\u4bc8\u8640::\ubefe\uf995\u527a\uafe7\uae5d\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975), xor:int(ldc:int(-16248), ldc:int(-16247)))), invokestatic:ITextComponent(\u3c25\u5140\u7049\uae5d\ub32d::\u3e2a\u0c95\uc7fe\u74b1\u7043\u392e, p0:CommandContext, loadelement:String(getstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975), and:int(ldc:int(8263), ldc:int(4226))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7049\u6cfe\u7d52\uc238\uc87f\u0a06$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u1833\uff55\u7c6b\u4bc8\u8640::\ubefe\uf995\u527a\uafe7\uae5d\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975), xor:int(ldc:int(-32670), ldc:int(-32669)))), checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, aconstnull:ITextComponent())))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u61a4\u0a06\u5f50\ufcaf\u960f\u52d3$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(20483), ldc:int(10247))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_91 : int
        expr_6E : int [generated]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_274_0 : byte[] [generated]
        stack_2FA_0 : byte[] [generated]
        stack_351_0 : byte[] [generated]
        var_4_255 : int
        var_3_25A : byte[]
        var_5_25B : int
        var_0_26A : int
        expr_274 : byte [generated]
        stack_2BD_2 : byte [generated]
        stack_29A_0 : byte [generated]
        expr_2FD : byte [generated]
        expr_9F : int [generated]
        var_2_CE : byte[]
        expr_D2 : int [generated]
        var_3_33F : byte[]
        var_5_340 : int
        var_3_FA : String
        expr_102 : String[] [generated]
        expr_10C : String[] [generated]
        var_3_20B : String[]
        
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
        var_0_91 = and:int(ldc:int(1825740763), ldc:int(-1684085005))
        expr_6E = arraylength:int(stack_9D_0 = stack_9F_0 = stack_CE_0 = stack_D0_0 = stack_EE_0 = stack_274_0 = stack_2FA_0 = stack_351_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("cm/Z+GbxDzjAQLEWiz/Z2Eg2CDi/kzAX0dhIPmKeavBv2fhm8Q84wECxFos/2dhINgg4v5MwF9HYSD5inmrwb9n4ZvEPOMBAsRaLP9nYSDYIOL+TMBfR2Eg+Yp5q8G/Z+GbxDzjAQLEWiz/Z2Eg2CDi/kzAX0dhIPmLgxhBYCuZAaGgQAKBQyFDqlhBY6EjKvvBIILgIyGgQAKBQyFDqlhBY6EjK7hi4QKhgEACgUMhQ6pYQWOhIyu4YOHBo2OjIaBAAoFDIUOqWEFjoSMoeOFAAMFAA8EDAOKBI2KDIYFDaziA4gGAA+NDYsKruSEgoCFj40AhIsOhw4ABIYHiYGIBbSg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_255 = expr_6E:int
        var_3_25A = newarray:byte[](byte.class, expr_6E:int)
        var_5_25B = expr_6E:int
        Label_0605:
        
        while (cmpne:boolean(and:int(var_0_91:int, ldc:int(64)), ldc:int(0))) {
            var_0_26A = and:int(var_0_91:int, ldc:int(1822397439))
            var_5_25B = add:int(var_5_25B:int, ldc:int(-1))
            expr_274 = stack_2BD_2 = loadelement(stack_274_0, var_5_25B)
            
            if (cmplt:boolean(add:int(add:int(var_5_25B:int, ldc:int(1)), neg:int(var_4_255:int)), ldc:int(0))) {
                stack_2BD_2 = stack_29A_0 = add:byte(expr_274:byte, loadelement:byte(var_3_25A:byte[], add:int(var_5_25B:int, ldc:int(1))))
                goto(Label_0682)
            }
            
            Label_0641:
            
            if (cmpeq:boolean(and:int(var_0_26A:int, ldc:int(131072)), ldc:int(0))) {
                var_0_26A = and:int(var_0_26A:int, ldc:int(1369761841))
            }
            else {
                var_0_26A = and:int(var_0_26A:int, ldc:int(-1682523529))
                stack_2BD_2 = stack_29A_0 = add:byte(expr_274:byte, ldc:byte(1))
            }
            
            Label_0682:
            
            if (cmpeq:boolean(and:int(var_0_26A:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0641)
            }
            
            var_0_91 = and:int(var_0_26A:int, ldc:int(-121898281))
            storeelement:byte(var_3_25A:byte[], var_5_25B:int, stack_2BD_2:byte)
            
            if (cmpne:boolean(var_5_25B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_CE_0 = stack_D0_0 = stack_EE_0 = stack_274_0 = stack_2FA_0 = stack_351_0 = var_3_25A:byte[]
            goto(Label_0115)
        }
        
        Label_0739:
        
        while (cmpeq:boolean(and:int(var_0_91:int, ldc:int(65536)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(798928471))
            var_5_25B = add:int(var_5_25B:int, ldc:int(-1))
            expr_2FD = xor:byte(loadelement:byte(stack_2FA_0:byte[], var_5_25B:int), ldc:byte(96))
            storeelement:byte(var_3_25A:byte[], var_5_25B:int, add:int(or:int(and:int(shl:int(expr_2FD:byte, and:int(ldc:int(16836), ldc:int(8245))), ldc:int(-16)), and:int(shr:int(expr_2FD:byte[expected:int], and:int(ldc:int(20934), ldc:int(4))), ldc:int(15))), ldc:int(78)))
            
            if (cmpne:boolean(var_5_25B:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_CE_0 = stack_D0_0 = stack_EE_0 = stack_274_0 = stack_2FA_0 = stack_351_0 = var_3_25A:byte[]
            goto(Label_0164)
        }
        
        goto(Label_0605)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_91:int, ldc:int(8192)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(-749355686))
            goto(Label_0215)
        }
        
        if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(1)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(57455370))
        }
        else {
            var_0_91 = and:int(var_0_91:int, ldc:int(1857539839))
            expr_9F = arraylength:int(stack_9F_0:byte[])
            
            if (cmpne:boolean(expr_9F:int, ldc:int(0))) {
                var_4_255 = expr_9F:int
                var_3_25A = newarray:byte[](byte.class, expr_9F:int)
                var_5_25B = expr_9F:int
                goto(Label_0739)
            }
        }
        
        Label_0164:
        
        if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(-1674640429))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_91 = and:int(var_0_91:int, ldc:int(593467953))
                goto(Label_0115)
            }
            
            var_0_91 = and:int(var_0_91:int, ldc:int(213015423))
            var_2_CE = stack_CE_0:byte[]
            expr_D2 = add:int(arraylength:int(stack_D0_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D2:int, ldc:int(0))) {
                var_3_33F = newarray:byte[](byte.class, expr_D2:int)
                var_5_340 = expr_D2:int
                
                loop {
                    var_0_91 = and:int(var_0_91:int, ldc:int(-862799117))
                    var_5_340 = add:int(var_5_340:int, ldc:int(-1))
                    storeelement:byte(var_3_33F:byte[], var_5_340:int, add:int(shl:int(loadelement:byte(stack_351_0:byte[], var_5_340:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_CE:byte[], add:int(var_5_340:int, and:int(ldc:int(593), ldc:int(1)))), ldc:int(7)), and:int(ldc:int(2727), ldc:int(337)))))
                    
                    if (cmpne:boolean(var_5_340:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_CE_0 = stack_D0_0 = stack_EE_0 = stack_274_0 = stack_2FA_0 = stack_351_0 = var_3_33F:byte[]
            }
        }
        
        Label_0215:
        
        if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0164)
        }
        
        if (cmpne:boolean(and:int(var_0_91:int, ldc:int(16)), ldc:int(0))) {
            var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_102 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17025), ldc:int(17032)))
            expr_10C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16463), ldc:int(6569)))
            storeelement:String(expr_102:String[], xor:int(ldc:int(4641), ldc:int(4647)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(12556), ldc:int(-12557)), xor:int(ldc:int(374), ldc:int(266))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(-8046), ldc:int(1888)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(16755), ldc:int(16655)), and:int(ldc:int(138), ldc:int(24963))))
            storeelement:String(expr_102:String[], xor:int(ldc:int(8582), ldc:int(8590)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(2258), ldc:int(130)), and:int(ldc:int(471), ldc:int(5311))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(4100), ldc:int(612)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(11415), ldc:int(20631)), xor:int(ldc:int(4259), ldc:int(4105))))
            storeelement:String(expr_102:String[], and:int(ldc:int(21519), ldc:int(8791)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(27002), ldc:int(27088)), xor:int(ldc:int(400), ldc:int(336))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(12931), ldc:int(331)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(16598), ldc:int(1473)), and:int(ldc:int(16630), ldc:int(10462))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(20555), ldc:int(20558)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(4566), ldc:int(1783)), xor:int(ldc:int(-30063), ldc:int(-30105))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(17553), ldc:int(17555)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(-32568), ldc:int(-32706)), xor:int(ldc:int(41), ldc:int(213))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(-15871), ldc:int(-15872)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, xor:int(ldc:int(-24500), ldc:int(-24400)), and:int(ldc:int(16838), ldc:int(7426))))
            putstatic:String[](\u1833\uff55\u7c6b\u4bc8\u8640::\ufe34\u8389\u446c\ufe34\u7873\u4975, expr_10C:String[])
            var_3_20B = expr_102:String[]
            putstatic:Pattern(\u1833\uff55\u7c6b\u4bc8\u8640::\ub18d\u8413\u6c56\u8258\u51fa\u61a4, invokestatic:Pattern(Pattern::compile, loadelement:String(var_3_20B:String[], and:int(ldc:int(670), ldc:int(9286)))))
            putstatic:SimpleCommandExceptionType(\u1833\uff55\u7c6b\u4bc8\u8640::\u4c04\ud12e\u3504\u92ff\u392e\uf9c5, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_20B:String[], xor:int(ldc:int(24579), ldc:int(24580))))))
            putstatic:SimpleCommandExceptionType(\u1833\uff55\u7c6b\u4bc8\u8640::\u47c2\ud171\u9937\uf94d\uae87\u34df, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_20B:String[], xor:int(ldc:int(3098), ldc:int(3090))))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ubb2b\u67d0\u4f52\u647c\uff55\u6b0d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6E7 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6F2 : int
        
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
        var_3_6E7 = and:int(ldc:int(-2028264164), ldc:int(-1558598371))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1833\uff55\u7c6b\u4bc8\u8640[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-2034281057))
            var_5_81 = and:int(ldc:int(3466), ldc:int(-28144))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-181), ldc:int(180)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6E7:int, ldc:int(-1683147393))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(1025), ldc:int(16785)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(13345), ldc:int(2069)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6E7 = and:int(var_3_DA:int, ldc:int(-1025940065))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-26623), ldc:int(-26624)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(528831368))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1238615269))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1787127568))
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(962058677))
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-271111765))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1391012187))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1955774563))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0906)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1074456734))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(911962068))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1756270132))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-77740194))
                            var_11_EB = and:int(ldc:int(18675), ldc:int(-26876))
                            goto(Label_1625)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1007709259))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1552622132))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(759084593))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1404153952))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(795328004))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1705101818))
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-378284590))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(256526553))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-546736833))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0906)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1698128902))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-2092685508))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(161965053))
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-11156048))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(111646907))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2068156907))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1729963811))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1237481665))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0906:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2046766139))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(471354322))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-274791091))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-481307267))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(737), ldc:int(9489))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1022:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1109497414))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1899662398))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1415525847))
                            goto(Label_0906)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1286404190))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1962855037))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-364013764))
                        var_11_EB = and:int(ldc:int(1376), ldc:int(-1377))
                    }
                    
                    Label_1191:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(980523554))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-680125301))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-929786532))
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1707948013))
                            goto(Label_0906)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1923205447))
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(519598904))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-348434625))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1479)
                            }
                        }
                    }
                    
                    Label_1334:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-667069706))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1191)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1082356896))
                            goto(Label_1022)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0906)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1740138470))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-224311185))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1343688977))
                            loopcontinue()
                        }
                        
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-682815620))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1625)
                    }
                    
                    Label_1479:
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1459465457))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-2118576975))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-613427693))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(258421437))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1670882283))
                        loopcontinue()
                    }
                    
                    var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-675414049))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1625:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F2 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1636:
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(661078018))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(1233750064))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1383858504))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1022)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(582717870))
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(2086220580))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(415955182))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1301442690))
                        var_17_6F2 = add:int(var_16_119:int, and:int(ldc:int(259), ldc:int(8769)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6E7 = and:int(var_3_6E7:int, ldc:int(-1436975140))
                
                if (cmple:boolean(var_5_81 = var_17_6F2:int, sub:int(var_6_88:int, xor:int(ldc:int(16416), ldc:int(16417))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_6E7:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6E7 = and:int(var_3_6E7:int, ldc:int(236485735))
            goto(Label_0108)
        }
    }
}
