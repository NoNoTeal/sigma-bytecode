public class \ub113\uc4d2\u183a\u527a\u6435.\ucb79\uc3e3\u494c\uc2bd\ua068 {
    public void \ucb79\uc3e3\u494c\uc2bd\ua068() {
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
            invokespecial:Object(Object::<init>, this:\ucb79\uc3e3\u494c\uc2bd\ua068)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc238\u5d20\u983f\u61a4\ub70c\u8d90(java.util.Collection<java.lang.String> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p1) {
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
    
    private static java.util.Collection<java.lang.String> \uff55\u624e\u4d85\u8d90\ub19c\ub7dc(\ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec p1, java.util.Collection<java.lang.String> p2) {
        var_3_5F : int
        var_5_68 : ArrayList
        var_6_73 : List<String>
        var_7_7E : Iterator<String>
        var_8_B3 : String
        
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
            var_3_5F = and:int(ldc:int(-607692776), ldc:int(-1681008431))
            invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\ub83f\u72f1\u8aa5\u64f2\ud158\ub171, p0:\u4f52\ua068\u4f52\u47c2\u4492)
            var_5_68 = invokestatic:ArrayList(Lists::newArrayList, p2:Collection<String>[expected:Iterable])
            var_6_73 = invokevirtual:List<String>(\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf::\u927d\u9033\u0a06\ufcaf\u392e\uc2bd, invokeinterface:\u51b2\ubb2b\ud171\u960f\u3d4b\ufcaf(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u4e72\u5db4\u7bad\u071d\u72f1\u494c, p1:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec))
            var_7_7E = invokeinterface:Iterator<String>(Collection<String>::iterator, invokevirtual:Collection<String>(\u4f52\ua068\u4f52\u47c2\u4492::\u3776\u4c04\u3776\u6c52\ud36e\u4bc8, p0:\u4f52\ua068\u4f52\u47c2\u4492))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(128)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1680380341))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_7E:Iterator<String>)) {
                        var_8_B3 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_7_7E:Iterator<String>))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Collection::contains, var_6_73:List[expected:Collection], var_8_B3:String[expected:Object]))) {
                            if (logicalnot:boolean(invokeinterface:boolean(Collection<E>::contains, var_5_68:ArrayList<String>[expected:Collection<String>], var_8_B3:String[expected:Object]))) {
                                invokeinterface:boolean(Collection<String>::add, var_5_68:ArrayList<String>[expected:Collection<String>], var_8_B3:String)
                            }
                        }
                        
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-536912783))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:Collection<String>(var_5_68:ArrayList<String>)
        }
        
        goto(Label_0006)
    }
    
    public static void \u527a\u5bc4\u8258\u3e2a\u4bc8\ub70c(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int lambda$\u34df\ua3b4\u8753\u946b\ud158\u8709$2(com.mojang.brigadier.context.CommandContext p0) {
        var_3_67 : \u8413\u5140\u64f2\uc9f6\u9937
        var_4_6C : \u88c5\ud171\ub113\u6435\ud51e
        var_5_73 : \u4f52\ua068\u4f52\u47c2\u4492
        var_8_8C : Collection<String>
        
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
            var_3_67 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))
            var_4_6C = invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937)
            var_5_73 = invokevirtual:\u4f52\ua068\u4f52\u47c2\u4492(\u88c5\ud171\ub113\u6435\ud51e::\uc246\u6b5f\uf94d\u8c8a\ub102\uc31c, var_4_6C:\u88c5\ud171\ub113\u6435\ud51e)
            var_8_8C = invokestatic:Collection<String>(\ucb79\uc3e3\u494c\uc2bd\ua068::\uff55\u624e\u4d85\u8d90\ub19c\ub7dc, var_5_73:\u4f52\ua068\u4f52\u47c2\u4492, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, var_4_6C:\u88c5\ud171\ub113\u6435\ud51e), invokevirtual:Collection<String>(\u4f52\ua068\u4f52\u47c2\u4492::\u4c04\ua3b4\u4daf\uc31c\ud217\u51b2, var_5_73:\u4f52\ua068\u4f52\u47c2\u4492))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ucb79\uc3e3\u494c\uc2bd\ua068::\u3dd3\u4cd9\u6d99\u7c6b\u873d\u494c), xor:int(ldc:int(8337), ldc:int(8336)))), and:int[expected:boolean](ldc:int(3265), ldc:int(517)))
            invokestatic:void(\ucb79\uc3e3\u494c\uc2bd\ua068::\uc238\u5d20\u983f\u61a4\ub70c\u8d90, var_8_8C:Collection<String>, var_3_67:\u8413\u5140\u64f2\uc9f6\u9937)
            return:int(and:int(ldc:int(653), ldc:int(-25262)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8350\u62da\u1187\u3711\u88c5\u6198$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, xor:int(ldc:int(520), ldc:int(522))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Void lambda$\ua068\u3711\u3711\ubf56\uc29a\uae87$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.Throwable p1) {
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
            invokeinterface:void(Logger::warn, getstatic:Logger(\ucb79\uc3e3\u494c\uc2bd\ua068::\ud523\u3776\u8d90\u183a\u647c\u1187), loadelement:String(getstatic:String[](\ucb79\uc3e3\u494c\uc2bd\ua068::\u3dd3\u4cd9\u6d99\u7c6b\u873d\u494c), and:int(ldc:int(25867), ldc:int(2114))), p1:Throwable)
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\ub19c\u92ff\u760c\u759a\u946b\ucef1, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ucb79\uc3e3\u494c\uc2bd\ua068::\u3dd3\u4cd9\u6d99\u7c6b\u873d\u494c), and:int(ldc:int(3555), ldc:int(4107)))))
            return:Void(aconstnull:Void())
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_274 : int
        expr_6E : int [generated]
        stack_A3_0 : byte[] [generated]
        stack_A5_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_137_0 : byte[] [generated]
        stack_139_0 : byte[] [generated]
        stack_17A_0 : byte[] [generated]
        stack_17C_0 : byte[] [generated]
        stack_1C2_0 : byte[] [generated]
        stack_28E_0 : byte[] [generated]
        stack_304_0 : byte[] [generated]
        stack_39B_0 : byte[] [generated]
        stack_3D6_0 : byte[] [generated]
        stack_42C_0 : byte[] [generated]
        var_4_25F : int
        var_3_264 : byte[]
        var_5_265 : int
        expr_28E : byte [generated]
        var_0_2FA : int
        expr_304 : byte [generated]
        stack_34D_2 : byte [generated]
        stack_32A_0 : byte [generated]
        expr_A5 : int [generated]
        expr_E6 : int [generated]
        var_2_137 : byte[]
        expr_13B : int [generated]
        var_3_3C4 : byte[]
        var_5_3C5 : int
        expr_17C : int [generated]
        var_3_41A : byte[]
        var_5_41B : int
        var_3_1CE : String
        stack_252_0 : String[] [generated]
        expr_1E0 : String[] [generated]
        
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
        var_0_274 = and:int(ldc:int(-691410746), ldc:int(-507283369))
        expr_6E = arraylength:int(stack_A3_0 = stack_A5_0 = stack_E4_0 = stack_E6_0 = stack_137_0 = stack_139_0 = stack_17A_0 = stack_17C_0 = stack_1C2_0 = stack_28E_0 = stack_304_0 = stack_39B_0 = stack_3D6_0 = stack_42C_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("7wkIBQdB2/NJwhP0Cx4C8E/c8QEJAQIFDQwOAAQPFj3c8wEJAQJFyQgJCBUH/gEODA4ABA8WPdzzAQkBAkXZA/EOABIOAPABCQECdfo=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_25F = expr_6E:int
        var_3_264 = newarray:byte[](byte.class, expr_6E:int)
        var_5_265 = expr_6E:int
        Label_0615:
        
        while (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0723)
            }
            
            var_0_274 = and:int(var_0_274:int, ldc:int(-1762136098))
            var_5_265 = add:int(var_5_265:int, ldc:int(-1))
            expr_28E = loadelement:byte(stack_28E_0:byte[], var_5_265:int)
            storeelement:byte(var_3_264:byte[], var_5_265:int, or:int(and:int(shl:int(expr_28E:byte, and:int(ldc:int(6404), ldc:int(18060))), ldc:int(-16)), and:int(shr:int(expr_28E:byte[expected:int], xor:int(ldc:int(13377), ldc:int(13381))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_265:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_E4_0 = stack_E6_0 = stack_137_0 = stack_139_0 = stack_17A_0 = stack_17C_0 = stack_1C2_0 = stack_28E_0 = stack_304_0 = stack_39B_0 = stack_3D6_0 = stack_42C_0 = var_3_264:byte[]
            goto(Label_0115)
        }
        
        var_0_274 = and:int(var_0_274:int, ldc:int(-362514241))
        goto(Label_0883)
        Label_0723:
        
        while (cmpeq:boolean(and:int(var_0_274:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(-1244066643))
                goto(Label_0615)
            }
            
            var_0_2FA = and:int(var_0_274:int, ldc:int(-1562280066))
            var_5_265 = add:int(var_5_265:int, ldc:int(-1))
            expr_304 = stack_34D_2 = loadelement(stack_304_0, var_5_265)
            
            if (cmplt:boolean(add:int(add:int(var_5_265:int, ldc:int(1)), neg:int(var_4_25F:int)), ldc:int(0))) {
                stack_34D_2 = stack_32A_0 = add:byte(expr_304:byte, loadelement:byte(var_3_264:byte[], add:int(var_5_265:int, ldc:int(1))))
                goto(Label_0826)
            }
            
            Label_0785:
            
            if (cmpeq:boolean(and:int(var_0_2FA:int, ldc:int(16384)), ldc:int(0))) {
                var_0_2FA = and:int(var_0_2FA:int, ldc:int(1882955939))
            }
            else {
                var_0_2FA = and:int(var_0_2FA:int, ldc:int(-2048922497))
                stack_34D_2 = stack_32A_0 = add:byte(expr_304:byte, ldc:byte(1))
            }
            
            Label_0826:
            
            if (cmpeq:boolean(and:int(var_0_2FA:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0785)
            }
            
            var_0_274 = and:int(var_0_2FA:int, ldc:int(-370415537))
            storeelement:byte(var_3_264:byte[], var_5_265:int, stack_34D_2:byte)
            
            if (cmpne:boolean(var_5_265:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_E4_0 = stack_E6_0 = stack_137_0 = stack_139_0 = stack_17A_0 = stack_17C_0 = stack_1C2_0 = stack_28E_0 = stack_304_0 = stack_39B_0 = stack_3D6_0 = stack_42C_0 = var_3_264:byte[]
            goto(Label_0170)
        }
        
        var_0_274 = and:int(var_0_274:int, ldc:int(758607072))
        Label_0883:
        
        while (cmpeq:boolean(and:int(var_0_274:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2048)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(574966749))
                goto(Label_0615)
            }
            
            var_0_274 = and:int(var_0_274:int, ldc:int(-1142064561))
            var_5_265 = add:int(var_5_265:int, ldc:int(-1))
            storeelement:byte(var_3_264:byte[], var_5_265:int, add:byte(loadelement:byte(stack_39B_0:byte[], var_5_265:int), ldc:byte(112)))
            
            if (cmpne:boolean(var_5_265:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A5_0 = stack_A3_0 = stack_E4_0 = stack_E6_0 = stack_137_0 = stack_139_0 = stack_17A_0 = stack_17C_0 = stack_1C2_0 = stack_28E_0 = stack_304_0 = stack_39B_0 = stack_3D6_0 = stack_42C_0 = var_3_264:byte[]
            goto(Label_0235)
        }
        
        goto(Label_0723)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0385)
        }
        
        if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(1805166139))
            goto(Label_0320)
        }
        
        if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(64)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-1158418986))
            expr_A5 = arraylength:int(stack_A5_0:byte[])
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_4_25F = expr_A5:int
                var_3_264 = newarray:byte[](byte.class, expr_A5:int)
                var_5_265 = expr_A5:int
                goto(Label_0723)
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(131072)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-1161207772))
            goto(Label_0385)
        }
        
        if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2048)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-912215234))
            goto(Label_0320)
        }
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_274 = and:int(var_0_274:int, ldc:int(-1427641489))
            expr_E6 = arraylength:int(stack_E6_0:byte[])
            
            if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                var_4_25F = expr_E6:int
                var_3_264 = newarray:byte[](byte.class, expr_E6:int)
                var_5_265 = expr_E6:int
                goto(Label_0883)
            }
        }
        
        Label_0235:
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(262144)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(1885159551))
            goto(Label_0385)
        }
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-1566096578))
        }
        else {
            if (cmpne:boolean(and:int(var_0_274:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(-882799392))
                goto(Label_0170)
            }
            
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(2048)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(-462779777))
                goto(Label_0115)
            }
            
            var_0_274 = and:int(var_0_274:int, ldc:int(-2031621026))
            var_2_137 = stack_137_0:byte[]
            expr_13B = add:int(arraylength:int(stack_139_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_13B:int, ldc:int(0))) {
                var_3_3C4 = newarray:byte[](byte.class, expr_13B:int)
                var_5_3C5 = expr_13B:int
                
                loop {
                    var_0_274 = and:int(var_0_274:int, ldc:int(-1026691338))
                    var_5_3C5 = add:int(var_5_3C5:int, ldc:int(-1))
                    storeelement:byte(var_3_3C4:byte[], var_5_3C5:int, add:int(shl:int(loadelement:byte(stack_3D6_0:byte[], var_5_3C5:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_137:byte[], add:int(var_5_3C5:int, xor:int(ldc:int(-32767), ldc:int(-32768)))), ldc:int(4)), xor:int(ldc:int(13056), ldc:int(13071)))))
                    
                    if (cmpne:boolean(var_5_3C5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_E4_0 = stack_E6_0 = stack_137_0 = stack_139_0 = stack_17A_0 = stack_17C_0 = stack_1C2_0 = stack_28E_0 = stack_304_0 = stack_39B_0 = stack_3D6_0 = stack_42C_0 = var_3_3C4:byte[]
            }
        }
        
        Label_0320:
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(65536)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(-654887504))
                goto(Label_0235)
            }
            
            if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_274 = and:int(var_0_274:int, ldc:int(288976999))
                goto(Label_0170)
            }
            
            if (cmpne:boolean(and:int(var_0_274:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_274 = and:int(var_0_274:int, ldc:int(-1328813074))
            expr_17C = arraylength:int(stack_17C_0:byte[])
            
            if (cmpne:boolean(expr_17C:int, ldc:int(0))) {
                var_3_41A = newarray:byte[](byte.class, expr_17C:int)
                var_5_41B = expr_17C:int
                
                loop {
                    var_0_274 = and:int(var_0_274:int, ldc:int(-825132290))
                    var_5_41B = add:int(var_5_41B:int, ldc:int(-1))
                    storeelement:byte(var_3_41A:byte[], var_5_41B:int, xor:byte(loadelement:byte(stack_42C_0:byte[], var_5_41B:int), ldc:byte(22)))
                    
                    if (cmpne:boolean(var_5_41B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A5_0 = stack_A3_0 = stack_E4_0 = stack_E6_0 = stack_137_0 = stack_139_0 = stack_17A_0 = stack_17C_0 = stack_1C2_0 = stack_28E_0 = stack_304_0 = stack_39B_0 = stack_3D6_0 = stack_42C_0 = var_3_41A:byte[]
            }
        }
        
        Label_0385:
        
        if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(65536)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-68109594))
            goto(Label_0320)
        }
        
        if (cmpeq:boolean(and:int(var_0_274:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-2024826399))
            goto(Label_0235)
        }
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_274 = and:int(var_0_274:int, ldc:int(-793932185))
            goto(Label_0170)
        }
        
        if (cmpne:boolean(and:int(var_0_274:int, ldc:int(16384)), ldc:int(0))) {
            var_3_1CE = initobject:String(String::<init>, stack_1C2_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_252_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24642), ldc:int(24646)))
            expr_1E0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24571), ldc:int(-24575)))
            storeelement:String(expr_1E0:String[], xor:int(ldc:int(-28512), ldc:int(-28510)), invokevirtual:String[expected:String](String::substring, var_3_1CE:String, and:int(ldc:int(8535), ldc:int(-9048)), xor:int(ldc:int(68), ldc:int(92))))
            storeelement:String(expr_1E0:String[], xor:int(ldc:int(8), ldc:int(11)), invokevirtual:String[expected:String](String::substring, var_3_1CE:String, xor:int(ldc:int(12441), ldc:int(12417)), and:int(ldc:int(13359), ldc:int(367))))
            storeelement:String(expr_1E0:String[], xor:int(ldc:int(8256), ldc:int(8257)), invokevirtual:String[expected:String](String::substring, var_3_1CE:String, xor:int(ldc:int(1585), ldc:int(1566)), and:int(ldc:int(24775), ldc:int(3454))))
            storeelement:String(expr_1E0:String[], and:int(ldc:int(-17143), ldc:int(16614)), invokevirtual:String[expected:String](String::substring, var_3_1CE:String, xor:int(ldc:int(8293), ldc:int(8227)), and:int(ldc:int(27213), ldc:int(5486))))
            putstatic:String[](\ucb79\uc3e3\u494c\uc2bd\ua068::\u3dd3\u4cd9\u6d99\u7c6b\u873d\u494c, expr_1E0:String[])
            putstatic:Logger(\ucb79\uc3e3\u494c\uc2bd\ua068::\ud523\u3776\u8d90\u183a\u647c\u1187, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7049\uc7fe\uae87\u120d\u6198\u8413(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(2074062168), ldc:int(-1088700549))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\uc3e3\u494c\uc2bd\ua068[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1323034309))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1082198055))
            var_5_8A = and:int(ldc:int(-25345), ldc:int(25344))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10411), ldc:int(-11436)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_67B:int, ldc:int(2147481049))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(3265), ldc:int(12315)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(16579), ldc:int(2305)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_DA:int, ldc:int(2131668863))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(16512), ldc:int(16513)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1052479960))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(479580943))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2071111546))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0393:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1466328775))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(201276623))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(113563994))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-79960200))
                        var_11_EB = and:int(ldc:int(15030), ldc:int(-15039))
                        goto(Label_1544)
                    }
                    
                    Label_0550:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2108789756))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1499947332))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1061013422))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1357791281))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-208756319))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(111699120))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2136651775))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1068332318))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1245476424))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-136459075))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1434389774))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1067904379))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1055792803))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-916768909))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-22478848))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-459322211))
                            goto(Label_0393)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1154750472))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(12864), ldc:int(12865))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1980062047))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(204660998))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1006842679))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(399492545))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1916270008))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1864681963))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1071037791))
                        var_11_EB = and:int(ldc:int(19514), ldc:int(-19515))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2145846030))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-29509244))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-17006922))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1903466255))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1564618302))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1526615640))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2134376411))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1288960007))
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(999640969))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1441228534))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1508263532))
                            goto(Label_0393)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(997392345))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1106212795))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-841840732))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-715942753))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(422195901))
                        goto(Label_0393)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(2147460476))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-303890370))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(946072261))
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-882833506))
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0393)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1656837))
                        var_17_686 = add:int(var_16_119:int, xor:int(ldc:int(-16375), ldc:int(-16376)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(1073457148))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, xor:int(ldc:int(-16319), ldc:int(-16320))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
