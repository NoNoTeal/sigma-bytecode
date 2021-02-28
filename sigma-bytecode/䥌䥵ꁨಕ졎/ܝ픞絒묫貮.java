public class \u494c\u4975\ua068\u0c95\uc84e.\u071d\ud51e\u7d52\ubb2b\u8cae {
    public void \u071d\ud51e\u7d52\ubb2b\u8cae() {
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
            invokespecial:Object(Object::<init>, this:\u071d\ud51e\u7d52\ubb2b\u8cae)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u1187\u120d\u647c\u836c\u624e\u40a9(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static T extends com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, T> \u8bb0\u983f\u5bc4\ud12e\u6d99\u8640(T extends com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, T> p0, \ub113\ufcaf\u3c25\u071d\u97b7.\u7e3f\ubefe\uc87f\ub102\u92ff p1) {
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
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e \ucb79\u385b\ua6bd\u51fa\ud4fe\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_4_68 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        
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
        var_4_68 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        
        if (instanceof:boolean(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e.class, var_4_68:\ub83f\uc9f6\u47c2\u67d0\u7ce1)) {
            return:\ua61f\uae87\u6b5f\uc31c\ud12e(checkcast:\ua61f\uae87\u6b5f\uc31c\ud12e(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e.class, var_4_68:\ub83f\uc9f6\u47c2\u67d0\u7ce1[expected:\ua61f\uae87\u6b5f\uc31c\ud12e]))
        }
        
        athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u62da\uc229\u983f\uf9c5\u836c::\u40a9\u5db4\u97b7\u8c8a\u392e\ud7e8)))
    }
    
    private static int \u7d52\u9255\ub102\u3504\u72f1\u2dcc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p3) {
        var_4_8C : int
        var_6_68 : \ua61f\uae87\u6b5f\uc31c\ud12e
        var_7_73 : ArrayList
        var_8_7B : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_9_D2 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_4_8C = and:int(ldc:int(109121347), ldc:int(-1355044011))
            var_6_68 = invokestatic:\ua61f\uae87\u6b5f\uc31c\ud12e(\u071d\ud51e\u7d52\ubb2b\u8cae::\ucb79\u385b\ua6bd\u51fa\ud4fe\u873d, p0:\u8413\u5140\u64f2\uc9f6\u9937, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            var_7_73 = invokestatic:ArrayList(Lists::newArrayListWithCapacity, invokeinterface:int(List<E>::size, p2:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            var_8_7B = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, p2:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            
            loop {
                if (cmpne:boolean(and:int(var_4_8C:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_8C = and:int(var_4_8C:int, ldc:int(-1361866903))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_7B:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)) {
                        var_9_D2 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_8_7B:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
                        
                        if (invokestatic:boolean(\u071d\ud51e\u7d52\ubb2b\u8cae::\u64ab\u873d\u6bb9\u7c6b\u6b0d\ua61f, var_6_68:\ua61f\uae87\u6b5f\uc31c\ud12e, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, var_9_D2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                            invokeinterface:void(\ua61f\uae87\u6b5f\uc31c\ud12e::\u6d69\uc229\ubefe\ua3b4\u6c52\u5654, var_6_68:\ua61f\uae87\u6b5f\uc31c\ud12e)
                            invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, var_7_73:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], var_9_D2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                        }
                        
                        var_4_8C = and:int(var_4_8C:int, ldc:int(1185505095))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_8C:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_8C = and:int(var_4_8C:int, ldc:int(244151355))
            }
            
            invokeinterface:void(\u62da\u4d85\ud36e\u62da\u4f52::\u4d85\ua068\u8640\u836c\ucb79\u9a18, p3:\u62da\u4d85\ud36e\u62da\u4f52, var_7_73:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
            return:int(invokeinterface:int(List<E>::size, var_7_73:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u64ab\u873d\u6bb9\u7c6b\u6b0d\ua61f(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
        var_2_E3 : int
        var_4_69 : int
        var_5_72 : int
        var_6_B8 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_8_122 : int
        
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
            var_2_E3 = and:int(ldc:int(1776888409), ldc:int(2131601523))
            var_4_69 = and:int(ldc:int(18156), ldc:int(-18157))
            var_5_72 = and:int(ldc:int(-6401), ldc:int(6400))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_E3:int, ldc:int(2)), ldc:int(0))) {
                    var_2_E3 = and:int(var_2_E3:int, ldc:int(1812544985))
                    
                    if (cmplt:boolean(var_5_72:int, invokeinterface:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u99f7\uf94d\u071d\u3711\u2dcc\ucfaf, p0:\ua61f\uae87\u6b5f\uc31c\ud12e))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                            var_6_B8 = invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ua61f\uae87\u6b5f\uc31c\ud12e::\u72f1\ubefe\u34df\u51b2\u4daf\u6bb9, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, var_5_72:int)
                            
                            if (invokeinterface:boolean(\ua61f\uae87\u6b5f\uc31c\ud12e::\uc84e\u67d0\ufcaf\u5db4\uf9c5\uc87f, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, var_5_72:int, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                                if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_6_B8:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                                    invokeinterface:void(\ua61f\uae87\u6b5f\uc31c\ud12e::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, p0:\ua61f\uae87\u6b5f\uc31c\ud12e, var_5_72:int, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                    var_4_69 = xor:int(ldc:int(1536), ldc:int(1537))
                                    goto(Label_0141)
                                }
                                
                                var_2_E3 = and:int(var_2_E3:int, ldc:int(1321953231))
                                
                                if (invokestatic:boolean(\u071d\ud51e\u7d52\ubb2b\u8cae::\ubded\u9a18\u71f1\u624e\u0b8e\u6198, var_6_B8:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                                    var_8_122 = invokestatic:int(Math::min, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), sub:int(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u5140\u6cfe\u5bc4\u4f52\u4cd9\uc87f, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_6_B8:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
                                    invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u56bd\u0c95\u3711\u9255\ud158\u6bb9, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_8_122:int)
                                    invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u88c5\u946b\u72f1\ub19c\u494c\u61a4, var_6_B8:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_8_122:int)
                                    var_4_69 = xor:int(ldc:int(20), ldc:int(21))
                                }
                            }
                            
                            var_2_E3 = and:int(var_2_E3:int, ldc:int(1838770955))
                            inc:int(var_5_72, ldc:int(1))
                            loopcontinue()
                        }
                    }
                }
                
                Label_0141:
                
                if (cmpne:boolean(and:int(var_2_E3:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(var_4_69:int)
        }
        
        goto(Label_0006)
    }
    
    private static int \u56bd\ud4fe\u51b2\u8aa5\u0a06\uc229(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2, int p3, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p5) {
        var_6_10A : int
        var_8_6A : \ua61f\uae87\u6b5f\uc31c\ud12e
        var_9_73 : int
        var_10_A7 : ArrayList
        var_11_B0 : int
        var_12_F6 : int
        stack_12A_0 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 [generated]
        var_6_128 : int
        var_13_12A : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
        var_6_10A = and:int(ldc:int(395027894), ldc:int(-1095058538))
        var_8_6A = invokestatic:\ua61f\uae87\u6b5f\uc31c\ud12e(\u071d\ud51e\u7d52\ubb2b\u8cae::\ucb79\u385b\ua6bd\u51fa\ud4fe\u873d, p0:\u8413\u5140\u64f2\uc9f6\u9937, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        var_9_73 = invokeinterface:int(\ua61f\uae87\u6b5f\uc31c\ud12e::\u99f7\uf94d\u071d\u3711\u2dcc\ucfaf, var_8_6A:\ua61f\uae87\u6b5f\uc31c\ud12e)
        
        if (logicaland:boolean(cmpge:boolean(p2:int, ldc:int(0)), cmplt:boolean(p2:int, var_9_73:int))) {
            var_10_A7 = invokestatic:ArrayList(Lists::newArrayListWithCapacity, invokeinterface:int(List<E>::size, p4:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            var_11_B0 = and:int(ldc:int(5897), ldc:int(-22366))
            
            loop {
                if (cmpne:boolean(and:int(var_6_10A:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_6_10A = and:int(var_6_10A:int, ldc:int(-1196170282))
                    
                    if (cmplt:boolean(var_11_B0:int, p3:int)) {
                        var_12_F6 = add:int(p2:int, var_11_B0:int)
                        
                        if (cmpge:boolean(var_11_B0:int, invokeinterface:int(List<E>::size, p4:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))) {
                            var_6_10A = and:int(var_6_10A:int, ldc:int(-86786665))
                            stack_12A_0 = getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2)
                        }
                        else {
                            stack_12A_0 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::get, p4:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_11_B0:int))
                        }
                        
                        var_6_128 = and:int(var_6_10A:int, ldc:int(1593808310))
                        var_13_12A = stack_12A_0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
                        
                        if (invokeinterface:boolean(\ua61f\uae87\u6b5f\uc31c\ud12e::\uc84e\u67d0\ufcaf\u5db4\uf9c5\uc87f, var_8_6A:\ua61f\uae87\u6b5f\uc31c\ud12e, var_12_F6:int, var_13_12A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                            invokeinterface:void(\ua61f\uae87\u6b5f\uc31c\ud12e::\u59ec\u759a\u64ab\uafe7\u6d69\u61a4, var_8_6A:\ua61f\uae87\u6b5f\uc31c\ud12e, var_12_F6:int, var_13_12A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                            invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, var_10_A7:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], var_13_12A:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                        }
                        
                        var_6_10A = and:int(var_6_128:int, ldc:int(1036952479))
                        inc:int(var_11_B0, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_6_10A:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokeinterface:void(\u62da\u4d85\ud36e\u62da\u4f52::\u4d85\ua068\u8640\u836c\ucb79\u9a18, p5:\u62da\u4d85\ud36e\u62da\u4f52, var_10_A7:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
            return:int(invokeinterface:int(List<E>::size, var_10_A7:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u62da\uc229\u983f\uf9c5\u836c::\ud7e8\ube23\ub171\ua61f\u4bc8\u36d3), invokestatic:Integer[expected:Object](Integer::valueOf, p2:int)))
    }
    
    private static boolean \ubded\u9a18\u71f1\u624e\u0b8e\u6198(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1) {
        var_2_61 : int
        stack_C7_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1027375985), ldc:int(-27050340))
            
            if (cmpeq:boolean(invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                if (cmpeq:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae87\u3e75\u8df4\u3a62\u6b0d\ua562, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\uae87\u3e75\u8df4\u3a62\u6b0d\ua562, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                    if (cmple:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u5140\u6cfe\u5bc4\u4f52\u4cd9\uc87f, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        if (invokestatic:boolean(Objects::equals, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u416d\ud12e\u071d\u69d9\u9af2\u0b8e, p0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u416d\ud12e\u071d\u69d9\u9af2\u0b8e, p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                            stack_C7_0 = xor:int[expected:boolean](ldc:int(17408), ldc:int(17409))
                            return:boolean(stack_C7_0:boolean)
                        }
                    }
                }
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-939843628))
            stack_C7_0 = and:int[expected:boolean](ldc:int(23582), ldc:int(-24352))
            return:boolean(stack_C7_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static int \ubf56\u6d69\u8709\ufe34\u873d\u3e75(java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p0, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
        var_3_FA : int
        var_5_6B : ArrayList
        var_6_73 : Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>
        var_7_C2 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_8_CA : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_3_D9 : int
        
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
            var_3_FA = and:int(ldc:int(-322262623), ldc:int(786888995))
            var_5_6B = invokestatic:ArrayList(Lists::newArrayListWithCapacity, invokeinterface:int(List<E>::size, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            var_6_73 = invokeinterface:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::iterator, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_FA:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_FA = and:int(var_3_FA:int, ldc:int(1506809841))
                }
                else {
                    var_3_FA = and:int(var_3_FA:int, ldc:int(-1359152365))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_73:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)) {
                        var_7_C2 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::next, var_6_73:Iterator<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
                        var_8_CA = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(Collection<\u51fa\u6c52\u7330\u7330\u960f>::iterator, p0:Collection<\u51fa\u6c52\u7330\u7330\u960f>)
                        
                        loop {
                            if (cmpne:boolean(and:int(var_3_FA:int, ldc:int(1048576)), ldc:int(0))) {
                                var_3_D9 = and:int(var_3_FA:int, ldc:int(-1520344870))
                            }
                            else {
                                var_3_D9 = and:int(var_3_FA:int, ldc:int(1036892995))
                                
                                if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_CA:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                                    if (invokevirtual:boolean(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u7bad\uc238\ud171\u71ae\u98a4\ud51e, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\u51fa\u6c52\u7330\u7330\u960f::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_8_CA:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, var_7_C2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                                        invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, var_5_6B:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>], var_7_C2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                                    }
                                    
                                    var_3_FA = and:int(var_3_D9:int, ldc:int(1053485993))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_D9:int, ldc:int(262144)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_FA = and:int(var_3_D9:int, ldc:int(1832628197))
                        }
                        
                        var_3_FA = and:int(var_3_D9:int, ldc:int(-285672553))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_FA:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokeinterface:void(\u62da\u4d85\ud36e\u62da\u4f52::\u4d85\ua068\u8640\u836c\ucb79\u9a18, p2:\u62da\u4d85\ud36e\u62da\u4f52, var_5_6B:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
            return:int(invokeinterface:int(List<E>::size, var_5_6B:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
        }
        
        goto(Label_0006)
    }
    
    private static void \u67e9\u8709\u647c\ubf56\u6fb0\u4c04(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1, int p2, int p3, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p4) {
        var_5_FC : int
        var_7_6C : int
        stack_11B_0 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 [generated]
        var_5_119 : int
        var_8_11B : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        
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
            var_5_FC = and:int(ldc:int(835272703), ldc:int(281771771))
            var_7_6C = and:int(ldc:int(-9947), ldc:int(1754))
            
            loop {
                if (cmpeq:boolean(and:int(var_5_FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_FC = and:int(var_5_FC:int, ldc:int(369167306))
                    goto(Label_0206)
                }
                
                if (cmpeq:boolean(and:int(var_5_FC:int, ldc:int(134217728)), ldc:int(0))) {
                    var_5_FC = and:int(var_5_FC:int, ldc:int(832780543))
                    
                    if (cmplt:boolean(var_7_6C:int, p3:int)) {
                        if (cmpge:boolean(var_7_6C:int, invokeinterface:int(List<E>::size, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))) {
                            goto(Label_0206)
                        }
                        
                        stack_11B_0 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::get, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_7_6C:int))
                        goto(Label_0275)
                    }
                }
                
                Label_0153:
                
                if (cmpne:boolean(and:int(var_5_FC:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_5_FC:int, ldc:int(32)), ldc:int(0))) {
                        var_5_FC = and:int(var_5_FC:int, ldc:int(-1270474948))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0206:
                
                if (cmpeq:boolean(and:int(var_5_FC:int, ldc:int(8192)), ldc:int(0))) {
                    var_5_FC = and:int(var_5_FC:int, ldc:int(-954017591))
                    goto(Label_0153)
                }
                
                if (cmpeq:boolean(and:int(var_5_FC:int, ldc:int(8192)), ldc:int(0))) {
                    var_5_FC = and:int(var_5_FC:int, ldc:int(1584043833))
                    loopcontinue()
                }
                
                var_5_FC = and:int(var_5_FC:int, ldc:int(2009512447))
                stack_11B_0 = getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2)
                Label_0275:
                var_5_119 = and:int(var_5_FC:int, ldc:int(-593068933))
                var_8_11B = stack_11B_0:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
                
                if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua3b4\ub83f\u6c52\u624e\u6d99\u7d52, p0:\u7d52\u718f\u3776\u6fb0\ub83f, add:int(p2:int, var_7_6C:int), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, var_8_11B:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                    invokeinterface:boolean(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::add, p4:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, var_8_11B:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                }
                
                var_5_FC = and:int(var_5_119:int, ldc:int(381779055))
                inc:int(var_7_6C, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int \uc2bd\u3c25\uf995\ub70c\ud36e\u5654(java.util.Collection<? extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p0, int p1, int p2, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p4) {
        var_5_DE : int
        var_7_6E : ArrayList
        var_8_76 : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        var_9_CE : \u7d52\u718f\u3776\u6fb0\ub83f
        var_10_F6 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_5_DE = and:int(ldc:int(-590262041), ldc:int(2045768367))
            var_7_6E = invokestatic:ArrayList(Lists::newArrayListWithCapacity, invokeinterface:int(List<E>::size, p3:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
            var_8_76 = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p0:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)
            
            loop {
                if (cmpeq:boolean(and:int(var_5_DE:int, ldc:int(1024)), ldc:int(0))) {
                    var_5_DE = and:int(var_5_DE:int, ldc:int(2128212967))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_8_76:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>)) {
                        var_9_CE = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:? extends \u7d52\u718f\u3776\u6fb0\ub83f[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::next, var_8_76:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>))
                        
                        if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_9_CE:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                            var_5_DE = and:int(var_5_DE:int, ldc:int(2094366415))
                            invokestatic:void(\u071d\ud51e\u7d52\ubb2b\u8cae::\u67e9\u8709\u647c\ubf56\u6fb0\u4c04, var_9_CE:\u7d52\u718f\u3776\u6fb0\ub83f, p3:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p1:int, p2:int, var_7_6E:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
                        }
                        else {
                            var_10_F6 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_9_CE:\u51fa\u6c52\u7330\u7330\u960f)
                            invokevirtual:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\u839e\u8709\u8709\u71f1\u9a18\ud12e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72(\u51fa\u6c52\u7330\u7330\u960f::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_10_F6:\u51fa\u6c52\u7330\u7330\u960f))
                            invokestatic:void(\u071d\ud51e\u7d52\ubb2b\u8cae::\u67e9\u8709\u647c\ubf56\u6fb0\u4c04, var_9_CE:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p3:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p1:int, p2:int, var_7_6E:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
                            invokevirtual:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\u839e\u8709\u8709\u71f1\u9a18\ud12e, getfield:\ubb2b\u6b0d\u6c56\uc29a\u4e72(\u51fa\u6c52\u7330\u7330\u960f::\ud36e\u600f\ua61f\u76bc\u965f\u64ab, var_10_F6:\u51fa\u6c52\u7330\u7330\u960f))
                        }
                        
                        var_5_DE = and:int(var_5_DE:int, ldc:int(1505580423))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_5_DE:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_DE = and:int(var_5_DE:int, ldc:int(-1476273554))
            }
            
            invokeinterface:void(\u62da\u4d85\ud36e\u62da\u4f52::\u4d85\ua068\u8640\u836c\ucb79\u9a18, p4:\u62da\u4d85\ud36e\u62da\u4f52, var_7_6E:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>[expected:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>])
            return:int(invokeinterface:int(List<E>::size, var_7_6E:ArrayList<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>))
        }
        
        goto(Label_0006)
    }
    
    private static int \u4d85\u92ff\u3776\u3776\u6c52\uc9f6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p1, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p3) {
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
    
    private static void \ud523\u12cb\u6c56\u873d\u873d\u8640(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1) {
        var_2_61 : int
        stack_A4_1 : String [generated]
        expr_8F : Object[] [generated]
        var_4_C8 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_103_1 : String [generated]
        expr_E1 : Object[] [generated]
        
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
            var_2_61 = and:int(ldc:int(2005359234), ldc:int(-137145398))
            
            if (cmpne:boolean(invokeinterface:int(List::size, p1:List), xor:int(ldc:int(4364), ldc:int(4365)))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2145087331))
                stack_A4_1 = loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(269), ldc:int(16973)))
                expr_8F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(18445), ldc:int(145)))
                storeelement:Object(expr_8F:Object[], and:int(ldc:int(264), ldc:int(-265)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(List<E>::size, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_A4_1:String, expr_8F:Object[]), and:int[expected:boolean](ldc:int(-2454), ldc:int(2453)))
            }
            else {
                var_4_C8 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::get, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, and:int(ldc:int(17868), ldc:int(-17869))))
                stack_103_1 = loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(-30683), ldc:int(-30679)))
                expr_E1 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(288), ldc:int(290)))
                storeelement:Object(expr_E1:Object[], and:int(ldc:int(7303), ldc:int(-23688)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_4_C8:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
                storeelement:Object(expr_E1:Object[], xor:int(ldc:int(8513), ldc:int(8512)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, var_4_C8:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_103_1:String, expr_E1:Object[]), and:int[expected:boolean](ldc:int(-6272), ldc:int(6252)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u759a\u6cfe\u8df4\u647c\u1833\uc246(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p2) {
        var_3_61 : int
        stack_AE_1 : String [generated]
        expr_8F : Object[] [generated]
        var_5_D2 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_117_1 : String [generated]
        expr_EB : Object[] [generated]
        
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
            var_3_61 = and:int(ldc:int(-996849947), ldc:int(-56759057))
            
            if (cmpne:boolean(invokeinterface:int(List::size, p1:List), xor:int(ldc:int(-28672), ldc:int(-28671)))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-441223697))
                stack_AE_1 = loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(175), ldc:int(287)))
                expr_8F = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(16712), ldc:int(16714)))
                storeelement:Object(expr_8F:Object[], and:int(ldc:int(-11692), ldc:int(11656)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(List<E>::size, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)))
                storeelement:Object(expr_8F:Object[], xor:int(ldc:int(11266), ldc:int(11267)), p2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_AE_1:String, expr_8F:Object[]), and:int[expected:boolean](ldc:int(-12358), ldc:int(12357)))
            }
            else {
                var_5_D2 = checkcast:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56.class, invokeinterface:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>::get, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, and:int(ldc:int(-18951), ldc:int(18950))))
                stack_117_1 = loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(1054), ldc:int(654)))
                expr_EB = newarray:Object[](java.lang.Object.class, and:int(ldc:int(83), ldc:int(135)))
                storeelement:Object(expr_EB:Object[], and:int(ldc:int(12427), ldc:int(-12444)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_5_D2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)))
                storeelement:Object(expr_EB:Object[], xor:int(ldc:int(3201), ldc:int(3200)), invokevirtual:ITextComponent[expected:Object](\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u3e2a\ua61f\u5f50\u120d\ud36e\ub113, var_5_D2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
                storeelement:Object(expr_EB:Object[], and:int(ldc:int(10), ldc:int(2)), p2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_117_1:String, expr_EB:Object[]), and:int[expected:boolean](ldc:int(-17616), ldc:int(1231)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u69d9\u34df\u8350\u6ec6\ub6ab\u760c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u392e\uc3e3\uc910\u4c2b\u6c52 p1) {
        var_4_66 : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
        var_4_66 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8413\u5140\u64f2\uc9f6\u9937::\u97e6\u4d85\ud36e\u8350\u92ee\u6b5f, p0:\u8413\u5140\u64f2\uc9f6\u9937)
        
        if (logicalnot:boolean(instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_4_66:\u7d52\u718f\u3776\u6fb0\ub83f))) {
            athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u071d\ud51e\u7d52\ubb2b\u8cae::\u8c8a\uc31c\u836c\uae5d\u527a\u9af2), invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, var_4_66:\u7d52\u718f\u3776\u6fb0\ub83f)))
        }
        
        return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u7006\ubefe\u98a4\u9255\u8389\ud12e, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_4_66:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p1:\u392e\uc3e3\uc910\u4c2b\u6c52))
    }
    
    private static int \u12cb\u760c\ud12e\u8df4\u59ec\u76bc(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p3) {
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
    
    private static int \ub102\uf94d\u34df\u624e\uc31c\uae87(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p2) {
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
    
    private static int \u8c8a\u9255\u3dd3\u7af6\ubefe\ub70c(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p2) {
        var_5_69 : \u8413\u5140\u64f2\uc9f6\u9937
        
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
            var_5_69 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u9af2\u416d\ufe34\uc910\ud217\u4f4a, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, invokevirtual:\uf9c5\u7043\u0c95\u76bc\u8389(\u6c52\ucfaf\uc910\u527a\uc9f6::\u2dcc\u494c\uf995\u6bb9\ud217\ub32d, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u3e2a\u7ce1\u6b0d\u7049\u3e75\u98a4, initobject:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::<init>, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, var_5_69:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u7d52\u718f\u3776\u6fb0\ub83f>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u8413\u64f2\u600f\u965f\u62da\ud171), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8413\u5140\u64f2\uc9f6\u9937::\ud171\uf94d\ub6ab\u6b0d\uae5d\u6d99, var_5_69:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u759a\u3a62\uc229\uc84e\u61a4\u718f), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u8413\u5140\u64f2\uc9f6\u9937::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, var_5_69:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\u600f\u7af6\u5f50\u416d\ud171\u6b5f)), p2:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int \ud217\u40a9\u5245\u494c\u62da\ua068(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p3, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p4) {
        var_7_6C : \u8413\u5140\u64f2\uc9f6\u9937
        
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
            var_7_6C = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u9af2\u416d\ufe34\uc910\ud217\u4f4a, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, invokevirtual:\uf9c5\u7043\u0c95\u76bc\u8389(\u6c52\ucfaf\uc910\u527a\uc9f6::\u2dcc\u494c\uf995\u6bb9\ud217\ub32d, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u3e2a\u7ce1\u6b0d\u7049\u3e75\u98a4, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, initobject:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::<init>, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, var_7_6C:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u759a\u3a62\uc229\uc84e\u61a4\u718f), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u4c2b\u6198\u5245\u3bd6\u4bc8\uc29a, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u8df4\u7330\uc87f\u5fe1\u6bb9\u40a9), p3:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u7d52\u718f\u3776\u6fb0\ub83f>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u8413\u64f2\u600f\u965f\u62da\ud171), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8413\u5140\u64f2\uc9f6\u9937::\ud171\uf94d\ub6ab\u6b0d\uae5d\u6d99, var_7_6C:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\uc7fe\u3e75\u6b5f\u836c\u16f6\u69d9)), p4:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int \u9af2\u416d\ufe34\uc910\ud217\u4f4a(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uf9c5\u7043\u0c95\u76bc\u8389 p2, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p3) {
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
    
    private static void lambda$\u4c04\ucfaf\uf94d\u6435\uc2bd\ubff1$25(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.List p1) {
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
            invokestatic:void(\u071d\ud51e\u7d52\ubb2b\u8cae::\ud523\u12cb\u6c56\u873d\u873d\u8640, p0:\u8413\u5140\u64f2\uc9f6\u9937, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7bad\ud4fe\u839e\u4f4a\ubb2b\u8640$24(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, java.util.List p2) {
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
            invokestatic:void(\u071d\ud51e\u7d52\ubb2b\u8cae::\u759a\u6cfe\u8df4\u647c\u1833\uc246, p0:\u8413\u5140\u64f2\uc9f6\u9937, p2:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc9f6\u120d\u8bb0\u9255\u4cd9\u120d$23(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, java.util.List p2) {
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
            invokestatic:void(\u071d\ud51e\u7d52\ubb2b\u8cae::\u759a\u6cfe\u8df4\u647c\u1833\uc246, p0:\u8413\u5140\u64f2\uc9f6\u9937, p2:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ua3b4\u7873\ub7dc\u5f50\ub8be\u9255, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc910\uc910\u52d3\u527a\u40a9\uc3e3$22(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p2) {
        var_5_7A : \u120d\u8bb0\u836c\u64f2\u3504
        
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
            var_5_7A = initobject:\u120d\u8bb0\u836c\u64f2\u3504(\u120d\u8bb0\u836c\u64f2\u3504::<init>, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ubf56\u4c04\u4492\u36d3\u71f1\u12cb, p1:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, p1:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ub7dc\ubff1\ub19c\u6198\uc2e8\ufe34, p1:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, p2:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))
            invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\u8bb0\u5245\u5fe1\u759a\u3e2a\u392e, var_5_7A:\u120d\u8bb0\u836c\u64f2\u3504)
            invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, p0:\ube23\uc238\u5140\u4cd9\u8aa5, var_5_7A:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ub171\u7006\u759a\u7873\u6b5f\uc246$21(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u4d85\u92ff\u3776\u3776\u6c52\uc9f6, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(10288), ldc:int(10295)))), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3c25\u8258\u9033\uc84e\u6bb9\u3711$20(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\ubf56\u6d69\u8709\ufe34\u873d\u3e75, invokestatic:Collection<\u51fa\u6c52\u7330\u7330\u960f>(\u600f\u9937\ub8be\ud171\u624e::\u4f4a\u6b0d\u946b\u4e72\u56bd\u56bd, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(25610), ldc:int(26)))), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u8413\u64ab\u7ce1\u9a18\uc229\uff55$19(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u7d52\u9255\ub102\u3504\u72f1\u2dcc, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(28831), ldc:int(1319)))), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uf94d\u647c\u92ee\u97b7\u6c52\u51fa$18(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u56bd\ud4fe\u51b2\u8aa5\u0a06\uc229, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(143), ldc:int(31255)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(3142), ldc:int(3138)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(16644), ldc:int(16641)))), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ua068\uf995\u4492\u6cfe\ua562\u6435$17(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u56bd\ud4fe\u51b2\u8aa5\u0a06\uc229, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(4199), ldc:int(135)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(16676), ldc:int(11334)))), invokeinterface:int(List<E>::size, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7873\ubb2b\ubcb0\u8389\uc29a\u8d90$16(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\uc2bd\u3c25\uf995\ub70c\ud36e\u5654, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(16418), ldc:int(16417)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(-32221), ldc:int(-32217)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(293), ldc:int(8269)))), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uafe7\u156b\ub6ab\u16f6\ufe34\ud523$15(com.mojang.brigadier.context.CommandContext p0, java.util.List p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u62da\u4d85\ud36e\u62da\u4f52 p2) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\uc2bd\u3c25\uf995\ub70c\ud36e\u5654, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u92ff\uc2e8\u5d20\uc3e3\ub6ab\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(8707), ldc:int(19459)))), invokestatic:int(\u67e9\u3504\u3bd6\u7006\ub18d::\u7d52\ub83f\u40a9\u3c25\u6bb9\u71f1, p0:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(10245), ldc:int(500)))), invokeinterface:int(List<E>::size, p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>), p1:List<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>, p2:\u62da\u4d85\ud36e\u62da\u4f52))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u6d99\uc29a\u34df\u156b\u97e6\u40a9$14(com.mojang.brigadier.builder.ArgumentBuilder p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p1) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(ArgumentBuilder::then, invokevirtual:ArgumentBuilder(ArgumentBuilder::then, invokevirtual:ArgumentBuilder(ArgumentBuilder::then, invokevirtual:ArgumentBuilder(ArgumentBuilder::then, p0:ArgumentBuilder, invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(-32509), ldc:int(-32493)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::then, invokevirtual:RequiredArgumentBuilder(RequiredArgumentBuilder::suggests, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(8), ldc:int(25))), invokestatic:\u59ec\u92ee\u7c6b\u34df\u8d98[expected:ArgumentType](\u59ec\u92ee\u7c6b\u34df\u8d98::\ufcaf\u97e6\uc7fe\u8389\u527a\ud51e)), getstatic:SuggestionProvider<\u8413\u5140\u64f2\uc9f6\u9937>(\u071d\ud51e\u7d52\ubb2b\u8cae::\u759a\u8c8a\ub18d\ub83f\u92ee\ub19c)), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(2454), ldc:int(2436))), invokestatic:\u8413\uc2e8\u3e2a\u7043\uc9f6[expected:ArgumentType](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u3dd3\uc7fe\u8350\uc4d2\u600f\uc2e8)), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(-28273), ldc:int(-28260))), invokestatic:\uf94d\u983f\u40a9\u6fb0\u12b2[expected:ArgumentType](\uf94d\u983f\u40a9\u6fb0\u12b2::\u5bc4\uc229\uae87\u34df\ud7e8\uf94d)), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::executes, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(4117), ldc:int(20)))), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::executes, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(24587), ldc:int(24606)))), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(5684), ldc:int(-5941)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokevirtual:RequiredArgumentBuilder(RequiredArgumentBuilder::suggests, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(24593), ldc:int(145))), invokestatic:\u59ec\u92ee\u7c6b\u34df\u8d98[expected:ArgumentType](\u59ec\u92ee\u7c6b\u34df\u8d98::\ufcaf\u97e6\uc7fe\u8389\u527a\ud51e)), getstatic:SuggestionProvider<\u8413\u5140\u64f2\uc9f6\u9937>(\u071d\ud51e\u7d52\ubb2b\u8cae::\u759a\u8c8a\ub18d\ub83f\u92ee\ub19c)), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(4118), ldc:int(10262)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(17471), ldc:int(12439))), invokestatic:\u600f\u9937\ub8be\ud171\u624e[expected:ArgumentType](\u600f\u9937\ub8be\ud171\u624e::\u8c8a\u3bc9\ud171\ubefe\u64f2\u47c2)), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(16444), ldc:int(8986)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(8210), ldc:int(5074))), invokestatic:\u8413\uc2e8\u3e2a\u7043\uc9f6[expected:ArgumentType](\u8413\uc2e8\u3e2a\u7043\uc9f6::\u3dd3\uc7fe\u8350\uc4d2\u600f\uc2e8)), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::executes, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(2399), ldc:int(531))), invokestatic:\uf94d\u983f\u40a9\u6fb0\u12b2[expected:ArgumentType](\uf94d\u983f\u40a9\u6fb0\u12b2::\u5bc4\uc229\uae87\u34df\ud7e8\uf94d)), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::executes, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(2078), ldc:int(2058)))), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975)))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::executes, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(25143), ldc:int(21)))), invokedynamic:Command(run:(L\u6ec6\ubb2b\uf94d\u6d99\u4f52/\u4daf\u3504\u4975\u59ec\u183a/\ua6bd\u0b8e\u5f50\ud217\u4975;)Lcom/mojang/brigadier/Command;, p1:\ua6bd\u0b8e\u5f50\ud217\u4975))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud171\u97e6\ub83f\ud36e\ub1b9\uff55$13(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc, p1:CommandContext, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(2738), ldc:int(82)))), invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u071d\ud51e\u7d52\ubb2b\u8cae::\u69d9\u34df\u8350\u6ec6\ub6ab\u760c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\u416d\u624e\u9033\u3bd6\u6435\u64f2)), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc4d2\u7e3f\u9033\u2dcc\u34df\u5f50$12(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc, p1:CommandContext, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(9036), ldc:int(9054)))), invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u071d\ud51e\u7d52\ubb2b\u8cae::\u69d9\u34df\u8350\u6ec6\ub6ab\u760c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf)), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ubcb0\uc2bd\uc84e\u5f50\ubff1\uc2e8$11(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc, p1:CommandContext, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(12562), ldc:int(18578)))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(557), ldc:int(574)))), xor:int(ldc:int(2064), ldc:int(2065)), and:int[expected:boolean](ldc:int(-22777), ldc:int(4344))), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uae87\ucef1\u494c\u527a\u47c2\ua61f$10(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u12cb\u760c\ud12e\u8df4\u59ec\u76bc, p1:CommandContext, invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(12378), ldc:int(438)))), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u88c5\u8308\u40a9\u4ab3\u4c2b\u8258$9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\ub102\uf94d\u34df\u624e\uc31c\uae87, p1:CommandContext, invokestatic:\u7d52\u718f\u3776\u6fb0\ub83f(\u600f\u9937\ub8be\ud171\u624e::\u446c\u4f52\ub8be\u6d99\u5654\u8cae, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(579), ldc:int(596)))), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u4cd9\u74b1\u3d4b\u6fb0\u7e3f\u156b$8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\u8c8a\u9255\u3dd3\u7af6\ubefe\ub70c, p1:CommandContext, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\u92ee\u7c6b\u34df\u8d98::\u36d3\ub70c\u5245\u8df4\uc246\u9af2, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(2178), ldc:int(2195)))), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u839e\u71ae\u4bc8\uc2bd\u8350\u51b2$7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\ud217\u40a9\u5245\u494c\u62da\ua068, p1:CommandContext, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\u92ee\u7c6b\u34df\u8d98::\u36d3\ub70c\u5245\u8df4\uc246\u9af2, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(13393), ldc:int(16697)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(18835), ldc:int(1074)))), invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u071d\ud51e\u7d52\ubb2b\u8cae::\u69d9\u34df\u8350\u6ec6\ub6ab\u760c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\u416d\u624e\u9033\u3bd6\u6435\u64f2)), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud171\u56bd\u12b2\u97e6\u5654\u4f52$6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\ud217\u40a9\u5245\u494c\u62da\ua068, p1:CommandContext, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\u92ee\u7c6b\u34df\u8d98::\u36d3\ub70c\u5245\u8df4\uc246\u9af2, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(11), ldc:int(26)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(2145), ldc:int(2163)))), invokestatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u071d\ud51e\u7d52\ubb2b\u8cae::\u69d9\u34df\u8350\u6ec6\ub6ab\u760c, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), getstatic:\u392e\uc3e3\uc910\u4c2b\u6c52(\u392e\uc3e3\uc910\u4c2b\u6c52::\ub18d\ucef1\ub6ab\u7c6b\u647c\ucfaf)), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u1187\u7c6b\u12b2\u4bc8\u97b7\u8bb0$5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\ud217\u40a9\u5245\u494c\u62da\ua068, p1:CommandContext, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\u92ee\u7c6b\u34df\u8d98::\u36d3\ub70c\u5245\u8df4\uc246\u9af2, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(68), ldc:int(85)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(2186), ldc:int(2200)))), invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ee\u5bc4\uc910\u7043\ud523::\u9033\ub19c\u7e3f\ud171\ua61f\ub8be, invokestatic:\u92ee\u5bc4\uc910\u7043\ud523(\uf94d\u983f\u40a9\u6fb0\u12b2::\ufe34\u8d90\u9255\ub18d\u47c2\u3711, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(531), ldc:int(12339)))), xor:int(ldc:int(16416), ldc:int(16417)), and:int[expected:boolean](ldc:int(2856), ldc:int(-2857))), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3711\u5654\ua068\uc29a\u7d52\ua61f$4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ua6bd\u0b8e\u5f50\ud217\u4975 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u071d\ud51e\u7d52\ubb2b\u8cae::\ud217\u40a9\u5245\u494c\u62da\ua068, p1:CommandContext, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u59ec\u92ee\u7c6b\u34df\u8d98::\u36d3\ub70c\u5245\u8df4\uc246\u9af2, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(7729), ldc:int(145)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p1:CommandContext, loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), and:int(ldc:int(1567), ldc:int(24722)))), getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2), p0:\ua6bd\u0b8e\u5f50\ud217\u4975))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8640\ud36e\u7873\ua3b4\ud36e\u72f1$3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(20958), ldc:int(1570))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u5f50\u3711\u64f2\u16f6\u416d\u4f52$2(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(5194), ldc:int(5203)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(2177), ldc:int(14167)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(6536), ldc:int(-6537)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u4ab3\u071d\u960f\uc7fe\u34df\u4179$1(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u071d\ud51e\u7d52\ubb2b\u8cae::\u836c\u16f6\ubf56\u47c2\u7330\u1187), xor:int(ldc:int(-30718), ldc:int(-30696)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8194), ldc:int(8195)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(16739), ldc:int(-16740)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ucfaf\ua61f\u98a4\u5db4\u647c\u8258$0(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u7ce1\u5d20\u1187\u5f50\ua068::\u6435\u69d9\u6ec6\ua562\ud51e\uc2e8, invokevirtual:\u7ce1\u5d20\u1187\u5f50\ua068(\u88c5\ud171\ub113\u6435\ud51e::\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \uae5d\u67d0\ud171\u4492\u8aa5\ub32d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(-1150068674), ldc:int(997056168))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\ud51e\u7d52\ubb2b\u8cae[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2109308799))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1607597756))
            var_5_8A = and:int(ldc:int(6841), ldc:int(-23482))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(19990), ldc:int(-19991)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C3:int, ldc:int(1004239084))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(8961), ldc:int(73)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(2249), ldc:int(1031)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_DA:int, ldc:int(1601928491))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(8209), ldc:int(7881)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-80324061))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(361875211))
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-424887642))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1323806369))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-664451))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2084667681))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1041817174))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1962621305))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1294570909))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-485462369))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2136596392))
                        var_11_EB = and:int(ldc:int(16786), ldc:int(-16851))
                        goto(Label_1580)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-930995280))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2008875129))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1836032511))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1168366728))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(526909245))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(944372699))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-817654029))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1142981892))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-845985468))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(542657224))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(761980291))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-328420885))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1414864929))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-499868089))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-581969778))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1531705787))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(133), ldc:int(13347))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2077198483))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-270242267))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2084509898))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-881540248))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1678469474))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1178472184))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(469327801))
                        var_11_EB = and:int(ldc:int(24861), ldc:int(-27102))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(51065402))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1377698645))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1726348307))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1713367352))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1550463757))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2070773161))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1289:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-743325336))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(78701982))
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-634078679))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(276320357))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1144005079))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1580)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(988331233))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(252889994))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(232090295))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(842673472))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1022192903))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(277509685))
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1610185966))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(212844924))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(792892407))
                        goto(Label_1289)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1678149166))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(841657883))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(331103265))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(621227948))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-77332807))
                        var_17_6CE = add:int(var_16_119:int, and:int(ldc:int(17539), ldc:int(14873)))
                        looporswitchbreak()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(432941379))
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-547137493))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, and:int(ldc:int(2049), ldc:int(261))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
