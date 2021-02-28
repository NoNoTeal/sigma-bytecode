public class \u392e\ud7e8\u3bc9\u88c5\ud51e.\ud158\u8d98\ua3b4\ud217\u624e {
    public void \ud158\u8d98\ua3b4\ud217\u624e() {
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
            invokespecial:Object(Object::<init>, this:\ud158\u8d98\ua3b4\ud217\u624e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8389\u9a18\ua068\u8bb0\u5f50\uc246(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u93a2\u7873\u72f1\uc2e8\uc9f6\u965f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<? extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p1) {
        var_2_C2 : int
        var_4_66 : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        stack_14F_1 : String [generated]
        expr_132 : Object[] [generated]
        stack_EF_1 : String [generated]
        expr_DA : Object[] [generated]
        
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
            var_2_C2 = and:int(ldc:int(-378381073), ldc:int(-369296913))
            var_4_66 = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)
            
            loop {
                if (cmpne:boolean(and:int(var_2_C2:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0176)
                }
                
                if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_C2 = and:int(var_2_C2:int, ldc:int(-126533376))
                }
                else {
                    var_2_C2 = and:int(var_2_C2:int, ldc:int(-637544209))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_4_66:Iterator)) {
                        invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u9a18\uc229\u71ae\u5654\uf995\u67e9, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:? extends \u7d52\u718f\u3776\u6fb0\ub83f(Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_66:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)))
                        loopcontinue()
                    }
                }
                
                Label_0141:
                
                if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_C2 = and:int(var_2_C2:int, ldc:int(-203228689))
                    
                    if (cmpeq:boolean(invokeinterface:int(Collection::size, p1:Collection), and:int(ldc:int(4233), ldc:int(1591)))) {
                        stack_14F_1 = loadelement:String(getstatic:String[](\ud158\u8d98\ua3b4\ud217\u624e::\uc7fe\u8d90\u873d\u8d98\uc31c\uc29a), xor:int(ldc:int(-20476), ldc:int(-20474)))
                        expr_132 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2817), ldc:int(20485)))
                        storeelement:Object(expr_132:Object[], and:int(ldc:int(12040), ldc:int(-12043)), invokevirtual:ITextComponent[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:? extends \u7d52\u718f\u3776\u6fb0\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::next, invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)))))
                        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_14F_1:String, expr_132:Object[]), and:int[expected:boolean](ldc:int(30049), ldc:int(517)))
                        looporswitchbreak()
                    }
                }
                
                Label_0176:
                
                if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0141)
                }
                
                if (cmpne:boolean(and:int(var_2_C2:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_C2 = and:int(var_2_C2:int, ldc:int(-948544385))
                    stack_EF_1 = loadelement:String(getstatic:String[](\ud158\u8d98\ua3b4\ud217\u624e::\uc7fe\u8d90\u873d\u8d98\uc31c\uc29a), and:int(ldc:int(515), ldc:int(2315)))
                    expr_DA = newarray:Object[](java.lang.Object.class, and:int(ldc:int(7465), ldc:int(81)))
                    storeelement:Object(expr_DA:Object[], and:int(ldc:int(-4714), ldc:int(4712)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)))
                    invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_EF_1:String, expr_DA:Object[]), xor:int[expected:boolean](ldc:int(17032), ldc:int(17033)))
                    looporswitchbreak()
                }
            }
            
            return:int(invokeinterface:int(Collection<E>::size, p1:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud523\ub6ab\u4cd9\ucef1\ud523\u5db4$2(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud158\u8d98\ua3b4\ud217\u624e::\u93a2\u7873\u72f1\uc2e8\uc9f6\u965f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\ud158\u8d98\ua3b4\ud217\u624e::\uc7fe\u8d90\u873d\u8d98\uc31c\uc29a), xor:int(ldc:int(8289), ldc:int(8288))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc29a\uc238\u7049\u4f4a\ud7e8\uf94d$1(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ud158\u8d98\ua3b4\ud217\u624e::\u93a2\u7873\u72f1\uc2e8\uc9f6\u965f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:ImmutableList[expected:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>](ImmutableList::of, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object](\u8413\u5140\u64f2\uc9f6\u9937::\u97e6\u4d85\ud36e\u8350\u92ee\u6b5f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u1833\u8308\u9255\u8bb0\u3dd3\u5d20$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(46), ldc:int(8451))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_89 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1DB_0 : byte[] [generated]
        stack_260_0 : byte[] [generated]
        stack_29B_0 : byte[] [generated]
        stack_2F1_0 : byte[] [generated]
        var_4_1BD : int
        var_3_1C2 : byte[]
        var_5_1C3 : int
        var_0_1F4 : int
        expr_1DB : byte [generated]
        stack_223_2 : byte [generated]
        stack_1F7_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_289 : byte[]
        var_5_28A : int
        expr_F6 : int [generated]
        var_3_2DF : byte[]
        var_5_2E0 : int
        expr_2F4 : byte [generated]
        var_3_132 : String
        stack_1B6_0 : String[] [generated]
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
        var_0_89 = and:int(ldc:int(1044245622), ldc:int(-27407233))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1DB_0 = stack_260_0 = stack_29B_0 = stack_2F1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("c8MEsX4Afv0v1YaDQsPU/ql/gj++f5RA/z47/b++v8MEsX4Afv0v1YaDQsPU/qwCfr/5vk78AH7CBQJFgsIFQPUydvaxcQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1BD = expr_6B:int
        var_3_1C2 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1C3 = expr_6B:int
        Label_0453:
        
        while (cmpne:boolean(and:int(var_0_89:int, ldc:int(16384)), ldc:int(0))) {
            var_0_1F4 = and:int(var_0_89:int, ldc:int(-1742864390))
            var_5_1C3 = add:int(var_5_1C3:int, ldc:int(-1))
            expr_1DB = stack_223_2 = loadelement(stack_1DB_0, var_5_1C3)
            
            if (cmplt:boolean(add:int(add:int(var_5_1C3:int, ldc:int(6)), neg:int(var_4_1BD:int)), ldc:int(0))) {
                stack_223_2 = stack_1F7_0 = add:byte(expr_1DB:byte, loadelement:byte(var_3_1C2:byte[], add:int(var_5_1C3:int, ldc:int(6))))
                goto(Label_0519)
            }
            
            Label_0488:
            
            if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(256)), ldc:int(0))) {
                var_0_1F4 = and:int(var_0_1F4:int, ldc:int(1530912502))
                stack_223_2 = stack_1F7_0 = add:byte(expr_1DB:byte, ldc:byte(6))
            }
            
            Label_0519:
            
            if (cmpeq:boolean(and:int(var_0_1F4:int, ldc:int(1024)), ldc:int(0))) {
                var_0_1F4 = and:int(var_0_1F4:int, ldc:int(1732163104))
                goto(Label_0488)
            }
            
            var_0_89 = and:int(var_0_1F4:int, ldc:int(524279423))
            storeelement:byte(var_3_1C2:byte[], var_5_1C3:int, stack_223_2:byte)
            
            if (cmpne:boolean(var_5_1C3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1DB_0 = stack_260_0 = stack_29B_0 = stack_2F1_0 = var_3_1C2:byte[]
            goto(Label_0112)
        }
        
        Label_0585:
        
        while (cmpne:boolean(and:int(var_0_89:int, ldc:int(2048)), ldc:int(0))) {
            var_0_89 = and:int(var_0_89:int, ldc:int(-666907021))
            var_5_1C3 = add:int(var_5_1C3:int, ldc:int(-1))
            storeelement:byte(var_3_1C2:byte[], var_5_1C3:int, add:byte(loadelement:byte(stack_260_0:byte[], var_5_1C3:int), ldc:byte(81)))
            
            if (cmpne:boolean(var_5_1C3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1DB_0 = stack_260_0 = stack_29B_0 = stack_2F1_0 = var_3_1C2:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0453)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(524288)), ldc:int(0))) {
            var_0_89 = and:int(var_0_89:int, ldc:int(-1334085447))
        }
        else {
            var_0_89 = and:int(var_0_89:int, ldc:int(-86123269))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_1BD = expr_96:int
                var_3_1C2 = newarray:byte[](byte.class, expr_96:int)
                var_5_1C3 = expr_96:int
                goto(Label_0585)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_89:int, ldc:int(131072)), ldc:int(0))) {
            var_0_89 = and:int(var_0_89:int, ldc:int(-53608890))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_89:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_89:int, ldc:int(512)), ldc:int(0))) {
                var_0_89 = and:int(var_0_89:int, ldc:int(-695724791))
                goto(Label_0112)
            }
            
            var_0_89 = and:int(var_0_89:int, ldc:int(1539296375))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_289 = newarray:byte[](byte.class, expr_CB:int)
                var_5_28A = expr_CB:int
                
                loop {
                    var_0_89 = and:int(var_0_89:int, ldc:int(-1086337289))
                    var_5_28A = add:int(var_5_28A:int, ldc:int(-1))
                    storeelement:byte(var_3_289:byte[], var_5_28A:int, add:int(shl:int(loadelement:byte(stack_29B_0:byte[], var_5_28A:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_28A:int, and:int(ldc:int(557), ldc:int(2065)))), ldc:int(2)), and:int(ldc:int(10431), ldc:int(16511)))))
                    
                    if (cmpne:boolean(var_5_28A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1DB_0 = stack_260_0 = stack_29B_0 = stack_2F1_0 = var_3_289:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_89:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(262144)), ldc:int(0))) {
                var_0_89 = and:int(var_0_89:int, ldc:int(1169872358))
                goto(Label_0112)
            }
            
            var_0_89 = and:int(var_0_89:int, ldc:int(415223155))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2DF = newarray:byte[](byte.class, expr_F6:int)
                var_5_2E0 = expr_F6:int
                
                loop {
                    var_0_89 = and:int(var_0_89:int, ldc:int(-60829701))
                    var_5_2E0 = add:int(var_5_2E0:int, ldc:int(-1))
                    expr_2F4 = xor:byte(loadelement:byte(stack_2F1_0:byte[], var_5_2E0:int), ldc:byte(5))
                    storeelement:byte(var_3_2DF:byte[], var_5_2E0:int, or:int(and:int(shl:int(expr_2F4:byte, xor:int(ldc:int(12), ldc:int(8))), ldc:int(-16)), and:int(shr:int(expr_2F4:byte[expected:int], xor:int(ldc:int(-30192), ldc:int(-30188))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2E0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1DB_0 = stack_260_0 = stack_29B_0 = stack_2F1_0 = var_3_2DF:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_89:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_89:int, ldc:int(512)), ldc:int(0))) {
            var_0_89 = and:int(var_0_89:int, ldc:int(-1570719334))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_89:int, ldc:int(256)), ldc:int(0))) {
            var_0_89 = and:int(var_0_89:int, ldc:int(1023888670))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1B6_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(16403), ldc:int(16407)))
        expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(23554), ldc:int(23558)))
        storeelement:String(expr_144:String[], xor:int(ldc:int(1063), ldc:int(1060)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-19557), ldc:int(19524)), xor:int(ldc:int(1847), ldc:int(1833))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(16652), ldc:int(16654)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(798), ldc:int(14494)), and:int(ldc:int(58), ldc:int(20026))))
        storeelement:String(expr_144:String[], and:int(ldc:int(-24151), ldc:int(22614)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(17210), ldc:int(5310)), and:int(ldc:int(4798), ldc:int(1087))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(1122), ldc:int(1123)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(6911), ldc:int(62)), and:int(ldc:int(4221), ldc:int(709))))
        putstatic:String[](\ud158\u8d98\ua3b4\ud217\u624e::\uc7fe\u8d90\u873d\u8d98\uc31c\uc29a, expr_144:String[])
    }
    
    public void \u6435\u759a\u4cd9\u5bc4\u34df\u7006(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_647 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_652 : int
        
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
        var_3_647 = and:int(ldc:int(497386105), ldc:int(967441232))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud158\u8d98\ua3b4\ud217\u624e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2)), ldc:int(0))) {
            var_3_647 = and:int(var_3_647:int, ldc:int(1895817981))
            var_5_80 = and:int(ldc:int(14849), ldc:int(-14850))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10794), ldc:int(-10795)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_647:int, ldc:int(1992025948))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(8338), ldc:int(8339)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(-32764), ldc:int(-32763)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_647 = and:int(var_3_D0:int, ldc:int(346416883))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(3233), ldc:int(13079)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1322940736))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-517310392))
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1745218152))
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(152793330))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-930850328))
                    }
                    else {
                        var_3_647 = and:int(var_3_647:int, ldc:int(2072102851))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0788)
                        }
                    }
                    
                    Label_0406:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1466715224))
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-120781106))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(556317101))
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(790889173))
                        goto(Label_0679)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-644830059))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1522250313))
                            var_11_E1 = and:int(ldc:int(-13461), ldc:int(13460))
                            goto(Label_1497)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-522058283))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(677537219))
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(-37627923))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0788)
                        }
                    }
                    
                    Label_0679:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1313506594))
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(2142306194))
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(1355128519))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0788:
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(197139216))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(314125566))
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(608016597))
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1949886598))
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1573518797))
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1143748013))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(26641), ldc:int(65))
                                goto(Label_1074)
                            }
                        }
                    }
                    
                    Label_0917:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-176606786))
                        goto(Label_1193)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1440644022))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(690307821))
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0679)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(916119297))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0406)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1701342655))
                        var_11_E1 = and:int(ldc:int(-1110), ldc:int(1109))
                    }
                    
                    Label_1074:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1881305788))
                        goto(Label_1508)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1717729859))
                            goto(Label_0917)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1871489493))
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1377925432))
                            goto(Label_0406)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(902950764))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1345)
                            }
                        }
                    }
                    
                    Label_1193:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(768517941))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1074)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0917)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(160283038))
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1630967791))
                            goto(Label_0679)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(723636330))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1016207766))
                            goto(Label_0406)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1277010535))
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(2141689833))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1497)
                    }
                    
                    Label_1345:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1584743780))
                        goto(Label_1508)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1784502675))
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1159502007))
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1181814238))
                        goto(Label_0917)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(558334868))
                        goto(Label_0679)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1299372783))
                        goto(Label_0406)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_647 = and:int(var_3_647:int, ldc:int(-642918406))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1497:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_652 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1508:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1964375394))
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1193)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0917)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1295552661))
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0679)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-25727707))
                        goto(Label_0406)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(952863472))
                        var_17_652 = add:int(var_16_10F:int, and:int(ldc:int(8285), ldc:int(5121)))
                        looporswitchbreak()
                    }
                }
                
                var_3_647 = and:int(var_3_647:int, ldc:int(-678848800))
                
                if (cmple:boolean(var_5_80 = var_17_652:int, sub:int(var_6_87:int, and:int(ldc:int(4097), ldc:int(25349))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
