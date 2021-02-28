public class \ub113\ufcaf\u3c25\u071d\u97b7.\u446c\u1833\u72f1\u6bb9\ub171 {
    public void \u446c\u1833\u72f1\u6bb9\ub171() {
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
            invokespecial:Object(Object::<init>, this:\u446c\u1833\u72f1\u6bb9\ub171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8d98\u8cae\u494c\u76bc\u4c04\u8c8a(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \uf9c5\u516c\u3504\u4179\ud217\ub8be(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<com.mojang.authlib.GameProfile> p1) {
        var_2_5F : int
        var_4_67 : \ucb79\u8350\u7bad\u392e\u51fa
        var_5_70 : int
        var_6_78 : Iterator<GameProfile>
        var_7_F3 : GameProfile
        stack_149_1 : String [generated]
        expr_12C : Object[] [generated]
        
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
        var_2_5F = and:int(ldc:int(-2006717508), ldc:int(-592992758))
        var_4_67 = invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937))
        var_5_70 = and:int(ldc:int(-22931), ldc:int(6546))
        var_6_78 = invokeinterface:Iterator<GameProfile>(Collection<GameProfile>::iterator, p1:Collection<GameProfile>)
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1097304975))
                goto(Label_0191)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(456912552))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_78:Iterator)) {
                    var_7_F3 = checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(Iterator<GameProfile>::next, var_6_78:Iterator<GameProfile>))
                    
                    if (invokevirtual:boolean(\ucb79\u8350\u7bad\u392e\u51fa::\ub7dc\u624e\u183a\uc9f6\u8350\uae87, var_4_67:\ucb79\u8350\u7bad\u392e\u51fa, var_7_F3:GameProfile)) {
                        invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u88c5\ub113\u385b\uc2bd\ud12e\u5fe1, var_4_67:\ucb79\u8350\u7bad\u392e\u51fa, var_7_F3:GameProfile)
                        inc:int(var_5_70, ldc:int(1))
                        stack_149_1 = loadelement:String(getstatic:String[](\u446c\u1833\u72f1\u6bb9\ub171::\u12b2\u7006\u36d3\u965f\u64f2\u67d0), and:int(ldc:int(9219), ldc:int(17222)))
                        expr_12C = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4104), ldc:int(4105)))
                        storeelement:Object(expr_12C:Object[], and:int(ldc:int(18508), ldc:int(-18509)), invokevirtual:String[expected:Object](GameProfile::getName, checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(Iterator<GameProfile>::next, invokeinterface:Iterator<GameProfile>(Collection<GameProfile>::iterator, p1:Collection<GameProfile>)))))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_149_1:String, expr_12C:Object[]), xor:int[expected:boolean](ldc:int(-28672), ldc:int(-28671)))
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1319365468))
                    loopcontinue()
                }
            }
            
            Label_0159:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1208576790))
            }
            else {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(1504161482))
                
                if (cmpeq:boolean(var_5_70:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u446c\u1833\u72f1\u6bb9\ub171::\u4179\ud4fe\ub8be\u8c8a\ua3b4\u7049)))
                }
            }
            
            Label_0191:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0159)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(512)), ldc:int(0))) {
                invokevirtual:void(\u88c5\ud171\ub113\u6435\ud51e::\u385b\u6ec6\ubefe\u983f\u5fe1\u7d52, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937), p0:\u8413\u5140\u64f2\uc9f6\u9937)
                return:int(var_5_70:int)
            }
            
            var_2_5F = and:int(var_2_5F:int, ldc:int(1845030603))
        }
    }
    
    private static int lambda$\u51b2\uc4d2\u4f52\u9af2\u946b\u4e72$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u446c\u1833\u72f1\u6bb9\ub171::\uf9c5\u516c\u3504\u4179\ud217\ub8be, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<GameProfile>(\ubf56\u7e3f\ua61f\u8753\u5f50::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, p0:CommandContext, loadelement:String(getstatic:String[](\u446c\u1833\u72f1\u6bb9\ub171::\u12b2\u7006\u36d3\u965f\u64f2\u67d0), xor:int(ldc:int(-14272), ldc:int(-14271))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u99f7\ucb79\uc84e\u8350\uae87\u5140$1(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokevirtual:String[](\ucb79\u8350\u7bad\u392e\u51fa::\u5654\u6c52\u836c\u0a06\u946b\ub8be, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u156b\u8bb0\ub102\u6b5f\ucef1\uf9c5$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(-13310), ldc:int(-13311))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_204 : int
        expr_6C : int [generated]
        stack_9A_0 : byte[] [generated]
        stack_9C_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FB_0 : byte[] [generated]
        stack_FD_0 : byte[] [generated]
        stack_13C_0 : byte[] [generated]
        stack_217_0 : byte[] [generated]
        stack_29D_0 : byte[] [generated]
        stack_2DB_0 : byte[] [generated]
        stack_331_0 : byte[] [generated]
        var_4_1EF : int
        var_3_1F4 : byte[]
        var_5_1F5 : int
        var_0_20D : int
        expr_217 : byte [generated]
        stack_257_2 : byte [generated]
        stack_234_0 : byte [generated]
        expr_9C : int [generated]
        var_2_C9 : byte[]
        expr_CD : int [generated]
        var_3_2C9 : byte[]
        var_5_2CA : int
        expr_FD : int [generated]
        var_3_31F : byte[]
        var_5_320 : int
        expr_331 : byte [generated]
        var_3_148 : String
        expr_150 : String[] [generated]
        expr_15A : String[] [generated]
        
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
        var_0_204 = and:int(ldc:int(-1100966871), ldc:int(2141429503))
        expr_6C = arraylength:int(stack_9A_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_13C_0 = stack_217_0 = stack_29D_0 = stack_2DB_0 = stack_331_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MPgAULQYPGtZBOhEd2Es4Mwk/Dyw+ABQtBg8a1kE6ER3lYg4QMg4wMRE6ESQNESUOPz8820=")))
        
        if (cmpeq:boolean(expr_6C:int, ldc:int(0))) {
            goto(Label_0113)
        }
        
        var_4_1EF = expr_6C:int
        var_3_1F4 = newarray:byte[](byte.class, expr_6C:int)
        var_5_1F5 = expr_6C:int
        Label_0503:
        
        while (cmpeq:boolean(and:int(var_0_204:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_20D = and:int(var_0_204:int, ldc:int(2133540206))
            var_5_1F5 = add:int(var_5_1F5:int, ldc:int(-1))
            expr_217 = stack_257_2 = loadelement(stack_217_0, var_5_1F5)
            
            if (cmplt:boolean(add:int(add:int(var_5_1F5:int, ldc:int(1)), neg:int(var_4_1EF:int)), ldc:int(0))) {
                stack_257_2 = stack_234_0 = add:byte(expr_217:byte, loadelement:byte(var_3_1F4:byte[], add:int(var_5_1F5:int, ldc:int(1))))
                goto(Label_0580)
            }
            
            Label_0548:
            
            if (cmpne:boolean(and:int(var_0_20D:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_20D = and:int(var_0_20D:int, ldc:int(-1078368369))
                stack_257_2 = stack_234_0 = add:byte(expr_217:byte, ldc:byte(1))
            }
            
            Label_0580:
            
            if (cmpeq:boolean(and:int(var_0_20D:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0548)
            }
            
            var_0_204 = and:int(var_0_20D:int, ldc:int(-1074503746))
            storeelement:byte(var_3_1F4:byte[], var_5_1F5:int, stack_257_2:byte)
            
            if (cmpne:boolean(var_5_1F5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_13C_0 = stack_217_0 = stack_29D_0 = stack_2DB_0 = stack_331_0 = var_3_1F4:byte[]
            goto(Label_0113)
        }
        
        var_0_204 = and:int(var_0_204:int, ldc:int(1928916781))
        Label_0637:
        
        while (cmpeq:boolean(and:int(var_0_204:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(-12915267))
            var_5_1F5 = add:int(var_5_1F5:int, ldc:int(-1))
            storeelement:byte(var_3_1F4:byte[], var_5_1F5:int, add:byte(xor:byte(loadelement:byte(stack_29D_0:byte[], var_5_1F5:int), ldc:byte(31)), ldc:byte(79)))
            
            if (cmpne:boolean(var_5_1F5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9C_0 = stack_9A_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_13C_0 = stack_217_0 = stack_29D_0 = stack_2DB_0 = stack_331_0 = var_3_1F4:byte[]
            goto(Label_0161)
        }
        
        var_0_204 = and:int(var_0_204:int, ldc:int(-626764100))
        goto(Label_0503)
        Label_0113:
        
        if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(-192066893))
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0210)
        }
        
        if (cmpne:boolean(and:int(var_0_204:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(2126306525))
            expr_9C = arraylength:int(stack_9C_0:byte[])
            
            if (cmpne:boolean(expr_9C:int, ldc:int(0))) {
                var_4_1EF = expr_9C:int
                var_3_1F4 = newarray:byte[](byte.class, expr_9C:int)
                var_5_1F5 = expr_9C:int
                goto(Label_0637)
            }
        }
        
        Label_0161:
        
        if (cmpne:boolean(and:int(var_0_204:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0258)
        }
        
        if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(2)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_204:int, ldc:int(128)), ldc:int(0))) {
                var_0_204 = and:int(var_0_204:int, ldc:int(-1668551922))
                goto(Label_0113)
            }
            
            var_0_204 = and:int(var_0_204:int, ldc:int(-8501286))
            var_2_C9 = stack_C9_0:byte[]
            expr_CD = add:int(arraylength:int(stack_CB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CD:int, ldc:int(0))) {
                var_3_2C9 = newarray:byte[](byte.class, expr_CD:int)
                var_5_2CA = expr_CD:int
                
                loop {
                    var_0_204 = and:int(var_0_204:int, ldc:int(-5810472))
                    var_5_2CA = add:int(var_5_2CA:int, ldc:int(-1))
                    storeelement:byte(var_3_2C9:byte[], var_5_2CA:int, add:int(shl:int(loadelement:byte(stack_2DB_0:byte[], var_5_2CA:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_C9:byte[], add:int(var_5_2CA:int, and:int(ldc:int(2179), ldc:int(17685)))), ldc:int(6)), and:int(ldc:int(3187), ldc:int(13063)))))
                    
                    if (cmpne:boolean(var_5_2CA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_13C_0 = stack_217_0 = stack_29D_0 = stack_2DB_0 = stack_331_0 = var_3_2C9:byte[]
            }
        }
        
        Label_0210:
        
        if (cmpne:boolean(and:int(var_0_204:int, ldc:int(64)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(1727673577))
        }
        else {
            if (cmpne:boolean(and:int(var_0_204:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0161)
            }
            
            if (cmpne:boolean(and:int(var_0_204:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0113)
            }
            
            var_0_204 = and:int(var_0_204:int, ldc:int(-1090890358))
            expr_FD = arraylength:int(stack_FD_0:byte[])
            
            if (cmpne:boolean(expr_FD:int, ldc:int(0))) {
                var_3_31F = newarray:byte[](byte.class, expr_FD:int)
                var_5_320 = expr_FD:int
                
                loop {
                    var_0_204 = and:int(var_0_204:int, ldc:int(-13781619))
                    var_5_320 = add:int(var_5_320:int, ldc:int(-1))
                    expr_331 = loadelement:byte(stack_331_0:byte[], var_5_320:int)
                    storeelement:byte(var_3_31F:byte[], var_5_320:int, or:int(and:int(shl:int(expr_331:byte, and:int(ldc:int(22535), ldc:int(308))), ldc:int(-16)), and:int(shr:int(expr_331:byte[expected:int], and:int(ldc:int(14340), ldc:int(1604))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_320:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9C_0 = stack_9A_0 = stack_C9_0 = stack_CB_0 = stack_FB_0 = stack_FD_0 = stack_13C_0 = stack_217_0 = stack_29D_0 = stack_2DB_0 = stack_331_0 = var_3_31F:byte[]
            }
        }
        
        Label_0258:
        
        if (cmpne:boolean(and:int(var_0_204:int, ldc:int(128)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(1000984196))
            goto(Label_0210)
        }
        
        if (cmpne:boolean(and:int(var_0_204:int, ldc:int(8192)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(-246661092))
            goto(Label_0161)
        }
        
        if (cmpeq:boolean(and:int(var_0_204:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_204 = and:int(var_0_204:int, ldc:int(1234414179))
            goto(Label_0113)
        }
        
        var_3_148 = initobject:String(String::<init>, stack_13C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_150 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(28692), ldc:int(140)))
        expr_15A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(13), ldc:int(1220)))
        storeelement:String(expr_150:String[], and:int(ldc:int(515), ldc:int(16507)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(1575), ldc:int(-1584)), xor:int(ldc:int(9288), ldc:int(9308))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(13378), ldc:int(515)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(4237), ldc:int(4249)), xor:int(ldc:int(138), ldc:int(163))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(1520), ldc:int(-5617)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(2091), ldc:int(12857)), and:int(ldc:int(173), ldc:int(63))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(30965), ldc:int(1291)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(21528), ldc:int(21557)), xor:int(ldc:int(-31994), ldc:int(-31950))))
        putstatic:String[](\u446c\u1833\u72f1\u6bb9\ub171::\u12b2\u7006\u36d3\u965f\u64f2\u67d0, expr_15A:String[])
        putstatic:SimpleCommandExceptionType(\u446c\u1833\u72f1\u6bb9\ub171::\u4179\ud4fe\ub8be\u8c8a\ua3b4\u7049, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_150:String[], and:int(ldc:int(579), ldc:int(20743))))))
    }
    
    public void \ubcb0\ub83f\uc7fe\u6bb9\u527a\u446c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_673 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67E : int
        
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
        var_3_673 = and:int(ldc:int(-1195581323), ldc:int(-1449142018))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u446c\u1833\u72f1\u6bb9\ub171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
            var_3_673 = and:int(var_3_673:int, ldc:int(-358614561))
            var_5_81 = and:int(ldc:int(-5856), ldc:int(5338))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6994), ldc:int(6721)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_673:int, ldc:int(-90310531))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(4257), ldc:int(523)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_673 = and:int(var_3_DA:int, ldc:int(-117454221))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(579), ldc:int(578)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1134466633))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(837808285))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(857443036))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1995020028))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-750555454))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-132811915))
                    }
                    else {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-55060109))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(355220089))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1977463186))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1374901887))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1128467757))
                            var_11_EB = and:int(ldc:int(-15818), ldc:int(15625))
                            goto(Label_1519)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1230044253))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1571280160))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1041755284))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1091248804))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0833)
                        }
                    }
                    
                    Label_0701:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1736536964))
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1410567120))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1102667103))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-151375079))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-336078116))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0833:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-948907121))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(692669430))
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(1584819082))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-17511728))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(523), ldc:int(522))
                                goto(Label_1125)
                            }
                        }
                    }
                    
                    Label_0948:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(924997924))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-837041687))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1904845750))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-985376801))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(369343662))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1308661852))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-55061894))
                        var_11_EB = and:int(ldc:int(-13309), ldc:int(13084))
                    }
                    
                    Label_1125:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0833)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-1492646375))
                            goto(Label_0701)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-147999260))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-386467342))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1375)
                            }
                        }
                    }
                    
                    Label_1232:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-887447066))
                        goto(Label_1530)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(356242514))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1125)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0948)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(-686360787))
                            goto(Label_0833)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(925051037))
                            goto(Label_0701)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_673 = and:int(var_3_673:int, ldc:int(501059445))
                            loopcontinue()
                        }
                        
                        var_3_673 = and:int(var_3_673:int, ldc:int(-390728976))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1519)
                    }
                    
                    Label_1375:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(215103996))
                        goto(Label_1530)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1232)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1558155588))
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-56986239))
                        goto(Label_0701)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-980340830))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-655217215))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_673 = and:int(var_3_673:int, ldc:int(-1416237104))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1519:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67E = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1530:
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(989686151))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(16)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(1501279600))
                        goto(Label_1232)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0948)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0833)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(512)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(306315170))
                        goto(Label_0701)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1473382032))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_673:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_673 = and:int(var_3_673:int, ldc:int(-1432363280))
                        var_17_67E = add:int(var_16_119:int, and:int(ldc:int(1025), ldc:int(593)))
                        looporswitchbreak()
                    }
                    
                    var_3_673 = and:int(var_3_673:int, ldc:int(560657815))
                }
                
                var_3_673 = and:int(var_3_673:int, ldc:int(-1095314601))
                
                if (cmple:boolean(var_5_81 = var_17_67E:int, sub:int(var_6_88:int, xor:int(ldc:int(5377), ldc:int(5376))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_673:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_673 = and:int(var_3_673:int, ldc:int(1041996320))
            goto(Label_0108)
        }
    }
}
