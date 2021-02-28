public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ud158\ud158\ud171\ucef1\u5d20 {
    public void \ud158\ud158\ud171\ucef1\u5d20() {
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
            invokespecial:Object(Object::<init>, this:\ud158\ud158\ud171\ucef1\u5d20)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u416d\u5bc4\u965f\u7ce1\u47c2\uae87(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \ud36e\u873d\u392e\u4d85\u6198\u7330(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<com.mojang.authlib.GameProfile> p1, net.minecraft.util.text.ITextComponent p2) {
        var_3_5F : int
        var_5_6A : \uc31c\uff55\u6fb0\u4c04\u8753
        var_6_73 : int
        var_7_7B : Iterator<GameProfile>
        var_8_E6 : GameProfile
        var_9_12D : \ucef1\u4c2b\uc229\u7ce1\ud158
        stack_16F_1 : String [generated]
        expr_150 : Object[] [generated]
        var_10_18B : \u51fa\u6c52\u7330\u7330\u960f
        
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
        var_3_5F = and:int(ldc:int(219468844), ldc:int(-1961372210))
        var_5_6A = invokevirtual:\uc31c\uff55\u6fb0\u4c04\u8753(\ucb79\u8350\u7bad\u392e\u51fa::\uc87f\uc31c\u3c25\ud51e\u5bc4\u40a9, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
        var_6_73 = and:int(ldc:int(17163), ldc:int(-25356))
        var_7_7B = invokeinterface:Iterator<GameProfile>(Collection<GameProfile>::iterator, p1:Collection<GameProfile>)
        
        loop {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0186)
            }
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(2048)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-97117725))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1912604316))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_7_7B:Iterator)) {
                    var_8_E6 = checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(Iterator<GameProfile>::next, var_7_7B:Iterator<GameProfile>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uff55\u6fb0\u4c04\u8753::\u8308\u4e72\uc3e3\u873d\ud171\uceb8, var_5_6A:\uc31c\uff55\u6fb0\u4c04\u8753, var_8_E6:GameProfile))) {
                        var_9_12D = initobject:\ucef1\u4c2b\uc229\u7ce1\ud158(\ucef1\u4c2b\uc229\u7ce1\ud158::<init>, var_8_E6:GameProfile, checkcast:Date(java.util.Date.class, aconstnull:Date()), invokevirtual:String(\u8413\u5140\u64f2\uc9f6\u9937::\ucfaf\u0a06\u64ab\u7d52\u527a\u3711, p0:\u8413\u5140\u64f2\uc9f6\u9937), checkcast:Date(java.util.Date.class, aconstnull:Date()), ternaryop:String(cmpne:boolean(p2:ITextComponent, aconstnull:ITextComponent()), invokeinterface:String(ITextComponent::getString, p2:ITextComponent), aconstnull:String()))
                        invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<K, \ucef1\u4c2b\uc229\u7ce1\ud158>::\ud36e\u7330\u67d0\u8389\ub171\u647c, var_5_6A:\u9937\u7049\ubefe\u3bc9\u446c<K, \ucef1\u4c2b\uc229\u7ce1\ud158>, var_9_12D:\ucef1\u4c2b\uc229\u7ce1\ud158)
                        inc:int(var_6_73, ldc:int(1))
                        stack_16F_1 = loadelement:String(getstatic:String[](\ud158\ud158\ud171\ucef1\u5d20::\u8709\u5140\ub113\u3bd6\u5f50\u8640), xor:int(ldc:int(835), ldc:int(832)))
                        expr_150 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-30716), ldc:int(-30714)))
                        storeelement:Object(expr_150:Object[], and:int(ldc:int(12876), ldc:int(-13277)), invokestatic:ITextComponent[expected:Object](TextComponentUtils::getDisplayName, var_8_E6:GameProfile))
                        storeelement:Object(expr_150:Object[], xor:int(ldc:boolean(0), ldc:boolean(1)), invokevirtual:String[expected:Object](\u51b2\u156b\ub19c\u8640\ud4fe<T>::\u7bad\uc229\uc31c\u5f50\u120d\u62da, var_9_12D:\ucef1\u4c2b\uc229\u7ce1\ud158[expected:\u51b2\u156b\ub19c\u8640\ud4fe<GameProfile>]))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_16F_1:String, expr_150:Object[]), xor:int[expected:boolean](ldc:int(16929), ldc:int(16928)))
                        var_10_18B = invokevirtual:\u51fa\u6c52\u7330\u7330\u960f(\ucb79\u8350\u7bad\u392e\u51fa::\u4492\u416d\uf9c5\u6bb9\u34df\u527a, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)), invokevirtual:UUID(GameProfile::getId, var_8_E6:GameProfile))
                        
                        if (cmpne:boolean(var_10_18B:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                            invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\uc246\u97b7\u6ec6\uc87f\uc238\u3e75, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_10_18B:\u51fa\u6c52\u7330\u7330\u960f), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ud158\ud158\ud171\ucef1\u5d20::\u8709\u5140\ub113\u3bd6\u5f50\u8640), and:int(ldc:int(86), ldc:int(804)))))
                        }
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(733925952))
                    loopcontinue()
                }
            }
            
            Label_0162:
            
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(16)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_3_5F = and:int(var_3_5F:int, ldc:int(-912927365))
                
                if (cmpeq:boolean(var_6_73:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\ud158\ud158\ud171\ucef1\u5d20::\u67e9\u3504\uf995\u62da\u516c\u76bc)))
                }
            }
            
            Label_0186:
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2097152)), ldc:int(0))) {
                return:int(var_6_73:int)
            }
            
            var_3_5F = and:int(var_3_5F:int, ldc:int(842851506))
        }
    }
    
    private static int lambda$\u156b\ufcaf\u8413\u6c52\u8709\u5f50$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud158\ud158\ud171\ucef1\u5d20::\ud36e\u873d\u392e\u4d85\u6198\u7330, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<GameProfile>(\ubf56\u7e3f\ua61f\u8753\u5f50::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, p0:CommandContext, loadelement:String(getstatic:String[](\ud158\ud158\ud171\ucef1\u5d20::\u8709\u5140\ub113\u3bd6\u5f50\u8640), and:int(ldc:int(29313), ldc:int(101)))), invokestatic:ITextComponent(\u3c25\u5140\u7049\uae5d\ub32d::\u3e2a\u0c95\uc7fe\u74b1\u7043\u392e, p0:CommandContext, loadelement:String(getstatic:String[](\ud158\ud158\ud171\ucef1\u5d20::\u8709\u5140\ub113\u3bd6\u5f50\u8640), and:int(ldc:int(1891), ldc:int(10250))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5d20\u67d0\u9af2\u6b5f\uc9f6\u8d98$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud158\ud158\ud171\ucef1\u5d20::\ud36e\u873d\u392e\u4d85\u6198\u7330, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<GameProfile>(\ubf56\u7e3f\ua61f\u8753\u5f50::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, p0:CommandContext, loadelement:String(getstatic:String[](\ud158\ud158\ud171\ucef1\u5d20::\u8709\u5140\ub113\u3bd6\u5f50\u8640), xor:int(ldc:int(4224), ldc:int(4225)))), checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, aconstnull:ITextComponent())))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud523\u7c6b\u4492\ud51e\ub19c\u1187$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(2053), ldc:int(2054))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2C6 : int
        expr_6E : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_255_0 : byte[] [generated]
        stack_2D9_0 : byte[] [generated]
        stack_317_0 : byte[] [generated]
        stack_36D_0 : byte[] [generated]
        var_4_237 : int
        var_3_23C : byte[]
        var_5_23D : int
        var_0_24B : int
        expr_255 : byte [generated]
        stack_293_2 : byte [generated]
        stack_271_0 : byte [generated]
        var_0_87 : int
        expr_9C : int [generated]
        var_2_D3 : byte[]
        expr_D7 : int [generated]
        var_3_305 : byte[]
        var_5_306 : int
        expr_118 : int [generated]
        var_3_35B : byte[]
        var_5_35C : int
        expr_36D : byte [generated]
        var_3_15A : String
        expr_162 : String[] [generated]
        expr_16C : String[] [generated]
        
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
        var_0_2C6 = and:int(ldc:int(-608068661), ldc:int(2044928447))
        expr_6E = arraylength:int(stack_9A_0 = stack_9C_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_255_0 = stack_2D9_0 = stack_317_0 = stack_36D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("hAzsEAgA8AzoBFWvBAwB3xQg9NwEBBAIAPAM6ARVrwQMAes4CMD4CEAYoGSgbKRQrCAQzFGnLNhA0AQA5Aj8Wa8EDADkBAg00PhQxOhMvCzIBEQNdg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_237 = expr_6E:int
        var_3_23C = newarray:byte[](byte.class, expr_6E:int)
        var_5_23D = expr_6E:int
        Label_0575:
        
        while (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_24B = and:int(var_0_2C6:int, ldc:int(-1111266853))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            expr_255 = stack_293_2 = loadelement(stack_255_0, var_5_23D)
            
            if (cmplt:boolean(add:int(add:int(var_5_23D:int, ldc:int(1)), neg:int(var_4_237:int)), ldc:int(0))) {
                stack_293_2 = stack_271_0 = add:byte(expr_255:byte, loadelement:byte(var_3_23C:byte[], add:int(var_5_23D:int, ldc:int(1))))
                goto(Label_0641)
            }
            
            Label_0610:
            
            if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_24B = and:int(var_0_24B:int, ldc:int(-825553001))
                stack_293_2 = stack_271_0 = add:byte(expr_255:byte, ldc:byte(1))
            }
            
            Label_0641:
            
            if (cmpne:boolean(and:int(var_0_24B:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0610)
            }
            
            var_0_2C6 = and:int(var_0_24B:int, ldc:int(-289018049))
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, stack_293_2:byte)
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_255_0 = stack_2D9_0 = stack_317_0 = stack_36D_0 = var_3_23C:byte[]
            goto(Label_0115)
        }
        
        Label_0697:
        
        while (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(65536)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(428945743))
            var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
            storeelement:byte(var_3_23C:byte[], var_5_23D:int, xor:byte(add:byte(loadelement:byte(stack_2D9_0:byte[], var_5_23D:int), ldc:byte(43)), ldc:byte(98)))
            
            if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_255_0 = stack_2D9_0 = stack_317_0 = stack_36D_0 = var_3_23C:byte[]
            goto(Label_0161)
        }
        
        var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1592253572))
        goto(Label_0575)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0285)
        }
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_87 = and:int(var_0_2C6:int, ldc:int(-1115207264))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(1056937739))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_237 = expr_9C:int
                var_3_23C = newarray:byte[](byte.class, expr_9C:int)
                var_5_23D = expr_9C:int
                goto(Label_0697)
            }
        }
        
        Label_0161:
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0285)
        }
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_87 = and:int(var_0_2C6:int, ldc:int(-684847265))
        }
        else {
            if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(8192)), ldc:int(0))) {
                var_0_2C6 = and:int(var_0_2C6:int, ldc:int(403923494))
                goto(Label_0115)
            }
            
            var_0_87 = and:int(var_0_2C6:int, ldc:int(-390083799))
            var_2_D3 = stack_D3_0:byte[]
            expr_D7 = add:int(arraylength:int(stack_D5_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_3_305 = newarray:byte[](byte.class, expr_D7:int)
                var_5_306 = expr_D7:int
                
                loop {
                    var_0_87 = and:int(var_0_87:int, ldc:int(-336098447))
                    var_5_306 = add:int(var_5_306:int, ldc:int(-1))
                    storeelement:byte(var_3_305:byte[], var_5_306:int, add:int(shl:int(loadelement:byte(stack_317_0:byte[], var_5_306:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_D3:byte[], add:int(var_5_306:int, and:int(ldc:int(645), ldc:int(1)))), ldc:int(6)), xor:int(ldc:int(2051), ldc:int(2048)))))
                    
                    if (cmpne:boolean(var_5_306:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_255_0 = stack_2D9_0 = stack_317_0 = stack_36D_0 = var_3_305:byte[]
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_87:int, ldc:int(-2146666688))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_2C6 = and:int(var_0_87:int, ldc:int(1804648027))
                goto(Label_0161)
            }
            
            if (cmpeq:boolean(and:int(var_0_87:int, ldc:int(65536)), ldc:int(0))) {
                var_0_2C6 = and:int(var_0_87:int, ldc:int(185919202))
                goto(Label_0115)
            }
            
            var_0_2C6 = and:int(var_0_87:int, ldc:int(1806012037))
            expr_118 = arraylength:int(stack_118_0:byte[])
            
            if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                var_3_35B = newarray:byte[](byte.class, expr_118:int)
                var_5_35C = expr_118:int
                
                loop {
                    var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-811922257))
                    var_5_35C = add:int(var_5_35C:int, ldc:int(-1))
                    expr_36D = loadelement:byte(stack_36D_0:byte[], var_5_35C:int)
                    storeelement:byte(var_3_35B:byte[], var_5_35C:int, or:int(and:int(shl:int(expr_36D:byte, and:int(ldc:int(260), ldc:int(1572))), ldc:int(-16)), and:int(shr:int(expr_36D:byte[expected:int], xor:int(ldc:int(6690), ldc:int(6694))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_35C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_D3_0 = stack_D5_0 = stack_116_0 = stack_118_0 = stack_14E_0 = stack_255_0 = stack_2D9_0 = stack_317_0 = stack_36D_0 = var_3_35B:byte[]
            }
        }
        
        Label_0285:
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_87 = and:int(var_0_2C6:int, ldc:int(846524988))
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0161)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(847617702))
            goto(Label_0115)
        }
        
        var_3_15A = initobject:String(String::<init>, stack_14E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_162 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(21526), ldc:int(2631)))
        expr_16C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(22694), ldc:int(350)))
        storeelement:String(expr_16C:String[], and:int(ldc:int(22545), ldc:int(-22550)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(1768), ldc:int(-18154)), and:int(ldc:int(803), ldc:int(203))))
        storeelement:String(expr_162:String[], and:int(ldc:int(143), ldc:int(2309)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(675), ldc:int(672)), and:int(ldc:int(27158), ldc:int(5406))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(2059), ldc:int(30179)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(-32686), ldc:int(-32700)), and:int(ldc:int(17530), ldc:int(6186))))
        storeelement:String(expr_16C:String[], xor:int(ldc:int(-31871), ldc:int(-31867)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(-28582), ldc:int(-28560)), xor:int(ldc:int(4116), ldc:int(4179))))
        storeelement:String(expr_16C:String[], and:int(ldc:int(24586), ldc:int(594)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(6), ldc:int(65)), and:int(ldc:int(18029), ldc:int(4189))))
        storeelement:String(expr_16C:String[], xor:int(ldc:int(576), ldc:int(577)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, xor:int(ldc:int(-32570), ldc:int(-32629)), and:int(ldc:int(118), ldc:int(1116))))
        putstatic:String[](\ud158\ud158\ud171\ucef1\u5d20::\u8709\u5140\ub113\u3bd6\u5f50\u8640, expr_16C:String[])
        putstatic:SimpleCommandExceptionType(\ud158\ud158\ud171\ucef1\u5d20::\u67e9\u3504\uf995\u62da\u516c\u76bc, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_162:String[], and:int(ldc:int(8197), ldc:int(6285))))))
    }
    
    public void \u3dd3\uc87f\u516c\u5fe1\u12b2\u8350(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A7 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6B2 : int
        
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
        var_3_6A7 = and:int(ldc:int(2016905704), ldc:int(1803533307))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud158\ud158\ud171\ucef1\u5d20[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-340402735))
        }
        else {
            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-343954690))
            var_5_8A = and:int(ldc:int(-21365), ldc:int(17236))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30584), ldc:int(30503)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6A7:int, ldc:int(-625479765))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(2050), ldc:int(2051)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(3333), ldc:int(24577)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6A7 = and:int(var_3_E3:int, ldc:int(1765255405))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(21505), ldc:int(2851)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(188077475))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1888662852))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(330388545))
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-596129347))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0563)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-489439161))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-717754871))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1114153821))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-4223750))
                            var_11_F4 = and:int(ldc:int(-27333), ldc:int(19076))
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0563:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1343913929))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1747187126))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1073705195))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-184704817))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1329064681))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(755884739))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(572425921))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1040578090))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(336886517))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2057494412))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(401869976))
                            goto(Label_0563)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1881400791))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(716156536))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-813700929))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-631906410))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1264298091))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1672013094))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0563)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1160087056))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1412445207))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-109060114))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(5156), ldc:int(5157))
                                goto(Label_1160)
                            }
                        }
                    }
                    
                    Label_0983:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1952725426))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-448878364))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1145004307))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2058312056))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1274797551))
                            goto(Label_0563)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1265420177))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-344482131))
                        var_11_F4 = and:int(ldc:int(3301), ldc:int(-3320))
                    }
                    
                    Label_1160:
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1886438282))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(43374354))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-457119324))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1486714707))
                            goto(Label_0563)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1027882450))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-859833368))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1426)
                            }
                        }
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1521310204))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2111096895))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1160)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0983)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1491246320))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1113071059))
                            goto(Label_0563)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1240984315))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1385245292))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-462510088))
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2097385656))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1964190243))
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1224212202))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B2 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1061215459))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2105806526))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0983)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1183008754))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(974891782))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1019070031))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-641758728))
                        var_17_6B2 = add:int(var_16_122:int, xor:int(ldc:int(144), ldc:int(145)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A7 = and:int(var_3_6A7:int, ldc:int(833146278))
                }
                
                var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-545272584))
                
                if (cmple:boolean(var_5_8A = var_17_6B2:int, sub:int(var_6_91:int, and:int(ldc:int(545), ldc:int(9227))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-965742076))
            goto(Label_0108)
        }
    }
}
