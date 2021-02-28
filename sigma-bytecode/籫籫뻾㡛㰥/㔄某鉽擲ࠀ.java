public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u3504\u67d0\u927d\u64f2\u0800 {
    public void \u3504\u67d0\u927d\u64f2\u0800() {
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
            invokespecial:Object(Object::<init>, this:\u3504\u67d0\u927d\u64f2\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8d90\ud12e\u983f\ub19c\u494c\ub6ab(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u12b2\u0a06\uae5d\u8258\ufe34\uf995(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<com.mojang.authlib.GameProfile> p1) {
        var_2_AD : int
        var_4_6A : \uc31c\uff55\u6fb0\u4c04\u8753
        var_5_73 : int
        var_6_7B : Iterator<GameProfile>
        var_2_8F : int
        var_7_FE : GameProfile
        stack_148_1 : String [generated]
        expr_137 : Object[] [generated]
        
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
        var_2_AD = and:int(ldc:int(975411223), ldc:int(1656589503))
        var_4_6A = invokevirtual:\uc31c\uff55\u6fb0\u4c04\u8753(\ucb79\u8350\u7bad\u392e\u51fa::\uc87f\uc31c\u3c25\ud51e\u5bc4\u40a9, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))
        var_5_73 = and:int(ldc:int(16771), ldc:int(-17284))
        var_6_7B = invokeinterface:Iterator<GameProfile>(Collection<GameProfile>::iterator, p1:Collection<GameProfile>)
        
        loop {
            if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0202)
            }
            
            if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_8F = and:int(var_2_AD:int, ldc:int(-158223440))
            }
            else {
                var_2_8F = and:int(var_2_AD:int, ldc:int(-1221277060))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_6_7B:Iterator)) {
                    var_7_FE = checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokeinterface:GameProfile(Iterator<GameProfile>::next, var_6_7B:Iterator<GameProfile>))
                    
                    if (invokevirtual:boolean(\uc31c\uff55\u6fb0\u4c04\u8753::\u8308\u4e72\uc3e3\u873d\ud171\uceb8, var_4_6A:\uc31c\uff55\u6fb0\u4c04\u8753, var_7_FE:GameProfile)) {
                        invokevirtual:void(\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>::\u12b2\u1833\ub83f\u4492\u494c\ua068, var_4_6A:\u9937\u7049\ubefe\u3bc9\u446c<GameProfile, V>, var_7_FE:GameProfile)
                        inc:int(var_5_73, ldc:int(1))
                        stack_148_1 = loadelement:String(getstatic:String[](\u3504\u67d0\u927d\u64f2\u0800::\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), and:int(ldc:int(3106), ldc:int(4114)))
                        expr_137 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1537), ldc:int(219)))
                        storeelement:Object(expr_137:Object[], and:int(ldc:int(-11248), ldc:int(10895)), invokestatic:ITextComponent[expected:Object](TextComponentUtils::getDisplayName, var_7_FE:GameProfile))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_148_1:String, expr_137:Object[]), and:int[expected:boolean](ldc:int(5), ldc:int(8963)))
                    }
                    
                    var_2_AD = and:int(var_2_8F:int, ldc:int(-1490821160))
                    loopcontinue()
                }
            }
            
            Label_0162:
            
            if (cmpne:boolean(and:int(var_2_8F:int, ldc:int(524288)), ldc:int(0))) {
                var_2_AD = and:int(var_2_8F:int, ldc:int(-864454021))
            }
            else {
                if (cmpne:boolean(and:int(var_2_8F:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_AD = and:int(var_2_8F:int, ldc:int(215483444))
                    loopcontinue()
                }
                
                var_2_AD = and:int(var_2_8F:int, ldc:int(41532854))
                
                if (cmpeq:boolean(var_5_73:int, ldc:int(0))) {
                    athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u3504\u67d0\u927d\u64f2\u0800::\uc246\u97b7\u7043\u4ab3\u3d4b\uc29a)))
                }
            }
            
            Label_0202:
            
            if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_8F = and:int(var_2_AD:int, ldc:int(-147743082))
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_2_AD:int, ldc:int(1048576)), ldc:int(0))) {
                return:int(var_5_73:int)
            }
            
            var_2_AD = and:int(var_2_AD:int, ldc:int(-1778747297))
        }
    }
    
    private static int lambda$\uc29a\u4daf\ud7e8\uc2bd\u3bc9\u7af6$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\u3504\u67d0\u927d\u64f2\u0800::\u12b2\u0a06\uae5d\u8258\ufe34\uf995, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<GameProfile>(\ubf56\u7e3f\ua61f\u8753\u5f50::\ucfaf\u7006\u67e9\u51b2\uc29a\u92ff, p0:CommandContext, loadelement:String(getstatic:String[](\u3504\u67d0\u927d\u64f2\u0800::\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), and:int(ldc:int(257), ldc:int(31809))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\uceb8\u40a9\u3d64\uc29a\u62da\u4975$1(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokevirtual:String[](\uc31c\uff55\u6fb0\u4c04\u8753::\u120d\u6d99\u99f7\u946b\ub113\u2dcc, invokevirtual:\uc31c\uff55\u6fb0\u4c04\u8753(\ucb79\u8350\u7bad\u392e\u51fa::\uc87f\uc31c\u3c25\ud51e\u5bc4\u40a9, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u2dcc\u156b\u62da\u5654\u6ec6\u12b2$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(1315), ldc:int(8323))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2B2 : int
        expr_67 : byte[] [generated]
        var_2_6B : byte[]
        stack_A6_0 : byte[] [generated]
        stack_A8_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_D8_0 : byte[] [generated]
        stack_117_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_273_0 : byte[] [generated]
        stack_2C5_0 : byte[] [generated]
        stack_33A_0 : byte[] [generated]
        expr_6F : int [generated]
        var_3_203 : byte[]
        var_4_204 : int
        expr_A8 : int [generated]
        var_5_254 : int
        var_3_259 : byte[]
        var_4_25A : int
        var_0_2BB : int
        expr_2C5 : byte [generated]
        stack_305_2 : byte [generated]
        stack_2E2_0 : byte [generated]
        expr_D8 : int [generated]
        expr_119 : int [generated]
        var_3_328 : byte[]
        var_4_329 : int
        expr_33A : byte [generated]
        var_3_15A : String
        expr_162 : String[] [generated]
        expr_16C : String[] [generated]
        
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
            var_0_2B2 = and:int(ldc:int(386020355), ldc:int(-632178991))
            expr_67 = var_2_6B = stack_A6_0 = stack_A8_0 = stack_D6_0 = stack_D8_0 = stack_117_0 = stack_119_0 = stack_14E_0 = stack_273_0 = stack_2C5_0 = stack_33A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HTUJZi19KWXkKdYx1RkpDCk5CSUBFR01CWYtfSll5CnWJSVxNQwhKRVpFWXR6f1t6UENITlphd3RlYA="))
            expr_6F = add:int(arraylength:int(expr_67:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6F:int, ldc:int(0))) {
                var_3_203 = newarray:byte[](byte.class, expr_6F:int)
                var_4_204 = expr_6F:int
                
                loop {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(1064874201))
                    var_4_204 = add:int(var_4_204:int, ldc:int(-1))
                    storeelement:byte(var_3_203:byte[], var_4_204:int, add:int(shl:int(loadelement:byte(expr_67:byte[], var_4_204:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_6B:byte[], add:int(var_4_204:int, and:int(ldc:int(13481), ldc:int(23)))), ldc:int(6)), xor:int(ldc:int(16464), ldc:int(16467)))))
                    
                    if (cmpne:boolean(var_4_204:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A8_0 = stack_A6_0 = stack_D6_0 = stack_D8_0 = stack_117_0 = stack_119_0 = stack_14E_0 = stack_273_0 = stack_2C5_0 = stack_33A_0 = var_3_203:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0286)
                }
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(256)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(-1411940109))
                    goto(Label_0221)
                }
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(1114214153))
                    goto(Label_0173)
                }
                
                var_0_2B2 = and:int(var_0_2B2:int, ldc:int(1528097463))
                expr_A8 = arraylength:int(stack_A8_0:byte[])
                
                if (cmpeq:boolean(expr_A8:int, ldc:int(0))) {
                    goto(Label_0173)
                }
                
                var_5_254 = expr_A8:int
                var_3_259 = newarray:byte[](byte.class, expr_A8:int)
                var_4_25A = expr_A8:int
                Label_0604:
                
                while (cmpeq:boolean(and:int(var_0_2B2:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(131661457))
                    var_4_25A = add:int(var_4_25A:int, ldc:int(-1))
                    storeelement:byte(var_3_259:byte[], var_4_25A:int, add:byte(xor:byte(loadelement:byte(stack_273_0:byte[], var_4_25A:int), ldc:byte(81)), ldc:byte(43)))
                    
                    if (cmpne:boolean(var_4_25A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D6_0 = stack_D8_0 = stack_117_0 = stack_119_0 = stack_14E_0 = stack_273_0 = stack_2C5_0 = stack_33A_0 = var_3_259:byte[]
                    goto(Label_0173)
                }
                
                Label_0677:
                
                while (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_2BB = and:int(var_0_2B2:int, ldc:int(-149543145))
                    var_4_25A = add:int(var_4_25A:int, ldc:int(-1))
                    expr_2C5 = stack_305_2 = loadelement(stack_2C5_0, var_4_25A)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_25A:int, ldc:int(5)), neg:int(var_5_254:int)), ldc:int(0))) {
                        stack_305_2 = stack_2E2_0 = add:byte(expr_2C5:byte, loadelement:byte(var_3_259:byte[], add:int(var_4_25A:int, ldc:int(5))))
                        goto(Label_0754)
                    }
                    
                    Label_0722:
                    
                    if (cmpne:boolean(and:int(var_0_2BB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_2BB = and:int(var_0_2BB:int, ldc:int(-6985437))
                        stack_305_2 = stack_2E2_0 = add:byte(expr_2C5:byte, ldc:byte(5))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_0_2BB:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    var_0_2B2 = and:int(var_0_2BB:int, ldc:int(1510451667))
                    storeelement:byte(var_3_259:byte[], var_4_25A:int, stack_305_2:byte)
                    
                    if (cmpne:boolean(var_4_25A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A8_0 = stack_A6_0 = stack_D6_0 = stack_D8_0 = stack_117_0 = stack_119_0 = stack_14E_0 = stack_273_0 = stack_2C5_0 = stack_33A_0 = var_3_259:byte[]
                    goto(Label_0221)
                }
                
                var_0_2B2 = and:int(var_0_2B2:int, ldc:int(1858424308))
                goto(Label_0604)
                Label_0173:
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(256)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(-816570714))
                    goto(Label_0286)
                }
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_2B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(-1167645551))
                    expr_D8 = arraylength:int(stack_D8_0:byte[])
                    
                    if (cmpne:boolean(expr_D8:int, ldc:int(0))) {
                        var_5_254 = expr_D8:int
                        var_3_259 = newarray:byte[](byte.class, expr_D8:int)
                        var_4_25A = expr_D8:int
                        goto(Label_0677)
                    }
                }
                
                Label_0221:
                
                if (cmpeq:boolean(and:int(var_0_2B2:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(2045382194))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(32)), ldc:int(0))) {
                        var_0_2B2 = and:int(var_0_2B2:int, ldc:int(941315539))
                        goto(Label_0173)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_2B2 = and:int(var_0_2B2:int, ldc:int(-1256921222))
                        loopcontinue()
                    }
                    
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(244692973))
                    expr_119 = arraylength:int(stack_119_0:byte[])
                    
                    if (cmpne:boolean(expr_119:int, ldc:int(0))) {
                        var_3_328 = newarray:byte[](byte.class, expr_119:int)
                        var_4_329 = expr_119:int
                        
                        loop {
                            var_0_2B2 = and:int(var_0_2B2:int, ldc:int(1471524677))
                            var_4_329 = add:int(var_4_329:int, ldc:int(-1))
                            expr_33A = loadelement:byte(stack_33A_0:byte[], var_4_329:int)
                            storeelement:byte(var_3_328:byte[], var_4_329:int, or:int(and:int(shl:int(expr_33A:byte, and:int(ldc:int(5039), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_33A:byte[expected:int], and:int(ldc:int(15364), ldc:int(870))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_329:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A8_0 = stack_A6_0 = stack_D6_0 = stack_D8_0 = stack_117_0 = stack_119_0 = stack_14E_0 = stack_273_0 = stack_2C5_0 = stack_33A_0 = var_3_328:byte[]
                    }
                }
                
                Label_0286:
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(-1167449376))
                    goto(Label_0221)
                }
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_2B2 = and:int(var_0_2B2:int, ldc:int(1014255617))
                    goto(Label_0173)
                }
                
                if (cmpne:boolean(and:int(var_0_2B2:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_15A = initobject:String(String::<init>, stack_14E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_162 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(23045), ldc:int(1044)))
            expr_16C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(7279), ldc:int(16404)))
            storeelement:String(expr_162:String[], and:int(ldc:int(131), ldc:int(17255)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(18760), ldc:int(-18761)), and:int(ldc:int(22806), ldc:int(1047))))
            storeelement:String(expr_16C:String[], and:int(ldc:int(2082), ldc:int(530)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(17526), ldc:int(8855)), and:int(ldc:int(4333), ldc:int(25647))))
            storeelement:String(expr_16C:String[], and:int(ldc:int(16698), ldc:int(-17723)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(557), ldc:int(24621)), xor:int(ldc:int(13592), ldc:int(13611))))
            storeelement:String(expr_16C:String[], xor:int(ldc:int(-32766), ldc:int(-32765)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(16947), ldc:int(1079)), and:int(ldc:int(9723), ldc:int(6202))))
            putstatic:String[](\u3504\u67d0\u927d\u64f2\u0800::\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, expr_16C:String[])
            putstatic:SimpleCommandExceptionType(\u3504\u67d0\u927d\u64f2\u0800::\uc246\u97b7\u7043\u4ab3\u3d4b\uc29a, initobject:SimpleCommandExceptionType(SimpleCommandExceptionType::<init>, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(expr_162:String[], xor:int(ldc:int(24656), ldc:int(24659))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\u9af2\u8d90\u51fa\u9af2\u1187(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67A : int
        
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
        var_3_66F = and:int(ldc:int(284606514), ldc:int(-1640769))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3504\u67d0\u927d\u64f2\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(838783742))
            var_5_81 = and:int(ldc:int(-8073), ldc:int(8072))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12332), ldc:int(-31917)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_66F:int, ldc:int(-956367920))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(4097), ldc:int(10647)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-32616), ldc:int(-32615)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_66F = and:int(var_3_DA:int, ldc:int(251653424))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(19969), ldc:int(4459)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1886775848))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1813193889))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1815218485))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1704607007))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0735)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1773552489))
                    }
                    else {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(2097051540))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1751543174))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1123000883))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1880006109))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-252167729))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0735)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1088897139))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(687301781))
                        var_11_EB = and:int(ldc:int(2611), ldc:int(-2612))
                        goto(Label_1526)
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1218380270))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1114818707))
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(206012285))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1196502948))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(448410810))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(382899917))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(368991609))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0735:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1720253362))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1300616570))
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1550003165))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-169423533))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(169749600))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0735)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1832598181))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1561920964))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(520), ldc:int(521))
                                goto(Label_1139)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-2139108265))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(71281537))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-302580282))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1735445823))
                            goto(Label_0735)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1166852538))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1696121023))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(83356117))
                        var_11_EB = and:int(ldc:int(23752), ldc:int(-24544))
                    }
                    
                    Label_1139:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-589354490))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-1018906745))
                            goto(Label_0735)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(2010609538))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(1261745379))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-969406712))
                            loopcontinue()
                        }
                        
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1525142425))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1408)
                            }
                        }
                    }
                    
                    Label_1272:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1506104960))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-1325152137))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-112723836))
                            goto(Label_1139)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0735)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(-857995429))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66F = and:int(var_3_66F:int, ldc:int(871322107))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1408:
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-527621133))
                        goto(Label_0735)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-796710048))
                        loopcontinue()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(1375200957))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67A = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(-274110389))
                        goto(Label_1139)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1145857745))
                        goto(Label_0735)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1611429924))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66F = and:int(var_3_66F:int, ldc:int(1442277332))
                        var_17_67A = add:int(var_16_119:int, xor:int(ldc:int(12), ldc:int(13)))
                        looporswitchbreak()
                    }
                    
                    var_3_66F = and:int(var_3_66F:int, ldc:int(-84248261))
                }
                
                var_3_66F = and:int(var_3_66F:int, ldc:int(2062011955))
                
                if (cmple:boolean(var_5_81 = var_17_67A:int, sub:int(var_6_88:int, and:int(ldc:int(1121), ldc:int(12295))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_66F:int, ldc:int(131072)), ldc:int(0))) {
            var_3_66F = and:int(var_3_66F:int, ldc:int(1916833103))
            goto(Label_0108)
        }
    }
}
